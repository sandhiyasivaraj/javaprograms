/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guvi;

import java.util.Scanner;

/**
 *
 * @author skcet
 */
public class Guvi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
        String S1=in.nextLine();
        String S2=in.nextLine();
        String S3=in.nextLine();
       String s3="",s1="",s2="";
        char c1[]=S1.toCharArray(),c2[]=S2.toCharArray(),c3[]=S3.toCharArray();
        int count=0;
        for(int i=0;i<S1.length();i++)
        {
            if(Character.isDigit(c1[i]))
            {
                s1=s1+c1[i];
            }
            if(Character.isDigit(c2[i]))
            {
                s2=s2+c2[i];
            }
            if(Character.isDigit(c3[i]))
            {
                s3=s3+c3[i];
            }
            else
            {
                int n1=Integer.parseInt(s1);
                int n2=Integer.parseInt(s2);
                int n3=Integer.parseInt(s3);
                if(n1==n3 && n1==n2)
                    count++;
                s3="";s1="";s2="";
            }
        } 
        
        int n1=Integer.parseInt(s1);
                int n2=Integer.parseInt(s2);
                int n3=Integer.parseInt(s3);
                if(n1==n3 && n1==n2)
                    count++;
        if(count!=0)
            System.out.println("yes");
        else
            System.out.println("no");
        }
    }
    

