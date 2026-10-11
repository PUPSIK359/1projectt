package LAB6.t10;

// Интерфейс ввода данных: Shop и меню не знают, откуда берутся данные
public interface ComputerInput {
    // Читает данные компьютера, возвращает null при ошибке ввода
    Computer readComputer();

    // Просит выбрать марку, возвращает null при ошибке ввода
    Brand readBrand();
}
