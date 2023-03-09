package Strategy_Pattern;

public class AObj {

    Ainterface ainterface;

    public AObj(){
        ainterface = new AinterfaceImpl();
    }

    public void funcAA(){

        //위임한다.
        ainterface.funcA();
        ainterface.funcA();
    }
}
