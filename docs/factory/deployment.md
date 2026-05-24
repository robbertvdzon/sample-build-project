---
default_base_branch: main
branch_prefix: ai/
preview_url_template: "https://example-pr-{pr_num}.example.com"
preview_namespace_template: "example-pr-{pr_num}"
preview_db_secret_recipe: |
  echo "Geen database; geen secret nodig."
---

# Deployment

De applicatie is een standalone Spring Boot jar op poort 8080.

## Lokaal draaien

```bash
./gradlew bootRun
# Beschikbaar op http://localhost:8080
```

## Build artifact

```bash
./gradlew build
# Jar: build/libs/sample-build-project-0.0.1-SNAPSHOT.jar
java -jar build/libs/sample-build-project-0.0.1-SNAPSHOT.jar
```
