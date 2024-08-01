
plugins {
    kotlin("jvm") version "1.9.22"
}

//group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    flatDir {
        dirs("lib")
    }
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    implementation(files("lib/JSONCover-1.0-SNAPSHOT.jar"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}

//tasks.register("validateSchema") {
//    group = "verification"
//    description = "Validate JSON files against a schema"
//
//    doLast {
//        val schemaPath = "path/to/schema.json"     // Adjust paths as needed
//        val payloadDirectory = "path/to/payloads"  // Adjust paths as needed
//
//        // Execute the Driver class with arguments
//        javaexec {
//            main = "-classpath libs/my-kotlin-library.jar your.package.name.DriverKt $schemaPath $payloadDirectory".split(" ")
//        }
//    }
//}

//tasks.register("validateSchema") {
//    group = "verification"
//    description = "Validate JSON files against a schema"
//
//    doLast {
//        val schemaPath = "path/to/schema.json"     // Adjust paths as needed
//        val payloadDirectory = "path/to/payloads"  // Adjust paths as needed
//
//        Driver.validateSchema(schemaPath, payloadDirectory)
//    }
//}