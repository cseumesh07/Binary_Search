import java.util.Scanner;

class Binary_Search{
	public static void main(String[] args){
		Scanner abc=new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		int n=abc.nextInt();
		int array[]=new int[n];
		System.out.println("Enter the array elements: ");
		for (int i=0;i<=array.length-1;i++){
			array[i]=abc.nextInt();
		}
		System.out.println("Enter key to be search: ");
		int key=abc.nextInt();
		int high=array.length-1;
		int low=0;
		int mid;
		
		while (low<=high){
			mid=(low+high)/2;
			if (key==array[mid]){
				System.out.println("Key is found at index: "+ mid);
				System.exit(0);
			}
			else 
				if (key>array[mid]){
					low=mid+1;
					high=high;
				}
				else
					high=mid-1;
				low=low;
		}
		System.out.println();
	}	
}