package Practise;

import java.util.*;
class TreeSet1{
    public static void main(String args[]){
        //Creating and adding elements
        TreeSet<String> al=new TreeSet<String>();
        al.add("My");
        al.add("Name");
        al.add("is");
        al.add("aa");
        al.add("bb");
        al.add("Mahesh");
        al.add("Rakesh");
        //Traversing elements
        System.out.println(al);
        Iterator<String> itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
