package com.admin.CovidWinApp.repository;

import com.admin.CovidWinApp.Dto.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<Member, String> {
    List<Member> findByVaccinationStatus(boolean vaccinated);

}
