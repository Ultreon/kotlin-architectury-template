package com.example.template.fabric

import com.example.template.TemplateMod
import net.fabricmc.api.ModInitializer

@Suppress("unused")
object TemplateFabric : ModInitializer {
    override fun onInitialize() {
        TemplateMod.init()
    }
}