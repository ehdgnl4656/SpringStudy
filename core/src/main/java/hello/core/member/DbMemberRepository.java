package hello.core.member;

import java.util.HashMap;
import java.util.Map;

public class DbMemberRepository implements MemberRepository {

	private static Map<Long, Member> store = new HashMap<>();

	@Override
	public void save(Member member) {
		store.put(member.getId(), member);
	}

	@Override
	public Member findById(long memberId) {
		return store.get(memberId);
	}

}
