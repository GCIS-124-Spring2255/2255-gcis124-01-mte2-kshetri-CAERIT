// Question: Q2 (mte2, gcis124, 2255)
// Package name: deques
// File name: MyDeque.java

package mte2.deques;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class MyDeque<E> implements Deque<E> {
    
    private final LinkedList<E> list;
    public MyDeque() {    list = new LinkedList<>();    }

    public void enqueueFront(E element){
        list.addFirst(element);
    }

    public void enqueueBack(E element){
        list.addLast(element);
    }

    public E dequeueFront(){
        return list.removeFirst();
    }

    public E dequeueBack(){
        return list.removeLast();
    } 

    public int size(){
        return list.size();
    }

    @Override
    public Iterator<E> iterator() throws UnsupportedOperationException{
        return new DequeIterator();
    }

    private class DequeIterator implements Iterator<E>{
        public int index=0;
        public boolean hasNext(){
            return index<list.size();
        }
        public E next(){
            if(!hasNext()){throw new NoSuchElementException("out of elements");}
            else{return list.get(index);}
        }

    }


    public static void main(String[] args) { 

        // ...
    }
}