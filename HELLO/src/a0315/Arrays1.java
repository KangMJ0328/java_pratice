package a0315;

import java.util.Arrays;

public class Arrays1 {
    public static void main(String[] args) {
        int[] numbers = {5,2,9,1,7};
        //배열의 정렬
        Arrays.sort(numbers);
        System.out.println("정렬된 배열: " + Arrays.toString(numbers));
        //Arrays 클래스는 배열을 다루는 유틸리티 메서드
        //배열의 복사

        int[] destination = Arrays.copyOf(numbers, numbers.length);
        System.out.println("복사된 배열: " + Arrays.toString(destination));

        //배열을 이진검색
        int[] sortedNumbers = {1,2,3,4,5,6,7,8,9};
        int index = Arrays.binarySearch(sortedNumbers,5 );
        System.out.println("검색된 요소의 인덱스: "+ index);

        //배열의 비교
        int[] array1 = {1,2,3};
        int[] array2 = {1,2,4};
        boolean isEqual = Arrays.equals(array1,array2);
        System.out.println("배열이 동일한 가요? " + isEqual);
        //배열요소 채우기 (동일한 값)
        int[] numbers1 = new int[5];
        Arrays.fill(numbers1,10);
        System.out.println("배열 요소 채우기 " + Arrays.toString(numbers1));
    }
}
