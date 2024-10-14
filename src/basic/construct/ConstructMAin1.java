package basic.construct;

public class ConstructMAin1 {
    public static void main(String[] args) {
        // 생성자는 호출할 때 무조건 값을 입력해야함!!! -> 이게 시스템에 오류는 방지해줌
        MemberConstruct meber1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct meber2 = new MemberConstruct("user2", 16, 80);

        MemberConstruct[] members = { meber1, meber2 };

        for (MemberConstruct member : members) {
            System.out.println("name = " + member.name + " age = " + member.age + " grade = " + member.grade);
        }
    }
}
