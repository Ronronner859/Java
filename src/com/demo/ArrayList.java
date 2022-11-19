package com.demo;

import com.pojo.Account;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayList implements List<Account> {
    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Account> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] ts) {
        return null;
    }

    @Override
    public boolean add(Account account) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Account> collection) {
        return false;
    }

    @Override
    public boolean addAll(int i, Collection<? extends Account> collection) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Account get(int i) {
        return null;
    }

    @Override
    public Account set(int i, Account account) {
        return null;
    }

    @Override
    public void add(int i, Account account) {

    }

    @Override
    public Account remove(int i) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Account> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Account> listIterator(int i) {
        return null;
    }

    @Override
    public List<Account> subList(int i, int i1) {
        return null;
    }
}
