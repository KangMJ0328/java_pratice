package a0308;

public class ArrayCopy1 {
    public static void main(String[] args) {
        //길이가 3인 배열
        String [] oldStrArray = {"java","array","copy"};
        //길이가 5인배열 
        String [] newStrArray = new String[5];
        //배열 항목 복사
        System.arraycopy(oldStrArray,0,newStrArray,0,oldStrArray.length);
        //               원본배열 ,시작인덱스,새배열,붙여넣기인덱스,복사 항목수
        for(int i=0;i< oldStrArray.length; i++){
            newStrArray[i] = oldStrArray[i];
        }
        //배열 항목 출력
        for(int i=0;i< newStrArray.length; i++){
            System.out.print(newStrArray[i]+", ");
        }
    }   
}
