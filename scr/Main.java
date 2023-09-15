public class Main {
    public static void main(String[] args) {

//        MyArrayList<String>list=new MyArrayList<String>();
//        list.add(" ghfhhgh ");
//        list.add("ff ");
//        list.add("hhhfhhgh ");
//      //  list.clear();
//        System.out.println(list.get(1));

        MyStack<String> stt =new MyStack<>();
        stt.push("Privit" );
        stt.push("from");
        stt.push("Java" );
        stt.push("my");
        stt.push("dear" );
        stt.push("Friend");
        stt.push("!" );
        stt.push("Cn");
        stt.remove(9);



        System.out.println(stt);

    }
}