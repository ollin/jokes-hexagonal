plugins {
    java
}

version = "0.1-SNAPSHOT"
group = "jokes-hexagonal"

repositories {
    jcenter()
}

dependencies {
}

subprojects {

    apply(plugin = "java")

    repositories {
        jcenter()
    }
    dependencies {
    }
}

project(":layer-application") {
    dependencies {
        "implementation"(project(":layer-domain"))
    }
}

project(":layer-adapter-secondary-chucknorrisquotes") {
    dependencies {
        "implementation"(project(":layer-domain"))
    }
}
