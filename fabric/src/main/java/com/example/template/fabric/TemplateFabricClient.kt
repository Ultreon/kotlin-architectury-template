package com.example.template.fabric

import com.example.template.client.TemplateModClient
import net.fabricmc.api.ClientModInitializer

@Suppress("unused")
object TemplateFabricClient : ClientModInitializer {
    override fun onInitializeClient() {
        TemplateModClient.init()
    }
}