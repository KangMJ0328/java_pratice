package a0326.stream;

import java.util.Arrays;
import java.util.List;
//회원(Member) 객체에서 '남자' 회원의 평균 나이를 람다식과 스트림을적용
public class Stream9 {
    public static void main(String[] args) {
        List<Member> list = (List) Arrays.asList(
        new Member("박태호",Member.MALE,30),
        new Member("김연경",Member.FEMALE, 29),
        new Member("손유일",Member.MALE,32),
        new Member("안재홍",Member.MALE,27));
        // 1. 외부반복자를 적용
        // INDEX를 사용하는 FOR문 그리고 iterator을 이용하는 while문
        // 은 모두 외부 반복자를 이용한다.
        int count = 0;
        double sum = 0;
        for(int i =0; i<list.size();i++){
            if(list.get(i).getGender() == Member.MALE){
                sum = sum + list.get(i).getAge();
                count++;
            }
        }
        double ageAvg1 = sum / count;
        System.out.println("남성평균 나이: "+ageAvg1);

        //방법 2.내부반복자를 적용하여 해결
        double ageAvg = list.stream()
                .filter(m -> m.getGender() == Member.MALE)
                .mapToInt(Member::getAge)
                .average()
                .getAsDouble();
                System.out.println("남자 회원의 평균 나이 : " + ageAvg);
            }
        
}
// 1. list.steam() : 리스트를 스트림으로 변환
// 2. 성별이 남성인 회원만 필터링 -> 중간연산
// 3. 회원객체를 나이로 매칭 - mapToInt 메서드는 객체를 int 값으로 변환 
// - Intstream을 생성
// 4. average() 스트림요소들의 평균을 계산 -> 최종처리 집계처리
// getAsDouble(): 평균값을 double 형태로 반환합니다.
