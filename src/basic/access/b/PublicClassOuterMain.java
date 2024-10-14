package basic.access.b;

import basic.access.a.PublicClass;

public class PublicClassOuterMain {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();

        // 다른 패키지에서는 접근 불가능
//        DefaultClass class1 = new DefaultClass;
    }
}
