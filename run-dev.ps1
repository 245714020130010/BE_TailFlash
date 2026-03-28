param(
    [switch]$NoLogs
)

$ErrorActionPreference = 'Stop'

$scriptDir = Split-Path -Parent $MyInvocation.MyCommand.Path
Set-Location $scriptDir

Write-Host '[run-dev] Starting Docker Compose build and services...' -ForegroundColor Cyan
docker compose up -d --build

Write-Host '[run-dev] Current containers:' -ForegroundColor Cyan
docker ps --format "table {{.Names}}`t{{.Status}}`t{{.Ports}}"

if (-not $NoLogs) {
    Write-Host '[run-dev] Tailing backend logs (Ctrl+C to stop logs)...' -ForegroundColor Cyan
    docker logs -f tailflash-backend
}
