package ArrayTechniques;
/*Given a sorted array, remove the duplicates in place 
such that each element appear only once and return the new length. 
Do not allocate extra space for another array, Time complexity O(n) and Space complexity O(1) */
public class ArrayAssign3 {
    public static void main (String[] args)  
    { 
        int array[] = {1, 2, 2, 3, 4, 4, 4, 5, 5}; 
        int n = array.length; 
          
        n = removeDuplicates(array, n);
        
        for (int i=0; i<n; i++) 
           System.out.print(array[i]+" "); 
    } 
    static int removeDuplicates(int array[], int n){
        
        int cnt=0;
        for(int i=0;i<n;i++){
            if(array[i]!=array[i++]){
                array[cnt++]=array[i];
            }
        }
        array[cnt++]=array[n-1];
        return cnt;
    }
}

