package exercise3.interface_comparable;

public class Car implements Comparable { //<Car>{
    int speed;
    int price;
    String model;
    String color;

    Car(int speed, int price, String model, String color) {
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.color = color;
    }

    public String toString() {
        return this.model + " " + this.color + " " + this.speed + " " + this.price;
    }

    // Сортируем по скорости/цене
    public int compareTo(Object o) {    // public int compareTo(Car o) {
        int temp = this.speed - ((Car)o).speed;   // int temp = this.speed - o.speed;
        if (temp == 0) {
            return this.price - ((Car)o).price;
        } else {
            return temp;
        }
    }

    @Override
    public int compareTo(Car other) {
        // Порівняння за швидкістю
        if (this.speed != other.speed) {
            return Integer.compare(this.speed, other.speed);
        }
        // Якщо швидкість однакова, порівнюємо за ціною
        if (this.price != other.price) {
            return Double.compare(this.price, other.price);
        }
        // Якщо ціна однакова, порівнюємо за моделлю
        int modelComparison = this.model.compareTo(other.model);
        if (modelComparison != 0) {
            return modelComparison;
        }
        // Якщо модель однакова, порівнюємо за коліром
        return this.color.compareTo(other.color);
    }

    // Сравнение 2-х строковых значений
    // return this.model.compareTo((Car)o).model);
}