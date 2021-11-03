
package file;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class bai1 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Nhap chuoi");
	    String str = input.nextLine();
           try {
      File myObj = new File("filestr.txt");
      if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
            try {
      FileWriter myWriter = new FileWriter("filechuoi.txt");
      myWriter.write(str);
      myWriter.close();
      System.out.println("Successfully wrote to the file");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
            try {
      File myObj = new File("filechuoi.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    }
}
