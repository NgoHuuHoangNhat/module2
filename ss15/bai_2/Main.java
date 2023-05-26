package ss15.bai_2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ReadFileCSV readFileCSV = new ReadFileCSV();

        List<Country> countryList = new ArrayList<>();

        countryList.add(new Country(1, "AU", "Australia"));
        countryList.add(new Country(2, "CN", "China"));
        countryList.add(new Country(3, "AU", "Australia"));
        countryList.add(new Country(4, "CN", "China"));
        countryList.add(new Country(5, "JP", "Japan"));
        countryList.add(new Country(6, "CN", "China"));
        countryList.add(new Country(7, "JP", "Japan"));
        countryList.add(new Country(8, "TH", "Thailand"));

        readFileCSV.writeCountryListToFile(countryList, "ss15\\bai_2\\country.csv");

        List<Country> countryListFromFileCVS = readFileCSV.readCountryListFromFileCVS("ss15\\bai_2\\country.csv");

        for (Country country : countryListFromFileCVS) {
            System.out.println(country.getInfoFromVSC());
        }
    }

}
