public class Main {

    public static void main(String[] args) {

        Laptop laptop = new Laptop();
        PowerOutlet laptopAdapter = new LaptopAdapter(laptop);
        laptopAdapter.plugIn();

        Refrigerator refrigerator = new Refrigerator();
        PowerOutlet refrigeratorAdapter =
                new RefrigeratorAdapter(refrigerator);
        refrigeratorAdapter.plugIn();

        SmartphoneCharger smartphoneCharger = new SmartphoneCharger();
        PowerOutlet smartphoneAdapter =
                new SmartphoneAdapter(smartphoneCharger);
        smartphoneAdapter.plugIn();
    }
}