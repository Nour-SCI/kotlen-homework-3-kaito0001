group = rootProject.group
version = rootProject.version

dependencies {
    implementation(project(":module2"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.0")
    testImplementation("org.junit.jupiter:junit-jupiter-params:5.9.0")
}