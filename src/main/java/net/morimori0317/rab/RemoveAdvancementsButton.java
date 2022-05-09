package net.morimori0317.rab;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod(modid = RemoveAdvancementsButton.MODID, name = RemoveAdvancementsButton.NAME, version = RemoveAdvancementsButton.VERSION)
public class RemoveAdvancementsButton {
    public static final String MODID = "removeadvancementsbutton";
    public static final String NAME = "Remove Advancements Button";
    public static final String VERSION = "1.0";

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        if (event.getSide() == Side.CLIENT)
            MinecraftForge.EVENT_BUS.register(new GuiHandler());
    }
}
