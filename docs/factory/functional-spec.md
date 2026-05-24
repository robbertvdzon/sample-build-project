# Functional Spec

## Doel

Een eenvoudige Spring Boot webapplicatie die een homepage toont.

## Gebruikersflows

### Homepage

- **URL**: `GET /`
- **Verwacht resultaat**: HTML-pagina met:
  - `<title>Test web app</title>` in de `<head>`
  - Zichtbare hoofdtitel "Test web app"
  - Bodytekst "dit is een test web applicatie"

## Acceptatiecriteria

1. De applicatie start op poort 8080.
2. `GET /` retourneert HTTP 200 met een HTML-body.
3. De HTML-body bevat de tekst "Test web app" als heading.
4. De HTML-body bevat de tekst "dit is een test web applicatie".
5. De `<title>` van de pagina is "Test web app".
