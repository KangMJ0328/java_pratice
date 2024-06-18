package a0326.streamEx;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main1 {
    public static void main(String[] args) {
         Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300)
            , new Transaction(raoul, 2012, 1000)
            , new Transaction(raoul, 2011, 400)
            , new Transaction(mario, 2012, 700)
            , new Transaction(mario, 2012, 700)        
            , new Transaction(alan, 2012, 950));

            practice1(transactions);   
            practice2(transactions);
            practice3(transactions);
            practice4(transactions);
            practice5(transactions);
            practice6(transactions);
            practice7(transactions);
            practice8(transactions);
    };



    //2011년에 일어난 모든 트랜잭션을 찾아 오름차순으로 정렬하시오.
    static void practice1(List<Transaction> transactions){
        List<Transaction> result = transactions.stream()
        .filter(transaction -> 2011 == transaction.getYear())
        .sorted(Comparator.comparing(Transaction::getValue))
        .collect(Collectors.toList()); 
    //.sorted(Comparator.comparing(Transaction::getValue).reversed())//내림
    //.sorted((tran1, tran2) -> Integer.compare(tran1.getValue(), tran2.getValue()))
        System.out.println(result);
    }
    // 거래자가 근무하는 모든 도시를 중복 없이 나열하시오.
    static void practice2(List<Transaction> transactions) {
        List<String> result = transactions.stream()
            .map((tran)-> tran.getTrader().getCity())
            //tran(transactions) 객체를 입력받음
            // .map(Transaction::getTrader) // 각 거래에서 거래자 객체를 추출
            // .map(Trader::getCity) //각 거래자에서 도시정보추출
            .distinct() //중복을 제거
            .collect(Collectors.toList()); // 도시정보를 리스트로 수집

        System.out.println(result); // 최종결과
    }
    // 케임브리지에서 근무하는 모든 거래자를 찾아서 이름순으로 정렬하시오.
    private static void practice3(List<Transaction> transactions) {
        List<Trader> result = transactions.stream()
            .map(Transaction::getTrader)
            .filter(trader -> "Cambridge".equals(trader.getCity()))
            .sorted(Comparator.comparing(Trader::getName))
            .collect(Collectors.toList());
        System.out.println(result);
    }
    // 모든 거래자의 이름을 알파벳 순으로 정렬해서 반환하시오.
    private static void practice4(List<Transaction> transactions) {
        String result = transactions.stream()
            .map(Transaction::getTrader)
            .map(Trader::getName)
            .distinct()
            .sorted() // 호출할 때 아무 변수도 전달하지 않으면 기본적으로 정렬
            .collect(Collectors.joining(","));
        System.out.println(result); // 최종결과
    }
    // 밀라노에 거래자가 있는가?
    private static void practice5(List<Transaction> transactions) {
        boolean result = transactions.stream()
        .anyMatch((tran) -> "Milan".equals(tran.getTrader().getCity()));
        System.out.println(result);
    }
    // 케임브리지에 거주하는 거래자의 모든 트랜잭션값을 출력하시오.
    private static void practice6(List<Transaction> transactions) {
        List<Transaction> result = transactions.stream()
        .filter(tran -> "Cambridge".equals(tran.getTrader().getCity()))
        .collect(Collectors.toList());
        System.out.println(result);
    }
    // 전체 트랜잭션 중 최댓값은 얼마인가?
    private static void practice7(List<Transaction> transactions){
        Optional<Transaction> result = transactions.stream()
            .max(Comparator.comparing(Transaction::getValue));
        System.out.println(result);
    }
    // 전체 트랜잭션 중 최솟값은 얼마인가?
    private static void practice8(List<Transaction> transactions){
        Optional<Transaction> result = transactions.stream()
            .min(Comparator.comparing(Transaction::getValue));
        System.out.println(result.get().getValue());
    }
}