package basic.memory;

import basic.pack.Data;

public class Data3 {
    public String name;
    public static int count;

    public Data3(String name) {
        this.name = name;
        //Data3.count++; 자기 영역에선 Data3 생략 가능
        count++;
    }
}
