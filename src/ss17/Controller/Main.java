package ss17.Controller;

import ss17.Model.Product;
import ss17.Service.InputStream;
import ss17.Service.OutputStream;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static ss17.Service.IProduct.*;

public class Main {
    public static final String PATH_FILE = "D:\\bootcamp\\module_2\\src\\ss17\\Repository\\FileListEmpty.txt";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            List<Product> productsFromFile = InputStream.readFile(PATH_FILE);
            for (Product product: productsFromFile) {
                list.add(product);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());;
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());;
        }

        boolean isExit = true;
        while (isExit) {
            System.out.println("Choose from menu: [1.Add] [2.Display] [3.Search] [4.Exit] Product");
            int choiceNumber = Integer.parseInt(sc.nextLine());

            switch (choiceNumber) {
                case 1:
                    addProduct();
                    OutputStream.write(PATH_FILE, list);
                    break;
                case 2:
                    displayProduct();
                    break;
                case 3:
                    System.out.print("Input the code of product U wanna search: ");
                    String code = sc.nextLine();
                    searchProductInList(code);
                    break;
                case 4:
                    isExit = false;
                    break;
                default:
                    System.out.println("Choose from menu");
            }
        }
    }
}
