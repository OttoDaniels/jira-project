plugins {
    id("java")
}

group = "com.app"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web:3.2.0")
    implementation("org.springframework.boot:spring-boot-starter-thymeleaf:3.2.0")
    implementation("org.springframework.boot:spring-boot-starter-jdbc:3.2.0")
    implementation("org.springframework.boot:spring-boot-starter-security:3.2.0")

    implementation("org.postgresql:postgresql:42.7.1")


    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

