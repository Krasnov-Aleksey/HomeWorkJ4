import java.util.LinkedList;
import java.util.Queue;

public class MyCl {

    Queue<String> queue = new LinkedList<>();
    String fiest () {
        String text = queue.element();
        return text;
    }

    void dequeue() {
        queue.remove();
    }

    void enqueue(String text) {
        queue.add(text);
    }
}
