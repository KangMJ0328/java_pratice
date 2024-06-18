package a0318.b;

import a0318.a.Parent;

public class Child extends Parent{
    public void accessProtectedMember(){
        // 자식클래스에서 부모 클래스의 protected 멤버에 접근 가능
        System.out.println("Protected field in parent class: ");
        protectedMethod();
    }
    
}
