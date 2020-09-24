
plugins {
    kotlin("jvm") version "1.4.0"
}

group = "com.jonghyeon"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.7.0")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5:1.3.50")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.6.0")
}


tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
}

tasks.test {
    useJUnitPlatform()
}
