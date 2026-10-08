package location;


public class Location {
    public int row;
    public int column;
    public double maxValue;

    public Location(int row, int column, double maxValue) {
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }

    public static Location locateLargest(double[][] a) {
        int enBuyukSatir = 0;
        int enBuyukSutun = 0;
        double enBuyukDeger = a[0][0];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > enBuyukDeger) {
                    enBuyukDeger = a[i][j];
                    enBuyukSatir = i;
                    enBuyukSutun = j;
                }
            }
        }

        return new Location(enBuyukSatir, enBuyukSutun, enBuyukDeger);
    }
}
