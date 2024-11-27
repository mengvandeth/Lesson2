package HomeWork01;

import java.util.Arrays;

public class Prog42 {
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
        System.out.println(Arrays.toString(animal));
        System.out.println(Arrays.toString(NoDuplicate));
        for (int i = 0; i <count ; i++) {
            System.out.print(NoDuplicate[i]+ " " );
        }
    }
}

