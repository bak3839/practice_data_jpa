package study.datajpa.repository;

import study.datajpa.Entity.Member;

import java.util.List;

public interface MemberRepositoryCustom {
    List<Member> findMemberCustom();
}
