import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        int firstYear = 1997;
        int lastYear = Calendar.getInstance().get(Calendar.YEAR);
        int passportQuantity = 10;
        //25 - Иркутская обл., 50 - Новосибирская обл., 69 - Томская обл.
        int[] regionCodes = {25, 50, 69};
        double[][] passportSeries = new double[regionCodes.length][lastYear - firstYear];

        for (int i=0; i<regionCodes.length; i++){    //Кол-во строк матрицы = кол-во регионов
            System.out.println("");
            for (int j=0; j<passportQuantity; j++){  //Кол-во столбцов = кол-во лет в период с firstYear до lastYear
                passportSeries[i][j] = Math.random();
                System.out.print(passportSeries[i][j]+" ");
            }
        }
    }
}
