/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

import java.util.Scanner;

/**
 *
 * @author my pc
 */
class  remove
{
    String s1,s2;
    int l1,l2;
    int i,j,k,count=0;
    char c[]=new char[20];
    void two()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("enter string1 and string2");
        s1=in.next();
        s2=in.next();
        l1=s1.length();
        l2=s2.length();
        char a[]=new char[20];
        char b[]=new char[20];
        a=s1.toCharArray();
        b=s2.toCharArray();
        k=0;
        System.out.println(l1);
        System.out.println(l2);
        for(i=0;i<l1;i++)
        {
            for(j=0;j<l2;j++)
            {
                if(a[i]==b[j])
                {
                    count=count+1;
                }
            }
            if(count==0)
            {
                c[k]=a[i];
                k++;
                //count=0;
            }
            count=0;
        }
       for(i=0;i<l2;i++)
       {
           for(j=0;j<l1;j++)
           {
               if(b[i]==a[j])
               {
                   count=count+1;
               }
           }
           if(count==0)
           {
               c[k]=b[i];
               k++;
               //count=0;
           }
           count=0;
       }
        for(i=0;i<k;i++)
        {
            System.out.print(c[i]);
        }
    }
}
public class add {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        remove obj=new remove();
        obj.two();
        
    }
    
}
