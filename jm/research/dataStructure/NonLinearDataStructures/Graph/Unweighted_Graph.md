===비가중치 그래프 (Unweighted GraphInterface.Graph)===

1. 정의
   •각 엣지에 가중치가 없거나 모든 엣지의 가중치가 동일한 그래프

2. 활용
   •탐색 알고리즘
   -BFS(Breadth-First Search), DFS(Depth-First Search)
   •연결성 검사
   -그래프가 연결되어 있는지 확인 or 두 노드가 같은 연결 컴포넌트에 속하는지 검사
   •경로 길이 계산
   -경로의 길이=엣지의 수 : 최단 경로 문제를 쉽게 해결

⭕단순한 구현
•엣지에 가중치가 없기에 구현과 관리가 비교적 간단
⭕효율적인 탐색
•BFS, DFS

❌제한된 표현력
•엣지에 가중치가 없기에 실제 문제의 복잡한 비용 구조 반영 어려움 -> 거리 or 시간의 차이 표현 X
❌제한된 적용 범위
•도로 네트워크의 최단 경로 문제에서 활용 X