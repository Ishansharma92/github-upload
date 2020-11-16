package Collections;

import java.util.ArrayList;

public class ArrayListV2 {
    public static void main(String[] args) {
        char c = 'b';
        ArrayList<Character> al = new ArrayList<Character>();
        al.add('a');
        al.add('b');
        al.add('c');
        al.add('d');
        al.add('e');

        char firstChar = al.get(0);
        if(!al.contains(c)){
            System.out.println("Not in list");
            return;
        }
        else if(firstChar != c){
            int i = al.get(c);
            al.remove(i);
            al.add(0,c);
        }
        System.out.println(al);


    }
}
