package a0321.grade1;

public class StudentDTO {
    private int id;
    private String name;
	private int age;
	private int kor;
	private int eng;
	private int math;
    private int total;
    

    


    public int getTotal() {
        return kor+eng+math;
    }
    public void setTotal(int total) {
        this.total = total;
    }
    public StudentDTO(){

    }
    public StudentDTO(int id, String name, int age, int kor, int eng, int math) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getKor() {
        return kor;
    }
    public void setKor(int kor) {
        this.kor = kor;
    }
    public int getEng() {
        return eng;
    }
    public void setEng(int eng) {
        this.eng = eng;
    }
    public int getMath() {
        return math;
    }
    public void setMath(int math) {
        this.math = math;
    }

    @Override
	public String toString() {
        int total = getTotal();
        total = total/3;
        return " " + name + " \t " + age + "\t " + kor + "\t " + eng + "\t " + math +"\t " + total;
    }
    
    
}
