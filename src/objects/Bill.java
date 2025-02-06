package objects;

import java.util.List;

public class Bill {
    private String title;
    private String description;
    private List<Product> products;
    private double total;
    private double ivaTotal;
    private double gross;

    public Bill() {
    }

    public Bill(String title, String description, List<Product> products) {
        this.title = title;
        this.description = description;
        this.products = products;
    }

    public void addTotal(){
        double t = 0.0D;
        double tI = 0.0D;
        double tG = 0.0D;
        for (Product product : this.products){
            t = t+ product.getPriceIva();
            tI = tI + product.getIva();
            tG = tG + product.getPrice();
        }
        this.total = t;
        this.ivaTotal = tI;
        this.gross = tG;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getIvaTotal() {
        return ivaTotal;
    }

    public void setIvaTotal(double ivaTotal) {
        this.ivaTotal = ivaTotal;
    }

    public double getGross() {
        return gross;
    }

    public void setGross(double gross) {
        this.gross = gross;
    }
}
