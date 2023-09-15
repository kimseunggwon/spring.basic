package kim.spring.basic.discount;

import kim.spring.basic.member.Member;

public interface DiscountPolicy {

    /** return 할인 대상 금액
     */
    int discount(Member member, int price); // 근데 int price는 내가 정해?
}
