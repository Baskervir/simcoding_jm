멀티쓰레드 환경
두 작업이 짧은 시간동안 번갈아가면서 실행됨을 확인
작업 완료 [소요 시간이 찍히는 순간 이라고 판단] 시기가 거의 동시

싱글 코어인 경우 멀티쓰레드라도 하나의 코어가 번갈아 작업 수행 [두 작업이 절대 겹치지 않는다]
멀티 코어인 경우 멀티쓰레드로 두 작업을 수행 [동시에 두 쓰레드가 수행될 수 있다 = 시간대비 작업이 겹칠 수 있어 빠르다]

[여러 쓰레드]가 [여러 작업]을 [동시에 진행]하는 것 : [병행] (concurrent)
[하나의 작업]을 [여러 쓰레드]가 나눠서 [처리]하는 것 : [병렬] (parallel)

실행할 때마다다른 결과 얻을 수 있다 = 실행중인 프로세스가 OS의 프로세스 스케줄러의 영향을 받기 때문 [순서는 모른다]

[쓰레드]는 [불확실성]을 가지고 있다

두 쓰레드가 서로 다른 자원을 사용 하는 작업 : 싱글쓰레드 프로세스(효율) < 멀티쓰레드 프로세스(효율)
[ex] 사용자로부터 데이터 입력받는 작업, 네트워크로 파일을 주고받는 작업, 프링터로 파일을 출력하는 작업
    외부 기기와 I/O을 필요로 하는 경우가 이에 해당한다 [I/O 발생시 CPU는 관여하지 않는다]

쓰레드 작업 중 I/O 발생 시 : 입력을 기다리는 동안 작업 수행 X
기다리는 동안 다른 쓰레드가 작업 처리 = 효율적인 CPU 사용 가능