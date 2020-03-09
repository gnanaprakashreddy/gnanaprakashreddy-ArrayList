package org.example;

import org.example.custom.CustomArrayList;
public class App 
{
    public static void main( String[] args ) throws Exception
    {

        CustomArrayList android = new CustomArrayList();
        android.add("Nougat");
        android.add("Pie");
        android.add("oreo");
        System.out.println(android.get(0));
        System.out.println("Length:"+android.length());
        android.remove(0);
        System.out.println(android.get(0));
    }
}
