import java.util.*;
public class NextGreaterElement{
    public static void main(String args[]){
        int arr[] = {6,3,4,9,8,0,1,3};
        Stack<Integer> s = new Stack<>();
        int nxtGreater[] = new int[arr.length];

        // for(int i=arr.length-1; i>=0; i--){      // Next Greater Element in Right hand side
        for(int i=0; i<=arr.length-1; i++){         // Next Greater Element in Left hand side
            //while
            // while(!s.isEmpty() && arr[s.peek()] <= arr[i]){   
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){  // Next Smaller in Left

                s.pop();
            }

            //if else
            if(s.isEmpty()){
                nxtGreater[i] = -1;
            } else{
                nxtGreater[i] = arr[s.peek()];
            }

            //push in stack s
            s.push(i);

        }
        for(int i=0; i<nxtGreater.length; i++){
            System.out.print(nxtGreater[i] + " ");
        }
        System.out.println();
    }
}