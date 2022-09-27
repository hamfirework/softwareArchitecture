package refacotring.oop;

public class Calculator {

    public int result;

    public void plus(int a, int b){
        this.result = a+b;
    }

    public void minus(int a, int b){
        this.result = a-b;
    }

    public void divide(int a, int b){
        this.result = a/b;
    }

    public void multiple(int a, int b){
        this.result = a*b;
    }

    public void printResult(){
        System.out.println(result);
    }

}
