//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static boolean isValidDate(int d, int m, int y) {
        if (m < 1 || m > 12 || d < 1 || y < 0) {
            return false;
        }
        int[] daysInMonth = {31, (isLeapDay(y) ? 29 : 28), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // 28 oder 29 nach bed. Ausdrück
        return d <= daysInMonth[m - 1];
    }

    public static boolean isLeapDay(int y) {
        return (y % 4 == 0 && y % 100 != 0) || y % 400 == 0;
    }

    public static String yourDate(int d, int m, int y, int i) {
        while (i != 0) {
            if ((m == 2 && d == (isLeapDay(y) ? 29 : 28)) || (m%2 == 1 && m < 8 && d == 31) || (m%2 == 0 && m < 8 && d == 30) || (m%2 == 1 && m > 8 && d == 30) || (m%2 == 0 && m >= 8 && d == 31)) {
                /*
                1. Monat: 2 = 28 oder 29
                2. Monaten: 1, 3, 5, 7 = 31
                3. Monaten: 4, 6 = 30
                4. Monaten: 9, 11 = 30
                5. Monaten: 8, 10, 12 = 31
                 */
                d = 1;
                if (m == 12) { //falls Monat 12 dann wird zu 1 statt m++
                    m = 1;
                    y++; //die Variable ist theoretisch unendlich, lass die erst in diesen Rahmen bleiben
                } else {
                    m++;
                }
            } else {
                d++;
            }
            i--;
        }

        return d + "." + m + "." + y;
    }

    public static void main(String[] args) {
        int day, month, year, interval;

        do {
            day = SimpleIO.getInt("Bitte geben Sie die Tageskomponente des Startdatums ein.");
            month = SimpleIO.getInt("Bitte geben Sie die Monatskomponente des Startdatums ein.");
            year = SimpleIO.getInt("Bitte geben Sie die Jahreskomponente des Startdatums ein.");
            interval = SimpleIO.getInt("Bitte geben Sie die Anzahl an Tagen ein:");

            if (!isValidDate(day, month, year)) {
                SimpleIO.output("Datum ungültig, machen Sie es bitte erneut.");
            } else if (interval < 0) {
                SimpleIO.output("Die Anzahl von Tagen muss nicht negativ sein.");
            }

        } while (!isValidDate(day, month, year) || interval < 0);

        System.out.println("Das Datum " + yourDate(day, month, year, interval) + " befindet sich " + interval + " Tage nach dem Startdatum.");
    }
}