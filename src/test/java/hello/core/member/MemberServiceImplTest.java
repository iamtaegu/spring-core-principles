package hello.core.member;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemberServiceImplTest {

    MemberServiceImpl memberService = new MemberServiceImpl();

    @Test
    void join() {
        //given
        Member member = new Member(1L, "member A", Grade.VIP);

        //when
        memberService.join(member);
        Member findMember = memberService.findMember(1L);

        //then
        org.assertj.core.api.Assertions.assertThat(member).isEqualTo(findMember);
    }

    //@Test
    void findMember() {
    }
}