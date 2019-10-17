package tech.dobler.adproblems;

/*
Ausgabenstellung:
Ähnlich wie der bereits bekannte "Größte Gemeinsame Teiler" (Greatest Common Divisor, GCD) findet auch das Kleinste
Gemeinsame Vielfache (Least Common Multiple, LCM) Anwendung in elementaren mathematischen Anwendungen, etwa bei der
Multiplikation von heterogenen Brüchen. Dies hat Anwendungen von der Anpassung von Kochrezepten an andere Portionsmengen
bis hin zur Berechnung von Planetenbahnen.

Der LCM ist wie folgt definiert:
a*b/gcd(a,b);

Implementieren Sie eine Funktion, die den LCM von zwei gegebenen Werten berechnet. Es darf dabei auf die GCD-
Implementation aus der Vorlesung zurück gegriffen werden.

Hinweis: Das Verwenden von "import" ist nicht gestattet.
 */

public class Übung1 {

    public void runAll() {
        int input1 = 6;
        int input2 = 15;
        int output1 = gcd(input1 ,input2);
        System.out.printf("%d = gcd(%d, %d)", output1, input1, input2);

        int output2 = lcm(input1 ,input2);
        System.out.printf("%d = gcd(%d, %d)", output2, input1, input2);
    }

    public int gcd(int n, int m) {
        assert m > 0 : "m > 0";
        if ( n < m && n != 0) {
            int temp = n;
            n = m;
            m = temp;
        }

        int r = n % m;
        return r > 0 ? gcd(m, r) : m;
    }

    public int lcm(int a, int b) {
        assert b >= 0 : "b > 0";
        assert gcd(a, b) >= 0 : "gcd(a, b) >= 0";

        return a*b/gcd(a,b);
    }
}
