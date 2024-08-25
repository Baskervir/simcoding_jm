package com.simcoding.spring.members;

public interface MemberService {
    void join(Member member);
    Member findMember(Long id);
}
