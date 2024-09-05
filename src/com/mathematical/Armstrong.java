package com.mathematical;

public class Armstrong {

	public void checkArmstrong(int n)
	{
		int count=0;
		int temp=n,dig;
		while(temp>0)
		{
			temp/=10;
			count++;
		}
		System.out.println("Number of digits in"+n+" is "+count);
		temp=n;
		int sum=0;
		while(temp>0)
		{
			dig=temp%10;
			temp/=10;
			sum+=Math.pow(dig, count);
		}
		if(sum==n)
		{
			System.out.println(n+" is armstrong number.");
		}else
			System.out.println(n+" is not armstrong number.");
	}
	
	public void checkNArmstrong(int n1,int n2)
	{
		
		for(int i=n1;i<=n2;i++)
		{
			int count=0;
			int temp=i,dig;
			while(temp>0)
			{
				temp/=10;
				count++;
			}
			temp=i;
			int sum=0;
			while(temp>0)
			{
				dig=temp%10;
				temp/=10;
				sum+=Math.pow(dig, count);
			}
			if(sum==i)
			{
				System.out.println(i);
			}
			
		}	
	}
	
	public static void main(String[] args) {

		Armstrong a=new Armstrong();
		a.checkNArmstrong(20,500);
	}
}
