import java.util.Scanner;
public class KombinasyonBulma {
    public static void main(String[] args) {

        int n, r, total1 = 1, total2 = 1, total3 = 1 , combinationSolve;
        Scanner input = new Scanner(System.in);

        System.out.println("C(n,r)");
        System.out.print("n ==> ");
        n = input.nextInt();
        System.out.print("r ==> ");
        r = input.nextInt();


        if (0 < r && 0 < n && r < n) {
            for (int i = 1; i <= n; i++) {
                total1 *= i;
            }
            for (int i2 = 1; i2 <= r; i2++) {
                total2 *= i2;
            }
            for (int i3 = 1; i3 <= (n - r); i3++) {
                total3 *= i3;
            }
            System.out.println("C(" + n + "," + r + ") Hesaplanıyor...");
        } else {
            System.out.println("Hatalı Giriş Yaptınız!!!");
            System.exit(0);
        }
        combinationSolve = total1 / (total2 * total3);
        System.out.println("Sonuç: "+combinationSolve);
    }
}
