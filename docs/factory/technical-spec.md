# Technical Spec

## Stack

| Component       | Keuze                                |
|-----------------|--------------------------------------|
| Taal            | Kotlin 1.9                           |
| Framework       | Spring Boot 3.2                      |
| Build-tool      | Gradle 8.7 (Kotlin DSL)              |
| Template engine | Thymeleaf                            |
| JVM             | Java 21 (LTS)                        |
| Testframework   | JUnit 5 (via Spring Boot Test)       |

## Architectuur

Standaard Spring MVC controller-aanpak:
- `@Controller` klassen in package `com.example.app`
- Templates als `.html`-bestanden in `resources/templates/`
- Geen REST API; alleen server-side rendered HTML

## Codeconventies

- Kotlin idiomatische stijl (geen Java-stijl null checks, gebruik data classes)
- Package: `com.example.app`
- Controller-naamgeving: `<Domein>Controller.kt`
