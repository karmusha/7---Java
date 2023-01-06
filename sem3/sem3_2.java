package sem3;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;



public class sem3_2 {
    // Дан список, содержащий строки и числа в строковом формате.
 // С помощью итератора пройти по списку и вывести в консоль, что является строкой, а что числом.

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("a", "2", "b", "3", "c", "4"));
        printResultOfCheck(list);
    }

    public static void printResultOfCheck(List<String> list){
        for (String item: list) {
            try{
                Integer.valueOf(item);
                System.out.println(item + "- Числовая строка");
            } catch (Exception e){
                System.out.println(item + "- Строковая строка");
            }
        }

    }
}
