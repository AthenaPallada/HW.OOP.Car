package product;

import java.util.Objects;

public class Recipe {
    private ProductList productList;
    private String name;
    private int totalCost;

    public Recipe(ProductList productList, String name, int totalCost) {
        setName(name);
        setProductList(productList);
        setTotalCost(totalCost);
    }

    public ProductList getProductList() {
        return productList;
    }

    public void setProductList(ProductList productList) {
        this.productList = productList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Recipe recipe = (Recipe) o;
        return Objects.equals(productList, recipe.productList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productList);
    }
}
