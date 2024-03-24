package com.example.templatemod.forge;

import com.example.templatemod.TemplateMod;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("template_mod")
public class ForgeTemplateMod {
    public ForgeTemplateMod() {
        TemplateMod.INSTANCE.init();

        var modBus = FMLJavaModLoadingContext.get().getModEventBus();
        modBus.register(TemplateMod.INSTANCE);

        var forgeBus = MinecraftForge.EVENT_BUS;
        TemplateMod.FORGE_EVENT_HANDLERS.forEach(forgeBus::register);
    }
}
