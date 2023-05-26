package ss15.bai_2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFileCSV {

    public void writeCountryListToFile(List<Country> countryList, String path) {
        File file = new File(path);

        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Country country : countryList) {
                bufferedWriter.write(country.getInfoFromVSC());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public List<Country> readCountryListFromFileCVS(String path) {
        List<Country> countryList = new ArrayList<>();
        File file = new File(path);

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] countryArr = line.split(",");
                Country country = new Country(Integer.parseInt(countryArr[0]), countryArr[1], countryArr[2]);
                countryList.add(country);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return countryList;
    }
}
