---
description: "Use when creating or editing production Java backend files in src/main/java for TailFlash. Enforce strict docs-first and FE-contract-first workflow, layered architecture, and API consistency."
applyTo:
  - "src/main/java/**/*.java"
---
# File-Specific Instructions - Main Java Strict (TailFlash)

## Mục tiêu
- Áp bộ rule nghiêm ngặt cho mã production backend Java.
- Ép Copilot luôn bám docs và FE contract trước khi code.

## Bắt buộc trước khi code
- Đối chiếu tài liệu Phân tích ý tưởng trong docs/ (BE hoặc repo gốc).
- Đối chiếu FE_TailFlash để xác nhận luồng màn hình, endpoint đang gọi, request payload, response shape, state handling.
- Nếu docs và FE mâu thuẫn:
  - Nêu rõ mâu thuẫn.
  - Đánh dấu UNKNOWN.
  - Đề xuất hướng thống nhất.
  - Không tự quyết business rule.

## Quy tắc triển khai production
- Layered architecture: controller -> service -> repository.
- DTO tách biệt entity; không expose entity trực tiếp ra API.
- Mapper: ưu tiên MapStruct nếu dự án đã có; nếu mapper thủ công phải có test cho mapping quan trọng.
- Validation: Jakarta Validation + @Valid tại boundary nhận input.
- API contract:
  - Base path /api/v1.
  - Response theo chuẩn success/data/error.
  - Map exception -> error code nhất quán.
  - HTTP status chuẩn: 400, 401, 403, 404, 409, 422, 500.
- Nếu đổi contract ảnh hưởng FE:
  - Nêu impact rõ ràng.
  - Đề xuất phương án backward compatible.

## Security và dữ liệu
- Dùng Spring Security + JWT nếu docs/FE có login flow; nếu thiếu thông tin thì để placeholder + TODO + câu hỏi xác nhận.
- Không log dữ liệu nhạy cảm: password, token, secret, refresh token, private key.
- Không commit secrets.
