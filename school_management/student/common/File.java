package school_management.student.common;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class File {
    public static void writeToFile(List<String> list, String path, boolean append) {
        try {
            FileWriter fileWriter = new FileWriter(path,append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String str : list) {
                bufferedWriter.write(str);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static List<String> readFromFile(String path) {
        List<String> list = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                list.add(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

}
