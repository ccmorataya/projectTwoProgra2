class QueueArray {

    private String[] queue = new String[5];
    private int start = 0;
    private int end = -1;

    void Insert(String dato){
        if (end == (queue.length-1)){
            System.out.println("La cola esta llena\nRetira un dato para poder introducir.");
        }
        else{
            end ++;
            queue[end] = dato;
        }
    }

    void Pop(){
        if(end == -1)
            System.out.println("La cola esta vacía\nIntroduce un nuevo dato para retirar.");
        else{
            System.out.println("Se retiro el dato " + queue[start] + ".");
            for (int i = start; i < end; i++){
                queue[i] = queue[i+1];
            }
            queue[end] = null;
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
