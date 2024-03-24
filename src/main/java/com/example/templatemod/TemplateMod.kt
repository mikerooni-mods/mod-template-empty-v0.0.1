package com.example.templatemod

import com.tterrag.registrate.Registrate
import net.minecraft.resources.ResourceLocation

object TemplateMod {
    @JvmField
    val FORGE_EVENT_HANDLERS: List<Any> = listOf(
            // Add event handlers here
    )

    const val MOD_ID = "template_mod"

    fun id(path: String) = ResourceLocation(MOD_ID, path)

    internal val REGISTRATE by lazy { Registrate.create(MOD_ID) }

    fun init() {
        println("Initializing TemplateMod")
    }
}