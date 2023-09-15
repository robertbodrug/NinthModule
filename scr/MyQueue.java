
import java.util.Objects;

public class MyQueue<E> {
    private int size=0;

    private Node<E> first;
    private Node<E> last;

    public void add(E e){
        Node<E> newNode=new Node<>(e,null);

        if(size==0){
            last=newNode;
            first=newNode;
        }
        else {
            last.next=newNode;
            last=newNode;
        }
        size++;
    }

    public E peek()  {
        return first==null?null:first.item;
    }
    public E poll(){
        Node<E> f= first;
        if (f!=null) {
            first = first.next;
            size--;
            return f.item;
        }
        return null;
    }

    public int size(){return size;}

    public void clear(){
        first=null;
        last=null;
        size=0;
    }

















    private static class Node<E> {
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node<?> node = (Node<?>) o;
            return Objects.equals(item, node.item) && Objects.equals(next, node.next);
        }

        @Override
        public int hashCode() {
            return Objects.hash(item, next);
        }

        E item;
        Node<E> next;

        Node( E element, Node<E> next) {
            this.item = element;
            this.next = next;

        }
    }
}
