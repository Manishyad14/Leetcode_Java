public class inseting_at_end {

    static int insert_end(int[] arr , int n , int key , int capacity){

        //cannot insert more elemnets if it contains more tham the size
        //hence we are going to reutrn n+1  elements
        //size of n should be less than the capacity

        if(n>=capacity){
            return n;
        }
        arr[n] = key;
        return (n+1);

    }



//this is the drivers code
    public static void main(String[] args) {
   int [] arr = new int[20];
   arr[0] = 12;
   arr[1] = 13;
   arr[2] = 19 ;
   arr[3] = 40;
   arr[4] = 50;
   arr[5] = 70;
  int capacity = 20;
  int n = 6;
  int  key = 26;


  System.out.println("before insertion of the element");
  for(int i = 0 ; i < n;i++){
 System.out.print(arr[i] + "");
  }


  //now inserting the keyssss--->>>>.

        n = insert_end(arr,n,key,capacity);
        System.out.println("after  insertion of the element");
  //now we are going to print the array after the insertion of the element
        for(int  i = 0 ; i < n ; i++ ){
            System.out.print(arr[i] + "");
        }


    }
}



//Time Complexity: O(n)
//
//Auxiliary Space: O(1)
//
//Let’s break down the time and space complexity of the provided code step by step:
//
//1. **Array Initialization:**
//
//– The array `arr` is initialized with 20 elements.
//
//– This takes O(1) time and O(20) space, which simplifies to O(1) space.
//
//2. **Array Size Calculation:**
//
//– The size of the array (`capacity`) is calculated using `sizeof(arr) / sizeof(arr[0])`.
//
//– This takes O(1) time.
//
//3. **Loop to Print the Array:**
//
//– There is a loop to print the elements of the array, which has a constant number of iterations (6 in this case).
//
//– This takes O(n) time, where n is the number of elements in the array.
//
//4. **Insertion Function (`insertSorted`):**
//
//– The insertion function itself is very simple and consists of constant time operations:
//
//– Checking if the array is full (`n >= capacity`) takes O(1) time.
//
//– Assigning the key to the array at the end and updating `n` takes O(1) time.
//
//5. **Loop to Print the Array After Insertion:**
//
//– Similar to the loop before insertion, this loop has a constant number of iterations (n + 1 in this case).
//
//– This takes O(n) time.
//
//Therefore, the overall time complexity of the code is dominated by the loop iterations for printing the array, and the insertion and checking operations are constant time. Hence, the time complexity is O(n).
//
//In terms of space complexity, the code uses a constant amount of extra space for variables (`i`, `key`, `capacity`) and the array itself. Thus, the space complexity is O(1).
//
//To summarize:
//
//– Time Complexity: O(n)
//
//– Space Complexity: O(1)