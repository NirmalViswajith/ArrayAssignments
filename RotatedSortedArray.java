package ArrayTechniques;
/*We rotate an ascending order sorted array at some point unknown to user. 
So for instance, 3 4 5 6 7 might become 5 6 7 3 4. 
Modify binary search algorithm to find an element in the rotated array in O(log n) time and O(1) Space complexity */

public class ArrayAssign1 {
    public static void main(String args[]) 
    { 
      int array[] = { 3,4, 5, 6, 7, 8, 9, 1, 2}; 
      int n = array.length; 
      int value = 10; 
      int i = findNumber(array, 0, n - 1, value); 
      if (i != -1) 
          System.out.println("Index: " + i); 
      else
          System.out.println("Value not found"); 
    } 
    static int findNumber(int array[], int start, int end, int value){
      if(start>end){
        return -1;
      }
      int mid=(start+end)/2;
      if (array[mid]==value){
        return mid;
      }
      if(array[start]<=array[mid]){
        if(value>=array[start] && value<=array[mid]){
          return findNumber(array, start, mid-1, value);
        }        
        else{
          return findNumber(array, mid+1, end, value);
        }
      } 
      if(value>=array[start] && value<=array[mid]){
        return findNumber(array,  mid+1,end, value);
      }
      else{
        return findNumber(array, start, mid-1, value);
      }
      
      
    }
  }  
