package ss15.bai_1;

import java.io.*;

public class FileText {

    public void writeToFile(String message, String path) {
        File file = new File(path);

        try {
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(message);
            bufferedWriter.newLine();
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


    public void copyFileText(String path, String newPath) {
        File newFile = new File(newPath);

        try {
            FileWriter fileWriter = new FileWriter(newFile);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(readFileFromText(path));
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {

        }

    }

    public String readFileFromText(String path) {
        File file = new File(path);
        String str = "";
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                str += line + "\n";
            }
            bufferedReader.close();
            fileReader.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return str;
    }
}
