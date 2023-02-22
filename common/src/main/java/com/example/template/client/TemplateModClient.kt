package com.example.template.client

import dev.architectury.event.events.client.ClientLifecycleEvent
import net.minecraft.client.Minecraft

object TemplateModClient {
    fun init() {
        ClientLifecycleEvent.CLIENT_SETUP.register(::setup)
    }

    private fun setup(minecraft: Minecraft?) {
        // Do client setup here.
    }
}
