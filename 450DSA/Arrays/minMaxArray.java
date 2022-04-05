// https://practice.geeksforgeeks.org/problems/find-minimum-and-maximum-element-in-an-array4428/1
public class minMaxArray {
    
}
class pair  
{  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
} 
class Compute 
{
    static pair getMinMax(long a[], long n)  
    {
        //Write your code here
        if(a.length==0)
            return new pair(0,0);
        long minValue = a[0], maxValue = a[0];
        for(long i : a){ //it will map to each value of i to the ith index of a
            if(minValue > i)
                minValue = i; 
            if(maxValue < i)
                maxValue = i; 
        }
        return new pair(minValue, maxValue);
    }
}
