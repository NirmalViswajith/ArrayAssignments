package ArrayTechniques;
/*Given an array nums, write a function to move all 0's to the end of it 
while maintaining the relative order of the non-zero elements in O(n) Time complexity 
and O(1) Space complexity with single traversal allowed
 */
public class ArrayAssign2 {
    public static void main (String[] args) 
    { 
        int array[] = {1,3,0,0,4,0,9}; 
        int n = array.length; 
        MoveZeroToEnd(array, n); 
        System.out.println("result is: "); 
        for (int i=0; i<n; i++) 
            System.out.print(array[i]+" "); 
    } 
    static void MoveZeroToEnd(int array[], int n){
        int cnt=0;
        for(int i=0;i<n;i++){
            if(array[i]!=0){
                array[cnt++]=array[i];
            }
        }        
        while(cnt<n){
            array[cnt++]=0;
        }
    }    
}
