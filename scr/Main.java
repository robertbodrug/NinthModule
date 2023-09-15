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
        ss.put("y","eefde");
        ss.put("i","eee");
        ss.put("o","ee");
        ss.put("p","eee");
        ss.put("l","eee");
        ss.put("h","hghg");
        ss.put("x","eee");
        ss.put("m","eefde");
        System.out.println(ss);
MyStack<String> stack= new MyStack<>();
stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");
        stack.push("5");
        stack.push("6");
        stack.push("7");
        stack.push("8");
        stack.push("9");
        System.out.println(stack.pop());
        stack.remove(7);

        System.out.println(stack.pop());
        System.out.println(stack.size());
    }
}