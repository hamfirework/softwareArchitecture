package design.structural.flyweight;

public class TMapAPI implements ExtAPI{
    private String type;
    private String data;

    public TMapAPI(String type, String data) {
        this.type = type;
        this.data = data;
    }
    @Override
    public void send() {
        System.out.println(this+":Request TMap data...");
        System.out.printf(">>> Type: %s, Data: %s\n",type, data);

    }

    public void setData(String data) {
        this.data = data;
    }
}
