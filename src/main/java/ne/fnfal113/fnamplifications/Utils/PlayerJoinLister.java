package ne.fnfal113.fnamplifications.Utils;

import ne.fnfal113.fnamplifications.ConfigValues.ReturnConfValue;
import ne.fnfal113.fnamplifications.FNAmplifications;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class PlayerJoinLister implements Listener {

    private final List<UUID> players = new ArrayList<>();

    private static final ReturnConfValue value = new ReturnConfValue();

    @EventHandler
    public void onFirstJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();

        if(!value.changelogEnable()){
            return;
        }

        if(players.contains(player.getUniqueId())){
           return;
        }

        players.add(player.getUniqueId());
        Bukkit.getScheduler().runTaskLater(FNAmplifications.getInstance(), () -> {
            for(String string : getChangelog()) {
                player.sendMessage(string);
            }
        }, 25L);

    }

    public String[] getChangelog(){
        return Utils.stringSequence(
                "||---------------------------------------------------||",
                Utils.colorTranslator("&e&lFN &c&lAmpli&b&lfications &r&e" + FNAmplifications.getInstance().getDescription().getVersion()),
                Utils.colorTranslator("&f变更日志"),
                "",
                Utils.colorTranslator("&d&l• &r&d添加了守护者宝石，产生一个实体，"),
                Utils.colorTranslator("  &d当你被敌人攻击时，它会保护你直到死亡"),
                Utils.colorTranslator("&d&l• &r&d更改了 R10 Generator 和 Compressor 部分的头部纹理"),
                Utils.colorTranslator("&d&l• &r&d修复了在受保护的声明和其他宝石中工作的霹雳宝石"),
                Utils.colorTranslator("&d&l• &r&d重写/重构了 Staffs 的代码"),
                Utils.colorTranslator("&d&l• &r&d代码清理和改进"),
                Utils.colorTranslator("&e-FN_FAL113"),
                "||---------------------------------------------------||"
        );
    }

}
