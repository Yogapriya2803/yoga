package guviprgm;

public class Pro {
	public static void main(String[] args) 
	{
	 int[]arr={1, 2, 6, 9, 9, 1, 3, 6, 2};
	
	 for(int i=0;i<arr.length;i++)
	 {
		 for(int j=i+1;j<arr.length;j++)
		 {
			 if(arr[i]>arr[j])
			 {
				 int temp=arr[i];
				 arr[i]=arr[j];
				 arr[j]=temp;
			 }
		 }		 
	 }
	 int num=0;
	 int count=0;
	 for(int i=0;i<arr.length-1;i++)
	 {
		 if(arr[i]==arr[i+1])
		 {
			 i++;
		}
		 else
		 {
			 System.out.println(arr[i]);
 		 }
       }
	 
	
	}


}
