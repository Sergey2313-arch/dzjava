import java.util.Scanner;

class Book {
    String title;
    int pages;

    Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }
}

class Rectangle {
    double width;
    double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return 2 * (width + height);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ===== Задача 1: деление с ArithmeticException =====
        System.out.println("=== Задача 1: деление ===");
        System.out.print("Введите делимое: ");
        int dividend = scanner.nextInt();
        System.out.print("Введите делитель: ");
        int divisor = scanner.nextInt();
        scanner.nextLine(); // убираем оставшийся перевод строки после nextInt

        try {
            int result = dividend / divisor;
            System.out.println("Результат: " + result);
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя");
        }

        // ===== Задача 2: parseInt с NumberFormatException в цикле =====
        System.out.println("\n=== Задача 2: ввод числа ===");
        int number = 0;
        boolean isValid = false;

        while (!isValid) {
            System.out.print("Введите число: ");
            String input = scanner.nextLine();

            try {
                number = Integer.parseInt(input);
                isValid = true;
            } catch (NumberFormatException e) {
                System.out.println("Введено не число");
            }
        }
        System.out.println("Вы ввели число: " + number);

        // ===== Задача 3: класс Book =====
        System.out.println("\n=== Задача 3: книги ===");
        Book book1 = new Book("Война и мир", 1225);
        Book book2 = new Book("Мастер и Маргарита", 480);

        System.out.println("Книга: " + book1.title + ", страниц: " + book1.pages);
        System.out.println("Книга: " + book2.title + ", страниц: " + book2.pages);

        // ===== Задача 4: класс Rectangle =====
        System.out.println("\n=== Задача 4: прямоугольники ===");
        Rectangle r1 = new Rectangle(4.0, 5.0);
        Rectangle r2 = new Rectangle(3.5, 7.0);

        System.out.println("Прямоугольник 1: площадь = " + r1.getArea() + ", периметр = " + r1.getPerimeter());
        System.out.println("Прямоугольник 2: площадь = " + r2.getArea() + ", периметр = " + r2.getPerimeter());

        if (r1.getArea() > r2.getArea()) {
            System.out.println("У первого прямоугольника площадь больше");
        } else if (r2.getArea() > r1.getArea()) {
            System.out.println("У второго прямоугольника площадь больше");
        } else {
            System.out.println("Площади равны");
        }

        scanner.close();
    }
}