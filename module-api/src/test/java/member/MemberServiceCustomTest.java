package member;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName : member
 * fileName : MemberServiceCustomTest
 * author : haedoang
 * date : 2021/12/28
 * description :
 */
@SpringBootTest
class MemberServiceCustomTest {

    @Autowired
    private MemberServiceCustom memberServiceCustom;

    @Test
    @DisplayName("멤버 객체 생성 테스트")
    public void create() throws Exception {
        // given
        Member member = new Member("haedoang", "haedoang@gmail.com");

        // when
        memberServiceCustom.signup(member);

        // then
        assertThat(member.getId()).isNotNull();
    }
}