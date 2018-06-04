import java.util.Scanner;

public class Encryption {
	 
	public static String ban(int i) {
		String pass ="";
		//System.out.println(i);
		while(i>0) {
		pass = pass+i%2;
		i = i/2;
		}
		//System.out.println("+++++++"+pass);
		return pass;
	}
	public static String asc(String i)
	{
		String ai [] = i.split("%");
		String newPass ="";
		for(String aii : ai) {
		char [] as = aii.toCharArray();
		int len = as.length;
		char last = as[len-1];
		for(int ii = 0; ii < as.length-1; ii++) {
		
		    char first = as[ii];
		    char second = as[ii+1];
		    
		    if(first == '1' && second =='1')
		    {
		    // 11 =!
		    	newPass =newPass +"!";
		    	ii++;
		    }
		    else if (first =='1' && second =='0')
		    {
		    	// 10 = @
		    	newPass =newPass +"@";
		    	ii++;
		    }
		    else if (first == '1')
		    {
		    	// 1 =*
		    	newPass  = newPass +"*";
		    }
		    else if (first =='0' && second =='0')
		    {
		    	// 00 = ^
		    	newPass =newPass +"^";
		    	ii++;
		    	
		    }
		    else if (first =='0' && second =='1')
		    {
		    	// 01 = $
		    	newPass =newPass +"$";
		    	ii++;
		    }
		    else if (first =='0')
		    {
		    	// 0 = #
		    	newPass =newPass +"#";
		    	
		    }
		    
		}
		if (len%2 != 0) {
		 if (last =='0')
		    {
		    	// 0 = #
		    	newPass =newPass +"#";
		    	
		    }
		    else if (last=='1')
		    {
		    	// 1 = *
		    	newPass =newPass +"*";
		    	
		    }}
		
		newPass = newPass + "%";
		}
		
		
		
		
		return newPass;
	}
	public static void main(String as[]) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter");
	String a =s.next();
	char [] array = a.toCharArray();
	String pas="";
	for (char b : array) {
		pas= pas + ban(b);
		pas= pas+"%";
		
	}
	System.out.println("Encrypted------>");
	System.out.println(asc(pas));
	String aa =(asc(pas));
	String gg=Decryption.decrypt(aa);
	//System.out.println(gg);
	String pass=Decryption.dtob(gg);
	System.out.println("Decrypted------>");
	System.out.println(pass);
}
	}
