package Adapter_Pattern.Math;

public class AdapterImpl implements Adapter{

    @Override
    public float twiceOf(Float f) {
        System.out.println("두배 함수 호출");
        return (float) Math.twoTime(f.doubleValue());
    }

    @Override
    public float halfOf(Float f) {
        System.out.println("절반 함수 호출");
        return (float) Math.half(f.doubleValue());
    }
}
