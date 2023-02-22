package com.example.template

import dev.architectury.event.events.common.LifecycleEvent
import org.slf4j.Logger
import org.slf4j.LoggerFactory

object TemplateMod {
    val logger: Logger = LoggerFactory.getLogger("TemplateMod")

    fun init() {
        LifecycleEvent.SETUP.register(::setup)
    }

    private fun setup() {
        // Do common setup here.
    }
}
