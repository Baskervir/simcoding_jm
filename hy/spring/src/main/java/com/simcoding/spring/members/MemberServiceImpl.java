package com.simcoding.spring.members;

public class MemberServiceImpl implements MemberService{
    ////SMELL :: DIP 위반(구체 클래스에 대하여 클라이언트가 알고 있음), MemberRepository와 MemoryMemberRepository에 동시에 의존
    ////이건 마치, 자동차가, 타이어를 직접 선택하는 것과 동일.
    // 구현체를 변경하려면, 코드의 변경이 필요함
    private final MemberRepository repository;

    public MemberServiceImpl(MemberRepository repository) {
        this.repository = repository;
    }

    @Override
    public void join(Member member) {
        this.repository.save(member);
    }

    @Override
    public Member findMember(Long id) {
        return this.repository.findById(id);
    }
}
