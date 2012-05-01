public class anagrams
{
	public boolean anagramsMethod(String first,String second)
	{
		if(first.length() != second.length())
			return false;
		
		int[] countLetters = new int[256];//the character set is assumed to be ASCII
		char[] first_array = first.toCharArray();
		for(char c : first_array)
		{
			countLetters[c]++;
			
		}
		
		int val;
		for(int i=0;i < second.length();i++)
		{
			val = second.charAt(i);
			if(--countLetters[val] < 0)
				return false;
			
		}
		return true;
		
	}
	
	
	public static void main(String[] args)
	{
		anagrams testClass = new anagrams();
		String first = "babu";
		String second = "uabb";
		boolean result = testClass.anagramsMethod(first, second);
		System.out.println("Test Result : " + result);
	}


}