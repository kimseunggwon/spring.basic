package kim.spring.basic.member;

public class MemberServiceImpl implements MemberService{

    // 인서페이스 -> 구현객체
    // 지금 MemberServiceImpl은 MemberRepository 설계, MemoryMemberRepository 구현체 모두 의존을 하고있다
    // 추상화 + 구체화에 모두 의존을한다
    private final MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
