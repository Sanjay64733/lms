@echo off
echo Starting Learning Management System...

:: Change to the directory of this script
cd /d "%~dp0"
echo Current usage directory: %CD%

:: Check if the python executable exists
if not exist ".\venv_crud\Scripts\python.exe" (
    echo Error: Python executable not found at ".\venv_crud\Scripts\python.exe"
    echo Please make sure the 'venv_crud' folder is in the same directory as this script.
    pause
    exit /b
)

:: Run the application
echo Launching Streamlit...
".\venv_crud\Scripts\streamlit.exe" run "app.py"

if %ERRORLEVEL% NEQ 0 (
    echo.
    echo An error occurred! Error code: %ERRORLEVEL%
)

pause
