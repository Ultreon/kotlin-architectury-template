@file:Suppress("removal")

package com.example.template.forge

import com.example.template.TemplateMod
import com.example.template.client.TemplateModClient
import com.example.template.server.TemplateModServer
import dev.architectury.platform.forge.EventBuses
import net.minecraftforge.api.distmarker.Dist
import net.minecraftforge.fml.DistExecutor
import net.minecraftforge.fml.common.Mod
import thedarkcolour.kotlinforforge.KotlinModLoadingContext

@Mod(TemplateForge.modId)
class TemplateForge {
    init {
        EventBuses.registerModEventBus(modId, KotlinModLoadingContext.get().getKEventBus())

        TemplateMod.init()

        DistExecutor.unsafeRunWhenOn(Dist.CLIENT) { Runnable { TemplateModClient.init() } }
        DistExecutor.unsafeRunWhenOn(Dist.DEDICATED_SERVER) { Runnable { TemplateModServer.init() } }
    }

    companion object {
        const val modId = "template"
    }
}