class Vehicle {
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed < 0) {
            System.out.println("Скорость не может быть отрицательной");
        } else {
            this.speed = speed;
        }
    }
}

class Car extends Vehicle {
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}

public class CarDemo {
    public static void main(String[] args) {
        Car car = new Car();

        car.setBrand("Toyota");
        car.setSpeed(120); // сеттер унаследован от Vehicle
        System.out.println(car.getBrand() + ", скорость: " + car.getSpeed());

        // Напрямую к полю обратиться нельзя: speed — private в Vehicle.
        // car.speed = 200; // ошибка компиляции: speed has private access in Vehicle

        // Отрицательное значение унаследованный сеттер отклоняет
        car.setSpeed(-50);
        System.out.println(car.getBrand() + ", скорость после попытки: " + car.getSpeed());
    }
}
