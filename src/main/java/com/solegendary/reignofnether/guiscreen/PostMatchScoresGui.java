package com.solegendary.reignofnether.guiscreen;

import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraftforge.client.gui.widget.ExtendedButton;

public class PostMatchScoresGui extends AbstractContainerScreen<PostMatchScoresGuiContainer> {
    ExtendedButton button = new ExtendedButton(16, 32, 160, 80, Component.literal("Press"), button1 -> {
        System.out.print("Your mother");
    });

    public PostMatchScoresGui(PostMatchScoresGuiContainer container, Inventory playerInventory, Component title) {
        super(container, playerInventory, title);

        this.titleLabelX = 10;
        this.inventoryLabelX = 10;
    }

    @Override
    protected void init() {
        super.init();

        this.addRenderableWidget(button);
    }

    @Override
    public void render(GuiGraphics pGuiGraphics, int pMouseX, int pMouseY, float pPartialTick) {
        super.render(pGuiGraphics, pMouseX, pMouseY, pPartialTick);

        button.renderWidget(pGuiGraphics, pMouseX, pMouseY, pPartialTick);
    }

    @Override
    protected void renderBg(GuiGraphics guiGraphics, float v, int i, int i1) {}
}
