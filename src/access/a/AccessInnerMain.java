package access.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        //public이므로 호출 가능
        data.publicField = 1;
        data.publicMethod();

        //default이므로 접근 가능
        data.defaultField = 2;
        data.defaultMethod();

        //private는 안됨
//        data.privateField = 3;
//        data.privateMethod()

        data.innerAccess();
    }
}
