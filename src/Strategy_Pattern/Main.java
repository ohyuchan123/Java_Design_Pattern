package Strategy_Pattern;

import Strategy_Pattern.knife_sword.GameCharactor;
import Strategy_Pattern.knife_sword.Knife;
import Strategy_Pattern.knife_sword.Sword;
import Strategy_Pattern.knife_sword.Weapon;

public class Main {
    public static void main(String[] args) {
//        Ainterface ainterface = new AinterfaceImpl();
//
//        //통로
//        ainterface.funcA();
//
//        AObj aObj = new AObj();
//        aObj.funcAA();

        GameCharactor charactor = new GameCharactor();
        charactor.attack();

        charactor.setWeapon(new Knife());
        charactor.attack();

        charactor.setWeapon(new Sword());
        charactor.attack();
    }
}
