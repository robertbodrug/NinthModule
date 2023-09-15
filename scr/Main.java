import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        MyHashMap<String,String> ss = new MyHashMap<>();
        ss.put("a","eee");
        ss.put("b","ee");
        ss.put("c","eee");
        ss.put("y","eee");
        ss.put("j","hghg");
        ss.put("h","eee");
        ss.put("g","eefde");
        ss.remove("h");
        System.out.println(ss.get("g"));

    }
}