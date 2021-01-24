package net.fabricmc.ankir.gui;

import io.github.cottonmc.cotton.gui.client.LightweightGuiDescription;
import io.github.cottonmc.cotton.gui.widget.WGridPanel;
import io.github.cottonmc.cotton.gui.widget.WLabel;

public class ExampleGui extends LightweightGuiDescription {
    public ExampleGui() {
        WGridPanel root = new WGridPanel();
        setRootPanel(root);
        root.setSize(100, 25);


        WLabel label = new WLabel("Hello Team Mars!");
        root.add(label, 1, 1);
        
        CustomGuiText custom = new CustomGuiText();
        root.add(custom, 20, 20);
    }
}
