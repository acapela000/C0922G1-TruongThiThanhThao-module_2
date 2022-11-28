package ss17.Service;

import ss17.Model.Product;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class InputStream {
    public static List<Product> readFile(String pathName) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(pathName));
        List<Product> list;
        list = (List<Product>) objectInputStream.readObject();
        return list;
    }
}
