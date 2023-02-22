package com.example.template.fabric

import com.example.template.server.TemplateModServer
import net.fabricmc.api.DedicatedServerModInitializer

@Suppress("unused")
object TemplateFabricServer : DedicatedServerModInitializer {
    override fun onInitializeServer() {
        TemplateModServer.init()
    }
}