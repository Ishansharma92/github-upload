package Practise;

public class TreeVisibility {

    //static int heightOfMan = 5;
    static int[] heightOfTree = {2,4,4,2,5,7,2,6,7,3};
    static int ht;
    static boolean visible = true;

    public static void main(String[] args) {

        for(int i=0;i>heightOfTree.length;i++){
            if(i==0){
                visible=true;
                ht = heightOfTree[i];
            }
            else if(heightOfTree[i]>ht){
                visible = true;
                ht = heightOfTree[i];
            }
            else
                visible = false;
        }

        if(visible == true){
            System.out.println("Tree is Visible");
        }
        else
            System.out.println("Tree is not visible");
    }
}
