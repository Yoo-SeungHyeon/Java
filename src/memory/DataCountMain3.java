package memory;

public class DataCountMain3 {
    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println("A count=" + Data3.count); //클래스에 직접 접근!!
        // static은 인스턴스를 생성하지 않고 메서드 영역의 static영역에 생성된다.

        Data3 data2 = new Data3("B");
        System.out.println("B count=" + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("C count=" + Data3.count);

        Data3 data4 = new Data3("D");
        System.out.println("D count=" + data4.count); //이렇게 인스턴스에서 static 영역에 접근도 가능. but 권장하지 않음.
    }
}
