package controlador;

import java.util.Scanner;

public class InputHelper {
    public static String getString(String message){
        System.out.println(message);
        String output = null;
        while (output == null){
            Scanner sc = new Scanner(System.in);
            output = sc.nextLine();
        }
        return output;
    }

    public static int getInteger(String message, int maxInclusive){
        int output = -1;
        while (output < 0 || output > maxInclusive) {
            try {
                System.out.println(message);
                Scanner sc = new Scanner(System.in);
                output = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Entrada no válida, introduzca un entero entre 0 y " + maxInclusive);
            }
        }
        return output;
    }
}
