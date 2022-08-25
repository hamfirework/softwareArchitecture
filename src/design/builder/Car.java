package design.builder;

public class Car {
    private String model;
    private String engine;
    private boolean adas;
    private boolean luxpack;

    public Car(String model, String engine, boolean adas, boolean luxpack) {
        this.model = model;
        this.engine = engine;
        this.adas = adas;
        this.luxpack = luxpack;
    }

    public String getModel() {
        return model;
    }

    public String getEngine() {
        return engine;
    }

    public boolean isAdas() {
        return adas;
    }

    public boolean isLuxpack() {
        return luxpack;
    }
}
