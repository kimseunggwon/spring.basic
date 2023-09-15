package kim.spring.basic;

import kim.spring.basic.member.Grade;
import kim.spring.basic.member.Member;
import kim.spring.basic.member.MemberService;
import kim.spring.basic.member.MemberServiceImpl;

public class MemberApp {

    public static void main(String[] args) {

        // 메모리상 테스트 순수 자바코드
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L,"memberA", Grade.VIP);
        memberService.join(member); // 회원 저장가입

        /** 회원가입이 정상적으로 되었는지 확인
         */
        Member findMember = memberService.findMember(1L);
        System.out.println("new member = " + member.getName());
        System.out.println("find member = " + findMember.getName());

    }
}
