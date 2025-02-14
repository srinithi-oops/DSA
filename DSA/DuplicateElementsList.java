package DSA;

import java.util.*;

public class DuplicateElementsList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(10);
        list.add(20);
        list.add(20);
        list.add(30);
        list.add(30);
        System.out.println(list);
        System.out.println(duplicate(list));

    }
    static  List<Integer>  duplicate( List<Integer> list){
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (Integer num : list) {
            if (!seen.add(num)) { // If already in seen, it's a duplicate
                duplicates.add(num);
            }
        }
        return new ArrayList<>(duplicates);
    }
}
