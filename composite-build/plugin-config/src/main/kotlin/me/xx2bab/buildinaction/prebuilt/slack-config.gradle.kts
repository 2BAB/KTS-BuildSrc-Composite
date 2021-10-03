package me.xx2bab.buildinaction.prebuilt

plugins{
    id("me.2bab.buildinaction.slack") // This works
}

slackNotify {
    channelId = "1234"
    token = "5678"
}

println("slack-config.gradle.kts is applied.")