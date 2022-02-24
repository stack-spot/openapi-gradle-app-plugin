plugins {
    id("com.stackspot.openapi") version "0.0.1"
}

#scaffold: append-to-end-of-file
tasks {
    compileKotlin {
        kotlinOptions {
            jvmTarget = "11"
        }
    }
    compileTestKotlin {
        kotlinOptions {
            jvmTarget = "11"
        }
    }
    generateOpenApi {
        framework.set(com.orange.foundation.jvm.plugin.openapi.GenerateOpenApiTaskConfigurator.Framework.{{inputs.framework|upper}})
        outputDir.set(File(projectDir, "/src"))
    }
}
