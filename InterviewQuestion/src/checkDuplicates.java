import java.util.Scanner;
class checkDuplicates
{
public static void main(String args[])
{	
	int len;
	Scanner ar = new Scanner(System.in);
	System.out.println("Enter the size of array");
	len = ar.nextInt();
	int arr[] = new int[len];
	System.out.println("Enter the elements of array");	//Taking input of size of array.
	for(int i=0;i<len;i++)
	{
		arr[i] = ar.nextInt();			//Taking input of elements of array.
	}
	checkArray(len,arr);
	ar.close(); 			//scanner object closed  
}
public static void checkArray(int len,int arr[])
{
	int count = 0;
	for(int j=0;j<len;j++)
	{
		for(int k=j+1;k<len;k++)
		{
			if(arr[j]==arr[k])
			{
				count += 1;		//Checking for the duplicate values.
			}
		}
	}
	if(count>0)
	{
		System.out.println("There are "+count+" duplicate values.");		//Printing the number of duplicate values.
	}
	else 
	{
		System.out.println("There are no any duplicate values.");
	}
}
}