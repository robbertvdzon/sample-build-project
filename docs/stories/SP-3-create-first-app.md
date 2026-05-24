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

## Toelichting

Nieuw Spring Boot 3.2 / Kotlin 1.9 project aangemaakt met Gradle (Kotlin DSL).  
Thymeleaf gekozen als template engine (standaard Spring Boot-keuze).  
`GET /` retourneert template `home.html` met `<title>Test web app</title>` en tekst `dit is een test web applicatie`.  
`gradle-wrapper.jar` gedownload van GitHub (v8.7.0) omdat de `gradle` CLI niet beschikbaar was.  
`gradlew` executable gemaakt via `chmod +x` en `git update-index --chmod=+x`.  
`docs/factory/` aangemaakt op basis van de docs-skeleton met projectspecifieke info ingevuld.
