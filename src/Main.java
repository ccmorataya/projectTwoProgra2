import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Queue action=new Queue();
        int option;
        boolean isAlive = true;
        Scanner datos = new Scanner(System.in);

        while(isAlive){
            System.out.println("Menú de opcines de cola en Java");
            System.out.println("-------------------------------------");
            System.out.println("1. Ingresar nuevo dato");
            System.out.println("2. Sacar un dato");
            System.out.println("3. Crear cola");
            System.out.println("4. Vaciar cola");
            System.out.println("0. Salir\n");
            System.out.println("Ingresa la opción a realizar");

            option = Integer.parseInt(datos.nextLine());

            if (option == 1)
                action.Insert(datos.nextLine());
            else if (option == 2)
                action.Pop();
            else if (option == 3)
                action.CreateQueue();
            else if (option == 4)
                action.Empty();
            else if (option == 0)
                isAlive = false;
        }
    }
}
