package net.xuwu.morematerials;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.xuwu.morematerials.block.ModBlocks;
import net.xuwu.morematerials.item.ModItems;

import static net.xuwu.morematerials.item.ModItems.ALEXANDRITE;
@Mod(MoreMaterials.MODID)
public class MoreMaterials {
    public static final String MODID = "mmt";

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    public static final RegistryObject<CreativeModeTab> MMT_TAB = CREATIVE_MODE_TABS.register(MODID,
            () -> CreativeModeTab.builder()
                    .withTabsBefore(CreativeModeTabs.COMBAT)
                    .title(Component.translatable("itemGroup.mmttab"))
                    .icon(() -> ALEXANDRITE.get().getDefaultInstance())
                    .displayItems((parameters, output) -> {
                        ModItems.ITEMS.getEntries().forEach(item -> output.accept(item.get().getDefaultInstance()));
                        ModBlocks.BLOCKS.getEntries().forEach(block -> output.accept(block.get()));
                    }).build());

    public MoreMaterials() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        CREATIVE_MODE_TABS.register(modEventBus);
    }
}
