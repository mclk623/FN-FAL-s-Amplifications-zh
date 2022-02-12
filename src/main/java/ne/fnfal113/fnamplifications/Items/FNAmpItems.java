package ne.fnfal113.fnamplifications.Items;

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

import ne.fnfal113.fnamplifications.ConfigValues.ReturnConfValue;
import ne.fnfal113.fnamplifications.FNAmplifications;
import ne.fnfal113.fnamplifications.PowerGenerators.PowahGenerator;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class FNAmpItems {

    private static final ReturnConfValue value = new ReturnConfValue();

    private FNAmpItems() {}

    private static final ItemStack STICK = new ItemStack(Material.STICK);

    private static final ItemStack ARMOR = new ItemStack(Material.NETHERITE_CHESTPLATE);

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

    public static final NestedItemGroup FN_ITEMS = new NestedItemGroup(
            new NamespacedKey(FNAmplifications.getInstance(), "FN_ITEMS"),
            new CustomItemStack(PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "115b670a704ba080a730acf246da64c413901644847edd671c3da9a97441ddc5")),
            "&e&lFN_FAL113's &b&l汉化作者西瓜"));

    public static final SubItemGroup POWER_GENERATORS = new SubItemGroup(
            new NamespacedKey(FNAmplifications.getInstance(), "POWER_GENERATORS"),
            FN_ITEMS,
            new CustomItemStack(PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "ecb316f7a227a8c59d58ae0dd6768fe4fa546d55b9cfdd56cfe40b6586d81c24")),
            "&eFN_FAL的功率扩展"));

    public static final SubItemGroup MATERIAL_GENERATORS = new SubItemGroup(
            new NamespacedKey(FNAmplifications.getInstance(), "MATERIAL_GENERATORS"),
            FN_ITEMS,
            new CustomItemStack(Material.EMERALD_BLOCK,
            "&eFN_FAL 的材质生成器"));

    public static final SubItemGroup SOLAR_GENERATORS = new SubItemGroup(
            new NamespacedKey(FNAmplifications.getInstance(), "SOLAR_GENERATORS"),
            FN_ITEMS,
            new CustomItemStack(PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "e7f4c00356d1addb85b45ba5352992d3ecc0c9d11feb9041482f8531fd27d014")),
            "&eFN_FAL 的太阳能发电机"));

    public static final SubItemGroup MACHINES = new SubItemGroup(
            new NamespacedKey(FNAmplifications.getInstance(), "MACHINERY"),
            FN_ITEMS,
            new CustomItemStack(PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "4a7d54ca45a398c364cebbffb5390ce5e0345e0c7bc5e863acabf57d1342c4bd")),
            "&eFN_FAL的机械"));

    public static final SubItemGroup ITEMS = new SubItemGroup(
            new NamespacedKey(FNAmplifications.getInstance(), "MACHINERY_ITEMS"),
            FN_ITEMS,
            new CustomItemStack(PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "8245a1c3e8d7c3d59d05e3634b04af4cbf8d11b70e2a40e2e6364386db49e737")),
            "&eFN_FAL 的机械物品"));

    public static final SubItemGroup MULTIBLOCK = new SubItemGroup(
            new NamespacedKey(FNAmplifications.getInstance(), "MULTIBLOCK"),
            FN_ITEMS,
            new CustomItemStack(PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "550c3306bb11522fec380ea248eb6a5b180f4a7ab8843d635d14d4a778d6351")),
            "&eFN_FAL 的多块"));

    public static final SubItemGroup METAL_SCRAP_RECIPES = new SubItemGroup(
            new NamespacedKey(FNAmplifications.getInstance(), "METAL_SCRAP_RECIPES"),
            FN_ITEMS,
            new CustomItemStack(PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "3ff0bee591e5f0000ef16f966b949adcb5c2f409a14ccfc5b91222fd925045db")),
            "&e金属废料食谱"));

    public static final SubItemGroup MYSTERY_STICKS = new SubItemGroup(
            new NamespacedKey(FNAmplifications.getInstance(), "MYSTERY_STICKS"),
            FN_ITEMS,
            new CustomItemStack(STICK,
                    "&eFN_FAL 的神秘 PVP/PVE 棒"));

    public static final SubItemGroup FN_GEARS = new SubItemGroup(
            new NamespacedKey(FNAmplifications.getInstance(), "FN_GEARS"),
            FN_ITEMS,
            new CustomItemStack(ARMOR,
                    "&eFN_FAL 的摩擦齿轮"));

    public static final SubItemGroup FN_STAFFS = new SubItemGroup(
            new NamespacedKey(FNAmplifications.getInstance(), "FN_STAFFS"),
            FN_ITEMS,
            new CustomItemStack(Material.BLAZE_ROD,
                    "&eFN_FAL 的法杖"));

    public static final SubItemGroup FN_MISC = new SubItemGroup(
            new NamespacedKey(FNAmplifications.getInstance(), "FN_MISC"),
            FN_ITEMS,
            new CustomItemStack(Material.CHEST,
                    "&eFN_FAL 的杂项"));

    public static final ItemGroup FN_AMPLIFICATIONS = new ItemGroup(
            new NamespacedKey(FNAmplifications.getInstance(), "FN_AMPLIFICATIONS"),
            new CustomItemStack(PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "115b670a704ba080a730acf246da64c413901644847edd671c3da9a97441ddc5")),
            "&e&lFN_FAL113's &b&lAmpli&c&lfications"));

    public static final SlimefunItemStack FN_XPANSION_POWER_R1 = new SlimefunItemStack(
            "FN_POWER_XPANSION_POWER_R1",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "33165e254de7863459343543f933481f0dcf8d4730a23433b9a7ff0d3ff79c5a")),
            "&d&lFN 电源扩展 R1",
            "&9这在晚上有效!",
            "&9放置并右键单击",
            "&9电源信息块",
            "",
            LoreBuilderDynamic.powerBuffer(PowahGenerator.FN_POWERGEN_RANK_I_STORAGE),
            LoreBuilderDynamic.powerPerTick(PowahGenerator.FN_POWERGEN_RANK_I_DAYRATE) + " (Day Rate)",
            LoreBuilderDynamic.powerPerTick(PowahGenerator.FN_POWERGEN_RANK_I_NIGHTRATE) + " (Night Rate)"
    );

    public static final SlimefunItemStack FN_XPANSION_POWER_R2 = new SlimefunItemStack(
            "FN_POWER_XPANSION_POWER_R2",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "5b78e55e3ea6b3682bd7cead43eb1c91b2527a81aa2894f095801f6ee47a3")),
            "&d&lFN 电源扩展 R2",
            "&9这在晚上有效!",
            "&9放置并右键单击",
            "&9电源信息块",
            "",
            LoreBuilderDynamic.powerBuffer(PowahGenerator.FN_POWERGEN_RANK_II_STORAGE),
            LoreBuilderDynamic.powerPerTick(PowahGenerator.FN_POWERGEN_RANK_II_DAYRATE) + " (Day Rate)",
            LoreBuilderDynamic.powerPerTick(PowahGenerator.FN_POWERGEN_RANK_II_NIGHTRATE) + " (Night Rate)"
    );

    public static final SlimefunItemStack FN_XPANSION_POWER_R3 = new SlimefunItemStack(
            "FN_POWER_XPANSION_POWER_R3",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "45ff60d863d1cf76742f275e2ac5749dd0a978a231d3c51e816132c75aef608a")),
            "&d&lFN 电源扩展 R3",
            "&9这在晚上有效!",
            "&9放置并右键单击",
            "&9电源信息块",
            "",
            LoreBuilderDynamic.powerBuffer(PowahGenerator.FN_POWERGEN_RANK_III_STORAGE),
            LoreBuilderDynamic.powerPerTick(PowahGenerator.FN_POWERGEN_RANK_III_DAYRATE) + " (Day Rate)",
            LoreBuilderDynamic.powerPerTick(PowahGenerator.FN_POWERGEN_RANK_III_NIGHTRATE) + " (Night Rate)"
    );

    public static final SlimefunItemStack FN_XPANSION_POWER_R4 = new SlimefunItemStack(
            "FN_POWER_XPANSION_POWER_R4",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "efc05af0e88c6fb10b4c8c8b81b7aa658e64649724cb73bb9bb0f25f28bd")),
            "&d&lFN Power Xpansion R4",
            "&9这在晚上有效!",
            "&9放置并右键单击",
            "&9电源信息块",
            "",
            LoreBuilderDynamic.powerBuffer(PowahGenerator.FN_POWERGEN_RANK_IV_STORAGE),
            LoreBuilderDynamic.powerPerTick(PowahGenerator.FN_POWERGEN_RANK_IV_DAYRATE) + " (Day Rate)",
            LoreBuilderDynamic.powerPerTick(PowahGenerator.FN_POWERGEN_RANK_IV_NIGHTRATE) + " (Night Rate)"
    );

    public static final SlimefunItemStack FN_XPANSION_POWER_R5 = new SlimefunItemStack(
            "FN_POWER_XPANSION_POWER_R5",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "8f14f3179b86f69b3efa7472dacaeb2339f6290d2d817362793348abd98e021")),
            "&d&lFN Power Xpansion R5",
            "&9这在晚上有效!",
            "&9放置并右键单击",
            "&9电源信息块",
            "",
            LoreBuilderDynamic.powerBuffer(PowahGenerator.FN_POWERGEN_RANK_V_STORAGE),
            LoreBuilderDynamic.powerPerTick(PowahGenerator.FN_POWERGEN_RANK_V_DAYRATE) + " (Day Rate)",
            LoreBuilderDynamic.powerPerTick(PowahGenerator.FN_POWERGEN_RANK_V_NIGHTRATE) + " (Night Rate)"
    );

    public static final SlimefunItemStack FN_XPANSION_POWER_R6 = new SlimefunItemStack(
            "FN_POWER_XPANSION_POWER_R6",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "1d5a09884cb83ef5c908dddd385f246fefdee221712c010177f54376da238fdd")),
            "&d&lFN Power Xpansion R6",
            "&9这在晚上有效!",
            "",
            LoreBuilderDynamic.powerBuffer(PowahGenerator.FN_POWERGEN_RANK_VI_STORAGE),
            LoreBuilderDynamic.powerPerTick(PowahGenerator.FN_POWERGEN_RANK_VI_DAYRATE) + " (Day Rate)",
            LoreBuilderDynamic.powerPerTick(PowahGenerator.FN_POWERGEN_RANK_VI_NIGHTRATE) + " (Night Rate)"
    );

    public static final SlimefunItemStack FN_XPANSION_POWER_R7 = new SlimefunItemStack(
            "FN_POWER_XPANSION_POWER_R7",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "f7e541dfb4ba1f7dc28b548e347abbdc987ebe0e61c49fa87111ef1b2dcb2218")),
            "&d&lFN Power Xpansion R7",
            "&9这在晚上有效!",
            "&9放置并右键单击",
            "&9电源信息块",
            "",
            LoreBuilderDynamic.powerBuffer(PowahGenerator.FN_POWERGEN_RANK_VII_STORAGE),
            LoreBuilderDynamic.powerPerTick(PowahGenerator.FN_POWERGEN_RANK_VII_DAYRATE) + " (Day Rate)",
            LoreBuilderDynamic.powerPerTick(PowahGenerator.FN_POWERGEN_RANK_VII_NIGHTRATE) + " (Night Rate)"
    );

    public static final SlimefunItemStack FN_XPANSION_POWER_R8 = new SlimefunItemStack(
            "FN_POWER_XPANSION_POWER_R8",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "de31efefdd9551af8a4349d3d21e5ec8f37e53c801eb25b14279d6a89fe0c01e")),
            "&d&lFN Power Xpansion R8",
            "&9这在晚上有效!",
            "&9放置并右键单击",
            "&9电源信息块",
            "",
            LoreBuilderDynamic.powerBuffer(PowahGenerator.FN_POWERGEN_RANK_VIII_STORAGE),
            LoreBuilderDynamic.powerPerTick(PowahGenerator.FN_POWERGEN_RANK_VIII_DAYRATE) + " (Day Rate)",
            LoreBuilderDynamic.powerPerTick(PowahGenerator.FN_POWERGEN_RANK_VIII_NIGHTRATE) + " (Night Rate)"
    );

    public static final SlimefunItemStack FN_XPANSION_POWER_R9 = new SlimefunItemStack(
            "FN_POWER_XPANSION_POWER_R9",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "6db32b15d7f32704ed626fa52d06fb2b4071d336fdbfe61e6e41c669d6e37f47")),
            "&d&lFN Power Xpansion R9",
            "&9这在晚上有效!",
            "&9放置并右键单击",
            "&9电源信息块",
            "",
            LoreBuilderDynamic.powerBuffer(PowahGenerator.FN_POWERGEN_RANK_IX_STORAGE),
            LoreBuilderDynamic.powerPerTick(PowahGenerator.FN_POWERGEN_RANK_IX_DAYRATE) + " (Day Rate)",
            LoreBuilderDynamic.powerPerTick(PowahGenerator.FN_POWERGEN_RANK_IX_NIGHTRATE) + " (Night Rate)"
    );

    public static final SlimefunItemStack FN_XPANSION_POWER_R10 = new SlimefunItemStack(
            "FN_POWER_XPANSION_POWER_R10",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "56a7d2195ff7674bbb12e2f7578a2a63c54a980e64744450ac6656e05a790499")),
            "&d&lFN Power Xpansion R10",
            "&9这在晚上有效!",
            "&9放置并右键单击",
            "&9电源信息块",
            "",
            LoreBuilderDynamic.powerBuffer(PowahGenerator.FN_POWERGEN_RANK_X_STORAGE),
            LoreBuilderDynamic.powerPerTick(PowahGenerator.FN_POWERGEN_RANK_X_DAYRATE) + " (Day Rate)",
            LoreBuilderDynamic.powerPerTick(PowahGenerator.FN_POWERGEN_RANK_X_NIGHTRATE) + " (Night Rate)"
    );

    public static final SlimefunItemStack FN_XPANSION_POWER_R11 = new SlimefunItemStack(
            "FN_POWER_XPANSION_POWER_R11",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "7f9f356f5fe7d1bc92cddfaeba3ee773ac9df1cc4d1c2f8fe5f47013032c551d")),
            "&d&lFN Power Xpansion R11",
            "&9这在晚上有效!",
            "&9放置并右键单击",
            "&9电源信息块",
            "",
            LoreBuilderDynamic.powerBuffer(PowahGenerator.FN_POWERGEN_RANK_XI_STORAGE),
            LoreBuilderDynamic.powerPerTick(PowahGenerator.FN_POWERGEN_RANK_XI_DAYRATE) + " (Day Rate)",
            LoreBuilderDynamic.powerPerTick(PowahGenerator.FN_POWERGEN_RANK_XI_NIGHTRATE) + " (Night Rate)"
    );

    public static final SlimefunItemStack FN_XPANSION_POWER_R12 = new SlimefunItemStack(
            "FN_POWER_XPANSION_POWER_R12",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "3464874df452c1d717eddd0fb3b848202ad15571245af6fade2ecf514f3c80bb")),
            "&d&lFN Power Xpansion R12",
            "&9这在晚上有效!",
            "&9放置并右键单击",
            "&9电源信息块",
            "",
            LoreBuilderDynamic.powerBuffer(PowahGenerator.FN_POWERGEN_RANK_XII_STORAGE),
            LoreBuilderDynamic.powerPerTick(PowahGenerator.FN_POWERGEN_RANK_XII_DAYRATE) + " (Day Rate)",
            LoreBuilderDynamic.powerPerTick(PowahGenerator.FN_POWERGEN_RANK_XII_NIGHTRATE) + " (Night Rate)"
    );

    public static final SlimefunItemStack FMG_GENERATOR_MULTIBLOCK = new SlimefunItemStack(
            "FMG_GENERATOR_MULTIBLOCK",
            Material.BEDROCK,
            "&9生成器多块",
            "",
            "&d构建任何这个插件",
            "&d像这样的发电机.",
            "&a他们只会输出到放置在上方的箱子",
            "&a实际的发电机."
    );

    public static final SlimefunItemStack FMG_GENERATOR_CLAY_BROKEN = new SlimefunItemStack(
            "FMG_GENERATOR_CLAY_BROKEN",
            Material.CLAY,
            "&3FN_FAL的黏土发生器&8(坏掉)",
            "&8需要修理",
            "",
            "&5&oFN_Fal 的材质生成器"
    );

    public static SlimefunItemStack FMG_GENERATOR_FNFAL_CLAY = new SlimefunItemStack(
            "FMG_GENERATOR_FNFAL_CLAY",
            Material.CLAY,
            "&3FN_FAL 的粘土发生器",
            "&6以一定的速度生成粘土",
            "",
            "&5&oFN_Fal 的材质生成器"
    );

    public static final SlimefunItemStack FMG_GENERATOR_WARPED_BROKEN = new SlimefunItemStack(
            "FMG_GENERATOR_WARPED_BROKEN",
            Material.WARPED_NYLIUM,
            "&4FN_FAL 的扭曲尼龙发生器 &8(破损)",
            "&8需要修理",
            "",
            "&5&oFN_Fal 的材质生成器"
    );

    public static final SlimefunItemStack FMG_GENERATOR_FNFAL_WARPED1 = new SlimefunItemStack(
            "FMG_GENERATOR_FNFAL_WARPED1",
            Material.WARPED_NYLIUM,
            "&4FN_FAL 的扭曲尼龙发生器",
            "&6以一定的速度生成扭曲的 Nylium",
            "",
            "&5&oFN_Fal 的材质生成器"
    );

    public static final SlimefunItemStack FMG_GENERATOR_TERRACOTTA_BROKEN = new SlimefunItemStack(
            "FMG_GENERATOR_TERRACOTTA_BROKEN",
            Material.TERRACOTTA,
            "&4FN_FAL 的陶瓦发生器 &8(损坏)",
            "&8需要修理",
            "",
            "&5&oFN_Fal 的材质生成器"
    );

    public static final SlimefunItemStack FMG_GENERATOR_FNFAL_TERRACOTTA = new SlimefunItemStack(
            "FMG_GENERATOR_FNFAL_TERRACOTTA",
            Material.TERRACOTTA,
            "&4FN_FAL 的陶瓦发生器",
            "&6以一定的速度生成陶瓦",
            "",
            "&5&oFN_Fal 的材质生成器"
    );

    public static final SlimefunItemStack FMG_GENERATOR_BONE_BROKEN = new SlimefunItemStack(
            "FMG_GENERATOR_BONE_BROKEN",
            Material.BONE_BLOCK,
            "&fFN_FAL 的骨头生成器 &8(损坏)",
            "&8需要修理",
            "",
            "&5&oFN_Fal 的材质生成器"
    );

    public static final SlimefunItemStack FMG_GENERATOR_FNFAL_BONE = new SlimefunItemStack(
            "FMG_GENERATOR_FNFAL_BONE",
            Material.BONE_BLOCK,
            "&fFN_FAL 的骨头生成器",
            "&6以一定的速度生成骨头",
            "",
            "&5&oFN_Fal 的材质生成器"
    );

    public static final SlimefunItemStack FMG_GENERATOR_DIAMOND_BROKEN = new SlimefunItemStack(
            "FMG_GENERATOR_DIAMOND_BROKEN",
            Material.DIAMOND_BLOCK,
            "&bFN_FAL 的钻石生成器 &8(损坏)",
            "&8需要修理",
            "",
            "&5&oFN_Fal 的材质生成器"
    );

    public static final SlimefunItemStack FMG_GENERATOR_FNFAL_DIAMOND = new SlimefunItemStack(
            "FMG_GENERATOR_FNFAL_DIAMOND",
            Material.DIAMOND_BLOCK,
            "&bFN_FAL 的钻石生成器",
            "&6以一定的速度生成钻石",
            "",
            "&5&oFN_Fal 的材质生成器"
    );

    public static final SlimefunItemStack FMG_GENERATOR_EMERALD_BROKEN = new SlimefunItemStack(
            "FMG_GENERATOR_EMERALD_BROKEN",
            Material.EMERALD_BLOCK,
            "&aFN_FAL 的绿宝石生成器 &8(损坏)",
            "&8需要修理",
            "",
            "&5&oFN_Fal 的材质生成器"
    );

    public static final SlimefunItemStack FMG_GENERATOR_FNFAL_EMERALD = new SlimefunItemStack(
            "FMG_GENERATOR_FNFAL_EMERALD",
            Material.EMERALD_BLOCK,
            "&aFN_FAL 的绿宝石生成器",
            "&6以一定的速度生成绿宝石",
            "",
            "&5&oFN_Fal 的材质生成器"
    );

    public static final SlimefunItemStack FMG_GENERATOR_DIRT_BROKEN = new SlimefunItemStack(
            "FMG_GENERATOR_DIRT_BROKEN",
            Material.DIRT,
            "&fFN_FAL 的泥土生成器 &8(损坏)",
            "&8需要修理",
            "",
            "&5&oFN_Fal 的材质生成器"
    );

    public static final SlimefunItemStack FMG_GENERATOR_FNFAL_DIRT = new SlimefunItemStack(
            "FMG_GENERATOR_FNFAL_DIRT",
            Material.DIRT,
            "&fFN_FAL 的泥土生成器",
            "&6以一定的速度产生泥土",
            "",
            "&5&oFN_Fal 的材质生成器"
    );

    public static final SlimefunItemStack FMG_GENERATOR_HONEYCOMB_BROKEN = new SlimefunItemStack(
            "FMG_GENERATOR_HONEYCOMB_BROKEN",
            Material.HONEYCOMB_BLOCK,
            "&6FN_FAL 的蜂巢发生器 &8(损坏)",
            "&8需要修理",
            "",
            "&5&oFN_Fal 的材质生成器"
    );

    public static final SlimefunItemStack FMG_GENERATOR_FNFAL_HONEYCOMB = new SlimefunItemStack(
            "FMG_GENERATOR_FNFAL_HONEYCOMB",
            Material.HONEYCOMB_BLOCK,
            "&6FN_FAL 的蜂巢发生器",
            "&6以一定的速度生成蜂巢",
            "",
            "&5&oFN_Fal 的材质生成器"
    );

    public static final SlimefunItemStack FN_FAL_GENERATOR_TIER1 = new SlimefunItemStack(
            "FN_FAL_GENERATOR_TIER1",
            "6d2822cedb3abd579d6dfa2966c1433c3c36cb9732e2c23ec0cc81daedd4403b",
            "&dFN太阳能发电机 Tier I",
            "",
            "&e为需要电力的人准备的太阳能发电机",
            value.tier1Lore(),
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(value.tier1Buffer()),
            LoreBuilder.powerPerSecond(value.tier1Power() * 2) + " (Day)",
            LoreBuilder.powerPerSecond(value.tier1PowerNight() * 2) + " (Night)");

    public static final SlimefunItemStack FN_FAL_GENERATOR_TIER2 = new SlimefunItemStack(
            "FN_FAL_GENERATOR_TIER2",
            "35dd37f729fc88133e314a552204c0fa2c0168428b353f957bf15ff24b7707e0",
            "&dFN太阳能发电机 Tier II",
            "",
            "&e为需要电力的人准备的太阳能发电机",
            value.tier2Lore(),
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(value.tier2Buffer()),
            LoreBuilder.powerPerSecond(value.tier2Power() * 2) + " (Day)",
            LoreBuilder.powerPerSecond(value.tier2PowerNight() * 2) + " (Night)");

    public static final SlimefunItemStack FN_FAL_GENERATOR_TIER3 = new SlimefunItemStack(
            "FN_FAL_GENERATOR_TIER3",
            "25ddf6af2d6271d8fdfadbdc54faaad5a68d7b8ac20e163883fc38d76336ea6",
            "&dFN太阳能发电机 Tier III",
            "",
            "&e为需要电力的人准备的太阳能发电机",
            value.tier3Lore(),
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(value.tier3Buffer()),
            LoreBuilder.powerPerSecond(value.tier3Power() * 2) + " (Day)",
            LoreBuilder.powerPerSecond(value.tier3PowerNight() * 2) + " (Night)");

    public static final SlimefunItemStack FN_FAL_GENERATOR_TIER4 = new SlimefunItemStack(
            "FN_FAL_GENERATOR_TIER4",
            "e7f4c00356d1addb85b45ba5352992d3ecc0c9d11feb9041482f8531fd27d014",
            "&dFN太阳能发电机 Tier IV",
            "",
            "&e为需要电力的人准备的太阳能发电机",
            value.tier4Lore(),
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(value.tier4Buffer()),
            LoreBuilder.powerPerSecond(value.tier4Power() * 2) + " (Day)",
            LoreBuilder.powerPerSecond(value.tier4PowerNight() * 2) + " (Night)");

    public static final SlimefunItemStack FN_FAL_GENERATOR_TIER5 = new SlimefunItemStack(
            "FN_FAL_GENERATOR_TIER5",
            "afdd9e588d2461d2d3d058cb3e0af2b3a3367607aa14d124ed92a833f25fb112",
            "&dFN太阳能发电机 Tier V",
            "",
            "&e为需要电力的人准备的太阳能发电机",
            value.tier5Lore(),
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(value.tier5Buffer()),
            LoreBuilder.powerPerSecond(value.tier5Power() * 2) + " (Day)",
            LoreBuilder.powerPerSecond(value.tier5PowerNight() * 2) + " (Night)");

    public static final SlimefunItemStack FN_FAL_GENERATOR_TIER6 = new SlimefunItemStack(
            "FN_FAL_GENERATOR_TIER6",
            "224ad26209fa02f559ef6aa863ee9ba8f3bef0a02f1e9cff8fdc09196402fb6f",
            "&dFN太阳能发电机 Tier VI",
            "", "&e为需要电力的人准备的太阳能发电机",
            value.tier6Lore(),
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(value.tier6Buffer()),
            LoreBuilder.powerPerSecond(value.tier6Power() * 2) + " (Day)",
            LoreBuilder.powerPerSecond(value.tier6PowerNight() * 2) + " (Night)");

    public static final SlimefunItemStack FN_FAL_GENERATOR_TIER7 = new SlimefunItemStack(
            "FN_FAL_GENERATOR_TIER7",
            "c4fe135c311f7086edcc5e6dbc4ef4b23f819fddaa42f827dac46e3574de2287",
            "&dFN太阳能发电机 Tier VII",
            "", "&e为需要电力的人准备的太阳能发电机",
            value.tier7Lore(),
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(value.tier7Buffer()),
            LoreBuilder.powerPerSecond(value.tier7Power() * 2) + " (Day)",
            LoreBuilder.powerPerSecond(value.tier7PowerNight() * 2) + " (Night)");

    public static final SlimefunItemStack FN_FAL_GENERATOR_TIER8 = new SlimefunItemStack(
            "FN_FAL_GENERATOR_TIER8",
            "240775c3ad75763613f32f04986881bbe4eee4366d0c57f17f7c7514e2d0a77d",
            "&dFN太阳能发电机 Tier VIII",
            "", "&e为需要电力的人准备的太阳能发电机",
            value.tier8Lore(),
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(value.tier8Buffer()),
            LoreBuilder.powerPerSecond(value.tier8Power() * 2) + " (Day)",
            LoreBuilder.powerPerSecond(value.tier8PowerNight() * 2) + " (Night)");

    public static final SlimefunItemStack FN_FAL_TRANSFORMER_1 = new SlimefunItemStack(
            "FN_FAL_TRANSFORMER_1",
            Material.BLUE_GLAZED_TERRACOTTA,
            "&dFN 电力变压器 I",
            "", "&e可以变换各种物品的机械",
            "&e其他形式",
            "",
            "&d&oFN机械",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(1),
            LoreBuilder.powerPerSecond(256));

    public static final SlimefunItemStack FN_FAL_TRANSFORMER_2 = new SlimefunItemStack(
            "FN_FAL_TRANSFORMER_2",
            Material.BLUE_GLAZED_TERRACOTTA, "&dFN 电力变压器 II",
            "", "&e可以变换各种物品的机械",
            "&e其他形式",
            "",
            "&d&oFN机械",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(2),
            LoreBuilder.powerPerSecond(384));

    public static final SlimefunItemStack FN_FAL_TRANSFORMER_3 = new SlimefunItemStack(
            "FN_FAL_TRANSFORMER_3",
            Material.BLUE_GLAZED_TERRACOTTA, "&dFN 电力变压器 III",
            "", "&e可以变换各种物品的机械",
            "&e其他形式",
            "",
            "&d&oFN机械",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(4),
            LoreBuilder.powerPerSecond(768));

    public static final SlimefunItemStack FN_FAL_COMPRESSOR_1 = new SlimefunItemStack(
            "FN_FAL_COMPRESSOR_1",
            Material.GREEN_GLAZED_TERRACOTTA, "&dFN电动压缩机 I",
            "", "&e一种可以将物品压缩到",
            "&e形成一个生物项目",
            "",
            "&d&oFN机械",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(1),
            LoreBuilder.powerPerSecond(128));

    public static final SlimefunItemStack FN_FAL_COMPRESSOR_2 = new SlimefunItemStack(
            "FN_FAL_COMPRESSOR_2",
            Material.GREEN_GLAZED_TERRACOTTA, "&dFN电动压缩机 II",
            "", "&e一种可以将物品压缩到",
            "&e形成一个生物项目",
            "",
            "&d&oFN机械",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(2),
            LoreBuilder.powerPerSecond(256));

    public static final SlimefunItemStack FN_FAL_COMPRESSOR_3 = new SlimefunItemStack(
            "FN_FAL_COMPRESSOR_3",
            Material.GREEN_GLAZED_TERRACOTTA, "&dFN电动压缩机 III",
            "", "&e一种可以将物品压缩到",
            "&e形成一个生物项目",
            "",
            "&d&oFN机械",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(4),
            LoreBuilder.powerPerSecond(512));

    public static final SlimefunItemStack FN_FAL_CONDENSER_1 = new SlimefunItemStack(
            "FN_FAL_CONDENSER_1",
            Material.YELLOW_STAINED_GLASS, "&dFN电铸锭冷凝器 I",
            "", "&e一种可以将两个锭或物品凝结成",
            "&e一个生物锭",
            "",
            "&d&oFN机械",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(1),
            LoreBuilder.powerPerSecond(256));

    public static final SlimefunItemStack FN_FAL_CONDENSER_2 = new SlimefunItemStack(
            "FN_FAL_CONDENSER_2",
            Material.YELLOW_STAINED_GLASS, "&dFN电铸锭冷凝器 II",
            "", "&e一种可以将两个锭或物品凝结成",
            "&e一个生物锭",
            "",
            "&d&oFN机械",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(2),
            LoreBuilder.powerPerSecond(384));

    public static final SlimefunItemStack FN_FAL_CONDENSER_3 = new SlimefunItemStack(
            "FN_FAL_CONDENSER_3",
            Material.YELLOW_STAINED_GLASS, "&dFN电铸锭冷凝器 III",
            "", "&e一种可以将两个锭或物品凝结成",
            "&e一个生物锭",
            "",
            "&d&oFN机械",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(4),
            LoreBuilder.powerPerSecond(768));

    public static final SlimefunItemStack FN_FAL_RECYCLER_1 = new SlimefunItemStack(
            "FN_FAL_RECYCLER_1",
            Material.PURPLE_STAINED_GLASS, "&dFN 电动回收机 I",
            "", "&e一种可以回收物品的机器",
            "&e以较低的形式",
            "",
            "&d&oFN机械",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(1),
            LoreBuilder.powerPerSecond(168));

    public static final SlimefunItemStack FN_FAL_RECYCLER_2 = new SlimefunItemStack(
            "FN_FAL_RECYCLER_2",
            Material.PURPLE_STAINED_GLASS, "&dFN 电动回收机 II",
            "", "&e一种可以回收物品的机器",
            "&e以较低的形式",
            "",
            "&d&oFN机械",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(2),
            LoreBuilder.powerPerSecond(336));

    public static final SlimefunItemStack FN_FAL_RECYCLER_3 = new SlimefunItemStack(
            "FN_FAL_RECYCLER_3",
            Material.PURPLE_STAINED_GLASS, "&d电动回收机 III",
            "", "&e一种可以回收物品的机器",
            "&e以较低的形式",
            "",
            "&d&oFN机械",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(2),
            LoreBuilder.powerPerSecond(672));

    public static final SlimefunItemStack FN_FAL_DOWNGRADER = new SlimefunItemStack(
            "FN_FAL_DOWNGRADER",
            Material.WHITE_GLAZED_TERRACOTTA, "&d电机降级电机降级",
            "", "&e可以降级SF机器的机器",
            "&e用于错误制作的层级机器的好机器",
            "",
            "&d&oFN机械",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(4),
            LoreBuilder.powerPerSecond(1500));

    public static final SlimefunItemStack MACHINE_PART = new SlimefunItemStack(
            "FN_MACHINERY_MACHINE_PART",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("6ddd4a12da1cc2c9f9d6cd49fc778e3a11f3757de6dd312d70a0d47885189c0")),
            "&d机器零件",
            "&f必不可少的部分 FN机械",
            "",
            "&d&oFN机械物品");

    public static final SlimefunItemStack MACHINE_PART_SCRAP = new SlimefunItemStack(
            "FN_MACHINERY_MACHINE_PART_SCRAP",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("6ddd4a12da1cc2c9f9d6cd49fc778e3a11f3757de6dd312d70a0d47885189c0")),
            "&d机器零件",
            "&f使用金属废料制作");

    public static final SlimefunItemStack COMPONENT_PART = new SlimefunItemStack(
            "FN_MACHINERY_COMPONENT_PART",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("74657e89167b17ed581e87ce4215ce8d47145ab34038202d5ccefb0a9bd0d8f4")),
            "&d组成部分",
            "&f必不可少的部分 FN机械",
            "",
            "&d&oFN机械 Items");

    public static final SlimefunItemStack COMPONENT_PART_SCRAP = new SlimefunItemStack(
            "FN_MACHINERY_COMPONENT_PART_SCRAP",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("74657e89167b17ed581e87ce4215ce8d47145ab34038202d5ccefb0a9bd0d8f4")),
            "&d组成部分",
            "&f使用金属废料制作");

    public static final SlimefunItemStack MOTOR_SWITCH = new SlimefunItemStack(
            "FN_MACHINERY_MOTOR_SWITCH",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("48748ce96cedbfecaa463966d8fb1ac83c408feea89bd60d76d6024d3befe")),
            "&d电机开关",
            "&f必不可少的部分 FN机械",
            "",
            "&d&oFN机械 Items");

    public static final SlimefunItemStack MOTOR_SWITCH_SCRAP = new SlimefunItemStack(
            "FN_MACHINERY_MOTOR_SWITCH_SCRAP",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("48748ce96cedbfecaa463966d8fb1ac83c408feea89bd60d76d6024d3befe")),
            "&d电机开关",
            "&f使用金属废料制作");

    public static final SlimefunItemStack POWER_COMPONENT = new SlimefunItemStack(
            "FN_MACHINERY_POWER_COMPONENT",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("25ba8456e92f0790222c19c06f61180a195af1008569ed352b93a3c6d9ec7a98")),
            "&dPower Component",
            "&f必不可少的部分 FN机械"
            , "&f和 Power Xpansion",
            "",
            "&d&oFN机械 Items");

    public static final SlimefunItemStack POWER_COMPONENT_SCRAP = new SlimefunItemStack(
            "FN_MACHINERY_POWER_COMPONENT_SCRAP",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("25ba8456e92f0790222c19c06f61180a195af1008569ed352b93a3c6d9ec7a98")),
            "&dPower Component",
            "&f使用金属废料制作");

    public static final SlimefunItemStack GEAR_PART = new SlimefunItemStack(
            "FN_MACHINERY_GEAR_PART",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("faf0c95ceba34c7fe6d33404feb87b4184ccce143978622c1647feaed2b63274")),
            "&d齿轮零件",
            "&f必不可少的部分 FN机械"
            , "&f和 Power Xpansion",
            "",
            "&d&oFN机械 Items");

    public static final SlimefunItemStack GEAR_PART_SCRAP = new SlimefunItemStack(
            "FN_MACHINERY_GEAR_PART_SCRAP",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("faf0c95ceba34c7fe6d33404feb87b4184ccce143978622c1647feaed2b63274")),
            "&d齿轮零件",
            "&f使用金属废料制作");

    public static final SlimefunItemStack THREAD_PART = new SlimefunItemStack(
            "FN_MACHINERY_THREAD_PART",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("87ec65d6649ac1bf7b282575cef299f8601e51d8418d6e546e4fc71b218f7")),
            "&d螺纹部分",
            "&f必不可少的部分 FN机械",
            "",
            "&d&oFN机械 Items");

    public static final SlimefunItemStack THREAD_PART_SCRAP = new SlimefunItemStack(
            "FN_MACHINERY_THREAD_PART_SCRAP",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("87ec65d6649ac1bf7b282575cef299f8601e51d8418d6e546e4fc71b218f7")),
            "&d螺纹部分",
            "&f使用金属废料制作");

    public static final SlimefunItemStack COMPRESSOR_PART = new SlimefunItemStack(
            "FN_MACHINERY_COMPRESSOR_PART",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("e48337f7ede15c3b2f8dc6a63bd92874cdf74ec862b4118c7e35559ce8b4d")),
            "&d压缩机部分",
            "&f必不可少的部分 FN机械",
            "",
            "&d&oFN机械 Items");

    public static final SlimefunItemStack CONDENSER_PART = new SlimefunItemStack(
            "FN_MACHINERY_CONDENSER_PART",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("63be652b2e1b93ed8e93b427de455d446582e6c8d929f8fc96ac488a8f7f53")),
            "&d冷凝器部分",
            "&f必不可少的部分 FN机械",
            "",
            "&d&oFN机械 Items");

    public static final SlimefunItemStack RECYCLER_PART = new SlimefunItemStack(
            "FN_MACHINERY_RECYCLER_PART",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("4817fc8e16b8e994efb908b71acd1d1352ca5aefa09fecc9339ebea450d83fb8")),
            "&d回收器部分",
            "&f必不可少的部分 FN机械",
            "",
            "&d&oFN机械 Items");

    public static final SlimefunItemStack DOWNGRADER_PART = new SlimefunItemStack(
            "FN_MACHINERY_DOWNGRADER_PART",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("a44c5ce2eb643f8671c667e8802c9317ad8cc6af680d4ef671d8c0c63277900a")),
            "&d降级部分",
            "&f必不可少的部分 FN机械",
            "",
            "&d&oFN机械 Items");

    public static final SlimefunItemStack FUNNEL_PART = new SlimefunItemStack(
            "FN_MACHINERY_FUNNEL_PART",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("bb2abd66939f4cb7257a88cf52fbc6fdceec1433ec2a6ef16d62e34f6238781")),
            "&d漏斗部分",
            "&f必不可少的部分 FN机械",
            "",
            "&d&oFN机械 Items");

    public static final SlimefunItemStack FUNNEL_PART_SCRAP = new SlimefunItemStack(
            "FN_MACHINERY_FUNNEL_PART_SCRAP",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("bb2abd66939f4cb7257a88cf52fbc6fdceec1433ec2a6ef16d62e34f6238781")),
            "&d漏斗部分",
            "&f使用金属废料制作");

    public static final SlimefunItemStack DIAMOND_PLATING = new SlimefunItemStack(
            "FN_MACHINERY_DIAMOND_PLATING",
            Material.LIGHT_BLUE_CARPET,
            "&d金刚石电镀",
            "&f必不可少的部分 FN机械"
            , "&f和 Power Xpansion",
            "",
            "&d&oFN机械 Items");

    public static final SlimefunItemStack ALUMINUM_PLATING = new SlimefunItemStack(
            "FN_MACHINERY_ALUMINUM_PLATING",
            Material.WHITE_CARPET,
            "&d镀铝",
            "&f必不可少的部分 FN机械"
            , "&f和 Power Xpansion",
            "",
            "&d&oFN机械 Items");

    public static final SlimefunItemStack GOLD_PLATING = new SlimefunItemStack(
            "FN_MACHINERY_GOLD_PLATING",
            Material.YELLOW_CARPET,
            "&d镀金",
            "&f必不可少的部分 FN机械"
            , "&f和 Power Xpansion",
            "",
            "&d&oFN机械 Items");

    public static final SlimefunItemStack BRASS_PLATING = new SlimefunItemStack(
            "FN_MACHINERY_BRASS_PLATING",
            Material.BROWN_CARPET,
            "&dBrass Plating",
            "&f必不可少的部分 FN机械"
            , "&f和 Power Xpansion",
            "",
            "&d&oFN机械 Items");

    public static final SlimefunItemStack REINFORCED_CASING = new SlimefunItemStack(
            "FN_MACHINERY_REINFORCED_CASING",
            Material.LIGHT_GRAY_CARPET,
            "&d加强套管",
            "&f必不可少的部分 FN机械"
            , "&f和 Power Xpansion",
            "",
            "&d&oFN机械 Items");

    public static final SlimefunItemStack BASIC_MACHINE_BLOCK = new SlimefunItemStack(
            "FN_MACHINERY_BASIC_MACHINE_BLOCK",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("883dd0f90df05fe6a09aaccaf54bc043e455e1c865bda1fd272e3f47fb9bb910")),
            "&d基本机器块",
            "&f必不可少的部分 FN机械"
            , "&f和 Power Xpansion",
            "",
            "&d&oFN机械 Items");

    public static final SlimefunItemStack HIGHTECH_MACHINE_BLOCK = new SlimefunItemStack(
            "FN_MACHINERY_HIGHTECH_MACHINE_BLOCK",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("5a7b3b16e5d0c4cfd21c4eb9133e969aad7cc7303ccdf317512e26a4879b51")),
            "&d高科技机器块",
            "&f必不可少的部分 FN机械"
            , "&f和 Power Xpansion",
            "",
            "&d&oFN机械 Items");

    public static final SlimefunItemStack FN_ASSEMBLY_STATION = new SlimefunItemStack(
            "FN_ASSEMBLY_STATION",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("583150f055935058634576185977ffba49ff4679faa03ad0008feaa0161865b3")),
            "&dFN组装站"
    );

    public static final SlimefunItemStack FN_SCRAP_RECYCLER = new SlimefunItemStack(
            "FN_SCRAP_RECYCLER",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("656634b556caf5382de65038a10e4d79c7c18695048599df74f9c67c1e1e8736")),
            "&dFN 废料回收商"
    );

    public static final SlimefunItemStack FN_METAL_SCRAPS = new SlimefunItemStack(
            "FN_METAL_SCRAPS",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("3ff0bee591e5f0000ef16f966b949adcb5c2f409a14ccfc5b91222fd925045db")),
            "&d金属废料",
            "&f降级机器的剩余物"
            , "&f可用于制作 FN 机械物品",
            "",
            "&d&oFN机械 Items"
    );

    public static final SlimefunItemStack FN_BLOCK_BREAKER_1 = new SlimefunItemStack(
            "FN_BLOCK_BREAKER_I",
            Material.DISPENSER,
            "&4电动断路器 I",
            "",
            "&6将方块放在前面",
            "&6分配器破裂",
            "&d(Vanilla)",
            "",
            "&eRate: " + value.blockBreaker1Ticks() + " ticks",
            "",
            "&d&oFN机械",
            LoreBuilder.machine(MachineTier.AVERAGE, MachineType.MACHINE),
            LoreBuilder.powerBuffer(512),
            LoreBuilderDynamic.powerPerTick(32)
    );

    public static final SlimefunItemStack FN_BLOCK_BREAKER_2 = new SlimefunItemStack(
            "FN_BLOCK_BREAKER_II",
            Material.DISPENSER,
            "&4电动断路器 II",
            "",
            "&6将方块放在前面",
            "&6分配器破裂",
            "&d(Vanilla)",
            "",
            "&e速率: " + value.blockBreaker2Ticks() + " 滴答声",
            "",
            "&d&oFN机械",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            LoreBuilder.powerBuffer(1024),
            LoreBuilderDynamic.powerPerTick(64)
    );

    public static final SlimefunItemStack FN_BLOCK_BREAKER_3 = new SlimefunItemStack(
            "FN_BLOCK_BREAKER_III",
            Material.DISPENSER,
            "&4电动断路器 III",
            "",
            "&6将方块放在前面",
            "&6分配器破裂",
            "&d(Vanilla)",
            "",
            "&e速率: " + value.blockBreaker3Ticks() + " 滴答声",
            "",
            "&d&oFN机械",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.powerBuffer(2048),
            LoreBuilderDynamic.powerPerTick(128)
    );

    public static final SlimefunItemStack FN_STICK = new SlimefunItemStack(
            "FN_MYSTERY_STICK_1",
            Material.STICK,
            "&c神秘棒",
            "&f我想知道这根棍子有什么作用"
    );


    public static final SlimefunItemStack FN_STICK_2 = new SlimefunItemStack(
            "FN_MYSTERY_STICK_2",
            Material.STICK,
            "&c神秘棒 II",
            "&f不管它是什么的另一根棍子"
    );

    public static final SlimefunItemStack FN_STICK_3 = new SlimefunItemStack(
            "FN_MYSTERY_STICK_3",
            Material.STICK,
            "&c神秘棒 III",
            "&f拿着这根棍子感觉很协调"
    );

    public static final SlimefunItemStack FN_STICK_4 = new SlimefunItemStack(
            "FN_MYSTERY_STICK_4",
            Material.STICK,
            "&c神秘棒 IV",
            "&f我以前用过这个还是没用过"
    );

    public static final SlimefunItemStack FN_STICK_5 = new SlimefunItemStack(
            "FN_MYSTERY_STICK_5",
            Material.STICK,
            "&c神秘棒 V",
            "&f我知道你厌倦了这种棍子"
    );

    public static final SlimefunItemStack FN_STICK_6 = new SlimefunItemStack(
            "FN_MYSTERY_STICK_6",
            Material.STICK,
            "&c神秘棒 VI",
            "&f愿力量和准确性与你同在"
    );

    public static final SlimefunItemStack FN_STICK_7 = new SlimefunItemStack(
            "FN_MYSTERY_STICK_7",
            Material.STICK,
            "&c神秘棒 VII",
            "&f这根棍子上的光环令人着迷"
    );

    public static final SlimefunItemStack FN_STICK_8 = new SlimefunItemStack(
            "FN_MYSTERY_STICK_8",
            Material.STICK,
            "&c神秘棒 VIII",
            "&f这棍子有点重"
    );

    public static final SlimefunItemStack FN_STICK_9 = new SlimefunItemStack(
            "FN_MYSTERY_STICK_9",
            Material.STICK,
            "&c神秘棒 IX",
            "&f使用这个时你需要更多的法力"
    );

    public static final SlimefunItemStack FN_STICK_10 = new SlimefunItemStack(
            "FN_MYSTERY_STICK_10",
            Material.STICK,
            "&c神秘棒 X",
            "&f致命或令人毛骨悚然的棍子"
    );

    public static final SlimefunItemStack FN_STICK_11 = new SlimefunItemStack(
            "FN_MYSTERY_STICK_11",
            Material.STICK,
            "&c神秘棒 XI",
            "&f北欧之杖"
    );

    public static final SlimefunItemStack FN_STICK_ALTAR = new SlimefunItemStack(
            "FN_STICK_ALTAR",
            Material.ENCHANTING_TABLE,
            "&dFN 神秘棒祭坛"
    );

    public static final SlimefunItemStack FN_GEAR_HELMET = new SlimefunItemStack(
            "FN_GEAR_HELMET",
            Material.NETHERITE_HELMET,
            "&cFN的战痕头盔",
            "&c◬◬◬◬◬◬| &d&lLore &6|◬◬◬◬◬◬",
            "",
            "&f以FN的名义戴上这个头盔，",
            "&f每场战斗都应该通过奖励属性和",
            "&f附魔使其变得更加强大",
            "",
            "&c◈◈◈◈◈◈| &d&l统计数据 &6|◈◈◈◈◈◈",
            ChatColor.YELLOW + "头盔等级: 0",
            ChatColor.YELLOW + "进步:",
            ChatColor.GRAY + "[" + "■■■■■■■■■■" + ChatColor.GRAY + "]"

    );

    public static final SlimefunItemStack FN_GEAR_CHESTPLATE = new SlimefunItemStack(
            "FN_GEAR_CHESTPLATE",
            Material.NETHERITE_CHESTPLATE,
            "&cFN的战痕胸甲",
            "&c◬◬◬◬◬◬| &d&lLore &6|◬◬◬◬◬◬",
            "",
            "&f过去的盔甲复活了",
            "&f再次。它变得更强大",
            "&f战争与冲突的时代",
            "",
            "&c◈◈◈◈◈◈| &d&l统计数据 &6|◈◈◈◈◈◈",
            ChatColor.YELLOW + "胸甲等级: 0",
            ChatColor.YELLOW + "进步:",
            ChatColor.GRAY + "[" + "■■■■■■■■■■" + ChatColor.GRAY + "]"

    );

    public static final SlimefunItemStack FN_GEAR_LEGGINGS = new SlimefunItemStack(
            "FN_GEAR_LEGGINGS",
            Material.NETHERITE_LEGGINGS,
            "&cFN's Chausses of Eminence",
            "&c◬◬◬◬◬◬| &d&lLore &6|◬◬◬◬◬◬",
            "",
            "&fFN在战争期间穿着的光荣紧身裤",
            "&f在每次战胜敌人时都获得荣耀",
            "&b上面机翻下面原文",
            "Glorious leggings worn by ",
            "FN during war and was",
            "glorified on every",
            "&c◈◈◈◈◈◈| &d&l统计数据 &6|◈◈◈◈◈◈",
            ChatColor.YELLOW + "Leggings等级: 0",
            ChatColor.YELLOW + "进步:",
            ChatColor.GRAY + "[" + "■■■■■■■■■■" + ChatColor.GRAY + "]"

    );

    public static final SlimefunItemStack FN_GEAR_BOOTS = new SlimefunItemStack(
            "FN_GEAR_BOOTS",
            Material.NETHERITE_BOOTS,
            "&cFN远征战靴的靴子",
            "&c◬◬◬◬◬◬| &d&lLore &6|◬◬◬◬◬◬",
            "",
            "&fFN军队的士兵只想",
            "&f拥有这双历史悠久的靴子，",
            "&f但它被隐藏在锡安人的手中",
            "",
            "&c◈◈◈◈◈◈| &d&l统计数据 &6|◈◈◈◈◈◈",
            ChatColor.YELLOW + "Boots Level: 0",
            ChatColor.YELLOW + "进步:",
            ChatColor.GRAY + "[" + "■■■■■■■■■■" + ChatColor.GRAY + "]"

    );

    public static final SlimefunItemStack FN_STAFF_TP = new SlimefunItemStack(
            "FN_STAFF_TP",
            Material.BLAZE_ROD,
            "&c传送法杖",
            "",
            "&d通过右键单击",
            "&d传送到目标块",
            "",
            "&e左键使用: " + value.staffOfTeleportation()
    );

    public static final SlimefunItemStack FN_STAFF_INVI = new SlimefunItemStack(
            "FN_STAFF_INVI",
            Material.BLAZE_ROD,
            "&c隐形法杖",
            "",
            "&d6秒隐形，即使你的",
            "&d盔甲和名字都被隐藏了",
            "",
            "&e左键使用: "  + value.staffOfInvisibility()
    );

    public static final SlimefunItemStack FN_STAFF_LOCOMOTION = new SlimefunItemStack(
            "FN_STAFF_LOCOMOTION",
            Material.BLAZE_ROD,
            "&c运动的工作人员",
            "",
            "&d通过右键单击选择和左键",
            "单击移动实体到目标位置",
            "",
            "&e左键使用: " + value.staffOfLocomotion()
    );

    public static final SlimefunItemStack FN_STAFF_HELLFIRE = new SlimefunItemStack(
            "FN_STAFF_HELLFIRE",
            Material.BLAZE_ROD,
            "&cStaff of Hellfire",
            "",
            "&d如果在半径内，",
            "&d8秒内实体会着火",
            "&d则生成一个效果云区域",
            "",
            "&e左键使用: " + value.staffOfHellFire()
    );

    public static final SlimefunItemStack FN_STAFF_DEEPFREEZE = new SlimefunItemStack(
            "FN_STAFF_DEEPFREEZE",
            Material.BLAZE_ROD,
            "&c冰冻法杖",
            "",
            "&d如果在半径内持续8秒，",
            "&d则在实体因冰冷而减速",
            "&d的区域生成效果云",
            "&d下面原文,上面机翻",
            "&dSpawn an area of effect cloud where",
            "&dentities are being slowed by the freezing",
            "&dcold if inside the radius for 8 seconds",
            "",
            "&e左键使用: " + value.staffOfDeepFreeze()
    );

    public static final SlimefunItemStack FN_STAFF_CONFUSION = new SlimefunItemStack(
            "FN_STAFF_CONFUSION",
            Material.BLAZE_ROD,
            "&c混乱法杖:Staff of Confusion",
            "",
            "&d如果在半径内8秒内",
            "&d实体会迷惑方向",
            "&d则生成一个效果云区域",
            "",
            "&e左键使用: " + value.staffOfConfusion()
    );

    public static final SlimefunItemStack FN_STAFF_GRAVITY = new SlimefunItemStack(
            "FN_STAFF_GRAVITY",
            Material.BLAZE_ROD,
            "&c引力法杖",
            "",
            "&d如果在半径内持续8秒,",
            "&d则在实体被重力拉动",
            "的区域生成效果云",
            "",
            "&e左键使用: " + value.staffOfGravity()
    );

    public static final SlimefunItemStack FN_STAFF_STALLION = new SlimefunItemStack(
            "FN_STAFF_STALLION",
            Material.BLAZE_ROD,
            "&cStaff of Stallion:种马之杖",
            "",
            "&d生成一匹骷髅马,可以骑乘直到乘客下马",
            "",
            "&e左键使用: " + value.staffOfStallion()
    );

    public static final SlimefunItemStack FN_STAFF_FORCE = new SlimefunItemStack(
            "FN_STAFF_FORCE",
            Material.BLAZE_ROD,
            "&c原力法杖",
            "",
            "&d右键单击产生一个效果云,",
            "&d提供向前推动的力或shift-right-click",
            "&d产生一个不同的效果云,提供一个向后的力",
            "",
            "&e左键使用: " + value.staffOfForce()
    );

    public static final SlimefunItemStack FN_STAFF_HEALING = new SlimefunItemStack(
            "FN_STAFF_HEALING",
            Material.BLAZE_ROD,
            "&c治疗法杖",
            "",
            "&d右键单击以产生一团效果云",
            "&d只有在范围内8秒内才会治疗施法者",
            "",
            "&e左键使用: " + value.staffOfHealing()
    );

    public static final SlimefunItemStack FN_STAFF_INVULNERABILITY = new SlimefunItemStack(
            "FN_STAFF_INVULNERABILITY",
            Material.BLAZE_ROD,
            "&c无敌法杖",
            "",
            "&d右键单击以产生一团效果云,",
            "&d保护范围内的实体免受伤害,持续 8 秒",
            "",
            "&e左键使用: " + value.staffOfInvulnerable()
    );

    public static final SlimefunItemStack FN_STAFF_EXPLOSION = new SlimefunItemStack(
            "FN_STAFF_EXPLOSION",
            Material.BLAZE_ROD,
            "&c爆炸法杖",
            "",
            "&dRight click a target block to",
            "&dyield an explosion causing damage",
            "",
            "&e左键使用: " + value.staffOfExplosion()
    );

    public static final SlimefunItemStack FN_STAFF_MUSTER = new SlimefunItemStack(
            "FN_STAFF_MUSTER",
            Material.BLAZE_ROD,
            "&c集结法杖",
            "",
            "&d右键单击目标方块以传送",
            "&d附近50方块半径内地面上的实体",
            "",
            "&e左键使用: " + value.staffOfMuster()
    );

    public static final SlimefunItemStack FN_STAFF_AWARENESS = new SlimefunItemStack(
            "FN_STAFF_AWARENESS",
            Material.BLAZE_ROD,
            "&cStaff of Awareness:意识的工作人员",
            "",
            "&d右键单击以接收有关50",
            "&d块半径附近最近玩家的信息",
            "",
            "&e左键使用: " + value.staffOfAwareness()
    );

    public static final SlimefunItemStack FN_STAFF_MINERALS = new SlimefunItemStack(
            "FN_STAFF_MINERALS",
            Material.BLAZE_ROD,
            "&c矿产法杖",
            "",
            "&d右键单击以接收使用",
            "&d法杖时等待的神话信息",
            "",
            "&e左键使用: " + value.staffOfMinerals()
    );

    public static final SlimefunItemStack FN_STAFF_FANGS = new SlimefunItemStack(
            "FN_STAFF_FANGS",
            Material.BLAZE_ROD,
            "&c獠牙法杖",
            "",
            "&d右键单击目标方块以生成",
            "&d对实体造成伤害的唤魔者尖牙",
            "",
            "&e左键使用: " + value.staffOfFangs()
    );

    public static final SlimefunItemStack FN_STAFF_SKULLS = new SlimefunItemStack(
            "FN_STAFF_SKULLS",
            Material.BLAZE_ROD,
            "&c骷髅法杖",
            "",
            "&d右键单击以发射",
            "&d凋灵骷髅射弹",
            "",
            "&eUses left: " + value.staffOfSkulls()
    );

    public static final SlimefunItemStack FN_STAFF_AIR_STRIDER = new SlimefunItemStack(
            "FN_STAFF_AIR_STRIDER",
            Material.BLAZE_ROD,
            "&cStaff of Air Strider",
            "",
            "&dRight click to gain the ability to",
            "&dwalk on the air for 10 seconds",
            "",
            "&eUses left: " + value.staffOfAirStrider()
    );

    public static final SlimefunItemStack FN_STAFF_COBWEB = new SlimefunItemStack(
            "FN_STAFF_COBWEB",
            Material.BLAZE_ROD,
            "&cStaff of Cobweb",
            "",
            "&dRight click a target block",
            "&dto spawn a wall of cobwebs",
            "",
            "&eUses left: " + value.staffOfCobWebs()
    );

    public static final SlimefunItemStack FN_QUIVER = new SlimefunItemStack(
            "FN_QUIVER",
            Material.LEATHER,
            "&bBow Quiver (Normal)",
            "",
            "&d存放在箭筒内",
            "&d通过右键单击箭头,&d或shift单击颤动以退出",
            "",
            "&e左/右键单击更改状态",
            "&eSize: 192 Arrows",
            "&eArrows: " + ChatColor.WHITE + "0"
    );

    public static final SlimefunItemStack FN_SPECTRAL_QUIVER = new SlimefunItemStack(
            "FN_SPECTRAL_QUIVER",
            Material.LEATHER,
            "&aBow Quiver (Spectral)",
            "",
            "&d存放在箭筒内 by",
            "&d右键单击光谱箭头或",
            "&d移动单击颤动以退出",
            "",
            "&e左/右键单击更改状态",
            "&eSize: 192 Spectral Arrows",
            "&eArrows: " + ChatColor.WHITE + "0"
    );

    public static final SlimefunItemStack FN_UPGRADED_QUIVER = new SlimefunItemStack(
            "FN_UPGRADED_QUIVER",
            Material.LEATHER,
            "&6升级弓箭袋 (普通的)",
            "",
            "&d存放在箭筒内",
            "&d通过右键单击箭头或",
            "&dshift 点击退出",
            "",
            "&e左/右键单击更改状态",
            "&e尺寸：288箭",
            "&eArrows: " + ChatColor.WHITE + "0"
    );

    public static final SlimefunItemStack FN_UPGRADED_SPECTRAL_QUIVER = new SlimefunItemStack(
            "FN_UPGRADED_SPECTRAL_QUIVER",
            Material.LEATHER,
            "&c升级弓箭袋 (Spectral)",
            "",
            "&d存放在箭筒内",
            "&d通过右键单击光谱箭头或",
            "&dshift 点击退出",
            "",
            "&e左/右键单击更改状态",
            "&e尺寸：288箭",
            "&eArrows: " + ChatColor.WHITE + "0"
    );

    public static final SlimefunItemStack FN_HOE_5X5 = new SlimefunItemStack(
            "FN_HOE_5X5",
            Material.DIAMOND_HOE,
            "&cFN's Hoe",
            "",
            "&dCan soil/till land and harvest",
            "&dcrops in a 5x5 square area"
    );

    public static final SlimefunItemStack FN_HOE_5X5_AUTO_PLANT = new SlimefunItemStack(
            "FN_HOE_5X5_AUTO_PLANT",
            Material.DIAMOND_HOE,
            "&cFN's Reseeding Hoe",
            "",
            "&dCan soil/till land and harvest",
            "&dcrops in a 5x5 square area",
            "",
            "&dAuto plants if the crops are",
            "&dharvested at maximum age"
    );

    public static final SlimefunItemStack FN_GEM_INFERNO = new SlimefunItemStack(
            "FN_GEM_INFERNO",
            Material.EMERALD,
            "&cInferno Gem",
            "",
            "&e" + value.infernoGem() +"&e% chance to set enemies in a",
            "&e7 block radius on fire",
            "",
            "&dDrag and drop on a sword",
            "&dto bind this gem"
    );

    public static final SlimefunItemStack FN_GEM_ARMOR_IMPAIR = new SlimefunItemStack(
            "FN_GEM_ARMOR_IMPAIR",
            Material.EMERALD,
            "&cArmor Impair Gem",
            "",
            "&e" + value.armorImpairGem() + "&e% chance to deal extra durability",
            "&edamage to all enemy armor at proc",
            "",
            "&dDrag and drop on a sword or axe",
            "&dto bind this gem"
    );

    public static final SlimefunItemStack FN_GEM_TELEPATHY = new SlimefunItemStack(
            "FN_GEM_TELEPATHY",
            Material.EMERALD,
            "&cTelepathy Gem",
            "",
            "&eAutomatically places blocks broken by",
            "&ethe tool in the player's inventory",
            "",
            "&dDrag and drop on a tool",
            "&dto bind this gem"
    );

    public static final SlimefunItemStack FN_GEM_THUNDER = new SlimefunItemStack(
            "FN_GEM_THUNDER",
            Material.EMERALD,
            "&cThunderbolt Gem",
            "",
            "&e" + value.thunderBoltGem() + "&e% chance to strike",
            "&elightning to enemies",
            "",
            "&dDrag and drop on a sword or axe",
            "&dto bind this gem"
    );

    public static final SlimefunItemStack FN_GEM_HASTY = new SlimefunItemStack(
            "FN_GEM_HASTY",
            Material.EMERALD,
            "&cHasty Gem",
            "",
            "&e" + value.hastyGem() +"&e% chance to receive 4 seconds",
            "&eof haste when mining ores",
            "",
            "&dDrag and drop on a tool",
            "&dto bind this gem"
    );

    public static final SlimefunItemStack FN_GEM_THORN_AWAY = new SlimefunItemStack(
            "FN_GEM_THORN_AWAY",
            Material.EMERALD,
            "&cThorn Away Gem",
            "",
            "&e" + value.thornAwayGem() +"&e% chance to negate",
            "&eall thorn damage",
            "",
            "&dDrag and drop on a chestplate",
            "&dto bind this gem"
    );

    public static final SlimefunItemStack FN_GEM_IMPOSTOR = new SlimefunItemStack(
            "FN_GEM_IMPOSTOR",
            Material.EMERALD,
            "&cImpostor Gem",
            "",
            "&e" + value.impostorGem() +"&e% chance to teleport behind",
            "&ethe player that is hitting you",
            "",
            "&dDrag and drop on a helmet",
            "&dto bind this gem"
    );

    public static final SlimefunItemStack FN_GEM_PSYCHOKINESIS = new SlimefunItemStack(
            "FN_GEM_PSYCHOKINESIS",
            Material.EMERALD,
            "&cPsychokinesis Gem",
            "",
            "&e" + value.psychoKinesisGem() +"&e% chance to move enemies towards",
            "&eyou when got hit by your arrow",
            "",
            "&dDrag and drop on a bow",
            "&dto bind this gem"
    );

    public static final SlimefunItemStack FN_GEM_AXETHROWIE = new SlimefunItemStack(
            "FN_GEM_AXETHROWIE",
            Material.EMERALD,
            "&cAxe throwie Gem",
            "",
            "&eGives you the ability to throw axes",
            "&ethat can hit entities and damage them",
            "",
            "&dDrag and drop on an axe",
            "&dto bind this gem"
    );

    public static final SlimefunItemStack FN_GEM_BLINDBIND = new SlimefunItemStack(
            "FN_GEM_BLINDBIND",
            Material.EMERALD,
            "&cBlind bind Gem",
            "",
            "&e" + value.blindBindGem() +"&e% chance to blind enemies for",
            "&e4 seconds when got hit by your arrow",
            "",
            "&dDrag and drop on a bow",
            "&dto bind this gem"
    );

}
