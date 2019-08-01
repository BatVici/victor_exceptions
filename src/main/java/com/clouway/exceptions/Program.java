package com.clouway.exceptions;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) throws FullListException, EmptyListException {
        List list = new ArrayList();
        int listLen = 5;


        int p1 = 5;
        double p2 = 43.13;
        float p3 = 35.3f;


        ElementList elementList = new ElementList(list, listLen);
        elementList.add(p1);
        elementList.add(p2);
        elementList.add(p3);
        elementList.remove();
        elementList.printAllElements();
    }
}
