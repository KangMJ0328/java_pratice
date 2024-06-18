package a0329;

class Function4 {
    static int fib(int n) {
        if(n==0){ // n이 0일때는 0을 반환
            return 0;
        }else if(n==1){
            return 1;  // n이 1일 때는 1을 반환
        }else{// n이 2 이상일 때는 그 이전의 두 값을 더하여 반환
            return fib(n - 2) + fib(n - 1);
        }

    }

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            System.out.println(fib(i));
        }
    }
}


