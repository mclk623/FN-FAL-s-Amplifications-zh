package ne.fnfal113.fnamplifications.quivers.implementations;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import lombok.Getter;
import ne.fnfal113.fnamplifications.quivers.abstracts.AbstractQuiver;
import ne.fnfal113.fnamplifications.utils.Utils;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;
import org.bukkit.entity.SpectralArrow;
import org.bukkit.event.entity.EntityShootBowEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

import javax.annotation.Nullable;
import java.util.concurrent.ThreadLocalRandom;

// To do: Method Documentation
public class QuiverTask {

    @Getter
    private final AbstractQuiver quiver;

    public QuiverTask(AbstractQuiver quiver) {
        this.quiver = quiver;
    }

    @Nullable
    public SlimefunItem getSfItem(ItemStack itemStack) {
        return SlimefunItem.getByItem(itemStack);
    }

    public int getArrows(PersistentDataContainer quiverPdc, NamespacedKey key) {
        return quiverPdc.getOrDefault(key, PersistentDataType.INTEGER, 0);
    }

    public boolean isQuiver(@Nullable SlimefunItem sfItem) {
        return sfItem instanceof AbstractQuiver;
    }

    /**
     *
     * @param quiverItemStack the quiver itemstack
     * @param meta the meta of the quiver
     */
    public void changeState(ItemStack quiverItemStack, ItemMeta meta) {     
        PersistentDataContainer quiverPdc = meta.getPersistentDataContainer();

        int arrowCount = getArrows(quiverPdc, getQuiver().getStoredArrowsKey());

        if(arrowCount <= 0) {
            return;
        }

        if(quiverItemStack.getType() == Material.LEATHER) {
            meta.getPersistentDataContainer().set(getQuiver().getStateKey(), PersistentDataType.STRING, "opened");
            
            quiverItemStack.setType(getQuiver().getArrowType().getType());
            
            Utils.setLoreByPdc(quiverItemStack, meta, "打开", "状态: ", "&e", "&f", "");
        } else {
            meta.getPersistentDataContainer().set(getQuiver().getStateKey(), PersistentDataType.STRING, "closed");
            
            quiverItemStack.setType(Material.LEATHER);
            
            Utils.setLoreByPdc(quiverItemStack, meta, "关闭", "状态: ", "&e", "&f", "");
        }
    }

    /**
     *
     * @param quiverItemStack the quiver itemstack
     * @param meta the meta of the quiver
     * @param player the player who owns the quiver
     */
    public void withdrawArrows(ItemStack quiverItemStack, ItemMeta meta, Player player) {
        PersistentDataContainer quiverPdc = meta.getPersistentDataContainer();

        int currentStoredArrowCount = getArrows(quiverPdc, getQuiver().getStoredArrowsKey()); 
        
        if(currentStoredArrowCount <= 0) {
            return;
        }

        int newStoredArrowAcount = currentStoredArrowCount - 1;
        
        meta.getPersistentDataContainer().set(getQuiver().getStoredArrowsKey(), PersistentDataType.INTEGER, newStoredArrowAcount);
        
        if(newStoredArrowAcount == 0) { 
            quiverItemStack.setType(Material.LEATHER);

            meta.getPersistentDataContainer().set(getQuiver().getStateKey(), PersistentDataType.STRING, "关闭");
            
            player.sendMessage(ChatColor.GOLD + getQuiver().getItemName() + " 已清空！不再存储箭矢。");
            
            Utils.setLoreByPdc(quiverItemStack, meta, "关闭 (无箭矢)", "状态: ", "&e", "&f", "");
        }

        Utils.setLoreByPdc(itemState, meta, String.valueOf(amount), "箭矢剩余: " ,"&e", "&f", " left");
        player.getInventory().addItem(getArrowType().clone());
    }

    public void depositArrows(ItemStack quiverItemStack, ItemMeta meta, Player player) {
        ItemStack arrowItemStack = player.getInventory().getItemInMainHand();
        
        PersistentDataContainer quiverPdc = meta.getPersistentDataContainer();
        
        int currentStoredArrowCount = getArrows(quiverPdc, getQuiver().getStoredArrowsKey());

        if(arrowItemStack.getType() != getQuiver().getArrowType().getType()) {
            return;
        }
        
        if(isQuiver(getSfItem(arrowItemStack))) { 
            return;
        } // prevent quiver in a open state (arrow type) from being deposited 
        
        if(quiverItemStack.getAmount() != 1) {
            player.sendMessage(Utils.colorTranslator("&e无法使用箭筒！使用前请先卸下箭筒。"));
            
            return;
        }
        
        int newStoredArrowCount = currentStoredArrowCount + 1;

        // update stored arrow count
        if(newStoredArrowCount <= getQuiver().getQuiverSize()) { 
            quiverPdc.set(getQuiver().getStoredArrowsKey(), PersistentDataType.INTEGER, newStoredArrowCount);
            
            if(!quiverPdc.has(getQuiver().getRandomIdKey(), PersistentDataType.INTEGER)) {
                int random = ThreadLocalRandom.current().nextInt(1, 1000000);
                
                quiverPdc.set(getQuiver().getRandomIdKey(), PersistentDataType.INTEGER, random);
            
            } // pdc to make quiver unique and unstackable

            quiverItemStack.setType(getQuiver().getArrowType().getType());
            arrowItemStack.setAmount(arrowItemStack.getAmount() - 1);
            
            Utils.setLoreByPdc(quiverItemStack, meta, String.valueOf(newStoredArrowCount), "箭矢剩余: " ,"&e", "&f", " left");
            Utils.setLoreByPdc(quiverItemStack, meta, "打开", "状态: ", "&e", "&f", "");
        } else {
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', getQuiver().getItemName() + " 已满！无法存入箭矢。"));
        }

    }

    public void bowShoot(EntityShootBowEvent event, ItemStack quiverItemStack, boolean isNormalArrow) {
        Player player = (Player) event.getEntity();

        event.setCancelled(true);
        
        // emulate bow shoot due to event cancellation
        float bowForce = event.getForce();

        if(quiverItemStack.getType() == Material.ARROW) {
            Arrow arrow = player.launchProjectile(Arrow.class);

            arrow.setVelocity(arrow.getVelocity().multiply(bowForce));
        } else if(quiverItemStack.getType() == Material.SPECTRAL_ARROW) {
            SpectralArrow spectralArrow = player.launchProjectile(SpectralArrow.class);

            spectralArrow.setVelocity(spectralArrow.getVelocity().multiply(bowForce));
        }

        player.getWorld().playSound(player.getLocation(), Sound.ENTITY_ARROW_SHOOT, 1.0F, 1.0F);
        player.updateInventory();

        ItemMeta meta = quiverItemStack.getItemMeta();
        ItemMeta bowMeta = player.getInventory().getItemInMainHand().getItemMeta();

        if(meta == null || bowMeta == null) {
            return;
        }

        PersistentDataContainer quiverPdc = meta.getPersistentDataContainer();
        
        int currentStoredArrowCount = getArrows(quiverPdc, getQuiver().getStoredArrowsKey());
        int newStoredArrowCount = isNormalArrow && bowMeta.hasEnchant(Enchantment.ARROW_INFINITE) ?
            currentStoredArrowCount : currentStoredArrowCount - 1;

        if(newStoredArrowCount >= 0) { // update quiver lore and pdc
            quiverPdc.set(getQuiver().getStoredArrowsKey(), PersistentDataType.INTEGER, newStoredArrowCount);

            Utils.setLoreByPdc(quiverItemStack, meta, String.valueOf(newStoredArrowCount), "箭矢: ", "&e", "&f", " left");

            if(newStoredArrowCount == 0) {              
                quiverItemStack.setType(Material.LEATHER);

                meta.getPersistentDataContainer().set(getQuiver().getStateKey(), PersistentDataType.STRING, "closed");

                player.sendMessage(ChatColor.GOLD + getQuiver().getItemName() + "已清空！不再存储箭矢。");
                
                Utils.setLoreByPdc(quiverItemStack, meta, "关闭（空）", "状态: ", "&e", "&f", "");
            }
        }

    }

}