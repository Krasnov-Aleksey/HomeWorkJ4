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
        MyCl myCl = new MyCl();
        myCl.enqueue("1");
        myCl.enqueue("2");
        myCl.enqueue("3");
        myCl.enqueue("4");
        System.out.println(myCl.queue);
        myCl.dequeue();
        System.out.println(myCl.queue);
        System.out.println(myCl.fiest());
        System.out.println(myCl.queue);
    }

}
