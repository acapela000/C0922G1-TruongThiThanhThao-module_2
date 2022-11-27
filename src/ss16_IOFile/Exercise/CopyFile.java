package ss16_IOFile.Exercise;

import java.io.*;
import java.util.Scanner;

public class CopyFile {
    public static void main(String[] args) {
        CopyFile copyFile = new CopyFile();
        copyFile.menu();
    }

    public void menu() {
        Scanner sc = new Scanner(System.in);
        boolean askAgain = false;

        do {
            System.out.println("Input the file path you want to copy: ");
            String fileInPath = sc.nextLine();
            System.out.println("Input the destination of the copy file: ");
            String fileOutPath = sc.nextLine();

            File fileIn = new File(fileInPath);
            File fileOut = new File(fileOutPath);

            if (fileIn.exists() && !fileOut.exists()) {
                askAgain = false;
                try {
                    copyFile(fileInPath,fileOutPath);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } else {
                askAgain = true;
                if (!fileIn.exists()) {
                    System.out.println("The file you want to copy doesn't exist");
                } else System.out.println("Make sure the destination file doesn't exist");
            }
        } while (askAgain);
    }

    private void copyFile(String fileInPath, String fileOutPath) throws IOException {
        int countChar = 0;
        FileWriter fileWriter = new FileWriter(fileOutPath);
        InputStreamReader reader = new InputStreamReader(new FileInputStream(fileInPath)); //

        int character;

        while ((character = reader.read()) != -1) { //-1: nothing to read, the loop will stop
            countChar += 1;

            fileWriter.write(character);
        }

        fileWriter.close();
        reader.close();

        System.out.println("The number of characters in this document: " + countChar);


    }

}
