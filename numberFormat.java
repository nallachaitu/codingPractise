	//the method validates whether the input string contains valid numbers and digits in the 
	//fractional part should not exceed given limit.
public static boolean checkFormatOfMarketField2(int allowedDecimal,
		String value) throws IOException, SQLException {
	    char[] digits = value.toCharArray();
	    boolean flag = false; // indicates whether a fractional part is yet started.
		char c; // for holding the chars of digits array in the loop.
		int count = 0;//count the number of digits in the fractional part.
		for(int i=0;i < digits.length;i++)
		{
			c = digits[i];
			if(isDigit(c))
			{
				if(flag)
					count++;
			}
			else if(c=='-' || c == '+')
				continue;
			else if(c == '.')
			{
				if(!flag)
					flag = true;
			}
			else	
				return false;
		}
		if(count <= allowedDecimal)
			return true;
		else 
			return false;
	}
