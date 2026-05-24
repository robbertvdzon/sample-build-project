# SP-3: Create first app

## Stappenplan

- [x] Kotlin/Spring Boot projectstructuur aanmaken (build.gradle.kts, settings.gradle.kts)
- [x] Gradle wrapper aanmaken (gradlew, gradle-wrapper.properties, gradle-wrapper.jar downloaden)
- [x] Application.kt – Spring Boot entry point
- [x] HomeController.kt – GET `/` → Thymeleaf view `home`
- [x] home.html – Thymeleaf template met titel "Test web app" en bodytekst
- [x] ApplicationTest.kt – context loads smoke test
- [x] docs/factory/ aanmaken vanuit skeleton en invullen
- [x] Lokale commit

## Notities

- Template engine: **Thymeleaf** (Spring Boot standaard, zero-config).
- `gradle/wrapper/gradle-wrapper.jar` gedownload via `curl` van GitHub raw (v8.7.0, ~43KB).
  De factory of developer kan het regenereren met `gradle wrapper --gradle-version 8.7` als dat nodig is.
- `DEFAULT_JVM_OPTS` in gradlew zonder inner quotes (zie agent-tip) om Linux-compatibiliteit te garanderen.
- `gradlew` heeft git-index mode `100755` (via `git update-index --chmod=+x gradlew`).
