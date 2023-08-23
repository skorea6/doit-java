package etc.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrintAnnotationExample {

    public static void main(String[] args) {
        Method[] declaredMethods = Service.class.getDeclaredMethods(); // 모든 메소드 뽑아내기
        for (Method method : declaredMethods) {
            if(method.isAnnotationPresent(PrintAnnotation.class)){ // 어노테이션이 붙었는지 안붙어있는지
                System.out.println(method.getName() + "에는 적용되어 있음");

                PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class); // 어노테이션 정보 가져오기

                for(int i=0;i< printAnnotation.number();i++){
                    System.out.print(printAnnotation.value());
                }
                System.out.println();

                try {
                    method.invoke(new Service()); // 메소드 호출 Service service = new Service(); service.method1(); => invoke
                } catch (Exception e) {

                }

                System.out.println();
            }
        }
    }
}
