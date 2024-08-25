package com.simcoding.spring;

import com.simcoding.spring.members.ListMemberRepositoryImpl;
import com.simcoding.spring.members.MemberService;
import com.simcoding.spring.members.MemberServiceImpl;
import com.simcoding.spring.members.MemoryMemberRepositoryImpl;

/**
 * @apiNote 해당 코드에서, 의존관계에 대하여, 주입을 다 완료해주기 때문에, 주입 관계가 변경되면
 * 해당 코드에서만 변경하면 됨. 즉 SRP가 만족되고, 다른 객체도, OCP가 만족됨
 * 
 * **/
public class AppConfig {
    //코드 주입
    public MemberService memberService(){
        //생성자 주입
        return new MemberServiceImpl(new ListMemberRepositoryImpl());
    }

}
