$ErrorActionPreference = 'Stop'

$scriptDir = Split-Path -Parent $MyInvocation.MyCommand.Path
Set-Location $scriptDir

Write-Host '[stop-dev] Stopping Docker Compose stack...' -ForegroundColor Yellow
docker compose down

Write-Host '[stop-dev] Stack stopped.' -ForegroundColor Green
