import java.util.Scanner;
import java.math.*;

public class Main {
    public static void main(String[] args) {

        int epam_exercise;
        Scanner Scan_0 = new Scanner(System.in);
        System.out.print("Введите номер задания: ");
        epam_exercise = Scan_0.nextInt();

        float a, b, c, x, y;
        double z, R;
        long i, j;

        switch (epam_exercise) {

            case 1:
                /* START: EPAM-001 */
                System.out.println("EPAM-001:");

                System.out.print("Введите A: ");
                a = Scan_0.nextInt();
                System.out.print("Введите B: ");
                b = Scan_0.nextInt();
                System.out.print("Введите C: ");
                c = Scan_0.nextInt();

                System.out.print("Z = (a - 3) * b / 2 + c = ");
                z = (a - 3) * b / 2 + c;

                System.out.println(String.format("%.1f", z));

                /* END: EPAM-001 */

                break;

            case 2:
                /* START: EPAM-002 */
                System.out.println("EPAM-002:");

                System.out.print("Введите A: ");
                a = Scan_0.nextInt();
                System.out.print("Введите B: ");
                b = Scan_0.nextInt();
                System.out.print("Введите C: ");
                c = Scan_0.nextInt();

                System.out.print("Z = (b + math.sqrt(b^2 + 4 * a * c)) / (2 * a) - a^3 * c +  b^(-2) = ");
                z = (b + Math.sqrt(b*b + 4*a*c)) / (2*a) - Math.pow(a, 3) * c + Math.pow(b, -2);

                System.out.println(String.format("%.1f", z));

                /* END: EPAM-002 */

                break;

            case 3:
                /* START: EPAM-003 */
                System.out.println("EPAM-003:");

                System.out.print("Введите X: ");
                x = Scan_0.nextInt();
                System.out.print("Введите Y: ");
                y = Scan_0.nextInt();

                System.out.print("Z = ((sin(x) + cos(y)) / (cos(x) - sin(y))) * tg(x*y) = ");
                z = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x*y);

                System.out.println(String.format("%.1f", z));

                /* END: EPAM-003 */

                break;

            case 4:
                /* START: EPAM-004 */
                System.out.println("EPAM-004:");

                System.out.print("Введите R: ");
                R = Scan_0.nextDouble();

                System.out.print("R: xxx.yyy >>> yyy.xxx >>> ");

                /*
                i = (int) R;
                j = Math.round((R - i) * 1000);
                z = j + (double)i / 1000;
                 */

                z = Math.round((R - (int) R) * 1000) + (double)((int) R) / 1000;

                System.out.println(String.format("%.3f", z));

                /* END: EPAM-004 */

                break;

            case 5:

                break;

            case 6:

                break;

            case 7:

                break;

            case 8:

                break;

            case 9:

                break;

            case 10:

                break;

        }

    }
}

