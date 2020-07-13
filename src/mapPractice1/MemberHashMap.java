package mapPractice1;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {

	// Key는 회원번호, Value는 Member
	private HashMap<Integer, Member> hashMap;
	
	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member>();
	}
	
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member);
	}
	
	public boolean removeMember(int memberId) {
		if(hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
			return true;
		}
		System.out.println("회원 번호가 없습니다.");
		return false;
	}
	
	public void showInfo() {

		// keySet의 경우 모든 Set 객체를 한번에 반환, Key는 중복되지 않기때문에 set Type으로 반환
		// values의 경우 모든 Value를 반환하지만 중복될 수 있기 때문에 collection Type으로 반환
		Iterator<Integer> ir = hashMap.keySet().iterator();
		
		while(ir.hasNext()) {
			int key = ir.next();
			Member member = hashMap.get(key);
			System.out.println(member);
		}
	}
}
