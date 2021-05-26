# plugin-config.gradle.kts

1. There are a plugin and its extension class declared in /build-env/plugin-config/src/main/kotlin
2. The `/app/build-env-config.gradle.kts` script can refer the plugin id and apply it successfully
3. However, both 2 classes are not available from the context of `/app/build-env-config.gradle.kts` (**can not import and configure the extension**)