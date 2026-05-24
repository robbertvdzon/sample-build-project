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

Done / rationale:
- Developer-run gestart: story en factory-docs gelezen zodat het plan in de target-repo zichtbaar is.
- Claude developer-run is afgerond. De factory heeft de branch gepusht en de PR geopend of hergebruikt.

---

## Samenvatting

SP-3 is volledig geïmplementeerd: een werkende Kotlin/Spring Boot 3.2 applicatie met Thymeleaf-homepage op `/`. De build slaagt (`BUILD SUCCESSFUL`) en de Spring context-test draait groen.

## Gedaan

- **Kotlin/Spring Boot project** aangemaakt met Gradle 8.7 (Kotlin DSL), Spring Boot 3.2, Thymeleaf
- **`HomeController`** met `@GetMapping("/")` die `index.html` rendert
- **`index.html`** met `<title>Test web app</title>`, `<h1>Test web app</h1>` en alinea "dit is een test web applicatie"
- **`gradle/wrapper/gradle-wrapper.jar`** gedownload van GitHub (43KB)
- **`gradlew`** executable (mode 100755) correct in git index
- **`.gitignore`** toegevoegd (`build/`, `.gradle/`)
- **`docs/factory/`** aangemaakt vanuit skeleton, aangevuld met Kotlin/Spring stack-info
- **`docs/stories/SP-3-create-first-app.md`** bijgehouden als story-log
- **`./gradlew build` + tests**: BUILD SUCCESSFUL, 1 test geslaagd
- **Lokale commit**: `a47a740`

## Niet gedaan / aangepast

- `ApplicationTests` test alleen context-load, geen HTTP-integratie test voor de homepage (niet vereist door de story)
- `gradle-wrapper.jar` wordt als binair bestand bijgehouden in git (conform agent-tip: geen alternatief zonder Gradle CLI)

{"agent_tips_update":[{"category":"gradle","key":"gradlew_add_before_chmod","content":"git update-index --chmod=+x gradlew faalt met 'missing --add option' als gradlew nog niet in de git index staat. Voer altijd eerst 'git add gradlew' uit, dan 'git update-index --chmod=+x gradlew'."},{"category":"gradle","key":"gradle_flag_order","content":"Gradle-flags zoals --no-daemon moeten vóór de taak staan: './gradlew --no-daemon build'. Als flags ná de taaknaam staan, geeft Gradle een 'task not found' fout op sommige versies."}]}

{"phase":"developing-finished"}
