//Java Program to Find Largest Element of an Array
//Java Program to Calculate Standard Deviation
//Java Program to Add Two Matrix Using Multi-dimensional Arrays
//Java Program to Multiply Two Matrix Using Multi-dimensional Arrays
public class LargestArray1 
{  
    public static void main(String[] args) 
	{  
  
        //Initialize array  
        int [] arr = new int [] {25, 11, 7, 75, 56};  
        //Initialize max with first element of array.  
        int max = arr[0];  
        //Loop through the array  
        for (int i = 0; i < arr.length; i++) 
		{  
            //Compare elements of array with max  
           if(arr[i] > max)  
               max = arr[i];  
        }  
        System.out.println("Largest element present in given array: " + max);  
    }  
}  