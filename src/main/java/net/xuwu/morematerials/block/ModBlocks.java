package net.xuwu.morematerials.block;

import java.util.function.Supplier;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.xuwu.morematerials.block.custom.BlockCharcoal;
import net.xuwu.morematerials.item.ModItems;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, "mmt");

    // 宝石块
    public static final RegistryObject<Block> ALEXANDRITE_BLOCK = registerBlock("alexandrite_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PURPLE).strength(5.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> AMBER_BLOCK = registerBlock("amber_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).strength(5.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> AMETRINE_BLOCK = registerBlock("ametrine_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).strength(5.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> AQUAMARINE_BLOCK = registerBlock("aquamarine_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLUE).strength(5.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> BISMUTH_BLOCK = registerBlock("bismuth_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY).strength(5.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> CITRINE_BLOCK = registerBlock("citrine_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).strength(5.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> GARNET_BLOCK = registerBlock("garnet_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).strength(5.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> JADE_BLOCK = registerBlock("jade_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GREEN).strength(5.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> KUNZITE_BLOCK = registerBlock("kunzite_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).strength(5.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> MOONSTONE_BLOCK = registerBlock("moonstone_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_BLUE).strength(5.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> OPAL_BLOCK = registerBlock("opal_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_MAGENTA).strength(5.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> PEARL_BLOCK = registerBlock("pearl_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY).strength(5.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> PERIDOT_BLOCK = registerBlock("peridot_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GREEN).strength(5.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> ROSE_QUARTZ_BLOCK = registerBlock("rose_quartz_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).strength(5.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> RUBY_BLOCK = registerBlock("ruby_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).strength(5.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> SAPPHIRE_BLOCK = registerBlock("sapphire_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLUE).strength(5.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> SPINEL_BLOCK = registerBlock("spinel_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).strength(5.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> SUNSTONE_BLOCK = registerBlock("sunstone_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).strength(5.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> TANZANITE_BLOCK = registerBlock("tanzanite_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_MAGENTA).strength(5.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> TOPAZ_BLOCK = registerBlock("topaz_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).strength(5.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> TOURMALINE_BLOCK = registerBlock("tourmaline_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).strength(5.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> TURQUOISE_BLOCK = registerBlock("turquoise_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_CYAN).strength(5.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> ULTRANIUM_GEM_BLOCK = registerBlock("ultranium_gem_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY).strength(5.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));

    // 特殊方块
    public static final RegistryObject<Block> AMETHYST_BLOCK = registerBlock("amethyst_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PURPLE).strength(5.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> SCRAP_BLOCK = registerBlock("scrap_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).strength(25.0F, 1200.0F).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> CHARCOAL_BLOCK = registerBlock("charcoal_block",
            () -> new BlockCharcoal(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_MAGENTA).strength(5.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.WOOD)));

    // 矿石
    public static final RegistryObject<Block> RUBY_ORE = registerBlock("ruby_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(3.0F, 3.0F).requiresCorrectToolForDrops().sound(SoundType.STONE), UniformInt.of(3, 7)));
    public static final RegistryObject<Block> SAPPHIRE_ORE = registerBlock("sapphire_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(3.0F, 3.0F).requiresCorrectToolForDrops().sound(SoundType.STONE), UniformInt.of(3, 7)));
    public static final RegistryObject<Block> TOPAZ_ORE = registerBlock("topaz_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(3.0F, 3.0F).requiresCorrectToolForDrops().sound(SoundType.STONE), UniformInt.of(3, 7)));
    public static final RegistryObject<Block> TURQUOISE_ORE = registerBlock("turquoise_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(3.0F, 3.0F).requiresCorrectToolForDrops().sound(SoundType.STONE), UniformInt.of(3, 7)));
    public static final RegistryObject<Block> PEARL_ORE = registerBlock("pearl_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.SAND).strength(2.0F, 3.0F).requiresCorrectToolForDrops().sound(SoundType.STONE), UniformInt.of(2, 5)));

    // 金属块
    public static final RegistryObject<Block> ALUMINUM_BLOCK = registerMetalBlock("aluminum_block");
    public static final RegistryObject<Block> BORON_BLOCK = registerMetalBlock("boron_block");
    public static final RegistryObject<Block> BRASS_BLOCK = registerMetalBlock("brass_block");
    public static final RegistryObject<Block> BRONZE_BLOCK = registerMetalBlock("bronze_block");
    public static final RegistryObject<Block> CHROMIUM_BLOCK = registerMetalBlock("chromium_block");
    public static final RegistryObject<Block> COBALT_BLOCK = registerMetalBlock("cobalt_block");
    public static final RegistryObject<Block> ECHO_BLOCK = registerMetalBlock("echo_block");
    public static final RegistryObject<Block> ELECTRUM_BLOCK = registerMetalBlock("electrum_block");
    public static final RegistryObject<Block> EUROPIUM_BLOCK = registerMetalBlock("europium_block");
    public static final RegistryObject<Block> INVAR_BLOCK = registerMetalBlock("invar_block");
    public static final RegistryObject<Block> IRIDIUM_BLOCK = registerMetalBlock("iridium_block");
    public static final RegistryObject<Block> LEAD_BLOCK = registerMetalBlock("lead_block");
    public static final RegistryObject<Block> MAGNESIUM_BLOCK = registerMetalBlock("magnesium_block");
    public static final RegistryObject<Block> NICKEL_BLOCK = registerMetalBlock("nickel_block");
    public static final RegistryObject<Block> OSMIUM_BLOCK = registerMetalBlock("osmium_block");
    public static final RegistryObject<Block> PALLADIUM_BLOCK = registerMetalBlock("palladium_block");
    public static final RegistryObject<Block> PLATINUM_BLOCK = registerMetalBlock("platinum_block");
    public static final RegistryObject<Block> RHODIUM_BLOCK = registerMetalBlock("rhodium_block");
    public static final RegistryObject<Block> SCANDIUM_BLOCK = registerMetalBlock("scandium_block");
    public static final RegistryObject<Block> SILICON_BLOCK = registerMetalBlock("silicon_block");
    public static final RegistryObject<Block> SILVER_BLOCK = registerMetalBlock("silver_block");
    public static final RegistryObject<Block> STEEL_BLOCK = registerMetalBlock("steel_block");
    public static final RegistryObject<Block> TELLURIUM_BLOCK = registerMetalBlock("tellurium_block");
    public static final RegistryObject<Block> THORIUM_BLOCK = registerMetalBlock("thorium_block");
    public static final RegistryObject<Block> THULIUM_BLOCK = registerMetalBlock("thulium_block");
    public static final RegistryObject<Block> TIN_BLOCK = registerMetalBlock("tin_block");
    public static final RegistryObject<Block> TITANIUM_BLOCK = registerMetalBlock("titanium_block");
    public static final RegistryObject<Block> URANIUM_BLOCK = registerMetalBlock("uranium_block");
    public static final RegistryObject<Block> YTTRIUM_BLOCK = registerMetalBlock("yttrium_block");
    public static final RegistryObject<Block> ZINC_BLOCK = registerMetalBlock("zinc_block");
    public static final RegistryObject<Block> ZIRCONIUM_BLOCK = registerMetalBlock("zirconium_block");
    public static final RegistryObject<Block> TUNGSTEN_BLOCK = registerMetalBlock("tungsten_block");

    // 高级方块
    public static final RegistryObject<Block> ABIDING_ALLOY_BLOCK = registerBlock("abiding_alloy_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_CYAN).strength(5.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final RegistryObject<Block> ACRIL_BLOCK = registerBlock("acril_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN).strength(5.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final RegistryObject<Block> ADAMANITE_BLOCK = registerBlock("adamanite_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).strength(5.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final RegistryObject<Block> CHALYBLUX_BLOCK = registerBlock("chalyblux_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY).strength(5.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final RegistryObject<Block> COSMOS_AURORA_BLOCK = registerBlock("cosmos_aurora_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_BLUE).strength(5.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final RegistryObject<Block> DARK_CRYOPLA_BLOCK = registerBlock("dark_cryopla_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).strength(5.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final RegistryObject<Block> ESTALT_BLOCK = registerBlock("estalt_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(5.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.GLASS)));
    public static final RegistryObject<Block> LUNIUM_NOVA_BLOCK = registerBlock("lunium_nova_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLUE).strength(5.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final RegistryObject<Block> MIDNIGHT_ABYSSAL_BLOCK = registerBlock("midnight_abyssal_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).strength(5.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final RegistryObject<Block> PLUMBUMANITE_BLOCK = registerBlock("plumbumanite_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GREEN).strength(5.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final RegistryObject<Block> SOLIMRITH_BLOCK = registerBlock("solimrith_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).strength(5.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final RegistryObject<Block> STARLIGHT_MYTHRIL_BLOCK = registerBlock("starlight_mythril_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).strength(5.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final RegistryObject<Block> VICULEAM_BLOCK = registerBlock("viculeam_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).strength(5.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final RegistryObject<Block> VOID_BLOCK = registerBlock("void_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_MAGENTA).strength(5.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final RegistryObject<Block> XELKIVE_BLOCK = registerBlock("xelkive_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY).strength(5.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final RegistryObject<Block> XEPRODA_BLOCK = registerBlock("xeproda_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_MAGENTA).strength(5.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final RegistryObject<Block> ZAPOLGIUM_BLOCK = registerBlock("zapolgium_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).strength(5.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final RegistryObject<Block> MYTHRIL_BLOCK = registerBlock("mythril_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GREEN).strength(5.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final RegistryObject<Block> FRIGIDITE_BLOCK = registerBlock("frigidite_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_CYAN).strength(5.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final RegistryObject<Block> NLATSTONE_BLOCK = registerBlock("nlatstone_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).strength(5.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final RegistryObject<Block> VIBRANITE_BLOCK = registerBlock("vibranite_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_MAGENTA).strength(5.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final RegistryObject<Block> THLANIUM_BLOCK = registerBlock("thlanium_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).strength(5.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final RegistryObject<Block> CELESLAR_BLOCK = registerBlock("celeslar_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).strength(5.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final RegistryObject<Block> STELLAR_BLOCK = registerBlock("stellar_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_CYAN).strength(5.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    // 原始矿石块
    public static final RegistryObject<Block> RAW_ACRIL_BLOCK = registerRawBlock("raw_acril_block");
    public static final RegistryObject<Block> RAW_ADAMANITE_BLOCK = registerRawBlock("raw_adamanite_block");
    public static final RegistryObject<Block> RAW_ALUMINUM_BLOCK = registerRawBlock("raw_aluminum_block");
    public static final RegistryObject<Block> RAW_BORON_BLOCK = registerRawBlock("raw_boron_block");
    public static final RegistryObject<Block> RAW_COBALT_BLOCK = registerRawBlock("raw_cobalt_block");
    public static final RegistryObject<Block> RAW_DARK_CRYOPLA_BLOCK = registerRawBlock("raw_dark_cryopla_block");
    public static final RegistryObject<Block> RAW_EUROPIUM_BLOCK = registerRawBlock("raw_europium_block");
    public static final RegistryObject<Block> RAW_LEAD_BLOCK = registerRawBlock("raw_lead_block");
    public static final RegistryObject<Block> RAW_LUNIUM_NOVA_BLOCK = registerRawBlock("raw_lunium_nova_block");
    public static final RegistryObject<Block> RAW_MIDNIGHT_ABYSSAL_BLOCK = registerRawBlock("raw_midnight_abyssal_block");
    public static final RegistryObject<Block> RAW_MYTHRIL_BLOCK = registerRawBlock("raw_mythril_block");
    public static final RegistryObject<Block> RAW_NICKEL_BLOCK = registerRawBlock("raw_nickel_block");
    public static final RegistryObject<Block> RAW_OSMIUM_BLOCK = registerRawBlock("raw_osmium_block");
    public static final RegistryObject<Block> RAW_PALLADIUM_BLOCK = registerRawBlock("raw_palladium_block");
    public static final RegistryObject<Block> RAW_PLATINUM_BLOCK = registerRawBlock("raw_platinum_block");
    public static final RegistryObject<Block> RAW_RHODIUM_BLOCK = registerRawBlock("raw_rhodium_block");
    public static final RegistryObject<Block> RAW_SCANDIUM_BLOCK = registerRawBlock("raw_scandium_block");
    public static final RegistryObject<Block> RAW_SILVER_BLOCK = registerRawBlock("raw_silver_block");
    public static final RegistryObject<Block> RAW_STELLAR_BLOCK = registerRawBlock("raw_stellar_block");
    public static final RegistryObject<Block> RAW_TELLURIUM_BLOCK = registerRawBlock("raw_tellurium_block");
    public static final RegistryObject<Block> RAW_THORIUM_BLOCK = registerRawBlock("raw_thorium_block");
    public static final RegistryObject<Block> RAW_TIN_BLOCK = registerRawBlock("raw_tin_block");
    public static final RegistryObject<Block> RAW_TITANIUM_BLOCK = registerRawBlock("raw_titanium_block");
    public static final RegistryObject<Block> RAW_TUNGSTEN_BLOCK = registerRawBlock("raw_tungsten_block");
    public static final RegistryObject<Block> RAW_URANIUM_BLOCK = registerRawBlock("raw_uranium_block");
    public static final RegistryObject<Block> RAW_VOID_BLOCK = registerRawBlock("raw_void_block");
    public static final RegistryObject<Block> RAW_XELKIVE_BLOCK = registerRawBlock("raw_xelkive_block");
    public static final RegistryObject<Block> RAW_YTTRIUM_BLOCK = registerRawBlock("raw_yttrium_block");
    public static final RegistryObject<Block> RAW_ZINC_BLOCK = registerRawBlock("raw_zinc_block");
    public static final RegistryObject<Block> RAW_ZIRCONIUM_BLOCK = registerRawBlock("raw_zirconium_block");

    // 石头类方块
    public static final RegistryObject<Block> SCORIA = registerBlock("scoria",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.NETHER).strength(5.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.BASALT)));
    public static final RegistryObject<Block> CRISTINITE = registerBlock("cristinite",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.NETHER).strength(5.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.BASALT)));
    public static final RegistryObject<Block> LIMESTONE = registerBlock("limestone",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(5.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> SLATE = registerBlock("slate",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(5.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> MARBLE = registerBlock("marble",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.QUARTZ).strength(5.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> SILT = registerBlock("silt",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.SAND).strength(5.0F, 6.0F).sound(SoundType.SAND)));
    public static final RegistryObject<Block> SLUSH = registerBlock("slush",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.ICE).strength(5.0F, 6.0F).sound(SoundType.SNOW)));

    public static final RegistryObject<Block> RAW_NETHERITE_BLOCK = registerBlock("raw_netherite_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.NETHER).strength(25.0F, 1200.0F).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));

    // ====================== 注册方法（已删除 Tab 参数）======================
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static RegistryObject<Block> registerMetalBlock(String name) {
        return registerBlock(name,
                () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.METAL).strength(5.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    }

    private static RegistryObject<Block> registerRawBlock(String name) {
        return registerBlock(name,
                () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(5.0F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}