import java.util.Scanner;
class Linear_Search{
	public static void main (String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		int n=sc.nextInt();
		int array[]=new int[n];
		System.out.println("Array contents are: ");
		for (int i=0;i<=array.length-1;i++){
			array[i]=sc.nextInt();
		}
		System.out.println("Enter the key which need to search: ");
		int key=sc.nextInt();
		for (int i=0;i<=array.length-1;i++){
			if(key==array[i]){
				System.out.println("Key is found at index: "+i);
				
				System.exit(0);
			}
			System.out.println();
		}
	}
}