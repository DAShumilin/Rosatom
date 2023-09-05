import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println("Before: " + list);

        LinkedList<Integer> reversedList = reverseList(list);

        System.out.println("After: " + reversedList);
    }

    public static LinkedList<Integer> reverseList(LinkedList<Integer> list) {
        LinkedList<Integer> reversedList = new LinkedList<>();

        for(int i = list.size() - 1; i > -1; --i) {
            reversedList.add(list.get(i));
        }

        return reversedList;
    }
}
