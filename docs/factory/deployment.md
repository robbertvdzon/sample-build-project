---
default_base_branch: main
branch_prefix: ai/
preview_url_template: "https://example-pr-{pr_num}.example.com"
preview_namespace_template: "example-pr-{pr_num}"
preview_db_secret_recipe: |
  echo "Geen database vereist voor deze applicatie."
---

# Deployment

Applicatie draait standaard op poort 8080 na `./gradlew bootRun`.

Geen externe afhankelijkheden (database, secrets) vereist.
