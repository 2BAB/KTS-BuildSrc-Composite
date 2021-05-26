package me.xx2bab.buildinaction.prebuilt

import org.gradle.api.Plugin
import org.gradle.api.Project

class BuildEnvStubPlugin: Plugin<Project> {
    override fun apply(target: Project) {
        target.logger.lifecycle("BuildEnvStubPlugin applied.")
        val config = target.extensions.create("buildEnvStub", BuildEnvStubExtension::class.java)
        target.afterEvaluate {
            target.logger.lifecycle("text size: ${config.textSize}" )
        }
    }
}