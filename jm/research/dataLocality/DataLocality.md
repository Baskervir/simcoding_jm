=== 데이터 지역성 ===

컴퓨터 과학과 시스템 설계에서 데이터의 접근 방식과 관리 방법을 최적화하여
성능을 향상시키는 중요한 개념.

1. 공간 지역성 (Spatial Locality)
   •정의
      -프로그램이 메모리에서 데이터를 접근할 때, 근처 데이터를 함께 접근할 가능성 ↑
   •예시
      -배열에 순차적 접근, 연속된 메모리 블록에서의 작업
   •최적화 방법
      -데이터가 메모리에서 연속적으로 배치되도록 하거나, 캐시라인에 데이터를 적재하여
       성능 향상 가능.

2. 시간 지역성 (Temporal Locality)
   •정의
      -프로그램이 최근에 접근한 데이터를 다시 접근할 가능성 ↑
   •예시
      -반복전인 연산에거 같은 변수나 데이터에 
      ex) 루프 내에서 같은 변수를 여러 번 읽고 쓰는 경우
   •최적화 방법
      -최근에 접근한 데이터 캐시를 메모리에 유지 -> 다시 접근시 빠르게 접근 가능

※데이터 지역성의 중요성
•캐시 성능
  -데이터 지역성은 CPU 캐시의 성능에 큰 영향을 미친다.
  -데이터 지역성 활용 시 캐시 히트율이 높아져 프로그램의 성능 향상.

•메모리 접근 최적화
  -메모리 접근 패턴을 최적화하면 전체 시스템의 성능이 개선된다.