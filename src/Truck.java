public class Truck extends Car{

    public Truck(int wheelsCount, String modelName) {
        super(wheelsCount, modelName);
    }

    @Override
    public void check() {
        super.check();
        checkTrailer();
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}