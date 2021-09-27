plugins {
    scala
    `java-library`
    `maven-publish`
}

group = "com.example"
version = "0.1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

scala {
    zincVersion.set("1.3.5")
}

sourceSets {
    main {
        java {
            setSrcDirs(emptyList<String>())
        }
        withConvention(ScalaSourceSet::class) {
            scala {
                setSrcDirs(listOf("src/main/scala", "src/main/java"))
            }
        }
    }
    test {
        java {
            setSrcDirs(emptyList<String>())
        }
        withConvention(ScalaSourceSet::class) {
            scala {
                setSrcDirs(listOf("src/test/scala", "src/test/java"))
            }
        }
    }
}
dependencies {
    implementation("org.scala-lang:scala-library:2.13.4")
    implementation("org.scala-lang:scala-compiler:2.13.4")
}