package member;

import org.springframework.stereotype.Service;

import javax.xml.ws.ServiceMode;

/**
 * packageName : member
 * fileName : MemberService
 * author : haedoang
 * date : 2021/12/28
 * description :
 */
@Service
public class MemberServiceCustom {

    private MemberRepository memberRepository;

    public MemberServiceCustom(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public Long signup (Member member) {
        return memberRepository.save(member).getId();
    }
}
