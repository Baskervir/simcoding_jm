package com.simcoding.atomicity;

public class NotSafeSingletonFactory {
    private static Object veryVeryImportantObject = null;

    /**
     * @apiNote 본 메서드가 위험한 이유는, 동시에 여러개의 쓰레드가 메서드를 호출하는 경우, Object가 두 번 이상 생성될 수 있다.
     * 만약, 성능상의 문제라면, 크게 문제가 없을 수도 있지만, 만약, 비즈니스 로직 상, 복수의 인스턴스가 존재하면 안되는 경우에는,
     * 데이터 정합성에 문제가 발생할 수 있는 코드
     * **/
    public static Object getObject(){
        if( veryVeryImportantObject == null ){
            veryVeryImportantObject = new Object();
        }
        return veryVeryImportantObject;
    }

//    public synchronized static Object getObject(){
//        if( veryVeryImportantObject == null ){
//            veryVeryImportantObject = new Object();
//        }
//        return veryVeryImportantObject;
//    }
}
