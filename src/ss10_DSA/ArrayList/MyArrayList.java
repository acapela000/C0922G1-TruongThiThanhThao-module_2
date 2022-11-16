package ss10_DSA.ArrayList;

import java.util.Arrays;

public class MyArrayList<E> {
    //số lượng phần tử trong MyArrayList
    public int size = 0; //why private?

    //sức chứa của MyArrayList
    static final int DEFAULT_CAPACITY = 10;
    public E add;

    Object elements[]; //???

    //sức chứa mặc định khi khởi tạo bằng Constructor ko có tham số
    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY]; //???
    }

    //pt Constructor vs sức chứa truyền vào
    //@parameter capacity
    public MyArrayList(int capacity) {
        if (capacity >= 0) {
            elements = new Object[capacity];
        } else {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
    }

    public MyArrayList(int size, Object[] elements) {
        this.size = size;
        this.elements = elements;
    }

    //pt trả về số lượng phần tử @return
    public int size() {
        return this.size;
    }

    //pt clear ArrayList
    public void clear() {
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }

    //pt add 1 phần tử vào MyArrayList @parameter element
    public boolean add(E element) {
        //ktra
        if (elements.length == size) {
            this.ensureCapacity(6);//muốn tăng lên bao nhiêu thì truyền vào
        }
        elements[size] = element;
        size++;

        return true;
    }

    //pt tăng kích thước của MyArrayList
    public void ensureCapacity(int minCapacity) {
        if (minCapacity >= 0) {
            int newSize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
        } else {
            throw new IllegalArgumentException("miniCapacity: " + minCapacity);
        }
    }

    //pt add element tại 1 vị trí nhất định
    public void add(int index, E element) {
        if (index > elements.length) {
            throw new IllegalArgumentException("index " + index);
        } else if (elements.length == size) {
            this.ensureCapacity(5);
        }

        if (elements[index] == null) {
            elements[index] = element;
            size++;
        } else {
            for (int i = size+1; i >= index ; i--) {
                elements[i] = elements[i-1];
            }
            elements[index] = element;
            size++;
        }
    }



}
