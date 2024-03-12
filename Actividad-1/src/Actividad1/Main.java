
package Actividad1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cual es tu nombre? ");
        String nombre = scanner.nextLine();

        System.out.println("Eres residente? (true/false) ");
        boolean residente = scanner.nextBoolean();

        System.out.println("Cual es tu Genero? (M/F) ");
        char genero = scanner.next().charAt(0);

        System.out.println("Cual es tu edad? ");
        byte edad = scanner.nextByte();

        System.out.println("Cual es tu fecha de nacimiento? ");
        short fecha = scanner.nextShort();

        System.out.println("Cual es tu numero de telefono? ");
        int no = scanner.nextInt();

        System.out.println("Cual es tu altura? ");
        float altura = scanner.nextFloat();

        System.out.println("Cual es tu ID? ");
        long ID = scanner.nextLong();

    }
}