package ss10.bai_lam_them.quan_ly_sinh_vien.common;

import ss10.bai_lam_them.quan_ly_sinh_vien.model.CodegymPerson;
import ss10.bai_lam_them.quan_ly_sinh_vien.model.codegym_person.CodegymStudent;
import ss10.bai_lam_them.quan_ly_sinh_vien.model.codegym_person.CodegymTeacher;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileCSV<E> {

    public void writeToFileCSV(List<CodegymPerson> personList, String path) {
        File file = new File(path);

        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (CodegymPerson person : personList) {
                bufferedWriter.write(person.getInfoToFileCSV());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List readFileFromFileCSV(String path) {
        File file = new File(path);
        List<CodegymPerson> list = new ArrayList<>();
        String studentPath = "ss10\\bai_lam_them\\quan_ly_sinh_vien\\common\\student_list.csv";
        String teacherPath = "ss10\\bai_lam_them\\quan_ly_sinh_vien\\common\\teacher_list.csv";

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;

            while ((line = bufferedReader.readLine()) != null) {
                String[] arr = line.split(",");
                boolean flag = false;
                if (arr[2].equals("Nam")) {
                    flag = true;
                }
                if (path.equals(studentPath)) {
                    CodegymStudent codegymStudent = new CodegymStudent(arr[0], arr[1], flag, arr[3], Float.parseFloat(arr[4]));
                    list.add(codegymStudent);
                } else if (path.equals(teacherPath)) {
                    CodegymTeacher codegymTeacher = new CodegymTeacher(arr[0], arr[1], flag, arr[3]);
                    list.add(codegymTeacher);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

}
