package member;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName : member
 * fileName : MemberRepositoryTest
 * author : haedoang
 * date : 2021/12/28
 * description :
 */
@DataJpaTest
class MemberRepositoryTest {
    @Autowired
    private MemberRepository memberRepository;

    @Test
    @DisplayName("멤버 생성 테스트")
    public void create() throws Exception {
        // given
        Member member = new Member("haedoang", "haedoang@gmail.com");

        // when
        memberRepository.save(member);

        // then
        assertThat(member.getId()).isNotNull();
    }
}