package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall(){
        staticValue++;

        staticMethod();
    }

    public void instanceCall(){
        instanceValue++;
        instanceMethod();

        staticValue++;
        staticMethod();
    }

    public static void staticCall(DecoData data){
        data.instanceValue++;
        data.instanceCall();
    }

    private void instanceMethod(){
        System.out.println("instaceValue = "+instanceValue);
    }

    private static void staticMethod(){
        System.out.println("staticValue = "+staticValue);
    }
}
