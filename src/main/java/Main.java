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

        switch(option){
            case 1:
                System.out.println("Bienvenido visitante");
                Habitat habitat = new Habitat();
                habitat.showAnimals();
                break;
            case 2:
                System.out.println("Bienvenido empleado");
                break;
            case 3:
                System.out.println("Adios");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }


    }

}
