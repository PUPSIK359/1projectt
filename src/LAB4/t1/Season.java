package LAB4.t1;

public enum Season {
    WINTER(-10),
    SPRING(8),
    SUMMER(25) {
        // Переопределяем метод только для константы SUMMER
        @Override
        public String getDescription() {
            return "Теплое время года";
        }
    },
    AUTUMN(7);   // после последней константы нужна точка с запятой

    private final int avgTemp;   // средняя температура

    private Season(int avgTemp) {
        this.avgTemp = avgTemp;
    }

    public int getAvgTemp() {
        return avgTemp;
    }

    public String getDescription() {
        return "Холодное время года";
    }
}
