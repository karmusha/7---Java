package dz3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Collections;

public class dz3 {
    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {
        
        List<Integer> list = generateRandomList(1, 10, 10);
        
        System.out.print("Ваш список: ");
        System.out.println(list);
        System.out.print("Список нечётных чисел заданного списка: ");
        System.out.println(removeNegativeValue(list));
        System.out.printf("Минимальное число в списке: %d.\n", getMin(list));
        System.out.printf("Максимальное число в списке: %d.\n", getMax(list));
        System.out.printf("Среднеарифметическое значение: %d.\n", getAverage(list));
    }

    public static List<Integer> generateRandomList(Integer min, Integer max, Integer size){
        Random r = new Random();
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            int item = r.nextInt(max-min) + min;
            res.add(item);
        }
        
        return res;

    }

    // Нужно удалить из него четные числа
    public static List<Integer> removeNegativeValue(List<Integer> list){
        List<Integer> postitiveNumbers = new ArrayList<Integer>();
        for (Integer item : list) {
            if (item % 2 != 0){
                postitiveNumbers.add(item);
            }
        }
        return postitiveNumbers;
    }

    // Найти минимальное значение
    public static Integer getMin(List<Integer> list){
        return Collections.min(list);
    }

    // Найти максимальное значение
    public static Integer getMax(List<Integer> list){
        return Collections.max(list);
    }

    // Найти среднее значение
    public static Integer getAverage(List<Integer> list){
        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        return sum/list.size();
    }
}
