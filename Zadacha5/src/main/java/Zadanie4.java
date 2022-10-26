import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class Zadanie4 {
    public final static String file1="C:\\Users\\01\\IdeaProjects\\Zadacha5\\src\\main\\java\\123";
    public final static String file2 = "C:\\Users\\01\\IdeaProjects\\Zadacha5\\src\\main\\java\\file2";
    public static void main(String[] args){
        String str1 = "";
        try {
            File myFile = new File(file1);
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()) {
                String line = myReader.nextLine();
                str1 += line + " ";
                System.out.println(line);
            }
            myReader.close();
        } catch (Exception e) {
            System.out.println("Text reading failed.");
            e.printStackTrace();
        }
        str1 = str1.replaceAll("\\s{2,}", " ").trim(); //удаляем пробелы
        str1 = str1.replaceAll("\\p{Punct}", ""); //удаляем знаки препинания

        String[] arr1 = str1.split(" ");
        System.out.println("\n" + Arrays.toString(arr1));
        TreeSet<String> tree1 = new TreeSet<String>();
        for (String element : arr1) {
            tree1.add(element);
        }
        arr1 = tree1.toArray(arr1);
        String str2 = "";
        for (int i = 0; i < tree1.size(); i++) {
            str2 += arr1[i] + " ";
        }

        try { 
            FileWriter myWriter = new FileWriter(file2);
            myWriter.write(str2);
            myWriter.close();
            System.out.println("Text saved successfully.");
        } catch (Exception e) {
            System.out.println("Text saving failed.");
            e.printStackTrace();
        }
    }
}
