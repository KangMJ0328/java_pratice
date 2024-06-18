package a0328.map1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

public class HumanDao {

    HashMap<Integer, Human> member = new HashMap<Integer, Human>();
    Scanner scanner = new Scanner(System.in);

    public HumanDao(){
        Human human1 = new Pitcher(3, "온유", 27, 178.8, 50, 40, 15);
		Human human3 = new Pitcher(1, "진형", 29, 188.8, 60, 30, 25);
		Human human2 = new Batter(1001, "규성", 27, 176.4, 40, 20, 10);
		Human human4 = new Pitcher(2, "스윙스", 35, 174.8, 30, 80, 35);
		Human human5 = new Batter(1002, "피카츄", 15, 120.4, 20, 20, 10);
		Human human6 = new Batter(1003, "돈까스", 60, 140.4, 90, 10, 40);
        member.put(human1.getNumber(), human1);
        member.put(human2.getNumber(), human2);
		member.put(human3.getNumber(), human3);
		member.put(human4.getNumber(), human4);
		member.put(human5.getNumber(), human5);
		member.put(human6.getNumber(), human6);
		printAll();
    }


    void printAll() {
        Iterator<Integer> iterator = member.keySet().iterator();
        while(iterator.hasNext()){
            int key = iterator.next();
            Human value = member.get(key);
            System.out.println("key : "+ key + "value : " + value.toString());
        }
    }
    public void delete(){
        System.out.println("삭제 할 선수의 이름을 입력해 주세요");
        String name = scanner.next();
        int keyNumber = search(name);
        if(keyNumber == -1){
            System.out.println("해당 선수를 찾을 수 없습니다.");
        }else{
            member.remove(keyNumber);
            System.out.println("삭제가 완료되었습니다.");
        }
        
    }
    

    int search(String name) {
        Iterator<Integer> iterator = member.keySet().iterator();
        int keyNumber = -1;
        while (iterator.hasNext()){
            int key = iterator.next();
            if(member.get(key).getName().equals(name)){
                keyNumber = key;
                break;
            }
        }
        return keyNumber;
    }


    public void insert() {
        System.out.println("입력할 선수의 정보를 입력하세요");
        System.out.println("1. 투수 2. 타자");
        int choice = scanner.nextInt();
		int pitcherNumber = 3;
		int batterNumber = 1003;
        Human human = null;

        if(choice == 1){
            pitcherNumber = pitcherNumber + 1;
			System.out.println(pitcherNumber);
			human = new Pitcher();
			human.setNumber(pitcherNumber);
			System.out.print("이름: ");
			human.setName(scanner.next());
			System.out.print("나이: ");
			human.setAge(scanner.nextInt());
			System.out.print("키: ");
			human.setHeight(scanner.nextDouble());
			System.out.print("이긴 횟수: ");
			((Pitcher)human).setWin(scanner.nextInt());
			System.out.print("진 횟수: ");
			((Pitcher)human).setLose(scanner.nextInt());
			System.out.print("방어율: ");
			((Pitcher)human).setDef(scanner.nextDouble());
			member.put(pitcherNumber , human);
        }else if (choice == 2) {
			batterNumber = batterNumber + 1;
			human = new Batter();
            //다형성 - 하위클래스의 인스턴스를 상위 클래스 변수에 할당
            //human 변수는 이제 Batter클래스의 인스턴스를 참조
            //Batter클래스의 메서드및 속성에 접근할 수 있다.
			human.setNumber(batterNumber);
			System.out.print("이름: ");
			human.setName(scanner.next());
			System.out.print("나이: ");
			human.setAge(scanner.nextInt());
			System.out.print("키: ");
			human.setHeight(scanner.nextDouble());
			System.out.print("친 횟수: ");
			((Batter)human).setBat(scanner.nextInt());
			System.out.print("유효타: ");
			((Batter)human).setHit(scanner.nextInt());
			System.out.print("타율: ");
			((Batter)human).setBatAvg(scanner.nextDouble());
			member.put(batterNumber , human);
			
		}else{
            System.out.println("다시 실행하세요 ");
            return;
        }
        printAll();

    }
    public void select(){
        System.out.println("검색 할 선수의 이름을 입력해 주세요");
        String name = scanner.next();
        int keyNumber = search(name);
        if(keyNumber  == -1){
            System.out.println("해당 선수를 찾을 수 없습니다");
        }else{
            System.out.println("검색한 선수의 정보입니다.");
            System.out.println(member.get(keyNumber).toString());
        }
    }
    public void update(){
        System.out.println("정보를 변경할 선수의 이름을입력해 주세요");
        String name = scanner.next();
        int keyNumber = search(name);
        if(keyNumber == -1){
            System.out.println("해당 선수를 찾을 수 없습니다.");
        }else{
            if(member.get(keyNumber) instanceof Pitcher){
                // member.get(keyNumber) 객체를 가져올때 그 객체의 타입을 알 수 있다.
                // instanceof Pitcher 가져온 객체가 Pitcher타입인지 비교
                System.out.println("투수의 정보를 변경합니다");
                System.out.println("이긴 횟수");
                ((Pitcher)member.get(keyNumber)).setWin(scanner.nextInt());
                System.out.println("진 횟수");
                ((Pitcher)member.get(keyNumber)).setLose(scanner.nextInt());
                System.out.println("방어율");
                ((Pitcher)member.get(keyNumber)).setDef(scanner.nextDouble());
            }else if(member.get(keyNumber) instanceof Batter){
                System.out.println("타자의 정보를 변경합니다");
                System.out.println("친 횟수");

                ((Batter)member.get(keyNumber)).setBat(scanner.nextInt());
                System.out.println("유효타");
                ((Batter)member.get(keyNumber)).setHit(scanner.nextInt());
                System.out.println("타율");
                ((Batter)member.get(keyNumber)).setBatAvg((scanner.nextDouble()));


            }
        }
    }


    public void sort() {
        System.out.println("1. 투수 2. 타자");
        int choice = scanner.nextInt();
        TreeMap<Double,Human> tree = new TreeMap<Double,Human>();
        Iterator<Integer> iterator = member.keySet().iterator();
        while(iterator.hasNext()){
            int key = iterator.next();
            if(member.get(key) instanceof Pitcher){
                double def = ((Pitcher)member.get(key)).getDef();
                if(tree.containsKey(def)){
                    def = def + 0.001;
                }
                tree.put(def,member.get(key));
            }else if(member.get(key) instanceof Batter){
                double batAvg = ((Batter)member.get(key)).getBatAvg();
                if(tree.containsKey(batAvg)){
                    batAvg = batAvg + 0.001;
                }
                tree.put(batAvg, member.get(key));
            }
        }
        Iterator<Double> iter = tree.descendingKeySet().iterator();
        //내림차순으로 정렬
        while(iter.hasNext()){
            double key = iter.next();
            if(choice == 1){
                
                if(tree.get(key).getNumber() < 1000){
                    System.out.println(tree.get(key).toString());
                }
            }else if(choice ==2){
                if(tree.get(key).getNumber() > 1000){
                    System.out.println(tree.get(key).toString());
                }
            }
        }
    }
    

}
