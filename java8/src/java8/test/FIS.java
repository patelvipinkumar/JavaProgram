package java8.test;

public class FIS {
	public static void main(String args[]){
        String input = "ntiin";
        char[] arr = input.toCharArray();
        int swap = 0;
        int i = 0;
        int j = arr.length-1;
        char temp;
        while(i<j){
            if(arr[i] != arr[j]){
                if(arr[i+1] == arr[j]){
                    //swap i and i+1 and increment i, decrement j, swap++
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;

                    i++;j--;
                    swap++;
                } else if(arr[i] == arr[j-1]){
                    //swap j and j-1 and increment i, decrement j, swap++
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;

                    i++;j--;
                    swap++;
                } else if(arr[i+1] == arr[j-1] && i+1 != j-1){
                    //swap i and i+1, swap j and j-1 and increment i, decrement j, swap+2
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;

                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;

                    i++;j--;
                    swap = swap+2;
                }else{
                    swap = -1;break;
                }       
            } else{
                //increment i, decrement j
                i++;j--;
            }
        }       
        System.out.println("No Of Swaps: "+swap);
    }

}
