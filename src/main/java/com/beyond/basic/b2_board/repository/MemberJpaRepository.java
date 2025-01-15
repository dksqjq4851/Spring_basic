package com.beyond.basic.b2_board.repository;


import com.beyond.basic.b2_board.domain.Member;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class MemberJpaRepository {
    public List<Member> findAll(){
        return null;
    };

    public Optional<Member> findById(Long id){
        return null;
    };

    public Optional<Member> findByEmail(String email){
        return null;
    };

    public void save(Member member){

    };
}
