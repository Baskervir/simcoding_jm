-객체 지향 프로그래밍에서 중요한 디자인 패턴 중 하나. 
-상속 보다는 합성을 사용하는 것이 더 유연하고 유지보수 용이.

•상속 (Inheritance) 
1.장점 
-코드 재사용이 용이 
-클래스 간의 계층 구조를 명확히 한다 

2.단점 
-부모 클래스의 변경이 자식 클래스에 영향을 미친다 
-상속 구조가 복잡해질 경우 유지보수가 어렵다 
-다중 상속이 지원되지 않아 유연성이 떨어진다

•합성 (Composition) 

1.장점 
-클래스 간의 느슨한 결합 
-기능을 동적으로 추가 or 변경 
-코드 재사용성 ↑, 유지보수 용이 

2.단점 
-구현이 상속보다 복잡할 수 있다 
-객체 간의 관계를 명확히 이해해야 한다

📌상속 사용 예시 
class Animal { 
    void eat() { 
        System.out.println("Eating");
    } 
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking");
    } 
}

📌합성 사용 예시 
class Engine() { 
    void start() {
        System.out.println("Engine starting");
    }
}

class Car {
    private Engine engine = new Engine();

    void start() { 
        engine.start(); 
        System.out.println("Car starting");
    }
}