package HomeWork01;

import java.util.Arrays;

public class Prog5 {
    public static void main(String[] args) {
        int[] a = {5,6,-4,3,1};
        int[] b = {3,8,9,11};
        System.out.println(Arrays.toString(Prog5.combine(a, b)));

    }

    public static int[] combine(int[] a, int[] b){
        int length = a.length + b.length;
        int[] result = new int[length];
        for (int i = 0; i < result.length; i++) {
            if(i<a.length){
                result[i] = a[i];
            }else{
                result[i] = b[i-a.length];
            }
        }
        return result;
    }
    }


