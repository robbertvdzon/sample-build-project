# Functional Spec

## Doel

Een eenvoudige webapplicatie die bezoekers een homepage toont.

## Gebruikersflow

1. Bezoeker opent `GET /`.
2. Applicatie retourneert een HTML-pagina met:
   - Paginatitel: `Test web app` (zowel in `<title>` als `<h1>`)
   - Zichtbare tekst: `dit is een test web applicatie`

## Acceptatiecriteria

- `GET /` geeft HTTP 200.
- Paginatitel (`<title>`) is `Test web app`.
- Body bevat de tekst `dit is een test web applicatie`.
- Geen authenticatie of loginscherm.
