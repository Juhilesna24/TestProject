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
class pos
{
    int a[] = new  int[20];
    int b[]=new int[20];
    int n,i,temp,j=1;
    void fun()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n");
        n = in.nextInt();
        System.out.println("enter array");
        for(i=1;i<=n;i++)
        {
            a[i]=in.nextInt();
        }
        for(i=1;i<=n;i++)
        {
            if(a[i]<0)
            {
                b[j]=a[i];
                j++;
            }
        }
        for(i=1;i<=n;i++)
        {
            if(a[i]>0)
            {
                b[j]=a[i];
                j++;
                
            }
        }
        for(i=1;i<=n;i++)
        {
            System.out.println(b[i]);
        }
    }
}
public class neg {
    public static void main(String args[])
    {
        pos p = new pos();
        p.fun();
    }
}
