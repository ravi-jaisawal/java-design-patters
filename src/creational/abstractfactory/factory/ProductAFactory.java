package creational.abstractfactory.factory;

import creational.abstractfactory.product.Product;
import creational.abstractfactory.product.ProductA;

public class ProductAFactory implements ProductFactory {
    @Override
    public Product createProduct() {
        return new ProductA();
    }
}
