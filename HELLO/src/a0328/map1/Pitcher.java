package a0328.map1;
//투수(자식클래스)
public class Pitcher extends Human {
    int win;
    int lose;
    double def; //방어율

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getLose() {
        return lose;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public double getDef() {
        return def;
    }

    public void setDef(double def) {
        this.def = def;
    }
    public Pitcher(){
        
    }
    public Pitcher(int number, String name, int age, double height, int win, int lose, double def) {
        super(number, name, age, height);
        this.win = win;
        this.lose = lose;
        this.def = def;
    }
    @Override
	public String toString() {
		return "투수 [번호: " + getNumber()
		+ ", 이름: " + getName() + ", 나이: " + getAge() + ", 키: " + getHeight()+
		", 이긴 횟수: "+ win + ", 진 횟수: " + lose + ", 방어율: " + def + "]";
    

}
}
