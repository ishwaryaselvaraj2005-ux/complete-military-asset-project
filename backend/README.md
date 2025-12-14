# Military Asset Backend (Demo)
This is a minimal Spring Boot backend demo for the Military Asset Management System.
- Run with: `mvn spring-boot:run`
- H2 console: http://localhost:8080/h2-console (jdbc:h2:mem:militarydb)
- Sample users:
  - admin / admin123 (ADMIN)
  - commander / cmd123 (BASE_COMMANDER)
  - logi / logi123 (LOGISTICS)
Note: This demo uses a simplified token approach for quick prototyping. Replace with JWT in production.
