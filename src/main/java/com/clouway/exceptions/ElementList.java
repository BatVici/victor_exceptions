package com.clouway.exceptions;

import java.util.List;

public class ElementList {
    List list;
    int listLength;

    public ElementList(List list, int listLength) {
        this.list = list;
        this.listLength = listLength;
    }

    public void add(Object object) throws FullListException {
        if (list.size() >= listLength) {
            throw new FullListException("The list is full!");
        } else {
            list.add(object);
        }
    }


    public void remove() throws EmptyListException {
        if (list.size() > 0) {
            list.remove(list.size()-1);
        } else {
            throw new EmptyListException("There is empty!");
        }
    }

    public void printAllElements()
    {
        for(Object element: list)
        {
            System.out.println("element = " + element);
        }
    }
}
