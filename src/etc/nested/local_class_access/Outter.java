package etc.nested.local_class_access;

public class Outter {
    // 로컬 클래스
    public void method1(int arg){ // 매개 변수들에 final 자동으로 붙음
        int localVariable = 1; // 필드 변수들에 final 자동으로 붙음
        class Inner{
            void method(){
                int result = arg + localVariable;
            }
        }
    }
}
