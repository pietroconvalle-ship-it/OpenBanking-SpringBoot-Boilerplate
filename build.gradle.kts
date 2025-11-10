plugins {
    id("uk.gov.justice.hmpps.gradle-spring-boot") version "9.1.4"
    kotlin("plugin.spring") version "2.2.21"
}

group = "org.openapitools"
version = "1.0.0"

repositories {
    mavenCentral()
    maven { url = uri("https://repo.spring.io/milestone") }
}

dependencies {
    implementation("uk.gov.justice.service.hmpps:hmpps-kotlin-spring-boot-starter:1.7.0")
    implementation("org.springframework.boot:spring-boot-starter-webflux")
    implementation("org.springdoc:springdoc-openapi-starter-webmvc-ui:2.8.13")
}

kotlin {
    jvmToolchain(21)
}
