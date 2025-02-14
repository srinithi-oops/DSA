package DSA;

import java.util.ArrayList;
import java.util.List;

public class SumAndProductOfList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(50);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(60);

        System.out.println(list);
        System.out.println(sum(list));
        System.out.println(product(list));
    }
    static int sum(List<Integer> list){
        int sum=0;
        for(int i=0 ; i<list.size() ; i++){
            sum += list.get(i);
        }
        return sum;
    }
    static int product(List<Integer> list){
        int product=1;
        for(int i=0 ; i<list.size() ; i++){
            product *= list.get(i);
        }
        return product;
    }
}
