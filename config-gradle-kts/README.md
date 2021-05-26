# plugin-config.gradle.kts

1. There are a plugin and its extension class declared in /build-env/plugin-config/src/main/kotlin
2. The `/app/build-env-config.gradle.kts` script can refer the plugin id and apply it successfully
3. However, both 2 classes(plugin&extension) are not available from the context of `/app/build-env-config.gradle.kts` (**can not import and configure the extension**)
4. Add a `buildscript{}` can get it work when build via cli, the **IDEA 2021.1.2-rc** still can not import these 2 classes.