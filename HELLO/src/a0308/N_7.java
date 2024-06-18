package a0308;


public class N_7 {
    public static void main(String[] args) {
        //6.답 3 5
        //7. 답 
        int[] array = {1,5,3,8,2};
        int result = array[0];
        for(int i=1;i<array.length;i++){
            if(result<=array[i]){
                result = array[i];
            }else{
                result = result;
            }
        }System.out.println(result);
        



        
        
    }
    

}
    
