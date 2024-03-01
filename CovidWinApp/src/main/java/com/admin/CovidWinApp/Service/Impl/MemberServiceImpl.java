package com.admin.CovidWinApp.Service.Impl;

import com.admin.CovidWinApp.Dto.Member;
import com.admin.CovidWinApp.Service.MemberService;
import com.admin.CovidWinApp.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//Service Implementation class we can implement the methods what we have defined in service class
@Service
public class MemberServiceImpl implements MemberService {

@Autowired
    private MemberRepository memberRepository;

    @Override
    public Member createMember(Member member) {
        return memberRepository.save(member);
    }

    @Override
    public Member getMemberBySsnId(String ssnId) {
        return memberRepository.findById(ssnId).orElse(null);
    }

    @Override
    public List<Member> getVaccinatedMembers() {
        return memberRepository.findByVaccinationStatus(true);
    }

}
