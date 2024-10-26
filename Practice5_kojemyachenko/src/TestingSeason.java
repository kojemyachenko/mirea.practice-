package kojemyachenko;

public class TestingSeason {
    public static void main(String[] args) {
        Season season = Season.SUMMER;
        System.out.println(season);
        info(season);
        printAll();
    }
    public static void info (Season season){
        switch(season){
            case WINTER:
                System.out.println("Моя снежная зима!");
                break;
            case SPRING:
                System.out.println("Моя волшебная весна!");
                break;
            case SUMMER:
                System.out.println("Моё жаркое лето!");
                break;
            case AUTUMN:
                System.out.println("Моя тёплая осень!");
                break;
        }
    }
    public static void printAll(){
        for (Season season : Season.values()) {
            System.out.println(season.name() + " - " + season.getDescription() + "; Средняя температура: "+ season.getAvgTemp() + " Среднее количество осадков: " + season.getAvgPrec());
        }
    }
}