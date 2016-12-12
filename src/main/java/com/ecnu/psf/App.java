package com.ecnu.psf;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        List list = new ArrayList<ParentA>();
        list.add(new ChildB());
        list.add(new ChildC());

        ((ChildB)list.get(0)).say_somthing();
        ((ChildC)list.get(1)).say_somthing();
    }
}
