package DSA;

import java.util.LinkedHashMap;
import java.util.Map;

public class CreatingMap {
    public static void main(String[] args) {
        Map<String,Integer> map = new LinkedHashMap<>();
        map.put("Samyu",19);
        map.put("Rithika",20);
        map.put("Sahana",21);
        map.put("Srees",22);
        System.out.println(map);
    }
}
