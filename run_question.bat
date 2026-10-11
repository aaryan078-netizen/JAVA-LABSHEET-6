@echo off
if "%~1"=="" (echo Usage: run_question.bat Q01_Animal_Cat_Method_Overriding.java& exit /b 1)
set FILE=%~1
for %%F in ("%FILE%") do set CLASS=%%~nF
javac "%FILE%" && java %CLASS%
