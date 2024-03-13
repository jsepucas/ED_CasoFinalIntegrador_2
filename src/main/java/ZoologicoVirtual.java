import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Asegúrate de tener tus clases de animales y hábitats correctamente definidas en paquetes.
import Animales.*;
import Habitats.*;
import InteracciónVisitante.*;
import Recursos.*;

public class ZoologicoVirtual {

    public static void main(String[] args) {
        List<Animal> animales = new ArrayList<>();
        List<Habitat> Habitats = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        //hábitats creados
        Habitats.add(new H_Acuaticos("Hábitat de tiburones", 25, 80, true, 100));
        Habitats.add(new H_Acuaticos("Hábitat de delfines", 25, 80, true, 100));
        Habitats.add(new H_Terrestre("Hábitat de leones", 25, 80, false, "Sabana", "Diurno"));
        Habitats.add(new H_Terrestre("Hábitat de tigres", 25, 80, false, "Selva", "Nocturno"));
        Habitats.add(new H_Aviarios("Hábitat de águilas", 25, 80, true, 100, "Rapaz"));
        Habitats.add(new H_Aviarios("Hábitat de colibríes", 25, 80, true, 100, "Paseriforme"));
        Habitats.add(new H_Insectos("Hábitat de hormigas", 25, 80, true, 100, "Hormigas"));
        Habitats.add(new H_Insectos("Hábitat de abejas", 25, 80, true, 100, "Abejas"));


        while (true) {
            System.out.println("\n Bienvenido al zoológico de la Universidad Alfonso X el Sabio \uD83D\uDC4B\u200B, eres un:");
            System.out.println("1. Visitante :) \u200B\uD83E\uDD35");
            System.out.println("2. Trabajador :) \uD83D\uDC77\u200D♂\uFE0F\u200B    ");
            System.out.println("3. Salir \uD83D\uDEAA");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva lí nea

            if (choice == 1) { // Visitante
                int choiceVisitante;
                while (true) {
                    System.out.println("---- Bienvenido al UAX Zoo 😀 ----");
                    System.out.println("¿Qué deseas realizar?:");
                    System.out.println("1. Quiero crear un animal! \uD83D\uDC3C\u200B");
                    System.out.println("2. Quiero ver los animales creados por mi \uD83D\uDC15\u200B");
                    System.out.println("3. Quiero ver hábitats de animales \uD83C\uDFDD\uFE0F\u200B");
                    System.out.println("4. Quiero uno de los tours personalizados \uD83E\uDDF3\u200B");
                    System.out.println("5. Quiero ver información sobre el zoológico (Quiosco) \uD83D\uDCF0\u200B");
                    System.out.println("6. Quiero salir al menú principal \uD83D\uDEAA");

                    System.out.println("Nota: si has creado un animal o vas a hacerlo, puedes visualizarlo en la opción 2.");

                    choiceVisitante = scanner.nextInt();
                    scanner.nextLine();

                    if (choiceVisitante == 1) {
                        System.out.println("¿Qué tipo de animal desea crear?");
                        System.out.println("1. Acuático");
                        System.out.println("2. Terrestre");
                        System.out.println("3. Aviario");
                        System.out.println("4. Insecto");
                        int tipoAnimal = scanner.nextInt();
                        scanner.nextLine(); // Consumir la nueva línea

                        // Variables comunes para todos los animales
                        String nombre, estadoSalud, dieta;
                        int edad;
                        double peso;
                        boolean vacunado, esteril;

                        // Solicitar información común
                        System.out.println("Ingrese el nombre del animal:");
                        nombre = scanner.nextLine();
                        System.out.println("Ingrese la edad del animal:");
                        edad = scanner.nextInt();
                        System.out.println("Ingrese el peso del animal (solo num en kg):");
                        peso = scanner.nextDouble();
                        scanner.nextLine(); // Consumir la nueva línea después de leer un número
                        System.out.println("Ingrese el estado de salud del animal (Saludable / No saludable:");
                        estadoSalud = scanner.nextLine();
                        System.out.println("¿Está vacunado? (true/false):");
                        vacunado = scanner.nextBoolean();
                        System.out.println("¿Está esterilizado? (true/false):");
                        esteril = scanner.nextBoolean();
                        scanner.nextLine(); // Consumir la nueva línea

                        // Crear el animal según el tipo seleccionado
                        switch (tipoAnimal) {
                            case 1: // Acuático

                                System.out.println("Ingrese el tipo de agua (dulce/salada):");
                                String tipoAgua = scanner.nextLine();
                                System.out.println("Ingrese el método de respiración (Pulmones o branqueas):");
                                String metodoRespiracion = scanner.nextLine();
                                System.out.println("Ingrese la profundidad preferida:");
                                int profundidadPreferida = scanner.nextInt();
                                scanner.nextLine(); // Consumir la nueva línea
                                System.out.println("Ingrese la dieta del animal (¿Es saludable o no saludable?):");
                                dieta = scanner.nextLine();
                                animales.add(new A_Acuaticos(nombre, edad, peso, estadoSalud, vacunado, esteril, tipoAgua, metodoRespiracion, profundidadPreferida, dieta));
                                break;


                            case 2:// Terrestre


                                System.out.println("Ingrese el tipo de hábitat (selva, desierto, sabana, etc.):");
                                String tipoHabitat = scanner.nextLine();
                                System.out.println("Ingrese el nivel de actividad (diurno/nocturno):");
                                String nivelActividad = scanner.nextLine();
                                System.out.println("Ingrese el tipo de alimentación (carnívoro, herbívoro, omnívoro):");
                                String tipoAlimentacion = scanner.nextLine();
                                System.out.println("Ingrese la dieta del animal (¿Es saludable o no saludable?):");
                                dieta = scanner.nextLine();
                                animales.add(new A_Terrestre(nombre, edad, peso, estadoSalud, vacunado, esteril, tipoHabitat, nivelActividad, tipoAlimentacion, dieta));

                                break;
                            case 3: // Aviario


                                System.out.println("Ingrese el tipo de ave (ejemplo: rapaz, paseriforme):");
                                String tipoAve = scanner.nextLine();
                                System.out.println("Ingrese si el ave puede volar (true para sí, false para no):");
                                boolean puedeVolar = scanner.nextBoolean();
                                scanner.nextLine(); // Consumir la nueva línea que queda después de leer el booleano
                                System.out.println("Ingrese la alimentación del ave (ejemplo: insectívoro, frugívoro, omnívoro):");
                                String alimentacion = scanner.nextLine();

                                animales.add(new A_Aviarios(nombre, edad, peso, estadoSalud, vacunado, esteril, tipoAve, puedeVolar, alimentacion));

                                break;
                            // Solicitar información específica para aves y crear el objeto correspondiente
                            case 4: // Insecto

                                System.out.println("Ingrese el número de patas:");
                                String numeroPatas = scanner.nextLine();
                                System.out.println("¿Tiene alas? (true/false):");
                                boolean tieneAlas = scanner.nextBoolean();
                                scanner.nextLine(); // Consumir la nueva línea que queda después de leer el booleano
                                System.out.println("Ingrese el tipo de alimentación:");
                                String alimentos = scanner.nextLine();
                                System.out.println("Ingrese el habitat del insecto");
                                String habitat = scanner.nextLine();
                                System.out.println("¿Es beneficioso para el ser humano? (true/false):");
                                String esBenefiicoso = scanner.nextLine();

                                animales.add(new A_Insectos(nombre, edad, peso, estadoSalud, vacunado, esteril, numeroPatas, tieneAlas, alimentos, habitat, esBenefiicoso));
                                break;
                            // Solicitar información específica para insectos y crear el objeto correspondiente
                            default:
                                System.out.println("Tipo de animal no válido.");
                                break;
                        }
                        System.out.println("Animal creado con éxito.");
                        break;

                    } else if (choiceVisitante == 2) {

                        if (animales.isEmpty()) {
                            System.out.println("No has creado ningún animal aún.");
                        } else {
                            System.out.println("Animales creados por ti:");
                            for (Animal animal : animales) {
                                System.out.println(animal.toString()); // Asegúrate de tener implementado el método toString en tus clases de animales.
                            }


                        }

                    } if (choiceVisitante == 3) { //Ver hábitats
                        System.out.println("¿Qué tipo de hábitat deseas ver?");
                        System.out.println("1. Acuático");
                        System.out.println("2. Terrestre");
                        System.out.println("3. Aviario");
                        System.out.println("4. Insecto");
                        int tipoHabitat = scanner.nextInt();
                        scanner.nextLine(); // Consumir la nueva línea

                        switch (tipoHabitat) {
                            case 1: // Acuático
                                System.out.println("Hábitats acuáticos:");
                                for (Habitat habitat : Habitats) {
                                    if (habitat instanceof H_Acuaticos) {
                                        System.out.println(habitat.toString());
                                    }
                                }
                                break;
                            case 2: // Terrestre
                                System.out.println("Hábitats terrestres:");
                                for (Habitat habitat : Habitats) {
                                    if (habitat instanceof H_Terrestre) {
                                        System.out.println(habitat.toString());
                                    }
                                }
                                break;
                            case 3: // Aviario
                                System.out.println("Hábitats aviarios:");
                                for (Habitat habitat : Habitats) {
                                    if (habitat instanceof H_Aviarios) {
                                        System.out.println(habitat.toString());
                                    }
                                }
                                break;
                            case 4: // Insecto
                                System.out.println("Hábitats de insectos:");
                                for (Habitat habitat : Habitats) {
                                    if (habitat instanceof H_Insectos) {
                                        System.out.println(habitat.toString());
                                    }
                                }
                                break;
                            default:
                                System.out.println("Tipo de hábitat no válido.");
                                break;
                        }
                    } else if (choiceVisitante == 4) { // Tours personalizados
                        System.out.println(" \n HOLA!, Elige el tipo de tour que prefieres:");
                        System.out.println(" 1. Tour para Niños. " );
                        System.out.println(" 2. Tour para Aficionados a Aviarios.");
                        System.out.println(" 3. Tour para Amantes de Terrestres.");
                        System.out.println(" 4. Tour para Fans de Acuáticos.");
                        System.out.println(" 5. Tour para Amantes de Insectos.");
                        int opcionTour = scanner.nextInt();
                        scanner.nextLine(); // Consumir la nueva línea después de la entrada del número

                        ToursPersonalizados tour;
                        switch (opcionTour) {
                            case 1:
                                tour = new TourParaNiños();
                                break;
                            case 2:
                                tour = new TourAficionadosAviarios();
                                break;
                            case 3:
                                tour = new TourAmantesTerrestres();
                                break;
                            case 4:
                                tour = new TourFansAcuaticos();
                                break;
                            case 5:
                                tour = new TourAmantesInsectos();
                                break;
                            default:
                                System.out.println("Opción no válida, por favor elige un tour disponible.");
                                continue;
                        }
                        tour.mostrarTour();



                    } else if (choiceVisitante == 5) { // Quiosco
                        System.out.println("Bienvenido al Quiosco Interactivo. ¿Qué información te gustaría obtener?");
                        System.out.println("1. Información sobre Animales");
                        System.out.println("2. Información sobre Hábitats");
                        System.out.println("3. Información sobre Eventos Especiales");
                        int opcionQuiosco = scanner.nextInt();
                        scanner.nextLine(); // Consumir la nueva línea

                        Quiosco quiosco; // Usamos la clase base Quiosco para referenciar a las subclases.
                        switch (opcionQuiosco) {
                            case 1:
                                quiosco = new Q_Animales();
                                break;
                            case 2:
                                quiosco = new Q_Habitats();
                                break;
                            case 3:
                                quiosco = new Q_Eventos();
                                break;
                            default:
                                System.out.println("Opción no válida.");
                                continue; // Esto regresa al menú de selección principal de visitante.
                        }
                        quiosco.mostrarInformacion(); // Llamamos al método para mostrar la información.


                    } else if (choiceVisitante == 6) {

                        System.out.println("¿Estás seguro de querer salir?");
                        System.out.println("1. Sí");
                        System.out.println("2. No, quiero volver a la terminal");


                        break;
                    }

                }
            } if (choice == 2) { // Trabajador

                System.out.println("\n ---- Bienvenido al UAX Zoo 🛠️ ----");

                System.out.println("¿Qué deseas realizar?:");
                System.out.println("1. Administración de animales");
                System.out.println("2. Seguridad del Zoológico");
                System.out.println("3. Recursos de los animales");
                System.out.println("4. Ver pedidos pendientes del Zoológic");
                System.out.println("5. Salir al menú");

                int choiceTrabajador = scanner.nextInt();
                scanner.nextLine();

                if (choiceTrabajador == 1){
                    System.out.println("¿Qué quieres ver?");
                }
                else if (choiceTrabajador == 2){
                    System.out.println("¿Qué quieres ver?");
                }
                else if (choiceTrabajador == 3){

                    System.out.println("Gestión de Recursos del Zoológico");
                    System.out.println("1. Ver recursos disponibles");
                    System.out.println("2. Añadir nuevo recurso");
                    System.out.println("3. Volver");
                    int opcionRecursos = scanner.nextInt();
                    scanner.nextLine();


// Dentro de tu case 2: Trabajador, después de tus opciones existentes:
                    if (choiceTrabajador == 3) { // Recursos de los animales
                        System.out.println("Gestión de Recursos del Zoológico");
                        System.out.println("1. Ver recursos disponibles");
                        System.out.println("2. Añadir nuevo recurso");
                        System.out.println("3. Volver");
                        opcionRecursos = scanner.nextInt();
                        scanner.nextLine(); // Consumir la nueva línea

                        switch (opcionRecursos) {
                            case 1:

                                System.out.println("Recursos disponibles:");
                                break;
                            case 2:
                                System.out.println("Añadiendo nuevo recurso:");
                                break;
                            case 3:

                                break;
                            default:
                                System.out.println("Opción no válida.");
                                break;
                        }
                    }
                    else if (choiceTrabajador == 4){
                        System.out.println("¿Qué quieres ver?");
                    }
                    else if (choiceTrabajador == 5){
                        System.out.println("¿Estás seguro de querer salir?");
                        System.out.println("1. Sí");
                        System.out.println("2. No, quiero volver a la terminal");
                    }


                    scanner.close();



                }if (choice == 3) { // Opción de Salir
                    System.out.println("¿Estás seguro de querer salir?");
                    System.out.println("1. Sí");
                    System.out.println("2. No, quiero volver a la terminal");

                    int confirmacionSalida = scanner.nextInt();
                    scanner.nextLine(); // Consumir la nueva línea

                    if (confirmacionSalida == 1) {
                        System.out.println("Gracias por visitar el zoológico. ¡Hasta pronto!");
                        break; // Rompe el bucle y termina el programa
                    } else if (confirmacionSalida == 2) {
                        continue; // Regresa al menú principal
                    } else {
                        System.out.println("Opción no válida. Volviendo al menú principal.");
                        continue; // Regresa al menú principal
                    }

                }
            }
        }}}


