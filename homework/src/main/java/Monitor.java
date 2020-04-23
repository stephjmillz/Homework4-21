public class Monitor {

    private int resolution;
    private String model;
    private String manufacturer;



    public Monitor(int resolution, String model, String manufacturer){
        this.resolution = resolution;
        this.model = model;
        this.manufacturer = manufacturer;


    }

    public void drawPixelAt(int x, int y, String color){
        System.out.println("Drawing pixel at " + x + "," + y + " " + " in color " + color);
    }
}
