import java.util.ArrayList;

class QueueArraylist {
    private ArrayList<String> queue = new ArrayList<>();

    void Insert(String dato){
        queue.add(dato);
    }

    void Pop(){
        int indexDato = queue.size()-1;
        System.out.println(queue.get(indexDato));
        queue.remove(indexDato);

    }

    void CreateQueue(){
        System.out.println("Create");
    }

    void Empty(){
        queue.clear();
    }
}