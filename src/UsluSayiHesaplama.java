
import java.util.Scanner;
public class UsluSayiHesaplama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int total = 1, n, k , i;

        System.out.print("Tabanı Giriniz: ");
        n = input.nextInt();
        System.out.print("Üssü Giriniz: ");
        k = input.nextInt();
        System.out.println("("+n+")^("+k+") Hesaplanıyor...");

        if (0 < n && 0 < k) {
            for ( i = 1 ; i <= k ; i++ ) {
                total *= n;
            }
            System.out.println("Sonuç: " + total);

        } else if (0 < n && k < 0) {
            for ( i = -1 ; k <= i ; k++ ) {
                total *= n;
            }
            System.out.println("Sonuç: 1/" + total);

        } else if (n < 0 && 0 < k) {
            if (k % 2 != 0) {
                for ( i = 1 ; i <= k ; i++ ) {
                    total *= -n;
                }
                System.out.print("Sonuç: -" + total);

            } else {
                for ( i = 1 ; i <= k ; i++ ) {
                    total *= -n;
                }
                System.out.println("Sonuç: " + total);
            }

        } else if (n < 0 && k < 0) {
            if (k % 2 != 0) {
                for ( i = -1 ; k <= i ; k++ ) {
                    total *= -n;
                }
                System.out.print("Sonuç: -1/" + total);

            } else {
                for ( i = -1 ; k <= i ; k++ ) {
                    total *= -n;
                }
                System.out.print("Sonuç: 1/" + total);
            }

        } else if (0 == n) {
            System.out.print("Sonuç: "+1);
        }
    }
}
