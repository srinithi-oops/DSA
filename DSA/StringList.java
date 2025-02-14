package DSA;

import java.util.ArrayList;
import java.util.List;

public class StringList {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();

        name.add("Rithika");
        name.add("Samyuktha");
        name.add("Sahana");
        name.add("Sreeshma");

        String target = "Sahana";
        System.out.println(name);
        System.out.println(search(name,target));
    }
    static int search(List<String> name,String target){
        for(int i=0 ; i<name.size() ; i++){
            if(name.get(i)==target){
                return i;
            }
        }
        return -1;
    }
}
