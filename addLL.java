import java.util.LinkedList;
import java.util.ListIterator;
//Given two Linked Lists containing the numbers in LSB order add them and compute the result.
public class addLL
{
	public int getSum(LinkedList L1,LinkedList L2)
	{
		
		if(L1.size() == 0 && L2.size() == 0)
			return 0;
		ListIterator itr1 = L1.listIterator();
		ListIterator itr2 = L2.listIterator();
		int carry = 0;
		int pow = 1;
		int sum = 0;
		int cur,val1,val2;
		while(itr1.hasNext() && ((ListIterator) itr2).hasNext())
		{
			val1 = (Integer) itr1.next();
			val2 = (Integer)itr2.next();
			cur = val1 + val2 + carry;
			if(cur > 9)
			{
				carry = cur/10;
				cur = cur % 10;
			}
			sum = sum + pow * cur;
			pow = pow * 10;
		}
		if(itr1.hasNext())
		{
			while(itr1.hasNext())
			{
				cur = (Integer)itr1.next() + carry;
				if(cur > 9)
				{
					carry = cur/ 10;
					cur = cur % 10;
				}
				sum = sum + pow*cur;
				pow = pow * 10;
			}
				
		}
		if(itr2.hasNext())
		{
			while(itr2.hasNext())
			{
				cur = (Integer)itr2.next() + carry;
				if(cur > 9)
				{
					carry = cur/ 10;
					cur = cur % 10;
				}
				sum = sum + pow*cur;
				pow = pow * 10;
			}
			
		}
		if(carry != 0)
		{
			sum = sum + carry*pow;
		}
		return sum;
	}
	public static void main(String[] args)
	{
		LinkedList L1 = new LinkedList();
		LinkedList L2 = new LinkedList();
		L1.add(2);
		L1.add(1);
		L2.add(4);
		L2.add(9);
		addLL test = new addLL();
		int result = test.getSum(L1, L2);
		System.out.println("the result of the summation : " + result);
	}
}
