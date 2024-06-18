package a0325.sort;

public class Student implements Comparable<Student>{
    String name;
    int korScore;
    int engScore;
    int mathScore;


    public Student(String name, int korScore, int engScore, int mathScore) {
        // Treeset 은 객체를 정렬하려면 Comparable<Student> 인터페이스 상속해야함
        this.name = name;
        this.korScore = korScore;
        this.engScore = engScore;
        this.mathScore = mathScore;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getKorScore() {
        return korScore;
    }
    public void setKorScore(int korScore) {
        this.korScore = korScore;
    }
    public int getEngScore() {
        return engScore;
    }
    public void setEngScore(int engScore) {
        this.engScore = engScore;
    }
    public int getMathScore() {
        return mathScore;
    }
    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }
   
    public int getTotalScore(){
        return korScore + engScore + mathScore;
    }
    @Override
    public int compareTo(Student other) {
        // return Integer.compare(this.getTotalScore(), other.getTotalScore());
        if(this.getTotalScore() == other.getTotalScore()){
            return this.name.compareTo(other.getName());
        }
        
        // 점수가 같지 않으면 아래것을 반환
        // 두 객체가 같으면 0을 반환
        // 첫 번째 객체가 두 번째 객체보다 작으면 음수를 반환합니다.
        // 첫 번째 객체가 두 번째 객체보다 크면 양수를 반환합니다.
        // 이렇게 하면 내림차순으로 정렬 
        // return other.getTotalScore() - this.getTotalScore();
        // 이렇게 하면 오름차순으로 정렬
        return this.getTotalScore() - other.getTotalScore();
    }
    
}
