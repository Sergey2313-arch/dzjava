class Product {
    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("Цена не может быть отрицательной");
        } else {
            this.price = price;
        }
    }
}

public class ProductDemo {
    public static void main(String[] args) {
        Product product = new Product();
        product.setName("Ноутбук");

        // Случай 1: корректная цена — значение устанавливается
        product.setPrice(59999.99);
        System.out.println(product.getName() + ", цена: " + product.getPrice());

        // Случай 2: отрицательная цена — сеттер её отклоняет
        product.setPrice(-100);
        System.out.println(product.getName() + ", цена после попытки: " + product.getPrice());
    }
}
