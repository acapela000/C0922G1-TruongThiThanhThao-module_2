package ss17.Model;

import java.io.Serializable;

public class Product implements Serializable {
    private String productCode;
    private String productName;
    private String productMaker;
    private int productPrice;

    public Product() {
    }

    public Product(String productCode, String productName, String productMaker, int productPrice) {
        this.productCode = productCode;
        this.productName = productName;
        this.productMaker = productMaker;
        this.productPrice = productPrice;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductMaker() {
        return productMaker;
    }

    public void setProductMaker(String productMaker) {
        this.productMaker = productMaker;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "===" + productCode + "===" + '\n' +
                "\tName: " + productName + '\n' +
                "\tMaker: " + productMaker + '\n' +
                "\tPrice: " + productPrice + '\n';
    }
}
