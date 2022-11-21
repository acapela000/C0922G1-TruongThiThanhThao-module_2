package ss12_JavaFrameworkCollection.ArrayListLinkedList;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;

public class  Product implements Comparable<Product> {
    String productID;
    String productName;
    int productPrice;

    public void productAdd() {

    }

    public Product(String productID, String productName, int productPrice) {
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getProductID() {
        return productID;
    }

    public String setProductID(String productID) {
        this.productID = productID;
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public String setProductName(String productName) {
        this.productName = productName;
        return productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public int setProductPrice(int productPrice) {
        this.productPrice = productPrice;
        return productPrice;
    }

    @Override
    public String toString() {
        return "productID='" + productID + '\'' +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice;
    }

    //students.sort(((o1, o2) -> o1.getName().compareTo(o2.getName())));
    @Override
    public int compareTo(@NotNull Product o) {
        if (this.productPrice - o.getProductPrice() > 0) {
            return 1;
        } else if (this.productPrice - o.getProductPrice() < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
