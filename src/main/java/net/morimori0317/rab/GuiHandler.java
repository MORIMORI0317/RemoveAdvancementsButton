package net.morimori0317.rab;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiIngameMenu;
import net.minecraftforge.client.event.GuiScreenEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.List;

public class GuiHandler {
    @SubscribeEvent
    public void onGUI(GuiScreenEvent.InitGuiEvent.Post e) {
        //Do not perform this process except in the game menu GUI
        if (!(e.getGui() instanceof GuiIngameMenu)) return;

        GuiButton advancementsButton = getButton(e.getButtonList(), 5);
        GuiButton openLanButton = getButton(e.getButtonList(), 7);

        //Move the OpenLan button to the same width as the advancements button and to the same location
        openLanButton.setWidth(advancementsButton.width);
        openLanButton.y = advancementsButton.y;

        //Remove advancements button
        e.getButtonList().remove(advancementsButton);
    }

    //Find button by id
    //See #GuiIngameMenu class
    private GuiButton getButton(List<GuiButton> button, int num) {
        for (GuiButton guiButton : button) {
            if (guiButton.id == num)
                return guiButton;
        }
        return button.get(num);
    }
}
