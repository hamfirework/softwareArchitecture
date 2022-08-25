package design.builder;

public class CarBuilder {
    private String model;
    private String engine;
    private boolean adas;
    private boolean luxpack;

    CarBuilder model(String model) {
        this.model = model;
        return this;
    }
    CarBuilder engine(String engine) {
        this.engine = engine;
        return this;
    }

    CarBuilder adas(boolean adas) {
        this.adas = adas;
        return this;
    }

    CarBuilder luxpack(boolean luxpack) {
        this.luxpack = luxpack;
        return this;
    }

    public Car build() {
        return new Car(model, engine, adas, luxpack);
    }
}