@echo off

git add .

:: 현재 시간 가져오기 (YYYY-MM-DD HH:MM:SS 형식)
for /f "tokens=1-5 delims=:-/. " %%a in ("%date% %time%") do set datetime=%%a-%%b-%%c %%d:%%e:%%f

echo Committing changes with message "%datetime%"
git commit -m "%datetime%"

echo Pushing changes to origin main...
git push origin main

echo Operation completed!
pause