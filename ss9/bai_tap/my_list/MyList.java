package ss9.bai_tap.my_list;
import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] element;

    public MyList() {
        element = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        element = new Object[capacity];
    }

    public void add(int index, E element) {
        ensureCapacity(this.element.length);
        if (index > this.element.length) {
            throw new IndexOutOfBoundsException("index: " + index + " element length: " + this.element.length);
        } else {
            for (int i = this.element.length - 1; i > index; i--) {
                this.element[i] = this.element[i - 1];
            }
            this.element[index] = element;
        }
        size++;
    }


    public E remove(int index) {
        E temp = (E) this.element[index];
        this.element[index] = null;
        this.size--;
        return temp;
    }

    public int size() {
        return size;
    }

    public E[] clone() {
        Object[] newElement = new Object[this.element.length];
        for (int i = 0; i < this.element.length; i++) {
            newElement[i] = this.element[i];
        }
        return (E[]) newElement;
    }

    public boolean contains(E o) {
        for (int i = 0; i < this.element.length; i++) {
            if (this.element[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E o) {
        for (int i = 0; i < this.element.length; i++) {
            if (this.element[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    public boolean add(E e) {
        ensureCapacity(this.element.length);
        this.element[size++] = e;
        return true;
    }

    public void ensureCapacity(int minCapacity) {
        if (this.size == minCapacity) {
            int newSize = minCapacity * 2;
            element = Arrays.copyOf(element, newSize);
        }
    }

    public E get(int i) {
        return (E) this.element[i];
    }

    public void clear() {
        for (int i = 0; i < this.element.length; i++) {
            if (this.element[i] != null) {
                this.element[i] = null;
                this.size--;
            }
        }
    }

}
