package com.admin.CovidWinApp.Service;

import com.admin.CovidWinApp.Dto.Member;


import java.util.List;
import java.util.Optional;

public interface MemberService {
    Member createMember(Member member);

    Member getMemberBySsnId(String ssnId);

    List<Member> getVaccinatedMembers();

}
