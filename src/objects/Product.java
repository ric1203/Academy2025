package objects;

import businessRules.Iva;
import resources.Constants;

public class Product {
    private String name;
    private double price;
    private double priceIva;
    private double iva;

    public Product() {
    }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public void addIva(){
        //product.setPriceIva(Iva.increaseIvaVariable(product.price, Constants.Iva.ivaE1));
        this.priceIva = Iva.increaseIvaVariable(this.price,Constants.Iva.ivaE1);
        this.iva = this.priceIva - this.price;
    }

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
        this.price = price;
    }

    public double getPriceIva() {
        return priceIva;
    }

    public void setPriceIva(double priceIva) {
        this.priceIva = priceIva;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", priceIva=" + priceIva +
                ", iva=" + iva +
                '}';
    }
}
