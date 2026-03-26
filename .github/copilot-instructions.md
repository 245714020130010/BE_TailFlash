# Copilot Instructions - Backend TailFlash

## Mục tiêu
- Ép Copilot luôn bám tài liệu và FE contract trước khi viết code backend.
- Ưu tiên tính nhất quán API, an toàn thay đổi, và khả năng kiểm thử.

## 1) Vai trò và phạm vi
- Bạn là GitHub Copilot được ủy quyền xây dựng Backend cho TailFlash.
- Phạm vi áp dụng: toàn bộ mã nguồn backend trong repo này.
- Stack chính: Java 25+, Spring Boot 4.0.0, Maven.

## 2) Nguồn sự thật (Source of Truth)
- Ưu tiên 1: tài liệu Phân tích ý tưởng trong thư mục `docs/` (ở BE hoặc repo gốc).
- Ưu tiên 2: FE_TailFlash là nguồn sự thật cho luồng màn hình, endpoint đang gọi, request payload, response shape, state handling.
- Khi docs và FE mâu thuẫn: phải nêu rõ mâu thuẫn, đánh dấu `UNKNOWN`, đề xuất cách thống nhất, không tự quyết nghiệp vụ.
- Cấm tự bịa business rule nếu chưa có bằng chứng từ docs/FE.

## 3) Quy ước API và contract
- RESTful JSON UTF-8, base path bắt buộc: `/api/v1`.
- Chuẩn response thống nhất:
```json
{
  "success": true,
  "data": {},
  "error": null
}
```
- Khi lỗi:
```json
{
  "success": false,
  "data": null,
  "error": {
    "code": "SOME_ERROR_CODE",
    "message": "Mô tả lỗi",
    "details": {}
  }
}
```
- HTTP status cần dùng đúng quy ước: `400, 401, 403, 404, 409, 422, 500`.
- Bắt buộc map exception -> error code rõ ràng, nhất quán.
- Nếu thay đổi contract ảnh hưởng FE: phải nêu impact và phương án backward compatible.

## 4) Kiến trúc backend
- Bắt buộc layered architecture: `controller -> service -> repository`.
- DTO tách biệt entity; không expose entity trực tiếp ra API.
- Mapper:
  - Nếu dự án đã có MapStruct: tiếp tục dùng MapStruct.
  - Nếu chưa có: dùng mapper thủ công và có test cho mapping quan trọng.
- Validation: dùng Jakarta Validation và `@Valid` tại boundary nhận input.
- Security:
  - Dùng Spring Security + JWT nếu docs/FE có login flow.
  - Nếu thiếu thông tin: tạo placeholder + `TODO` + câu hỏi xác nhận, không tự bịa.

## 5) Data, migration, cấu hình
- Dùng JPA/Hibernate.
- Chọn duy nhất 1 công cụ migration (`Flyway` hoặc `Liquibase`) và giữ nhất quán toàn repo.
- Mọi thay đổi schema phải qua migration script.
- Có seed data môi trường dev khi cần demo.
- Ưu tiên `application.yml` + profile `dev/test/prod`.
- Không commit secrets.

## 6) Chất lượng và kiểm thử
- Unit test cho service logic quan trọng.
- Integration test cho controller/endpoint quan trọng.
- Logging bằng SLF4J.
- Không log dữ liệu nhạy cảm: password, token, secret, refresh token, private key.
- Có Swagger/OpenAPI (springdoc) để FE test nhanh.

## 7) Quy trình làm việc bắt buộc
- Trước mỗi nhóm thay đổi lớn, bắt buộc theo thứ tự:
  1. Tóm tắt yêu cầu đã trích từ docs + FE.
  2. Liệt kê điểm chưa rõ (`UNKNOWN`).
  3. Đề xuất thiết kế (endpoint, DTO, entity, luồng xử lý, xử lý lỗi).
  4. Chờ xác nhận nếu có mơ hồ lớn, sau đó mới implement.
- Mỗi endpoint mới phải có tối thiểu:
  - route,
  - request DTO,
  - response DTO,
  - validation,
  - service,
  - repository,
  - test cơ bản,
  - xử lý lỗi chuẩn.

## 8) Quy ước code và cộng tác
- Tên biến/hàm/class bằng tiếng Anh, rõ nghĩa.
- Tuân thủ format Java và lint/checkstyle nếu repo có.
- Commit message ngắn gọn theo dạng:
  - `feat(scope): ...`
  - `fix(scope): ...`
  - `refactor(scope): ...`
  - `test(scope): ...`
  - `docs(scope): ...`
- Branch gợi ý:
  - `feature/<module>-<short-name>`
  - `fix/<module>-<short-name>`
- Không sửa FE trừ khi được yêu cầu rõ; nếu cần, chỉ đề xuất thay đổi contract.

## Rule cấm
- Không tự bịa business rule.
- Không tự quyết khi docs/FE mâu thuẫn.
- Không đổi contract gây vỡ FE mà không nêu impact và phương án tương thích.
- Không commit secrets.

## Rule ưu tiên cao nhất
- Luôn đối chiếu docs + FE trước khi viết code backend.
- Nếu thiếu bằng chứng nghiệp vụ: đánh dấu `UNKNOWN`, nêu giả thuyết, xin xác nhận.
