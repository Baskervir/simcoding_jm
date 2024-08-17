package com.simcoding.spring.members;

public interface MemberRepository {
    void save(Member member);
    Member findById(Long id);
}
