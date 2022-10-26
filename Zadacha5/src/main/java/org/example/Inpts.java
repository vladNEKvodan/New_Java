package org.example;

import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class Inpts {
    public final static String file1="C:\\Users\\01\\IdeaProjects\\Zadacha5\\src\\main\\java\\input";
    public final static String file2 = "C:\\Users\\01\\IdeaProjects\\Zadacha5\\src\\main\\java\\output";
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
            System.out.println("Ошибка");
            e.printStackTrace();
        }
        str1 = str1.replaceAll("\\s{2,}", " ").trim(); //удаляем пробелы
        str1 = str1.replaceAll("\\p{Punct}", ""); //удаляем знаки препинания
        System.out.println(str1);

        String[] arr1 = str1.split(" ");
        System.out.println(Arrays.toString(arr1));
        TreeSet<String> tree1 = new TreeSet<String>();
        for (String element : arr1) {
            if (!tree1.add(element)) {}
        }
        arr1 = tree1.toArray(arr1);

        String str2 = "";
        for (int i = 0; i < tree1.size(); i++) {
            str2 += arr1[i] + " ";
        }
        tree1.add(str2);

        try {
            FileWriter myWriter = new FileWriter(file2);
            myWriter.write(str2);
            myWriter.close();
            System.out.println("Сохранено");
        } catch (Exception e) {
            System.out.println("При сохранении произошла ошибка");
            e.printStackTrace();
        }
    }
}
