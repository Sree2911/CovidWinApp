package com.admin.CovidWinApp.Controller;

import com.admin.CovidWinApp.Dto.Member;
import com.admin.CovidWinApp.Service.MemberService;
import com.admin.CovidWinApp.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/member")
public class MemberController {

    @Autowired
    private MemberService memberService;

    //This request should create a member in the database
    @PostMapping
    public Member createMember(@RequestBody Member member) {
        return memberService.createMember(member);
    }

    //This request should search a member in the database based on the sss_Id as a path parameter and give the details of that particular member
    @GetMapping("/{ssnId}")
    public ResponseEntity<Member> getMemberBySsnId(@PathVariable String ssnId) {
        Member member = memberService.getMemberBySsnId(ssnId);
        if (member != null) {
            return ResponseEntity.ok(member);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    //This request should search  for members in the database based on the vaccinated status and return the list of members
    @GetMapping("/vaccinatedlist")
    public List<Member> getVaccinatedMembers() {
        return memberService.getVaccinatedMembers();
    }
}
