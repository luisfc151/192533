import java.util.Scanner;

public class ReMal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nombre vendedor:");
        String a = scanner.nextLine();

        System.out.print("Cantidad de productos vendidos:");
        int p = scanner.nextInt();

        System.out.print("Ingrese valor producto 1:");
        double x1 = scanner.nextDouble();

        System.out.print("Ingrese valor producto 2:");
        double x2 = scanner.nextDouble();

        System.out.print("Ingrese valor producto 3:");
        double x3 = scanner.nextDouble();

        System.out.print("Ingrese valor producto 4:");
        double x4 = scanner.nextDouble();

        System.out.print("Ingrese valor producto 5:");
        double x5 = scanner.nextDouble();

        System.out.print("Ingrese valor producto 6:");
        double x6 = scanner.nextDouble();

        System.out.print("Ingrese valor producto 7:");
        double x7 = scanner.nextDouble();

        double s1 = 0;
        double s2 = 0;
        double s3 = 0;
        double s4 = 0;
        double s5 = 0;
        double s6 = 0;
        double s7 = 0;

        if (x1 >= 100000) {
            s1 = s1 + (x1 * 0.10);
        } else {
            s1 = s1 + (x1 * 0.05);
        }

        if (x2 >= 100000) {
            s2 = s2 + (x2 * 0.10);
        } else {
            s2 = s2 + (x2 * 0.05);
        }

        if (x3 >= 100000) {
            s3 = s3 + (x3 * 0.10);
        } else {
            s3 = s3 + (x3 * 0.05);
        }

        if (x4 >= 100000) {
            s4 = s4 + (x4 * 0.10);
        } else {
            s4 = s4 + (x4 * 0.05);
        }

        if (x5 >= 100000) {
            s5 = s5 + (x5 * 0.10);
        } else {
            s5 = s5 + (x5 * 0.05);
        }

        if (x6 >= 100000) {
            s6 = s6 + (x6 * 0.10);
        } else {
            s6 = s6 + (x6 * 0.05);
        }

        if (x7 >= 100000) {
            s7 = s7 + (x7 * 0.10);
        } else {
            s7 = s7 + (x7 * 0.05);
        }

        double tt = x1 + x2 + x3 + x4 + x5 + x6 + x7;
        double ss = (double) (s1 + s2 + s3 + s4 + s5 + s6 + s7);

        System.out.println("Vendedor: " + a);
        System.out.println("Total ventas: " + (int)tt);
        System.out.println("Comisiones: " + (int)s1);
        System.out.println("Salario total: " + (int)ss);
    }
}
