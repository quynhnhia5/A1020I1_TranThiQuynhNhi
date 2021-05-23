package list;

import java.util.Arrays;

public class MyList<E> {
  private int size = 0;
  private static final int DEFAULT_CAPACITY = 10;
  private Object elements[];

  public int getLength() {
    return elements.length;
  }

  public MyList() {
    elements = new Object[DEFAULT_CAPACITY];
  }

  public MyList(int capacity) {
    elements = new Object[capacity];
  }/////

  public void add(int index, E element) {
    if (size == elements.length) {
      ensureCapacity(size + 1);
    }
    if (index >= size) {
      elements[size] = element;
    } else if (index < size) {
      for (int i = size; i > index; i--) {
        elements[i] = elements[i - 1];
      }
      elements[index] = element;
    }
    size++;
  }

  public E remove(int index) {
    if (index <= size) {
      Object removedElement = elements[index];
      for (int i = index; i < size - 1; i++) {
        elements[index] = elements[index + 1];
      }
      size--;
      return (E) removedElement;
    }
    return null;
  }

  public int size() {
    return size;
  }

  public MyList<E> clone() {
    MyList<E> newList = new MyList<>(size);

    for (int i = 0; i < size; i++) {
      newList.add(i, (E) elements[i]);
    }

    return newList;
  }

  public boolean contains(E element) {
    for (int i = 0; i <= size; i++) {
      if (elements[i] == element) {
        return true;
      }
    }
    return false;
  }

  public int indexOf(E element) {
    for (int i = 0; i < size; i++) {
      if (elements[i] == element) {
        return i;
      }
    }
    return -1;
  }

  public boolean add(E element) {
    if (size == elements.length) {
      ensureCapacity(size + 1);
    }
    elements[size] = element;
    size++;
    return true;
  }

  public void ensureCapacity(int minCapacity) {
    if (size < minCapacity) {
      int newSize = minCapacity;
      elements = Arrays.copyOf(elements, newSize);
    }
  }

  public E get(int i) {
    if (i >= size && i < 0) {
      return null;
    }
    return (E) elements[i];
  }

  public void clear() {
    elements = new Object[DEFAULT_CAPACITY];
    size = 0;
  }

}
