import com.vanniktech.maven.publish.JavadocJar
import com.vanniktech.maven.publish.KotlinJvm
import com.vanniktech.maven.publish.MavenPublishBaseExtension
import com.vanniktech.maven.publish.SonatypeHost

plugins {
    id("com.vanniktech.maven.publish")
}

repositories {
    gradlePluginPortal()
    mavenCentral()
}

extra["signingInMemoryKey"] = System.getenv("GPG_SIGNING_KEY")
extra["signingInMemoryKeyId"] = System.getenv("GPG_SIGNING_KEY_ID")
extra["signingInMemoryKeyPassword"] = System.getenv("GPG_SIGNING_PASSWORD")

configure<MavenPublishBaseExtension> {
    signAllPublications()
    publishToMavenCentral(SonatypeHost.CENTRAL_PORTAL)

    coordinates(project.group.toString(), project.name, project.version.toString())
    configure(
        KotlinJvm(
            javadocJar = JavadocJar.Dokka("dokkaJavadoc"),
            sourcesJar = true,
        )
    )

    pom {
        name.set("OpenAPI 3.0 Pet Store")
        description.set("This is a sample Pet Store Server based on the OpenAPI 3.0 specification.")
        url.set("https://www.github.com/jd-st/jd-project-java")

        licenses {
            license {
                name.set("Apache-2.0")
            }
        }

        developers {
            developer {
                name.set("Jd Project")
            }
        }

        scm {
            connection.set("scm:git:git://github.com/jd-st/jd-project-java.git")
            developerConnection.set("scm:git:git://github.com/jd-st/jd-project-java.git")
            url.set("https://github.com/jd-st/jd-project-java")
        }
    }
}

tasks.withType<Zip>().configureEach {
    isZip64 = true
}
