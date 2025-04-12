package com.example.demo.service;

import com.example.demo.model.Member;
import com.example.demo.repository.MemberRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AuthService {
    private final MemberRepository memberRepository;

    public Member login(String id, String pass) {
        return memberRepository.findByIdAndPass(id, pass);
    }

    public void register(Member member) {
        if (memberRepository.existsById(member.getId())) {
            throw new RuntimeException("ID already exists");
        }
        memberRepository.save(member);
    }
}