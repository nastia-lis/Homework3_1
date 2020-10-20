package geekbrains.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //1 и 2 задание
        Integer[] arrayInt = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String[] arrayStr = {"AAAA", "BBBB", "CCCC", "DDDD", "EEEE"};
        method1(2, 7, arrayInt);
        method1(1, 3, arrayStr);
        method2(arrayInt);
        method2(arrayStr);

        //3 задание
        Box<Orange> box1 = new Box<>();
        box1.addFruit(new Orange());
        box1.addFruit(new Orange());
        box1.addFruit(new Orange());
        box1.addFruit(new Orange());

        Box<Apple> box2 = new Box<>();
        box2.addFruit(new Apple());
        box2.addFruit(new Apple());
        box2.addFruit(new Apple());
        box2.addFruit(new Apple());
        box2.addFruit(new Apple());
        box2.addFruit(new Apple());

        Box<Orange> box3 = new Box<>();

        System.out.println("Вес 1-ой коробки " + box1.getWeight());
        System.out.println("Вес 2-ой коробки " + box2.getWeight());
        System.out.println(box1.compare(box2));
        box1.pourOver(box3);
        System.out.println("Вес 1-ой коробки " + box1.getWeight());
        System.out.println("Вес 3-ей коробки " + box3.getWeight());
    }

    private static <T> void method1(int firstNumb, int secondNumb, T... array) {
        T numb;
        for (int i = 0; i < array.length; i++) {
            if (firstNumb == i) {
                numb = array[firstNumb];
                array[firstNumb] = array[secondNumb];
                array[secondNumb] = numb;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    private static <T> void method2(T... array){
        ArrayList<T> list = new ArrayList<T>(Arrays.asList(array));
        System.out.println(list);
    }
}
