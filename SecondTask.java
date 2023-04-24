import java.util.LinkedList;

public class SecondTask {
    // Реализуйте очередь с помощью LinkedList со следующими методами:
    // • enqueue() — помещает элемент в конец очереди,
    // • dequeue() — возвращает первый элемент из очереди и удаляет его,
    // • first() — возвращает первый элемент из очереди, не удаляя.

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            enqueue(linkedList, getRandomNumber()); 
        }
        System.out.println(linkedList);

        System.out.println(dequeue(linkedList)); 
        System.out.println(linkedList);

        System.out.println(first(linkedList)); 
        System.out.println(linkedList); 
    }

    public static void enqueue(LinkedList<Integer> linkedList, int num) {
        linkedList.addLast(num);
    }

    public static int dequeue(LinkedList<Integer> linkedList) { 
        int num = linkedList.get(0);
        linkedList.remove(0);
        return num;
    }

    public static int first(LinkedList<Integer> ll) { 
        int num = ll.get(0);
        return num;
    }

    public static int getRandomNumber() { 
        double x = (Math.random() * 99);
        int num = (int) x;
        return num;
    }
}