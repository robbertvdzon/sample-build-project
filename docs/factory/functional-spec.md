# Functional Spec

## Applicatie

Een eenvoudige webapplicatie die een homepage toont.

## Pagina's

### `/` – Homepage

- **Paginatitel** (browser tab): `Test web app`
- **Kopregel** (`<h1>`): `Test web app`
- **Bodytekst**: `dit is een test web applicatie`

## Acceptatiecriteria

1. GET `/` geeft HTTP 200 terug.
2. De HTML bevat `<title>Test web app</title>`.
3. De HTML bevat de tekst `dit is een test web applicatie` in de body.
