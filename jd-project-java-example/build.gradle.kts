plugins {
    id("jd-project.java")
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":jd-project-java"))
}

tasks.withType<JavaCompile>().configureEach {
    // Allow using more modern APIs, like `List.of` and `Map.of`, in examples.
    options.release.set(9)
}

application {
    // Use `./gradlew :jd-project-java-example:run` to run `Main`
    // Use `./gradlew :jd-project-java-example:run -Pexample=Something` to run `SomethingExample`
    mainClass = "com.jd_project.api.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}Example"
        else
            "Main"
    }"
}
