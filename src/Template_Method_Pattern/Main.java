package Template_Method_Pattern;

public class Main {
    public static void main(String[] args) {
        AbstGameConnectHelper helper = new DefaultGameConnectHelper();

        helper.requestConnection("아이디 암호 등 점속 정보를 넣어준다.");
    }
}