package com.solegendary.reignofnether.registrars;

import com.solegendary.reignofnether.ReignOfNether;
import com.solegendary.reignofnether.guiscreen.PostMatchScoresGuiContainer;
import com.solegendary.reignofnether.guiscreen.TopdownGuiContainer;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ContainerRegistrar {

    public static final DeferredRegister<MenuType<?>> CONTAINERS = DeferredRegister.create(ForgeRegistries.MENU_TYPES,
            ReignOfNether.MOD_ID);

    public static final RegistryObject<MenuType<TopdownGuiContainer>> TOPDOWNGUI_CONTAINER = CONTAINERS
            .register("topdowngui_container", () -> new MenuType<>(TopdownGuiContainer::new, FeatureFlagSet.of()));

    public static final RegistryObject<MenuType<PostMatchScoresGuiContainer>> POSTMATCHSCORESGUI_CONTAINER = CONTAINERS
            .register("postmatchscoresgui_container", () -> new MenuType<>(PostMatchScoresGuiContainer::new, FeatureFlags.DEFAULT_FLAGS));

    public static void init(FMLJavaModLoadingContext context) {
        CONTAINERS.register(context.getModEventBus());
    }
}
