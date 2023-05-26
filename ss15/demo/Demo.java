package ss15.demo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("S-01", "Nhật", 10F));
        studentList.add(new Student("S-02", "Minh", 10F));
        studentList.add(new Student("S-03", "Cường", 10F));

        writeStudentListToFile(studentList, "ss15\\demo\\student.csv");

        List<Student> studentListFromFile = readStudentListFromFile("ss15\\demo\\student.csv");

        for (Student student : studentListFromFile) {
            System.out.println(student.toString());
        }
    }

    private static List<Student> readStudentListFromFile(String path) {
        List<Student> studentListFromFile = new ArrayList<>();

        File file = new File(path);

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;

            while ((line = bufferedReader.readLine()) != null) {
                String[] student = line.split(",");
                studentListFromFile.add(new Student(student[0], student[1], Float.parseFloat(student[2])));
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        return studentListFromFile;
    }

    private static void writeStudentListToFile(List<Student> studentList, String path) {
        File file = new File(path);

        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Student student : studentList) {
                bufferedWriter.write(student.getInfoToCSV());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
