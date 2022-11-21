package ss12_JavaFrameworkCollection.ArrayListLinkedList;

import java.util.*;

public class ProductManager  {
    static List<Product> arrayList = new ArrayList<>();
    static String editID;
    static int editPrice;
    static String editName;

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

//        arrayList.sort((o1, o2) -> o1.compareTo(o2));
//
//        for (Product product : arrayList) {
//            System.out.println("Ascending: " + product);
//        }
//
//        System.out.println();
//
//        arrayList.sort((o1, o2) -> o2.compareTo(o1));
//
//        for (Product product : arrayList) {
//            System.out.println("Descending: " + product);
//        }

        System.out.println();
        menu();

    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);

        int choiceNumber;
        do {
            System.out.println("Choose from menu: [0.Exit] [1.Add] [2.Edit] [3.Delete] Product");
            choiceNumber = Integer.parseInt(sc.nextLine());

            if (choiceNumber >= 0 && choiceNumber < 4) {
                if (choiceNumber == 0) {
                    System.out.println("See U again!^^!");
                    break;
                }
                if (choiceNumber == 1) { //Add
                    System.out.print("Input product ID: ");
                    String addProductID = sc.nextLine();
                    System.out.print("Input product name: ");
                    String addProductName = sc.nextLine();
                    System.out.print("Input product Price: ");
                    int addProductPrice = Integer.parseInt(sc.nextLine());

                    System.out.println("Your new added product: productID='"
                            + addProductID + "', productName='" + addProductName
                            + "', productPrice='" + addProductPrice + "'");

                    Product product5 = new Product(addProductID, addProductName, addProductPrice);
                    arrayList.add(product5);

                    for (Product product : arrayList) {
                        System.out.println("List of product after added: " + product);
                    }

                    sort(true);
                }

                if (choiceNumber == 2) { //Edit
                    System.out.print("Input index of product U wanna edit: ");
                    int indexDeleteProct = Integer.parseInt(sc.nextLine());

                    System.out.println("Product U wanna edit: " + arrayList.get(indexDeleteProct));

                    System.out.print("Edit product ID: ");
                    String eidtID = arrayList.get(indexDeleteProct).setProductID(sc.nextLine());

                    System.out.print("Edit product name: ");
                    String eidtName = arrayList.get(indexDeleteProct).setProductName(sc.nextLine());

                    System.out.print("Edit product price: ");
                    int eidtPrice = arrayList.get(indexDeleteProct).setProductPrice(Integer.parseInt(sc.nextLine()));

                   /* Product product6 = new Product(editID, editName, editPrice);

                    arrayList.add(product6);*/

                    for (Product product : arrayList) {
                        System.out.println("List of product after edited: " + product);
                    }

                    sort(true);
                }

                    if (choiceNumber == 3) { //Delete
                        System.out.println("Input index of product U wanna delete");
                        int index = Integer.parseInt(sc.nextLine());

                        arrayList.remove(index);

                        for (Product product : arrayList) {
                            System.out.println("List of product after deleted: " + product);
                        }
                    }
                }

        } while (choiceNumber > 0 && choiceNumber < 4) ;
    }
}

