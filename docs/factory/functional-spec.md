# Functional Spec

## Applicatie

`sample-build-project` is een demo-webapplicatie die een homepage toont.

## Gebruikersflows

1. Gebruiker navigeert naar `/` (home)
2. Browser toont een pagina met:
   - Browsertab-titel: **Test web app**
   - Zichtbare heading: **Test web app**
   - Alineatekst: **dit is een test web applicatie**

## Acceptatiecriteria

- GET `/` retourneert HTTP 200
- Response bevat de tekst "Test web app" als paginatitel
- Response bevat de tekst "dit is een test web applicatie"
