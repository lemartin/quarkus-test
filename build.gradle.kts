import io.quarkus.gradle.tasks.QuarkusBuild
import io.quarkus.gradle.tasks.QuarkusNative
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.3.30"
    id("io.quarkus") version ("0.13.1")
    idea
}

group = "com.github.lemartin"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(group = "org.jetbrains.kotlin", name = "kotlin-stdlib-jdk8")
    implementation(group = "io.quarkus", name = "quarkus-resteasy", version = "0.13.1")
    implementation(group = "io.quarkus", name = "quarkus-kotlin", version = "0.13.1")
    implementation(group = "io.quarkus", name = "quarkus-resteasy-jsonb", version = "0.13.1")
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

quarkus {
    setSourceDir("src/main/kotlin")
    resourcesDir().add(File("src/main/resources"))
    setOutputDirectory("build/classes/kotlin/main")
}
