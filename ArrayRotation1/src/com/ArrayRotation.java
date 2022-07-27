package com;

class ArrayRotation1 { 
public void rotate(int[] nums, int k) {
    		if(k > nums.length) 
       			k=k%nums.length;
 		int[]res = new int[nums.length];
 		for(int i=0; i < k; i++){
        			res[i] = nums[nums.length-k+i];
 		}
 		int j=0;
    		for(int i=k; i<nums.length; i++){
        			res[i] = nums[j];
                    j++;
    		}
 		System.arraycopy( res, 0, nums, 0, nums.length );
}
} 
public class ArrayRotation {
	public static void main(String[] args) {
		ArrayRotation1 r = new ArrayRotation1();
        		int arr[] = { 1, 2, 3, 4, 5, 6, 7 }; 
        		r.rotate(arr, 4); 
        		for(int i=0;i<arr.length;i++){
            			System.out.print(arr[i]+" ");
        		}
	}

}
