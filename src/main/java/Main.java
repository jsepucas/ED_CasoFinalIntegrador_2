import java.util.Scanner;
import Habitats.Habitat;


public class Main {

    public static void main(String[] args) {
        System.out.println("Bienvenido al Zoo, seleccione una opción");
        System.out.println("1. Visitante");
        System.out.println("2. Empleado");
        System.out.println("3. Salir");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();

        switch(option) {
            case 1:
                System.out.println("Bienvenido visitante, elige una opción");
                System.out.println("1. Registrar un animal");
                System.out.println("2. Ver animales");
                System.out.println("3. Quiosco");
                System.out.println("4. Ver hábitats y cuidados");
                System.out.println("5. Salir");
                break;

            case 2:
                System.out.println("Bienvenido empleado, elige una opción");
                System.out.println("1. Registrar un animal");
                System.out.println("2. Ver animales");
                System.out.println("3. Quiosco");
                System.out.println("4. Ver hábitats y cuidados");
                System.out.println("5. Salir");
                break;


            case 3:
                System.out.println("Gracias por visitar el Zoo");
                break;

        }
    }

}
