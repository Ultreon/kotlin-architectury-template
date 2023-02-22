package com.example.template.server

import dev.architectury.event.events.common.LifecycleEvent

object TemplateModServer {
    fun init() {
        LifecycleEvent.SETUP.register(::setup)
    }

    private fun setup() {
        // Do server setup here.
    }
}
