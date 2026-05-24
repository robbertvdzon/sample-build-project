# Development

## Commands

- Build: `./gradlew build`
- Run: `./gradlew bootRun`
- Unit tests: `./gradlew test`
- Integration tests: `./gradlew test` (Spring Boot test context)
- Lint/format: n.v.t. (geen linter geconfigureerd)

## Vereisten

- Java 21+
- Geen aparte Gradle-installatie nodig; gebruik `./gradlew`

## Opmerking gradle-wrapper.jar

`gradle/wrapper/gradle-wrapper.jar` is een binair bestand dat niet via de Write-tool aangemaakt kan worden. Het is gedownload van GitHub (gradle v8.7.0) en staat in de repo. Indien het bestand ontbreekt, download het opnieuw:

```sh
curl -fsSL -o gradle/wrapper/gradle-wrapper.jar \
  https://github.com/gradle/gradle/raw/v8.7.0/gradle/wrapper/gradle-wrapper.jar
```

## Conventions

- Controllers in `com.example.app`, Thymeleaf templates in `src/main/resources/templates/`.
- Tests met JUnit 5 via `@SpringBootTest`.
