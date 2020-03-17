package com.sosky;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 给定一个迭代器类的接口，接口包含两个方法： next() 和 hasNext()。设计并实现一个支持 peek() 操作的顶端迭代器 -- 其本质就是把原本应由 next() 方法返回的元素 peek() 出来。
 */
public class PeekingIterator implements Iterator<Integer> {
    public static void main(String[] args) {
        List<Integer> xx = new ArrayList<>();
        xx.add(1);
        xx.add(2);
        xx.add(3);
        PeekingIterator peekingIterator = new PeekingIterator(xx.iterator());
        System.out.println(peekingIterator.next());
        System.out.println(PeekingIterator.peek());
        System.out.println(peekingIterator.next());
        System.out.println(peekingIterator.next());
        System.out.println(peekingIterator.hasNext());
    }

    private final Iterator<Integer> iterator;

    public PeekingIterator(Iterator<Integer> iterator) {
        this.iterator = iterator;
    }

    // Returns the next element in the iteration without advancing the iterator.
    public static Integer peek() {
        return null;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public Integer next() {
        return iterator.next();
    }
}
