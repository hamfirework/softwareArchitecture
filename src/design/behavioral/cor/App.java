package design.behavioral.cor;

public class App {
    public static void main(String[] args) {
        CarOpenHandler h1 = new AppHandler(null);
        CarOpenHandler handler = new KeyHandler(new VoiceHandler(h1));

        handler.open(OpenMethod.APP);
    }
}
