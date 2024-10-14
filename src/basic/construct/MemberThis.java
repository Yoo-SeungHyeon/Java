package basic.construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter){
        // 이렇게 지역변수와 멤버변수가 다르면 this 생략 가능
        nameField = nameParameter;
    }
}
