package creational.abstractfactory.factory;

import creational.abstractfactory.product.Product;
import creational.abstractfactory.product.ProductB;

public class ProductBFactory implements  ProductFactory{
    @Override
    public Product createProduct() {
        return new ProductB();
    }
}
