# Development

## Vereisten

- Java 17+
- Gradle 8.7 (via wrapper)

## Commands

- Build: `./gradlew build`
- Unit tests: `./gradlew test`
- Applicatie starten: `./gradlew bootRun`
- Alleen compileren: `./gradlew compileKotlin`

## Gradle Wrapper bootstrap

De `gradle/wrapper/gradle-wrapper.jar` moet aanwezig zijn. Genereer deze eenmalig met:

```sh
gradle wrapper --gradle-version 8.7
```

Of download het jar-bestand handmatig van https://services.gradle.org/distributions/ en plaats het in `gradle/wrapper/`.

## Repo-structuur

```
src/main/kotlin/com/example/samplebuildproject/
  SampleBuildProjectApplication.kt   # Spring Boot entry point
  HomeController.kt                  # Controller voor GET /
src/main/resources/
  templates/home.html                # Thymeleaf homepage-template
  application.properties
src/test/kotlin/com/example/samplebuildproject/
  SampleBuildProjectApplicationTests.kt
```

## Conventions

- Kotlin Coding Conventions (JetBrains standaard)
- Spring Boot 3.x met Kotlin DSL Gradle build
- Thymeleaf templates in `src/main/resources/templates/`
