package FileIoOperations;

import java.io.FileOutputStream;

public class TxtFileOperations {
        public static void main(String args[]){
            try{
                FileOutputStream fout=new FileOutputStream("text1.txt");
                String s="Welcome to Mahesh's Java Class";
                byte b[]=s.getBytes();//converting string into byte array
                fout.write(b);
                fout.close();
                System.out.println("success...");
            }catch(Exception e){System.out.println(e);}
        }
    }
