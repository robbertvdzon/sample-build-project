# Technical Spec

## Stack

- **Taal**: Kotlin 1.9.x
- **Framework**: Spring Boot 3.2.x
- **Template engine**: Thymeleaf
- **Build tool**: Gradle 8.7 (Kotlin DSL, via gradlew)
- **Java**: 17+ (getest met Java 21)

## Projectstructuur

```
src/main/kotlin/com/example/app/   – applicatiecode
src/main/resources/templates/      – Thymeleaf HTML-templates
src/test/kotlin/com/example/app/   – tests
```

## Conventies

- Één controller per pagina/feature.
- Templates in `src/main/resources/templates/`.
- Geen inner quotes in `DEFAULT_JVM_OPTS` in gradlew (zie agent-tip).
- `gradle/wrapper/gradle-wrapper.jar` is binair; nooit met teksteditor aanpassen.
