package LAB2.t4;

public class Computer {
    private int number;
    private String model;
    private int RAM;

    public Computer(int number, String model, int RAM){
        this.number = number;
        this.model =  model;
        this.RAM = RAM;

    }

    public int getNumber(){
        return number;
    }

    public int getRAM(){
        return RAM;
    }

    public String getModel(){
        return model;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }
    public void setModel(String model){
        this.model = model;
    }

    @Override
    public String toString(){return "Computer{ " + "number" + number + "Model"+ model+ "rand memor by gb"+ RAM+"}"; }
}
