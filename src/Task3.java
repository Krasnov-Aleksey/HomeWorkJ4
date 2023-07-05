import java.util.LinkedList;

public class Task3 {
    /*
    Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор
     */
    public static void main(String[] args) {
        int res;
        LinkedList<Integer> lList = Task1.rndLList(5,0,10);
        System.out.println(lList);
        res=sumLinkedList(lList);
        System.out.println("Сумма всех элементов LinkedList = "+res);
    }

    /**
     * Сумма всех элементов LinkedList
     * @param lList LinkedList
     * @return Сумма элементов
     */
    static int sumLinkedList(LinkedList<Integer> lList) {
        int sum=0;
        for (int value: lList) {
            sum+=value;
        }
        return sum;
    }

}

