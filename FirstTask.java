import java.util.LinkedList;

public class FirstTask {
    // Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который
    // вернёет «перевёрнутый» список.
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(2);
        linkedList.add(5);
        linkedList.add(18);
        linkedList.add(12);
        linkedList.add(13);
        System.out.println("Исходный список: " + linkedList);
        linkedList = reverseLinkedList(linkedList);
        System.out.print("Перевернуттый список: " + linkedList);

    }
    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> linkedList)
    {
        for (int i = 0; i < linkedList.size() / 2; i++) {
            Integer temp = linkedList.get(i);
            linkedList.set(i, linkedList.get(linkedList.size() - i - 1));
            linkedList.set(linkedList.size() - i - 1, temp);
        }
 
       
        return linkedList;
    }
}
