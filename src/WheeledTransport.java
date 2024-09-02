public  abstract class WheeledTransport implements CheckAble {

    private final String modelName;
    private final int wheelsCount;
    public String getModelName;
    public int getWheelsCount;

    public WheeledTransport(int wheelsCount, String modelName) {
        this.wheelsCount = wheelsCount;
        this.modelName = modelName;
    }
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public int getWheelsCount() {
        return wheelsCount;
    }
    public String getModelName() {
        return modelName;
    }

    @Override
    public void check() {
        System.out.println("Обслуживаем " + this.getModelName);
        for (int i = 0; i < this.getWheelsCount; i++) {
            this.updateTyre();
        }
    }
}
