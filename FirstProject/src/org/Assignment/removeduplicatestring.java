package org.Assignment;

public class removeduplicatestring {
	public static void main(String[] args)
	{
		String s = "hii my name is Aditi Dipak Jadhav";
	    String res ="";
	    for(int i = 0;i<s.length();i++)
	    {

	        char c =s.charAt(i);
	        if(!res.contains(c+ ""))
	        {
	            res=res+c;
	        }
	        System.out.println(res);
	    }
		
	}

}
