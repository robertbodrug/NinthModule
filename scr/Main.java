public class Main {
    public static void main(String[] args) {

//        MyArrayList<String>list=new MyArrayList<String>();
//        list.add(" ghfhhgh ");
//        list.add("ff ");
//        list.add("hhhfhhgh ");
//      //  list.clear();
//        System.out.println(list.get(1));

        MyQueue<String> stt =new MyQueue<>();
        stt.add("Privit" );
        stt.add("from");
        stt.add("Java" );
        stt.add("my");
        stt.add("dear" );
        stt.add("Friend");
        stt.add("!" );
        stt.add("Cn");

stt.clear();
        System.out.println(stt.poll());
        System.out.println(stt.peek());
        System.out.println(stt.poll());
        System.out.println(stt.poll());
        System.out.println(stt.poll());
        System.out.println(stt.poll());
        System.out.println(stt.poll());
    }
}