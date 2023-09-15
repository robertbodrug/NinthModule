import java.util.Arrays;
import java.util.Objects;

public class MyArrayList<E> {
    private static final int DEFAULT_CAP = 10;

    private static final Object[] EMPTY_ELEMENTDATA = {};
    private Object[] elementData;

    private int size=0;

    public MyArrayList(int capacity){
        if(capacity>0){
            elementData = new Object[capacity];
        }
    }
    public MyArrayList(){
        this.elementData = EMPTY_ELEMENTDATA;
    }

    private Object[] grow(int minCap){
        int oldCap=elementData.length;
        if(minCap>oldCap&& elementData!=EMPTY_ELEMENTDATA){
            return elementData= Arrays.copyOf(elementData,minCap+5);
        }
        else return elementData = new Object[Math.max(DEFAULT_CAP, minCap)];
    }
    private Object[] grow(){
        return grow(size+1);
    }



    public void add(E e){
        if (size==elementData.length)grow();
        elementData[size]=e;
        size++;
    }


    public E get(int index) {
        Objects.checkIndex(index,size);
        return (E)elementData[index];

    }

    public int size() {
        return size;
    }

    public void remove(int index){
        Objects.checkIndex(index,size);
        final int newSize;
        if ((newSize = size - 1) > index)
            System.arraycopy(elementData, index + 1, elementData, index, newSize - index);
        elementData[size = newSize] = null;

    }

    public void clear(){
        final Object[] es = elementData;
        for (int to = size, i = size = 0; i < to; i++)
            es[i] = null;
    }

}
