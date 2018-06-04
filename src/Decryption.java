
public class Decryption {
	public static String dtob(String npass) {
		String[] newPass= npass.split(";");
		String finalPassword="";
		int j=0;
		for(String a :newPass)
		{	
//			System.out.println(a);
			j=0;
			int power=0;
			char [] aa = a.toCharArray();
			for (char aaa : aa)
			{
			//System.out.println((int)aaa-48);
				j=(int) (j+(((int)aaa-48)*Math.pow(2, power)));
				//System.out.println(j);
				power++;
			}
			//System.out.println("=====**==="+j);
			char aaaa=(char)j;
			finalPassword=finalPassword+aaaa;
			
		}
		return finalPassword;
		
	}
	
	Encryption en = new Encryption();
	
	public static String decrypt(String aa) {
		String ai [] = aa.split("%");
		String orPass ="";
		for(String aii : ai) {
			char [] as = aii.toCharArray();
			
			for(int ii = 0; ii < as.length; ii++) {
				char first = as[ii];
			    
			    if(first == '!')
			    {
			    // 11 =!
			    	orPass = orPass +"11";
			    }
			    else if (first =='@')
			    {
			    	// 10 = @
			    	orPass =orPass +"10";
			    }
			    else if (first =='*')
			    {
			    	// 1 = *
			    	orPass =orPass +"1";
			    }
			    else if (first =='#')
			    {
			    	// 0 = #
			    	orPass =orPass +"0";
			    }
			    else if (first =='$')
			    {
			    	// 01 = $
			    	orPass =orPass +"01";
			    }
			    else if(first =='^') 
			    {
			    	// 00 = ^
			    	orPass =orPass +"00";
			    }
		    }
			orPass=orPass+";";
			
		}
		  
	//System.out.println("======"+orPass);
	return orPass;
	}

}
