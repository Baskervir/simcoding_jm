•Remote_Tracking_Branch
-원격 저장소의 브랜치를 로컬에서 추적하는 브랜치.
-원격 저장소에서 해당 브랜치의 최신 상태를 로컬에서 반영하기 위해 사용.

•사용 예시

1. 원격 브랜치 가져오기
   -git fetch origin
   (원격 저장소의 모든 브랜치 정보를 로컬에 가져온다)
2. 브랜치 상태 확인하기
   -git branch -r
   (Remote-Tracking-Branch 목록 확인)
3. Remote-Tracking-Branch에서 로컬 브랜치 만들기
   -git checkout -b my-feature-branch origin/feature-xxx
   ('origin/feature-xxx'를 기반으로 새로운 로컬 브랜치 'my-feature-branch'를 생성)