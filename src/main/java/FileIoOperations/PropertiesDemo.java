package FileIoOperations;

import java.io.*;
import java.util.*;

public class PropertiesDemo {
    static String filePath = "src/main/resources/db.properties";

    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader(filePath);
        Properties pr = new Properties();
        pr.load(fr);

        HashMap<String,String> hm = new HashMap<String,String>((Map)pr);
        System.out.println(hm);

        int i=System.in.read();//returns ASCII code of 1st character
        System.out.println((char) i);//will print the character
    }
}
