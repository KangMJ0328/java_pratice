package a0328.map1;

public class Batter extends Human {
    int bat; //타수(친 횟수)
    int hit; //유효타(안타를 만든 횟수)
    double batAvg;//타율
    public int getBat() {
        return bat;
    }
    public void setBat(int bat) {
        this.bat = bat;
    }
    public int getHit() {
        return hit;
    }
    public void setHit(int hit) {
        this.hit = hit;
    }
    public double getBatAvg() {
        return batAvg;
    }
    public void setBatAvg(double batAvg) {
        this.batAvg = batAvg;
    }
    public Batter(int number, String name, int age, double height, int bat, int hit, double batAvg) {
        super(number, name, age, height);
        this.bat = bat;
        this.hit = hit;
        this.batAvg = batAvg;
    }
    public Batter() {
        
    }
    @Override
	public String toString() {
		return "타자 [번호: " + getNumber()
		+ ", 이름: " + getName() + ", 나이: " + getAge() + ", 키: " + getHeight()+
		", 친 횟수: "+ bat + ", 유효타: " + hit + ", 타율: " + batAvg + "]";
	}

}
