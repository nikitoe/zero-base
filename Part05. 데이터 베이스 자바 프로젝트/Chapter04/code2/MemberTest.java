package code2;

import java.util.List;

public class MemberTest {
    public static void main(String[] args) {

        Member member = new Member();
        MemberService memberService = new MemberService();

        member.setUserId("abc");
        System.out.println("Id :" + member.getUserId());

        //회원가입
        boolean result = memberService.register(member);

        //회원탈퇴퇴
        boolean result2 = memberService.withdraw(member);

        //회원목록
        List<Member> memberList = memberService.getList();
    }}
