import buildutils.configureDetekt
import buildutils.createDetektTask
import buildutils.configureDiktat
import buildutils.createDiktatTask
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

@Suppress("DSL_SCOPE_VIOLATION") // "libs" produces a false-positive warning, see https://youtrack.jetbrains.com/issue/KTIJ-19369
plugins {
    id(libs.plugins.kotlin.jvm.get().pluginId)
    alias(libs.plugins.buildconfig) apply false
}

group = "org.example"
version = "1.0-SNAPSHOT"

subprojects {
    apply(plugin = "org.jetbrains.kotlin.jvm")

    repositories {
        mavenCentral()
    }

    dependencies {
        implementation(rootProject.libs.junitJupiterApi)
        runtimeOnly(rootProject.libs.junitJupiterEngine)
        runtimeOnly(rootProject.libs.junitPlatformConsole)
        testImplementation(rootProject.libs.junitJupiterApi)
        testImplementation(rootProject.libs.junitJupiterParams)
    }

    tasks.withType<KotlinCompile> {
        kotlinOptions.jvmTarget = "1.8"
    }

    tasks.test {
        useJUnitPlatform()
        outputs.upToDateWhen { false }
    }

    configureDiktat()
    configureDetekt()
}

createDiktatTask()
createDetektTask()