package Practise;

public class MinMaxInString {
    public static void main(String[] args) {
        String s = "We are awesome";
        String s1[] = s.split(" ");

        String min = s1[0];
        String max = s1[0];

        for(String x: s1){
            if(min.length()>=x.length()){
                min = x;
            }
            else if(max.length()<=x.length()){
                max=x;
            }
        }
        System.out.println("Min is: "+min);
        System.out.println("Max is: "+max);
    }
}
