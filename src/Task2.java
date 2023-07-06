import java.util.LinkedList;
import java.util.Queue;

public class Task2 {
    /*
    Реализуйте очередь с помощью LinkedList со следующими методами:
    enqueue() - помещает элемент в конец очереди,
    dequeue() - возвращает первый элемент из очереди и удаляет его,
    first() - возвращает первый элемент из очереди, не удаляя.
     */
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        enqueue(queue, "1");
        enqueue(queue, "2");
        enqueue(queue, "3");
        enqueue(queue, "4");
        dequeue(queue);
        System.out.println(fiest(queue));
    }

    static String fiest (Queue<String> queue) {
        String text = queue.element();
        return text;
    }

    static void dequeue(Queue<String> queue) {
        queue.remove();
        System.out.println(queue);
    }

    static void enqueue(Queue<String> queue, String text) {
        queue.add(text);
        System.out.println(queue);
    }
}
