package abstractinterfacepoly.movies;

import java.util.List;
public class Calculator {
    private Calculator() {}

    public static double calculate(List<MediaItem> mediaItems) {
        double totalMinutes = 0;
        for (MediaItem item : mediaItems) {
            if (item instanceof Series) {
                Series series = (Series) item;
                totalMinutes += series.getRuntime() * series.getSeriesCount();
            } else {
                totalMinutes += item.getRuntime();
            }
        }
        return totalMinutes / 1440;
        // Напишите реализацию метода, который будет возвращать общее количество дней,
        // потраченных на просмотр фильмов и сериалов
    }
}
