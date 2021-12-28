package member;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * packageName : member
 * fileName : MemberRepository
 * author : haedoang
 * date : 2021/12/28
 * description :
 */
public interface MemberRepository extends JpaRepository<Member, Long> {
}