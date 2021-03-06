// Composite builds
includeBuild("dex2jar") {
    dependencySubstitution {
        substitute(module("dex2jar:dex-translator"))
                .with(project(":dex-translator"))
    }
}

// Subprojects

// JVM
// Android support suite
include("AndroidCompat")
// Core Java patches
include("AndroidCompat:JVMPatch")

// Original Tachiyomi source code (along with Android -> Server bridge code)
include("Tachiyomi-App")

// Core server code (API handlers)
include("TachiServer")
// Config API
include("TachiServer:Config")

//JS
// Web UI
include("tachiwebui")
// Electron bootstrap wrapper
include("bootui")

include("TachiyomiUI")
