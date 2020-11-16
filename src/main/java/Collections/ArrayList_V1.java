package Collections;

import java.util.ArrayList;

public class ArrayList_V1 {

    public static void main(String[] args) {

        ArrayList<Integer> al= new ArrayList<>() ;
        al.add(10);
        al.add(5);
        al.add(2);
        al.add(100);
        al.add(-1);
        al.add(-1);
        al.add(null);

        int temp;
        for(int i = 0; i< al.size() -1; i++){
            for(int j =i+1; i< al.size() - 1; j++){
                if(al.get(i)>al.get(j)) {
                    temp = al.get(i);
                    al.set(i, al.get(j));
                    al.set(j, temp);
                }
            }
        }
        System.out.println(al);


    }
}
