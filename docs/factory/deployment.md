---
default_base_branch: main
branch_prefix: ai/
preview_url_template: "https://example-pr-{pr_num}.example.com"
preview_namespace_template: "example-pr-{pr_num}"
preview_db_secret_recipe: |
  echo "Geen database; geen secrets nodig."
---

# Deployment

De applicatie is een Spring Boot executable jar. Starten met:

```
java -jar build/libs/app-0.0.1-SNAPSHOT.jar
```

Standaard poort: `8080`.
