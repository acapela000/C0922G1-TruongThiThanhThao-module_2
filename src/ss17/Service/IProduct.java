package ss17.Service;

import ss17.Model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public interface IProduct {
    Scanner sc = new Scanner(System.in);
    List<Product> list = new ArrayList<>();

    static void ProductMethod() {}

    static void addProduct() {
        System.out.print("Input product's code: ");
        String addCode = sc.nextLine();
        System.out.print("Input product's name: ");
        String addName = sc.nextLine();
        System.out.print("Input product's maker: ");
        String addMaker = sc.nextLine();
        System.out.print("Input product's price: ");
        int addPrice = Integer.parseInt(sc.nextLine());

        Product product = new Product(addCode,addName,addMaker,addPrice);
        System.out.println("Are U sure this is the product U wanna add (y/n): ");
        String add = sc.nextLine();

        if (add.equalsIgnoreCase("y")) {
            list.add(product);
            System.out.println("Product added successfully");
        } else System.out.println("The product wasn't added to the list");
    }

    static void displayProduct() {
        System.out.println(list);
    }

    static void searchProductInList(String code) {
        Product product = null;

        for (int i = 0; i < list.size() && product == null; i++) {
            if (list.get(i).getProductCode().equals(code)) {
                product = list.get(i);
            }
        }

        if (product == null) {
            System.out.println("Search Product is not found");
        } else System.out.println(product);
    }


}
