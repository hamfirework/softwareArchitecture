package design.builder;

public class App {
    public static void main(String[] args) {
        CarBuilder builder = new CarBuilder();
        Car c1 = builder.model("현대 소나타")
                .engine("가솔린 2.0")
                .adas(true)
                .build();

        Car c2 = builder.model("BMW 5시리즈")
                .engine("가솔린 3.0")
                .adas(true)
                .luxpack(true)
                .build();

        System.out.println(c1.getModel()+" / "+c1.getEngine()+" / "+c1.isAdas()+" / "+c1.isLuxpack());
        System.out.println(c2.getModel()+" / "+c2.getEngine()+" / "+c2.isAdas()+" / "+c2.isLuxpack());
    }
}
