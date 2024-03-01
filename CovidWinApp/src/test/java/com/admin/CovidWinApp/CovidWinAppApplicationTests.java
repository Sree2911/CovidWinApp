package com.admin.CovidWinApp;

import com.admin.CovidWinApp.Dto.Member;
import com.admin.CovidWinApp.Service.MemberService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

//If you need to test the test cases then you can uncommented the below cases
@SpringBootTest
class CovidWinAppApplicationTests {

	@Autowired  // Use @Autowired for accessing beans
	private MemberService memberService;  // Assuming MemberService is accessible

	@Test
	void contextLoads() {
		// This test ensures the application context loads successfully
	}
		@Test
	void createMemberTest() {
		Member member = new Member("12345", "Test Member", 30, "Test Address", true, "1234567890");
		Member savedMember = memberService.createMember(member);
		assertNotNull(savedMember);
		assertEquals(member.getSsnId(), savedMember.getSsnId());
		// Assert other relevant properties as needed
	}


}

