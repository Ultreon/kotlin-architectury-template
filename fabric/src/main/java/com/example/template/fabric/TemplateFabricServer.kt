package com.example.template.fabric

import com.example.template.client.TemplateModClient
import net.fabricmc.api.DedicatedServerModInitializer

@Suppress("unused")
object TemplateFabricServer : DedicatedServerModInitializer {
    override fun onInitializeServer() {
        TemplateModClient.init()
    }
}