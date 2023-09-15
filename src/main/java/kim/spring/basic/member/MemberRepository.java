package kim.spring.basic.member;

public interface MemberRepository {

    void save(Member member);

    Member findById(Long memberId);

    // 타입은 Long 인데 memberId 변수명은 내가 정하는건가? member클래스에 Long은 그냥 id 인데
    // ->매개변수 이름은 내가 원하는 대로 지정할 수 있다

}
