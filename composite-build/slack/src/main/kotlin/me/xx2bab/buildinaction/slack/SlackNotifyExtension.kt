package me.xx2bab.buildinaction.slack


@Suppress("UnstableApiUsage", "unused")
abstract class SlackNotifyExtension {

    var enabled = true

    var token = ""

    var channelId = ""

    var message = ""

}