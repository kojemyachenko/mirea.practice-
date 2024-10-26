package kojemyachenko;

public enum Season {
    WINTER(-12.5, 140), SUMMER(20.4, 250), SPRING(15.5, 220), AUTUMN(6.3, 290);
    private final double avgTemp;
    private final int avgPrec;

    Season(double avgTemp, int avgPrec) {
        this.avgTemp = avgTemp;
        this.avgPrec = avgPrec;
    }

    public double getAvgTemp() {
        return avgTemp;
    }
    public int getAvgPrec(){
        return avgPrec;
    }
    public String getDescription() {
        if (this == Season.AUTUMN || this == Season.WINTER) {
            return ("Это холодное время года.");
        }
        else {
            return ("Это тёплое время года.");
        }
    }

    @Override
    public String toString() {
        return "Season{" +
                "Средняя температура=" + avgTemp +
                ", Среднее количество осадков=" + avgPrec +
                '}';
    }
}
