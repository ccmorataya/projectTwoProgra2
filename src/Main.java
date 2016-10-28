import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        QueueArraylist qArrayList = new QueueArraylist();
        QueueArray qArray= new QueueArray();
        int option;
        boolean isAlive = true;
        Scanner datos = new Scanner(System.in);

        while(isAlive){

            System.out.println("Menú de opcines de cola en Java");
            System.out.println("-------------------------------------");
            System.out.println("1. Cola por ArrayList");
            System.out.println("2. Cola por Array");
            System.out.println("0. Salir\n");
            System.out.print("Ingresa la opción a utilizar: ");

            option = Integer.parseInt(datos.nextLine());

            if (option == 1) {
                System.out.println("Menú de opcines de cola en Java");
                System.out.println("-------------------------------------");
                System.out.println("1. Ingresar nuevo dato");
                System.out.println("2. Sacar un dato");
                System.out.println("3. Crear cola");
                System.out.println("4. Vaciar cola");
                System.out.println("0. Salir\n");
                System.out.print("Ingresa la opción a realizar: ");

                option = Integer.parseInt(datos.nextLine());

                if (option == 1) {
                    System.out.print("Ingresa el dato a añadir a la cola array list: ");
                    qArrayList.Insert(datos.nextLine());
                }
                else if (option == 2)
                    qArrayList.Pop();
                else if (option == 3)
                    qArrayList.CreateQueue();
                else if (option == 4) {
                    qArrayList.Empty();
                    System.out.println("Cola vaciada.");
                }
                else if (option == 0)
                    isAlive = false;
            }
            else if (option == 2){
                System.out.println("Menú de opcines de cola en Java");
                System.out.println("-------------------------------------");
                System.out.println("1. Ingresar nuevo dato");
                System.out.println("2. Sacar un dato");
                System.out.println("3. Crear cola");
                System.out.println("4. Vaciar cola");
                System.out.println("0. Salir\n");
                System.out.print("Ingresa la opción a realizar: ");

                option = Integer.parseInt(datos.nextLine());

                if (option == 1) {
                    System.out.print("Ingresa el dato a añadir a la cola array: ");
                    qArray.Insert(datos.nextLine());
                }
                else if (option == 2)
                    qArray.Pop();
                else if (option == 3)
                    qArray.CreateQueue();
                else if (option == 4) {
                    qArray.Empty();
                    System.out.println("Cola vacía.");
                }
                else if (option == 0)
                    isAlive = false;
            }
            else if (option == 0)
                isAlive = false;

        }
    }
}
