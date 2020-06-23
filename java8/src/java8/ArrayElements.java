package java8;
import java.io.*; 
import java.util.*; 
  
class ArrayElements 
{ 

    class pair 
    { 
        int first, second; 
        pair(int f,int s) 
        { 
            first = f; second = s; 
        } 
    }; 
    
    int binarySearch(int arr[], int l, int r, int x) 
    { 
        if (r >= l) { 
            int mid = l + (r - l) / 2; 

            if (arr[mid] == x) 
                return mid; 

            if (arr[mid] > x) 
                return binarySearch(arr, l, mid - 1, x); 

            return binarySearch(arr, mid + 1, r, x); 
        } 

        return -1; 
    } 
  
  
    boolean findPairs(int arr[]) 
    { 

        HashMap<Integer,pair> map = new HashMap<Integer,pair>(); 
        int n=arr.length; 
 
        for (int i=0; i<n; ++i) 
        { 
            for (int j=i+1; j<n; ++j) 
            { 

                int sum = arr[i]+arr[j]; 
                if (!map.containsKey(sum)) {
                    map.put(sum,new pair(i,j)); 
                
                }
                else 
                { 

                    pair p = map.get(sum);

                    
                   int k=binarySearch(arr, 0, n - 1, sum);
                    System.out.println(p.first+", "+p.second+  ", "+k );
                    return true; 
                } 
            } 
        } 
        return false; 
    }
    public static void main(String args[]) 
    { 
        int arr[] = {2,4,1,5,6,3,7,8}; 
        ArrayElements a = new ArrayElements(); 
        a.findPairs(arr); 
    } 
} 