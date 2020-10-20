package geekbrains.homework;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> boxFruit;

    public Box() {
        boxFruit = new ArrayList<T>();
    }

    //метод добавки фруктов
    public void addFruit(T fruit) {
        boxFruit.add(fruit);
    }

    //метод вычисления веса коробки
    public float getWeight() {
        float sum = 0.0f;
        for (T fruit : boxFruit) {
            sum += fruit.getWeight();
        }
        return sum;
    }

    //метод сравнения коробок
    public boolean compare(Box box) {
        if (Math.abs(this.getWeight() - box.getWeight()) < 0.0001) {
            return true;
        } else {
            return false;
        }
    }

    //метод пересыпания
    public void pourOver(Box<T> box) {
        for (T fruit : boxFruit) {
            box.addFruit(fruit);
        }
        boxFruit.clear();
    }

    public ArrayList<T> getBoxFruit() {
        return boxFruit;
    }

}
