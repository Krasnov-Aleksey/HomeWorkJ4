import java.util.LinkedList;
import java.util.Random;

public class Task1 {
    /*
    Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
    Постараться не обращаться к листу по индексам.
     */
    public static void main(String[] args) {
        int count=10, min=0, max=100;
        LinkedList<Integer> lList = rndLList(count,min,max);
        System.out.println(lList);
        LinkedList<Integer> nList = reversLList(lList);
        System.out.println(nList);
    }

    /**
     * Переворачиваем LinkedList
     * @param llist Начальный LinkedList
     * @return Перевернуты LinkedList
     */
    static LinkedList<Integer> reversLList (LinkedList<Integer> llist) {
        LinkedList<Integer> nList = new LinkedList<>();
        for (Integer value: llist) {
            nList.add(0,value);
        }
        return nList;
    }

    /**
     * Создание случайного LinkedList
     * @param count количество элементов
     * @param min начало
     * @param max конец
     * @return LinkedList
     */
    static LinkedList<Integer> rndLList(int count, int min, int max) {
        Random random = new Random();
        LinkedList <Integer> lList = new LinkedList<>();
        for (int i = 0; i < count ; i++) {
            lList.add(random.nextInt(min,max));
        }
        return lList;
    }
}
