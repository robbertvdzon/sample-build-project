# Technical Spec

## Stack

- **Taal**: Kotlin 1.9.x
- **Framework**: Spring Boot 3.2.x
- **Template engine**: Thymeleaf
- **Build tool**: Gradle 8.7 (Kotlin DSL)
- **Java**: 21 (LTS)

## Projectstructuur

```
src/main/kotlin/com/example/app/   – applicatiecode
src/main/resources/templates/      – Thymeleaf HTML-templates
src/main/resources/                – application.properties
src/test/kotlin/com/example/app/   – tests
```

## Codeconventies

- Standaard Spring MVC controller-aanpak (`@Controller` + template-naam retourneren).
- Thymeleaf-templates in `src/main/resources/templates/`.
- Package: `com.example.app`.
