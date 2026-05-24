# SP-3: Create first app

## Stappenplan

- [x] Kotlin/Spring Boot Gradle-project aanmaken
- [x] Thymeleaf-dependency toevoegen
- [x] `HomeController` implementeren voor `GET /`
- [x] Thymeleaf-template `home.html` met titel en tekst aanmaken
- [x] `gradle-wrapper.jar` downloaden
- [x] `gradlew` executable maken (git index + chmod)
- [x] `docs/factory/` aanmaken en invullen
- [x] Story-log bijwerken
- [x] [Reviewer feedback] `.gitignore` toevoegen en `build/`+`.gradle/` uit git-index verwijderen
- [x] [Reviewer feedback] `HomeControllerTest` met MockMvc toevoegen

## Toelichting

Nieuw Spring Boot 3.2 / Kotlin 1.9 project aangemaakt met Gradle (Kotlin DSL).  
Thymeleaf gekozen als template engine (standaard Spring Boot-keuze).  
`GET /` retourneert template `home.html` met `<title>Test web app</title>` en tekst `dit is een test web applicatie`.  
`gradle-wrapper.jar` gedownload van GitHub (v8.7.0) omdat de `gradle` CLI niet beschikbaar was.  
`gradlew` executable gemaakt via `chmod +x` en `git update-index --chmod=+x`.  
`docs/factory/` aangemaakt op basis van de docs-skeleton met projectspecifieke info ingevuld.

Done / rationale:
- Developer-run gestart: story en factory-docs gelezen zodat het plan in de target-repo zichtbaar is.
- Claude developer-run is afgerond. De factory heeft de branch gepusht en de PR geopend of hergebruikt.

Commit succeeds. All 22 files committed on branch `ai/SP-3`.

---

## Samenvatting

Kotlin/Spring Boot 3.2 applicatie met Thymeleaf. `GET /` geeft HTML terug met `<title>Test web app</title>` en `dit is een test web applicatie`. Reviewer-feedback verwerkt: `.gitignore` toegevoegd, `build/` en `.gradle/` uit git-tracking verwijderd, en `HomeControllerTest` met MockMvc toegevoegd.

## Gedaan

- **Gradle-project**: `build.gradle.kts`, `settings.gradle.kts`, `gradlew` (mode 100755), `gradlew.bat`, `gradle/wrapper/gradle-wrapper.{jar,properties}` — Gradle 8.7 + Spring Boot 3.2 + Kotlin 1.9 + Java 21
- **Applicatiecode**: `Application.kt` (main), `HomeController.kt` (`GET /` → template `home`)
- **Template**: `src/main/resources/templates/home.html` met vereiste titel en tekst
- **Tests**: `ApplicationTest.kt` (context loads) + `HomeControllerTest.kt` (MockMvc GET / → 200, content check)
- **Docs/factory**: alle skeleton-bestanden aangemaakt en ingevuld voor deze stack
- **Story-log**: `docs/stories/SP-3-create-first-app.md`
- **`.gitignore`**: `build/`, `.gradle/`, `*.class` uitgesloten; bestaande bestanden uit git-index verwijderd
- **Lokale commit** op branch `ai/SP-3`

## Niet gedaan / aangepast

- `gradle-wrapper.jar` gedownload via curl (gradle CLI niet aanwezig); gedocumenteerd in `development.md`
- `DEFAULT_JVM_OPTS` aangepast (inner quotes verwijderd) t.o.v. standaard Gradle wrapper om JVM-classpath-fout op Linux te vermijden

---
