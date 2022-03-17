package lessson4;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] ints = new int[10];
        ints[0] = 1;
        int test = ints[0];

        ArrayList<String> listOfStrings = new ArrayList<>();
        ArrayList<Integer> listOfInts = new ArrayList<>();

      listOfInts.add(1);
      listOfInts.add(2);
      listOfInts.add(3);

      listOfInts.add(1,5);

//      ArrayList<Integer> secondListOfInst = new ArrayList<>(listOfInts);

        ArrayList<Integer> secondListOfInst = new ArrayList<>(15);

        for (Integer secondListInt : secondListOfInst) {
            System.out.println(secondListInt);
        }



        for (int i = 0; i < listOfInts.size(); i++) {
            System.out.println(listOfInts.get(i));
        }

        listOfInts.remove(1);

        for (Integer integer : listOfInts) {
            System.out.println(integer);
        }

        Integer[] integers = new Integer[listOfInts.size()];
        listOfInts.toArray(integers);
        doSomethingWith(integers);

        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "qwerty");
        hm.put(245, "asdfgh");

        hm.get(2);

        for (Map.Entry<Integer, String> entry : hm.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        String s2 = hm.get(1);
        System.out.println(s2);
        }

        public static void doSomethingWith(Integer[] integers) {
            System.out.println("do smth with");
            for (Integer integer : integers) {
                System.out.println(integer);
            }

        }
    }

