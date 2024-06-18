package a0313.aven;

public class User {
    private String username;
    private String password;

    // Getter 메소드
    public String getUsername() {
        return username;
    }

    // Setter 메소드
    public void setUsername(String username) {
        // 유효성 검사: username이 null이 아니고 비어있지 않은 경우에만 설정
        if (username != null && !username.trim().isEmpty()) {
            this.username = username;
        } else {
            System.out.println("유효하지 않은 사용자 이름입니다.");
        }
    }

    // 보안적 측면에서의 Getter 메소드
    public String getPassword() {
        return "****";  // 실제 비밀번호를 반환하지 않고 가려진 형태를 반환
    }

    // 보안적 측면에서의 Setter 메소드
    public void setPassword(String password) {
        // 유효성 검사: password가 null이 아니고 비어있지 않은 경우에만 설정
        if (password != null && !password.trim().isEmpty()) {
            this.password = password;
        } else {
            System.out.println("유효하지 않은 비밀번호입니다.");
        }
    }

    public static void main(String[] args) {
        User user = new User();

        // 유효성 검사를 통한 값 설정
        user.setUsername("john_doe");
        user.setPassword("secure_password");

        // 유효하지 않은 값 설정
        user.setUsername("");  // 출력: "유효하지 않은 사용자 이름입니다."
        user.setPassword("");  // 출력: "유효하지 않은 비밀번호입니다."

        // 보안적 측면에서의 Getter를 통한 값을 가져와 출력
        System.out.println("사용자 이름: " + user.getUsername());
        System.out.println("비밀번호: " + user.getPassword());  // 출력: "****"
    }
}