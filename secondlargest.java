import java.io.*;
import java.util.*;
class secondlargest
 {
  void sl(int a[],int n)
   {int i,j,temp;
    for (i=0;i<n-1;i++)
     {
      for (j=0;j<n-i-1;j++)
       {
        if(a[j]>a[j+1])
         {temp=a[j];
          a[j]=a[j+1];
          a[j+1]=temp;
         }
        }
      }
     System.out.println("\nsecond largest ="+a[n-2]);
    }
   public static void main(String args[])
    {Scanner ob=new Scanner(System.in); 
     secondlargest obj=new secondlargest();
      int a[]=new int[20];
      System.out.println("Enter the size of array:");
      int n=ob.nextInt();
      System.out.println("enter the elements in array:");
      for (int i=0;i<n;i++)
       {
        a[i]=ob.nextInt();
       }
      obj.sl(a,n);
     }
  }

      
    
