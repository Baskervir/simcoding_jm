새로 생성한 쓰레드에서 고의로 예외를 발생
printStackTrace()를 이용
예외 발생 당시의 호출스택을 출력한다

호출스택의 첫 메서드가 main 메서드가 아닌 run 메서드
java.lang.Exception
    at ThreadEx2_1.throwException(ThreadEx2_1.java:8)
    at ThreadEx2_1.run(ThreadEx2_1.java:3)      // main 메서드 이미 종료됨, run() 메서드

한 쓰레드가 예외 발생 -> 종료 : 다른 쓰레드의 실행에는 영향 X

main 쓰레드의 호출스택이 없는 이유 : main 쓰레드가 이미 종료되었다