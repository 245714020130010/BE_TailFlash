---
name: build-spring-boot-backend-flashcard-docs-fe-driven
description: "Build Spring Boot backend for a flashcard web app from docs and frontend contract. Use when generating API, database, security, tests, and handoff docs with unknown-gap tracking."
argument-hint: "Workspace path, docs path, FE path, and desired modules"
user-invocable: true
---

# Build Spring Boot Backend for Flashcard App (Docs + FE Driven)

## Muc tieu

- Tu dong xay dung backend Spring Boot cho flashcard web app dua tren tai lieu va FE contract thuc te.
- Dam bao contract-first de khong vo FE.
- Xuat day du API + DB migration + security + test + tai lieu chay local.

## Dau vao bat buoc phai doc

1. docs/\*\*, uu tien file Phan tich y tuong hoac ten tuong duong.
2. Ma nguon FE hoac thu muc FE cung workspace, tim noi goi API qua axios/fetch, route constants, types/interfaces.
3. Cau hinh hien tai: application.yml hoac application.properties, va pom.xml hoac build.gradle.

## Dinh nghia Done

- Co module chinh theo bang chung docs/FE: Auth neu co, Users, Decks, Cards/Flashcards, Study/Learn sessions neu co.
- Co migration tao bang + index + constraints.
- Swagger/OpenAPI chay duoc.
- Co test toi thieu cho service va endpoint chinh.
- Co README hoac docs API huong dan chay local.

## Quy tac bat buoc

- Khong doan bua business rule.
- Neu thieu thong tin: tao Assumption log, danh dau UNKNOWN, va dat cau hoi xac nhan.
- Uu tien FE contract de tranh vo giao tiep FE-BE.
- Moi thay doi contract anh huong FE phai neu impact va huong backward compatible.

## References

- FE endpoint -> DTO checklist: [fe-endpoint-dto-mapping-checklist](./references/fe-endpoint-dto-mapping-checklist.md)
- Exception -> ErrorCode checklist: [exception-errorcode-mapping-checklist](./references/exception-errorcode-mapping-checklist.md)
- Response envelope + HTTP status policy: [response-envelope-http-status-policy](./references/response-envelope-http-status-policy.md)
- API endpoint catalog template: [api-endpoint-catalog-template](./references/api-endpoint-catalog-template.md)

## Quy trinh thuc thi

### Step 0 - Repo scan va gap list

1. Quet cau truc backend hien tai, dependencies, profile, migration tool.
2. Doc docs de trich use case, entity, role, rule nghiep vu.
3. Quet FE de lap danh sach endpoint dang goi, payload, response mong doi theo checklist [fe-endpoint-dto-mapping-checklist](./references/fe-endpoint-dto-mapping-checklist.md).
4. Output bat buoc:
   - Bang Yeu cau tu docs
   - Bang FE contract hien tai
   - Danh sach Thieu va UNKNOWN
   - Danh sach cau hoi can xac nhan

### Step 1 - Domain model va DB design

1. De xuat entity, quan he, khoa, rang buoc.
2. Chon mot migration tool duy nhat Flyway hoac Liquibase theo hien trang repo.
3. Tao migration dau tien va migration bo sung neu can.
4. Output bat buoc:
   - ERD dang text
   - Danh sach bang cot constraints index
   - Danh sach file migration

### Step 2 - API design contract-first

1. Nhom endpoint theo auth, users, decks, cards, study, progress dua tren bang chung.
2. Dinh nghia request/response DTO theo checklist [fe-endpoint-dto-mapping-checklist](./references/fe-endpoint-dto-mapping-checklist.md) va policy [response-envelope-http-status-policy](./references/response-envelope-http-status-policy.md).
3. Chot ma loi va map exception nhat quan theo checklist [exception-errorcode-mapping-checklist](./references/exception-errorcode-mapping-checklist.md).
4. Output bat buoc:
   - Bang endpoint + endpoint cards + JSON examples theo template [api-endpoint-catalog-template](./references/api-endpoint-catalog-template.md)
   - Bang response envelope + HTTP status policy theo [response-envelope-http-status-policy](./references/response-envelope-http-status-policy.md)
   - Bang mapping exception sang error code theo mau trong checklist [exception-errorcode-mapping-checklist](./references/exception-errorcode-mapping-checklist.md)

### Step 3 - Implement theo vertical slices

Thu tu uu tien: Deck CRUD -> Card CRUD -> Import Export neu co -> Study session -> Progress Stats neu co.

Moi slice phai hoan tat tron goi:

1. Migration neu can
2. Entity
3. Repository
4. Service
5. Controller
6. Validation
7. Exception handling
8. Unit test + integration test co ban

### Step 4 - Security va roles

1. Neu co login flow trong docs/FE: implement JWT, password hashing, refresh token neu can, va auth endpoints.
2. Neu chua ro: tao khung security toi thieu, danh dau UNKNOWN, liet ke diem can xac nhan.

### Step 5 - Observability va hardening

1. Cau hinh CORS theo domain FE.
2. Chuan hoa pagination, sorting, filtering.
3. Them rate limit, idempotency, optimistic locking neu duoc yeu cau boi docs/FE.
4. Tap trung vao centralized error handling.

### Step 6 - Documentation va handoff

1. Hoan thien Swagger/OpenAPI voi mo ta endpoint.
2. Cap nhat README: cach chay local, env, migration, sample curl.
3. Ghi ro toan bo assumptions va unknown da dong/mo.

## Kiem tra chat luong truoc khi ket thuc

- Build thanh cong.
- Test chinh pass.
- OpenAPI truy cap duoc.
- Khong log du lieu nhay cam.
- Khong commit secrets.

## Mau output tong ket

1. Tom tat da implement theo module.
2. Danh sach file migration va thay doi schema.
3. Danh sach endpoint moi va contract.
4. Danh sach assumptions va unknown con lai.
5. Huong dan chay local va kiem thu nhanh.
