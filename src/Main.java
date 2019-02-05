import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        int firstYear = 1997;
        int lastYear = Calendar.getInstance().get(Calendar.YEAR);
        //25 - Иркутская обл., 50 - Новосибирская обл., 69 - Томская обл., 01 - Алтайский край
        String[] regionCodes = {"25", "50", "69", "01"};
        String[] years = new String[lastYear-firstYear];
        String[][] passportSeries = new String[regionCodes.length][lastYear - firstYear];

        for (int i=0; i<regionCodes.length; i++){    //Кол-во строк матрицы = кол-во регионов
            System.out.println("");
            for (int j=0; j<lastYear-firstYear; j++){  //Кол-во столбцов = кол-во лет в период с firstYear до lastYear
                years[j] = Integer.toString(firstYear + j);
                passportSeries[i][j] = regionCodes[i] + years[j].substring(years[j].length() - 2);
                System.out.format(passportSeries[i][j] + " ");
            }
        }
    }
}
