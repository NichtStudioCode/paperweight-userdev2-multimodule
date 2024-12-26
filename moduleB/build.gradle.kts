plugins {
    java
    id("io.papermc.paperweight.userdev")
}

group = "org.example"
version = "1.0-SNAPSHOT"

dependencies {
    paperweight.paperDevBundle("1.21.4-R0.1-SNAPSHOT")
}