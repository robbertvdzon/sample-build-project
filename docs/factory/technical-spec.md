# Technical Spec

## Stack

| Onderdeel        | Keuze                    | Versie   |
|------------------|--------------------------|----------|
| Taal             | Kotlin                   | 1.9.23   |
| Framework        | Spring Boot              | 3.2.5    |
| Build tool       | Gradle (Kotlin DSL)      | 8.7      |
| Template engine  | Thymeleaf                | (via Spring Boot BOM) |
| JVM              | Java 17+                 | 17       |
| Testframework    | JUnit 5 (via Spring Boot)| (via Spring Boot BOM) |

## Architectuur

- Standaard Spring MVC (geen reactive stack)
- `HomeController` serveert `GET /` en retourneert de Thymeleaf view `"home"`
- Template `src/main/resources/templates/home.html` bevat de markup

## Package-structuur

`com.example.samplebuildproject`

## Codeconventies

- Kotlin Coding Conventions (officieel JetBrains)
- Spring-annotaties op class-niveau, geen expliciete `@ResponseBody` (controller retourneert view name)
- Geen onnodige abstracties; controller is dun en stateloos
