package practice_7_exceptions_generics.exceptions.openFile;
/*
1. Обработка проверяемого исключения
Условие задачи:
Напишите программу, которая пытается открыть файл с именем "data2.txt".
Если файл не найден, программа должна обработать исключение и вывести сообщение: "Файл не найден".
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IOExceptionCheck {
    public static void main(String[] args){
        try {
            File file = new File("data.txt");
            //System.out.println(file.getAbsolutePath());
            FileReader reader = new FileReader(file);
            System.out.println("File is open successfully");
            reader.close();
        } catch (FileNotFoundException e){
            System.err.println("File is not found");
            } catch (IOException e2) {
            e2.printStackTrace();
        }

    }
}
