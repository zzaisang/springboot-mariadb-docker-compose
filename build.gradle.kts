
plugins {
    id("org.springframework.boot") version "2.4.3"
    java
}


group = "com.zzaisang"
version = "0.1.4"
apply(plugin = "io.spring.dependency-management")

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_11
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-web")
    //implementation("org.springframework.boot:spring-boot-starter-security")
    annotationProcessor ("org.springframework.boot:spring-boot-configuration-processor")
    testImplementation("org.springframework.boot:spring-boot-starter-test") {
        exclude("org.junit.vintage:junit-vintage-engine")
    }
    implementation(fileTree("libs").matching { include("*.jar") })
    runtimeOnly("org.mariadb.jdbc:mariadb-java-client")
    compileOnly("org.projectlombok:lombok")
    annotationProcessor("org.projectlombok:lombok")
    testCompile("org.projectlombok:lombok")
    testAnnotationProcessor("org.projectlombok:lombok")
}
