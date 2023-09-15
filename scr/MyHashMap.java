
import java.util.Arrays;
import java.util.Objects;

public class MyHashMap <K,V>{

    private int size =0;
    static final int DEFAULT_SIZE = 16;

    private Node<K,V>[]  nodesData = new Node[DEFAULT_SIZE];

    private int getListIndex(K key){
        return (Objects.hash(key)*12)%nodesData.length;
    }

    public void put(K key,V value){
        int index= getListIndex(key);
        Node<K,V> newNode = new Node<>(Objects.hash(key),key,value,null);
        if(nodesData[index]==null){

            nodesData[index]=newNode;
        }else {
            Node<K,V> nd =nodesData[index];
            while (nd.next!=null){
                if(nd.hash==newNode.hash)
                    if(nd.key.equals(key))nd.value=value;
                nd=nd.next;
            }
            if(nd.hash==newNode.hash) {
                if (nd.key.equals(key)) nd.value = value;
            } else {
                    nd.next = newNode;
                }

        }
        size++;
    }

    public V get(K key){
       int index = getListIndex(key);
        if(nodesData[index]==null){
            return null;
        } else {
            Node<K, V> nd = nodesData[index];
            while (nd!= null) {
                if (nd.hash == Objects.hash(key))
                    if (nd.key.equals(key)) return nd.value ;
                nd = nd.next;
            }
            return null;
        }

        }
public int size(){return size;}

    public void remove(K key){
        int index = getListIndex(key);
        if(nodesData[index]==null){
            return;
        } else {
            Node<K, V> nd = nodesData[index];
            if (nd.hash == Objects.hash(key))
                if (nd.key.equals(key)) {
                    nodesData[index]= nd.next;
                    return;
                }

            while (nd.next!= null) {
                if (nd.next.hash == Objects.hash(key))
                    if (nd.next.key.equals(key)) {
                        if(nd.next.next!=null)nd.next=nd.next.next;
                        else nd.next=null;
                        return;
                    }

                nd = nd.next;
            }

        }
    }
    @Override
    public String toString() {
        return "MyHashMap{" +
                "nodesData=" + Arrays.toString(nodesData) +
                '}';
    }

    static class Node<K,V> {
        final int hash;
        final K key;
        V value;
        Node<K,V> next;

        Node(int hash, K key, V value, Node<K,V> next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public final K getKey()        { return key; }
        public final V getValue()      { return value; }
        public final String toString() { return key + "=" + value; }

        public final int hashCode() {
            return Objects.hashCode(key) ^ Objects.hashCode(value);
        }

        public final void setValue(V newValue) {
            value = newValue;
        }

        public final boolean equals(Node<K,V> o) {
            if (o == this)
                return true;

            return  Objects.equals(key, o.getKey())
                    && Objects.equals(value, o.getValue());
        }
    }
}
