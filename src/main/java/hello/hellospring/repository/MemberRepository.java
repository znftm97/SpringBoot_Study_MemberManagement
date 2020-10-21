package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

//4가지 기능 구현
public interface MemberRepository {
    Member save(Member meber); // 회원을 저장소에 저장
    Optional<Member> findById(Long id); // id 찾기
    Optional<Member> findByName(String name); // 이름 찾기
    List<Member> findAll(); // 저장된 모든 회원 리스트 반환
}
