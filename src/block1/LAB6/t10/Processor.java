package block1.LAB6.t10;

public class Processor {
    private String model;
    private double frequency;
    private int cores;

    public Processor(String model, double frequency, int cores) {
        this.model = model;
        this.frequency = frequency;
        this.cores = cores;
    }

    public String getModel() {
        return model;
    }

    public double getFrequency() {
        return frequency;
    }

    public int getCores() {
        return cores;
    }

    @Override
    public String toString() {
        return String.format("%s, %.1f ГГц, %d ядер", model, frequency, cores);
    }
}
