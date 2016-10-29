import java.util.ArrayList;
import java.util.Collections;

class QueueArraylist {
    private ArrayList<String> queue = new ArrayList<>();

    void Insert(String dato){
        queue.add(dato);
    }

    void Pop(){
        int indexDato = queue.size()-1;
        Collections.reverse(queue);
        System.out.println("Se retiró el dato: " + queue.get(indexDato));
        queue.remove(indexDato);
        Collections.reverse(queue);
    }

    void CreateQueue(){
        System.out.println("Create");
    }

    void Empty(){
        queue.clear();
    }
}