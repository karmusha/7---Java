package sem3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;;

public class sem3_1 {
    // Дан список с десятью случайными числами, нужно отсортировать
    public static void main(String[] args) {
        
        sem3_1 testObject = new sem3_1(); // Создали объект класса sem3_1

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 9, 2, 5, 8));
        
        System.out.print("Ваш список: ");
        System.out.println(list);
        System.out.print("Cписок, отсортированный по натуральному порядку чисел: ");
        System.out.println(testObject.sortByCollections(list));
        System.out.print("Cписок, отсортированный в обратном порядке: ");
        System.out.println(testObject.sortByComparator(list));
    }

    public List<Integer> sortByCollections(List<Integer> list){
        Collections.sort(list);
        return list;
    }

    public List<Integer> sortByComparator(List<Integer> list){
        Collections.sort(list, Comparator.reverseOrder());
        return list;
    }
}
