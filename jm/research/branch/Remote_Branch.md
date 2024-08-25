•Remote_Branch
-원격 저장소
-호스팅 서비스에서 관리되는 저장소
-로컬 저장소화 동기화되어 있어야 하며, 협업 시에 다른 사람들의 변경 사항을 추적하거나 가져오는데 사용

1. 원격 브랜치 확인
   •원격 브랜치 목록 보기
   git branch -r
   •원격 저장소 URL 확인
   git remote -v
2. 원격 브랜치 가져오기
   •원격 브랜치 가져오기
   git fetch
   •특정 원격 브랜치 가져오기
   git fetch origin branch-name
3. 원격 브랜치 체크아웃
   •원격 브랜치를 로컬 브랜치로 체크아웃
   git checkout -b local-branch-name origin/branch-name
4. 로컬 브랜치와 원격 브랜치 동기화
   •로컬 브랜치에서 원격 브랜치에 푸시
   git push origin loacl-branch-name
   •원격 브랜치의 변경 사항을 로컬 브랜치에 병합
   git pull origin branch-name

5. 원격 브랜치 삭제
   •원격 브랜치 삭제
   git push origin --delete branch-name
