import java.util.*;

class arraySearch
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of elements in an array :");
		int size=sc.nextInt();
		int numbers[]=new int[size];
		System.out.println("\nEnter the numbers :");
		for(int i=0;i<size;i++)
		{
			numbers[i]=sc.nextInt();
		}
		arraySearch as=new arraySearch();
		System.out.println("\nEnter the element to be searched :");
		int se=sc.nextInt();
		System.out.println("\n===================================");
		System.out.println("\n1.Linear Search \n2.Simple Binary Search \n3.Recursive Binary Search \n4.Built-in search method");
		System.out.println("\n===================================\n");
		System.out.println("\n\tEnter the choice :");
		int ch=sc.nextInt();
		int result=-1;
		switch(ch)
		{
		case 1:
			System.out.println("\n***********Linear Search***********\n");
			result=as.linearSearch(se,numbers);
			break;
		case 2:
			System.out.println("\n*******Simple Binary search*******\n");
			Arrays.sort(numbers);
			result=as.simpleBinarySearch(se,numbers);
			break;
		case 3:
			System.out.println("\n******Recursive Binary Search******\n");
			Arrays.sort(numbers);
			result=as.recursiveBinarySearch(numbers,0,size-1,se);
			break;
		case 4:
			System.out.println("\n******Built-in search  method******\n");
			Arrays.sort(numbers);
			result=Arrays.binarySearch(numbers,se);
			break;
		default:
			System.out.println("\nInvalid choice!!!!");
		break;
	}
	if(result>-1)
	{
		System.out.println(se+" is found...\n");
	}
	else
	{
	System.out.println(se+ " is not found !!!!\n");
	}
}

//Linear search method

int linearSearch(int n,int[] numbers)
{
	for(int i=0;i<numbers.length;i++)
	{
		if(numbers[i]==n)
		{
			return i;
		}
	}
	return -1;
}

//Simple binary search method

int simpleBinarySearch(int n ,int[] numbers)
{
	int first=0;
	int last=numbers.length-1;
	int mid=(first+last)/2;
	while(first<=last)
	{
		if(numbers[mid]<n)
		{
			first=mid+1;
		}
		else if(numbers[mid]>n)
		{
			last=mid-1;
		}	
		else
		{
			return mid;
		}
		mid=(first+last)/2;
	}
	return -1;
}
	
//Recursive Binary Search Function

int recursiveBinarySearch(int[] numbers,int first,int last ,int x ){
if(first <= last && first <numbers.length-1){
int mid = first +(last-first)/2;
if(numbers [mid] < x){
return recursiveBinarySearch(numbers,mid+1,last,x );
}
if(numbers [mid] > x){
return recursiveBinarySearch(numbers,first,mid-1,x);
}
return mid;
}
return-1;
}
}		
		
