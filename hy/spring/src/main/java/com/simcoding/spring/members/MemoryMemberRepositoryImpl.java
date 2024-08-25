package com.simcoding.spring.members;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepositoryImpl implements MemberRepository{
    private final Map<Long, Member> repo = new HashMap<>();
    @Override
    public void save(Member member) {
        this.repo.put(member.getUserId(), member);
    }

    @Override
    public Member findById(Long id) {
        return repo.get(id);
    }
}
