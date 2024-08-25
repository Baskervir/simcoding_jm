package com.simcoding.spring.members;

import java.util.*;

public class ListMemberRepositoryImpl implements MemberRepository{
    private final List<Member> repo = new ArrayList<>();
    @Override
    public void save(Member member) {
        this.repo.add(member);
    }

    @Override
    public Member findById(Long id) {
        for (Member member : this.repo) {
            if(Objects.equals(member.getUserId(), id)) return member;
        }
        return null;
    }
}
