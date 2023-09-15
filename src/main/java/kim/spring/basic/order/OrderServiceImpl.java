package kim.spring.basic.order;

import kim.spring.basic.discount.DiscountPolicy;
import kim.spring.basic.discount.FixDiscountPolicy;
import kim.spring.basic.member.Member;
import kim.spring.basic.member.MemberRepository;
import kim.spring.basic.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService{

    //회원
    private final MemberRepository memberRepository = new MemoryMemberRepository();

    //정책
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        //회원 id 찾기
        Member member = memberRepository.findById(memberId);

        //찾은 id에 할인 정책
        int discountPrice = discountPolicy.discount(member, itemPrice);


        // 주문 반환
        return new Order(memberId,itemName,itemPrice,discountPrice);
    }
}
