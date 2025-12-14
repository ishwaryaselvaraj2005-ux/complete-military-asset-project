# Military Asset Management System - Project Documentation (Human-written)

## Project Overview
Prototype to track purchases, transfers, assignments and logs with RBAC.

## Tech Stack
- Backend: Spring Boot, Spring Data JPA, H2 (demo)
- Frontend: React (Vite)
- DB: H2 for demo; MySQL supported

## How to run (Backend)
1. `cd backend`
2. `mvn spring-boot:run`
- H2 console: http://localhost:8080/h2-console

## How to run (Frontend)
1. `cd frontend`
2. `npm install`
3. `npm run dev`

## API Endpoints (sample)
- POST /auth/login -> {username, password} returns token
- GET /api/bases
- POST /api/purchases
- POST /api/transfers
- POST /api/assignments

## RBAC
Demo roles: ADMIN, BASE_COMMANDER, LOGISTICS. Token format (demo): "ROLE:username".
