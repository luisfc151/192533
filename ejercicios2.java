import java.util.Scanner;

public class ejercicios2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        int sueldosVIP = 0;          
        double totalSueldo = 0;      

        
        for (int i = 1; i <= 10; i++) {
            double sueldo;

           
            while (true) {
                System.out.print("Ingrese el sueldo del empleado " + i + ": ");
                sueldo = scanner.nextDouble();

                if (sueldo > 0) {
                    break; 
                } else {
                    System.out.println("¡Error! El sueldo debe ser positivo. ");
                }
            }

            
            if (sueldo >= 100 && sueldo <= 300) {
                 
            } else if (sueldo > 300) {
                sueldosVIP++; 
            }

            totalSueldo += sueldo;
        }

        
        System.out.println("Reporte Final:");
        System.out.println("Cantidad de sueldos en el rango de la justicia ($100 - $300): ");
        System.out.println("Cantidad de sueldos VIP (mayores a $300): " + sueldosVIP);
        System.out.printf("Total acumulado de sueldos: %.2f\n", (float) totalSueldo); 

        scanner.close();
    }
}

