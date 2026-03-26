---
description: "Use when creating or editing SQL migration files in TailFlash backend. Enforce long-term schema naming conventions and consistent Flyway/Liquibase SQL object names."
applyTo:
  - "src/main/resources/db/migration/**/*.sql"
  - "src/main/resources/db/changelog/**/*.sql"
  - "src/main/resources/migration/**/*.sql"
---

# SQL Migration Naming Conventions - TailFlash

## Mục tiêu

- Đồng bộ naming convention schema lâu dài.
- Giảm xung đột tên object và tăng khả năng bảo trì migration.

## Quy tắc chung

- Dùng snake_case cho toàn bộ object DB.
- Không dùng tiền tố mơ hồ hoặc viết tắt khó hiểu.
- Tên phải phản ánh đúng ngữ nghĩa nghiệp vụ.
- Một kiểu object chỉ dùng một quy ước đặt tên duy nhất toàn repo.

## Quy ước tên bảng và cột

- Bảng: danh từ số nhiều, snake_case.
- Cột: snake_case, rõ nghĩa, không gắn tiền tố thừa.
- Khóa chính mặc định: id.
- Cột thời gian chuẩn (nếu có): created_at, updated_at, deleted_at.
- Cột khóa ngoại ưu tiên mẫu: <entity>\_id.

## Quy ước tên ràng buộc và index

- Primary key: pk\_<table>
- Foreign key: fk\_<from_table>\_\_<to_table>
- Unique: uq*<table>\_\_<col1>[*<colN>]
- Index thường: idx*<table>\_\_<col1>[*<colN>]
- Check constraint: ck\_<table>\_\_<rule>

## Quy ước bảng liên kết

- Bảng many-to-many: <left*entity>*<right_entity> (theo thứ tự chữ cái để ổn định).
- Composite unique cho bảng liên kết phải dùng mẫu uq*<table>\_\_<col1>*<col2>.

## Quy ước tên migration file

- Nếu dùng Flyway SQL: V<yyyyMMddHHmmss>\__<action>_<object>.sql
- action nên nằm trong tập: create, alter, drop, seed, backfill, fix.
- object mô tả đối tượng chính bị thay đổi, dùng snake_case.

## Quy tắc tương thích

- Không đổi tên object đang dùng bởi ứng dụng nếu chưa có kế hoạch backward compatible.
- Nếu bắt buộc đổi tên, phải có migration chuyển tiếp rõ ràng và cập nhật mapping ứng dụng.

## Rule cấm

- Không tạo tên cột/bảng trùng keyword SQL mà không escape hợp lệ.
- Không dùng tên quá ngắn, khó hiểu (a1, tmp, data_new).
- Không trộn nhiều phong cách đặt tên trong cùng một migration.
- Không chỉnh sửa migration đã chạy ở môi trường dùng chung; tạo migration mới để thay đổi.
