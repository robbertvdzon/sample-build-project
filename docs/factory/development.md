# Development

## Commands

- Build: `./gradlew build`
- Unit tests: `./gradlew test`
- Run lokaal: `./gradlew bootRun` → http://localhost:8080/
- Lint/format: n.v.t. (geen formatter geconfigureerd)

## Vereisten

- Java 17+ (aanbevolen: Java 21)
- Geen andere lokale dependencies nodig; Gradle wrapper downloadt alles.

## Conventions

- Packages onder `com.example.app`.
- Tests met JUnit 5 via `spring-boot-starter-test`.
- `gradlew` moet executable zijn (`chmod +x gradlew`) en git-index mode `100755`.
