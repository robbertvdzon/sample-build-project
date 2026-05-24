# SP-3 — Create first app

## Stappenplan

- [x] Kotlin/Spring Boot project aanmaken met Gradle Wrapper
- [x] Thymeleaf-afhankelijkheid toevoegen aan `build.gradle.kts`
- [x] `HomeController` aanmaken met GET `/` route
- [x] Thymeleaf-template `index.html` aanmaken met juiste titel en tekst
- [x] `gradle/wrapper/gradle-wrapper.jar` downloaden van GitHub
- [x] `gradlew` executable maken (chmod +x via git index)
- [x] `docs/factory/` aanmaken vanuit skeleton
- [x] `docs/stories/SP-3-create-first-app.md` bijhouden

## Wat gedaan en waarom

**Projectstructuur**: Vanuit een lege repo (alleen README) is een volledig Kotlin/Spring Boot project opgezet met Gradle 8.7 (Kotlin DSL) en Java 21.

**Template engine**: Thymeleaf gekozen als meest gangbare keuze binnen Spring Boot — geen extra integratie nodig, werkt out-of-the-box met `spring-boot-starter-thymeleaf`.

**gradle-wrapper.jar**: Binair bestand gedownload van GitHub (`v8.7.0`) omdat er geen lokale Gradle CLI beschikbaar was in de sandbox.

**gradlew permissies**: `gradlew` moet executable zijn (mode 100755 in git index). Dit is via `git update-index --chmod=+x gradlew` ingesteld.

**docs/factory/**: Volledig aangemaakt op basis van de skeleton-template in `/usr/local/share/factory/docs-skeleton/`, aangevuld met stack-specifieke informatie (Kotlin, Spring Boot 3.2, Thymeleaf, Gradle 8.7, Java 21).

## Testresultaat

De build is gestart met `./gradlew build` — zie commit voor details. De applicatie compileert correct en de context-load test slaagt.
