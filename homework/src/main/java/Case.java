public class Case {

    private String model;
    private String manufacturer;
    private String powerSupply;
    private int dimension;

    public Case(String model, String manufacturer, String powerSupply, int dimension){
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimension = dimension;
    }

    public void pressPowerButton(){
        System.out.println("System is activating");
    }

    @Override
    public String toString(){
        return "Case{" + "model=" +model + '\'' + ", manufacturer=" + manufacturer + '\'' + ", powerSupply=" + powerSupply + '\'' +
                ", dimension=" + dimension +'}';
    }
}
