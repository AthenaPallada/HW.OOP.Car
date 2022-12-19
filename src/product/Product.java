package product;

import java.util.Objects;

public class Product {
    private String name;
    private int price;
    private int count;

    public Product(String name, int price, int count) {
        setName(name);
        setPrice(price);
        setCount(count);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null || name.isEmpty()) {
            throw  new IllegalArgumentException("Заполните карточку товара полностью");
        }
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        if(count <= 0) {
            throw  new IllegalArgumentException("Заполните карточку товара полностью");
        }
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

