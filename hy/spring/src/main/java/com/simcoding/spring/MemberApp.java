package com.simcoding.spring;

import com.simcoding.spring.members.Grade;
import com.simcoding.spring.members.Member;
import com.simcoding.spring.members.MemberService;
import com.simcoding.spring.members.MemberServiceImpl;

public class MemberApp {
    public static void main(String[] args) {

        AppConfig config = new AppConfig();
        MemberService memberService = config.memberService();

        Member member = new Member(1L, "hy", Grade.BASIC);

        memberService.join(member);

        Member member1 = memberService.findMember(1L);

        System.out.println(member == member1);

    }
}
