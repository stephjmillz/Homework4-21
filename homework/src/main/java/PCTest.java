public class PCTest {

    public static void main(String[] args) {
        PC pc = new PC(21, 212, 212);
        Dimension dimension = new Dimension(24, 25, 21);
                Case cases = new Case("Alienware", "Dell", "600w", 232);
                Resolution resolution = new Resolution(1920, 1080);
                Monitor monitor = new Monitor(1920, "Nvidia", "Acer");
                Motherboard motherboard = new Motherboard("MSI", "HP", 4, 4, "2342");
    }
}
