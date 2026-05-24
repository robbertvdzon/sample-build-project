---
default_base_branch: main
branch_prefix: ai/
preview_url_template: ""
preview_namespace_template: ""
preview_db_secret_recipe: |
  echo "Geen database vereist voor deze applicatie."
---

# Deployment

## Lokaal draaien

```sh
./gradlew bootRun
```

De applicatie is beschikbaar op http://localhost:8080.

## Bouwen als JAR

```sh
./gradlew build
java -jar build/libs/sample-build-project-0.0.1-SNAPSHOT.jar
```

## Preview-omgevingen

Er is nog geen automatische preview-omgeving geconfigureerd voor dit project.
