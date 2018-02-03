/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 String strUpper, str;
        Scanner scan = new Scanner(System.in);
        
        
        strUpper = scan.nextLine();
        
        str = strUpper.toLowerCase();
        String ourString="";
        for (int i=0; i<str.length()-1 ; i++){
            if(i==0){
                ourString = ""+str.charAt(i);
            }else{
                if(str.charAt(i-1) != str.charAt(i)){
                    ourString = ourString +str.charAt(i);
                }
            }           
        }
  int count = 0;
        for (int i = 0; i < ourString.length(); i++)
        {
            if (ourString.charAt(i) == 'a' || ourString.charAt(i) == 'e' || ourString.charAt(i) == 'i'
                    || ourString.charAt(i) == 'o' || ourString.charAt(i) == 'u')
            {
                count++;
            }
        }
        System.out.println(count);
	}
}
