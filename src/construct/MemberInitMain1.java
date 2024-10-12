package construct;

public class MemberInitMain1 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.name="user1";
        member1.age=20;
        member1.grade = 80;

        MemberInit member2 = new MemberInit();
        member2.name="user2";
        member2.age=23;
        member2.grade = 90;

        MemberInit[] members = {member1, member2};

        for (MemberInit s : members){
            System.out.println("name : " + s.name + "age : " + s.age + "grade : " + s.grade);
        }
    }
}
