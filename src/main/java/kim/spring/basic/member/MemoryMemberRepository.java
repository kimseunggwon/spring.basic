package kim.spring.basic.member;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository{

    private static Map<Long,Member> store = new HashMap<>();

    // 메모리상 map 만들때 static 붙인거는 해당 map을 호출하거나 사용할때 객체를 사용할필요가 없어서
    // Long,Member에서 key를 Long으로 지정한이유는? -> member id를 key로 (pk 느낌)

    @Override
    public void save(Member member) {
        store.put(member.getId(), member);
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}
