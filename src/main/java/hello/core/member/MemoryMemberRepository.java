package hello.core.member;

import java.util.HashMap;
import java.util.Map;

/**
 * 데이터베이스가 아직 확정이 안됐기 때문에
 * 메모리에 넣어서 사용
 * HashMap은 동시성 이슈가 있기 때문에 필요시 ConcurrentHashMap 사용
 */
public class MemoryMemberRepository implements MemberRepository {

    private static Map<Long, Member> store = new HashMap<>();

    @Override
    public void save(Member member) {
        store.put(member.getId(), member);
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}
