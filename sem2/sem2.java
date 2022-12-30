package sem2;

/*
 * Используем наш код который мы писали на семинаре и дорабатываем, нужно сделать так что бы мы могли написать формулу и заполнить все элементов которые сами же и вели
Например
a + b + c
2
3
4
ответ 9
 */

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class sem2 {
    public static void main(String[] args) {
        Equation();
    }

    public static int GetNumber(){
        Scanner numberS = new Scanner(System.in);
        int number;
        while(true){
            try{
                System.out.print("Введите число: ");
                number = numberS.nextInt();
                break;
            } catch (Exception e){
                System.out.println("Ошибка ввода.");
            }
        }
        return number;
    }
    public static String GetString(){
        Scanner str = new Scanner(System.in);
        String equation;
        System.out.print("Введите формулу: ");
        equation = str.nextLine();
        return equation;
    }
    public static void Equation(){
        Map<String, Integer> states = new HashMap<String, Integer>();

        Scanner str = new Scanner(System.in);
        String equation = GetString(); // a + b + c + d + c
        equation = String.format(equation).replace(" ",""); // a+b+c+d+c
        String[] st1 = equation.split("\\+"); // [a, b, c, d, c]
        int sum = 0;
        for (int i = 0; i < st1.length; i++) {
            if (states.containsKey(st1[i])) continue;
            states.put(st1[i], str.nextInt());
        }
        for (int i = 0; i < st1.length; i++) {
            sum += states.get(st1[i]);
        }
        System.out.println(sum);
    }
}