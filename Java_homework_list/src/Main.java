import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Паттерн 1
        //таск 1 - у вас есть список значений int и вы должны вернуть список, каждое значение которого умножается на 2
        List<Integer> list = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        list.add(3);
        list.add(6);
        list.add(7);
        list.add(10);

        for (Integer i : list) {
            result.add(i * 2);
        }

        System.out.println(result);


        //таск 2 - у вас есть список значений String , и вы должны вернуть список длины каждого из этих значений String

        List<String> list1 = new ArrayList<>();
        List<Integer> result1 = new ArrayList<>();
        list1.add("I");
        list1.add("want");
        list1.add("to");
        list1.add("sleep");

        for (String str : list1) {
            result1.add(str.length());
        }

        System.out.println(result1);




    }
}