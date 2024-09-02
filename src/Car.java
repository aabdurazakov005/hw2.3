public class Car extends WheeledTransport {

    public Car(int wheelsCount, String modelName) {
        super(wheelsCount, modelName);
    }

    @Override
    public void check() {
        super.check();
        this.checkEngine();
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
