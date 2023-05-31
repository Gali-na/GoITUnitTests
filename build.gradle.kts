plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.mikemybytes:junit5-formatted-source:0.2.0")
    implementation("com.mikemybytes:junit5-formatted-source-tests:0.2.0")
    implementation("com.mikemybytes:junit5-formatted-source-parent:0.2.0")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")


}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}