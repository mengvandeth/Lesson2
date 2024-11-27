import java.util.Arrays;

public class Prog4 {

    public static void main(String[] args) {
        String[] animals =  {"horse", "dog", "cat", "horse", "dog"};
        StringBuilder stringBuilder = new StringBuilder();
        for (String animal : animals) {
          if(stringBuilder.indexOf(animal) == -1) {
              stringBuilder.append(animal).append(",");
          }
        }
       String[] removedDuplicates = stringBuilder.toString().split(",");
        System.out.println(Arrays.toString(removedDuplicates));

    }
}
