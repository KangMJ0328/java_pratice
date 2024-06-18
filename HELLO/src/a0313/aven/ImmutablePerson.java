package a0313.aven;

public final class ImmutablePerson {
    private final String name;
    private final int age;

    // 생성자를 통한 초기화
    public ImmutablePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter 메소드만 제공하고 Setter 메소드는 제공하지 않음
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // 불변성을 유지하기 위해 복제된 객체를 반환하는 메소드
    public ImmutablePerson withAgeIncreased() {
        return new ImmutablePerson(this.name, this.age + 1);
    }

    public static void main(String[] args) {
        ImmutablePerson person = new ImmutablePerson("John", 25);

        // 불변성을 유지하면서 나이 증가
        ImmutablePerson nextYearPerson = person.withAgeIncreased();

        // 원본 객체와 새로운 객체의 상태 출력
        System.out.println("원본 객체: " + person.getName() + ", " + person.getAge());
        System.out.println("변경된 객체: " + nextYearPerson.getName() + ", " + nextYearPerson.getAge());
    }
}

// 게터와 세터는 주로 객체의 상태를 알고 변경하는 메소드로 사용
//1. 은닉된 상태 
// private로 선언, 게터와 세터를 통해서만 접근 가능
// 객체의 내부상태를 외부에서 직접 조작하는 것을 막아 은닉된상태를 유지
//2. 데이터 유효성검사 
//3. 객체불변성 유지
//4. 보안적인 측면 - 민감한 정보를 반환할 때 보안적인 검사를 추가할 수 있다.
//5. 접근 제어 지시자 활용 (private, protected) - 접근권한 부여 및 제한
