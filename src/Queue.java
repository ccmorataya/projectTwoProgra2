import java.util.ArrayList;

class Queue {
    private ArrayList<String> queue = new ArrayList<>();
    private int start = 0;
    private int end = -1;

    void Insert(String dato){
        if (end == queue.size()-1)
            System.out.println("La cola esta llena\nRetira un dato para poder introducir.");
        else{
            end ++;
            queue.set(end, dato);
        }
    }

    void Pop(){
        if (end == -1)
            System.out.println("La cola esta vacía\nIntroduce un nuevo dato para poder retirar.");
        else{
            System.out.println("Se retiro el dato " + queue.get(start) + ".");
            for (int i = start; i < end; i++){
                queue.set(i, queue.get(i + 1));
            }
            queue.set(end, null);
            end --;
        }
    }

    void CreateQueue(){
        System.out.println("Create");
    }

    void Empty(){
        start = 0;
        end = -1;
        System.out.println("Datos borrados exitosamente.");
    }
}