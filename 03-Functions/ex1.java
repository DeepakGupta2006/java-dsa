// waf to prnt avg of 3nos

import java.util.*;
public class ex1 {
    public static float avgOf3Nos(int a,int b,int c){
        int avg=(a+b+c)/3;
        return avg;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        System.out.println(avgOf3Nos(a,b,c));

    }
}