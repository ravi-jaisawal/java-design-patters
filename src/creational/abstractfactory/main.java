package creational.abstractfactory;

import creational.abstractfactory.factory.ProductAFactory;
import creational.abstractfactory.factory.ProductBFactory;
import creational.abstractfactory.factory.ProductFactory;
import creational.abstractfactory.product.Product;

public class main {
    public static void main(String[] args) {
        // Create Product A using ProductAFactory
        ProductFactory productAFactory = new ProductAFactory();
        Product productA = productAFactory.createProduct();
        System.out.println("Product A: " + productA.getName());

        // Create Product B using ProductBFactory
        ProductFactory productBFactory = new ProductBFactory();
        Product productB = productBFactory.createProduct();
        System.out.println("Product B: " + productB.getName());
    }
}
