package ss17.Service;

import ss17.Model.Product;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class OutputStream {
    public static void write(String pathFile, List<Product> e){
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(pathFile);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(e);
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }finally {
            try {
                objectOutputStream.close();
                fileOutputStream.close();
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
    }
}
