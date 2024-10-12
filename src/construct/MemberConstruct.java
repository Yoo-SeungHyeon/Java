package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    //이렇게 클래스랑 같은 이름을 써야 생성자가 적용됨.
    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name = " + name + " age = " + age + " grade = " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
