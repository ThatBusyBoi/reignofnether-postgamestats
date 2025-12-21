package com.solegendary.reignofnether.guiscreen;

import com.solegendary.reignofnether.registrars.ContainerRegistrar;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuConstructor;
import net.minecraft.world.item.ItemStack;

public class PostMatchScoresGuiContainer extends AbstractContainerMenu {
    public static final Component TITLE = Component.literal("postmatchscoresgui_container");

    public PostMatchScoresGuiContainer(int containerId, Inventory playerInventory) {
        super(ContainerRegistrar.POSTMATCHSCORESGUI_CONTAINER.get(), containerId);
    }

    public static MenuConstructor getServerContainerProvider()
    {
        return (id, playerInventory, serverPlayer) -> new PostMatchScoresGuiContainer(id, playerInventory);
    }

    @Override
    public ItemStack quickMoveStack(Player player, int i) {
        return null;
    }

    @Override
    public boolean stillValid(Player player) {
        return false;
    }
}
