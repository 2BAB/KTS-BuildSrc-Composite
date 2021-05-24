package me.xx2bab.buildinaction.slack

import com.android.build.gradle.AppPlugin
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.withType
import java.util.concurrent.atomic.AtomicBoolean

@Suppress("UnstableApiUsage")
abstract class SlackNotifyPlugin : Plugin<Project> {
    val androidAppPluginApplied = AtomicBoolean(false)

    override fun apply(project: Project) {
        val slackExtension = project.extensions.create("slackNotify",
            SlackNotifyExtension::class.java)

        // To prevent user from using it in other modules
        project.plugins.withType<AppPlugin> {
            androidAppPluginApplied.set(true)
        }
        project.afterEvaluate {
            check(androidAppPluginApplied.get()) {
                "Android App Versioning plugin should only be applied to an Android Application project but ${project.displayName} doesn't have the 'com.android.application' plugin applied."
            }
            println("channelID: ${slackExtension.channelId}")
        }
        // Can not use this approach because when IDE syncs for accessor generation,
        // it may not have AppPlugin applied
//        if (!project.plugins.hasPlugin(AppPlugin::class.java)) {
//            throw IllegalStateException("Required Android AppPlugin.")
//        }

    }

}