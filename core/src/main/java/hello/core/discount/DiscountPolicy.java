package hello.core.discount;

import hello.core.member.Member;

/**
 * @return ���� ��� �ݾ�
 *
 */
public interface DiscountPolicy {
	
	
	int discount(Member member, int price);
	
	
	
}
