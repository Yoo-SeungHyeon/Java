package static2;

import static static2.DecoData.staticCall;

public class DecoDataMain {

    public static void main(String[] args) {
        System.out.println("1. static call");
        staticCall();

        System.out.println("2. instance call");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3. instance call");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        System.out.println("4. static instance call");
        staticCall(data2);
    }
}
