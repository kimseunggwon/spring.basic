package kim.spring.basic;

import kim.spring.basic.member.Grade;
import kim.spring.basic.member.Member;
import kim.spring.basic.member.MemberService;
import kim.spring.basic.member.MemberServiceImpl;
import kim.spring.basic.order.Order;
import kim.spring.basic.order.OrderService;
import kim.spring.basic.order.OrderServiceImpl;

public class OrderApp {

    public static void main(String[] args) {

        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Long memberId = 1L;
        Member member = new Member(memberId,"memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId,"itemA",1000);

        System.out.println("order = " + order.toString());


    }
}
