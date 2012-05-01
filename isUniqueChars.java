public class isUniqueChars
{
	//tests whether a string contains unique characters or not for ASCII encoding.
	public boolean isUniqueCharsmethod(String str)
	{
		if(str.length() > 256)
			return false;
		boolean[] char_set = new boolean[256];
		int val;
		for(int i=0;i<str.length();i++ )
		{
			val = str.charAt(i);
			System.out.println(val);
			if(char_set[val] == true)
				return false;
			char_set[val] = true;
		}

		return true;
		
	} 
	
	public boolean isUniqueCharsmethod2(String str)
	{
		if(str.length() > 256)
			return false;
		int  val;
		int checker = 0;//represents the character set
		for(int i=0;i<str.length();i++)
		{
			val = str.charAt(i) - 'a';
			if((checker & (1 << val)) > 0)
				return false;
			checker |= (1 << val);
		}
		return true;
		
	}
	
	
	public static void main(String[] args)
	{
		String test = "hello";
		isUniqueChars testclass = new isUniqueChars();
		boolean result = testclass.isUniqueCharsmethod(test);
		System.out.println("Test Result : "+ result);
	}
	
}

