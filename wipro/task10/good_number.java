/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author skcet
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
      int N=sc.nextInt(),two=2,three=3;
      int arr[]=new int[N];
      if(N<=7)
      {
      for(int i=0;i<N;i++)
      {
          if(i%2==0)
              arr[i]=1;
          else if(i%3==0)
              arr[i]=3;
          else
              arr[i]=2;
      }
      for(int i=0;i<N;i++)
            System.out.print(arr[i]);
      }
      else
            System.out.println("good number cannot be generated");
      }
    
    }
    
