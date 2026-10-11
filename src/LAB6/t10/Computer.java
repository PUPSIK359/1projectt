package LAB6.t10;

public class Computer {
    private int number;
    private Brand brand;
    private Processor processor;
    private Memory memory;
    private Monitor monitor;
    private double price;

    public Computer(int number, Brand brand, Processor processor,
                    Memory memory, Monitor monitor, double price) {
        this.number = number;
        this.brand = brand;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public Brand getBrand() {
        return brand;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "№" + number + " " + brand + " | CPU: " + processor
                + " | RAM: " + memory + " | Монитор: " + monitor
                + String.format(" | %.2f руб.", price);
    }
}
