package basic.final1;

public class Member {
    private final String id;
    private String name;

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // 생성자가 아니면 초기화도 못함.
//    public void changeData(String id, String name){
//        this.id = id;
//        this.name = name;
//    }
}
