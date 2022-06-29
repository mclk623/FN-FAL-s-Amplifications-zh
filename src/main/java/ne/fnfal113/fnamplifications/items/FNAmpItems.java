package ne.fnfal113.fnamplifications.items;

import io.github.thebusybiscuit.slimefun4.api.MinecraftVersion;
import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.groups.NestedItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.groups.SubItemGroup;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerHead;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerSkin;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;

import dev.j3fftw.extrautils.utils.LoreBuilderDynamic;

import ne.fnfal113.fnamplifications.FNAmplifications;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class FNAmpItems {

    private FNAmpItems() {}

    private static final ItemStack STICK = new ItemStack(Material.STICK);

    private static final ItemStack ARMOR = Slimefun.getMinecraftVersion().isAtLeast(MinecraftVersion.MINECRAFT_1_16) ?
            new ItemStack(Material.NETHERITE_CHESTPLATE) : new ItemStack(Material.DIAMOND_CHESTPLATE);

    static{
        ItemMeta meta = STICK.getItemMeta();
        if(meta != null) {
            meta.addEnchant(Enchantment.BINDING_CURSE, 1, false);
            meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
            STICK.setItemMeta(meta);
        }

        ItemMeta armorMeta = ARMOR.getItemMeta();
        if(armorMeta != null) {
            armorMeta.addEnchant(Enchantment.BINDING_CURSE, 1, false);
            armorMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
            ARMOR.setItemMeta(armorMeta);
        }

    }

    // start of Item Groups
    public static final NestedItemGroup FN_MAIN_GROUP = new NestedItemGroup(
            new NamespacedKey(FNAmplifications.getInstance(), "FN_ITEMS"),
            new CustomItemStack(PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "115b670a704ba080a730acf246da64c413901644847edd671c3da9a97441ddc5")),
            "&e&lFN &b&l科&c&l技"));

    public static final SubItemGroup POWER_GENERATORS = new SubItemGroup(
            new NamespacedKey(FNAmplifications.getInstance(), "POWER_GENERATORS"),
            FN_MAIN_GROUP,
            new CustomItemStack(PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "ecb316f7a227a8c59d58ae0dd6768fe4fa546d55b9cfdd56cfe40b6586d81c24")),
            "&eFN 发电机"));

    public static final SubItemGroup MATERIAL_GENERATORS = new SubItemGroup(
            new NamespacedKey(FNAmplifications.getInstance(), "MATERIAL_GENERATORS"),
            FN_MAIN_GROUP,
            new CustomItemStack(Material.EMERALD_BLOCK,
            "&eFN 材料制造机"));

    public static final SubItemGroup SOLAR_GENERATORS = new SubItemGroup(
            new NamespacedKey(FNAmplifications.getInstance(), "SOLAR_GENERATORS"),
            FN_MAIN_GROUP,
            new CustomItemStack(PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "e7f4c00356d1addb85b45ba5352992d3ecc0c9d11feb9041482f8531fd27d014")),
            "&eFN 太阳能发电机"));

    public static final SubItemGroup MACHINES = new SubItemGroup(
            new NamespacedKey(FNAmplifications.getInstance(), "MACHINERY"),
            FN_MAIN_GROUP,
            new CustomItemStack(PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "4a7d54ca45a398c364cebbffb5390ce5e0345e0c7bc5e863acabf57d1342c4bd")),
            "&eFN 机器"));

    public static final SubItemGroup ITEMS = new SubItemGroup(
            new NamespacedKey(FNAmplifications.getInstance(), "MACHINERY_ITEMS"),
            FN_MAIN_GROUP,
            new CustomItemStack(PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "8245a1c3e8d7c3d59d05e3634b04af4cbf8d11b70e2a40e2e6364386db49e737")),
            "&eFN 零件"));

    public static final SubItemGroup MAGICAL_ITEMS = new SubItemGroup(
            new NamespacedKey(FNAmplifications.getInstance(), "MAGICAL_ITEMS"),
            FN_MAIN_GROUP,
            new CustomItemStack(PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "72114a80357463fe2f59e397aab9fc66d482a65d524f8870d21c724c18ecf757")),
                    "&eFN 魔法物品"));

    public static final SubItemGroup MULTIBLOCK = new SubItemGroup(
            new NamespacedKey(FNAmplifications.getInstance(), "MULTIBLOCK"),
            FN_MAIN_GROUP,
            new CustomItemStack(PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "550c3306bb11522fec380ea248eb6a5b180f4a7ab8843d635d14d4a778d6351")),
            "&eFN 多方块结构机器"));

    public static final SubItemGroup METAL_SCRAP_RECIPES = new SubItemGroup(
            new NamespacedKey(FNAmplifications.getInstance(), "METAL_SCRAP_RECIPES"),
            FN_MAIN_GROUP,
            new CustomItemStack(PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "3ff0bee591e5f0000ef16f966b949adcb5c2f409a14ccfc5b91222fd925045db")),
            "&e金属废料配方表"));

    public static final SubItemGroup MYSTERY_STICKS = new SubItemGroup(
            new NamespacedKey(FNAmplifications.getInstance(), "MYSTERY_STICKS"),
            FN_MAIN_GROUP,
            new CustomItemStack(STICK,
                    "&eFN 神秘 PVP/PVE 棍"));

    public static final SubItemGroup FN_GEARS = new SubItemGroup(
            new NamespacedKey(FNAmplifications.getInstance(), "FN_GEARS"),
            FN_MAIN_GROUP,
            new CustomItemStack(ARMOR,
                    "&eFN 盔甲"));

    public static final SubItemGroup FN_STAFFS = new SubItemGroup(
            new NamespacedKey(FNAmplifications.getInstance(), "FN_STAFFS"),
            FN_MAIN_GROUP,
            new CustomItemStack(Material.BLAZE_ROD,
                    "&eFN 法杖"));

    public static final SubItemGroup FN_MISC = new SubItemGroup(
            new NamespacedKey(FNAmplifications.getInstance(), "FN_MISC"),
            FN_MAIN_GROUP,
            new CustomItemStack(Material.CHEST,
                    "&eFN 杂项"));

    public static final SubItemGroup FN_GEMS = new SubItemGroup(
            new NamespacedKey(FNAmplifications.getInstance(), "FN_GEMS"),
            FN_MAIN_GROUP,
            new CustomItemStack(Material.EMERALD,
                    "&eFN 宝石"));

    public static final ItemGroup FN_AMPLIFICATIONS = new ItemGroup(
            new NamespacedKey(FNAmplifications.getInstance(), "FN_AMPLIFICATIONS"),
            new CustomItemStack(PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "115b670a704ba080a730acf246da64c413901644847edd671c3da9a97441ddc5")),
            "&e&lFN &b&l科&c&l技"));

    // start of FN itemstacks
    public static final SlimefunItemStack FN_XPANSION_POWER_R1 = new SlimefunItemStack(
            "FN_POWER_XPANSION_POWER_R1",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "33165e254de7863459343543f933481f0dcf8d4730a23433b9a7ff0d3ff79c5a")),
            "&d&lFN 发电机 R1",
            "&9可以在夜间工作",
            "&9放置后右键此发电机",
            "&9可以查看功率信息",
            ""
    );

    public static final SlimefunItemStack FN_XPANSION_POWER_R2 = new SlimefunItemStack(
            "FN_POWER_XPANSION_POWER_R2",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "5b78e55e3ea6b3682bd7cead43eb1c91b2527a81aa2894f095801f6ee47a3")),
            "&d&lFN 发电机 R2",
            "&9可以在夜间工作",
            "&9放置后右键此发电机",
            "&9可以查看功率信息",
            ""
    );

    public static final SlimefunItemStack FN_XPANSION_POWER_R3 = new SlimefunItemStack(
            "FN_POWER_XPANSION_POWER_R3",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "45ff60d863d1cf76742f275e2ac5749dd0a978a231d3c51e816132c75aef608a")),
            "&d&lFN 发电机 R3",
            "&9可以在夜间工作",
            "&9放置后右键此发电机",
            "&9可以查看功率信息",
            ""
    );

    public static final SlimefunItemStack FN_XPANSION_POWER_R4 = new SlimefunItemStack(
            "FN_POWER_XPANSION_POWER_R4",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "efc05af0e88c6fb10b4c8c8b81b7aa658e64649724cb73bb9bb0f25f28bd")),
            "&d&lFN 发电机 R4",
            "&9可以在夜间工作",
            "&9放置后右键此发电机",
            "&9可以查看功率信息",
            ""
    );

    public static final SlimefunItemStack FN_XPANSION_POWER_R5 = new SlimefunItemStack(
            "FN_POWER_XPANSION_POWER_R5",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "8f14f3179b86f69b3efa7472dacaeb2339f6290d2d817362793348abd98e021")),
            "&d&lFN 发电机 R5",
            "&9可以在夜间工作",
            "&9放置后右键此发电机",
            "&9可以查看功率信息",
            ""
    );

    public static final SlimefunItemStack FN_XPANSION_POWER_R6 = new SlimefunItemStack(
            "FN_POWER_XPANSION_POWER_R6",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "1d5a09884cb83ef5c908dddd385f246fefdee221712c010177f54376da238fdd")),
            "&d&lFN 发电机 R6",
            "&9可以在夜间工作",
            "&9放置后右键此发电机",
            "&9可以查看功率信息",
            ""
    );

    public static final SlimefunItemStack FN_XPANSION_POWER_R7 = new SlimefunItemStack(
            "FN_POWER_XPANSION_POWER_R7",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "f7e541dfb4ba1f7dc28b548e347abbdc987ebe0e61c49fa87111ef1b2dcb2218")),
            "&d&lFN 发电机 R7",
            "&9可以在夜间工作",
            "&9放置后右键此发电机",
            "&9可以查看功率信息",
            ""
    );

    public static final SlimefunItemStack FN_XPANSION_POWER_R8 = new SlimefunItemStack(
            "FN_POWER_XPANSION_POWER_R8",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "de31efefdd9551af8a4349d3d21e5ec8f37e53c801eb25b14279d6a89fe0c01e")),
            "&d&lFN 发电机 R8",
            "&9可以在夜间工作",
            "&9放置后右键此发电机",
            "&9可以查看功率信息",
            ""
    );

    public static final SlimefunItemStack FN_XPANSION_POWER_R9 = new SlimefunItemStack(
            "FN_POWER_XPANSION_POWER_R9",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "6db32b15d7f32704ed626fa52d06fb2b4071d336fdbfe61e6e41c669d6e37f47")),
            "&d&lFN 发电机 R9",
            "&9可以在夜间工作",
            "&9放置后右键此发电机",
            "&9可以查看功率信息",
            ""
    );

    public static final SlimefunItemStack FN_XPANSION_POWER_R10 = new SlimefunItemStack(
            "FN_POWER_XPANSION_POWER_R10",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "7b7c9b6a23f21cca2b362b85b36dece3d8389e363014defe5b92ff6ee64f1ae")),
            "&d&lFN 发电机 R10",
            "&9可以在夜间工作",
            "&9放置后右键此发电机",
            "&9可以查看功率信息",
            ""
    );

    public static final SlimefunItemStack FN_XPANSION_POWER_R11 = new SlimefunItemStack(
            "FN_POWER_XPANSION_POWER_R11",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "7f9f356f5fe7d1bc92cddfaeba3ee773ac9df1cc4d1c2f8fe5f47013032c551d")),
            "&d&lFN 发电机 R11",
            "&9可以在夜间工作",
            "&9放置后右键此发电机",
            "&9可以查看功率信息",
            ""
    );

    public static final SlimefunItemStack FN_XPANSION_POWER_R12 = new SlimefunItemStack(
            "FN_POWER_XPANSION_POWER_R12",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "3464874df452c1d717eddd0fb3b848202ad15571245af6fade2ecf514f3c80bb")),
            "&d&lFN 发电机 R12",
            "&9可以在夜间工作",
            "&9放置后右键此发电机",
            "&9可以查看功率信息",
            ""
    );

    public static final SlimefunItemStack FMG_GENERATOR_MULTIBLOCK = new SlimefunItemStack(
            "FMG_GENERATOR_MULTIBLOCK",
            Material.BEDROCK,
            "&9材料生成器",
            "",
            "&d在任意材料制造机上",
            "&d像这样放置一个箱子.",
            "&a制造机所制造出的产物会放入箱子中."
    );

    public static final SlimefunItemStack FMG_GENERATOR_CLAY_BROKEN = new SlimefunItemStack(
            "FMG_GENERATOR_CLAY_BROKEN",
            Material.CLAY,
            "&3FN 粘土制造机 &8(已损坏)",
            "&8需要修复",
            "",
            "&d&oFN 材料制造机"
    );

    public static SlimefunItemStack FMG_GENERATOR_CLAY = new SlimefunItemStack(
            "FMG_GENERATOR_CLAY",
            Material.CLAY,
            "&3FN 粘土生成机",
            "&6以一定速率自动生成粘土",
            "&6右键查看生成进度",
            "",
            "&6所需游戏刻: " + "&6tick",
            "",
            "&c警告:",
            "&f直接破坏机器将会损坏机器",
            "&f并得到损坏后的机器!",
            "",
            "&d&oFN 材料制造机"
    );

    public static final SlimefunItemStack FMG_GENERATOR_TERRACOTTA_BROKEN = new SlimefunItemStack(
            "FMG_GENERATOR_TERRACOTTA_BROKEN",
            Material.TERRACOTTA,
            "&4FN 陶瓦生成机 &8(已损坏)",
            "&8需要修复",
            "",
            "&d&oFN 材料制造机"
    );

    public static final SlimefunItemStack FMG_GENERATOR_TERRACOTTA = new SlimefunItemStack(
            "FMG_GENERATOR_TERRACOTTA",
            Material.TERRACOTTA,
            "&4FN 陶瓦生成机",
            "&6以一定速率自动生成陶瓦",
            "&6右键查看生成进度",
            "",
            "&6所需游戏刻: " + "&6tick",
            "",
            "&c警告:",
            "&f直接破坏机器将会损坏机器",
            "&f并得到损坏后的机器!",
            "",
            "&d&oFN 材料制造机"
    );

    public static final SlimefunItemStack FMG_GENERATOR_BONE_BROKEN = new SlimefunItemStack(
            "FMG_GENERATOR_BONE_BROKEN",
            Material.BONE_BLOCK,
            "&fFN 骨头生成机 &8(已损坏)",
            "&8需要修复",
            "",
            "&d&oFN 材料制造机"
    );

    public static final SlimefunItemStack FMG_GENERATOR_BONE = new SlimefunItemStack(
            "FMG_GENERATOR_BONE",
            Material.BONE_BLOCK,
            "&fFN 骨头生成机",
            "&6以一定速率自动生成骨头",
            "&6右键查看生成进度",
            "",
            "&6所需游戏刻: " + "&6tick",
            "",
            "&c警告:",
            "&f直接破坏机器将会损坏机器",
            "&f并得到损坏后的机器!",
            "",
            "&d&oFN 材料制造机"
    );

    public static final SlimefunItemStack FMG_GENERATOR_DIAMOND_BROKEN = new SlimefunItemStack(
            "FMG_GENERATOR_DIAMOND_BROKEN",
            Material.DIAMOND_BLOCK,
            "&bFN 钻石生成机 &8(已损坏)",
            "&8需要修复",
            "",
            "&d&oFN 材料制造机"
    );

    public static final SlimefunItemStack FMG_GENERATOR_DIAMOND = new SlimefunItemStack(
            "FMG_GENERATOR_DIAMOND",
            Material.DIAMOND_BLOCK,
            "&bFN 钻石生成机",
            "&6以一定速率自动生成钻石",
            "&6右键查看生成进度",
            "",
            "&6所需游戏刻: " + "&6tick",
            "",
            "&c警告:",
            "&f直接破坏机器将会损坏机器",
            "&f并得到损坏后的机器!",
            "",
            "&d&oFN 材料制造机"
    );

    public static final SlimefunItemStack FMG_GENERATOR_EMERALD_BROKEN = new SlimefunItemStack(
            "FMG_GENERATOR_EMERALD_BROKEN",
            Material.EMERALD_BLOCK,
            "&aFN 绿宝石生成机 &8(已损坏)",
            "&8需要修复",
            "",
            "&d&oFN 材料制造机"
    );

    public static final SlimefunItemStack FMG_GENERATOR_EMERALD = new SlimefunItemStack(
            "FMG_GENERATOR_EMERALD",
            Material.EMERALD_BLOCK,
            "&aFN 绿宝石生成机",
            "&66以一定速率自动生成绿宝石",
            "&6右键查看生成进度",
            "",
            "&6所需游戏刻: " + "&6tick",
            "",
            "&c警告:",
            "&f直接破坏机器将会损坏机器",
            "&f并得到损坏后的机器!",
            "",
            "&d&oFN 材料制造机"
    );

    public static final SlimefunItemStack FMG_GENERATOR_DIRT_BROKEN = new SlimefunItemStack(
            "FMG_GENERATOR_DIRT_BROKEN",
            Material.DIRT,
            "&fFN 泥土生成机 &8(已损坏)",
            "&8需要修复",
            "",
            "&d&oFN 材料制造机"
    );

    public static final SlimefunItemStack FMG_GENERATOR_DIRT = new SlimefunItemStack(
            "FMG_GENERATOR_DIRT",
            Material.DIRT,
            "&fFN 泥土生成机",
            "&6以一定速率自动生成泥土",
            "&6右键查看生成进度",
            "",
            "&6所需游戏刻: " + "&6tick",
            "",
            "&c警告:",
            "&f直接破坏机器将会损坏机器",
            "&f并得到损坏后的机器!",
            "",
            "&d&oFN 材料制造机"
    );

    public static final SlimefunItemStack FMG_GENERATOR_HONEYCOMB_BROKEN = new SlimefunItemStack(
            "FMG_GENERATOR_HONEYCOMB_BROKEN",
            Material.HONEYCOMB_BLOCK,
            "&6FN 蜜脾生成机 &8(已损坏)",
            "&8需要修复",
            "",
            "&d&oFN 材料制造机"
    );

    public static final SlimefunItemStack FMG_GENERATOR_HONEYCOMB = new SlimefunItemStack(
            "FMG_GENERATOR_HONEYCOMB",
            Material.HONEYCOMB_BLOCK,
            "&6FN 蜜脾生成机",
            "&6以一定速率自动生成蜜脾",
            "&6右键查看生成进度",
            "",
            "&6所需游戏刻: " + "&6tick",
            "",
            "&c警告:",
            "&f直接破坏机器将会损坏机器",
            "&f并得到损坏后的机器!",
            "",
            "&d&oFN 材料制造机"
    );
    public static final SlimefunItemStack FMG_GENERATOR_QUARTZ_BROKEN = new SlimefunItemStack(
            "FMG_GENERATOR_QUARTZ_BROKEN",
            Material.QUARTZ_BLOCK,
            "&fFN 石英生成机 &8(已损坏)",
            "&8需要修复",
            "",
            "&d&oFN 材料制造机"
    );

    public static final SlimefunItemStack FMG_GENERATOR_QUARTZ = new SlimefunItemStack(
            "FMG_GENERATOR_QUARTZ",
            Material.QUARTZ_BLOCK,
            "&fFN 石英生成机",
            "&6以一定速率自动生成石英",
            "&6右键查看生成进度",
            "",
            "&6所需游戏刻: " + "&6tick",
            "",
            "&c警告:",
            "&f直接破坏机器将会损坏机器",
            "&f并得到损坏后的机器!",
            "",
            "&d&oFN 材料制造机"
    );

    public static SlimefunItemStack FMG_GENERATOR_WARPED_BROKEN;
    public static SlimefunItemStack FMG_GENERATOR_WARPED;
    public static SlimefunItemStack FMG_GENERATOR_AMETHYST_BROKEN;
    public static SlimefunItemStack FMG_GENERATOR_AMETHYST;

    static {
        if(Slimefun.getMinecraftVersion().isAtLeast(MinecraftVersion.MINECRAFT_1_17)) {
            FMG_GENERATOR_AMETHYST_BROKEN = new SlimefunItemStack(
                    "FMG_GENERATOR_AMETHYST_BROKEN",
                    Material.AMETHYST_BLOCK,
                    "&dFN 紫水晶簇生成器 &8(已损坏)",
                    "&8需要修复",
                    "",
                    "&d&oFN 材料制造机"
            );

            FMG_GENERATOR_AMETHYST = new SlimefunItemStack(
                    "FMG_GENERATOR_AMETHYST",
                    Material.AMETHYST_BLOCK,
                    "&dFN 紫水晶簇生成器",
                    "&6以一定速率自动生成紫水晶簇",
                    "&6右键查看生成进度",
                    "",
                    "&6所需游戏刻: " + "&6tick",
                    "",
                    "&c警告:",
                    "&f直接破坏机器将会损坏机器",
                    "&f并得到损坏后的机器!",
                    "",
                    "&d&oFN 材料制造机"
            );
        }

        if(Slimefun.getMinecraftVersion().isAtLeast(MinecraftVersion.MINECRAFT_1_16)){
            FMG_GENERATOR_WARPED_BROKEN = new SlimefunItemStack(
                    "FMG_GENERATOR_WARPED_BROKEN",
                    Material.WARPED_NYLIUM,
                    "&4FN 诡异菌岩生成器 &8(已损坏)",
                    "&8需要修复",
                    "",
                    "&d&oFN 材料制造机"
            );

           FMG_GENERATOR_WARPED = new SlimefunItemStack(
                    "FMG_GENERATOR_WARPED",
                    Material.WARPED_NYLIUM,
                    "&4FN 诡异菌岩生成器",
                    "&6以一定速率自动生成诡异菌岩",
                    "&6右键查看生成进度",
                    "",
                    "&6所需游戏刻: " + "&6tick",
                    "",
                    "&c警告:",
                    "&f直接破坏机器将会损坏机器",
                    "&f并得到损坏后的机器!",
                    "",
                    "&d&oFN 材料制造机"
            );
        }
    }
    
    public static final SlimefunItemStack FN_FAL_GENERATOR_TIER1 = new SlimefunItemStack(
            "FN_FAL_GENERATOR_TIER1",
            "6d2822cedb3abd579d6dfa2966c1433c3c36cb9732e2c23ec0cc81daedd4403b",
            "&dFN 太阳能发电机 等级 I",
            "", "&e为只在白天需要电力的人设计的发电机",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR));

    public static final SlimefunItemStack FN_FAL_GENERATOR_TIER2 = new SlimefunItemStack(
            "FN_FAL_GENERATOR_TIER2",
            "35dd37f729fc88133e314a552204c0fa2c0168428b353f957bf15ff24b7707e0",
            "&dFN 太阳能发电机 等级 II",
            "", "&e为只在白天需要电力的人设计的发电机",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR));

    public static final SlimefunItemStack FN_FAL_GENERATOR_TIER3 = new SlimefunItemStack(
            "FN_FAL_GENERATOR_TIER3",
            "25ddf6af2d6271d8fdfadbdc54faaad5a68d7b8ac20e163883fc38d76336ea6",
            "&dFN 太阳能发电机 等级 III",
            "", "&e为只在白天需要电力的人设计的发电机",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR));

    public static final SlimefunItemStack FN_FAL_GENERATOR_TIER4 = new SlimefunItemStack(
            "FN_FAL_GENERATOR_TIER4",
            "e7f4c00356d1addb85b45ba5352992d3ecc0c9d11feb9041482f8531fd27d014",
            "&dFN 太阳能发电机 等级 IV",
            "", "&e为只在白天需要电力的人设计的发电机",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR));

    public static final SlimefunItemStack FN_FAL_GENERATOR_TIER5 = new SlimefunItemStack(
            "FN_FAL_GENERATOR_TIER5",
            "afdd9e588d2461d2d3d058cb3e0af2b3a3367607aa14d124ed92a833f25fb112",
            "&dFN 太阳能发电机 等级 V",
            "", "&e为只在白天需要电力的人设计的发电机",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR));

    public static final SlimefunItemStack FN_FAL_GENERATOR_TIER6 = new SlimefunItemStack(
            "FN_FAL_GENERATOR_TIER6",
            "224ad26209fa02f559ef6aa863ee9ba8f3bef0a02f1e9cff8fdc09196402fb6f",
            "&dFN 太阳能发电机 等级 VI",
            "", "&e为只在白天需要电力的人设计的发电机",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR));

    public static final SlimefunItemStack FN_FAL_GENERATOR_TIER7 = new SlimefunItemStack(
            "FN_FAL_GENERATOR_TIER7",
            "c4fe135c311f7086edcc5e6dbc4ef4b23f819fddaa42f827dac46e3574de2287",
            "&dFN 太阳能发电机 等级 VII",
            "", "&e为只在白天需要电力的人设计的发电机",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR));

    public static final SlimefunItemStack FN_FAL_GENERATOR_TIER8 = new SlimefunItemStack(
            "FN_FAL_GENERATOR_TIER8",
            "240775c3ad75763613f32f04986881bbe4eee4366d0c57f17f7c7514e2d0a77d",
            "&dFN 太阳能阵列 等级 VIII",
            "", "&e为只在白天需要电力的人设计的发电机",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR));

    public static final SlimefunItemStack FN_FAL_TRANSFORMER_1 = new SlimefunItemStack(
            "FN_FAL_TRANSFORMER_1",
            Material.BLUE_GLAZED_TERRACOTTA,
            "&dFN 物品转换机 I",
            "", "&e一台能够转换物品的机器",
            "",
            "&d&oFN 机械",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(1),
            LoreBuilder.powerPerSecond(256));

    public static final SlimefunItemStack FN_FAL_TRANSFORMER_2 = new SlimefunItemStack(
            "FN_FAL_TRANSFORMER_2",
            Material.BLUE_GLAZED_TERRACOTTA, "&dFN 物品转换机 II",
            "", "&e一台能够转换物品的机器",
            "",
            "&d&oFN 机械",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(2),
            LoreBuilder.powerPerSecond(384));

    public static final SlimefunItemStack FN_FAL_TRANSFORMER_3 = new SlimefunItemStack(
            "FN_FAL_TRANSFORMER_3",
            Material.BLUE_GLAZED_TERRACOTTA,
            "&dFN 物品转换机 III",
            "", "&e一台能够转换物品的机器",
            "",
            "&d&oFN 机械",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(4),
            LoreBuilder.powerPerSecond(768));

    public static final SlimefunItemStack FN_FAL_COMPRESSOR_1 = new SlimefunItemStack(
            "FN_FAL_COMPRESSOR_1",
            Material.GREEN_GLAZED_TERRACOTTA,
            "&dFN 压缩机 I",
            "", "&e一台能够压缩物品的机器",
            "",
            "&d&oFN 机械",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(1),
            LoreBuilder.powerPerSecond(128));

    public static final SlimefunItemStack FN_FAL_COMPRESSOR_2 = new SlimefunItemStack(
            "FN_FAL_COMPRESSOR_2",
            Material.GREEN_GLAZED_TERRACOTTA,
            "&dFN 压缩机 II",
            "", "&e一台能够压缩物品的机器",
            "",
            "&d&oFN 机械",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(2),
            LoreBuilder.powerPerSecond(256));

    public static final SlimefunItemStack FN_FAL_COMPRESSOR_3 = new SlimefunItemStack(
            "FN_FAL_COMPRESSOR_3",
            Material.GREEN_GLAZED_TERRACOTTA,
            "&dFN 压缩机 III",
            "", "&e一台能够压缩物品的机器",
            "",
            "&d&oFN 机械",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(4),
            LoreBuilder.powerPerSecond(512));

    public static final SlimefunItemStack FN_FAL_CONDENSER_1 = new SlimefunItemStack(
            "FN_FAL_CONDENSER_1",
            Material.YELLOW_STAINED_GLASS,
            "&dFN 铸锭冷凝机 I",
            "", "&e一台能够将金属浓缩的机器",
            "",
            "&d&oFN 机械",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(1),
            LoreBuilder.powerPerSecond(256));

    public static final SlimefunItemStack FN_FAL_CONDENSER_2 = new SlimefunItemStack(
            "FN_FAL_CONDENSER_2",
            Material.YELLOW_STAINED_GLASS,
            "&dFN 铸锭冷凝机 II",
            "", "&e一台能够将金属浓缩的机器",
            "",
            "&d&oFN 机械",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(2),
            LoreBuilder.powerPerSecond(384));

    public static final SlimefunItemStack FN_FAL_CONDENSER_3 = new SlimefunItemStack(
            "FN_FAL_CONDENSER_3",
            Material.YELLOW_STAINED_GLASS,
            "&dFN 铸锭冷凝机 III",
            "", "&e一台能够将金属浓缩的机器",
            "",
            "&d&oFN 机械",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(4),
            LoreBuilder.powerPerSecond(768));

    public static final SlimefunItemStack FN_FAL_RECYCLER_1 = new SlimefunItemStack(
            "FN_FAL_RECYCLER_1",
            Material.PURPLE_STAINED_GLASS,
            "&dFN 回收机 I",
            "", "&e可以降低对应物品的等级",
            "",
            "&d&oFN 机械",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(1),
            LoreBuilder.powerPerSecond(168));

    public static final SlimefunItemStack FN_FAL_RECYCLER_2 = new SlimefunItemStack(
            "FN_FAL_RECYCLER_2",
            Material.PURPLE_STAINED_GLASS,
            "&dFN 回收机 II",
            "", "&e可以降低对应物品的等级",
            "",
            "&d&oFN 机械",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(2),
            LoreBuilder.powerPerSecond(336));

    public static final SlimefunItemStack FN_FAL_RECYCLER_3 = new SlimefunItemStack(
            "FN_FAL_RECYCLER_3",
            Material.PURPLE_STAINED_GLASS,
            "&dFN 回收机 III",
            "", "&e可以降低对应物品的等级",
            "",
            "&d&oFN 机械",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(2),
            LoreBuilder.powerPerSecond(672));

    public static final SlimefunItemStack FN_FAL_DOWNGRADER = new SlimefunItemStack(
            "FN_FAL_DOWNGRADER",
            Material.WHITE_GLAZED_TERRACOTTA,
            "&dFN 机器降级机",
            "", "&e可以用于降级 Slimefun 中的机器",
            "&e非常适合不小心合成了高阶机器,",
            "&e或是想要为多余机器降级的人",
            "",
            "&e- 必须打开机器菜单才有几率获得金属废料",
            "&e- 有 25% 的几率获得",
            "",
            "&d&oFN 机械",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(4),
            LoreBuilder.powerPerSecond(1500));

    public static final SlimefunItemStack MACHINE_PART = new SlimefunItemStack(
            "FN_MACHINERY_MACHINE_PART",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("6ddd4a12da1cc2c9f9d6cd49fc778e3a11f3757de6dd312d70a0d47885189c0")),
            "&d机器零件",
            "&fFN 机械的基础零件",
            "",
            "&d&oFN 机械材料");

    public static final SlimefunItemStack MACHINE_PART_SCRAP = new SlimefunItemStack(
            "FN_MACHINERY_MACHINE_PART_SCRAP",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("6ddd4a12da1cc2c9f9d6cd49fc778e3a11f3757de6dd312d70a0d47885189c0")),
            "&d机器零件",
            "&f使用金属废料合成");

    public static final SlimefunItemStack COMPONENT_PART = new SlimefunItemStack(
            "FN_MACHINERY_COMPONENT_PART",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("74657e89167b17ed581e87ce4215ce8d47145ab34038202d5ccefb0a9bd0d8f4")),
            "&d散热器",
            "&fFN 机械的基础零件",
            "",
            "&d&oFN 机械材料");

    public static final SlimefunItemStack COMPONENT_PART_SCRAP = new SlimefunItemStack(
            "FN_MACHINERY_COMPONENT_PART_SCRAP",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("74657e89167b17ed581e87ce4215ce8d47145ab34038202d5ccefb0a9bd0d8f4")),
            "&d散热器",
            "&f使用金属废料合成");

    public static final SlimefunItemStack MOTOR_SWITCH = new SlimefunItemStack(
            "FN_MACHINERY_MOTOR_SWITCH",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("48748ce96cedbfecaa463966d8fb1ac83c408feea89bd60d76d6024d3befe")),
            "&d马达开关",
            "&fFN 机械的基础零件",
            "",
            "&d&oFN 机械材料");

    public static final SlimefunItemStack MOTOR_SWITCH_SCRAP = new SlimefunItemStack(
            "FN_MACHINERY_MOTOR_SWITCH_SCRAP",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("48748ce96cedbfecaa463966d8fb1ac83c408feea89bd60d76d6024d3befe")),
            "&d马达开关",
            "&f使用金属废料合成");

    public static final SlimefunItemStack POWER_COMPONENT = new SlimefunItemStack(
            "FN_MACHINERY_POWER_COMPONENT",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("25ba8456e92f0790222c19c06f61180a195af1008569ed352b93a3c6d9ec7a98")),
            "&d电源部件",
            "&fFN 机器与发电机的基础零件",
            "",
            "&d&oFN 机械材料");

    public static final SlimefunItemStack POWER_COMPONENT_SCRAP = new SlimefunItemStack(
            "FN_MACHINERY_POWER_COMPONENT_SCRAP",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("25ba8456e92f0790222c19c06f61180a195af1008569ed352b93a3c6d9ec7a98")),
            "&d电源部件",
            "&f使用金属废料合成");

    public static final SlimefunItemStack GEAR_PART = new SlimefunItemStack(
            "FN_MACHINERY_GEAR_PART",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("faf0c95ceba34c7fe6d33404feb87b4184ccce143978622c1647feaed2b63274")),
            "&d齿轮零件",
            "&fFN 机器与发电机的基础零件",
            "",
            "&d&oFN 机械材料");

    public static final SlimefunItemStack GEAR_PART_SCRAP = new SlimefunItemStack(
            "FN_MACHINERY_GEAR_PART_SCRAP",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("faf0c95ceba34c7fe6d33404feb87b4184ccce143978622c1647feaed2b63274")),
            "&d齿轮零件",
            "&f使用金属废料合成");

    public static final SlimefunItemStack THREAD_PART = new SlimefunItemStack(
            "FN_MACHINERY_THREAD_PART",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("87ec65d6649ac1bf7b282575cef299f8601e51d8418d6e546e4fc71b218f7")),
            "&d螺纹塑件",
            "&fFN 机械的基础零件",
            "",
            "&d&oFN 机械材料");

    public static final SlimefunItemStack THREAD_PART_SCRAP = new SlimefunItemStack(
            "FN_MACHINERY_THREAD_PART_SCRAP",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("87ec65d6649ac1bf7b282575cef299f8601e51d8418d6e546e4fc71b218f7")),
            "&d螺纹塑件",
            "&f使用金属废料合成");

    public static final SlimefunItemStack COMPRESSOR_PART = new SlimefunItemStack(
            "FN_MACHINERY_COMPRESSOR_PART",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("d3898f7c444223b7a91a8f038e224222fef8960cfbef94836b014a06ea4cba63")),
            "&d压缩机零件",
            "&fFN 机械的基础零件",
            "",
            "&d&oFN 机械材料");

    public static final SlimefunItemStack CONDENSER_PART = new SlimefunItemStack(
            "FN_MACHINERY_CONDENSER_PART",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("63be652b2e1b93ed8e93b427de455d446582e6c8d929f8fc96ac488a8f7f53")),
            "&d冷凝器组件",
            "&fFN 机械的基础零件",
            "",
            "&d&oFN 机械材料");

    public static final SlimefunItemStack RECYCLER_PART = new SlimefunItemStack(
            "FN_MACHINERY_RECYCLER_PART",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("4817fc8e16b8e994efb908b71acd1d1352ca5aefa09fecc9339ebea450d83fb8")),
            "&d回收机零件",
            "&fFN 机械的基础零件",
            "",
            "&d&oFN 机械材料");

    public static final SlimefunItemStack DOWNGRADER_PART = new SlimefunItemStack(
            "FN_MACHINERY_DOWNGRADER_PART",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("a44c5ce2eb643f8671c667e8802c9317ad8cc6af680d4ef671d8c0c63277900a")),
            "&d降级机零件",
            "&fFN 机械的基础零件",
            "",
            "&d&oFN 机械材料");

    public static final SlimefunItemStack FUNNEL_PART = new SlimefunItemStack(
            "FN_MACHINERY_FUNNEL_PART",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("bb2abd66939f4cb7257a88cf52fbc6fdceec1433ec2a6ef16d62e34f6238781")),
            "&d漏斗零件",
            "&fFN 机械的基础零件",
            "",
            "&d&oFN 机械材料");

    public static final SlimefunItemStack FUNNEL_PART_SCRAP = new SlimefunItemStack(
            "FN_MACHINERY_FUNNEL_PART_SCRAP",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("bb2abd66939f4cb7257a88cf52fbc6fdceec1433ec2a6ef16d62e34f6238781")),
            "&d漏斗零件",
            "&f使用金属废料合成");

    public static final SlimefunItemStack DIAMOND_PLATING = new SlimefunItemStack(
            "FN_MACHINERY_DIAMOND_PLATING",
            Material.LIGHT_BLUE_CARPET,
            "&d钻石镀层",
            "&fFN 机器与发电机的基础零件",
            "",
            "&d&oFN 机械材料");

    public static final SlimefunItemStack ALUMINUM_PLATING = new SlimefunItemStack(
            "FN_MACHINERY_ALUMINUM_PLATING",
            Material.WHITE_CARPET,
            "&d铝镀层",
            "&fFN 机器与发电机的基础零件",
            "",
            "&d&oFN 机械材料");

    public static final SlimefunItemStack GOLD_PLATING = new SlimefunItemStack(
            "FN_MACHINERY_GOLD_PLATING",
            Material.YELLOW_CARPET,
            "&d金镀层",
            "&fFN 机器与发电机的基础零件",
            "",
            "&d&oFN 机械材料");

    public static final SlimefunItemStack BRASS_PLATING = new SlimefunItemStack(
            "FN_MACHINERY_BRASS_PLATING",
            Material.BROWN_CARPET,
            "&d黄铜镀层",
            "&fFN 机器与发电机的基础零件",
            "",
            "&d&oFN 机械材料");

    public static final SlimefunItemStack REINFORCED_CASING = new SlimefunItemStack(
            "FN_MACHINERY_REINFORCED_CASING",
            Material.LIGHT_GRAY_CARPET,
            "&d强化合金镀层",
            "&fFN 机器与发电机的基础零件",
            "",
            "&d&oFN 机械材料");

    public static final SlimefunItemStack UNBIND_RUNE = new SlimefunItemStack(
            "FN_MAGICAL_ITEMS_UNBIND_RUNE",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("4f01ec6331a3bc30a8204ec56398d08ca38788556bca9b81d776f6238d567367")),
            "&6解绑符文",
            "&f来自赛伊克时期的魔法符文",
            "",
            "&d&oFN 魔法物品");

    public static final SlimefunItemStack SPIRAL_FIRE_RUNE = new SlimefunItemStack(
            "FN_MAGICAL_ITEMS_SPIRAL_FIRE_RUNE",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("8301aa86cafd4b2d732a9b4894cfcfc65edc828e8571b45dbf0a3ba96575cccf")),
            "&c螺旋火焰符文",
            "&f炽热之心正从符文中螺旋而升",
            "",
            "&d&oFN 魔法物品");

    public static final SlimefunItemStack SPIRIT_RUNE = new SlimefunItemStack(
            "FN_MAGICAL_ITEMS_SPIRIT_RUNE",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("c738b8af8d7ce1a26dc6d40180b3589403e11ef36a66d7c4590037732829542e")),
            "&f灵魂符文",
            "&f灵魂已赎, 即日将至",
            "",
            "&d&oFN 魔法物品");

    public static final SlimefunItemStack PESTILENCE_RUNE = new SlimefunItemStack(
            "FN_MAGICAL_ITEMS_PESTILENCE_RUNE",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("a8c4811395fbf7f620f05cc3175cef1515aaf775ba04a01045027f0693a90147")),
            "&a瘟疫符文",
            "&f黑死病时期的符文",
            "&f蕴含着致命的罪恶",
            "",
            "&d&oFN 魔法物品");

    public static final SlimefunItemStack SPARKLING_RUNE = new SlimefunItemStack(
            "FN_MAGICAL_ITEMS_SPARKLING_RUNE",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("f1e2428cb359988f4c4ff0e61de21385c62269de19a69762d773223b75dd1666")),
            "&e闪烁符文",
            "&f太闪耀的符文反而过于致命",
            "",
            "&d&oFN 魔法物品");

    public static final SlimefunItemStack CLOUD_RUNE = new SlimefunItemStack(
            "FN_MAGICAL_ITEMS_CLOUD_RUNE",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("2273740d454de962484712f9835e35119b37ab867fa6982d5cc1f333c2334e59")),
            "&3云之符文",
            "&f直上云朵所在之处",
            "",
            "&d&oFN 魔法物品");

    public static final SlimefunItemStack ICE_RUNE = new SlimefunItemStack(
            "FN_MAGICAL_ITEMS_ICE_RUNE",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("cdc57c75adf39ec6f0e0916049dd9671e98a8a1e600104e84e645c988950bd7")),
            "&b冰之符文",
            "&f充满了寒冷的符文",
            "&f但你能保持不动吗",
            "",
            "&d&oFN 魔法物品");

    public static final SlimefunItemStack POWER_RUNE = new SlimefunItemStack(
            "FN_MAGICAL_ITEMS_POWER_RUNE",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("3b481c31dc683bdcb7d375a7c5db7ac7adf9e9fe8b6c04a64931613e29fe470e")),
            "&9能量符文",
            "&f符文中强大的力量",
            "&f可以做到危险的事情",
            "",
            "&d&oFN 魔法物品");

    public static final SlimefunItemStack LINGER_RUNE = new SlimefunItemStack(
            "FN_MAGICAL_ITEMS_LINGER_RUNE",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("2c4a65c689b2d36409100a60c2ab8d3d0a67ce94eea3c1f7ac974fd893568b5d")),
            "&2徘徊符文",
            "&f它从世界顶部到底端",
            "&f很快就会到地面徘徊",
            "",
            "&d&oFN 魔法物品");

    public static final SlimefunItemStack AGILITY_RUNE = new SlimefunItemStack(
            "FN_MAGICAL_ITEMS_AGILITY_RUNE",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("35f4861aa5b22ee28a90e75dab45d221efd14c0b1ecc8ee998fb67e43bb8f3de")),
            "&e敏捷符文",
            "&f更快意味着更好",
            "&f但它真的重要吗",
            "",
            "&d&oFN 魔法物品");

    public static final SlimefunItemStack INTELLECT_RUNE = new SlimefunItemStack(
            "FN_MAGICAL_ITEMS_INTELLECT_RUNE",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("977c1fc93216e96d435cf962e1173de8d1a249b644894d72676eba732fcd56e7")),
            "&9智慧符文",
            "&f在绝望之时非常有用的符文",
            "",
            "&d&oFN 魔法物品");

    public static final SlimefunItemStack HEART_RUNE = new SlimefunItemStack(
            "FN_MAGICAL_ITEMS_HEART_RUNE",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("2c1c179ad51955f1522c48ea9931f09c162741b45e22e9d3feb682c7e5ed8274")),
            "&d心之符文",
            "&f符文中的灵气能让你恢复活力",
            "",
            "&d&oFN 魔法物品");

    public static final SlimefunItemStack BASIC_MACHINE_BLOCK = new SlimefunItemStack(
            "FN_MACHINERY_BASIC_MACHINE_BLOCK",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("883dd0f90df05fe6a09aaccaf54bc043e455e1c865bda1fd272e3f47fb9bb910")),
            "&d基础机械方块",
            "&fFN 机械和发电机的基础部分",
            "",
            "&d&oFN 机械材料");

    public static final SlimefunItemStack HIGHTECH_MACHINE_BLOCK = new SlimefunItemStack(
            "FN_MACHINERY_HIGHTECH_MACHINE_BLOCK",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("5a7b3b16e5d0c4cfd21c4eb9133e969aad7cc7303ccdf317512e26a4879b51")),
            "&d高科技机械方块",
            "&fFN 机械和发电机的基础部分",
            "",
            "&d&oFN 机械材料");

    public static final SlimefunItemStack FN_ASSEMBLY_STATION = new SlimefunItemStack(
            "FN_ASSEMBLY_STATION",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("583150f055935058634576185977ffba49ff4679faa03ad0008feaa0161865b3")),
            "&dFN 组装站"
    );

    public static final SlimefunItemStack FN_SCRAP_RECYCLER = new SlimefunItemStack(
            "FN_SCRAP_RECYCLER",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("656634b556caf5382de65038a10e4d79c7c18695048599df74f9c67c1e1e8736")),
            "&dFN 废料回收机"
    );

    public static final SlimefunItemStack FN_METAL_SCRAPS = new SlimefunItemStack(
            "FN_METAL_SCRAPS",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("3ff0bee591e5f0000ef16f966b949adcb5c2f409a14ccfc5b91222fd925045db")),
            "&d金属废料",
            "&f降级机器时留下的废料"
            , "&f可以用于合成 FN 机械材料",
            "",
            "&d&oFN 机械材料"
    );

    public static final SlimefunItemStack FN_BLOCK_BREAKER_1 = new SlimefunItemStack(
            "FN_BLOCK_BREAKER_I",
            Material.DISPENSER,
            "&4方块挖掘机 I",
            "",
            "&6在发射器面前的方块会被挖掘",
            "&d(原版方块)",
            "",
            "&e速率: " + "&eticks",
            "",
            "&d&oFN 机械",
            LoreBuilder.machine(MachineTier.AVERAGE, MachineType.MACHINE),
            LoreBuilder.powerBuffer(512),
            LoreBuilderDynamic.powerPerTick(32)
    );

    public static final SlimefunItemStack FN_BLOCK_BREAKER_2 = new SlimefunItemStack(
            "FN_BLOCK_BREAKER_II",
            Material.DISPENSER,
            "&4方块挖掘机 II",
            "",
            "&6在发射器面前的方块会被挖掘",
            "&d(原版方块)",
            "",
            "&e速率: " + "&eticks",
            "",
            "&d&oFN 机械",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            LoreBuilder.powerBuffer(1024),
            LoreBuilderDynamic.powerPerTick(64)
    );

    public static final SlimefunItemStack FN_BLOCK_BREAKER_3 = new SlimefunItemStack(
            "FN_BLOCK_BREAKER_III",
            Material.DISPENSER,
            "&4方块挖掘机 III",
            "",
            "&6在发射器面前的方块会被挖掘",
            "&d(原版方块)",
            "",
            "&e速率: " + "&eticks",
            "",
            "&d&oFN 机械",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.powerBuffer(2048),
            LoreBuilderDynamic.powerPerTick(128)
    );

    public static final SlimefunItemStack FN_STICK = new SlimefunItemStack(
            "FN_MYSTERY_STICK_1",
            Material.STICK,
            "&c神秘的法棍",
            "&f我也很好奇这根法棍是做什么的"
    );


    public static final SlimefunItemStack FN_STICK_2 = new SlimefunItemStack(
            "FN_MYSTERY_STICK_2",
            Material.STICK,
            "&c神秘的法棍 II",
            "&f又一根不知何用的法棍"
    );

    public static final SlimefunItemStack FN_STICK_3 = new SlimefunItemStack(
            "FN_MYSTERY_STICK_3",
            Material.STICK,
            "&c神秘的法棍 III",
            "&f拿着这根法棍让人感觉与其同调"
    );

    public static final SlimefunItemStack FN_STICK_4 = new SlimefunItemStack(
            "FN_MYSTERY_STICK_4",
            Material.STICK,
            "&c神秘的法棍 IV",
            "&f我曾经或许用过这根法棍"
    );

    public static final SlimefunItemStack FN_STICK_5 = new SlimefunItemStack(
            "FN_MYSTERY_STICK_5",
            Material.STICK,
            "&c神秘的法棍 V",
            "&f我已经厌倦了那些棍子"
    );

    public static final SlimefunItemStack FN_STICK_6 = new SlimefunItemStack(
            "FN_MYSTERY_STICK_6",
            Material.STICK,
            "&c神秘的法棍 VI",
            "&f愿原力与你同在"
    );

    public static final SlimefunItemStack FN_STICK_7 = new SlimefunItemStack(
            "FN_MYSTERY_STICK_7",
            Material.STICK,
            "&c神秘的法棍 VII",
            "&f这根法棍散发的光环令人着迷"
    );

    public static final SlimefunItemStack FN_STICK_8 = new SlimefunItemStack(
            "FN_MYSTERY_STICK_8",
            Material.STICK,
            "&c神秘的法棍 VIII",
            "&f有些重的法棍"
    );

    public static final SlimefunItemStack FN_STICK_9 = new SlimefunItemStack(
            "FN_MYSTERY_STICK_9",
            Material.STICK,
            "&c神秘的法棍 IX",
            "&f这根法棍使用时需要更多魔力"
    );

    public static final SlimefunItemStack FN_STICK_10 = new SlimefunItemStack(
            "FN_MYSTERY_STICK_10",
            Material.STICK,
            "&c神秘的法棍 X",
            "&f致命可怕的法棍"
    );

    public static final SlimefunItemStack FN_STICK_11 = new SlimefunItemStack(
            "FN_MYSTERY_STICK_11",
            Material.STICK,
            "&c神秘的法棍 XI",
            "&f诺德人的法棍"
    );

    public static final SlimefunItemStack FN_STICK_ALTAR = new SlimefunItemStack(
            "FN_STICK_ALTAR",
            Material.ENCHANTING_TABLE,
            "&dFN 神秘法棍祭坛"
    );

    public static final SlimefunItemStack FN_GEM_ALTAR = new SlimefunItemStack(
            "FN_GEM_ALTAR",
            Material.SMITHING_TABLE,
            "&dFN 宝石祭坛"
    );

    public static final SlimefunItemStack FN_GEM_UPGRADER = new SlimefunItemStack(
            "FN_GEM_UPGRADER",
            Material.SMITHING_TABLE,
            "&dFN 宝石升级器"
    );

    public static final SlimefunItemStack FN_MAGIC_ALTAR = new SlimefunItemStack(
            "FN_MAGIC_ALTAR",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("e34930125767c2e34ac939ec94a2aa4e79c381ee336760695c6c874cf12")),
            "&dFN 魔法祭坛"
    );

    public static final SlimefunItemStack FN_GEAR_HELMET = new SlimefunItemStack(
            "FN_GEAR_HELMET",
            Slimefun.getMinecraftVersion().isAtLeast(MinecraftVersion.MINECRAFT_1_16) ?
                    Material.NETHERITE_HELMET : Material.DIAMOND_HELMET,
            "&cFN 的战场头盔",
            "&c◬◬◬◬◬◬| &d&l介绍 &6|◬◬◬◬◬◬",
            "",
            "&f以 FN 之名戴上头盔",
            "&f战斗只会让头盔变得更强",
            "&f还会获得额外的属性和附魔",
            "",
            "&c◈◈◈◈◈◈| &d&l数据 &6|◈◈◈◈◈◈",
            ChatColor.YELLOW + "头盔等级: 0",
            ChatColor.YELLOW + "进阶进度:",
            ChatColor.GRAY + "[" + "■■■■■■■■■■" + ChatColor.GRAY + "]"

    );

    public static final SlimefunItemStack FN_GEAR_CHESTPLATE = new SlimefunItemStack(
            "FN_GEAR_CHESTPLATE",
            Slimefun.getMinecraftVersion().isAtLeast(MinecraftVersion.MINECRAFT_1_16) ?
                    Material.NETHERITE_CHESTPLATE : Material.DIAMOND_CHESTPLATE,
            "&cFN 的战痕累累盔甲",
            "&c◬◬◬◬◬◬| &d&l介绍 &6|◬◬◬◬◬◬",
            "",
            "&f来自过去的盔甲被再次赋予生命",
            "&f在战争与冲突中, 它变得更加强大",
            "",
            "&c◈◈◈◈◈◈| &d&l数据 &6|◈◈◈◈◈◈",
            ChatColor.YELLOW + "盔甲等级: 0",
            ChatColor.YELLOW + "进阶进度:",
            ChatColor.GRAY + "[" + "■■■■■■■■■■" + ChatColor.GRAY + "]"

    );

    public static final SlimefunItemStack FN_GEAR_LEGGINGS = new SlimefunItemStack(
            "FN_GEAR_LEGGINGS",
            Slimefun.getMinecraftVersion().isAtLeast(MinecraftVersion.MINECRAFT_1_16) ?
                    Material.NETHERITE_LEGGINGS: Material.DIAMOND_LEGGINGS,
            "&cFN 的卓越护腿",
            "&c◬◬◬◬◬◬| &d&l介绍 &6|◬◬◬◬◬◬",
            "",
            "&fFN 在战争中穿过的光荣护腿",
            "&f并从敌人的每一次胜利中获得荣耀",
            "",
            "&c◈◈◈◈◈◈| &d&l数据 &6|◈◈◈◈◈◈",
            ChatColor.YELLOW + "护腿等级: 0",
            ChatColor.YELLOW + "进阶进度:",
            ChatColor.GRAY + "[" + "■■■■■■■■■■" + ChatColor.GRAY + "]"

    );

    public static final SlimefunItemStack FN_GEAR_BOOTS = new SlimefunItemStack(
            "FN_GEAR_BOOTS",
            Slimefun.getMinecraftVersion().isAtLeast(MinecraftVersion.MINECRAFT_1_16) ?
                    Material.NETHERITE_BOOTS : Material.DIAMOND_BOOTS,
            "&cFN 的远征战斗靴",
            "&c◬◬◬◬◬◬| &d&l介绍 &6|◬◬◬◬◬◬",
            "",
            "&f远征者--残暴、血腥",
            "&f它的脚下是被征服者的血液",
            "&f在此刻，所有良知都会萧然褪去",
            "",
            "&c◈◈◈◈◈◈| &d&l数据 &6|◈◈◈◈◈◈",
            ChatColor.YELLOW + "靴子等级: 0",
            ChatColor.YELLOW + "进阶进度:",
            ChatColor.GRAY + "[" + "■■■■■■■■■■" + ChatColor.GRAY + "]"

    );

    public static final SlimefunItemStack FN_STAFF_TP = new SlimefunItemStack(
            "FN_STAFF_TP",
            Material.BLAZE_ROD,
            "&c传送法杖",
            "",
            "&d右键传送到目标方块",
            "",
            "&e可用次数剩余 " + "&e次"
    );

    public static final SlimefunItemStack FN_STAFF_INVI = new SlimefunItemStack(
            "FN_STAFF_INVI",
            Material.BLAZE_ROD,
            "&c隐身法杖",
            "",
            "&d给予你 6s 的隐身效果",
            "&d还能隐藏你的盔甲和名字!",
            "",
            "&e可用次数剩余 " + "&e次"
    );

    public static final SlimefunItemStack FN_STAFF_LOCOMOTION = new SlimefunItemStack(
            "FN_STAFF_LOCOMOTION",
            Material.BLAZE_ROD,
            "&c位移法杖",
            "",
            "&d通过右击选择实体将其",
            "&d移动到左击的位置",
            "",
            "&e可用次数剩余 " + "&e次"
            "&e储存的实体: 无"
    );

    public static final SlimefunItemStack FN_STAFF_HELLFIRE = new SlimefunItemStack(
            "FN_STAFF_HELLFIRE",
            Material.BLAZE_ROD,
            "&c地狱火法杖",
            "",
            "&d召唤出地狱火法阵",
            "&d在阵中的实体都会着火 8s",
            "",
            "&e可用次数剩余 " + "&e次"
    );

    public static final SlimefunItemStack FN_STAFF_DEEPFREEZE = new SlimefunItemStack(
            "FN_STAFF_DEEPFREEZE",
            Material.BLAZE_ROD,
            "&c深冻法杖",
            "",
            "&d召唤出冰冻法阵",
            "&d在阵中的实体都会由于冷冻",
            "&d获得 8s 的缓慢效果",
            "",
            "&e可用次数剩余 " + "&e次"
    );

    public static final SlimefunItemStack FN_STAFF_CONFUSION = new SlimefunItemStack(
            "FN_STAFF_CONFUSION",
            Material.BLAZE_ROD,
            "&c混乱法杖",
            "",
            "&d召唤出混乱法阵",
            "&d在阵中的实体都会",
            "&d获得 8s 的反胃效果",
            "",
            "&e可用次数剩余 " + "&e次"
    );

    public static final SlimefunItemStack FN_STAFF_GRAVITY = new SlimefunItemStack(
            "FN_STAFF_GRAVITY",
            Material.BLAZE_ROD,
            "&c引力法杖",
            "",
            "&d若生物处在效果范围之内",
            "&d则会被引力拉动",
            "&d持续8s",
            "",
            "&e可用次数剩余 " + "&e次"
    );

    public static final SlimefunItemStack FN_STAFF_STALLION = new SlimefunItemStack(
            "FN_STAFF_STALLION",
            Material.BLAZE_ROD,
            "&c骷髅马法杖",
            "",
            "&d右击生成一匹骷髅马",
            "&d玩家可骑乘至下马/死亡",
            "",
            "&e可用次数剩余 " + "&e次"
    );

    public static final SlimefunItemStack FN_STAFF_FORCE = new SlimefunItemStack(
            "FN_STAFF_FORCE",
            Material.BLAZE_ROD,
            "&c力量法杖",
            "",
            "&d右击 生成一片效果云,",
            "&d提供向前的推力",
            "&dshift右击 生成一片特殊的效果云",
            "&d提供向后的推力",
            "",
            "&e可用次数剩余 " + "&e次"
    );

    public static final SlimefunItemStack FN_STAFF_HEALING = new SlimefunItemStack(
            "FN_STAFF_HEALING",
            Material.BLAZE_ROD,
            "&c治愈法杖",
            "",
            "&d右击生成一片效果云",
            "&d治疗范围内生物",
            "&d持续8s",
            "",
            "&e可用次数剩余 " + "&e次"
    );

    public static final SlimefunItemStack FN_STAFF_INVULNERABILITY = new SlimefunItemStack(
            "FN_STAFF_INVULNERABILITY",
            Material.BLAZE_ROD,
            "&c辉月",
            "",
            "&d右击生成一片效果云,",
            "&d保护范围内的实体免受伤害",
            "&d持续8s",
            "",
            "&e可用次数剩余 " + "&e次"
    );

    public static final SlimefunItemStack FN_STAFF_EXPLOSION = new SlimefunItemStack(
            "FN_STAFF_EXPLOSION",
            Material.BLAZE_ROD,
            "&c爆裂法杖",
            "",
            "&d右击目标方块",
            "&d产生一次爆炸并造成伤害",
            "",
            "&e可用次数剩余 " + "&e次"
    );

    public static final SlimefunItemStack FN_STAFF_MUSTER = new SlimefunItemStack(
            "FN_STAFF_MUSTER",
            Material.BLAZE_ROD,
            "&c聚集法杖",
            "",
            "&d右击目标方块以传送",
            "&d附近50格内实体至该方块上",
            "",
            "&e可用次数剩余 " + "&e次"
    );

    public static final SlimefunItemStack FN_STAFF_AWARENESS = new SlimefunItemStack(
            "FN_STAFF_AWARENESS",
            Material.BLAZE_ROD,
            "&c探测法杖",
            "",
            "&e右击&7获取",
            "&d50格内所有玩家的信息",
            "",
            "&e可用次数剩余 " + "&e次"
    );

    public static final SlimefunItemStack FN_STAFF_MINERALS = new SlimefunItemStack(
            "FN_STAFF_MINERALS",
            Material.BLAZE_ROD,
            "&c矿工法杖",
            "",
            "&d获取当前区块所有矿物的信息",
            "",
            "&e可用次数剩余 " + "&e次"
    );

    public static final SlimefunItemStack FN_STAFF_FANGS = new SlimefunItemStack(
            "FN_STAFF_FANGS",
            Material.BLAZE_ROD,
            "&c尖牙法杖",
            "",
            "&e右击 &7向目标方向",
            "&7释放尖牙",
            "&7并造成伤害",
            "",
            "&e可用次数剩余 " + "&e次"
    );

    public static final SlimefunItemStack FN_STAFF_SKULLS = new SlimefunItemStack(
            "FN_STAFF_SKULLS",
            Material.BLAZE_ROD,
            "&c凋灵法杖",
            "",
            "&e右击 &7向目标方向",
            "&d释放凋灵弹",
            "",
            "&e可用次数剩余 " + "&e次"
    );

    public static final SlimefunItemStack FN_STAFF_AIR_STRIDER = new SlimefunItemStack(
            "FN_STAFF_AIR_STRIDER",
            Material.BLAZE_ROD,
            "&c浮空法杖",
            "",
            "&e右击 &d获取浮空能力",
            "&d持续10s",
            "",
            "&e可用次数剩余 " + "&e次"
    );

    public static final SlimefunItemStack FN_STAFF_COBWEB = new SlimefunItemStack(
            "FN_STAFF_COBWEB",
            Material.BLAZE_ROD,
            "&c蛛网法杖",
            "",
            "&e右击 &d向目标方块",
            "&d生成一堵蛛网墙",
            "",
            "&e可用次数剩余 " + "&e次"
    );

    public static final SlimefunItemStack FN_QUIVER = new SlimefunItemStack(
            "FN_QUIVER",
            Material.LEATHER,
            "&b箭袋 (箭)",
            "",
            "&7将箭袋放在副手:",
            "&e右击&7储存箭",
            "&eShift+右击&7取出箭",
            "",
            "&e单击以更改状态，",
            "&e大小：192 箭头",
            "&eArrows: " + "&f0",
            "&eState: Closed (No Arrows)"
    );

    public static final SlimefunItemStack FN_SPECTRAL_QUIVER = new SlimefunItemStack(
            "FN_SPECTRAL_QUIVER",
            Material.LEATHER,
            "&a箭袋 (光灵箭)",
            "",
            "&7将箭袋放在副手:",
            "&e右击&7储存箭",
            "&eShift+右击&7取出箭",
            "",
            "&eClick to close/open",
            "&eSize: 192 Spectral Arrows",
            "&eArrows: " + "&f0",
            "&eState: Closed (No Arrows)"
    );

    public static final SlimefunItemStack FN_UPGRADED_QUIVER = new SlimefunItemStack(
            "FN_UPGRADED_QUIVER",
            Material.LEATHER,
            "&6强化箭袋 (箭)",
            "",
            "&7将箭袋放在副手:",
            "&e右击&7储存箭",
            "&eShift+右击&7取出箭",
            "",
            "&eClick to change state",
            "&eSize: 288 Arrows",
            "&eArrows: " + "&f0",
            "&eState: Closed (No Arrows)"
    );

    public static final SlimefunItemStack FN_UPGRADED_SPECTRAL_QUIVER = new SlimefunItemStack(
            "FN_UPGRADED_SPECTRAL_QUIVER",
            Material.LEATHER,
            "&c强化箭袋 (光灵箭)",
            "",
            "&7将箭袋放在副手:",
            "&e右击&7储存箭",
            "&eShift+右击&7取出箭",
            "",
            "&eClick to change state",
            "&eSize: 288 Arrows",
            "&eArrows: " + "&f0",
            "&eState: Closed (No Arrows)"
    );

    public static final SlimefunItemStack FN_HOE_5X5 = new SlimefunItemStack(
            "FN_HOE_5X5",
            Material.DIAMOND_HOE,
            "&cFN万用锄",
            "",
            "&d可以在5x5范围内",
            "&d改良土壤/耕种土地/收割庄稼"
    );

    public static final SlimefunItemStack FN_HOE_5X5_AUTO_PLANT = new SlimefunItemStack(
            "FN_HOE_5X5_AUTO_PLANT",
            Material.DIAMOND_HOE,
            "&cFN全自动万用锄",
            "",
            "&d可以在5x5范围内",
            "&d改良土壤/耕种土地/收割庄稼",
            "",
            "&d若作物已成熟",
            "&d则会自动补种该作物"
    );

    public static final SlimefunItemStack FN_GEM_INFERNO = new SlimefunItemStack(
            "FN_GEM_INFERNO",
            Material.EMERALD,
            "&c地狱宝石",
            "",
            "&e有机会让7格半径内的敌人着火",
            "",
            "&c◢◤◢◤◢◤ Tiers &6◥◣◥◣◥◣",
            "&6⨳ 等级 I: " + "&e%",
            "&6⨳ 等级 II: " + "&e%",
            "&6⨳ 等级 III: " + "&e%",
            "&6⨳ 等级 IV: " + "&e%",
            "&c◢◤◢◤◢◤◢◤◢◤◢&6◣◥◣◥◣◥◣◥◣◥◣",
            "",
            "&d拖放一把剑来绑定这个宝石"
    );

    public static final SlimefunItemStack FN_GEM_ARMOR_IMPAIR = new SlimefunItemStack(
            "FN_GEM_ARMOR_IMPAIR",
            Material.EMERALD,
            "&c护甲削弱宝石",
            "",
            "&e触发时有机会对所有敌方护甲造成额外的耐久伤害",
            "",
            "&c◢◤◢◤◢◤ Tiers &6◥◣◥◣◥◣",
            "&6⨳ 等级 I: " + "&e%",
            "&6⨳ 等级 II: " + "&e%",
            "&6⨳ 等级 III: " + "&e%",
            "&6⨳ 等级 IV: " + "&e%",
            "&c◢◤◢◤◢◤◢◤◢◤◢&6◣◥◣◥◣◥◣◥◣◥◣",
            "",
            "&d拖放剑或斧头以绑定此宝石"
    );

    public static final SlimefunItemStack FN_GEM_TELEPATHY = new SlimefunItemStack(
            "FN_GEM_TELEPATHY",
            Material.EMERALD,
            "&c心灵感应宝石",
            "",
            "&e自动将 &6被工具破坏的",
            "&e方块放入玩家的物品栏中",
            "",
            "&d拖放至工具上以绑定此宝石"
    );

    public static final SlimefunItemStack FN_GEM_THUNDER = new SlimefunItemStack(
            "FN_GEM_THUNDER",
            Material.EMERALD,
            "&c霹雳宝石",
            "",
            "&e有机会向敌人发出闪电",
            "",
            "&c◢◤◢◤◢◤ Tiers &6◥◣◥◣◥◣",
            "&6⨳ 等级 I: " + "&e%",
            "&6⨳ 等级 II: " + "&e%",
            "&6⨳ 等级 III: " + "&e%",
            "&6⨳ 等级 IV: " + "&e%",
            "&c◢◤◢◤◢◤◢◤◢◤◢&6◣◥◣◥◣◥◣◥◣◥◣",
            "",
            "&d拖放剑或斧头以绑定此宝石"
    );

    public static final SlimefunItemStack FN_GEM_HASTY = new SlimefunItemStack(
            "FN_GEM_HASTY",
            Material.EMERALD,
            "&c急迫宝石",
            "",
            "&e开采矿石时有几率获得4秒急速",
            "",
            "&c◢◤◢◤◢◤ Tiers &6◥◣◥◣◥◣",
            "&6⨳ 等级 I: " + "&e%",
            "&6⨳ 等级 II: " + "&e%",
            "&6⨳ 等级 III: " + "&e%",
            "&6⨳ 等级 IV: " + "&e%",
            "&c◢◤◢◤◢◤◢◤◢◤◢&6◣◥◣◥◣◥◣◥◣◥◣",
            "",
            "&d拖放工具以绑定此 gem"
    );

    public static final SlimefunItemStack FN_GEM_THORN_AWAY = new SlimefunItemStack(
            "FN_GEM_THORN_AWAY",
            Material.EMERALD,
            "&c抗荆棘宝石",
            "",
            "&e有机会抵消所有荆棘伤害",
            "",
            "&c◢◤◢◤◢◤ Tiers &6◥◣◥◣◥◣",
            "&6⨳ 等级 I: " + "&e%",
            "&6⨳ 等级 II: " + "&e%",
            "&6⨳ 等级 III: " + "&e%",
            "&6⨳ 等级 IV: " + "&e%",
            "&c◢◤◢◤◢◤◢◤◢◤◢&6◣◥◣◥◣◥◣◥◣◥◣",
            "",
            "&d在胸甲上拖放以绑定此宝石"
    );

    public static final SlimefunItemStack FN_GEM_IMPOSTOR = new SlimefunItemStack(
            "FN_GEM_IMPOSTOR",
            Material.EMERALD,
            "&c幽灵宝石",
            "",
            "&e有机会传送到击中你的玩家身后",
            "",
            "&c◢◤◢◤◢◤ Tiers &6◥◣◥◣◥◣",
            "&6⨳ 等级 I: " + "&e%",
            "&6⨳ 等级 II: " + "&e%",
            "&6⨳ 等级 III: " + "&e%",
            "&6⨳ 等级 IV: " + "&e%",
            "&c◢◤◢◤◢◤◢◤◢◤◢&6◣◥◣◥◣◥◣◥◣◥◣",
            "",
            "&d拖放到头盔上以绑定此宝石"
    );

    public static final SlimefunItemStack FN_GEM_PSYCHOKINESIS = new SlimefunItemStack(
            "FN_GEM_PSYCHOKINESIS",
            Material.EMERALD,
            "&c念动力宝石",
            "",
            "&e被你的箭击中时有机会将敌人移向你",
            "",
            "&c◢◤◢◤◢◤ Tiers &6◥◣◥◣◥◣",
            "&6⨳ 等级 I: " + "&e%",
            "&6⨳ 等级 II: " + "&e%",
            "&6⨳ 等级 III: " + "&e%",
            "&6⨳ 等级 IV: " + "&e%",
            "&c◢◤◢◤◢◤◢◤◢◤◢&6◣◥◣◥◣◥◣◥◣◥◣",
            "",
            "&d拖放到弓上以绑定此宝石"
    );

    public static final SlimefunItemStack FN_GEM_AXETHROWIE = new SlimefunItemStack(
            "FN_GEM_AXETHROWIE",
            Material.EMERALD,
            "&c飞斧宝石",
            "",
            "&e使您能够投掷可以击中实体",
            "&e并对其造成伤害的斧头",
            "",
            "&d释放至斧头上以绑定此宝石"
    );

    public static final SlimefunItemStack FN_GEM_TRI_SWORD = new SlimefunItemStack(
            "FN_GEM_TRI_SWORD",
            Material.EMERALD,
            "&c三剑宝石",
            "",
            "&e当你投掷你的剑时",
            "&e会有额外2把剑被投出",
            "&e可以切开实体并伤害它们",
            "",
            "&d释放至剑上以绑定此宝石"
    );

    public static final SlimefunItemStack FN_GEM_DAMNATION = new SlimefunItemStack(
            "FN_GEM_DAMNATION",
            Material.EMERALD,
            "&c撕裂宝石",
            "",
            "&eShift右击拥有此宝石的武器",
            "&e会在8秒后攻击十字准线方向的实体",
            "",
            "&d释放至剑或斧头上以绑定此宝石"
    );

    public static final SlimefunItemStack FN_GEM_RETALIATE = new SlimefunItemStack(
            "FN_GEM_RETALIATE",
            Material.EMERALD,
            "&c忠诚宝石",
            "",
            "&e允许你的武器在投掷并击中一个实体后返还给你",
            "&e在绑定该宝石之前",
            "&e武器必须绑定下列宝石中的任何一个:",
            "&e- 撕裂宝石",
            "&e- 三剑宝石",
            "&e- 飞斧宝石",
            "",
            "&d释放至剑或斧头上以绑定此宝石"
    );

    public static final SlimefunItemStack FN_GEM_BLINDBIND = new SlimefunItemStack(
            "FN_GEM_BLINDBIND",
            Material.EMERALD,
            "&c盲标宝石",
            "",
            "&e被你的箭击中时有机会致盲敌人4秒",
            "",
            "&c◢◤◢◤◢◤ Tiers &6◥◣◥◣◥◣",
            "&6⨳ 等级 I: " + "&e%",
            "&6⨳ 等级 II: " + "&e%",
            "&6⨳ 等级 III: " + "&e%",
            "&6⨳ 等级 IV: " + "&e%",
            "&c◢◤◢◤◢◤◢◤◢◤◢&6◣◥◣◥◣◥◣◥◣◥◣",
            "",
            "&d拖放到弓上以绑定此宝石"
    );

    public static final SlimefunItemStack FN_GEM_GUARDIAN = new SlimefunItemStack(
            "FN_GEM_GUARDIAN",
            Material.EMERALD,
            "&c守望宝石",
            "",
            "&e有机会产生一个为你战斗到死的守护者,当你被攻击时,",
            "&e必须穿上有这个宝石的盔甲，以使守护者保护你免受敌人的攻击.",
            "&f- 未装备的盔甲将移除任何活跃的守护者",
            "&f- 守护者不攻击其他守护者，只能攻击该守护者的拥有者",
            "",
            "&c◢◤◢◤◢◤ Tiers &6◥◣◥◣◥◣",
            "&6⨳ 等级 I: " + "&e%",
            "&6⨳ 等级 II: " + "&e%",
            "&6⨳ 等级 III: " + "&e%",
            "&6⨳ 等级 IV: " + "&e%",
            "&c◢◤◢◤◢◤◢◤◢◤◢&6◣◥◣◥◣◥◣◥◣◥◣",
            "",
            "&d在胸甲上拖放以绑定此宝石"
    );

    public static final SlimefunItemStack FN_GEM_DISRUPTED = new SlimefunItemStack(
            "FN_GEM_DISRUPTED",
            Material.EMERALD,
            "&c破碎的宝石",
            "",
            "&e有机会阻止你的敌方守护者生成",
            "",
            "&c◢◤◢◤◢◤ Tiers &6◥◣◥◣◥◣",
            "&6⨳ 等级 I: " + "&e%",
            "&6⨳ 等级 II: " + "&e%",
            "&6⨳ 等级 III: " + "&e%",
            "&6⨳ 等级 IV: " + "&e%",
            "&c◢◤◢◤◢◤◢◤◢◤◢&6◣◥◣◥◣◥◣◥◣◥◣",
            "",
            "&d拖放一把剑来绑定这个宝石"
    );

    public static final SlimefunItemStack FN_GEM_ARROW_AVERT = new SlimefunItemStack(
            "FN_GEM_ARROW_AVERT",
            Material.EMERALD,
            "&c箭避宝石",
            "",
            "&e有机会防止玩家射出的箭击中",
            "&e你当你被击中时箭不会受到伤害",
            "",
            "&c◢◤◢◤◢◤ Tiers &6◥◣◥◣◥◣",
            "&6⨳ 等级 I: " + "&e%",
            "&6⨳ 等级 II: " + "&e%",
            "&6⨳ 等级 III: " + "&e%",
            "&6⨳ 等级 IV: " + "&e%",
            "&c◢◤◢◤◢◤◢◤◢◤◢&6◣◥◣◥◣◥◣◥◣◥◣",
            "",
            "&d拖放任何盔甲类型以绑定此宝石"
    );

    public static final SlimefunItemStack FN_GEM_DEBERSERK = new SlimefunItemStack(
            "FN_GEM_DEBERSERK",
            Material.EMERALD,
            "&c德塞克宝石",
            "",
            "&e有机会减少30%受到的斧头伤害",
            "",
            "&c◢◤◢◤◢◤ Tiers &6◥◣◥◣◥◣",
            "&6⨳ 等级 I: " + "&e%",
            "&6⨳ 等级 II: " + "&e%",
            "&6⨳ 等级 III: " + "&e%",
            "&6⨳ 等级 IV: " + "&e%",
            "&c◢◤◢◤◢◤◢◤◢◤◢&6◣◥◣◥◣◥◣◥◣◥◣",
            "",
            "&d拖放任何盔甲类型以绑定此宝石"
    );

    public static final SlimefunItemStack FN_GEM_PARRY = new SlimefunItemStack(
            "FN_GEM_PARRY",
            Material.EMERALD,
            "&c招架宝石",
            "",
            "&e有几率减少受到剑的伤害 25%",
            "",
            "&c◢◤◢◤◢◤ Tiers &6◥◣◥◣◥◣",
            "&6⨳ 等级 I: " + "&e%",
            "&6⨳ 等级 II: " + "&e%",
            "&6⨳ 等级 III: " + "&e%",
            "&6⨳ 等级 IV: " + "&e%",
            "&c◢◤◢◤◢◤◢◤◢◤◢&6◣◥◣◥◣◥◣◥◣◥◣",
            "",
            "&d拖放任何盔甲类型以绑定此宝石"
    );

    public static final SlimefunItemStack FN_GEM_FLAWLESS_UNBIND = new SlimefunItemStack(
            "FN_GEM_FLAWLESS_UNBIND",
            Material.DIAMOND,
            "&b无瑕解绑宝石",
            "",
            "&e%几率从物品中移除任何选定的宝石",
            "",
            "&f&l操作说明",
            "&d右手: &c解绑宝石",
            "&d左手: &c武器/盔甲/工具",
            "&d行动: &c右键点击"
    );

    public static final SlimefunItemStack FN_GEM_PRECIOUS_UNBIND = new SlimefunItemStack(
            "FN_GEM_PRECIOUS_UNBIND",
            Material.DIAMOND,
            "&d珍贵的解开宝石",
            "",
            "&e%几率从物品中移除任何选定的宝石",
            "",
            "&f&l操作说明",
            "&d右手: &c解绑宝石",
            "&d左手: &c武器/盔甲/工具",
            "&d行动: &c右键点击"
    );

    public static final SlimefunItemStack FN_GEM_BLEMISHED_UNBIND = new SlimefunItemStack(
            "FN_GEM_BLEMISHED_UNBIND",
            Material.DIAMOND,
            "&a有瑕疵的解开宝石",
            "",
            "&e%几率从物品中移除任何选定的宝石",
            "",
            "&f&l操作说明",
            "&d右手: &c解绑宝石",
            "&d左手: &c武器/盔甲/工具",
            "&d行动: &c右键点击"
    );

    public static final SlimefunItemStack FN_GEM_DAMAGED_UNBIND = new SlimefunItemStack(
            "FN_GEM_DAMAGED_UNBIND",
            Material.DIAMOND,
            "&6损坏的解绑宝石",
            "",
            "&e%几率从物品中移除任何选定的宝石",
            "",
            "&f&l操作说明",
            "&d右手: &c解绑宝石",
            "&d左手: &c武器/盔甲/工具",
            "&d行动: &c右键点击"
    );

    public static final SlimefunItemStack FN_GEM_ADAMANTINE = new SlimefunItemStack(
            "FN_GEM_ADAMANTINE",
            Material.EMERALD,
            "&c精金宝石",
            "",
            "&e有机会防止武器或工具受到耐久度伤害",
            "",
            "&c◢◤◢◤◢◤ Tiers &6◥◣◥◣◥◣",
            "&6⨳ 等级 I: " + "&e%",
            "&6⨳ 等级 II: " + "&e%",
            "&6⨳ 等级 III: " + "&e%",
            "&6⨳ 等级 IV: " + "&e%",
            "&c◢◤◢◤◢◤◢◤◢◤◢&6◣◥◣◥◣◥◣◥◣◥◣",
            "",
            "&d拖放武器或工具以绑定此宝石"
    );

    public static final SlimefunItemStack FN_GEM_STOUT = new SlimefunItemStack(
            "FN_GEM_STOUT",
            Material.EMERALD,
            "&c粗壮的宝石",
            "",
            "&e有机会防止盔甲受到任何耐久伤害",
            "",
            "&c◢◤◢◤◢◤ Tiers &6◥◣◥◣◥◣",
            "&6⨳ 等级 I: " + "&e%",
            "&6⨳ 等级 II: " + "&e%",
            "&6⨳ 等级 III: " + "&e%",
            "&6⨳ 等级 IV: " + "&e%",
            "&c◢◤◢◤◢◤◢◤◢◤◢&6◣◥◣◥◣◥◣◥◣◥◣",
            "",
            "&d拖放任何盔甲类型以绑定此宝石"
    );

    public static final SlimefunItemStack FN_GEM_AWAKEN = new SlimefunItemStack(
            "FN_GEM_AWAKEN",
            Material.EMERALD,
            "&c觉醒宝石",
            "",
            "&e玩家在同一地点死亡时有机会立即复活",
            "",
            "&c◢◤◢◤◢◤ Tiers &6◥◣◥◣◥◣",
            "&6⨳ 等级 I: " + "&e%",
            "&6⨳ 等级 II: " + "&e%",
            "&6⨳ 等级 III: " + "&e%",
            "&6⨳ 等级 IV: " + "&e%",
            "&c◢◤◢◤◢◤◢◤◢◤◢&6◣◥◣◥◣◥◣◥◣◥◣",
            "",
            "&d拖放到头盔上以绑定此宝石"
    );

    public static final SlimefunItemStack FN_GEM_AVENGE = new SlimefunItemStack(
            "FN_GEM_AVENGE",
            Material.EMERALD,
            "&c复仇宝石",
            "",
            "&e玩家死亡时有机会在同",
            "&e一位置生成已启动的爬行者",
            "",
            "&c◢◤◢◤◢◤ Tiers &6◥◣◥◣◥◣",
            "&6⨳ 等级 I: " + "&e%",
            "&6⨳ 等级 II: " + "&e%",
            "&6⨳ 等级 III: " + "&e%",
            "&6⨳ 等级 IV: " + "&e%",
            "&c◢◤◢◤◢◤◢◤◢◤◢&6◣◥◣◥◣◥◣◥◣◥◣",
            "",
            "&d拖放到靴子上以绑定此宝石"
    );

    public static final SlimefunItemStack FN_GEM_ACHILLES_HEEL = new SlimefunItemStack(
            "FN_GEM_ACHILLES_HEEL",
            Material.EMERALD,
            "&c阿喀琉斯之踵宝石",
            "",
            "&e箭击中实体或玩家的",
            "&e致命弱点时有机会造成2倍伤害",
            "",
            "&c◢◤◢◤◢◤ Tiers &6◥◣◥◣◥◣",
            "&6⨳ 等级 I: " + "&e%",
            "&6⨳ 等级 II: " + "&e%",
            "&6⨳ 等级 III: " + "&e%",
            "&6⨳ 等级 IV: " + "&e%",
            "&c◢◤◢◤◢◤◢◤◢◤◢&6◣◥◣◥◣◥◣◥◣◥◣",
            "",
            "&d拖放到弓或弩上以绑定此宝石"
    );

    public static final SlimefunItemStack FN_GEM_DISARMOR = new SlimefunItemStack(
            "FN_GEM_DISARMOR",
            Material.EMERALD,
            "&c卸甲宝石",
            "",
            "&e有几率从你的敌人身上卸下一件随机盔甲",
            "",
            "&c◢◤◢◤◢◤ Tiers &6◥◣◥◣◥◣",
            "&6⨳ 等级 I: " + "&e%",
            "&6⨳ 等级 II: " + "&e%",
            "&6⨳ 等级 III: " + "&e%",
            "&6⨳ 等级 IV: " + "&e%",
            "&c◢◤◢◤◢◤◢◤◢◤◢&6◣◥◣◥◣◥◣◥◣◥◣",
            "",
            "&d拖放剑或斧头以绑定此宝石"
    );

    public static final SlimefunItemStack FN_GEM_DISARM = new SlimefunItemStack(
            "FN_GEM_DISARM",
            Material.EMERALD,
            "&cDisarm Gem",
            "",
            "&e有机会卸下敌人持有的武器",
            "",
            "&c◢◤◢◤◢◤ Tiers &6◥◣◥◣◥◣",
            "&6⨳ 等级 I: " + "&e%",
            "&6⨳ 等级 II: " + "&e%",
            "&6⨳ 等级 III: " + "&e%",
            "&6⨳ 等级 IV: " + "&e%",
            "&c◢◤◢◤◢◤◢◤◢◤◢&6◣◥◣◥◣◥◣◥◣◥◣",
            "",
            "&d拖放剑或斧头以绑定此宝石"
    );

    public static final SlimefunItemStack FN_GEM_SMOKE_CRIMINAL = new SlimefunItemStack(
            "FN_GEM_SMOKE_CRIMINAL",
            Material.EMERALD,
            "&c烟雾犯罪宝石",
            "",
            "&e当生命值低于30%且受到",
            "&e烟雾保护时,有几率在5秒内无敌",
            "",
            "&c◢◤◢◤◢◤ Tiers &6◥◣◥◣◥◣",
            "&6⨳ 等级 I: " + "&e%",
            "&6⨳ 等级 II: " + "&e%",
            "&6⨳ 等级 III: " + "&e%",
            "&6⨳ 等级 IV: " + "&e%",
            "&c◢◤◢◤◢◤◢◤◢◤◢&6◣◥◣◥◣◥◣◥◣◥◣",
            "",
            "&d拖放到靴子上以绑定此宝石"
    );

    public static final SlimefunItemStack FN_GEM_LIFESTEAL = new SlimefunItemStack(
            "FN_GEM_LIFESTEAL",
            Material.EMERALD,
            "&c吸血宝石",
            "",
            "&e只要你的生命值低于最大生命值,",
            "&e就有机会从敌人身上偷取1颗心",
            "",
            "&c◢◤◢◤◢◤ Tiers &6◥◣◥◣◥◣",
            "&6⨳ 等级 I: " + "&e%",
            "&6⨳ 等级 II: " + "&e%",
            "&6⨳ 等级 III: " + "&e%",
            "&6⨳ 等级 IV: " + "&e%",
            "&c◢◤◢◤◢◤◢◤◢◤◢&6◣◥◣◥◣◥◣◥◣◥◣",
            "",
            "&d拖放剑或斧头以绑定此宝石"
    );

    public static final SlimefunItemStack FN_GEM_ATROPHY = new SlimefunItemStack(
            "FN_GEM_ATROPHY",
            Material.EMERALD,
            "&c凋零宝石",
            "",
            "&e有几率对你的敌人造成持续4秒的凋零效果",
            "",
            "&c◢◤◢◤◢◤ Tiers &6◥◣◥◣◥◣",
            "&6⨳ 等级 I: " + "&e%",
            "&6  - Level 1 wither effect",
            "&6⨳ 等级 II: " + "&e%",
            "&6  - Level 2 wither effect",
            "&6⨳ 等级 III: " + "&e%",
            "&6  - Level 3 wither effect",
            "&6⨳ 等级 IV: " + "&e%",
            "&6  - Level 4 wither effect",
            "&c◢◤◢◤◢◤◢◤◢◤◢&6◣◥◣◥◣◥◣◥◣◥◣",
            "",
            "&d拖放剑或斧头以绑定此宝石"
    );

    public static final SlimefunItemStack FN_GEM_BANE = new SlimefunItemStack(
            "FN_GEM_BANE",
            Material.EMERALD,
            "&c毒药宝石",
            "",
            "&e有几率对你的敌人造成持续4秒的毒药效果",
            "",
            "&c◢◤◢◤◢◤ Tiers &6◥◣◥◣◥◣",
            "&6⨳ 等级 I: " + "&e%",
            "&6  - Level 1 poison effect",
            "&6⨳ 等级 II: " + "&e%",
            "&6  - Level 2 poison effect",
            "&6⨳ 等级 III: " + "&e%",
            "&6  - Level 3 poison effect",
            "&6⨳ 等级 IV: " + "&e%",
            "&6  - Level 4 poison effect",
            "&c◢◤◢◤◢◤◢◤◢◤◢&6◣◥◣◥◣◥◣◥◣◥◣",
            "",
            "&d拖放剑或斧头以绑定此宝石"
    );

    public static final SlimefunItemStack FN_GEM_SEDATE = new SlimefunItemStack(
            "FN_GEM_SEDATE",
            Material.EMERALD,
            "&c减速宝石",
            "",
            "&e有几率对你的敌人造成持续4秒的减速效果",
            "",
            "&c◢◤◢◤◢◤ Tiers &6◥◣◥◣◥◣",
            "&6⨳ 等级 I: " + "&e%",
            "&6  - Level 1 slow effect",
            "&6⨳ 等级 II: " + "&e%",
            "&6  - Level 2 slow effect",
            "&6⨳ 等级 III: " + "&e%",
            "&6  - Level 3 slow effect",
            "&6⨳ 等级 IV: " + "&e%",
            "&6  - Level 4 slow effect",
            "&c◢◤◢◤◢◤◢◤◢◤◢&6◣◥◣◥◣◥◣◥◣◥◣",
            "",
            "&d拖放剑或斧头以绑定此宝石"
    );

    public static final SlimefunItemStack FN_GEM_DECREPIT = new SlimefunItemStack(
            "FN_GEM_DECREPIT",
            Material.EMERALD,
            "&c虚弱宝石",
            "",
            "&e有机会对敌人造成持续4秒的虚弱效果",
            "",
            "&c◢◤◢◤◢◤ Tiers &6◥◣◥◣◥◣",
            "&6⨳ 等级 I: " + "&e%",
            "&6  - Level 1 weakness effect",
            "&6⨳ 等级 II: " + "&e%",
            "&6  - Level 2 weakness effect",
            "&6⨳ 等级 III: " + "&e%",
            "&6  - Level 3 weakness effect",
            "&6⨳ 等级 IV: " + "&e%",
            "&6  - Level 4 weakness effect",
            "&c◢◤◢◤◢◤◢◤◢◤◢&6◣◥◣◥◣◥◣◥◣◥◣",
            "",
            "&d拖放任何盔甲类型以绑定此宝石"
    );

    public static final SlimefunItemStack FN_GEM_DECEPTION = new SlimefunItemStack(
            "FN_GEM_DECEPTION",
            Material.EMERALD,
            "&c失明宝石",
            "",
            "&e有几率对你的敌人造成持续4秒的致盲效果",
            "",
            "&c◢◤◢◤◢◤ Tiers &6◥◣◥◣◥◣",
            "&6⨳ 等级 I: " + "&e%",
            "&6  - Level 1 blindness effect",
            "&6⨳ 等级 II: " + "&e%",
            "&6  - Level 2 blindness effect",
            "&6⨳ 等级 III: " + "&e%",
            "&6  - Level 3 blindness effect",
            "&6⨳ 等级 IV: " + "&e%",
            "&6  - Level 4 blindness effect",
            "&c◢◤◢◤◢◤◢◤◢◤◢&6◣◥◣◥◣◥◣◥◣◥◣",
            "",
            "&d拖放任何盔甲类型以绑定此宝石"
    );

    public static final SlimefunItemStack FN_GEM_CELERITY = new SlimefunItemStack(
            "FN_GEM_CELERITY",
            Material.EMERALD,
            "&c迅捷宝石",
            "",
            "&e有几率对你的敌人造成持续4秒的迅捷效果",
            "",
            "&c◢◤◢◤◢◤ Tiers &6◥◣◥◣◥◣",
            "&6⨳ 等级 I: " + "&e%",
            "&6  - Level 1 swiftness effect",
            "&6⨳ 等级 II: " + "&e%",
            "&6  - Level 2 swiftness effect",
            "&6⨳ 等级 III: " + "&e%",
            "&6  - Level 3 swiftness effect",
            "&6⨳ 等级 IV: " + "&e%",
            "&6  - Level 4 swiftness effect",
            "&c◢◤◢◤◢◤◢◤◢◤◢&6◣◥◣◥◣◥◣◥◣◥◣",
            "",
            "&d拖放任何盔甲类型以绑定此宝石"
    );

    public static final SlimefunItemStack FN_GEM_LOOT = new SlimefunItemStack(
            "FN_GEM_LOOT",
            Material.EMERALD,
            "&c战利品宝石",
            "",
            "&e有机会从你的敌人那里偷钱，价值4美元的货币. ",
            "&e制造，你的敌人赔钱!",
            "",
            "&c◢◤◢◤◢◤ Tiers &6◥◣◥◣◥◣",
            "&6⨳ 等级 I: " + "&e%",
            "&6⨳ 等级 II: " + "&e%",
            "&6⨳ 等级 III: " + "&e%",
            "&6⨳ 等级 IV: " + "&e%",
            "&c◢◤◢◤◢◤◢◤◢◤◢&6◣◥◣◥◣◥◣◥◣◥◣",
            "",
            "&d拖放剑或斧头以绑定此宝石"
    );

    public static final SlimefunItemStack FN_GEM_SHOCKWAVE = new SlimefunItemStack(
            "FN_GEM_SHOCKWAVE",
            Material.EMERALD,
            "&c冲击波宝石",
            "",
            "&e有几率对8格范围内的所有",
            "&e敌人造成冲击波伤害，并将其弹离地面!",
            "",
            "&c◢◤◢◤◢◤ Tiers &6◥◣◥◣◥◣",
            "&6⨳ 等级 I: " + "&e%",
            "&6  - Damage: &f3",
            "&6⨳ 等级 II: " + "&e%",
            "&6  - Damage: &f6",
            "&6⨳ 等级 III: " + "&e%",
            "&6  - Damage: &f9",
            "&6⨳ 等级 IV: " + "&e%",
            "&6  - Damage: &f12",
            "&c◢◤◢◤◢◤◢◤◢◤◢&6◣◥◣◥◣◥◣◥◣◥◣",
            "",
            "&d拖放任何盔甲类型，以绑定此宝石"
    );

    public static final SlimefunItemStack FN_GEM_UPGRADES_DISPLAY_ITEM = new SlimefunItemStack(
            "FN_GEM_UPGRADES_DISPLAY_ITEM",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("d3623521c8111ad29e9dcf7acc56085a9ab07da732d1518976aee61d0b3e3bd6")),
            "&bGem 等级 Upgrades",
            "",
            "&d单击此项目以了解如何",
            "&d升级宝石以及FN宝石",
            "&d升级器多块中需要什么配方"
    );

    public static final SlimefunItemStack FN_GEM_FINE_JASPER_CRAFTING = new SlimefunItemStack(
            "FN_GEM_FINE_JASPER_CRAFTING",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("aac15f6fcf2ce963ef4ca71f1a8685adb97eb769e1d11194cbbd2e964a88978c")),
            "&b优质碧玉宝石",
            "",
            "&f升级您从那时起一直使用",
            "&f的那些fn宝石所需的闪亮宝石"
    );

    public static final SlimefunItemStack FN_BLOCK_ROTATOR = new SlimefunItemStack(
            "FN_BLOCK_ROTATOR",
            Material.CLOCK,
            "&c方块换向器",
            "",
            "&d右击 翻转定向方块",
            "&f如陶土、锁链等",
            "",
            "&dShift右击 翻转平板/二等分方块",
            "&d如台阶、楼梯等"
    );

    public static final SlimefunItemStack FN_AUTO_LADDER = new SlimefunItemStack(
            "FN_AUTO_LADDER",
            Material.LADDER,
            "&cFN的自动梯",
            "",
            "&d自动从上到下放置梯子，",
            "&d最大距离为 8 个方块"
    );

    public static final SlimefunItemStack FN_ORIENT_PEARL = new SlimefunItemStack(
            "FN_ORIENT_PEARL",
            Material.ENDER_PEARL,
            "&cFN末影珍珠",
            "",
            "&d一个末影珍珠，可以传送",
            "&d玩家和骑乘的实体（马等）"
    );

    public static final SlimefunItemStack FN_JUKEBOX_I = new SlimefunItemStack(
            "FN_JUKEBOX_I",
            Material.JUKEBOX, "&5F&dN&b点&f唱&c机 &6I",
            "", "&e一种可存储/播放唱片的自动点唱机",
            "&e它可以循环播放整个光盘槽",
            "&e并在插入新盘后自动播放新盘",
            "",
            "&d槽数: &d&o3格",
            "",
            LoreBuilder.powerBuffer(512),
            LoreBuilder.powerPerSecond(3));

    public static final SlimefunItemStack FN_JUKEBOX_II = new SlimefunItemStack(
            "FN_JUKEBOX_II",
            Material.JUKEBOX, "&5F&dN&b点&f唱&c机 &6II",
            "", "&e一种可存储/播放唱片的自动点唱机",
            "&e它可以循环播放整个光盘槽",
            "&e并在插入新盘后自动播放新盘",
            "",
            "&d槽数: &d&o7格",
            "",
            LoreBuilder.powerBuffer(768),
            LoreBuilder.powerPerSecond(8));

    public static final SlimefunItemStack FN_JUKEBOX_III = new SlimefunItemStack(
            "FN_JUKEBOX_III",
            Material.JUKEBOX, "&5F&dN&b点&f唱&c机 &6III",
            "", "&e一种可存储/播放唱片的自动点唱机",
            "&e它可以循环播放整个光盘槽",
            "&e并在插入新盘后自动播放新盘",
            "",
            "&d槽数: &d&o12格",
            "",
            LoreBuilder.powerBuffer(1024),
            LoreBuilder.powerPerSecond(16));

}
