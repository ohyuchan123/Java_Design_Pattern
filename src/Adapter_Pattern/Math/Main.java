package Adapter_Pattern.Math;

public class Main {
    public static void main(String[] args) {

        Adapter adapter = new AdapterImpl();

        System.out.println("adapter.twiceOf = "+adapter.twiceOf(100f));;
        System.out.println("adapter.halfOf = "+adapter.halfOf(88f));;
    }
}
