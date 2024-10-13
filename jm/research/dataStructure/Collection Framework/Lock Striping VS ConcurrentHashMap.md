[ConcurrentHashMap]과 [Lock Striping]은 멀티쓰레드 환경에서의
동시성 문제를 해결하기 위해 사용된다

 요소          [ConcurrentHashMap]        |         [Lock Striping]
 정의       [Thread-safe]한 해시 기반 맵        여러 악을 사용하는 동시성 제어 기술
 구조     내부적으로 [Lock Striping]을 사용          락을 직접 관리하고 구현
 목적    멀티쓰레드 환경에서 안전한 데이터 저장        성능 향상을 위한 동시성 제어
복잡성       상대적으로 간단하게 사용 가능               구현 복잡성이 있음

[ConcurrentHashMap]은 [Lock Striping]을 활용하여 멀티쓰레드 환경에서의
데이터 저장 및 조회를 [안전]하게 처리하는 데이터 구조
반면, [Lock Striping]은 특정 자원에 대한 [Lock]을 분산하여 사용하는
동시성 제어 기법이다

[ConcurrentHashMap]은 내부적으로 여러 개의 [Segment]를 사용하여 [Lock]을 분산시킨다
여러 쓰레드가 동시에 서로 다른 [Segment]에 접근 가능하게 한다
[key]와 [value]로 [null]을 허용하지 않는다
멀티쓰레드 환경에서의 데이터 저장 & 조회에 적합

[Lock Striping]은 여러 개의 [Lock]을 사용하는 동시성 제어 기술
하나의 자원에 여러 [Lock]을 분산하여 사용
각 [Lock]이 특정 자원 or 데이터 구조의 일부분에 대해 독립적으로 작동
여러 쓰레드가 서로 다른 자원에 대해 동시에 작업 가능
복잡한 구현과 [Lock]의 수 조절이 필요하다
성능이 중요한 멀티쓰레드 환경에서 사용되며, 데이터 구조 구현 시 동시성을 높일 수 있다

[Segment] : 전체 [Map]을 여러 개의 부분으로 나누어 각 부분에 대해 독립적으로 동기화 하는 방식을 의미