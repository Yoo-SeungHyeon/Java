package basic.access.b;

import basic.access.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        //public이므로 호출 가능
        data.publicField = 1;
        data.publicMethod();

        //default이므로 다른 패키지는 접근 불가
//        data.defaultField = 2;
//        data.defaultMethod();

        //private는 안됨
//        data.privateField = 3;
//        data.privateMethod()

        data.innerAccess();
    }
}
