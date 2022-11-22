package ss12_JavaFrameworkCollection.ArrayListLinkedList;

import java.util.*;

public class ProductManager  {

    static List<Product> arrayList = new ArrayList<>();

    public static void main(String[] args) {

        Product product1 = new Product("A123", "SamSung", 15000);
        Product product2 = new Product("B123", "iPhone", 20000);
        Product product3 = new Product("C123", "BlackBerry", 5000);
        Product product4 = new Product("D123", "SonyEricson", 4000);

        arrayList.add(product1);
        arrayList.add(product2);
        arrayList.add(product3);
        arrayList.add(product4);

        sort(true);
        System.out.println();
        sort(false);
        

        System.out.println();
        menu();
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);

        int choiceNumber;
        do {
            System.out.println("Choose from menu: [0.Exit] [1.Add] [2.Edit] [3.Delete] [4.Search] Product");
            choiceNumber = Integer.parseInt(sc.nextLine());

            if (choiceNumber >= 0 && choiceNumber < 5) {
                if (choiceNumber == 0) {
                    System.out.println("See U again!^^!");
                    break;
                }

                if (choiceNumber == 1) { //Add
                    addProduct();
                    sort(true);
                }

                if (choiceNumber == 2) { //Edit
                    editProduct();
                    sort(true);
                }

                    if (choiceNumber == 3) { //Delete
                        System.out.println("Input index of product U wanna delete, 0 =< index =< " + (arrayList.size()-1));
                        int index = Integer.parseInt(sc.nextLine());

                        arrayList.remove(index);
                        sort(true);
                    }

                    if (choiceNumber == 4) { //Search
                        searchProductMenu();
                        System.out.println();
                    }
                }
        } while (choiceNumber > 0 && choiceNumber < 5) ;
    }

    private static int sortLogic(boolean isAscending, Product o1, Product o2) {
        if (isAscending) {
            int solution = o1.compareTo(o2);
            return solution;
        }
        int solution = o2.compareTo(o1);
        return solution;
    }

    private static void sort(boolean isAscending) {
        String prefix = isAscending ? "Ascending" : "Descending";

        arrayList.sort((o1, o2) -> sortLogic(isAscending, o1, o2));

        for (Product product : arrayList) {
            System.out.println(prefix + ": " + product);
        }
    }

    private static void addProduct() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input product ID: ");
        String iD = sc.nextLine();
        System.out.print("Input product name: ");
        String name = sc.nextLine();
        System.out.print("Input product Price: ");
        int price = Integer.parseInt(sc.nextLine());

        System.out.println("Your new added product: productID='"
                + iD + "', productName='" + name
                + "', productPrice='" + price + "'");

        Product product5 = new Product(iD, name, price);
        arrayList.add(product5);
    }

    private static void editProduct() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the ID of the product U wanna edit: ");
        String id = sc.nextLine();
        Product product = searchProduct(id);
        //Product here is a type of data & here the data type is object, instead of String or int  (***)

        System.out.println("Product U wanna edit: " + product);

        System.out.print("Edit product ID: ");
        product.setProductID(sc.nextLine());

        System.out.print("Edit product name: ");
        product.setProductName(sc.nextLine());

        System.out.print("Edit product price: ");
        product.setProductPrice(Integer.parseInt(sc.nextLine()));
    }

    private static void searchProductMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the ID of product: ");

        String id = sc.nextLine();
        Product product = searchProduct(id);

        if (product.equals(null)) {
            System.out.println("Searched product doesn't exists");
        } else {
            System.out.println("Searched product: "+product);
        }
    }

    public static Product searchProduct(String id) {
        // Product (***)  whatever we return, have to store in a variable in the same type
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getProductID().equals(id)) {
                return arrayList.get(i);
            }
        }
        return null;
    }
}

