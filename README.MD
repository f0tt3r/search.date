## Idee

Gib Datum, Interval an Tagen.
Bekomm Datum nach diesem Interval (siehe Aufgabenstellung für Details.)

## Ausführen

### Bash
```bash
cd src && javac Main.java && java Main && rm Main.class SimpleIO.class && cd -
```
### PowerShell
```powershell
cd src; javac Main.java; java Main; rm Main.class, SimpleIO.class; cd -
```
### CMD Windows
```cmd
cd src & javac Main.java & java Main & del Main.class SimpleIO.class & cd ..
```

## Aufgabe: Enddatum-Berechnung mit Schleife

### Ziel
Implementieren Sie ein Programm in Java, das für ein gegebenes Startdatum und eine Anzahl \( t \) an Tagen ein Enddatum berechnet, das genau \( t \) Tage nach dem Startdatum liegt.

### Anforderungen
- **Schleifen-Implementierung**: Die Berechnung des Enddatums muss mit einer einzigen Schleife erfolgen.
- **Verzicht auf break und continue**: Die Schleife darf keine `break` oder `continue` Anweisungen verwenden.
- **Eingabe und Ausgabe**: Nutzen Sie die Klasse `SimpleIO`, um Eingaben und Ausgaben zu verarbeiten.

### Funktionsweise
1. **Eingabe des Startdatums**:
    - Das Programm fordert den Benutzer auf, den Tag, den Monat und das Jahr des Startdatums nacheinander einzugeben.
2. **Eingabe der Anzahl an Tagen \( t \)**:
    - Das Programm fragt nach der Anzahl der Tage, die zum Startdatum addiert werden sollen.
3. **Berechnung des Enddatums**:
    - Das Programm berechnet mithilfe einer Schleife das Enddatum, das genau \( t \) Tage nach dem Startdatum liegt.

### Einschränkungen
- **Gültigkeit des Datums**: Das Programm darf sich beliebig verhalten, wenn das eingegebene Startdatum nicht existiert oder \( t \) keine positive Zahl ist.
- **Schaltjahre**: Die Existenz von Schaltjahren wird in den Berechnungen ignoriert.

### Beispielausführung

```
Bitte geben Sie die Tageskomponente des Startdatums ein.
27
Bitte geben Sie die Monatskomponente des Startdatums ein.
2
Bitte geben Sie die Jahreskomponente des Startdatums ein.
2024
Bitte geben Sie die Anzahl an Tagen ein:
365
Das Datum 27.2.2025 befindet sich 365 Tage nach dem Startdatum.
```

### Hinweise
- Der Java-Operator `%` kann für Berechnungen mit Restwerten verwendet werden. Für eine natürliche Zahl \( n \) und einen Divisor \( d \) gibt `n%d` den Rest der Division von \( n \) durch \( d \) zurück.
