import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.print("\033[H\033[2J");
    Scanner input = new Scanner(System.in);
    Tasks[] task = new Tasks[5];
    String menu;
    int j = 0;

    // Bienvenida y Menu
    do {
      System.out.println("Bievenido! Elija una opcion");
      System.out.println("1) Ingresar tareas nuevas");
      System.out.println("2) Mostrar tareas ingresadas");
      System.out.println("3) Finalizar");
      menu = input.nextLine();
      switch (menu) {
        // Ingresar tareas nuevas
        case "1":
          System.out.print("\033[H\033[2J");
          if (j == task.length) {
            System.out.println("Ya se ingreso el maximo de tareas");
          }
          else {
            for (int i = j; i < task.length; i++) {
              System.out.print("Ingrese Nombre Tarea N" + (i + 1) + " = ");
              String nameMain = input.nextLine();
              System.out.print("Ingrese Descripcion Tarea N" + (i + 1) + " = ");
              String descriptionMain = input.nextLine();
              task[i] = new Tasks(nameMain, descriptionMain);
              j = j + 1;
              if (j != task.length) {
                System.out.println("Desea agregar mas Tareas? (Si/No)");
                String choice = input.nextLine();
                while (!choice.equals("No") && !choice.equals("Si")) {
                  System.out.println("Elija una opcion valida");
                  choice = input.nextLine();
                }
                if (choice.equals("No")) {
                  break;
                }
              }
            }
          }
          break;
        // Mostrar tareas ingresadas
        case "2":
          System.out.print("\033[H\033[2J");
          if (j == 0) {
            System.out.println("No hay tareas");
          }
          else {
            for (int i = 0; i < task.length; i++) {
              if (task[i] == null) {
                System.out.println("No hay mas tareas");
                break;
              }
              else {
                System.out.println((i + 1) + ") " + task[i].showTask());
              }
            }
          }
          break;
        default:
          if (!menu.equals("3")) {
            System.out.println("Ingrese una opcion valida");
          }
          break;
      }
    } while (!menu.equals("3"));

    // Finalizacion del programa
    System.out.print("\033[H\033[2J");
    System.out.println("See u next time");
  }
}