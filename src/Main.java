//Universidad del Valle de Guatemala
//Andrew Alexander Arrivillaga Arana
//#241018

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        String Comida;
        int Cantidad;

        //Crear la lista para los menus, para que el usuario pueda agregar los platos que ellos quieran :P
        List<Menu> MVl = new ArrayList<>();
        List<Menu> MVc = new ArrayList<>();
        List<Menu> MSG = new ArrayList<>();
        List<Menu> ME = new ArrayList<>();
        //Se guardara una Lista de Invitados
        List<Invitados> invitados = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvendio a BodasGT");
        for (int n = 0; n == 0; ) {
            System.out.println("Desea ver las Opciones de Host o de Invitado?" +
                    "\n0. Salir" +
                    "\n1. Host" +
                    "\n2. Invitado");

            int opc1 = sc.nextInt();
            switch (opc1) {
                case 0:
                    System.out.println("Cerrando Aplicacion");
                    n = 1;
                    break;
                case 1:
                    for (int a = 0; a == 0; ) {
                        System.out.println("Que accion desea tomar? :" +
                                "\n0. Regresar" +
                                "\n1. Ver/Editar Menus" +
                                "\n2. Agregar Invitados" +
                                "\n3. Ver Lista de Invitados" +
                                "\n4. Ver estadistica de Menu");
                        int opc2 = sc.nextInt();
                        switch (opc2) {
                            case 0:
                                System.out.println("Regresando...");
                                a = 1;
                                break;
                            case 1:
                                for (int z = 0; z == 0; ) {
                                    //imprimimos lista de cada menu y sus platos para que el Host pueda ver
                                    System.out.println("            Menus:");
                                    System.out.println("\nMenú Vegetariano:");
                                    for (int i = 0; i < MVl.size(); i++) {
                                        System.out.println((i + 1) + ". " + MVl.get(i)); //Imprimir la lista del menu agregando un n+1 y . para que quede como 1. blah, 2. bleh
                                    }
                                    if (MVl.isEmpty()) {
                                        System.out.println("No hay opciones");
                                    }
                                    System.out.println("\nMenú Vegano:");
                                    for (int i = 0; i < MVc.size(); i++) {
                                        System.out.println((i + 1) + ". " + MVc.get(i));
                                    }
                                    if (MVc.isEmpty()) {
                                        System.out.println("No hay opciones");
                                    }
                                    System.out.println("\nMenú Sin Gluten:");
                                    for (int i = 0; i < MSG.size(); i++) {
                                        System.out.println((i + 1) + ". " + MSG.get(i));
                                    }
                                    if (MSG.isEmpty()) {
                                        System.out.println("No hay opciones");
                                    }
                                    System.out.println("\nMenú Estándar:");
                                    for (int i = 0; i < ME.size(); i++) {
                                        System.out.println((i + 1) + ". " + ME.get(i));
                                    }
                                    if (ME.isEmpty()) {
                                        System.out.println("No hay opciones");
                                    }
                                    System.out.println("Que accion desea tomar? :" +
                                            "\n0. Regresar" +
                                            "\n1. Editar Menus");
                                    int opc9 = sc.nextInt();
                                    switch (opc9) {
                                        case 0:
                                            System.out.println("Regresando...");
                                            z = 1;
                                            break;
                                        case 1:
                                            for (int h = 0; h == 0; ) {
                                                //Se esocoge a que menu el Host desea agregarle un plato y cuantas unidades
                                                System.out.println("Que menu desea editar? :" +
                                                        "\n0. Regresar" +
                                                        "\n1. Menú Vegetariano" +
                                                        "\n2. Menú Vegano" +
                                                        "\n3. Menú Sin Gluten" +
                                                        "\n4. Menú Estándar");
                                                int opc3 = sc.nextInt();
                                                switch (opc3) {
                                                    case 0:
                                                        System.out.println("Regresando...");
                                                        h = 1;
                                                        break;
                                                    case 1:
                                                        System.out.print("Ingrese el nombre del Plato: ");
                                                        Comida = sc.next();
                                                        System.out.print("Ingrese la cantidad de platos que hay disponibles: ");
                                                        Cantidad = sc.nextInt();

                                                        Menu nuevoMenu = new Menu(Comida, Cantidad); // Se guarda el plato con su cantidad en su propio cajita en el menu correspondiente
                                                        MVl.add(nuevoMenu);
                                                        System.out.println("Plato agregada");
                                                        break;
                                                    case 2:
                                                        System.out.print("Ingrese el nombre del Plato: ");
                                                        Comida = sc.next();
                                                        System.out.print("Ingrese la cantidad de platos que hay disponibles: ");
                                                        Cantidad = sc.nextInt();

                                                        nuevoMenu = new Menu(Comida, Cantidad);
                                                        MVc.add(nuevoMenu);
                                                        System.out.println("Plato agregada");
                                                        break;
                                                    case 3:
                                                        System.out.print("Ingrese el nombre del Plato: ");
                                                        Comida = sc.next();
                                                        System.out.print("Ingrese la cantidad de platos que hay disponibles: ");
                                                        Cantidad = sc.nextInt();

                                                        nuevoMenu = new Menu(Comida, Cantidad);
                                                        MSG.add(nuevoMenu);
                                                        System.out.println("Plato agregada");
                                                        break;
                                                    case 4:
                                                        System.out.print("Ingrese el nombre del Plato: ");
                                                        Comida = sc.next();
                                                        System.out.print("Ingrese la cantidad de platos que hay disponibles: ");
                                                        Cantidad = sc.nextInt();

                                                        nuevoMenu = new Menu(Comida, Cantidad);
                                                        ME.add(nuevoMenu);
                                                        System.out.println("Plato agregada");
                                                        break;
                                                }
                                            }
                                    }
                                }
                                break;
                            case 2:
                                System.out.print("Ingrese el Primer nombre del Invitado: ");
                                String Name = sc.next().toUpperCase(); // Esto es una Mousekeherramienta que nos ayudara en el futuro
                                System.out.print("Ingrese el Apellido del Invitado: ");
                                String LastName = sc.next().toUpperCase();
                                System.out.print("Menu recomendado" +
                                        "\n1. Menú Vegetariano" +
                                        "\n2. Menú Vegano" +
                                        "\n3. Menú Sin Gluten" +
                                        "\n4. Menú Estándar");
                                int opc4 = sc.nextInt();
                                Menu pR = null; // Esto nos permitira poder meter uno de los platos en en plato recomendado sin tenerlo que escribir manual.
                                int platoSeleccionado;
                                switch (opc4) {
                                    case 1:
                                        if (MVl.isEmpty()) { //Si no hay platos en el menu
                                            System.out.println("No hay platos disponibles.");
                                            break;
                                        }
                                        System.out.print("Escoja el plato recomendado\n");
                                        for (int i = 0; i < MVl.size(); i++) {
                                            System.out.println((i + 1) + ". " + MVl.get(i));
                                        }
                                        platoSeleccionado = sc.nextInt();
                                        pR = MVl.get(platoSeleccionado - 1);
                                        break;
                                    case 2:
                                        if (MVc.isEmpty()) {
                                            System.out.println("No hay platos disponibles.");
                                            break;
                                        }
                                        System.out.print("Escoja el plato recomendado\n");
                                        for (int i = 0; i < MVc.size(); i++) {
                                            System.out.println((i + 1) + ". " + MVc.get(i));
                                        }
                                        platoSeleccionado = sc.nextInt();
                                        pR = MVc.get(platoSeleccionado - 1);
                                        break;
                                    case 3:
                                        if (MSG.isEmpty()) {
                                            System.out.println("No hay platos disponibles.");
                                            break;
                                        }
                                        System.out.print("Escoja el plato recomendado\n");
                                        for (int i = 0; i < MSG.size(); i++) {
                                            System.out.println((i + 1) + ". " + MSG.get(i));
                                        }
                                        platoSeleccionado = sc.nextInt();
                                        pR = MSG.get(platoSeleccionado - 1);
                                        break;
                                    case 4:
                                        if (ME.isEmpty()) {
                                            System.out.println("No hay platos disponibles.");
                                            break;
                                        }
                                        System.out.print("Escoja el plato recomendado\n");
                                        for (int i = 0; i < ME.size(); i++) {
                                            System.out.println((i + 1) + ". " + ME.get(i));
                                        }
                                        platoSeleccionado = sc.nextInt();
                                        pR = ME.get(platoSeleccionado - 1);
                                        break;
                                }
                                if (pR != null) {
                                    if (pR.getCantidad() > 0) { //Se revisa que si hay platos en esta opcion
                                        pR.setCantidad(pR.getCantidad() - 1); //Se resta un plato del cantidad total
                                        Invitados nuevoInvitados = new Invitados(Name, LastName, pR);
                                        invitados.add(nuevoInvitados);
                                        System.out.println("Invitado agregado exitosamente");
                                    } else {
                                        System.out.println("No hay suficiente cantidad del plato seleccionad.");
                                    }
                                }
                                break;

                            case 3:
                                System.out.println("Lista de Invitados:");
                                for (Invitados inv : invitados) { //imprime una lista de invitados
                                    System.out.println(inv);
                                }
                                break;
                            case 4:
                                System.out.println("Estadisticas de los Menus:"); //imprime la lista de platos
                                System.out.println("Menú Vegetariano:");
                                for (Menu menu : MVl) {
                                    System.out.println(menu);
                                }
                                System.out.println("\nMenú Vegano:");
                                for (Menu menu : MVc) {
                                    System.out.println(menu);
                                }
                                System.out.println("\nMenú Sin Gluten:");
                                for (Menu menu : MSG) {
                                    System.out.println(menu);
                                }
                                System.out.println("\nMenú Estándar:");
                                for (Menu menu : ME) {
                                    System.out.println(menu);
                                }
                            break;
                        }
                    }
                    break;

                case 2:
                    System.out.println("Porfavor Ingrese su Primer nombre");
                    String NameInput = sc.next().toUpperCase();
                    System.out.print("Ingrese su Apellido: ");
                    String LastNameInput = sc.next().toUpperCase();
                    boolean invitadoEncontrado = false;

                    for (Invitados invitado : invitados) { //Aqui usamos la Mousekeherramienta para validar si la persona si fue invitada a la fiesta o no
                        if (invitado.getName().equals(NameInput) && invitado.getLastName().equals(LastNameInput)) {
                            invitadoEncontrado = true;
                            System.out.println("Bienvenido, " + NameInput + " " + LastNameInput + " Tu plato seleccionado es: " + invitado.getpR().getComida());
                            for (int x = 0; x == 0; ) {
                                System.out.println("Que Desea revisar:" +
                                        "\n0. Salir" +
                                        "\n1. Revisar Menus" +
                                        "\n2. Editar tu menu");
                                int opc6 = sc.nextInt();
                                switch (opc6) {
                                    case 0:
                                        System.out.println("Regresando...");
                                        x = 1;
                                        break;
                                    case 1: // se revisan los menus
                                        System.out.println("Menú Vegetariano:");
                                        for (Menu menu : MVl) {
                                            System.out.println(menu);
                                        }
                                        System.out.println("\nMenú Vegano:");
                                        for (Menu menu : MVc) {
                                            System.out.println(menu);
                                        }
                                        System.out.println("\nMenú Sin Gluten:");
                                        for (Menu menu : MSG) {
                                            System.out.println(menu);
                                        }
                                        System.out.println("\nMenú Estándar:");
                                        for (Menu menu : ME) {
                                            System.out.println(menu);
                                        }
                                        break;
                                    case 2:
                                        System.out.println("Seleccione un nuevo menú recomendado" +
                                                "\n1. Menú Vegetariano" +
                                                "\n2. Menú Vegano" +
                                                "\n3. Menú Sin Gluten" +
                                                "\n4. Menú Estándar");
                                        int opc7 = sc.nextInt();
                                        Menu nuevopR = null; //Se crea un nuevo plato para poder remplazar el viejo si el usuario desea
                                        boolean platoValido = false;
                                        switch (opc7) {
                                            case 1:
                                                if (MVl.isEmpty()) { //imprimir los menus como siempre
                                                    System.out.println("No hay platos disponibles en el Menú.");
                                                    break;
                                                }
                                                System.out.println("Escoja un plato del Menú Vegetariano:");
                                                for (int i = 0; i < MVl.size(); i++) {
                                                    System.out.println((i + 1) + ". " + MVl.get(i));
                                                }
                                                int seleccionVegetariano = sc.nextInt();
                                                nuevopR = MVl.get(seleccionVegetariano - 1);
                                                if (nuevopR.getCantidad() > 0) {
                                                    platoValido = true;
                                                } else {
                                                    System.out.println("No hay suficientes platos disponibles para este menú.");
                                                }
                                                break;
                                            case 2:
                                                if (MVc.isEmpty()) {
                                                    System.out.println("No hay platos disponibles en el Menú.");
                                                    break;
                                                }
                                                System.out.println("Escoja un plato del Menú Vegano:");
                                                for (int i = 0; i < MVc.size(); i++) {
                                                    System.out.println((i + 1) + ". " + MVc.get(i));
                                                }
                                                int seleccionVegano = sc.nextInt();
                                                nuevopR = MVc.get(seleccionVegano - 1);
                                                if (nuevopR.getCantidad() > 0) {
                                                    platoValido = true;
                                                } else {
                                                    System.out.println("No hay suficientes platos disponibles para este menú.");
                                                }
                                                break;
                                            case 3:
                                                if (MSG.isEmpty()) {
                                                    System.out.println("No hay platos disponibles.");
                                                    break;
                                                }
                                                System.out.println("Escoja un plato del Menú Sin Gluten:");
                                                for (int i = 0; i < MSG.size(); i++) {
                                                    System.out.println((i + 1) + ". " + MSG.get(i));
                                                }
                                                int seleccionSinGluten = sc.nextInt();
                                                nuevopR = MSG.get(seleccionSinGluten - 1);
                                                if (nuevopR.getCantidad() > 0) {
                                                    platoValido = true;
                                                } else {
                                                    System.out.println("No hay suficientes platos disponibles para este menú.");
                                                }
                                                break;
                                            case 4:
                                                if (ME.isEmpty()) {
                                                    System.out.println("No hay platos disponibles.");
                                                    break;
                                                }
                                                System.out.println("Escoja un plato del Menú Estándar:");
                                                for (int i = 0; i < ME.size(); i++) {
                                                    System.out.println((i + 1) + ". " + ME.get(i));
                                                }
                                                int seleccionEstandar = sc.nextInt();
                                                nuevopR = ME.get(seleccionEstandar - 1);
                                                if (nuevopR.getCantidad() > 0) {
                                                    platoValido = true;
                                                } else {
                                                    System.out.println("No hay suficientes platos disponibles para este menú.");
                                                }
                                                break;
                                            default:
                                                System.out.println("Opción inválida.");
                                                break;
                                        }
                                        if (nuevopR!= null) {
                                            invitado.setpR(nuevopR); //Se remplazo el menu despues de 30 lineas :)
                                            System.out.println("Plato cambiado a: " + nuevopR.getComida());
                                        }
                                        break;
                                }
                            }
                        }
                        break;
                    }
                    if (!invitadoEncontrado) { //Si no fuiste invitado a la fiesta :(
                        System.out.println("Lo siento, " + NameInput + " " + LastNameInput + ". Usted no está en la lista de invitados.");
                        break;
                    }
                break;
            }
        }
    }
}

