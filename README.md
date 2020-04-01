# Esercizio "Schedina totocalcio"

## Specifica

Si realizzi un programma che acquisisca dall'utente un *pronostico* relativo alla schedina del totocalcio, ed emetta in output l'elenco dei *risultati* compatibili con il pronostico stesso.

Si supponga che la schedina del Totocalcio sia composta da `N=13` partite (si consiglia di partire con valori inferiori di N). Ciascuna partita può terminare con il risultato `1` (vince la squadra di casa), `2` (vince la squadra fuori casa) o `X` (pareggio). Il *risultato*, quindi, sarà una stringa (o una lista) di `N` caratteri, i quali possono essere `1`, `2`, o `X`.

Esempio: `risultato = "112X112X112X1"`

Il giocatore della schedina fa un *pronostico* su quale potrebbe essere il risultato. Il pronostico, per ogni partita, specifica uno o più risultati possibili, tenendo conto dell'incertezza sul risutato. Ad esempio il pronostico può contenere `1` (vittoria fissa) oppure `1X` (vittoria o pareggio) oppure `1X2` qualunque risultato. Il giocatore, per ciascuna partita, specifica il proprio pronostico.

Esempio: `pronostico = [ "1", "1X", "12", "X", "1X2", ... ]`

Lo scopo del programma è acquisire *un pronostico* ed **espanderlo** in tutti i possibili *risultati* compatibili con esso.

Esempio (`N=4`):

```
pronostico = [ "2X", "1", "1X2", "12" ]
risultati =
2111
2112
21X1
21X2
2111
2122
X111
X112
X1X1
X1X2
X111
X122
```

## Traccia

Definiamo alcune classi con cui lavorare:

* `RisultatoPartita`: rappresenta un singolo risultato `1`, `2`, `X`
* `Risultato`: contiene una sequenza di `N` valori di tipo `RisultatoPartita`
* `PronosticoPartita`: contiene un singolo pronostico, che è un `Set` di `RisultatoPartita` (es. `{ 1, X }`)
* `Pronostico`: contiene una sequenza di `N` oggetti `PronosticoPartita`  