public class Main {
    public static void main(String[] args) {
       final Bicycle honda = new Bicycle(2, "honda");
       final Bicycle honda1 = new Bicycle(2, "honda1");
       final Car Honday = new Car(6, "Solyaris");
       final Car Honday2 = new Car(5, "Solyaris2");
       final Truck kamaz = new Truck(8, "Kamaz");
       final Truck kamaz1 = new Truck(8, "Kamaz1");

       final CheckAble[] wheeledTransports = {honda, honda1, Honday, Honday2, kamaz, kamaz1};
       for (CheckAble wheeledTransport : wheeledTransports) {
          wheeledTransport.check();
       }
    }
}