---
description: "Use when creating or editing Java test files in TailFlash backend. Keep tests focused, readable, and aligned with API contract without enforcing full production implementation workflow."
applyTo:
  - "src/test/java/**/*.java"
---
# File-Specific Instructions - Java Test Scope (TailFlash)

## Mục tiêu
- Giữ instruction cho test nhẹ, tập trung vào chất lượng kiểm thử.
- Tránh áp toàn bộ rule triển khai production lên test.

## Quy tắc cho test Java
- Test phải rõ Arrange - Act - Assert.
- Tên test mô tả đúng hành vi mong đợi.
- Ưu tiên kiểm tra behavior và contract, tránh test quá gắn vào chi tiết implementation.
- Nếu endpoint có chuẩn response success/data/error, test nên xác nhận shape quan trọng.
- Không dùng dữ liệu nhạy cảm thật trong test.

## Rule cấm
- Không viết test phụ thuộc vào thứ tự chạy ngẫu nhiên.
- Không dùng magic value khó hiểu; ưu tiên hằng số hoặc builder/factory test data.
- Không log lộ thông tin nhạy cảm.
