package kr.co.haedoang.web.member;

import member.Member;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

/**
 * packageName : kr.co.haedoang.web.member
 * fileName : MemberController
 * author : haedoang
 * date : 2021/12/28
 * description :
 */
@RestController
@RequestMapping("members")
public class MemberController {
    @PostMapping
    public ResponseEntity<Member> saveMember(@RequestBody Member member) throws Exception {

        return ResponseEntity.created(new URI("/members" + 1)).body(member);
    }
}
