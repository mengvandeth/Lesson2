package lesson1;

import java.util.Arrays;
import java.util.concurrent.LinkedBlockingDeque;
public class Prog4 {
    public static void main(String[] args) {
        String[] animal = {"horse", "dog", "cat", "horse", "dog" };
        String[] NoDuplicate = new String[animal.length];
        int index = 0;
        for (String s : animal)
        {
            boolean found = false;
            for (int j = 0; j < index; j++)
            {
                if (s.equals(NoDuplicate[j]))
                {
                    found = true;
                    break;
                }
            }
            if (!found)
            {
                NoDuplicate[index] = s;
                index += 1;
            }
        }
        int count = 0;
        for (String s : NoDuplicate) {
            if (s != null){
               count++;
            }
        }
        for (int i = 0; i <count ; i++) {
            System.out.print(NoDuplicate[i] + " ");
        }
    }
}

