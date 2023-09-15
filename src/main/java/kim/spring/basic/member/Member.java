package kim.spring.basic.member;

public class Member {

    private Long id;
    private String name;

    private Grade grade;


    public Member(Long id, String name, Grade grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    //  id,  name, Grade  생성자 생성
    // Member 객체를 생성할 때 3개 매개변수를 필요로한다


    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Grade getGrade() {
        return grade;
    }
}
