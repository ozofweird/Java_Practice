package collectionPractice2;

import java.util.Comparator;

public class Member implements Comparator<Member> {

	private int memberId;
	private String memberName;
	
	public Member() { };
	
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}

	@Override
	public int compare(Member member1, Member member2) {
		// 첫번째 파라미터가 this, 두번째 파라미터가 넘어온 값
		return (member1.memberId - member2.memberId);
	}
	
//	@Override
//	public int compareTo(Member member) {
//		// 양수일 시 오름차순, 음수일 시 내림차순
//		return (this.memberId - member.memberId) * (-1);
////		return this.memberName.compareTo(member.getMemberName());
//	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return memberId;
	}

	@Override
	public boolean equals(Object obj) {  
		// TODO Auto-generated method stub
		if(obj instanceof Member) {
			Member member = (Member)obj;
			return (this.memberId == member.memberId);
		}
		return false;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "회원님의 아이디는" + memberId + "입니다.";
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	
}
