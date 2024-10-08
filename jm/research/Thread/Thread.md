===스레드 (Thread)===
1. 정의
   •프로세스 내에서 실행되는 흐름의 단위
   •하나의 프로세스 내에서 여러 스레드를 생성
    -> 동시에 작업 수행 가능

2. 특징
   •경량성
    - 같은 프로세스 내에서 메모리 공간 공유 -> 생성 및 전환 빠름
   •자원 공유
    - 같은 프로세스 내에서 메모리 공간 공유
   •동기화 필요
    - 여러 스레드가 공유 자원에 접근할 때 동기화 필요 (경쟁 조건)
   
3. Note
   - 프로세스는 프로그램 수행을 위한 자원과 쓰레드로 구성
   - 자원을 이용해 실제로 작업을 수행하는 것 = 스레드
   - 둘 이상의 쓰레드 가진 프로세스 = 멀티쓰레드 프로세스
   - 하나의 프로세스가 가질 수 있는 쓰레드 수 제한 X
   -> 개별적인 메모리 공간을 필요로 하기에 메모리 한계에 따른다
   - CPU 의 코어 는 한번에 하나의 작업만 수행
   -> 프로세스 내에 여러 쓰레드가 동시 작업 => 멀티태스킹
   - 멀티쓰레딩의 장단점
   -> ⭕ CPU 사용율 향상
   -> ⭕ 자원의 효율적 사용
   -> ⭕ 사용자에 대한 응답성 향상
   -> ⭕ 작업 분리로 인한 코드 간결
   -> ❌ 자원 공유로 인한 동기화 문제
   - Thread 클래스 상속 : 자손 클래스에서 Thread 클래스의 메서드 직접 호출 가능
   - Runnable 구현 : Thread 클래스의 static 메서드인 currentThread()를 호출하여 쓰레드에 대한 참조를 얻어 와야만 호출 가능
   - static Thread currentThread() : 현재 실행중인 쓰레드의 참조를 반환
   - String getName() : 쓰레드의 이름을 반환
   - 쓰레드의 이름 지정 X : 'Thread-번호'형식으로 이름이 정해진다
   - System.out.println(Thread.currentThread().getName())
      = Thread t = Thread.currentThread();
        String name = t.getName();
        System.out.println(name);
   - 쓰레드의 실행 - start() : start()를 호출해야만 쓰레드 실행
      = start()가 호출 -> 바로 실행 X -> 실행대기 상태 -> 자신의 차례에 실행 [OS의 스케쥴러가 작성한 스케쥴에 의해 결정]
   - 한 번 실행이 종료된 쓰레드는 다시 실행할 수 없다 [start()가 한 번만 호출 가능]
   - 쓰레드 작업을 한 번 더 수행해야 한다면 -> 새로운 쓰레드 생성 -> start()호출
   - 하나의 쓰레드에 대해 start()를 두 번 이상 호출 -> IllegalThreadStateException 발생
   - start() vs run()
      = start() : 쓰레드 실행 | run() : 클래스에 선언된 메서드를 호출
   - start()는 새로운 쓰레드가 작업을 실행하는데 필요한 호출스택을 생성 -> run()호출 -> 생성된 호출 스택에 run()이 첫 번째로 올라간다
   - 모든 쓰레드는 독립적인 작업을 수행하기 위해 자신만의 호출스택 필요 : 쓰레드 종료 -> 사용된 호출스택 소멸
   - 호출스택 가장 위 : 현재 실행중인 메서드 | 나머지 : 대기상태
   - 쓰레드가 둘 이상일 경우 : 가장 위에 있는 메서드라도 대기상태 가능성 O
   - main 쓰레드
      = main 메서드의 작업을 수행하는 것 = 쓰레드 = main 쓰레드
   - 실행 중인 사용자 쓰레드가 하나도 없을 때 프로그램은 종료된다
   - 싱글쓰레드 vs 멀티쓰레드
      = 하나의 쓰레드로 작업 : 두 작업 처리 경우 한 작업 마친 후 다른 작업 시작
        두 개의 쓰레드로 작업 : 짧은 시간동안 2개의 쓰래드가 번갈아 가면서 작업 수행 [동시에 두 작업 처리되는것 같이 느껴진다]
   - 두 방식의 작업 수행 시간은 거의 비슷
   - 두 개의 쓰레드로 작업한 시간이 더 걸리게 되는 이유 : Context Switching [프로세스 or 쓰레드 간의 작업 전환]
      = 다음 실행해야할 위치(PC, Program Counter)등의 정보를 저장하고 읽어 오는 시간 소요
   - 쓰레드의 스위칭(시간) < 프로세스의 스위칭(시간)
   - 단순 CPU 만을 사용하는 계산작업 : 싱글쓰레드 > 멀티쓰레드 [I/O 발생으로 인해 CPU가 쉬게 되기 때문에 멀티쓰레드가 일반적 유리]
   - 쓰레드의 우선순위 [Priority]
      = 쓰레드는 우선순위[priority]라는 속성(멤버변수)을 가진다
        이 값에 따라 쓰레드가 얻는 실행시간이 달라진다
   - 쓰레드의 우선순위 지정하기
      = void setPriority(int newPriority) : 쓰레드의 우선순위를 지정한 값으로 변경한다
        int getPriority() : 쓰레드의 우선순위를 반환한다
   - 쓰레드 그룹 [Thread Group]
   - 쓰레드 그룹은 관련된 쓰레드를 그룹으로 다루기 위한 것
   - 쓰레드 그룹에 다른 쓰레드 그룹 포함 시킬 수 있다
   - 보안상의 이유로 도입되었다
   - 자신이 속한 쓰레드 그룹 or 하위 쓰레드 그룹 : 변경 가능 / 다른 쓰레드 그룹의 쓰레드 : 변경 불가
   - [ThreadGroup]을 사용해서 생성
   - 모든 쓰레드는 반드시 쓰레드 그룹에 포함되어 있어야 한다
   - 쓰레드 그룹을 지정하는 생성자를 사용하지 않은 쓰레드
      = 기본적으로 자신을 생성한 쓰레드와 같은 쓰레드 그룹에 속한다
   - 자바 어플리케이션 실행 -> [JVM]은 [main]과 [system]이라는 쓰레드 그룹을 생성 -> [JVM]운영에 필요한 쓰레드들을 생성
      -> 이 쓰레드 그룹에 포함
   - [main]이라는 이름의 쓰레드 ⊂ [main]쓰레드 그룹
   - 가비지컬렉션을 수행하는 [Finalizer]쓰레드 ⊂ [system]쓰레드
   - 일반적으로 생성하는 모든 쓰레드 그룹은 [main]쓰레드 그룹의 하위 쓰레드 그룹 [그룹 지정 X 쓰레드 또한 자동적으로 main쓰레드 그룹]
   - ThreadGroup getThreadGroup() : 쓰레드 자신이 속한 쓰레드 그룹을 반환
   - void uncaughtException(Thread t, Throwable e) : 쓰레드 그릅위 쓰레드가 처리되지 않은 예외에 의해 실행이 종료되었을 때, JVM 에 의해 자동적으로 호출
   - 