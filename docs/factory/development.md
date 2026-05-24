# Development

## Commands

- Build: `./gradlew build`
- Run: `./gradlew bootRun`
- Unit tests: `./gradlew test`
- Integration tests: `./gradlew test` (Spring Boot context tests)
- Lint/format: n.v.t. (geen linter geconfigureerd)

## Vereisten

- Java 21 (Temurin)
- Gradle Wrapper (`./gradlew`) — geen lokale Gradle-installatie nodig

## Conventions

- Kotlin-bronnen in `src/main/kotlin/com/example/app/`
- Thymeleaf-templates in `src/main/resources/templates/`
- Statische bestanden in `src/main/resources/static/`
- Tests in `src/test/kotlin/com/example/app/`
- Spring Boot standaard poort: 8080
