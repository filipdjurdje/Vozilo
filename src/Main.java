
public class Main {
    public static void main(String[] args) {
        
        Avtomobil car = new Avtomobil(120, 50, 4);

     
        System.out.println("Car Speed: " + car.getBrzina());
        System.out.println("Car Fuel Capacity: " + car.getKapacitetGoriva());
        System.out.println("Car Number of Doors: " + car.getBrojVrata());

  
        car.zapali();
    }
}
