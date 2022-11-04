package Java;

/**
 * C2 = 1 O1 = "-"
 * C3 = 1 C = 1
 * C5 = 1 O2 = "/"
 * C7 = 2 тип індексів i та j = int
 */
public class Main {
    public static void main(String[] args) {
        double S = 0;
        int a = 5;
        int n = 35;
        int b = 3;
        int m = 22;
        int C = 1;

        if (b <= 0 && m >= 0) {//Якщо потенціальне J може бути нулем
            System.out.println("j in range can be zero");
        } else if (a <= C && n >= C) {//Якщо потенціальне (i-C) може бути нулем
            System.out.println("(i-C) can be zero");
        } else {
            for (int i = a; i <= n; i++) {
                int znamennic = (i - C);
                for (int j = b; j <= m; j++) {
                    S += (((double) i / j) / znamennic);
                }
            }
        }
        System.out.println(S);
    }
}