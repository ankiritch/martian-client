package net.fabricmc.ankir.gui;

import io.github.cottonmc.cotton.gui.client.ScreenDrawing;
import io.github.cottonmc.cotton.gui.widget.WWidget;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class CustomGuiText extends WWidget {
    private static final Identifier TEXTURE = new Identifier("mars", "textures/gui/my_widget.png");

    @Override
    @Environment(EnvType.CLIENT)
    public void paint(MatrixStack matrices, int x, int y, int mouseX, int mouseY) {
        ScreenDrawing.texturedRect(x, y, width, height, TEXTURE, 0xFFFFFFFF);
    }
}
