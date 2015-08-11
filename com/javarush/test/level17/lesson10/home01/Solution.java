package com.javarush.test.level17.lesson10.home01;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;


/* Общий список
1. Изменить класс Solution так, чтобы он стал списком. (Необходимо реализовать интерфейс java.util.List).
2. Список Solution должен работать только с целыми числами Long.
3. Воспользуйтесь полем original.
4. Список будет использоваться нитями, поэтому позаботьтесь, чтобы все методы были синхронизированы.
*/

public class Solution implements List<Long>
{
    private ArrayList<Long> original = new ArrayList<Long>();

    public Solution(ArrayList<Long> original)
    {
        this.original = original;
    }

    @Override
    public synchronized void forEach(Consumer<? super Long> action)
    {

    }

    @Override
    public int size()
    {
        return 0;
    }

    @Override
    public boolean isEmpty()
    {
        return false;
    }

    @Override
    public boolean contains(Object o)
    {
        return false;
    }

    @Override
    public Iterator<Long> iterator()
    {
        return null;
    }

    @Override
    public Object[] toArray()
    {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a)
    {
        return null;
    }

    @Override
    public boolean add(Long aLong)
    {
        return false;
    }

    @Override
    public boolean remove(Object o)
    {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c)
    {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Long> c)
    {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Long> c)
    {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c)
    {
        return false;
    }

    @Override
    public boolean removeIf(Predicate<? super Long> filter)
    {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c)
    {
        return false;
    }

    @Override
    public void replaceAll(UnaryOperator<Long> operator)
    {

    }

    @Override
    public void sort(Comparator<? super Long> c)
    {

    }

    @Override
    public void clear()
    {

    }

    @Override
    public Long get(int index)
    {
        return null;
    }

    @Override
    public Long set(int index, Long element)
    {
        return null;
    }

    @Override
    public void add(int index, Long element)
    {

    }

    @Override
    public Long remove(int index)
    {
        return null;
    }

    @Override
    public int indexOf(Object o)
    {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o)
    {
        return 0;
    }

    @Override
    public ListIterator<Long> listIterator()
    {
        return null;
    }

    @Override
    public ListIterator<Long> listIterator(int index)
    {
        return null;
    }

    @Override
    public List<Long> subList(int fromIndex, int toIndex)
    {
        return null;
    }

    @Override
    public Spliterator<Long> spliterator()
    {
        return null;
    }


}
