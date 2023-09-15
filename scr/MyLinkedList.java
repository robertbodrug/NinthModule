import java.util.Objects;

public class MyLinkedList<E> {
    private int size=0;
    private Node<E> first;
    private Node<E>last;


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Node<E> s=first;
        for (int i = 0; i < size ;i++){
            stringBuilder.append(s.item);
            stringBuilder.append("\n");
            s=s.next;
        }
        return stringBuilder.toString();
    }

    public void clean(){
        first=null;
        last=null;
        size=0;
    }
    public void remove(int index){
        Objects.checkIndex(index,size);
        if(index==0){
            first=first.next;
            first.prev=null;
        }
        else{
            Node<E> node = getNode(index);
            if(!last.equals(node)) {
                node.prev.next = node.next;
                node.next.prev = node.prev;
            }else {
                node.prev.next=null;
                last=node.prev;
            }
        }
        size--;
    }
    public E get(int index ) {
        Objects.checkIndex(index,size);
        return getNode(index).item;
    }
    private Node<E> getNode(int index ){
        if(index<(size>>1)) {
            Node<E> x = first;
            for (int i = 0; i < index; i++)
                x = x.next;
            return x;
        }
        else {
            Node<E> x = last;
            for (int i = size - 1; i > index; i--)
                x = x.prev;
            return x;
        }
    }
    public void add(E e) {
        Node<E> newNode=new Node<>(last,e,null);

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
    public int size(){return size;}


    private static class Node<E> {
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node<?> node = (Node<?>) o;
            return Objects.equals(item, node.item) && Objects.equals(next, node.next) && Objects.equals(prev, node.prev);
        }

        @Override
        public int hashCode() {
            return Objects.hash(item, next, prev);
        }

        E item;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> prev, E element,Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }
}
