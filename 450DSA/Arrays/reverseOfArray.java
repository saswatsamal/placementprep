// https://practice.geeksforgeeks.org/problems/reverse-an-array/0
import java.util.*;


class reverseOfArray {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(); //4
	
		for(int i=1;i<=n;i++){ //1-5 (1,2,3,4) -> (0,1,2,3)
		    
	        int valueOfIndex=sc.nextInt(); // [1,2,3,4]
	     
		    int[] arr=new int[valueOfIndex]; //array creation
		
		    for(int j=0;j<=arr.length-1;j++){ // loop which pushes the value to the array
		    
		        arr[j]=sc.nextInt();
		        
		    }
		
	       for(int k=arr.length-1;k>=0;k--){
	        
	            System.out.print(arr[k]+" "); //displays the value in revese order
	        }
	    
	    System.out.println();
	}
}
}