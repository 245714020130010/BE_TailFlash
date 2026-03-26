# **MENU**

[**Chương 1: TỔNG QUAN HỆ THỐNG	**2****](#_toc225239605)

[**Chương 2: PHÂN LOẠI ACTORS & PHÂN QUYỀN	**2****](#_toc225239606)

[**1.**	**Ma trận phân quyền	**2****](#_toc225239607)

[**2.**	**Luồng đăng ký Giáo viên	**3****](#_toc225239608)

[**Chương 3: MODULES HỆ THỐNG CHI TIẾT	**3****](#_toc225239609)

[**1.**	**🔐 MODULE AUTHENTICATION & AUTHORIZATION	**3****](#_toc225239610)

[**2.**	**🃏 MODULE FLASHCARD MANAGEMENT	**4****](#_toc225239611)

[**3.**	**🧠 MODULE SPACED REPETITION SYSTEM (SRS) - GHI NHỚ	**5****](#_toc225239612)

[**4.**	**⏰ MODULE NOTIFICATION & REMINDER	**7****](#_toc225239613)

[**5.**	**🎮 MODULE MINI GAMES	**8****](#_toc225239614)

[**6.**	**📝 MODULE MINI TEST	**10****](#_toc225239615)

[**7.**	**🌐 MODULE ĐA NGÔN NGỮ (i18n / L10n)	**11****](#_toc225239616)

[**8.**	**👨‍🏫 MODULE GIÁO VIÊN (TEACHER)	**12****](#_toc225239617)

[**9.**	**🛡️ MODULE ADMIN	**13****](#_toc225239618)

[**10.**	**📊 MODULE THỐNG KÊ & GAMIFICATION (NGƯỜI HỌC)	**15****](#_toc225239619)

[**11.**	**👤 MODULE PROFILE & SETTINGS	**16****](#_toc225239620)

[**Chương 4: DATABASE DESIGN (Thiết kế CSDL)	**17****](#_toc225239621)

[**1.**	**Entity Relationship Diagram (ERD)	**17****](#_toc225239622)

[**Chương 5: KIẾN TRÚC HỆ THỐNG (System Architecture)	**22****](#_toc225239623)

[**Chương 6: TECH STACK ĐỀ XUẤT	**24****](#_toc225239624)

[**Chương 7: API ENDPOINTS DESIGN	**26****](#_toc225239625)

[**1.**	**Authentication APIs	**26****](#_toc225239626)

[**2.**	**User & Profile APIs	**27****](#_toc225239627)

[**3.**	**Flashcard & Deck APIs	**27****](#_toc225239628)

[**4.**	**SRS & Learning APIs	**28****](#_toc225239629)

[**5.**	**Game & Test APIs	**28****](#_toc225239630)

[**6.**	**Notification & Reminder APIs	**29****](#_toc225239631)

[**7.**	**Teacher APIs	**30****](#_toc225239632)

[**8.**	**Admin APIs	**30****](#_toc225239633)

[**9.**	**Public & i18n APIs	**32****](#_toc225239634)

[**Chương 8: LUỒNG XỬ LÝ CHÍNH (Main Flows)	**33****](#_toc225239635)

[**1.**	**Luồng học Flashcard với SRS	**33****](#_toc225239636)

[**2.**	**Luồng nhắc nhở theo chu kỳ	**36****](#_toc225239637)

[**3.**	**Luồng chơi Mini Game (Matching Pairs)	**38****](#_toc225239638)

[**4.**	**Luồng Giáo viên gửi yêu cầu & Admin duyệt	**41****](#_toc225239639)

[**5.**	**Luồng làm Mini Test	**43****](#_toc225239640)

[**Chương 9: WIREFRAME CÁC MÀN HÌNH CHÍNH	**45****](#_toc225239641)

[**1.**	**Trang chủ (Dashboard) - Người học	**45****](#_toc225239642)

[**2.**	**Màn hình học Flashcard	**47****](#_toc225239643)

[**3.**	**Màn hình Mini Game Hub	**48****](#_toc225239644)

[**4.**	**Màn hình Admin Dashboard	**50****](#_toc225239645)

[**5.**	**Màn hình Giáo viên - Quản lý lớp	**51****](#_toc225239646)

[**6.**	**Màn hình Cài đặt nhắc nhở	**53****](#_toc225239647)

[**7.**	**Màn hình Thống kê cá nhân	**55****](#_toc225239648)

[**Chương 10: KẾ HOẠCH PHÁT TRIỂN (Development Roadmap)	**57****](#_toc225239649)

[**Chương 11: FOLDER STRUCTURE (Cấu trúc thư mục)	**63****](#_toc225239650)

[**1.**	**Frontend (Next.js)	**63****](#_toc225239651)

[**2.**	**Backend (NestJS)	**69****](#_toc225239652)

[**Chương 12: DOCKER & DEPLOYMENT	**75****](#_toc225239653)

[**Chương 13: CI/CD PIPELINE	**77****](#_toc225239654)

[**Chương 14: SECURITY CHECKLIST	**79****](#_toc225239655)

[**Chương 15: PERFORMANCE OPTIMIZATION STRATEGY	**82****](#_toc225239656)

[**Chương 16: TỔNG KẾT HỆ THỐNG	**85****](#_toc225239657)

[**Chương 17: MONITORING & LOGGING STRATEGY	**88****](#_toc225239658)

[**Chương 18: ERROR HANDLING STRATEGY	**91****](#_toc225239659)

[**Chương 19: TESTING STRATEGY	**94****](#_toc225239660)

[**Chương 20: ENV CONFIGURATION	**99****](#_toc225239661)

[**Chương 21: FINAL CHECKLIST TRƯỚC KHI TRIỂN KHAI	**101****](#_toc225239662)

[**Chương 22: TÀI LIỆU HỆ THỐNG - DANH SÁCH HOÀN CHỈNH	**105****](#_toc225239663)

[**Chương 23: 🎯 KẾT LUẬN	**106****](#_toc225239664)

[**Chương 1: TECH STACK MỚI (Java Spring Boot + Next.js)	**109****](#_toc225239665)

[**Chương 2: SO SÁNH NestJS vs Spring Boot	**110****](#_toc225239666)

[**Chương 3: CHI TIẾT TECH STACK ĐẦY ĐỦ	**111****](#_toc225239667)

[**Chương 4: BACKEND FOLDER STRUCTURE (Spring Boot)	**113****](#_toc225239668)

[**Chương 5: SAMPLE CODE - CÁC FILE QUAN TRỌNG	**122****](#_toc225239669)

[**1.**	**Entity Examples (JPA)	**122****](#_toc225239670)

[**2.**	**SRS Algorithm Service	**127****](#_toc225239671)

[**3.**	**Auth Controller & Service	**130****](#_toc225239672)

[**4.**	**DTOs	**140****](#_toc225239673)

[**5.**	**Security Config	**143****](#_toc225239674)

[**6.**	**JWT Token Provider	**145****](#_toc225239675)

[**7.**	**JWT Authentication Filter	**148****](#_toc225239676)


**\


**📋 PHÂN TÍCH HỆ THỐNG WEB APP HỌC TIẾNG ANH BẰNG FLASHCARDS**

-----
1. # <a name="_toc225239605"></a>**TỔNG QUAN HỆ THỐNG**
   ┌─────────────────────────────────────────────────────────────────┐

   │                    FLASHCARD LEARNING SYSTEM                     │

   ├─────────────────────────────────────────────────────────────────┤

   │                                                                  │

   │   ┌──────────┐    ┌──────────────┐    ┌───────────────────┐    │

   │   │ Người học │    │  Giáo viên   │    │      Admin        │    │

   │   │ (Learner) │    │  (Teacher)   │    │  (Administrator)  │    │

   │   └─────┬────┘    └──────┬───────┘    └────────┬──────────┘    │

   │         │               │                      │                │

   │         ▼               ▼                      ▼                │

   │   ┌─────────────────────────────────────────────────┐          │

   │   │              API GATEWAY / BACKEND              │          │

   │   ├─────────────────────────────────────────────────┤          │

   │   │  Auth │ Flashcard │ SRS │ Game │ Notification   │          │

   │   └───────────────────┬─────────────────────────────┘          │

   │                       │                                         │

   │         ┌─────────────┼─────────────┐                          │

   │         ▼             ▼             ▼                           │

   │   ┌──────────┐ ┌───────────┐ ┌──────────┐                     │

   │   │ Database │ │   Cache   │ │  Storage │                     │

   │   │ (MySQL/  │ │  (Redis)  │ │  (S3/    │                     │

   │   │ Postgres)│ │           │ │  Cloud)  │                     │

   │   └──────────┘ └───────────┘ └──────────┘                     │

   │                                                                  │

   │   🌐 Đa ngôn ngữ: VI | EN | JP | KR | ...                     │

   └─────────────────────────────────────────────────────────────────┘

   -----
1. # <a name="_toc225239606"></a>**PHÂN LOẠI ACTORS & PHÂN QUYỀN**
1. ## ` `**<a name="_toc225239607"></a>Ma trận phân quyền**
┌─────────────────────────────────┬──────────┬───────────┬─────────┐

│          CHỨC NĂNG              │ LEARNER  │  TEACHER  │  ADMIN  │

├─────────────────────────────────┼──────────┼───────────┼─────────┤

│ Đăng ký / Đăng nhập            │    ✅    │    ✅     │   ✅    │

│ Quản lý profile cá nhân        │    ✅    │    ✅     │   ✅    │

│ Học Flashcard                   │    ✅    │    ✅     │   ❌    │

│ Tạo Flashcard cá nhân          │    ✅    │    ✅     │   ❌    │

│ Tạo bộ Flashcard công khai     │    ❌    │    ✅     │   ✅    │

│ Chơi Mini Game                  │    ✅    │    ✅     │   ❌    │

│ Làm Mini Test                   │    ✅    │    ✅     │   ❌    │

│ Cài đặt nhắc nhở               │    ✅    │    ✅     │   ❌    │

│ Xem thống kê học tập cá nhân   │    ✅    │    ✅     │   ❌    │

│ Gửi yêu cầu duyệt GV          │    ❌    │    ✅     │   ❌    │

│ Tạo lớp học / nhóm             │    ❌    │    ✅     │   ✅    │

│ Giao bài cho học sinh           │    ❌    │    ✅     │   ❌    │

│ Xem thống kê học sinh          │    ❌    │    ✅     │   ✅    │

│ Duyệt yêu cầu giáo viên       │    ❌    │    ❌     │   ✅    │

│ Quản lý người dùng             │    ❌    │    ❌     │   ✅    │

│ Quản lý nội dung hệ thống      │    ❌    │    ❌     │   ✅    │

│ Quản lý ngôn ngữ / i18n        │    ❌    │    ❌     │   ✅    │

│ Cấu hình hệ thống              │    ❌    │    ❌     │   ✅    │

│ Xem báo cáo tổng quan          │    ❌    │    ❌     │   ✅    │

│ Quản lý danh mục / tags        │    ❌    │    ❌     │   ✅    │

└─────────────────────────────────┴──────────┴───────────┴─────────┘
1. ## <a name="_toc225239608"></a>**Luồng đăng ký Giáo viên**
┌──────────┐     ┌──────────────┐     ┌───────────┐     ┌──────────────┐

│  User    │     │  Đăng ký     │     │  Admin    │     │  Kích hoạt   │

│  mới     │────▶│  tài khoản   │────▶│  duyệt   │────▶│  quyền GV    │

│          │     │  GV + upload │     │  hồ sơ   │     │              │

└──────────┘     │  chứng chỉ   │     └─────┬─────┘     └──────────────┘

`                 `└──────────────┘           │

`                                      `┌─────▼─────┐

`                                      `│ Từ chối + │

`                                      `│ lý do     │

`                                      `└───────────┘

-----
1. # ` `**<a name="_toc225239609"></a>MODULES HỆ THỐNG CHI TIẾT**
1. ## <a name="_toc225239610"></a>**🔐 MODULE AUTHENTICATION & AUTHORIZATION**
┌─────────────────────────────────────────────────┐

│           AUTH MODULE                            │

├─────────────────────────────────────────────────┤

│                                                  │

│  📌 Đăng ký tài khoản                          │

│     ├── Email + Password                        │

│     ├── Google OAuth                            │

│     ├── Facebook OAuth                          │

│     └── Xác thực email (verification)           │

│                                                  │

│  📌 Đăng nhập                                   │

│     ├── JWT Token (Access + Refresh)            │

│     ├── Remember me                             │

│     └── Multi-device session                    │

│                                                  │

│  📌 Quên mật khẩu                              │

│     ├── Gửi OTP qua email                      │

│     └── Reset password                          │

│                                                  │

│  📌 Phân quyền (RBAC)                          │

│     ├── Role: Learner, Teacher, Admin           │

│     ├── Permission-based access control         │

│     └── Middleware kiểm tra quyền               │

│                                                  │

│  📌 Đăng ký Giáo viên                          │

│     ├── Upload hồ sơ / chứng chỉ               │

│     ├── Trạng thái: Pending → Approved/Rejected│

│     └── Email thông báo kết quả duyệt          │

│                                                  │

└─────────────────────────────────────────────────┘
1. ## <a name="_toc225239611"></a>**🃏 MODULE FLASHCARD MANAGEMENT**
┌─────────────────────────────────────────────────────────┐

│              FLASHCARD MODULE                            │

├─────────────────────────────────────────────────────────┤

│                                                          │

│  📌 Cấu trúc Flashcard                                 │

│     ┌─────────────────────────────────────┐             │

│     │         FRONT (Mặt trước)           │             │

│     │  ┌───────────────────────────────┐  │             │

│     │  │  Từ vựng: "Accomplish"        │  │             │

│     │  │  Phiên âm: /əˈkɑːm.plɪʃ/    │  │             │

│     │  │  🔊 Audio phát âm             │  │             │

│     │  │  🖼️ Hình ảnh minh họa         │  │             │

│     │  └───────────────────────────────┘  │             │

│     ├─────────────────────────────────────┤             │

│     │         BACK (Mặt sau)              │             │

│     │  ┌───────────────────────────────┐  │             │

│     │  │  Nghĩa: "Hoàn thành"         │  │             │

│     │  │  Loại từ: Verb               │  │             │

│     │  │  Ví dụ: "She accomplished..." │  │             │

│     │  │  Synonym: achieve, complete    │  │             │

│     │  │  Ghi chú cá nhân              │  │             │

│     │  └───────────────────────────────┘  │             │

│     └─────────────────────────────────────┘             │

│                                                          │

│  📌 Bộ Flashcard (Deck)                                │

│     ├── Tên bộ, mô tả, ảnh bìa                        │

│     ├── Danh mục (TOEIC, IELTS, Business, Daily...)    │

│     ├── Tags (level, topic...)                          │

│     ├── Chế độ: Public / Private / Class-only          │

│     ├── Số lượng cards, rating, lượt học               │

│     └── Sắp xếp thứ tự cards                          │

│                                                          │

│  📌 Quản lý Flashcard                                  │

│     ├── CRUD Flashcard & Deck                          │

│     ├── Import từ CSV / Excel                          │

│     ├── Clone / Fork deck từ người khác                │

│     ├── Chia sẻ deck (link / QR code)                  │

│     ├── Tìm kiếm & lọc cards                          │

│     ├── Bookmark / Yêu thích deck                      │

│     └── Báo cáo deck vi phạm                           │

│                                                          │

│  📌 Thư viện công cộng                                 │

│     ├── Deck do GV tạo (đã duyệt)                     │

│     ├── Deck phổ biến / trending                       │

│     ├── Tìm kiếm theo category, level, topic          │

│     └── Đánh giá & review deck                         │

│                                                          │

└─────────────────────────────────────────────────────────┘
1. ## <a name="_toc225239612"></a>**🧠 MODULE SPACED REPETITION SYSTEM (SRS) - GHI NHỚ**
┌──────────────────────────────────────────────────────────────┐

│            SPACED REPETITION MODULE                           │

├──────────────────────────────────────────────────────────────┤

│                                                               │

│  📌 Thuật toán SM-2 (SuperMemo) / Leitner System            │

│                                                               │

│  ┌─────────────────────────────────────────────────────┐     │

│  │              ĐƯỜNG CONG QUÊN LÃNG                    │     │

│  │                                                      │     │

│  │  100%│ ●                                             │     │

│  │      │  ╲        Ôn tập lần 1                       │     │

│  │      │   ╲          ●                                │     │

│  │  Nhớ │    ╲        ╱ ╲     Ôn tập lần 2            │     │

│  │      │     ╲      ╱   ╲      ●                      │     │

│  │      │      ╲    ╱     ╲    ╱╲    Ôn tập lần 3     │     │

│  │      │       ╲  ╱       ╲  ╱  ╲     ●              │     │

│  │   0% │────────╲╱─────────╲╱────╲───╱──────▶        │     │

│  │      0    1d    3d    7d   14d  30d  60d  Thời gian │     │

│  └─────────────────────────────────────────────────────┘     │

│                                                               │

│  📌 Cơ chế hoạt động                                        │

│     ├── Mỗi card có các thuộc tính:                          │

│     │   ├── ease\_factor (hệ số dễ)                           │

│     │   ├── interval (khoảng cách ôn tập)                    │

│     │   ├── repetitions (số lần ôn)                          │

│     │   ├── next\_review\_date (ngày ôn tiếp)                  │

│     │   └── status: New/Learning/Review/Graduated            │

│     │                                                         │

│     ├── Sau mỗi lần ôn, user đánh giá:                      │

│     │   ├── 😫 Again (Quên hoàn toàn) → Reset               │

│     │   ├── 😐 Hard (Khó nhớ) → Interval ngắn               │

│     │   ├── 🙂 Good (Nhớ được) → Interval bình thường       │

│     │   └── 😄 Easy (Dễ dàng) → Interval dài                │

│     │                                                         │

│     └── Tự động tính toán lịch ôn tập tối ưu                │

│                                                               │

│  📌 Hộp Leitner (Visualization)                             │

│     ┌───────┐ ┌───────┐ ┌───────┐ ┌───────┐ ┌───────┐     │

│     │ Box 1 │ │ Box 2 │ │ Box 3 │ │ Box 4 │ │ Box 5 │     │

│     │ Mới   │ │ 1 ngày│ │ 3 ngày│ │ 7 ngày│ │ 30ngày│     │

│     │ ████  │ │ ███   │ │ ██    │ │ █     │ │ ██████│     │

│     │ 25    │ │ 18    │ │ 12    │ │  8    │ │  42   │     │

│     └───┬───┘ └───┬───┘ └───┬───┘ └───┬───┘ └───────┘     │

│         │  Đúng→  │ Đúng→  │ Đúng→  │ Đúng→  Graduated    │

│         │  ←Sai   │  ←Sai  │  ←Sai  │  ←Sai               │

│         └─────────┴────────┴────────┘                        │

│                                                               │

│  📌 Chế độ học                                               │

│     ├── New Cards (Học từ mới)                               │

│     ├── Review Cards (Ôn tập)                                │

│     ├── Mixed Mode (Trộn lẫn)                               │

│     ├── Cram Mode (Học dồn - không ảnh hưởng SRS)           │

│     └── Custom Study (Tùy chỉnh)                            │

│                                                               │

│  📌 Cài đặt SRS cá nhân                                     │

│     ├── Số cards mới/ngày (mặc định: 20)                    │

│     ├── Số cards ôn tập tối đa/ngày                         │

│     ├── Thứ tự học (random / sequential)                     │

│     ├── Learning steps (1m, 10m, 1d, 3d...)                 │

│     └── Graduating interval                                   │

│                                                               │

└──────────────────────────────────────────────────────────────┘
1. ## <a name="_toc225239613"></a>**⏰ MODULE NOTIFICATION & REMINDER**
┌──────────────────────────────────────────────────────────────┐

│            NOTIFICATION & REMINDER MODULE                      │

├──────────────────────────────────────────────────────────────┤

│                                                               │

│  📌 Nhắc nhở theo chu kỳ (Spaced Reminder)                  │

│     ├── Cài đặt thời gian nhắc hàng ngày                    │

│     │   (VD: 8:00 sáng, 12:00 trưa, 20:00 tối)            │

│     ├── Tần suất: Hàng ngày / Tùy chọn ngày trong tuần     │

│     ├── Nhắc khi có cards đến hạn ôn tập                    │

│     ├── Nhắc khi streak sắp bị mất                          │

│     └── Cho phép BẬT/TẮT từng loại nhắc nhở                │

│                                                               │

│  📌 Kênh thông báo                                          │

│     ├── In-app Notification (real-time)                      │

│     ├── Email Notification                                    │

│     ├── Push Notification (Browser/PWA)                      │

│     └── Telegram Bot (tùy chọn)                              │

│                                                               │

│  📌 Loại thông báo                                           │

│     ├── 🔔 Nhắc ôn tập: "Bạn có 25 cards cần ôn hôm nay!" │

│     ├── 🔥 Streak: "Đừng để mất streak 15 ngày!"           │

│     ├── 🏆 Thành tích: "Chúc mừng! Bạn đã học 500 từ!"    │

│     ├── 📝 Bài tập mới: "GV đã giao bài tập mới!"         │

│     ├── 👥 Xã hội: "Bạn A đã chia sẻ deck mới"            │

│     ├── 📢 Hệ thống: "Cập nhật tính năng mới"              │

│     └── ✅ Duyệt GV: "Yêu cầu GV đã được phê duyệt"      │

│                                                               │

│  📌 Lịch nhắc thông minh                                    │

│     ├── Dựa trên thói quen học của user                     │

│     ├── Tự động điều chỉnh thời gian nhắc                   │

│     └── Timezone-aware                                        │

│                                                               │

│  📌 Cron Job / Scheduler                                     │

│     ┌──────────┐    ┌───────────┐    ┌──────────────┐       │

│     │ Scheduler│───▶│ Check     │───▶│ Send         │       │

│     │ (mỗi    │    │ cards     │    │ Notification │       │

│     │ 15 phút)│    │ due today │    │ to users     │       │

│     └──────────┘    └───────────┘    └──────────────┘       │

│                                                               │

└──────────────────────────────────────────────────────────────┘
1. ## <a name="_toc225239614"></a>**🎮 MODULE MINI GAMES**
┌──────────────────────────────────────────────────────────────────┐

│                    MINI GAMES MODULE                              │

├──────────────────────────────────────────────────────────────────┤

│                                                                   │

│  🎮 GAME 1: MATCHING PAIRS (NỐI CẶP)                           │

│  ┌─────────────────────────────────────────────┐                 │

│  │  ┌─────────┐  ┌─────────┐                   │                 │

│  │  │Accomplish│  │Hoàn thành│  ← Nối từ với   │                 │

│  │  ├─────────┤  ├─────────┤     nghĩa         │                 │

│  │  │ Achieve │  │ Đạt được│                   │                 │

│  │  ├─────────┤  ├─────────┤                   │                 │

│  │  │Complete │  │Hoàn tất │                   │                 │

│  │  └─────────┘  └─────────┘                   │                 │

│  │  ⏱️ Thời gian | 🏆 Điểm | 💫 Combo         │                 │

│  └─────────────────────────────────────────────┘                 │

│                                                                   │

│  🎮 GAME 2: MULTIPLE CHOICE (TRẮC NGHIỆM)                      │

│  ┌─────────────────────────────────────────────┐                 │

│  │  "Accomplish" nghĩa là gì?                  │                 │

│  │  🔊 [Phát âm]                               │                 │

│  │                                              │                 │

│  │  ┌─── A. Bắt đầu        ┌─── B. Hoàn thành │                 │

│  │  ├─── C. Phá hủy        ├─── D. Từ bỏ      │                 │

│  │                                              │                 │

│  │  ⏱️ 15s countdown                           │                 │

│  └─────────────────────────────────────────────┘                 │

│                                                                   │

│  🎮 GAME 3: WORD SCRAMBLE (XẾP CHỮ)                             │

│  ┌─────────────────────────────────────────────┐                 │

│  │  Nghĩa: "Hoàn thành"                       │                 │

│  │  Gợi ý: A \_ \_ \_ M \_ \_ \_ S H                │                 │

│  │                                              │                 │

│  │  [C][O][M][A][P][L][I][S][H][C]            │                 │

│  │   ↑ Kéo thả sắp xếp đúng thứ tự           │                 │

│  └─────────────────────────────────────────────┘                 │

│                                                                   │

│  🎮 GAME 4: FLASHCARD SPRINT (TỐC ĐỘ)                          │

│  ┌─────────────────────────────────────────────┐                 │

│  │         ┌───────────────────┐                │                 │

│  │         │   "Accomplish"    │                │                 │

│  │         │   = Hoàn thành?   │                │                 │

│  │         └───────────────────┘                │                 │

│  │                                              │                 │

│  │    ❌ SAI          ✅ ĐÚNG                   │                 │

│  │    ← Swipe Left    Swipe Right →             │                 │

│  │                                              │                 │

│  │  ⏱️ 60s | 🏆 15/20 đúng                     │                 │

│  └─────────────────────────────────────────────┘                 │

│                                                                   │

│  🎮 GAME 5: LISTENING CHALLENGE (NGHE & CHỌN)                   │

│  ┌─────────────────────────────────────────────┐                 │

│  │         🔊 [Phát âm từ]                     │                 │

│  │                                              │                 │

│  │  ┌─────────┐ ┌─────────┐ ┌─────────┐       │                 │

│  │  │ achieve │ │accomplish│ │ abolish │       │                 │

│  │  └─────────┘ └─────────┘ └─────────┘       │                 │

│  │                                              │                 │

│  │  Chọn từ đúng với phát âm vừa nghe         │                 │

│  └─────────────────────────────────────────────┘                 │

│                                                                   │

│  🎮 GAME 6: TYPING PRACTICE (GÕ TỪ)                            │

│  ┌─────────────────────────────────────────────┐                 │

│  │  Nghĩa: "Hoàn thành"                       │                 │

│  │  🔊 [Phát âm gợi ý]                        │                 │

│  │                                              │                 │

│  │  Gõ từ: [a|c|c|o|m|p|l|\_|\_|\_]              │                 │

│  │                                              │                 │

│  │  💡 Hint: Hiện 3 chữ đầu (mất 50% điểm)   │                 │

│  └─────────────────────────────────────────────┘                 │

│                                                                   │

│  🎮 GAME 7: MEMORY FLIP (LẬT THẺ NHỚ)                          │

│  ┌─────────────────────────────────────────────┐                 │

│  │  ┌───┐ ┌───┐ ┌───┐ ┌───┐                   │                 │

│  │  │ ? │ │ ? │ │ ? │ │ ? │                   │                 │

│  │  ├───┤ ├───┤ ├───┤ ├───┤                   │                 │

│  │  │ ? │ │ ? │ │ ? │ │ ? │                   │                 │

│  │  └───┘ └───┘ └───┘ └───┘                   │                 │

│  │  Lật 2 thẻ: Từ + Nghĩa khớp nhau = ✅     │                 │

│  │  ⏱️ Thời gian | 🔄 Số lượt lật            │                 │

│  └─────────────────────────────────────────────┘                 │

│                                                                   │

│  📌 Tính năng chung của Games                                    │

│     ├── Chọn deck / cards để chơi                               │

│     ├── Difficulty levels: Easy / Medium / Hard                  │

│     ├── Leaderboard (bảng xếp hạng)                             │

│     ├── Điểm số → ảnh hưởng đến SRS rating                     │

│     ├── Daily Challenge (thử thách hàng ngày)                   │

│     ├── Multiplayer mode (chơi đối kháng online)                │

│     └── Achievement badges                                       │

│                                                                   │

└────────────────────────────────────────────────────────────────┘
1. ## <a name="_toc225239615"></a>**📝 MODULE MINI TEST**
┌──────────────────────────────────────────────────────────────┐

│                    MINI TEST MODULE (tiếp)                     │

├──────────────────────────────────────────────────────────────┤

│                                                               │

│  📌 Loại bài test                                            │

│     ├── 1. Vocabulary Test (Trắc nghiệm từ vựng)            │

│     │      ├── EN → VI (Chọn nghĩa đúng)                    │

│     │      ├── VI → EN (Chọn từ đúng)                        │

│     │      ├── Nghe → Chọn từ đúng                           │

│     │      └── Nhìn hình → Chọn từ                           │

│     │                                                         │

│     ├── 2. Spelling Test (Kiểm tra chính tả)                │

│     │      ├── Nghe và viết lại                              │

│     │      └── Điền từ vào chỗ trống                         │

│     │                                                         │

│     ├── 3. Context Test (Kiểm tra ngữ cảnh)                 │

│     │      ├── Điền từ vào câu                               │

│     │      └── Chọn từ phù hợp ngữ cảnh                     │

│     │                                                         │

│     └── 4. Comprehensive Test (Tổng hợp)                     │

│            └── Mix tất cả dạng trên                           │

│                                                               │

│                                                               │

│  📌 Cấu trúc bài test                                       │

│     ├── Số câu hỏi: 10 / 20 / 30 / Custom                  │

│     ├── Thời gian: Có giới hạn / Không giới hạn             │

│     ├── Nguồn câu hỏi:                                      │

│     │   ├── Từ 1 deck cụ thể                                │

│     │   ├── Từ nhiều deck (mix)                              │

│     │   ├── Từ cards đã sai nhiều lần                        │

│     │   └── Từ cards sắp đến hạn ôn tập                     │

│     └── Độ khó: Dễ / Trung bình / Khó / Tự động            │

│                                                               │

│  📌 Auto-generate câu hỏi                                   │

│     ┌────────────────────────────────────────┐               │

│     │  Flashcard Data                        │               │

│     │  ┌──────────┐                          │               │

│     │  │ Word     │──┐                       │               │

│     │  │ Meaning  │  │   ┌────────────────┐  │               │

│     │  │ Example  │  ├──▶│ Question       │  │               │

│     │  │ Synonym  │  │   │ Generator      │  │               │

│     │  │ Image    │  │   │ Engine         │  │               │

│     │  │ Audio    │──┘   └───────┬────────┘  │               │

│     │  └──────────┘              │            │               │

│     │                    ┌───────▼────────┐   │               │

│     │                    │ Câu hỏi + 4   │   │               │

│     │                    │ đáp án (1 đúng │   │               │

│     │                    │ + 3 nhiễu)     │   │               │

│     │                    └────────────────┘   │               │

│     └────────────────────────────────────────┘               │

│                                                               │

│  📌 Kết quả bài test                                        │

│     ├── Điểm số: X / Tổng (% đúng)                         │

│     ├── Thời gian hoàn thành                                 │

│     ├── Chi tiết từng câu đúng/sai                          │

│     ├── Từ nào sai → đánh dấu ôn lại                        │

│     ├── So sánh với lần test trước                           │

│     └── Lưu lịch sử tất cả bài test                         │

│                                                               │

│  📌 Test do Giáo viên tạo                                   │

│     ├── GV tạo test từ deck đã assign cho lớp               │

│     ├── Cài đặt thời gian mở / đóng test                    │

│     ├── Giới hạn số lần làm bài                             │

│     ├── Xem kết quả chi tiết từng học sinh                   │

│     └── Export kết quả ra Excel/CSV                          │

│                                                               │

│  📌 Test tự động hàng ngày (Daily Quiz)                     │

│     ├── Hệ thống tự tạo 10 câu từ cards đang học           │

│     ├── Ưu tiên cards có tỉ lệ sai cao                      │

│     ├── Nhắc nhở user làm Daily Quiz                         │

│     └── Streak bonus cho làm liên tục                        │

│                                                               │

└──────────────────────────────────────────────────────────────┘
1. ## <a name="_toc225239616"></a>**🌐 MODULE ĐA NGÔN NGỮ (i18n / L10n)**
┌──────────────────────────────────────────────────────────────────┐

│              INTERNATIONALIZATION MODULE                          │

├──────────────────────────────────────────────────────────────────┤

│                                                                   │

│  📌 Kiến trúc đa ngôn ngữ                                       │

│                                                                   │

│  ┌─────────────────────────────────────────────────────┐         │

│  │              LANGUAGE LAYER                          │         │

│  │                                                      │         │

│  │  ┌──────────┐ ┌──────────┐ ┌──────────┐ ┌────────┐│         │

│  │  │ 🇻🇳 VI   │ │ 🇺🇸 EN   │ │ 🇯🇵 JA   │ │ 🇰🇷 KO ││         │

│  │  │ Tiếng    │ │ English  │ │ 日本語    │ │ 한국어  ││         │

│  │  │ Việt     │ │          │ │          │ │        ││         │

│  │  └──────────┘ └──────────┘ └──────────┘ └────────┘│         │

│  └─────────────────────────────────────────────────────┘         │

│                                                                   │

│  📌 Phạm vi đa ngôn ngữ                                         │

│     ├── UI Labels (tất cả text trên giao diện)                  │

│     │   ├── Menu, Button, Form labels                           │

│     │   ├── Error messages, Success messages                    │

│     │   ├── Tooltip, Placeholder                                │

│     │   └── Email templates                                      │

│     │                                                             │

│     ├── Content ngôn ngữ học                                     │

│     │   ├── Ngôn ngữ gốc (Source): English                      │

│     │   ├── Ngôn ngữ đích (Target): Tùy user chọn              │

│     │   │   (VD: EN → VI, EN → JA, EN → KO)                    │

│     │   └── Flashcard hiển thị theo cặp ngôn ngữ               │

│     │                                                             │

│     └── System content                                            │

│         ├── Danh mục, Tags                                       │

│         ├── Thông báo hệ thống                                   │

│         └── Hướng dẫn sử dụng                                    │

│                                                                   │

│  📌 Cấu trúc file ngôn ngữ (JSON)                               │

│                                                                   │

│     /locales                                                      │

│     ├── vi.json                                                   │

│     │   {                                                         │

│     │     "nav.home": "Trang chủ",                               │

│     │     "nav.flashcards": "Thẻ ghi nhớ",                      │

│     │     "nav.games": "Trò chơi",                               │

│     │     "btn.start\_learning": "Bắt đầu học",                  │

│     │     "msg.cards\_due": "Bạn có {{count}} thẻ cần ôn",      │

│     │     "msg.streak": "Chuỗi học: {{days}} ngày"              │

│     │   }                                                         │

│     ├── en.json                                                   │

│     │   {                                                         │

│     │     "nav.home": "Home",                                    │

│     │     "nav.flashcards": "Flashcards",                        │

│     │     "nav.games": "Games",                                  │

│     │     "btn.start\_learning": "Start Learning",                │

│     │     "msg.cards\_due": "You have {{count}} cards due",      │

│     │     "msg.streak": "Streak: {{days}} days"                 │

│     │   }                                                         │

│     ├── ja.json                                                   │

│     └── ko.json                                                   │

│                                                                   │

│  📌 Quản lý ngôn ngữ (Admin)                                    │

│     ├── Thêm / Sửa / Xóa ngôn ngữ                              │

│     ├── Quản lý translation keys                                 │

│     ├── Import/Export file ngôn ngữ                              │

│     ├── Translation progress (% hoàn thành)                      │

│     └── Fallback language (mặc định: EN)                         │

│                                                                   │

│  📌 User Settings                                                │

│     ├── Chọn ngôn ngữ giao diện (UI language)                   │

│     ├── Chọn ngôn ngữ học (Learning language pair)              │

│     ├── Tự động detect từ browser locale                        │

│     └── Lưu preference vào profile                               │

│                                                                   │

└──────────────────────────────────────────────────────────────────┘
1. ## <a name="_toc225239617"></a>**👨‍🏫 MODULE GIÁO VIÊN (TEACHER)**
┌──────────────────────────────────────────────────────────────┐

│                    TEACHER MODULE                              │

├──────────────────────────────────────────────────────────────┤

│                                                               │

│  📌 Đăng ký & Xác thực Giáo viên                            │

│     ┌─────────┐    ┌──────────┐    ┌─────────┐              │

│     │ Đăng ký │    │ Upload   │    │ Submit  │              │

│     │ tài     │───▶│ chứng    │───▶│ yêu cầu│              │

│     │ khoản   │    │ chỉ/hồ sơ│    │ duyệt  │              │

│     └─────────┘    └──────────┘    └────┬────┘              │

│                                          │                    │

│                              ┌───────────▼──────────┐        │

│                              │    ADMIN REVIEW       │        │

│                              │  ┌────────┐ ┌──────┐ │        │

│                              │  │Approve │ │Reject│ │        │

│                              │  └───┬────┘ └──┬───┘ │        │

│                              └──────┼─────────┼─────┘        │

│                                     │         │               │

│                              ┌──────▼───┐ ┌───▼────────┐    │

│                              │ Kích hoạt│ │ Email thông│    │

│                              │ role GV  │ │ báo từ chối│    │

│                              └──────────┘ └────────────┘    │

│                                                               │

│  📌 Quản lý lớp học (Classroom)                             │

│     ├── Tạo lớp học (tên, mô tả, mã lớp)                   │

│     ├── Mời học sinh vào lớp (link/mã mời)                  │

│     ├── Quản lý danh sách học sinh                           │

│     ├── Giao deck cho cả lớp                                 │

│     ├── Tạo & giao bài test cho lớp                         │

│     ├── Đặt deadline cho bài tập                             │

│     └── Xóa / Archive lớp học                                │

│                                                               │

│  📌 Theo dõi tiến độ học sinh                                │

│     ┌────────────────────────────────────────────┐           │

│     │  Bảng theo dõi lớp TOEIC\_A1                │           │

│     │                                             │           │

│     │  Học sinh  │ Cards │ Đã ôn │ Test │ Streak │           │

│     │  ──────────┼───────┼───────┼──────┼─────── │           │

│     │  Nguyễn A  │ 120   │  85%  │ 82%  │  15d   │           │

│     │  Trần B    │ 120   │  72%  │ 75%  │   8d   │           │

│     │  Lê C      │ 120   │  45%  │ 60%  │   2d   │           │

│     │  Phạm D    │ 120   │  90%  │ 88%  │  20d   │           │

│     └────────────────────────────────────────────┘           │

│                                                               │

│  📌 Tạo nội dung                                             │

│     ├── Tạo deck công khai (Public Deck)                     │

│     ├── Tạo deck cho lớp (Class Deck)                        │

│     ├── Tạo bài test tùy chỉnh                              │

│     ├── Thêm ghi chú / tips cho từng card                    │

│     └── Review & edit deck trước khi publish                  │

│                                                               │

│  📌 Thống kê & Báo cáo                                      │

│     ├── Tổng số học sinh đang quản lý                        │

│     ├── Tỉ lệ hoàn thành bài tập theo lớp                   │

│     ├── Top học sinh tích cực nhất                           │

│     ├── Từ vựng khó nhất (tỉ lệ sai cao)                    │

│     └── Export báo cáo PDF/Excel                              │

│                                                               │

└──────────────────────────────────────────────────────────────┘
1. ## <a name="_toc225239618"></a>**🛡️ MODULE ADMIN**
┌──────────────────────────────────────────────────────────────────┐

│                       ADMIN MODULE                                │

├──────────────────────────────────────────────────────────────────┤

│                                                                   │

│  📌 Dashboard tổng quan                                          │

│     ┌──────────────────────────────────────────────────┐         │

│     │  📊 ADMIN DASHBOARD                              │         │

│     │                                                   │         │

│     │  ┌──────────┐ ┌──────────┐ ┌──────────┐         │         │

│     │  │ 👥 Users │ │ 📚 Decks │ │ 🎮 Games │         │         │

│     │  │  12,450  │ │   3,200  │ │  45,000  │         │         │

│     │  │  +150/w  │ │  +80/w   │ │ plays/w  │         │         │

│     │  └──────────┘ └──────────┘ └──────────┘         │         │

│     │                                                   │         │

│     │  ┌──────────┐ ┌──────────┐ ┌──────────┐         │         │

│     │  │ 👨‍🏫 GV   │ │ ⏳ Pending│ │ 📈 Active│         │         │

│     │  │   320    │ │ Requests │ │  Users   │         │         │

│     │  │  +12/w   │ │    15    │ │  8,200   │         │         │

│     │  └──────────┘ └──────────┘ └──────────┘         │         │

│     │                                                   │         │

│     │  📈 Biểu đồ user growth / active users / ...    │         │

│     └──────────────────────────────────────────────────┘         │

│                                                                   │

│  📌 Quản lý người dùng                                           │

│     ├── Danh sách tất cả users (search, filter, sort)           │

│     ├── Xem chi tiết profile user                                │

│     ├── Thay đổi role user                                       │

│     ├── Ban / Unban user                                         │

│     ├── Reset password cho user                                  │

│     └── Xóa tài khoản user                                      │

│                                                                   │

│  📌 Duyệt yêu cầu Giáo viên                                    │

│     ├── Danh sách yêu cầu pending                               │

│     ├── Xem hồ sơ / chứng chỉ đã upload                        │

│     ├── Approve + gửi email thông báo                            │

│     ├── Reject + ghi lý do + gửi email                           │

│     └── Lịch sử duyệt                                            │

│                                                                   │

│  📌 Quản lý nội dung                                             │

│     ├── Duyệt deck công khai                                     │

│     ├── Quản lý danh mục (Categories)                            │

│     │   ├── TOEIC / IELTS / TOEFL                               │

│     │   ├── Business English                                     │

│     │   ├── Daily Conversation                                   │

│     │   ├── Academic                                              │

│     │   └── Custom categories...                                  │

│     ├── Quản lý Tags                                              │

│     ├── Xử lý báo cáo vi phạm (Report)                          │

│     └── Quản lý nội dung tĩnh (About, FAQ, Terms...)            │

│                                                                   │

│  📌 Quản lý đa ngôn ngữ                                         │

│     ├── Thêm / Sửa / Xóa ngôn ngữ hệ thống                    │

│     ├── Quản lý translation keys & values                        │

│     ├── Import / Export file ngôn ngữ                            │

│     └── Set ngôn ngữ mặc định                                    │

│                                                                   │

│  📌 Cấu hình hệ thống                                           │

│     ├── Cài đặt SRS mặc định                                    │

│     ├── Giới hạn upload file (size, type)                        │

│     ├── Cài đặt email SMTP                                       │

│     ├── Cài đặt push notification                                │

│     ├── Maintenance mode                                          │

│     └── Feature flags (bật/tắt tính năng)                        │

│                                                                   │

│  📌 Báo cáo & Thống kê                                          │

│     ├── User analytics (đăng ký, active, churn rate)             │

│     ├── Content analytics (top decks, top cards)                 │

│     ├── Game analytics (plays, completion rate)                  │

│     ├── System logs                                               │

│     └── Export reports (PDF, Excel, CSV)                          │

│                                                                   │

│  📌 Phân quyền chi tiết (RBAC)                                  │

│     ├── Tạo / Sửa Role                                          │

│     ├── Gán Permission cho Role                                   │

│     │   ┌────────────────────────────────────────┐               │

│     │   │  Permission Groups:                    │               │

│     │   │  ├── user.view, user.create,           │               │

│     │   │  │   user.edit, user.delete            │               │

│     │   │  ├── deck.view, deck.create,           │               │

│     │   │  │   deck.edit, deck.delete,           │               │

│     │   │  │   deck.approve                      │               │

│     │   │  ├── teacher.approve, teacher.reject   │               │

│     │   │  ├── system.config, system.logs        │               │

│     │   │  └── report.view, report.export        │               │

│     │   └────────────────────────────────────────┘               │

│     ├── Gán Role cho User                                        │

│     └── Audit log (ai làm gì, lúc nào)                          │

│                                                                   │

└──────────────────────────────────────────────────────────────────┘
1. ## <a name="_toc225239619"></a>**📊 MODULE THỐNG KÊ & GAMIFICATION (NGƯỜI HỌC)**
┌──────────────────────────────────────────────────────────────────┐

│            STATISTICS & GAMIFICATION MODULE                       │

├──────────────────────────────────────────────────────────────────┤

│                                                                   │

│  📌 Thống kê cá nhân (Personal Dashboard)                       │

│     ┌────────────────────────────────────────────────┐           │

│     │  🏠 MY DASHBOARD                               │           │

│     │                                                 │           │

│     │  🔥 Streak: 15 ngày   ⏱️ Hôm nay: 25 phút    │           │

│     │                                                 │           │

│     │  ┌─────────┐ ┌─────────┐ ┌─────────┐          │           │

│     │  │ Tổng từ │ │ Đã thuộc│ │ Đang học│          │           │

│     │  │  850    │ │   620   │ │   230   │          │           │

│     │  └─────────┘ └─────────┘ └─────────┘          │           │

│     │                                                 │           │

│     │  📈 Biểu đồ tiến độ 30 ngày gần nhất          │           │

│     │  ┌──────────────────────────────────┐          │           │

│     │  │  50│       ╱╲                    │          │           │

│     │  │    │    ╱╲╱  ╲   ╱╲             │          │           │

│     │  │  25│   ╱      ╲ ╱  ╲╱╲          │          │           │

│     │  │    │  ╱        ╲      ╲         │          │           │

│     │  │   0│╱───────────────────────▶   │          │           │

│     │  │    1    7    14    21    30 ngày │          │           │

│     │  └──────────────────────────────────┘          │           │

│     │                                                 │           │

│     │  📊 Phân bố trạng thái cards                   │           │

│     │  [██████████████░░░░░░] 73% Graduated          │           │

│     │  [████░░░░░░░░░░░░░░░] 18% Learning           │           │

│     │  [██░░░░░░░░░░░░░░░░░]  9% New                │           │

│     │                                                 │           │

│     │  📅 Heatmap hoạt động (giống GitHub)           │           │

│     │  ┌─────────────────────────────────┐           │           │

│     │  │ T2 ░░█░░░██░░█░░░██░░█░░░██░░ │           │           │

│     │  │ T3 ░██░░░██░░██░░██░░██░░██░░ │           │           │

│     │  │ T4 ░░█░░░░█░░█░░░░█░░█░░░░█░░ │           │           │

│     │  │ T5 ██░░░░██░░██░░░██░░██░░██░░│           │           │

│     │  │ T6 ░█░░░░░█░░░█░░░░█░░░█░░░█░ │           │           │

│     │  │ T7 ████░████░████░████░████░██ │           │           │

│     │  │ CN ███░░███░░███░░███░░███░░██ │           │           │

│     │  └─────────────────────────────────┘           │           │

│     └────────────────────────────────────────────────┘           │

│                                                                   │

│  📌 Gamification                                                  │

│     ├── 🔥 Learning Streak                                       │

│     │   ├── Đếm số ngày học liên tục                             │

│     │   ├── Streak freeze (1-2 lần/tháng)                        │

│     │   └── Milestone rewards: 7d, 30d, 100d, 365d              │

│     │                                                             │

│     ├── ⭐ Experience Points (XP)                                │

│     │   ├── Học card mới: +10 XP                                 │

│     │   ├── Ôn tập đúng: +5 XP                                  │

│     │   ├── Hoàn thành test: +20 XP                              │

│     │   ├── Thắng game: +15 XP                                   │

│     │   └── Daily bonus: +50 XP                                  │

│     │                                                             │

│     ├── 🏅 Level System                                          │

│     │   ├── Level 1: Beginner (0 - 500 XP)                      │

│     │   ├── Level 2: Learner (500 - 1500 XP)                    │

│     │   ├── Level 3: Intermediate (1500 - 4000 XP)              │

│     │   ├── Level 4: Advanced (4000 - 10000 XP)                 │

│     │   └── Level 5: Master (10000+ XP)                          │

│     │                                                             │

│     ├── 🏆 Achievements (Huy hiệu)                              │

│     │   ├── 🌟 "First Step" - Học card đầu tiên                 │

│     │   ├── 📚 "Bookworm" - Học 100 từ                          │

│     │   ├── 🔥 "On Fire" - Streak 7 ngày                        │

│     │   ├── 🎯 "Sharp Shooter" - Test 100% đúng                 │

│     │   ├── 🎮 "Game Master" - Thắng 50 game                    │

│     │   ├── 👑 "Vocabulary King" - Học 1000 từ                   │

│     │   └── 💎 "Diamond" - Streak 365 ngày                      │

│     │                                                             │

│     └── 📋 Leaderboard (Bảng xếp hạng)                         │

│         ├── XP hàng tuần / tháng                                 │

│         ├── Xếp hạng trong lớp (nếu có)                         │

│         ├── Xếp hạng toàn hệ thống                              │

│         └── Xếp hạng theo mini game                              │

│                                                                   │

└──────────────────────────────────────────────────────────────────┘
1. ## <a name="_toc225239620"></a>**👤 MODULE PROFILE & SETTINGS**
┌──────────────────────────────────────────────────────────────┐

│              USER PROFILE & SETTINGS MODULE                    │

├──────────────────────────────────────────────────────────────┤

│                                                               │

│  📌 Thông tin cá nhân                                        │

│     ├── Avatar, Tên hiển thị                                 │

│     ├── Email (đã xác thực)                                  │

│     ├── Số điện thoại (optional)                             │

│     ├── Bio / Giới thiệu                                     │

│     ├── Ngày tham gia                                        │

│     └── Level, XP, Achievements                              │

│                                                               │

│  📌 Cài đặt học tập                                         │

│     ├── Số cards mới mỗi ngày: [slider 5-50]                │

│     ├── Số cards ôn tập tối đa/ngày                         │

│     ├── Thứ tự cards: Random / Sequential                    │

│     ├── Auto-play audio: On/Off                              │

│     └── Hiển thị: Front→Back / Back→Front                    │

│                                                               │

│  📌 Cài đặt nhắc nhở                                        │

│     ├── Bật/Tắt nhắc nhở                                    │

│     ├── Thời gian nhắc: [Time picker]                        │

│     ├── Ngày nhắc: [Chọn ngày trong tuần]                   │

│     ├── Kênh: Email / Push / In-app                          │

│     └── Nhắc khi sắp mất streak: On/Off                     │

│                                                               │

│  📌 Cài đặt ngôn ngữ                                        │

│     ├── Ngôn ngữ giao diện: [VI/EN/JA/KO]                   │

│     ├── Ngôn ngữ học: [EN→VI / EN→JA / ...]                │

│     └── Timezone                                              │

│                                                               │

│                                                               │

│  📌 Bảo mật                                                  │

│     ├── Đổi mật khẩu                                        │

│     ├── Bật/Tắt xác thực 2 lớp (2FA)                       │

│     ├── Quản lý phiên đăng nhập (Active Sessions)           │

│     │   ├── Xem danh sách thiết bị đang đăng nhập          │

│     │   └── Đăng xuất khỏi thiết bị cụ thể                 │

│     ├── Liên kết tài khoản OAuth (Google, Facebook)         │

│     └── Xóa tài khoản vĩnh viễn                            │

│                                                               │

│  📌 Quyền riêng tư                                          │

│     ├── Profile: Public / Private                            │

│     ├── Hiển thị trên Leaderboard: On / Off                 │

│     ├── Cho phép người khác xem decks: On / Off             │

│     └── Cho phép GV mời vào lớp: On / Off                   │

│                                                               │

│  📌 Giao diện                                                │

│     ├── Theme: Light / Dark / Auto (theo hệ thống)          │

│     ├── Font size: Small / Medium / Large                    │

│     ├── Card animation: On / Off                             │

│     └── Sound effects: On / Off                              │

│                                                               │

└──────────────────────────────────────────────────────────────┘

-----
1. # <a name="_toc225239621"></a>**DATABASE DESIGN (THIẾT KẾ CSDL)**
1. ## <a name="_toc225239622"></a>**Entity Relationship Diagram (ERD)**
┌───────────────────────────────────────────────────────┐

│                        ENTITY RELATIONSHIP DIAGRAM                                                                                             │

├──────────────────────────────────────────────────────────────┤

│                                                                                                                                                                                        │

│  ┌──────────────┐                        ┌───────────────┐        ┌───────────────┐   │

│  │    USERS                         │────1:N──│ USER\_SESSIONS           │        │    ROLES                            │   │

│  ├──────────────┤                         ├───────────────┤        ├───────────────┤   │

│  │ id (PK)                           │                        │ id (PK)                             │         │ id (PK)                              │   │

│  │ email                              │                        │ user\_id (FK)                   │         │ name                                 │   │

│  │ password                      │                        │ token                                │        │ description                      │   │

│  │ display\_name              │                        │ device\_info                      │        │ created\_at                        │   │

│  │ avatar\_url                     │                        │ ip\_address                       │        └───────┬───────┘   │

│  │ bio                                  │                        │ expires\_at                        │                                │                           │

│  │ phone                             │                        │ created\_at                       │                               │                            │

│  │ role\_id (FK)                  │────────│                                             │        ┌───────▼───────┐   │

│  │ ui\_language                  │                        └───────────────┘        │ROLE\_PERMISSIONS│   │

│  │ learn\_lang                     │                                                                                   ├───────────────┤   │

│  │ timezone                      │         ┌───────────┐                                    │ role\_id (FK)                     │   │

│  │ xp\_points                     │         │  PERMISSIONS  │                                     │ permission\_id                 │   │

│  │ level                              │         ├───────────┤                                     │ (FK)                                   │   │

│  │ streak\_count              │         │ id (PK)                 │─────────────│                                           │   │

│  │ status                           │         │ name                    │                                     └───────────────┘   │

│  │ is\_verified                   │         │ group                   │                            │

│  │ created\_at                   │         │ description        │                            │

│  │ updated\_at                 │         └───────────┘                            │

│  └──────┬───────┘                                                       │

│           │                                                                │

│           │ 1:1                                                            │

│         ▼                                                                │

│  ┌──────────────────┐                                                   │

│  │ TEACHER\_PROFILES  │                                                   │

│  ├──────────────────┤                                                   │

│  │ id (PK)           │                                                   │

│  │ user\_id (FK)      │                                                   │

│  │ certificate\_url   │                                                   │

│  │ qualifications    │                                                   │

│  │ experience\_years  │                                                   │

│  │ specialization    │                                                   │

│  │ status            │  ← (pending/approved/rejected)                   │

│  │ reviewed\_by (FK)  │                                                   │

│  │ reviewed\_at       │                                                   │

│  │ reject\_reason     │                                                   │

│  │ created\_at        │                                                   │

│  └──────────────────┘                                                   │

│                                                                          │

└─────────────────────────────────────────────────────────────────────────┘

┌─────────────────────────────────────────────────────────────────────────┐

│                     FLASHCARD ENTITIES                                    │

├─────────────────────────────────────────────────────────────────────────┤

│                                                                          │

│  ┌──────────────┐       ┌─────────────────┐      ┌───────────────┐     │

│  │  CATEGORIES  │──1:N──│     DECKS                     │──N:M─│    TAGS       │     │

│  ├──────────────┤       ├─────────────────┤      ├───────────────┤     │

│  │ id (PK)           │                      │ id (PK)                 │                         │ id (PK)       │     │

│  │ name\_key     │                       │ user\_id (FK)        │                        │ name          │     │

│  │ parent\_id      │                       │ category\_id(FK) │                        │ slug          │     │

│  │ icon                │                       │ title                        │                        └───────────────┘     │

│  │ sort\_order    │                       │ description          │                                               │

│  │ is\_active        │                       │ cover\_image\_url │                        ┌───────────────┐     │

│  └─────────┘                      │ visibility      │                                  │  DECK\_TAGS    │     │

│                                                         │ (public/private/│                        ├───────────────┤     │

│                                                         │  class)         │                                   │ deck\_id (FK)  │     │

│                                                         │ total\_cards     │──────────│ tag\_id (FK)   │     │

│                                                         │ learn\_count     │                             └───────────────┘     │

│                                                         │ avg\_rating      │                             │

│                                                         │ is\_approved     │                             │

│                                                         │ cloned\_from(FK) │                             │

│                                                         │ created\_at      │                             │

│                                                         │ updated\_at      │                             │

│                                                         └────────┬────────┘                             │

│                                                                  │ 1:N                                   │

│                                                                  ▼                                       │

│                         ┌─────────────────┐                             │

│                         │   FLASHCARDS    │                             │

│                         ├─────────────────┤                             │

│                         │ id (PK)         │                             │

│                         │ deck\_id (FK)    │                             │

│                         │ front\_text      │  ← Từ vựng                 │

│                         │ front\_image\_url │  ← Hình ảnh                │

│                         │ front\_audio\_url │  ← Audio phát âm           │

│                         │ phonetic        │  ← Phiên âm                │

│                         │ back\_text       │  ← Nghĩa                   │

│                         │ back\_detail     │  ← Chi tiết (loại từ...)   │

│                         │ example         │  ← Ví dụ                   │

│                         │ synonyms        │  ← Từ đồng nghĩa          │

│                         │ note            │  ← Ghi chú                 │

│                         │ sort\_order      │                             │

│                         │ created\_at      │                             │

│                         │ updated\_at      │                             │

│                         └─────────────────┘                             │

│                                                                          │

└─────────────────────────────────────────────────────────────────────────┘

┌─────────────────────────────────────────────────────────────────────────┐

│                    SRS & LEARNING ENTITIES                                │

├─────────────────────────────────────────────────────────────────────────┤

│                                                                          │

│  ┌──────────────────────┐         ┌─────────────────────────┐          │

│  │  USER\_CARD\_PROGRESS                 │         │    REVIEW\_LOGS          │          │

│  ├──────────────────────┤         ├─────────────────────────┤          │

│  │ id (PK)                                      │──1:N───│ id (PK)                 │          │

│  │ user\_id (FK)                  │                                │ user\_card\_progress\_id   │          │

│  │ flashcard\_id (FK)         │                                │ (FK)                    │          │

│  │ status                              │                                │ rating                  │          │

│  │ (new/learning/           │                                │ (again/hard/good/easy)  │          │

│  │  review/graduated)   │                                │ response\_time\_ms        │          │

│  │ ease\_factor                   │                                │ reviewed\_at             │          │

│  │ interval\_days               │                                └─────────────────────────┘          │

│  │ repetitions          │                                                                      │

│  │ next\_review\_date     │         ┌─────────────────────────┐          │

│  │ last\_reviewed\_at     │          │   LEARNING\_SESSIONS     │          │

│  │ leitner\_box          │               ├─────────────────────────┤          │

│  │ total\_reviews        │             │ id (PK)                 │          │

│  │ correct\_count        │            │ user\_id (FK)            │          │

│  │ incorrect\_count      │          │ deck\_id (FK)            │          │

│  │ created\_at           │                │ session\_type            │          │

│  │ updated\_at           │               │ (new/review/cram/mixed) │          │

│  └─────────────┘         │ cards\_studied           │          │

│                                                       │ cards\_correct           │          │

│                                                       │ duration\_seconds        │          │

│                                                       │ xp\_earned               │          │

│                                                       │ started\_at              │          │

│                                                       │ ended\_at                │          │

│                                                       └─────────────────────────┘          │

│                                                                          │

│  ┌──────────────────────┐         ┌─────────────────────────┐          │

│  │   USER\_STREAKS       │                                 │   USER\_DAILY\_STATS      │          │

│  ├──────────────────────┤         ├─────────────────────────┤          │

│  │ id (PK)              │                                             │ id (PK)                 │          │

│  │ user\_id (FK)         │                                        │ user\_id (FK)            │          │

│  │ current\_streak       │                                     │ date                    │          │

│  │ longest\_streak       │                                     │ cards\_learned           │          │

│  │ last\_activity\_date   │                                    │ cards\_reviewed          │          │

│  │ freeze\_remaining     │                                  │ time\_spent\_seconds      │          │

│  │ updated\_at           │                                        │ xp\_earned               │          │

│  └──────────────────────┘         │ tests\_completed         │          │

│                                                                                  │ games\_played            │          │

│                                                                                  │ created\_at              │          │

│                                                                                  └─────────────────────────┘          │

│                                                                          │

└─────────────────────────────────────────────────────────────────────────┘

┌─────────────────────────────────────────────────────────────────────────┐

│                  TEST & GAME ENTITIES                                     │

├─────────────────────────────────────────────────────────────────────────┤

│                                                                          │

│  ┌────────────────────┐          ┌──────────────────────┐              │

│  │      TESTS                          │───1:N───│   TEST\_QUESTIONS     │              │

│  ├────────────────────┤          ├──────────────────────┤              │

│  │ id (PK)                         │                             │ id (PK)              │              │

│  │ title                               │                             │ test\_id (FK)         │              │

│  │ creator\_id (FK)         │                             │ flashcard\_id (FK)    │              │

│  │ deck\_id (FK)              │                             │ question\_type        │              │

│  │ test\_type                     │                             │ question\_text        │              │

│  │ (vocab/spelling/      │                             │ correct\_answer       │              │

│  │  context/mixed)       │                             │ options (JSON)       │              │

│  │ total\_questions         │                             │ sort\_order           │              │

│  │ time\_limit\_seconds │                             └──────────────────────┘              │

│  │ max\_attempts       │                                                                                      │

│  │ is\_published       │                   ┌──────────────────────┐              │

│  │ open\_at            │                       │  TEST\_ATTEMPTS       │              │

│  │ close\_at           │───1:N───├──────────────────────┤              │

│  │ classroom\_id (FK)  │          │ id (PK)              │              │

│  │ created\_at         │                  │ test\_id (FK)         │              │

│  └─────────────┘          │ user\_id (FK)         │              │

│                                                        │ score                │              │

│                                                        │ total\_correct        │              │

│                                                        │ total\_wrong          │              │

│                                                        │ time\_spent\_seconds   │              │

│                                                        │ answers\_detail(JSON) │              │

│                                                        │ started\_at           │              │

│                                                        │ completed\_at         │              │

│                                                        └──────────────────────┘              │

│                                                                          │

│  ┌────────────────────┐          ┌──────────────────────┐              │

│  │   GAME\_SESSIONS                        │          │    LEADERBOARDS      │              │

│  ├────────────────────┤          ├──────────────────────┤              │

│  │ id (PK)                        │                               │ id (PK)              │              │

│  │ user\_id (FK)              │                               │ user\_id (FK)         │              │

│  │ game\_type                 │                               │ period\_type          │              │

│  │ (matching/quiz/     │                               │ (daily/weekly/       │              │

│  │  scramble/sprint/  │                               │  monthly/all\_time)   │              │

│  │  listening/typing/  │                               │ period\_start         │              │

│  │  memory)                  │                               │ xp\_total             │              │

│  │ deck\_id (FK)             │                               │ rank                 │              │

│  │ difficulty                    │                               │ updated\_at           │              │

│  │ score                           │                               └──────────────────────┘              │

│  │ max\_combo          │                                                │

│  │ accuracy\_percent   │                                                │

│  │ duration\_seconds   │                                                │

│  │ played\_at          │                                                │

│  └────────────────────┘                                                │

│                                                                          │

└─────────────────────────────────────────────────────────────────────────┘

┌─────────────────────────────────────────────────────────────────────────┐

│                CLASSROOM & NOTIFICATION ENTITIES                         │

├─────────────────────────────────────────────────────────────────────────┤

│                                                                          │

│  ┌────────────────────┐          ┌──────────────────────┐              │

│  │    CLASSROOMS              │───1:N───│ CLASSROOM\_MEMBERS    │              │

│  ├────────────────────┤          ├──────────────────────┤              │

│  │ id (PK)                     │                                  │ id (PK)              │              │

│  │ teacher\_id (FK)     │                                  │ classroom\_id (FK)    │              │

│  │ name                        │                                  │ user\_id (FK)         │              │

│  │ description             │                                  │ role (student/       │              │

│  │ invite\_code              │                                  │  co\_teacher)         │              │

│  │ cover\_image\_url    │                                  │ joined\_at            │              │

│  │ is\_active                   │                                  └──────────────────────┘              │

│  │ max\_students       │                                                │

│  │ created\_at         │          ┌──────────────────────┐              │

│  └──────────┘          │ CLASSROOM\_DECKS      │              │

│          │                                   ├──────────────────────┤              │

│          └───1:N───────│ id (PK)              │              │

│                                                 │ classroom\_id (FK)    │              │

│                                                 │ deck\_id (FK)         │              │

│                                                 │ assigned\_at          │              │

│                                                 │ due\_date             │              │

│                                                 └──────────────────────┘              │

│                                                                          │

│  ┌────────────────────┐          ┌──────────────────────┐              │

│  │   NOTIFICATIONS                        │          │ REMINDER\_SETTINGS    │              │

│  ├────────────────────┤          ├──────────────────────┤              │

│  │ id (PK)                         │                              │ id (PK)              │              │

│  │ user\_id (FK)               │                              │ user\_id (FK)         │              │

│  │ type                              │                              │ is\_enabled           │              │

│  │ (reminder/streak/  │                              │ remind\_time          │              │

│  │  achievement/           │                              │ remind\_days (JSON)   │              │

│  │  assignment/           │                              │ channels (JSON)      │              │

│  │  system/teacher)   │                              │ (email/push/in\_app)  │              │

│  │ title                            │                              │ streak\_reminder      │              │

│  │ message                   │                              │ daily\_quiz\_reminder  │              │

│  │ data (JSON)             │                              │ timezone             │              │

│  │ is\_read                      │                              │ updated\_at           │              │

│  │ read\_at                      │                              └──────────────────────┘              │

│  │ created\_at         │                                                │

│  └────────────┘                                                │

│                                                                          │

│  ┌────────────────────┐          ┌──────────────────────┐              │

│  │   TRANSLATIONS                         │          │   LANGUAGES          │              │

│  ├────────────────────┤          ├──────────────────────┤              │

│  │ id (PK)                                             │          │ id (PK)              │              │

│  │ language\_id (FK)   │─────N:1────│ code (vi/en/ja/ko)   │              │

│  │ key                                                    │          │ name                 │              │

│  │ value                                                │          │ native\_name          │              │

│  │ group                                               │          │ flag\_icon            │              │

│  │ updated\_at                                     │          │ is\_active            │              │

│  └────────────────────┘          │ is\_default           │              │

│                                                                             │ progress\_percent     │              │

│  ┌────────────────────┐          └──────────────────────┘              │

│  │  USER\_ACHIEVEMENTS │                                                │

│  ├────────────────────┤          ┌──────────────────────┐              │

│  │ id (PK)                                             │          │    ACHIEVEMENTS      │              │

│  │ user\_id (FK)                     │──N:1────├──────────────────────┤              │

│  │ achievement\_id(FK)                    │          │ id (PK)              │              │

│  │ earned\_at                                        │          │ name\_key             │              │

│  └────────────────────┘          │ description\_key      │              │

│                                                                             │ icon\_url             │              │

│  ┌────────────────────┐          │ condition\_type       │              │

│  │   DECK\_RATINGS                          │          │ condition\_value      │              │

│  ├────────────────────┤          │ xp\_reward            │              │

│  │ id (PK)            │                                          └──────────────────────┘              │

│  │ deck\_id (FK)       │                                                │

│  │ user\_id (FK)       │          ┌──────────────────────┐              │

│  │ rating (1-5)        │          │   DECK\_BOOKMARKS     │              │

│  │ review\_text        │          ├──────────────────────┤              │

│  │ created\_at           │          │ id (PK)              │              │

│  └───────────┘          │ user\_id (FK)         │              │

│                                                  │ deck\_id (FK)         │              │

│  ┌───────────┐          │ created\_at           │              │

│  │    REPORTS         │          └──────────────────────┘              │

│  ├────────────┤                                                │

│  │ id (PK)                     │               ┌──────────────────────┐              │

│  │ reporter\_id (FK)   │              │    AUDIT\_LOGS        │              │

│  │ target\_type             │              ├──────────────────────┤              │

│  │ (deck/user/card)   │            │ id (PK)              │              │

│  │ target\_id                  │              │ user\_id (FK)         │              │

│  │ reason                      │              │ action               │              │

│  │ description             │              │ target\_type          │              │

│  │ status                       │              │ target\_id            │              │

│  │ (pending/resolved) │          │ old\_data (JSON)      │              │

│  │ resolved\_by (FK)   │             │ new\_data (JSON)      │              │

│  │ created\_at               │              │ ip\_address           │              │

│  └────────────┘              │ created\_at           │              │

│                                                          └──────────────────────┘              │

│                                                                          │

└─────────────────────────────────────────────────────────────────────────┘

-----
1. # <a name="_toc225239623"></a>**KIẾN TRÚC HỆ THỐNG (SYSTEM ARCHITECTURE)**
   ┌─────────────────────────────────────────────────────────────────────────┐

   │                       SYSTEM ARCHITECTURE                                │

   ├─────────────────────────────────────────────────────────────────────────┤

   │                                                                          │

   │                         ┌──────────────────┐                            │

   │                         │   CLIENT LAYER   │                            │

   │                         │                  │                            │

   │              ┌──────────┼──────────────────┼──────────┐                │

   │              │          │                  │          │                │

   │          ┌───▼───┐  ┌───▼───┐   ┌────▼────┐  ┌──▼───┐              │

   │          │  Web  │  │  PWA  │   │ Mobile  │  │Admin │              │

   │          │Browser│  │       │   │ (future)│  │Panel │              │

   │          │React/ │  │Service│   │React    │  │React │              │

   │          │Next.js│  │Worker │   │Native   │  │      │              │

   │          └───┬───┘  └───┬───┘   └────┬────┘  └──┬───┘              │

   │              │          │            │           │                    │

   │              └──────────┼────────────┼───────────┘                    │

   │                         │            │                                 │

   │                         ▼            ▼                                 │

   │               ┌─────────────────────────────┐                         │

   │               │      CDN (CloudFlare)       │                         │

   │               │   Static Assets / Cache     │                         │

   │               └──────────────┬──────────────┘                         │

   │                              │                                         │

   │                              ▼                                         │

   │               ┌─────────────────────────────┐                         │

   │               │     LOAD BALANCER (Nginx)   │                         │

   │               └──────────────┬──────────────┘                         │

   │                              │                                         │

   │  ┌───────────────────────────┼───────────────────────────┐            │

   │  │                    API GATEWAY                         │            │

   │  │              ┌────────────┼────────────┐              │            │

   │  │              │            │            │              │            │

   │  │    ┌─────────▼──┐  ┌─────▼─────┐  ┌──▼──────────┐  │            │

   │  │    │Rate Limiter│  │   Auth    │  │  Request     │  │            │

   │  │    │            │  │Middleware │  │  Validation  │  │            │

   │  │    └─────────┬──┘  └─────┬─────┘  └──┬──────────┘  │            │

   │  │              └────────────┼───────────┘              │            │

   │  └───────────────────────────┼───────────────────────────┘            │

   │                              │                                         │

   │  ┌───────────────────────────┼───────────────────────────┐            │

   │  │               BACKEND SERVICES                         │            │

   │  │                           │                            │            │

   │  │  ┌────────────┐ ┌────────▼───────┐ ┌──────────────┐  │            │

   │  │  │ Auth       │ │  Flashcard     │ │  SRS          │  │            │

   │  │  │ Service    │ │  Service       │ │  Service      │  │            │

   │  │  │            │ │                │ │  (Algorithm)  │  │            │

   │  │  └────────────┘ └────────────────┘ └──────────────┘  │            │

   │  │                                                        │            │

   │  │  ┌────────────┐ ┌────────────────┐ ┌──────────────┐  │            │

   │  │  │ Game       │ │  Test          │ │  Notification │  │            │

   │  │  │ Service    │ │  Service       │ │  Service      │  │            │

   │  │  └────────────┘ └────────────────┘ └──────────────┘  │            │

   │  │                                                        │            │

   │  │  ┌────────────┐ ┌────────────────┐ ┌──────────────┐  │            │

   │  │  │ User       │ │  Classroom     │ │  i18n         │  │            │

   │  │  │ Service    │ │  Service       │ │  Service      │  │            │

   │  │  └────────────┘ └────────────────┘ └──────────────┘  │            │

   │  │                                                        │            │

   │  │  ┌────────────┐ ┌────────────────┐                    │            │

   │  │  │ Admin      │ │  Analytics     │                    │            │

   │  │  │ Service    │ │  Service       │                    │            │

   │  │  └────────────┘ └────────────────┘                    │            │

   │  └───────────────────────────┬───────────────────────────┘            │

   │                              │                                         │

   │  ┌───────────────────────────┼───────────────────────────┐            │

   │  │                DATA LAYER │                            │            │

   │  │              ┌────────────┼────────────┐              │            │

   │  │              │            │            │              │            │

   │  │    ┌─────────▼──┐  ┌─────▼─────┐  ┌──▼──────────┐  │            │

   │  │    │ PostgreSQL │  │   Redis   │  │   AWS S3     │  │            │

   │  │    │ (Primary   │  │  (Cache + │  │  (Files,     │  │            │

   │  │    │  Database) │  │  Session +│  │  Images,     │  │            │

   │  │    │            │  │  Queue)   │  │  Audio)      │  │            │

   │  │    └────────────┘  └───────────┘  └──────────────┘  │            │

   │  └───────────────────────────────────────────────────────┘            │

   │                                                                        │

   │  ┌────────────────────────────────────────────────────────┐           │

   │  │               BACKGROUND SERVICES                       │           │

   │  │                                                         │           │

   │                                                                         │

   │  ┌──────────────────┐  ┌──────────────────┐  ┌──────────────────┐    │

   │  │ CRON SCHEDULER   │  │ QUEUE WORKER     │  │ WEBSOCKET        │    │

   │  ├──────────────────┤  ├──────────────────┤  ├──────────────────┤    │

   │  │                  │  │                  │  │                  │    │

   │  │ • Check cards    │  │ • Send emails    │  │ • Real-time      │    │

   │  │   due for review │  │ • Push notif.    │  │   notifications  │    │

   │  │   (mỗi 15 phút) │  │ • Process CSV    │  │ • Live game      │    │

   │  │                  │  │   import         │  │   multiplayer    │    │

   │  │ • Update streak  │  │ • Generate       │  │ • Leaderboard    │    │

   │  │   (00:00 daily)  │  │   test questions │  │   updates        │    │

   │  │                  │  │ • Audio/Image    │  │                  │    │

   │  │ • Leaderboard    │  │   processing     │  │                  │    │

   │  │   recalculation  │  │ • Report export  │  │                  │    │

   │  │   (mỗi 1 giờ)   │  │                  │  │                  │    │

   │  │                  │  │                  │  │                  │    │

   │  │ • Clean expired  │  │                  │  │                  │    │

   │  │   sessions       │  │                  │  │                  │    │

   │  │   (daily)        │  │                  │  │                  │    │

   │  │                  │  │                  │  │                  │    │

   │  │ • Daily stats    │  │                  │  │                  │    │

   │  │   aggregation    │  │                  │  │                  │    │

   │  └──────────────────┘  └──────────────────┘  └──────────────────┘    │

   │                                                                         │

   │  ┌──────────────────────────────────────────────────────────────┐     │

   │  │                    EXTERNAL SERVICES                          │     │

   │  │                                                               │     │

   │  │  ┌────────────┐ ┌────────────┐ ┌────────────┐ ┌──────────┐ │     │

   │  │  │ SendGrid / │ │ Firebase   │ │ Google     │ │ Text-to- │ │     │

   │  │  │ Mailgun    │ │ Cloud      │ │ OAuth /    │ │ Speech   │ │     │

   │  │  │ (Email)    │ │ Messaging  │ │ Facebook   │ │ API      │ │     │

   │  │  │            │ │ (Push)     │ │ OAuth      │ │ (Audio)  │ │     │

   │  │  └────────────┘ └────────────┘ └────────────┘ └──────────┘ │     │

   │  │                                                               │     │

   │  │  ┌────────────┐ ┌────────────┐ ┌────────────┐              │     │

   │  │  │ Cloudinary │ │ Dictionary │ │ Sentry     │              │     │

   │  │  │ (Image     │ │ API        │ │ (Error     │              │     │

   │  │  │ processing)│ │ (Auto-fill │ │ tracking)  │              │     │

   │  │  │            │ │ word data) │ │            │              │     │

   │  │  └────────────┘ └────────────┘ └────────────┘              │     │

   │  └──────────────────────────────────────────────────────────────┘     │

   │                                                                         │

   └────────────────────────────────────────────────────────────────────────┘

   -----
1. # <a name="_toc225239624"></a>**TECH STACK ĐỀ XUẤT**
   ┌─────────────────────────────────────────────────────────────────────┐

   │                        TECH STACK                                    │

   ├──────────────┬──────────────────────────────────────────────────────┤

   │              │                                                       │

   │  FRONTEND    │  ┌─────────────────────────────────────────────┐     │

   │              │  │ • Framework: Next.js 14 (React)             │     │

   │              │  │ • Language: TypeScript                       │     │

   │              │  │ • UI Library: Tailwind CSS + shadcn/ui      │     │

   │              │  │ • State Management: Zustand / Redux Toolkit │     │

   │              │  │ • i18n: next-intl / react-i18next           │     │

   │              │  │ • Animation: Framer Motion (card flip)      │     │

   │              │  │ • Charts: Recharts / Chart.js               │     │

   │              │  │ • Real-time: Socket.io client               │     │

   │              │  │ • PWA: next-pwa (offline + push notif)      │     │

   │              │  │ • Form: React Hook Form + Zod validation    │     │

   │              │  │ • Drag & Drop: dnd-kit (game interactions)  │     │

   │              │  │ • Swipe: react-tinder-card (sprint game)    │     │

   │              │  └─────────────────────────────────────────────┘     │

   │              │                                                       │

   ├──────────────┼──────────────────────────────────────────────────────┤

   │              │                                                       │

   │  BACKEND     │  ┌─────────────────────────────────────────────┐     │

   │              │  │ • Runtime: Node.js 20 LTS                   │     │

   │              │  │ • Framework: NestJS (hoặc Express.js)       │     │

   │              │  │ • Language: TypeScript                       │     │

   │              │  │ • ORM: Prisma / TypeORM                     │     │

   │              │  │ • Auth: Passport.js + JWT                   │     │

   │              │  │ • Validation: class-validator + class-       │     │

   │              │  │   transformer                               │     │

   │              │  │ • API Docs: Swagger / OpenAPI                │     │

   │              │  │ • Queue: Bull (Redis-based job queue)       │     │

   │              │  │ • Scheduler: node-cron / @nestjs/schedule   │     │

   │              │  │ • WebSocket: Socket.io                      │     │

   │              │  │ • File Upload: Multer + S3 SDK              │     │

   │              │  │ • Email: Nodemailer + SendGrid              │     │

   │              │  │ • Rate Limit: express-rate-limit            │     │

   │              │  └─────────────────────────────────────────────┘     │

   │              │                                                       │

   ├──────────────┼──────────────────────────────────────────────────────┤

   │              │                                                       │

   │  DATABASE    │  ┌─────────────────────────────────────────────┐     │

   │  & CACHE     │  │ • Primary DB: PostgreSQL 16                 │     │

   │              │  │ • Cache + Session: Redis 7                  │     │

   │              │  │ • Search (optional): Elasticsearch          │     │

   │              │  │   (full-text search cho từ vựng)            │     │

   │              │  │ • Migration: Prisma Migrate                 │     │

   │              │  │ • Seed Data: Custom seeders                 │     │

   │              │  └─────────────────────────────────────────────┘     │

   │              │                                                       │

   ├──────────────┼──────────────────────────────────────────────────────┤

   │              │                                                       │

   │  STORAGE     │  ┌─────────────────────────────────────────────┐     │

   │              │  │ • File Storage: AWS S3 / MinIO              │     │

   │              │  │ • Image CDN: Cloudinary / CloudFront        │     │

   │              │  │ • Audio Files: S3 + CloudFront              │     │

   │              │  └─────────────────────────────────────────────┘     │

   │              │                                                       │

   ├──────────────┼──────────────────────────────────────────────────────┤

   │              │                                                       │

   │  DEVOPS      │  ┌─────────────────────────────────────────────┐     │

   │              │  │ • Containerization: Docker + Docker Compose │     │

   │              │  │ • CI/CD: GitHub Actions                     │     │

   │              │  │ • Hosting: AWS EC2 / Vercel (FE) +          │     │

   │              │  │   Railway / Render (BE)                     │     │

   │              │  │ • Monitoring: Sentry + Grafana              │     │

   │              │  │ • Logging: Winston + ELK Stack              │     │

   │              │  │ • SSL: Let's Encrypt / CloudFlare           │     │

   │              │  └─────────────────────────────────────────────┘     │

   │              │                                                       │

   ├──────────────┼──────────────────────────────────────────────────────┤

   │              │                                                       │

   │  TESTING     │  ┌─────────────────────────────────────────────┐     │

   │              │  │ • Unit Test: Jest                           │     │

   │              │  │ • Integration Test: Supertest               │     │

   │              │  │ • E2E Test: Playwright / Cypress            │     │

   │              │  │ • API Test: Postman / Insomnia              │     │

   │              │  │ • Coverage Target: > 80%                    │     │

   │              │  └─────────────────────────────────────────────┘     │

   │              │                                                       │

   └──────────────┴──────────────────────────────────────────────────────┘

   -----
1. # <a name="_toc225239625"></a>**API ENDPOINTS DESIGN**
1. ## <a name="_toc225239626"></a>**Authentication APIs**
┌─────────────────────────────────────────────────────────────────────┐

│                    AUTH ENDPOINTS                                     │

├──────────┬──────────────────────────────┬───────────────────────────┤

│  Method  │  Endpoint                    │  Description              │

├──────────┼──────────────────────────────┼───────────────────────────┤

│  POST    │ /api/v1/auth/register        │ Đăng ký tài khoản        │

│  POST    │ /api/v1/auth/login           │ Đăng nhập                │

│  POST    │ /api/v1/auth/logout          │ Đăng xuất                │

│  POST    │ /api/v1/auth/refresh-token   │ Refresh JWT token        │

│  POST    │ /api/v1/auth/forgot-password │ Quên mật khẩu           │

│  POST    │ /api/v1/auth/reset-password  │ Reset mật khẩu          │

│  POST    │ /api/v1/auth/verify-email    │ Xác thực email           │

│  POST    │ /api/v1/auth/google          │ Login Google OAuth       │

│  POST    │ /api/v1/auth/facebook        │ Login Facebook OAuth     │

│  POST    │ /api/v1/auth/change-password │ Đổi mật khẩu            │

│  GET     │ /api/v1/auth/me              │ Lấy thông tin user       │

│  GET     │ /api/v1/auth/sessions        │ Danh sách sessions       │

│  DELETE  │ /api/v1/auth/sessions/:id    │ Xóa session cụ thể      │

└──────────┴──────────────────────────────┴───────────────────────────┘
1. ## <a name="_toc225239627"></a>**User & Profile APIs**
┌─────────────────────────────────────────────────────────────────────┐

│                    USER ENDPOINTS                                    │

├──────────┬──────────────────────────────┬───────────────────────────┤

│  Method  │  Endpoint                    │  Description              │

├──────────┼──────────────────────────────┼───────────────────────────┤

│  GET     │ /api/v1/users/profile        │ Xem profile cá nhân      │

│  PUT     │ /api/v1/users/profile        │ Cập nhật profile         │

│  PUT     │ /api/v1/users/avatar         │ Upload avatar            │

│  GET     │ /api/v1/users/settings       │ Lấy cài đặt             │

│  PUT     │ /api/v1/users/settings       │ Cập nhật cài đặt        │

│  GET     │ /api/v1/users/stats          │ Thống kê cá nhân        │

│  GET     │ /api/v1/users/stats/daily    │ Thống kê theo ngày      │

│  GET     │ /api/v1/users/stats/heatmap  │ Dữ liệu heatmap        │

│  GET     │ /api/v1/users/achievements   │ Danh sách achievements  │

│  GET     │ /api/v1/users/streak         │ Thông tin streak        │

│  DELETE  │ /api/v1/users/account        │ Xóa tài khoản           │

└──────────┴──────────────────────────────┴───────────────────────────┘
1. ## <a name="_toc225239628"></a>**Flashcard & Deck APIs**
┌─────────────────────────────────────────────────────────────────────┐

│                    DECK ENDPOINTS                                    │

├──────────┬──────────────────────────────────┬───────────────────────┤

│  Method  │  Endpoint                        │  Description          │

├──────────┼──────────────────────────────────┼───────────────────────┤

│  GET     │ /api/v1/decks                    │ Danh sách decks      │

│  POST    │ /api/v1/decks                    │ Tạo deck mới         │

│  GET     │ /api/v1/decks/:id               │ Chi tiết deck        │

│  PUT     │ /api/v1/decks/:id               │ Cập nhật deck        │

│  DELETE  │ /api/v1/decks/:id               │ Xóa deck             │

│  POST    │ /api/v1/decks/:id/clone         │ Clone deck           │

│  GET     │ /api/v1/decks/:id/share         │ Lấy link chia sẻ    │

│  POST    │ /api/v1/decks/:id/rate          │ Đánh giá deck        │

│  POST    │ /api/v1/decks/:id/bookmark      │ Bookmark deck        │

│  DELETE  │ /api/v1/decks/:id/bookmark      │ Bỏ bookmark          │

│  POST    │ /api/v1/decks/:id/report        │ Báo cáo vi phạm     │

│  POST    │ /api/v1/decks/import            │ Import CSV/Excel     │

│  GET     │ /api/v1/decks/public            │ Decks công khai      │

│  GET     │ /api/v1/decks/bookmarked        │ Decks đã bookmark    │

├──────────┼──────────────────────────────────┼───────────────────────┤

│          │  CARD ENDPOINTS                  │                       │

├──────────┼──────────────────────────────────┼───────────────────────┤

│  GET     │ /api/v1/decks/:id/cards         │ DS cards trong deck  │

│  POST    │ /api/v1/decks/:id/cards         │ Thêm card vào deck   │

│  GET     │ /api/v1/cards/:id               │ Chi tiết card        │

│  PUT     │ /api/v1/cards/:id               │ Sửa card             │

│  DELETE  │ /api/v1/cards/:id               │ Xóa card             │

│  POST    │ /api/v1/decks/:id/cards/bulk    │ Thêm nhiều cards     │

└──────────┴──────────────────────────────────┴──────────────────────┘
1. ## <a name="_toc225239629"></a>**SRS & Learning APIs**
┌─────────────────────────────────────────────────────────────────────┐

│                    LEARNING / SRS ENDPOINTS                          │

├──────────┬──────────────────────────────────┬───────────────────────┤

│  Method  │  Endpoint                        │  Description          │

├──────────┼──────────────────────────────────┼───────────────────────┤

│  GET     │ /api/v1/learn/decks/:id/session  │ Bắt đầu phiên học   │

│  POST    │ /api/v1/learn/cards/:id/review   │ Ghi nhận review      │

│          │                                   │ (rating: again/hard  │

│          │                                   │  /good/easy)         │

│  GET     │ /api/v1/learn/due-cards          │ Cards đến hạn ôn    │

│  GET     │ /api/v1/learn/due-cards/count    │ Số cards cần ôn     │

│  GET     │ /api/v1/learn/progress           │ Tiến độ tổng        │

│  GET     │ /api/v1/learn/progress/:deckId   │ Tiến độ theo deck   │

│  GET     │ /api/v1/learn/leitner-boxes      │ Trạng thái hộp      │

│  POST    │ /api/v1/learn/session/complete   │ Kết thúc phiên học  │

│  GET     │ /api/v1/learn/history            │ Lịch sử học tập     │

│  PUT     │ /api/v1/learn/srs-settings       │ Cài đặt SRS cá nhân│

└──────────┴──────────────────────────────────┴─────────────────────┘
1. ## <a name="_toc225239630"></a>**Game & Test APIs**
┌─────────────────────────────────────────────────────────────────────┐

│                    GAME ENDPOINTS                                    │

├──────────┬──────────────────────────────────┬───────────────────────┤

│  Method  │  Endpoint                        │  Description          │

├──────────┼──────────────────────────────────┼───────────────────────┤

│  POST    │ /api/v1/games/start              │ Bắt đầu game         │

│          │                                   │ {gameType, deckId,   │

│          │                                   │  difficulty}         │

│  POST    │ /api/v1/games/:sessionId/answer  │ Gửi câu trả lời     │

│  POST    │ /api/v1/games/:sessionId/end     │ Kết thúc game        │

│  GET     │ /api/v1/games/history            │ Lịch sử chơi game   │

│  GET     │ /api/v1/games/leaderboard        │ Bảng xếp hạng       │

│  GET     │ /api/v1/games/daily-challenge    │ Thử thách hàng ngày │

├──────────┼──────────────────────────────────┼───────────────────────┤

│          │  TEST ENDPOINTS                   │                       │

├──────────┼──────────────────────────────────┼───────────────────────┤

│  GET     │ /api/v1/tests                    │ DS bài test          │

│  POST    │ /api/v1/tests                    │ Tạo test (GV)        │

│  GET     │ /api/v1/tests/:id               │ Chi tiết test        │

│  PUT     │ /api/v1/tests/:id               │ Sửa test (GV)        │

│  DELETE  │ /api/v1/tests/:id               │ Xóa test (GV)        │

│  POST    │ /api/v1/tests/:id/start         │ Bắt đầu làm test    │

│  POST    │ /api/v1/tests/:id/submit        │ Nộp bài test         │

│  GET     │ /api/v1/tests/:id/result        │ Xem kết quả         │

│  GET     │ /api/v1/tests/:id/results       │ DS kết quả (GV)     │

│  POST    │ /api/v1/tests/auto-generate     │ Tự động tạo test    │

│  GET     │ /api/v1/tests/daily-quiz        │ Quiz hàng ngày      │

└──────────┴──────────────────────────────────┴───────────────────────┘
1. ## <a name="_toc225239631"></a>**Notification & Reminder APIs**
┌─────────────────────────────────────────────────────────────────────┐

│                    NOTIFICATION ENDPOINTS                             │

├──────────┬──────────────────────────────────────┬───────────────────┤

│  Method  │  Endpoint                            │  Description      │

├──────────┼──────────────────────────────────────┼───────────────────┤

│  GET     │ /api/v1/notifications                │ DS thông báo     │

│  GET     │ /api/v1/notifications/unread-count   │ Số chưa đọc     │

│  PUT     │ /api/v1/notifications/:id/read       │ Đánh dấu đã đọc│

│  PUT     │ /api/v1/notifications/read-all       │ Đọc tất cả      │

│  DELETE  │ /api/v1/notifications/:id            │ Xóa thông báo   │

│  GET     │ /api/v1/reminders                    │ Cài đặt nhắc nhở│

│  PUT     │ /api/v1/reminders                    │ Cập nhật nhắc   │

│  POST    │ /api/v1/notifications/subscribe-push │ Đăng ký push    │

└──────────┴──────────────────────────────────────┴──────────────────┘
1. ## <a name="_toc225239632"></a>**Teacher APIs**
┌─────────────────────────────────────────────────────────────────────┐

│                    TEACHER ENDPOINTS                                  │

├──────────┬──────────────────────────────────────┬───────────────────┤

│  Method  │  Endpoint                            │  Description      │

├──────────┼──────────────────────────────────────┼───────────────────┤

│  POST    │ /api/v1/teacher/apply                │ Gửi yêu cầu GV  │

│  GET     │ /api/v1/teacher/application-status   │ Trạng thái duyệt│

│  GET     │ /api/v1/teacher/classrooms           │ DS lớp học       │

│  POST    │ /api/v1/teacher/classrooms           │ Tạo lớp học     │

│  GET     │ /api/v1/teacher/classrooms/:id       │ Chi tiết lớp    │

│  PUT     │ /api/v1/teacher/classrooms/:id       │ Sửa lớp         │

│  DELETE  │ /api/v1/teacher/classrooms/:id       │ Xóa lớp         │

│  POST    │ /api/v1/teacher/classrooms/:id/      │ Giao deck       │

│          │   assign-deck                        │                   │

│  POST    │ /api/v1/teacher/classrooms/:id/      │ Giao test       │

│          │   assign-test                        │                   │

│  GET     │ /api/v1/teacher/classrooms/:id/      │ DS học sinh     │

│          │   students                           │                   │

│  GET     │ /api/v1/teacher/classrooms/:id/      │ Tiến độ HS      │

│          │   progress                           │                   │

│  DELETE  │ /api/v1/teacher/classrooms/:id/      │ Xóa HS khỏi lớp│

│          │   students/:studentId                │                   │

│  GET     │ /api/v1/teacher/stats                │ Thống kê GV     │

│  GET     │ /api/v1/teacher/stats/export         │ Xuất báo cáo    │

└──────────┴──────────────────────────────────────┴───────────────────┘
1. ## <a name="_toc225239633"></a>**Admin APIs**
┌─────────────────────────────────────────────────────────────────────┐

│                    ADMIN ENDPOINTS                                    │

├──────────┬──────────────────────────────────────┬───────────────────┤

│  Method  │  Endpoint                            │  Description      │

├──────────┼──────────────────────────────────────┼───────────────────┤

│          │  USER MANAGEMENT                     │                   │

│  GET     │ /api/v1/admin/users                  │ DS tất cả users  │

│  GET     │ /api/v1/admin/users/:id              │ Chi tiết user    │

│  PUT     │ /api/v1/admin/users/:id              │ Sửa user         │

│  PUT     │ /api/v1/admin/users/:id/role         │ Đổi role         │

│  PUT     │ /api/v1/admin/users/:id/ban          │ Ban user         │

│  PUT     │ /api/v1/admin/users/:id/unban        │ Unban user       │

│  DELETE  │ /api/v1/admin/users/:id              │ Xóa user         │

├──────────┼──────────────────────────────────────┼───────────────────┤

│          │  TEACHER APPROVAL                    │                   │

│  GET     │ /api/v1/admin/teacher-requests       │ DS yêu cầu GV   │

│  GET     │ /api/v1/admin/teacher-requests/:id   │ Chi tiết yêu cầu│

│  PUT     │ /api/v1/admin/teacher-requests/      │ Duyệt GV        │

│          │   :id/approve                        │                   │

│  PUT     │ /api/v1/admin/teacher-requests/      │ Từ chối GV      │

│          │   :id/reject                         │                   │

├──────────┼──────────────────────────────────────┼───────────────────┤

│          │  CONTENT MANAGEMENT                  │                   │

│  GET     │ /api/v1/admin/decks                  │ DS tất cả decks  │

│  PUT     │ /api/v1/admin/decks/:id/approve      │ Duyệt deck      │

│  DELETE  │ /api/v1/admin/decks/:id              │ Xóa deck        │

│  GET     │ /api/v1/admin/categories             │ DS danh mục     │

│  POST    │ /api/v1/admin/categories             │ Tạo danh mục    │

│  PUT     │ /api/v1/admin/categories/:id         │ Sửa danh mục    │

│  DELETE  │ /api/v1/admin/categories/:id         │ Xóa danh mục    │

│  GET     │ /api/v1/admin/tags                   │ DS tags         │

│  POST    │ /api/v1/admin/tags                   │ Tạo tag         │

│  DELETE  │ /api/v1/admin/tags/:id               │ Xóa tag         │

│  GET     │ /api/v1/admin/reports                │ DS báo cáo      │

│  PUT     │ /api/v1/admin/reports/:id/resolve    │ Xử lý báo cáo  │

├──────────┼──────────────────────────────────────┼───────────────────┤

│          │  I18N MANAGEMENT                     │                   │

│  GET     │ /api/v1/admin/languages              │ DS ngôn ngữ     │

│  POST    │ /api/v1/admin/languages              │ Thêm ngôn ngữ   │

│  PUT     │ /api/v1/admin/languages/:id          │ Sửa ngôn ngữ    │

│  DELETE  │ /api/v1/admin/languages/:id          │ Xóa ngôn ngữ    │

│  GET     │ /api/v1/admin/translations           │ DS translations  │

│  PUT     │ /api/v1/admin/translations           │ Cập nhật batch  │

│  POST    │ /api/v1/admin/translations/import    │ Import file i18n │

│  GET     │ /api/v1/admin/translations/export    │ Export file i18n │

├──────────┼──────────────────────────────────────┼───────────────────┤

│          │  RBAC MANAGEMENT                     │                   │

│  GET     │ /api/v1/admin/roles                  │ DS roles         │

│  POST    │ /api/v1/admin/roles                  │ Tạo role         │

│  PUT     │ /api/v1/admin/roles/:id              │ Sửa role         │

│  DELETE  │ /api/v1/admin/roles/:id              │ Xóa role         │

│  GET     │ /api/v1/admin/permissions            │ DS permissions   │

│  PUT     │ /api/v1/admin/roles/:id/permissions  │ Gán permissions  │

├──────────┼──────────────────────────────────────┼───────────────────┤

│          │  SYSTEM CONFIG                       │                   │

│  GET     │ /api/v1/admin/config                 │ Lấy cấu hình    │

│  PUT     │ /api/v1/admin/config                 │ Cập nhật cấu hình│

│  GET     │ /api/v1/admin/feature-flags          │ DS feature flags │

│  PUT     │ /api/v1/admin/feature-flags/:key     │ Toggle feature   │

├──────────┼──────────────────────────────────────┼───────────────────┤

│          │  DASHBOARD & ANALYTICS               │                   │

│  GET     │ /api/v1/admin/dashboard              │ Dữ liệu overview │

│  GET     │ /api/v1/admin/analytics/users        │ Thống kê users   │

│  GET     │ /api/v1/admin/analytics/content      │ Thống kê content │

│  GET     │ /api/v1/admin/analytics/games        │ Thống kê games   │

│  GET     │ /api/v1/admin/analytics/export       │ Export báo cáo   │

│  GET     │ /api/v1/admin/audit-logs             │ DS audit logs    │

└──────────┴──────────────────────────────────────┴───────────────────┘
1. ## <a name="_toc225239634"></a>**Public & i18n APIs**
┌─────────────────────────────────────────────────────────────────────┐

│                    PUBLIC ENDPOINTS                                   │

├──────────┬──────────────────────────────────────┬───────────────────┤

│  Method  │  Endpoint                            │  Description      │

├──────────┼──────────────────────────────────────┼───────────────────┤

│  GET     │ /api/v1/public/decks                 │ Decks công khai  │

│  GET     │ /api/v1/public/decks/:id             │ Chi tiết deck    │

│  GET     │ /api/v1/public/categories            │ DS danh mục     │

│  GET     │ /api/v1/public/leaderboard           │ BXH công khai   │

│  GET     │ /api/v1/public/decks/:id/preview     │ Preview deck     │

│  GET     │ /api/v1/i18n/:locale                 │ Lấy file ngôn ngữ│

│  GET     │ /api/v1/i18n/languages               │ DS ngôn ngữ     │

│  GET     │ /api/v1/health                       │ Health check     │

└──────────┴──────────────────────────────────────┴───────────────────┘

-----
1. # <a name="_toc225239635"></a>**LUỒNG XỬ LÝ CHÍNH (MAIN FLOWS)**
1. ## <a name="_toc225239636"></a>**Luồng học Flashcard với SRS**
┌──────────────────────────────────────────────────────────────────────────┐

│                  LUỒNG HỌC FLASHCARD VỚI SRS                             │

├──────────────────────────────────────────────────────────────────────────┤

│                                                                           │

│  ┌──────────┐                                                            │

│  │  User    │                                                            │

│  │  chọn    │                                                            │

│  │  deck    │                                                            │

│  └────┬─────┘                                                            │

│       │                                                                   │

│       ▼                                                                   │

│  ┌──────────────────────────────────────────┐                            │

│  │  Hệ thống lấy cards cần học/ôn          │                            │

│  │  ┌────────────────────────────────────┐  │                            │

│  │  │  1. New Cards (chưa học)           │  │                            │

│  │  │     → Lấy theo giới hạn/ngày      │  │                            │

│  │  │     → Max: user.settings.newCards  │  │                            │

│  │  │                                    │  │                            │

│  │  │  2. Review Cards (đến hạn ôn)      │  │                            │

│  │  │     → WHERE next\_review\_date       │  │                            │

│  │  │       <= TODAY                     │  │                            │

│  │  │                                    │  │                            │

│  │  │  3. Trộn theo thứ tự ưu tiên      │  │                            │

│  │  │     → Overdue > Due > New          │  │                            │

│  │  └────────────────────────────────────┘  │                            │

│  └──────────────────┬───────────────────────┘                            │

│                     │                                                     │

│                     ▼                                                     │

│  ┌──────────────────────────────────────────┐                            │

│  │         HIỂN THỊ FLASHCARD               │                            │

│  │                                          │                            │

│  │  ┌────────────────────────────────────┐  │                            │

│  │  │       MẶT TRƯỚC (Front)            │  │                            │

│  │  │                                    │  │                            │

│  │  │    📝 "Accomplish"                 │  │                            │

│  │  │    🔊 /əˈkɑːm.plɪʃ/              │  │                            │

│  │  │    🖼️  [Hình ảnh]                  │  │                            │

│  │  │                                    │  │                            │

│  │  │    [👆 Tap để lật thẻ]             │  │                            │

│  │  └────────────────────────────────────┘  │                            │

│  │                   │                      │                            │

│  │                   ▼ (User tap)           │                            │

│  │  ┌────────────────────────────────────┐  │                            │

│  │  │       MẶT SAU (Back)               │  │                            │

│  │  │                                    │  │                            │

│  │  │    📖 Verb - "Hoàn thành"          │  │                            │

│  │  │    📝 "She accomplished her goal"  │  │                            │

│  │  │    🔗 Synonyms: achieve, complete  │  │                            │

│  │  │    📌 Note: Thường dùng formal     │  │                            │

│  │  │                                    │  │                            │

│  │  └────────────────────────────────────┘  │                            │

│  └──────────────────┬───────────────────────┘                            │

│                     │                                                     │

│                     ▼                                                     │

│  ┌──────────────────────────────────────────┐                            │

│  │         USER TỰ ĐÁNH GIÁ                │                            │

│  │                                          │                            │

│  │  ┌────────┐ ┌────────┐ ┌──────┐ ┌─────┐│                            │

│  │  │😫 Again│ │😐 Hard │ │🙂Good│ │😄Easy││                            │

│  │  │ <1min  │ │  6min  │ │ 10min│ │ 4day ││                            │

│  │  └───┬────┘ └───┬────┘ └──┬───┘ └──┬──┘│                            │

│  │      │          │         │        │    │                            │

│  └──────┼──────────┼─────────┼────────┼────┘                            │

│         │          │         │        │                                   │

│         ▼          ▼         ▼        ▼                                   │

│  ┌──────────────────────────────────────────┐                            │

│  │         SRS ALGORITHM TÍNH TOÁN          │                            │

│  │                                          │                            │

│  │  Input:                                  │                            │

│  │  ├── rating (0-3)                        │                            │

│  │  ├── current ease\_factor                 │                            │

│  │  ├── current interval                    │                            │

│  │  └── current repetitions                 │                            │

│  │                                          │                            │

│  │  ┌────────────────────────────────────┐  │                            │

│  │  │  IF rating = Again (0):            │  │                            │

│  │  │    repetitions = 0                 │  │                            │

│  │  │    interval = 1 (phút)             │  │                            │

│  │  │    ease\_factor -= 0.2              │  │                            │

│  │  │    status = "learning"             │  │                            │

│  │  │                                    │  │                            │

│  │  │  IF rating = Hard (1):             │  │                            │

│  │  │    interval \*= 1.2                 │  │                            │

│  │  │    ease\_factor -= 0.15             │  │                            │

│  │  │                                    │  │                            │

│  │  │  IF rating = Good (2):             │  │                            │

│  │  │    IF repetitions = 0:             │  │                            │

│  │  │      interval = 1 (ngày)           │  │                            │

│  │  │    ELIF repetitions = 1:           │  │                            │

│  │  │      interval = 6 (ngày)           │  │                            │

│  │  │    ELSE:                           │  │                            │

│  │  │      interval \*= ease\_factor       │  │                            │

│  │  │    repetitions += 1                │  │                            │

│  │  │                                    │  │                            │

│  │  │  IF rating = Easy (3):             │  │                            │

│  │  │    interval \*= ease\_factor \* 1.3   │  │                            │

│  │  │    ease\_factor += 0.15             │  │                            │

│  │  │    repetitions += 1                │  │                            │

│  │  │                                    │  │                            │

│  │  │  ease\_factor = MAX(1.3, ease\_factor)│  │                            │

│  │  │  next\_review\_date = NOW + interval │  │                            │

│  │  └────────────────────────────────────┘  │                            │

│  │                                          │                            │

│  │  Output:                                 │                            │

│  │  ├── new ease\_factor                     │                            │

│  │  ├── new interval                        │                            │

│  │  ├── new repetitions                     │                            │

│  │  ├── next\_review\_date                    │                            │

│  │  └── leitner\_box (updated)               │                            │

│  └──────────────────┬───────────────────────┘                            │

│                     │                                                     │

│                     ▼                                                     │

│  ┌──────────────────────────────────────────┐                            │

│  │         LƯU KẾT QUẢ                     │                            │

│  │                                          │                            │

│  │  ├── Cập nhật user\_card\_progress         │                            │

│  │  ├── Tạo review\_log mới                  │                            │

│  │  ├── Cập nhật user\_daily\_stats           │                            │

│  │  ├── Cộng XP cho user                    │                            │

│  │  ├── Kiểm tra achievements               │                            │

│  │  └── Cập nhật streak                     │                            │

│  └──────────────────┬───────────────────────┘                            │

│                     │                                                     │

│                     ▼                                                     │

│           ┌─────────────────┐                                            │

│           │ Card tiếp theo? │                                            │

│           └────┬───────┬────┘                                            │

│           YES  │       │  NO                                             │

│           ┌────▼─┐  ┌──▼──────────────────┐                             │

│           │ Quay │  │ SESSION SUMMARY      │                             │

│           │ lại  │  │ ├── Cards studied: 25│                             │

│           │ hiển │  │ ├── Correct: 20      │                             │

│           │ thị  │  │ ├── Time: 15 min     │                             │

│           │ card │  │ ├── XP earned: +120  │                             │

│           └──────┘  │ └── Next review: 3h  │                             │

│                     └─────────────────────┘                              │

│                                                                           │

└──────────────────────────────────────────────────────────────────────────┘
1. ## <a name="_toc225239637"></a>**Luồng nhắc nhở theo chu kỳ**
┌──────────────────────────────────────────────────────────────────────────┐

│                  LUỒNG NHẮC NHỞ THEO CHU KỲ                              │

├──────────────────────────────────────────────────────────────────────────┤

│                                                                           │

│                    ┌──────────────────────┐                               │

│                    │    CRON SCHEDULER    │                               │

│                    │  (Chạy mỗi 15 phút) │                               │

│                    └──────────┬───────────┘                               │

│                               │                                           │

│                               ▼                                           │

│              ┌────────────────────────────────┐                          │

│              │  BƯỚC 1: Lấy thời gian hiện tại│                          │

│              │  theo từng timezone             │                          │

│              │  (UTC → User's timezone)        │                          │

│              └────────────────┬───────────────┘                          │

│                               │                                           │

│                               ▼                                           │

│              ┌────────────────────────────────┐                          │

│              │  BƯỚC 2: Query users cần nhắc  │                          │

│              │                                 │                          │

│              │  WHERE:                         │                          │

│              │  ├── reminder.is\_enabled = true │                          │

│              │  ├── reminder.remind\_time       │                          │

│              │  │   BETWEEN (now - 15m, now)   │                          │

│              │  ├── TODAY in remind\_days[]      │                          │

│              │  └── NOT already\_notified\_today │                          │

│              └────────────────┬───────────────┘                          │

│                               │                                           │

│                               ▼                                           │

│              ┌────────────────────────────────┐                          │

│              │  BƯỚC 3: Với mỗi user,         │                          │

│              │  kiểm tra loại nhắc nhở        │                          │

│              └────────────────┬───────────────┘                          │

│                               │                                           │

│           ┌───────────────────┼───────────────────┐                      │

│           │                   │                   │                      │

│           ▼                   ▼                   ▼                      │

│  ┌────────────────┐ ┌────────────────┐ ┌─────────────────┐             │

│  │ REVIEW REMIND  │ │ STREAK REMIND  │ │ DAILY QUIZ      │             │

│  │                │ │                │ │ REMIND           │             │

│  │ Đếm cards due: │ │ Check streak:  │ │                  │             │

│  │ SELECT COUNT   │ │ IF last\_activity│ │ Check đã làm   │             │

│  │ WHERE next\_    │ │ = yesterday    │ │ daily quiz      │             │

│  │ review\_date    │ │ AND streak > 3 │ │ chưa?           │             │

│  │ <= TODAY       │ │                │ │                  │             │

│  │                │ │ → "Đừng mất   │ │ → "Quiz hàng    │             │

│  │ IF count > 0:  │ │   streak!"    │ │   ngày đang     │             │

│  │ → "Bạn có     │ │                │ │   chờ bạn!"     │             │

│  │   {count} cards│ │                │ │                  │             │

│  │   cần ôn!"    │ │                │ │                  │             │

│  └───────┬────────┘ └───────┬────────┘ └────────┬────────┘             │

│          │                  │                    │                       │

│          └──────────────────┼────────────────────┘                       │

│                             │                                            │

│                             ▼                                            │

│              ┌────────────────────────────────┐                          │

│              │  BƯỚC 4: Tạo Notification      │                          │

│              │  record trong DB                │                          │

│              └────────────────┬───────────────┘                          │

│                               │                                           │

│                               ▼                                           │

│              ┌────────────────────────────────┐                          │

│              │  BƯỚC 5: Gửi qua các kênh      │                          │

│              │  theo user preference           │                          │

│              └────────────────┬───────────────┘                          │

│                               │                                           │

│           ┌───────────────────┼───────────────────┐                      │

│           │                   │                   │                      │

│           ▼                   ▼                   ▼                      │

│  ┌────────────────┐ ┌────────────────┐ ┌─────────────────┐             │

│  │   IN-APP       │ │   EMAIL        │ │   PUSH          │             │

│  │   NOTIFICATION │ │                │ │   NOTIFICATION   │             │

│  │                │ │ Queue job →    │ │                  │             │

│  │ WebSocket →    │ │ SendGrid /     │ │ Queue job →      │             │

│  │ Real-time      │ │ Mailgun →      │ │ Firebase FCM →   │             │

│  │ push to        │ │ Render email   │ │ Browser push     │             │

│  │ browser        │ │ template →     │ │ notification     │             │

│  │                │ │ Send           │ │                  │             │

│  └────────────────┘ └────────────────┘ └─────────────────┘             │

│                                                                           │

│  📌 Email Template Example:                                              │

│  ┌────────────────────────────────────────────────────┐                  │

│  │  Subject: 🔔 Bạn có 25 thẻ cần ôn tập hôm nay!   │                  │

│  │                                                     │                  │

│  │  Xin chào {{display\_name}},                        │                  │

│  │                                                     │                  │

│  │  🔥 Streak hiện tại: 15 ngày                       │                  │

│  │  📚 Cards cần ôn: 25                               │                  │

│  │  📝 Cards mới hôm nay: 10                          │                  │

│  │                                                     │                  │

│  │  [  Bắt đầu học ngay  ]  ← CTA Button             │                  │

│  │                                                     │                  │

│  │  Tip: Ôn tập đều đặn giúp nhớ từ lâu hơn 3x!     │                  │

│  └────────────────────────────────────────────────────┘                  │

│                                                                           │

└──────────────────────────────────────────────────────────────────────────┘
1. ## <a name="_toc225239638"></a>**Luồng chơi Mini Game (Matching Pairs)**
┌──────────────────────────────────────────────────────────────────────────┐

│               LUỒNG CHƠI MINI GAME - MATCHING PAIRS                      │

├──────────────────────────────────────────────────────────────────────────┤

│                                                                           │

│  ┌───────────┐    ┌─────────────────┐    ┌──────────────────┐           │

│  │ User chọn │───▶│ Chọn deck &     │───▶│ Chọn difficulty  │           │

│  │ Game type │    │ số lượng cards   │    │ Easy/Medium/Hard │           │

│  │ "Matching"│    │ (6/8/10/12 cặp) │    │                  │           │

│  └───────────┘    └─────────────────┘    └────────┬─────────┘           │

│                                                    │                      │

│                                                    ▼                      │

│  ┌──────────────────────────────────────────────────────────────┐       │

│  │  BACKEND: Khởi tạo Game Session                              │       │

│  │                                                               │       │

│  │  1. Tạo game\_session record                                  │       │

│  │  2. Random chọn N cards từ deck                              │       │

│  │  3. Tạo 2 cột:                                               │       │

│  │     ├── Cột A: Từ vựng (shuffle)                             │       │

│  │     └── Cột B: Nghĩa (shuffle khác)                         │       │

│  │  4. Tính thời gian theo difficulty:                          │       │

│  │     ├── Easy: 120s (6 cặp)                                  │       │

│  │     ├── Medium: 90s (8 cặp)                                 │       │

│  │     └── Hard: 60s (12 cặp)                                  │       │

│  │  5. Trả về game data cho Frontend                            │       │

│  └──────────────────────────┬───────────────────────────────────┘       │

│                              │                                           │

│                              ▼                                           │

│  ┌──────────────────────────────────────────────────────────────┐       │

│  │  FRONTEND: Hiển thị Game Board                               │       │

│  │                                                               │       │

│  │  ┌───────── CỘT A ─────────┐  ┌───────── CỘT B ─────────┐ │       │

│  │  │                          │  │                          │ │       │

│  │  │  ┌─────────────────┐    │  │    ┌─────────────────┐   │ │       │

│  │  │  │  🟦 Accomplish  │◄───┼──┼───►│  🟧 Hoàn thành  │   │ │       │

│  │  │  ├─────────────────┤    │  │    ├─────────────────┤   │ │       │

│  │  │  │  🟦 Determine   │    │  │    │  🟧 Đạt được    │   │ │       │

│  │  │  ├─────────────────┤    │  │    ├─────────────────┤   │ │       │

│  │  │  │  🟦 Achieve     │    │  │    │  🟧 Quyết định  │   │ │       │

│  │  │  ├─────────────────┤    │  │    ├─────────────────┤   │ │       │

│  │  │  │  🟦 Elaborate   │    │  │    │  🟧 Phức tạp    │   │ │       │

│  │  │  ├─────────────────┤    │  │    ├─────────────────┤   │ │       │

│  │  │  │  🟦 Perceive    │    │  │    │  🟧 Chi tiết    │   │ │       │

│  │  │  ├─────────────────┤    │  │    ├─────────────────┤   │ │       │

│  │  │  │  🟦 Intricate   │    │  │    │  🟧 Nhận thức   │   │ │       │

│  │  │  └─────────────────┘    │  │    └─────────────────┘   │ │       │

│  │  │                          │  │                          │ │       │

│  │  └──────────────────────────┘  └──────────────────────────┘ │       │

│  │                                                               │       │

│  │  ⏱️ Time: 01:45 / 02:00   🏆 Score: 450   💫 Combo: x3    │       │

│  │                                                               │       │

│  └──────────────────────────┬───────────────────────────────────┘       │

│                              │                                           │

│                              ▼                                           │

│  ┌──────────────────────────────────────────────────────────────┐       │

│  │  GAME LOGIC (Frontend)                                       │       │

│  │                                                               │       │

│  │  User click "Accomplish" (Cột A)                             │       │

│  │  → Highlight selected                                        │       │

│  │  User click "Hoàn thành" (Cột B)                            │       │

│  │  → Check match                                               │       │

│  │                                                               │       │

│  │  ┌─────────────┐              ┌──────────────┐              │       │

│  │  │  ✅ MATCH    │              │  ❌ NO MATCH  │              │       │

│  │  │             │              │              │              │       │

│  │  │ • Animation │              │ • Shake      │              │       │

│  │  │   fade out  │              │   animation  │              │       │

│  │  │ • +100 pts  │              │ • -20 pts    │              │       │

│  │  │ • Combo++   │              │ • Combo = 0  │              │       │

│  │  │ • Sound ✓   │              │ • Sound ✗    │              │       │

│  │  └──────┬──────┘              └──────┬───────┘              │       │

│  │         │                            │                       │       │

│  │         └────────────┬───────────────┘                       │       │

│  │                      │                                       │       │

│  │                      ▼                                       │       │

│  │         ┌─────────────────────┐                              │       │

│  │         │ All pairs matched?  │                              │       │

│  │         │ OR Time up?         │                              │       │

│  │         └──────────┬──────────┘                              │       │

│  │                    │ YES                                     │       │

│  └────────────────────┼─────────────────────────────────────────┘       │

│                       │                                                  │

│                       ▼                                                  │

│  ┌──────────────────────────────────────────────────────────────┐       │

│  │  GAME RESULT (POST to Backend)                               │       │

│  │                                                               │       │

│  │  ┌─────────────────────────────────────────────────────┐    │       │

│  │  │  🎮 GAME COMPLETE!                                   │    │       │

│  │  │                                                      │    │       │

│  │  │  🏆 Score: 1,250 pts         ⭐ New High Score!     │    │       │

│  │  │  ⏱️ Time: 01:23              💫 Max Combo: x5       │    │       │

│  │  │  ✅ Matched: 6/6             🎯 Accuracy: 85%       │    │       │

│  │  │  ⭐ XP Earned: +35                                   │    │       │

│  │  │                                                      │    │       │

│  │  │  📊 Leaderboard Rank: #42 (+5 ↑)                    │    │       │

│  │  │                                                      │    │       │

│  │  │  [ 🔄 Play Again ]  [ 🏠 Home ]  [ 📊 Ranking ]    │    │       │

│  │  └─────────────────────

│                                                                           │

│  BACKEND XỬ LÝ KẾT QUẢ GAME:                                           │

│                                                                           │

│  ┌──────────────────────────────────────────────────────────────┐       │

│  │  POST /api/v1/games/:sessionId/end                           │       │

│  │                                                               │       │

│  │  Request Body:                                                │       │

│  │  {                                                            │       │

│  │    "score": 1250,                                             │       │

│  │    "accuracy\_percent": 85,                                    │       │

│  │    "max\_combo": 5,                                            │       │

│  │    "duration\_seconds": 83,                                    │       │

│  │    "matched\_pairs": [                                         │       │

│  │      { "card\_id": 1, "correct": true, "time\_ms": 3200 },    │       │

│  │      { "card\_id": 2, "correct": true, "time\_ms": 5100 },    │       │

│  │      { "card\_id": 3, "correct": false, "time\_ms": 8400 }    │       │

│  │    ]                                                          │       │

│  │  }                                                            │       │

│  │                                                               │       │

│  │  Backend xử lý:                                               │       │

│  │  ├── 1. Lưu game\_session result                              │       │

│  │  ├── 2. Cộng XP cho user (+35 XP)                            │       │

│  │  ├── 3. Cập nhật user\_card\_progress                          │       │

│  │  │      (cards sai → giảm ease\_factor nhẹ)                   │       │

│  │  ├── 4. Cập nhật user\_daily\_stats.games\_played               │       │

│  │  ├── 5. Kiểm tra achievements mới                            │       │

│  │  ├── 6. Cập nhật leaderboard (Redis sorted set)              │       │

│  │  └── 7. Trả về response + achievements nếu có               │       │

│  └──────────────────────────────────────────────────────────────┘       │

│                                                                           │

└──────────────────────────────────────────────────────────────────────────┘
1. ## <a name="_toc225239639"></a>**Luồng Giáo viên gửi yêu cầu & Admin duyệt**
┌──────────────────────────────────────────────────────────────────────────┐

│            LUỒNG ĐĂNG KÝ GIÁO VIÊN & DUYỆT                              │

├──────────────────────────────────────────────────────────────────────────┤

│                                                                           │

│  PHASE 1: ĐĂNG KÝ TÀI KHOẢN                                            │

│  ┌─────────┐    ┌──────────────┐    ┌──────────────┐                    │

│  │ User    │───▶│ Đăng ký      │───▶│ Xác thực     │                    │

│  │ truy cập│    │ email +      │    │ email        │                    │

│  │ /register│    │ password     │    │ (click link) │                    │

│  └─────────┘    └──────────────┘    └──────┬───────┘                    │

│                                             │                            │

│                                             ▼                            │

│  PHASE 2: GỬI YÊU CẦU GIÁO VIÊN                                       │

│  ┌──────────────────────────────────────────────────────────┐           │

│  │                                                           │           │

│  │  User (đã đăng nhập, role: Learner)                      │           │

│  │         │                                                 │           │

│  │         ▼                                                 │           │

│  │  ┌─────────────────────────────────────────────┐         │           │

│  │  │  FORM ĐĂNG KÝ GIÁO VIÊN                    │         │           │

│  │  │                                              │         │           │

│  │  │  📝 Họ tên đầy đủ: [\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_]       │         │           │

│  │  │  📧 Email liên hệ:  [\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_]       │         │           │

│  │  │  🏫 Tổ chức/trường: [\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_]       │         │           │

│  │  │  📚 Chuyên ngành:   [Dropdown\_\_\_\_\_\_\_]       │         │           │

│  │  │  ⏱️ Kinh nghiệm:    [\_\_\_] năm               │         │           │

│  │  │  📝 Giới thiệu bản thân:                    │         │           │

│  │  │     [\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_]     │         │           │

│  │  │     [\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_]     │         │           │

│  │  │                                              │         │           │

│  │  │  📎 Upload chứng chỉ giảng dạy:             │         │           │

│  │  │     [📄 TESOL\_Certificate.pdf    ✅]        │         │           │

│  │  │     [📄 IELTS\_Score\_8.5.pdf      ✅]        │         │           │

│  │  │     [+ Thêm file]                           │         │           │

│  │  │                                              │         │           │

│  │  │  Accepted: PDF, JPG, PNG (Max 5MB/file)     │         │           │

│  │  │                                              │         │           │

│  │  │     [     Gửi yêu cầu     ]                 │         │           │

│  │  └─────────────────────┬────────────────────────┘         │           │

│  │                        │                                  │           │

│  └────────────────────────┼──────────────────────────────────┘           │

│                           │                                              │

│                           ▼                                              │

│  ┌──────────────────────────────────────────────────────────┐           │

│  │  BACKEND XỬ LÝ                                           │           │

│  │                                                           │           │

│  │  1. Validate form data + files                           │           │

│  │  2. Upload files to S3/Storage                           │           │

│  │  3. Tạo teacher\_profile record (status: "pending")       │           │

│  │  4. Gửi email xác nhận cho user                          │           │

│  │  5. Tạo notification cho Admin                           │           │

│  │  6. Gửi email/notification cho Admin                     │           │

│  │     "Có yêu cầu giáo viên mới cần duyệt"               │           │

│  └──────────────────────────┬───────────────────────────────┘           │

│                              │                                           │

│                              ▼                                           │

│  PHASE 3: ADMIN DUYỆT                                                   │

│  ┌──────────────────────────────────────────────────────────┐           │

│  │                                                           │           │

│  │  Admin Dashboard → Teacher Requests                       │           │

│  │                                                           │           │

│  │  ┌────────────────────────────────────────────────────┐  │           │

│  │  │ 📋 DANH SÁCH YÊU CẦU GIÁO VIÊN                   │  │           │

│  │  │                                                     │  │           │

│  │  │ ┌─────┬──────────┬────────────┬────────┬────────┐ │  │           │

│  │  │ │ #   │ Tên      │ Chuyên ngành│ Ngày  │ Action │ │  │           │

│  │  │ ├─────┼──────────┼────────────┼────────┼────────┤ │  │           │

│  │  │ │ 1   │ Nguyễn A │ IELTS      │ 15/01 │ [Xem]  │ │  │           │

│  │  │ │ 2   │ Trần B   │ TOEIC      │ 16/01 │ [Xem]  │ │  │           │

│  │  │ │ 3   │ Lê C     │ Business   │ 16/01 │ [Xem]  │ │  │           │

│  │  │ └─────┴──────────┴────────────┴────────┴────────┘ │  │           │

│  │  └────────────────────────────────────────────────────┘  │           │

│  │                                                           │           │

│  │  Admin click [Xem] → Chi tiết:                           │           │

│  │                                                           │           │

│  │  ┌────────────────────────────────────────────────────┐  │           │

│  │  │  👤 Nguyễn Văn A                                   │  │           │

│  │  │  📧 nguyenvana@email.com                           │  │           │

│  │  │  🏫 Trung tâm ABC English                         │  │           │

│  │  │  📚 Chuyên ngành: IELTS                           │  │           │

│  │  │  ⏱️ Kinh nghiệm: 5 năm                            │  │           │

│  │  │                                                     │  │           │

│  │  │  📎 Chứng chỉ đính kèm:                           │  │           │

│  │  │  ├── 📄 TESOL\_Certificate.pdf [Xem | Tải]         │  │           │

│  │  │  └── 📄 IELTS\_Score\_8.5.pdf  [Xem | Tải]         │  │           │

│  │  │                                                     │  │           │

│  │  │  📝 Giới thiệu:                                    │  │           │

│  │  │  "Tôi đã giảng dạy IELTS 5 năm tại..."           │  │           │

│  │  │                                                     │  │           │

│  │  │  ┌──────────────┐    ┌────────────────┐            │  │           │

│  │  │  │ ✅ APPROVE   │    │ ❌ REJECT      │            │  │           │

│  │  │  └──────┬───────┘    └───────┬────────┘            │  │           │

│  │  │         │                    │                      │  │           │

│  │  └─────────┼────────────────────┼──────────────────────┘  │           │

│  │            │                    │                          │           │

│  └────────────┼────────────────────┼──────────────────────────┘           │

│               │                    │                                      │

│       ┌───────▼────────┐  ┌───────▼──────────────────────┐              │

│       │                │  │                               │              │

│       ▼                │  ▼                               │              │

│  ┌─────────────────┐  │  ┌────────────────────────────┐  │              │

│  │ APPROVE FLOW    │  │  │ REJECT FLOW                │  │              │

│  │                 │  │  │                             │  │              │

│  │ 1. Update       │  │  │ 1. Admin nhập lý do từ chối│  │              │

│  │    teacher\_     │  │  │    [\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_]│  │              │

│  │    profile.     │  │  │    [\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_]│  │              │

│  │    status =     │  │  │                             │  │              │

│  │    "approved"   │  │  │ 2. Update teacher\_profile.  │  │              │

│  │                 │  │  │    status = "rejected"      │  │              │

│  │ 2. Update       │  │  │    reject\_reason = "..."    │  │              │

│  │    user.role =  │  │  │                             │  │              │

│  │    "teacher"    │  │  │ 3. Email thông báo          │  │              │

│  │                 │  │  │    "Yêu cầu bị từ chối     │  │              │

│  │ 3. Email thông  │  │  │     vì: [lý do]            │  │              │

│  │    báo:         │  │  │     Bạn có thể nộp lại"    │  │              │

│  │    "Chúc mừng!  │  │  │                             │  │              │

│  │     Bạn đã      │  │  │ 4. In-app notification     │  │              │

│  │     được duyệt  │  │  │                             │  │              │

│  │     làm GV"     │  │  └────────────────────────────┘  │              │

│  │                 │  │                                   │              │

│  │ 4. In-app       │  │                                   │              │

│  │    notification │  │                                   │              │

│  │                 │  │                                   │              │

│  │ 5. Tạo audit\_log│  │                                   │              │

│  └─────────────────┘  │                                   │              │

│                        │                                   │              │

└────────────────────────┴───────────────────────────────────┘              
1. ## <a name="_toc225239640"></a>**Luồng làm Mini Test**
┌──────────────────────────────────────────────────────────────────────────┐

│                    LUỒNG LÀM MINI TEST                                    │

├──────────────────────────────────────────────────────────────────────────┤

│                                                                           │

│  ┌───────────┐    ┌────────────────────┐    ┌─────────────────────┐     │

│  │ User chọn │───▶│ Chọn nguồn test    │───▶│ Cài đặt test       │     │

│  │ Mini Test │    │ ├── Deck cụ thể    │    │ ├── Số câu: 20     │     │

│  │           │    │ ├── Cards yếu      │    │ ├── Time: 10 min   │     │

│  │           │    │ ├── Daily Quiz     │    │ ├── Type: Mixed    │     │

│  │           │    │ └── GV đã giao     │    │ └── [Bắt đầu]     │     │

│  └───────────┘    └────────────────────┘    └──────────┬──────────┘     │

│                                                         │                 │

│                                                         ▼                 │

│  ┌──────────────────────────────────────────────────────────────┐       │

│  │  BACKEND: Auto Generate Questions                            │       │

│  │                                                               │       │

│  │  Input: deck\_id / card\_ids, total\_questions, question\_types  │       │

│  │                                                               │       │

│  │  ┌─────────────────────────────────────────────────────┐    │       │

│  │  │  FOR each selected card:                             │    │       │

│  │  │                                                      │    │       │

│  │  │  Random chọn question\_type:                          │    │       │

│  │  │                                                      │    │       │

│  │  │  TYPE 1: EN → VI (Multiple Choice)                   │    │       │

│  │  │  ┌─────────────────────────────────────────────┐    │    │       │

│  │  │  │  Q: "Accomplish" nghĩa là gì?               │    │    │       │

│  │  │  │  A. Phá hủy     ← random wrong (cùng deck) │    │    │       │

│  │  │  │  B. Hoàn thành  ← correct                   │    │    │       │

│  │  │  │  C. Bắt đầu     ← random wrong              │    │    │       │

│  │  │  │  D. Từ bỏ       ← random wrong              │    │    │       │

│  │  │  └─────────────────────────────────────────────┘    │    │       │

│  │  │                                                      │    │       │

│  │  │  TYPE 2: VI → EN (Multiple Choice)                   │    │       │

│  │  │  ┌─────────────────────────────────────────────┐    │    │       │

│  │  │  │  Q: Từ nào có nghĩa "Hoàn thành"?          │    │    │       │

│  │  │  │  A. Determine   B. Accomplish               │    │    │       │

│  │  │  │  C. Perceive    D. Elaborate                │    │    │       │

│  │  │  └─────────────────────────────────────────────┘    │    │       │

│  │  │                                                      │    │       │

│  │  │  TYPE 3: Listening                                   │    │       │

│  │  │  ┌─────────────────────────────────────────────┐    │    │       │

│  │  │  │  Q: 🔊 [Audio plays]                        │    │    │       │

│  │  │  │  Chọn từ đúng:                              │    │    │       │

│  │  │  │  A. achieve  B. accomplish  C. abolish      │    │    │       │

│  │  │  └─────────────────────────────────────────────┘    │    │       │

│  │  │                                                      │    │       │

│  │  │  TYPE 4: Fill in blank                               │    │       │

│  │  │  ┌─────────────────────────────────────────────┐    │    │       │

│  │  │  │  Q: "She \_\_\_\_\_\_\_ her goal after years       │    │    │       │

│  │  │  │      of hard work."                          │    │    │       │

│  │  │  │  Answer: [\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_]                   │    │    │       │

│  │  │  └─────────────────────────────────────────────┘    │    │       │

│  │  │                                                      │    │       │

│  │  │  TYPE 5: Image-based                                 │    │       │

│  │  │  ┌─────────────────────────────────────────────┐    │    │       │

│  │  │  │  Q: 🖼️ [Hình ảnh minh họa]                  │    │    │       │

│  │  │  │  Từ nào mô tả hình ảnh trên?               │    │    │       │

│  │  │  │  A. accomplish  B. destroy  C. ignore       │    │    │       │

│  │  │  └─────────────────────────────────────────────┘    │    │       │

│  │  │                                                      │    │       │

│  │  │  Đáp án sai được lấy từ:                            │    │       │

│  │  │  ├── Cards khác trong cùng deck (ưu tiên)          │    │       │

│  │  │  ├── Cards cùng category                            │    │       │

│  │  │  └── Random từ pool chung                           │    │       │

│  │  │                                                      │    │       │

│  │  │  Shuffle thứ tự đáp án                              │    │       │

│  │  └─────────────────────────────────────────────────────┘    │       │

│  └──────────────────────────┬───────────────────────────────────┘       │

│                              │                                           │

│                              ▼                                           │

│  ┌──────────────────────────────────────────────────────────────┐       │

│  │  FRONTEND: Hiển thị bài test                                 │       │

│  │                                                               │       │

│  │  ┌────────────────────────────────────────────────────────┐  │       │

│  │  │  📝 MINI TEST - TOEIC Vocabulary                       │  │       │

│  │  │  ⏱️ 08:45 remaining    📊 Question 7/20               │  │       │

│  │  │                                                         │  │       │

│  │  │  ┌─────────────────────────────────────────────────┐   │  │       │

│  │  │  │  Progress: [███████████░░░░░░░░░░] 35%          │   │  │       │

│  │  │  └─────────────────────────────────────────────────┘   │  │       │

│  │  │                                                         │  │       │

│  │  │  Q7: "Determine" nghĩa là gì?                         │  │       │

│  │  │                                                         │  │       │

│  │  │  ○ A. Phá hủy                                         │  │       │

│  │  │  ● B. Quyết định    ← User selected                   │  │       │

│  │  │  ○ C. Bắt đầu                                         │  │       │

│  │  │  ○ D. Từ bỏ                                           │  │       │

│  │  │                                                         │  │       │

│  │  │  [◄ Previous]                    [Next ►]              │  │       │

│  │  │                                                         │  │       │

│  │  │  Question Map:                                         │  │       │

│  │  │  [✅][✅][❌][✅][✅][⬜][⭕][⬜][⬜][⬜]            │  │       │

│  │  │  [⬜][⬜][⬜][⬜][⬜][⬜][⬜][⬜][⬜][⬜]            │  │       │

│  │  │  ✅=Đã trả lời  ❌=Đã đánh dấu  ⭕=Đang làm        │  │       │

│  │  │                                                         │  │       │

│  │  │              [ 📤 Nộp bài ]                            │  │       │

│  │  └────────────────────────────────────────────────────────┘  │       │

│  └──────────────────────────┬───────────────────────────────────┘       │

│                              │                                           │

│                              ▼ (User nộp bài)                           │

│  ┌──────────────────────────────────────────────────────────────┐       │

│  │  BACKEND: Chấm điểm & Phân tích                             │       │

│  │                                                               │       │

│  │  1. So khớp từng câu trả lời với đáp án đúng               │       │

│  │  2. Tính điểm: correct\_count / total\_questions              │       │

│  │  3. Phân tích chi tiết:                                      │       │

│  │     ├── Câu đúng / sai                                      │       │

│  │     ├── Thời gian trả lời mỗi câu                          │       │

│  │     ├── Từ nào sai → đánh dấu cần ôn lại                   │       │

│  │     └── So sánh với lần test trước                           │       │

│  │  4. Lưu test\_attempts record                                │       │

│  │  5. Cập nhật user\_card\_progress cho cards sai               │       │

│  │     (giảm ease\_factor, đưa về leitner box thấp hơn)        │       │

│  │  6. Cộng XP                                                  │       │

│  │  7. Cập nhật daily stats                                     │       │

│  │  8. Check achievements                                       │       │

│  └──────────────────────────┬───────────────────────────────────┘       │

│                              │                                           │

│                              ▼                                           │

│  ┌──────────────────────────────────────────────────────────────┐       │

│  │  HIỂN THỊ KẾT QUẢ                                           │       │

│  │                                                               │       │

│  │  ┌────────────────────────────────────────────────────────┐  │       │

│  │  │  📊 KẾT QUẢ MINI TEST                                 │  │       │

│  │  │                                                         │  │       │

│  │  │        ┌───────────┐                                    │  │       │

│  │  │        │           │                                    │  │       │

│  │  │        │   85%     │  🎉 Xuất sắc!                    │  │       │

│  │  │        │  17/20    │                                    │  │       │

│  │  │        └───────────┘                                    │  │       │

│  │  │                                                         │  │       │

│  │  │  ⏱️ Thời gian: 7 phút 23 giây                         │  │       │

│  │  │  ⭐ XP earned: +45                                      │  │       │

│  │  │  📈 So với lần trước: +10% ↑                           │  │       │

│  │  │                                                         │  │       │

│  │  │  ┌─────────────────────────────────────────────────┐   │  │       │

│  │  │  │  📋 CHI TIẾT CÂU TRẢ LỜI                       │   │  │       │

│  │  │  │                                                  │   │  │       │

│  │  │  │  ✅ Q1: Accomplish = Hoàn thành         (2.1s)  │   │  │       │

│  │  │  │  ✅ Q2: Determine = Quyết định          (3.5s)  │   │  │       │

│  │  │  │  ❌ Q3: Perceive ≠ Phá hủy → Nhận thức (8.2s)  │   │  │       │

│  │  │  │  ✅ Q4: Elaborate = Chi tiết             (1.8s)  │   │  │       │

│  │  │  │  ...                                             │   │  │       │

│  │  │  └─────────────────────────────────────────────────┘   │  │       │

│  │  │                                                         │  │       │

│  │  │  📌 Từ cần ôn lại: Perceive, Intricate, Ambiguous     │  │       │

│  │  │                                                         │  │       │

│  │  │  [🔄 Làm lại] [📚 Ôn từ sai] [🏠 Trang chủ]         │  │       │

│  │  └────────────────────────────────────────────────────────┘  │       │

│  └──────────────────────────────────────────────────────────────┘       │

│                                                                           │

└──────────────────────────────────────────────────────────────────────────┘

-----
1. # <a name="_toc225239641"></a>**WIREFRAME CÁC MÀN HÌNH CHÍNH**
1. ## <a name="_toc225239642"></a>**Trang chủ (Dashboard) - Người học**
┌──────────────────────────────────────────────────────────────────────────┐

│  🃏 FlashLearn          🔍 Search...           🌐 VI ▼  🔔(3) 👤 ▼   │

├──────┬───────────────────────────────────────────────────────────────────┤

│      │                                                                   │

│  📊  │  👋 Chào buổi sáng, Nguyễn Văn A!                               │

│ Home │                                                                   │

│      │  ┌──────────────┐ ┌──────────────┐ ┌──────────────┐             │

│  🃏  │  │ 🔥 Streak    │ │ 📚 Hôm nay  │ │ ⭐ Level     │             │

│Cards │  │    15 ngày   │ │  25 cards due│ │  Lv.3        │             │

│      │  │              │ │              │ │  2,450 XP    │             │

│  📝  │  └──────────────┘ └──────────────┘ └──────────────┘             │

│Tests │                                                                   │

│      │  ┌────────────────────────────────────────────────────────┐     │

│  🎮  │  │  📖 TIẾP TỤC HỌC                                     │     │

│Games │  │                                                         │     │

│      │  │  ┌──────────┐ ┌──────────┐ ┌──────────┐               │     │

│  📈  │  │  │🖼️ TOEIC  │ │🖼️ IELTS  │ │🖼️Business│               │     │

│Stats │  │  │ Vol.1    │ │ Academic │ │ English  │               │     │

│      │  │  │ 75/120   │ │ 30/200   │ │ 50/80    │               │     │

│  👥  │  │  │ [████░░] │ │ [██░░░░] │ │ [█████░] │               │     │

│Class │  │  │ 63%      │ │ 15%      │ │ 63%      │               │     │

│      │  │  │[Tiếp tục]│ │[Tiếp tục]│ │[Tiếp tục]│               │     │

│  ⚙️  │  │  └──────────┘ └──────────┘ └──────────┘               │     │

│ Cài  │  └────────────────────────────────────────────────────────┘     │

│ đặt  │                                                                   │

│      │  ┌─────────────────────┐ ┌────────────────────────────┐         │

│      │  │ 🎮 QUICK ACTIONS    │ │ 📊 THỐNG KÊ TUẦN NÀY      │         │

│      │  │                     │ │                             │         │

│      │  │ ┌─────┐ ┌─────┐   │ │  50│     ╱╲                 │         │

│      │  │ │🧩   │ │📝   │   │ │    │  ╱╲╱  ╲╱╲              │         │

│      │  │ │Game │ │Quiz │   │ │  25│╱╱          ╲            │         │

│      │  │ │     │ │Daily│   │ │    │              ╲           │         │

│      │  │ └─────┘ └─────┘   │ │   0└──┬──┬──┬──┬──┬──┬──▶  │         │

│      │  │ ┌─────┐ ┌─────┐   │ │     T2 T3 T4 T5 T6 T7 CN   │         │

│      │  │ │📚   │ │🔍   │   │ │                             │         │

│      │  │ │Ôn   │ │Khám │   │ │  Cards học: 156  ⏱️ 2.5h   │         │

│      │  │ │tập  │ │ phá │   │ │  Tests: 3        🎮 12 lần  │         │

│      │  │ └─────┘ └─────┘   │ │                             │         │

│      │  └─────────────────────┘ └────────────────────────────┘         │

│      │                                                                   │

│      │  ┌────────────────────────────────────────────────────────┐     │

│      │  │  🏆 BẢNG XẾP HẠNG TUẦN                                │     │

│      │  │                                                         │     │

│      │  │  🥇 Trần Minh    2,340 XP                              │     │

│      │  │  🥈 Lê Hương     2,120 XP                              │     │

│      │  │  🥉 Phạm Dũng    1,890 XP                              │     │

│      │  │  4. Bạn (Nguyễn A) 1,650 XP  ← Bạn đang ở đây       │     │

│      │  │  5. Hoàng Long    1,520 XP                              │     │

│      │  └────────────────────────────────────────────────────────┘     │

│      │                                                                   │

└──────┴───────────────────────────────────────────────────────────────────┘
1. ## <a name="_toc225239643"></a>**Màn hình học Flashcard**
┌──────────────────────────────────────────────────────────────────────────┐

│  ← Quay lại         TOEIC Vocabulary Vol.1         ⚙️  ⋮              │

├──────────────────────────────────────────────────────────────────────────┤

│                                                                          │

│   Progress: [████████████████░░░░░░░░░] 12/25 cards                    │

│                                                                          │

│   ┌──── Leitner Box Status ────────────────────────────────────┐       │

│   │  📦Box1: 5  📦Box2: 8  📦Box3: 12  📦Box4: 20  📦Box5: 75│       │

│   └────────────────────────────────────────────────────────────┘       │

│                                                                          │

│                                                                          │

│              ┌────────────────────────────────┐                         │

│              │                                │                         │

│              │                                │                         │

│              │        "Accomplish"            │                         │

│              │                                │                         │

│              │      /əˈkɑːm.plɪʃ/           │                         │

│              │                                │                         │

│              │         🔊 Phát âm            │                         │

│              │                                │                         │

│              │      🖼️ [Hình minh họa]       │                         │

│              │                                │                         │

│              │                                │                         │

│              │     👆 Nhấn để lật thẻ         │                         │

│              │                                │                         │

│              └────────────────────────────────┘                         │

│                                                                          │

│                                                                          │

│              (Sau khi lật thẻ - Mặt sau)                                │

│              ┌────────────────────────────────┐                         │

│              │                                │                         │

│              │  📖 Verb - "Hoàn thành"        │                         │

│              │                                │                         │

│              │  📝 Ví dụ:                     │                         │

│              │  "She accomplished her goal    │                         │

│              │   after years of hard work."   │                         │

│              │                                │                         │

│              │  🔗 Synonyms:                  │                         │

│              │  achieve, complete, fulfill    │                         │

│              │                                │                         │

│              │  📌 Note: formal context       │                         │

│              │                                │                         │

│              └────────────────────────────────┘                         │

│                                                                          │

│   ┌──────────┐ ┌──────────┐ ┌──────────┐ ┌──────────┐                 │

│   │ 😫 Again │ │ 😐 Hard  │ │ 🙂 Good  │ │ 😄 Easy  │                 │

│   │  < 1m    │ │   6m     │ │  10m     │ │   4d     │                 │

│   └──────────┘ └──────────┘ └──────────┘ └──────────┘                 │

│                                                                          │

└──────────────────────────────────────────────────────────────────────────┘
1. ## <a name="_toc225239644"></a>**Màn hình Mini Game Hub**
┌──────────────────────────────────────────────────────────────────────────┐

│  ← Quay lại              🎮 MINI GAMES                    🏆 Rankings  │

├──────────────────────────────────────────────────────────────────────────┤

│                                                                          │

│  ┌────────────────────────────────────────────────────────────────┐    │

│  │  ⭐ DAILY CHALLENGE                                  ⏱️ 23:45:12│    │

│  │                                                                 │    │

│  │  "Hoàn thành thử thách hôm nay để nhận 100 XP bonus!"        │    │

│  │                                                                 │    │

│  │  🎮 Word Sprint - TOEIC Essential      [  Chơi ngay  ]        │    │

│  └────────────────────────────────────────────────────────────────┘    │

│                                                                          │

│  📂 CHỌN TRÒ CHƠI                                                      │

│                                                                          │

│  ┌──────────────┐  ┌──────────────┐  ┌──────────────┐                  │

│  │              │  │              │  │              │                  │

│  │   🧩         │  │   📝         │  │   🔀         │                  │

│  │  MATCHING    │  │  MULTIPLE    │  │  WORD        │                  │

│  │  PAIRS       │  │  CHOICE      │  │  SCRAMBLE    │                  │

│  │              │  │              │  │              │                  │

│  │  Nối từ với  │  │  Chọn đáp án │  │  Sắp xếp    │                  │

│  │  nghĩa       │  │  đúng        │  │  chữ cái     │                  │

│  │              │  │              │  │              │                  │

│  │  🏆 Best:    │  │  🏆 Best:    │  │  🏆 Best:    │                  │

│  │  1,250 pts   │  │  980 pts     │  │  1,100 pts   │                  │

│  │              │  │              │  │              │                  │

│  │  [ Chơi ]    │  │  [ Chơi ]    │  │  [ Chơi ]    │                  │

│  └──────────────┘  └──────────────┘  └──────────────┘                  │

│                                                                          │

│  ┌──────────────┐  ┌──────────────┐  ┌──────────────┐                  │

│  │              │  │              │  │              │                  │

│  │   ⚡         │  │   👂         │  │   ⌨️         │                  │

│  │  FLASHCARD   │  │  LISTENING   │  │  TYPING      │                  │

│  │  SPRINT      │  │  CHALLENGE   │  │  PRACTICE    │                  │

│  │              │  │              │  │              │                  │

│  │  Swipe       │  │  Nghe và     │  │  Gõ từ       │                  │

│  │  đúng/sai    │  │  chọn đúng   │  │  chính xác   │                  │

│  │              │  │              │  │              │                  │

│  │  🏆 Best:    │  │  🏆 Best:    │  │  🏆 Best:    │                  │

│  │  45/60       │  │  850 pts     │  │  92% acc     │                  │

│  │              │  │              │  │              │                  │

│  │  [ Chơi ]    │  │  [ Chơi ]    │  │  [ Chơi ]    │                  │

│  └──────────────┘  └──────────────┘  └──────────────┘                  │

│                                                                          │

│  ┌──────────────┐                                                       │

│  │              │                                                       │

│  │   🃏         │                                                       │

│  │  MEMORY      │                                                       │

│  │  FLIP        │                                                       │

│  │              │                                                       │

│  │  Lật thẻ    │                                                       │

│  │  tìm cặp    │                                                       │

│  │              │                                                       │

│  │  🏆 Best:    │                                                       │

│  │  18 moves    │                                                       │

│  │              │                                                       │

│  │  [ Chơi ]    │                                                       │

│  └──────────────┘                                                       │

│                                                                          │

│  ┌────────────────────────────────────────────────────────────────┐    │

│  │  🏅 THÀNH TÍCH GẦN ĐÂY                                       │    │

│  │                                                                 │    │

│  │  🎯 "Sharp Shooter" - Test 100% đúng            15/01/2025    │    │

│  │  🔥 "On Fire" - Streak 7 ngày                   12/01/2025    │    │

│  │  🎮 "Game Lover" - Chơi 10 game                 10/01/2025    │    │

│  └────────────────────────────────────────────────────────────────┘    │

│                                                                          │

└──────────────────────────────────────────────────────────────────────────┘
1. ## <a name="_toc225239645"></a>**Màn hình Admin Dashboard**
┌──────────────────────────────────────────────────────────────────────────┐

│  🛡️ ADMIN PANEL         FlashLearn              👤 Admin ▼  🔔(5) 🚪  │

├──────────┬───────────────────────────────────────────────────────────────┤

│          │                                                               │

│  📊      │  📊 DASHBOARD TỔNG QUAN                                      │

│ Dashboard│                                                               │

│          │  ┌────────────┐ ┌────────────┐ ┌────────────┐ ┌──────────┐ │

│  👥      │  │ 👥 Users   │ │ 👨‍🏫 Teachers│ │ 📚 Decks   │ │ 🎮 Games │ │

│ Users    │  │   12,450   │ │    320     │ │   3,200    │ │  45,000  │ │

│          │  │  +150 /w   │ │   +12 /w   │ │   +80 /w   │ │ plays/w  │ │

│  👨‍🏫      │  │  ↑ 5.2%    │ │  ↑ 3.8%    │ │  ↑ 2.5%    │ │ ↑ 8.1%   │ │

│ Teacher  │  └────────────┘ └────────────┘ └────────────┘ └──────────┘ │

│ Requests │                                                               │

│          │  ┌────────────────────────────┐ ┌────────────────────────┐  │

│  📚      │  │  📈 USER GROWTH (30 days)  │ │ ⏳ PENDING ACTIONS     │  │

│ Content  │  │                             │ │                        │  │

│          │  │  500│        ╱──            │ │ 👨‍🏫 Teacher requests:  │  │

│  🏷️      │  │     │    ╱──╱              │ │    15 pending          │  │

│ Tags     │  │  250│ ╱──╱                 │ │    [Xem →]            │  │

│          │  │     │╱                      │ │                        │  │

│  🌐      │  │    0└──────────────────▶   │ │ 📚 Deck approval:     │  │

│Languages │  │    1    10    20    30     │ │    8 pending           │  │

│          │  │                             │ │    [Xem →]            │  │

│  🔐      │  └────────────────────────────┘ │                        │  │

│ Roles    │                                  │ 🚩 Reports:           │  │

│          │  ┌────────────────────────────┐ │    3 pending           │  │

│  ⚙️      │  │  📊 ACTIVE USERS (24h)     │ │    [Xem →]            │  │

│ Config   │  │                             │ │                        │  │

│          │  │  ┌─────┐ ┌─────┐ ┌─────┐  │ └────────────────────────┘  │

│  📋      │  │  │ Web │ │ PWA │ │ API │  │                              │

│ Logs     │  │  │6,200│ │1,800│ │ 400 │  │ ┌────────────────────────┐  │

│          │  │  └─────┘ └─────┘ └─────┘  │ │ 🏆 TOP DECKS (tuần)   │  │

│  📈      │  │  Total: 8,400 active      │ │                        │  │

│ Reports  │  └────────────────────────────┘ │ 1. TOEIC 600   ⭐4.8  │  │

│          │                                  │ 2. IELTS Band7 ⭐4.7  │  │

│          │  ┌────────────────────────────┐ │ 3. Daily Conv  ⭐4.6  │  │

│          │  │  🗺️ USERS BY LANGUAGE      │ │ 4. Business    ⭐4.5  │  │

│          │  │                             │ │ 5. Academic    ⭐4.4  │  │

│          │  │  🇻🇳 VI: 8,500 (68%)       │ │                        │  │

│          │  │  🇺🇸 EN: 2,200 (18%)       │ └────────────────────────┘  │

│          │  │  🇯🇵 JA:   950 (8%)        │                              │

│          │  │  🇰🇷 KO:   800 (6%)        │                              │

│          │  └────────────────────────────┘                              │

│          │                                                               │

│          │  ┌────────────────────────────────────────────────────────┐ │

│          │  │  📋 RECENT AUDIT LOGS                                  │ │

│          │  │                                                         │ │

│          │  │  ⏱️ 5 min ago  │ Admin\_01 approved teacher "Trần B"   │ │

│          │  │  ⏱️ 15 min ago │ Admin\_01 banned user "spam\_user\_123" │ │

│          │  │  ⏱️ 1 hour ago │ Admin\_02 added language "French"     │ │

│          │  │  ⏱️ 2 hours ago│ System: Auto cleanup expired sessions│ │

│          │  │                                       [Xem tất cả →]  │ │

│          │  └────────────────────────────────────────────────────────┘ │

│          │                                                               │

└──────────┴───────────────────────────────────────────────────────────────┘
1. ## <a name="_toc225239646"></a>**Màn hình Giáo viên - Quản lý lớp**
┌──────────────────────────────────────────────────────────────────────────┐

│  🃏 FlashLearn         🔍 Search...            🌐 VI ▼  🔔(2) 👤 ▼   │

├──────────┬───────────────────────────────────────────────────────────────┤

│          │                                                               │

│  📊      │  👨‍🏫 LỚP HỌC: TOEIC\_A1 (25 học sinh)                        │

│ Dashboard│                                                               │

│          │  ┌─────────────────────────────────────────────────────────┐ │

│  🃏      │  │  📋 TỔNG QUAN LỚP                                      │ │

│ My Decks │  │                                                          │ │

│          │  │  ┌──────────┐ ┌──────────┐ ┌──────────┐ ┌──────────┐  │ │

│  👥      │  │  │ 👥 HS    │ │ 📚 Decks │ │ 📝 Tests │ │ 📊 Avg   │  │ │

│ Classes  │  │  │   25     │ │   5      │ │   12     │ │  Score   │  │ │

│  ├ A1    │  │  │  active  │ │ assigned │ │ created  │ │  78%     │  │ │

│  ├ A2    │  │  └──────────┘ └──────────┘ └──────────┘ └──────────┘  │ │

│  └ B1    │  └─────────────────────────────────────────────────────────┘ │

│          │                                                               │

│  📝      │  ┌─────────────────────────────────────────────────────────┐ │

│ Tests    │  │  👥 BẢNG THEO DÕI HỌC SINH                     [Export]│ │

│          │  │                                                          │ │

│  📈      │  │  ┌─────┬──────────┬───────┬───────┬──────┬──────────┐ │ │

│ Stats    │  │  │ #   │ Họ tên   │ Cards │ Tests │Streak│ Trạng thái│ │ │

│          │  │  │     │          │ Done  │ Avg   │      │           │ │ │

│  ⚙️      │  │  ├─────┼──────────┼───────┼───────┼──────┼──────────┤ │ │

│ Settings │  │  │ 1   │ Phạm D   │ 90%   │ 88%   │ 20d  │ 🟢 Tốt  │ │ │

│          │  │  │ 2   │ Nguyễn A │ 85%   │ 82%   │ 15d  │ 🟢 Tốt  │ │ │

│          │  │  │ 3   │ Trần B   │ 72%   │ 75%   │  8d  │ 🟡 TB    │ │ │

│          │  │  │ 4   │ Lê C     │ 45%   │ 60%   │  2d  │ 🔴 Yếu  │ │ │

│          │  │  │ 5   │ Hoàng E  │ 38%   │ 55%   │  0d  │ 🔴 Yếu  │ │ │

│          │  │  │ ... │ ...      │ ...   │ ...   │ ...  │ ...      │ │ │

│          │  │  └─────┴──────────┴───────┴───────┴──────┴──────────┘ │ │

│          │  │                                                          │ │

│          │  │  📊 Sắp xếp: [Tiến độ ▼]  🔍 Tìm kiếm: [\_\_\_\_\_\_\_\_]   │ │

│          │  └─────────────────────────────────────────────────────────┘ │

│          │                                                               │

│          │  ┌──────────────────────┐ ┌─────────────────────────────┐   │

│          │  │ 📚 DECKS ĐÃ GIAO    │ │ 📝 BÀI TEST GẦN ĐÂY       │   │

│          │  │                      │ │                              │   │

│          │  │ ┌──────────────────┐ │ │ ┌────────────────────────┐  │   │

│          │  │ │ TOEIC Vol.1      │ │ │ │ Test #12 - Unit 5      │  │   │

│          │  │ │ Due: 20/01/2025  │ │ │ │ 20/25 HS đã nộp       │  │   │

│          │  │ │ Done: 18/25 HS   │ │ │ │ Avg: 78% | High: 95%  │  │   │

│          │  │ │ [Chi tiết]       │ │ │ │ [Xem chi tiết]        │  │   │

│          │  │ └──────────────────┘ │ │ └────────────────────────┘  │   │

│          │  │ ┌──────────────────┐ │ │ ┌────────────────────────┐  │   │

│          │  │ │ TOEIC Vol.2      │ │ │ │ Test #11 - Unit 4      │  │   │

│          │  │ │ Due: 25/01/2025  │ │ │ │ 25/25 HS đã nộp       │  │   │

│          │  │ │ Done: 10/25 HS   │ │ │ │ Avg: 72% | High: 90%  │  │   │

│          │  │ │ [Chi tiết]       │ │ │ │ [Xem chi tiết]        │  │   │

│          │  │ └──────────────────┘ │ │ └────────────────────────┘  │   │

│          │  │                      │ │                              │   │

│          │  │ [+ Giao deck mới]   │ │ [+ Tạo test mới]           │   │

│          │  └──────────────────────┘ └─────────────────────────────┘   │

│          │                                                               │

│          │  ┌─────────────────────────────────────────────────────────┐ │

│          │  │  📊 BIỂU ĐỒ TIẾN ĐỘ LỚP                              │ │

│          │  │                                                          │ │

│          │  │  100%│                              ╱──                  │ │

│          │  │      │                         ╱──╱                     │ │

│          │  │   75%│                    ╱──╱╱                         │ │

│          │  │      │               ╱──╱╱                              │ │

│          │  │   50%│          ╱──╱╱                                   │ │

│          │  │      │     ╱──╱╱                                        │ │

│          │  │   25%│╱──╱╱                                             │ │

│          │  │      └─────────────────────────────────────▶            │ │

│          │  │      W1   W2   W3   W4   W5   W6   W7   W8             │ │

│          │  │                                                          │ │

│          │  │  ── Avg class  ── Top 5  ── Bottom 5                    │ │

│          │  └─────────────────────────────────────────────────────────┘ │

│          │                                                               │

└──────────┴───────────────────────────────────────────────────────────────┘
1. ## <a name="_toc225239647"></a>**Màn hình Cài đặt nhắc nhở**
┌──────────────────────────────────────────────────────────────────────────┐

│  ← Quay lại               ⚙️ CÀI ĐẶT                                  │

├──────────────────────────────────────────────────────────────────────────┤

│                                                                          │

│  ┌────────────────────────────────────────────────────────────────┐    │

│  │  🔔 NHẮC NHỞ ÔN TẬP                                         │    │

│  │                                                                │    │

│  │  Bật nhắc nhở ôn tập                           [====🟢 ON ]  │    │

│  │                                                                │    │

│  │  ────────────────────────────────────────────────              │    │

│  │                                                                │    │

│  │  ⏰ Thời gian nhắc:                                           │    │

│  │                                                                │    │

│  │  Lần 1:  [ 08:00 ▼ ] sáng                                    │    │

│  │  Lần 2:  [ 12:30 ▼ ] trưa                     [🗑️ Xóa]      │    │

│  │  Lần 3:  [ 20:00 ▼ ] tối                      [🗑️ Xóa]      │    │

│  │                                                                │    │

│  │  [+ Thêm thời gian nhắc]                                      │    │

│  │                                                                │    │

│  │  ────────────────────────────────────────────────              │    │

│  │                                                                │    │

│  │  📅 Ngày nhắc trong tuần:                                     │    │

│  │                                                                │    │

│  │  [✅T2] [✅T3] [✅T4] [✅T5] [✅T6] [⬜T7] [⬜CN]            │    │

│  │                                                                │    │

│  │  ────────────────────────────────────────────────              │    │

│  │                                                                │    │

│  │  📡 Kênh thông báo:                                           │    │

│  │                                                                │    │

│  │  In-app notification                            [====🟢 ON ] │    │

│  │  Email notification                             [====🟢 ON ] │    │

│  │  Push notification (Browser)                    [🔴 OFF====] │    │

│  │    └── [Bật push notification cho trình duyệt này]           │    │

│  │                                                                │    │

│  └────────────────────────────────────────────────────────────────┘    │

│                                                                          │

│  ┌────────────────────────────────────────────────────────────────┐    │

│  │  🔥 NHẮC NHỞ STREAK                                          │    │

│  │                                                                │    │

│  │  Nhắc khi sắp mất streak                       [====🟢 ON ] │    │

│  │  (Thông báo lúc 21:00 nếu chưa học trong ngày)               │    │

│  │                                                                │    │

│  │  Thời gian nhắc streak:  [ 21:00 ▼ ]                         │    │

│  │                                                                │    │

│  └────────────────────────────────────────────────────────────────┘    │

│                                                                          │

│  ┌────────────────────────────────────────────────────────────────┐    │

│  │  📝 NHẮC NHỞ DAILY QUIZ                                      │    │

│  │                                                                │    │

│  │  Nhắc làm quiz hàng ngày                       [====🟢 ON ] │    │

│  │  Thời gian nhắc:  [ 09:00 ▼ ]                                │    │

│  │                                                                │    │

│  └────────────────────────────────────────────────────────────────┘    │

│                                                                          │

│  ┌────────────────────────────────────────────────────────────────┐    │

│  │  🏆 THÔNG BÁO KHÁC                                           │    │

│  │                                                                │    │

│  │  Thông báo thành tích mới                       [====🟢 ON ] │    │

│  │  Thông báo từ giáo viên                         [====🟢 ON ] │    │

│  │  Thông báo cập nhật hệ thống                   [====🟢 ON ] │    │

│  │  Thông báo bảng xếp hạng                       [🔴 OFF====] │    │

│  │  Thông báo deck mới (từ người follow)           [🔴 OFF====] │    │

│  │                                                                │    │

│  └────────────────────────────────────────────────────────────────┘    │

│                                                                          │

│  ┌────────────────────────────────────────────────────────────────┐    │

│  │  🌍 TIMEZONE                                                   │    │

│  │                                                                │    │

│  │  Múi giờ:  [ (UTC+7) Asia/Ho\_Chi\_Minh           ▼ ]          │    │

│  │                                                                │    │

│  │  ℹ️ Tất cả thời gian nhắc nhở sẽ theo múi giờ này            │    │

│  └────────────────────────────────────────────────────────────────┘    │

│                                                                          │

│                    [        💾 Lưu cài đặt        ]                     │

│                                                                          │

└──────────────────────────────────────────────────────────────────────────┘
1. ## <a name="_toc225239648"></a>**Màn hình Thống kê cá nhân**
┌──────────────────────────────────────────────────────────────────────────┐

│  ← Quay lại              📊 THỐNG KÊ HỌC TẬP                          │

├──────────────────────────────────────────────────────────────────────────┤

│                                                                          │

│  ┌────────────────────────────────────────────────────────────────┐    │

│  │  👤 Nguyễn Văn A                                               │    │

│  │                                                                │    │

│  │  ┌────────┐  🔥 Streak: 15 ngày (Kỷ lục: 32 ngày)           │    │

│  │  │ Avatar │  ⭐ Level 3: Intermediate (2,450 / 4,000 XP)     │    │

│  │  │        │  [████████████░░░░░░░░] 61%                       │    │

│  │  └────────┘                                                    │    │

│  │                                                                │    │

│  │  📅 Tham gia: 15/09/2024    ⏱️ Tổng giờ học: 48h 30m         │    │

│  └────────────────────────────────────────────────────────────────┘    │

│                                                                          │

│  ┌────────────────────────────────────────────────────────────────┐    │

│  │  📊 TỔNG QUAN TỪ VỰNG                                         │    │

│  │                                                                │    │

│  │  ┌──────────┐  ┌──────────┐  ┌──────────┐  ┌──────────┐     │    │

│  │  │ 📚 Tổng  │  │ ✅ Thuộc │  │ 📖 Đang  │  │ 🆕 Mới   │     │    │

│  │  │   850    │  │   620    │  │ học: 180 │  │    50    │     │    │

│  │  │  words   │  │  (73%)   │  │  (21%)   │  │   (6%)   │     │    │

│  │  └──────────┘  └──────────┘  └──────────┘  └──────────┘     │    │

│  │                                                                │    │

│  │  Phân bố Leitner Box:                                         │    │

│  │  ┌──────┬──────┬──────┬──────┬──────┐                        │    │

│  │  │Box 1 │Box 2 │Box 3 │Box 4 │Box 5 │                        │    │

│  │  │ 50   │  80  │ 100  │ 120  │ 500  │                        │    │

│  │  │ ██   │ ███  │ ████ │█████ │██████████████████             │    │

│  │  └──────┴──────┴──────┴──────┴──────┘                        │    │

│  │  Mới     1 ngày  3 ngày 7 ngày  30 ngày+                     │    │

│  │                                                                │    │

│  └────────────────────────────────────────────────────────────────┘    │

│                                                                          │

│  ┌────────────────────────────────────────────────────────────────┐    │

│  │  📈 BIỂU ĐỒ HOẠT ĐỘNG 30 NGÀY                                │    │

│  │                                                                │    │

│  │  Tab: [Cards học] [Thời gian] [XP earned] [Test scores]      │    │

│  │                                                                │    │

│  │   60│                        ●                                 │    │

│  │     │              ●        ╱╲     ●                          │    │

│  │   40│      ●      ╱╲      ╱  ╲   ╱╲                          │    │

│  │     │     ╱╲     ╱  ╲    ╱    ╲ ╱  ╲                         │    │

│  │   20│    ╱  ╲   ╱    ╲  ╱      ●    ╲  ●                     │    │

│  │     │   ╱    ╲ ╱      ╲╱             ╲╱                       │    │

│  │    0│──╱──────●─────────────────────────────▶                 │    │

│  │     1    5     10     15     20     25    30                   │    │

│  │                                                                │    │

│  │   Avg: 35 cards/ngày    Best: 62 cards (ngày 18)             │    │

│  │                                                                │    │

│  └────────────────────────────────────────────────────────────────┘    │

│                                                                          │

│  ┌────────────────────────────────────────────────────────────────┐    │

│  │  📅 HEATMAP HOẠT ĐỘNG (12 tháng)                              │    │

│  │                                                                │    │

│  │       Jan  Feb  Mar  Apr  May  Jun  Jul  Aug  Sep  Oct  Nov  │    │

│  │  Mon  ░░█░░░██░░█░░░██░░█░░░██░░█░░░██░░█░░░██░░█░░░██░░   │    │

│  │  Tue  ░██░░░██░░██░░██░░██░░██░░██░░██░░██░░██░░██░░██░░   │    │

│  │  Wed  ░░█░░░░█░░█░░░░█░░█░░░░█░░█░░░░█░░█░░░░█░░█░░░░█░░  │    │

│  │  Thu  ██░░░░██░░██░░░██░░██░░██░░██░░██░░██░░██░░██░░██░░  │    │

│  │  Fri  ░█░░░░░█░░░█░░░░█░░░█░░░░█░░░█░░░░█░░░█░░░░█░░░█░░  │    │

│  │  Sat  ████░████░████░████░████░████░████░████░████░████░██  │    │

│  │  Sun  ███░░███░░███░░███░░███░░███░░███░░███░░███░░███░░██  │    │

│  │                                                                │    │

│  │  ░ = 0  ▒ = 1-10  █ = 11-30  █ = 31-50  █ = 50+            │    │

│  │                                                                │    │

│  └────────────────────────────────────────────────────────────────┘    │

│                                                                          │

│  ┌────────────────────────────────────────────────────────────────┐    │

│  │  🎮 THỐNG KÊ GAME & TEST                                     │    │

│  │                                                                │    │

│  │  ┌───────────────────────┐  ┌───────────────────────┐        │    │

│  │  │ 🎮 Games Played: 128 │  │ 📝 Tests Taken: 45    │        │    │

│  │  │                       │  │                        │        │    │

│  │  │ Best Game:            │  │ Avg Score: 82%         │        │    │

│  │  │ Matching: 1,250 pts   │  │ Best Score: 100%       │        │    │

│  │  │ Sprint: 52/60         │  │ Worst Score: 55%       │        │    │

│  │  │                       │  │                        │        │    │

│  │  │ Favorite: Matching    │  │ Improvement: +15%      │        │    │

│  │  │ (played 45 times)     │  │ (last 30 days)         │        │    │

│  │  └───────────────────────┘  └───────────────────────┘        │    │

│  │                                                                │    │

│  └────────────────────────────────────────────────────────────────┘    │

│                                                                          │

│  ┌────────────────────────────────────────────────────────────────┐    │

│  │  🏅 ACHIEVEMENTS (12/25)                                      │    │

│  │                                                                │    │

│  │  ┌──────┐ ┌──────┐ ┌──────┐ ┌──────┐ ┌──────┐ ┌──────┐    │    │

│  │  │ 🌟   │ │ 📚   │ │ 🔥   │ │ 🎯   │ │ 🎮   │ │ 🔒   │    │    │

│  │  │First │ │Book  │ │On    │ │Sharp │ │Game  │ │???   │    │    │

│  │  │Step  │ │worm  │ │Fire  │ │Shoot │ │Master│ │      │    │    │

│  │  │ ✅   │ │ ✅   │ │ ✅   │ │ ✅   │ │ ✅   │ │ 🔒   │    │    │

│  │  └──────┘ └──────┘ └──────┘ └──────┘ └──────┘ └──────┘    │    │

│  │                                                                │    │

│  │  [Xem tất cả achievements →]                                  │    │

│  └────────────────────────────────────────────────────────────────┘    │

│                                                                          │

└──────────────────────────────────────────────────────────────────────────┘

-----
1. # <a name="_toc225239649"></a>**KẾ HOẠCH PHÁT TRIỂN (DEVELOPMENT ROADMAP)**
   ┌──────────────────────────────────────────────────────────────────────────┐

   │                      DEVELOPMENT ROADMAP                                  │

   ├──────────────────────────────────────────────────────────────────────────┤

   │                                                                           │

   │  ══════════════════════════════════════════════════════════════════════   │

   │  PHASE 1: MVP (Minimum Viable Product)              ⏱️ 8-10 tuần       │

   │  ══════════════════════════════════════════════════════════════════════   │

   │                                                                           │

   │  Sprint 1-2 (Tuần 1-4): Foundation                                       │

   │  ┌────────────────────────────────────────────────────────────────┐     │

   │  │                                                                 │     │

   │  │  ✅ Week 1-2: Project Setup & Auth                             │     │

   │  │  ├── Setup project (Next.js + NestJS + PostgreSQL + Redis)    │     │

   │  │  ├── Docker environment                                        │     │

   │  │  ├── Database schema & migrations                              │     │

   │  │  ├── User registration & login (email + password)             │     │

   │  │  ├── JWT authentication (access + refresh token)              │     │

   │  │  ├── Email verification                                        │     │

   │  │  ├── Password reset flow                                       │     │

   │  │  ├── Basic RBAC (Learner, Teacher, Admin roles)               │     │

   │  │  └── Basic UI layout & navigation                              │     │

   │  │                                                                 │     │

   │  │  ✅ Week 3-4: Flashcard Core                                   │     │

   │  │  ├── CRUD Deck (create, read, update, delete)                 │     │

   │  │  ├── CRUD Flashcard (with image & audio upload)               │     │

   │  │  ├── Deck categories & tags                                    │     │

   │  │  ├── Deck listing & search                                     │     │

   │  │  ├── Flashcard learning view (flip card UI)                   │     │

   │  │  ├── Import cards from CSV                                     │     │

   │  │  └── Basic user profile                                        │     │

   │  │                                                                 │     │

   │  └────────────────────────────────────────────────────────────────┘     │

   │                                                                           │

   │  Sprint 3-4 (Tuần 5-8): Core Learning Features                          │

   │  ┌────────────────────────────────────────────────────────────────┐     │

   │  │                                                                 │     │

   │  │  ✅ Week 5-6: SRS Engine & i18n                                │     │

   │  │  ├── SM-2 algorithm implementation                             │     │

   │  │  ├── Leitner box system                                        │     │

   │  │  ├── Card review flow (Again/Hard/Good/Easy)                  │     │

   │  │  ├── Next review date calculation                              │     │

   │  │  ├── Learning session tracking                                 │     │

   │  │  ├── Due cards API                                             │     │

   │  │  ├── i18n setup (Vietnamese + English)                        │     │

   │  │  ├── Language switcher UI                                      │     │

   │  │  └── Translation files structure                               │     │

   │  │                                                                 │     │

   │  │  ✅ Week 7-8: Basic Games & Tests                              │     │

   │  │  ├── Multiple Choice game                                      │     │

   │  │  ├── Matching Pairs game                                       │     │

   │  │  ├── Flashcard Sprint game                                     │     │

   │  │  ├── Auto-generate test questions                              │     │

   │  │  ├── Basic Mini Test (vocabulary test)                         │     │

   │  │  ├── Test result & review                                      │     │

   │  │  └── Basic score tracking                                      │     │

   │  │                                                                 │     │

   │  └────────────────────────────────────────────────────────────────┘     │

   │                                                                           │

   │  Sprint 5 (Tuần 9-10): MVP Polish & Launch                              │

   │  ┌────────────────────────────────────────────────────────────────┐     │

   │  │                                                                 │     │

   │  │  ✅ Week 9-10: Admin & Notification Basics                     │     │

   │  │  ├── Admin dashboard (basic stats)                             │     │

   │  │  ├── User management (list, ban/unban)                        │     │

   │  │  ├── Teacher application & approval flow                      │     │

   │  │  ├── In-app notifications                                      │     │

   │  │  ├── Basic email reminders (cron job)                         │     │

   │  │  ├── User streak tracking                                      │     │

   │  │  ├── Basic learning statistics                                 │     │

   │  │  ├── Bug fixes & UI polish                                     │     │

   │  │  ├── Responsive design check                                   │     │

   │  │  ├── Basic testing (unit + integration)                       │     │

   │  │  └── MVP Deployment                                            │     │

   │  │                                                                 │     │

   │  └────────────────────────────────────────────────────────────────┘     │

   │                                                                           │

   │  ┌─────────────────────────────────────────────────┐                    │

   │  │  📦 MVP DELIVERABLES:                           │                    │

   │  │  ✅ User auth (register, login, roles)          │                    │

   │  │  ✅ Flashcard CRUD + learning                    │                    │

   │  │  ✅ SRS algorithm (SM-2)                         │                    │

   │  │  ✅ 3 Mini Games                                 │                    │

   │  │  ✅ Basic Mini Test                              │                    │

   │  │  ✅ i18n (VI + EN)                               │                    │

   │  │  ✅ Basic Admin panel                            │                    │

   │  │  ✅ Teacher approval flow                        │                    │

   │  │  ✅ Basic notifications + reminders              │                    │

   │  │  ✅ User stats + streak                          │                    │

   │  └─────────────────────────────────────────────────┘                    │

   │                                                                           │

   │                                                                           │

   │  ══════════════════════════════════════════════════════════════════════   │

   │  PHASE 2: Enhanced Features                         ⏱️ 6-8 tuần        │

   │  ══════════════════════════════════════════════════════════════════════   │

   │                                                                           │

   │  ┌────────────────────────────────────────────────────────────────┐     │

   │  │                                                                 │     │

   │  │  📌 Week 11-12: Advanced Games & Gamification                  │     │

   │  │  ├── Word Scramble game                                        │     │

   │  │  ├── Listening Challenge game                                   │     │

   │  │  ├── Typing Practice game                                       │     │

   │  │  ├── Memory Flip game                                           │     │

   │  │  ├── Daily Challenge system                                     │     │

   │  │  ├── XP & Level system                                          │     │

   │  │  ├── Achievements / Badges                                      │     │

   │  │  ├── Leaderboard (weekly/monthly/all-time)                     │     │

   │  │  └── Game difficulty levels                                     │     │

   │  │                                                                 │     │

   │  │  📌 Week 13-14: Teacher & Classroom                            │     │

   │  │  ├── Classroom creation & management                           │     │

   │  │  ├── Student invitation (code/link)                             │     │

   │  │  ├── Assign decks to classroom                                  │     │

   │  │  ├── Create tests for classroom                                 │     │

   │  │  ├── Student progress tracking                                  │     │

   │  │  ├── Class statistics & reports                                 │     │

   │  │  └── Export reports (PDF/Excel)                                 │     │

   │  │                                                                 │     │

   │  │  📌 Week 15-16: Advanced Notifications & Tests                 │     │

   │  │  ├── Push notifications (Browser/PWA)                          │     │

   │  │  ├── Advanced reminder settings                                 │     │

   │  │  ├── Smart reminder (based on user habits)                     │     │

   │  │  ├── Context test (fill in blank)                              │     │

   │  │  ├── Spelling test                                              │     │

   │  │  ├── Comprehensive test (mixed types)                          │     │

   │  │  ├── Test history & comparison                                  │     │

   │  │  └── Daily Quiz auto-generation                                 │     │

   │  │                                                                 │     │

   │  │  📌 Week 17-18: Admin Advanced & Analytics                     │     │

   │  │  ├── Full RBAC (custom roles + permissions)                    │     │

   │  │  ├── Content moderation (deck approval, reports)               │     │

   │  │  ├── Advanced analytics dashboard                               │     │

   │  │  ├── Audit logs                                                 │     │

   │  │  ├── System configuration panel                                 │     │

   │  │  ├── Feature flags                                              │     │

   │  │  ├── Language management (add/edit languages)                  │     │

   │  │  └── Translation management UI                                  │     │

   │  │                                                                 │     │

   │  └────────────────────────────────────────────────────────────────┘     │

   │                                                                           │

   │                                                                           │

   │  ══════════════════════════════════════════════════════════════════════   │

   │  PHASE 3: Social & Advanced                        ⏱️ 6-8 tuần         │

   │  ══════════════════════════════════════════════════════════════════════   │

   │                                                                           │

   │  ┌────────────────────────────────────────────────────────────────┐     │

   │  │                                                                 │     │

   │  │  📌 Week 19-20: Social Features                                │     │

   │  │  ├── Public deck library                                        │     │

   │  │  ├── Deck rating & review                                       │     │

   │  │  ├── Clone / Fork decks                                         │     │

   │  │  ├── Share deck (link / QR code)                                │     │

   │  │  ├── Bookmark / Favorite decks                                  │     │

   │  │  ├── User public profile                                        │     │

   │  │  └── Follow users                                                │     │

   │  │                                                                 │     │

   │  │  📌 Week 21-22: PWA & Performance                              │     │

   │  │  ├── Progressive Web App (PWA) setup                            │     │

   │  │  ├── Offline learning support                                    │     │

   │  │  ├── Service Worker caching                                      │     │

   │  │  ├── Performance optimization                                    │     │

   │  │  ├── Image/Audio lazy loading & compression                     │     │

   │  │  ├── Redis caching strategy                                      │     │

   │  │  └── Database query optimization                                 │     │

   │  │                                                                 │     │

   │  │  📌 Week 23-24: OAuth & Advanced Auth                          │     │

   │  │  ├── Google OAuth login                                          │     │

   │  │  ├── Facebook OAuth login                                        │     │

   │  │  ├── Two-factor authentication (2FA)                             │     │

   │  │  ├── Session management (multi-device)                           │     │

   │  │  ├── Account linking                                              │     │

   │  │  └── Account deletion (GDPR compliance)                          │     │

   │  │                                                                 │     │

   │  │  📌 Week 25-26: Multiplayer & Real-time                        │     │

   │  │  ├── Multiplayer game mode (1v1)                                 │     │

   │  │  ├── Real-time WebSocket for games                               │     │

   │  │  ├── Live leaderboard updates                                    │     │

   │  │  ├── Additional languages (JA, KO, FR...)                       │     │

   │  │  └── Dictionary API integration (auto-fill word data)           │     │

   │  │                                                                 │     │

   │  └────────────────────────────────────────────────────────────────┘     │

   │                                                                           │

   │                                                                           │

   │  ══════════════════════════════════════════════════════════════════════   │

   │  PHASE 4: Scale & Optimize                         ⏱️ Ongoing          │

   │  ══════════════════════════════════════════════════════════════════════   │

   │                                                                           │

   │  ┌────────────────────────────────────────────────────────────────┐     │

   │  │                                                                 │     │

   │  │  📌 Continuous Improvements                                     │     │

   │  │  ├── E2E testing (Playwright)                                   │     │

   │  │  ├── CI/CD pipeline optimization                                 │     │

   │  │  ├── Monitoring & alerting (Sentry + Grafana)                   │     │

   │  │  ├── Database scaling (read replicas)                            │     │

   │  │  ├── CDN optimization                                            │     │

   │  │  ├── API rate limiting & abuse prevention                        │     │

   │  │  ├── AI-powered features                                        │     │

   │  │  │   ├── AI gợi ý từ vựng liên quan                            │     │

   │  │  │   ├── AI tạo câu ví dụ tự động                              │     │

   │  │  │   ├── AI phân tích điểm yếu của user                        │     │

   │  │  │   └── Chatbot hỗ trợ học tập                                │     │

   │  │  │                                                              │     │

   │  │  ├── Mobile App (React Native)                                  │     │

   │  │  │   ├── iOS & Android native app                               │     │

   │  │  │   ├── Offline mode full support                              │     │

   │  │  │   ├── Native push notifications                              │     │

   │  │  │   └── Biometric authentication                               │     │

   │  │  │                                                              │     │

   │  │  ├── Advanced Analytics                                          │     │

   │  │  │   ├── Machine learning cho SRS optimization                  │     │

   │  │  │   ├── Predictive analytics (dự đoán churn)                   │     │

   │  │  │   ├── A/B testing framework                                   │     │

   │  │  │   └── Custom dashboard builder                                │     │

   │  │  │                                                              │     │

   │  │  ├── Monetization (nếu cần)                                     │     │

   │  │  │   ├── Premium subscription plan                               │     │

   │  │  │   ├── Payment integration (Stripe/VNPay)                     │     │

   │  │  │   ├── Premium decks marketplace                               │     │

   │  │  │   └── Teacher premium features                                │     │

   │  │  │                                                              │     │

   │  │  └── Infrastructure                                              │     │

   │  │      ├── Kubernetes deployment                                   │     │

   │  │      ├── Auto-scaling                                            │     │

   │  │      ├── Multi-region deployment                                 │     │

   │  │      ├── Backup & disaster recovery                              │     │

   │  │      └── Security audit & penetration testing                    │     │

   │  │                                                                 │     │

   │  └────────────────────────────────────────────────────────────────┘     │

   │                                                                           │

   │  ══════════════════════════════════════════════════════════════════════   │

   │  TỔNG TIMELINE                                                           │

   │  ══════════════════════════════════════════════════════════════════════   │

   │                                                                           │

   │  Phase 1 (MVP)        ████████████████████░░░░░░░░░░░░░░░░   10 tuần   │

   │  Phase 2 (Enhanced)   ░░░░░░░░░░░░░░░░░░░█████████████████   8 tuần    │

   │  Phase 3 (Social)     ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██ 8 tuần   │

   │  Phase 4 (Scale)      ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░ Ongoing  │

   │                       ─────────────────────────────────────────────▶    │

   │                       M1   M2   M3   M4   M5   M6   M7   M8+          │

   │                                                                           │

   └──────────────────────────────────────────────────────────────────────────┘

   -----
1. # <a name="_toc225239650"></a>**FOLDER STRUCTURE (CẤU TRÚC THƯ MỤC)**
1. ## <a name="_toc225239651"></a>**Frontend (Next.js)**
┌──────────────────────────────────────────────────────────────────────────┐

│                    FRONTEND FOLDER STRUCTURE                              │

├──────────────────────────────────────────────────────────────────────────┤

│                                                                           │

│  flashlearn-web/                                                         │

│  ├── 📁 public/                                                          │

│  │   ├── 📁 images/                                                      │

│  │   ├── 📁 icons/                                                       │

│  │   ├── 📁 sounds/                    # Game sound effects              │

│  │   ├── manifest.json                 # PWA manifest                    │

│  │   ├── sw.js                         # Service worker                  │

│  │   └── favicon.ico                                                     │

│  │                                                                        │

│  ├── 📁 src/                                                             │

│  │   ├── 📁 app/                       # Next.js 14 App Router          │

│  │   │   ├── 📁 [locale]/             # i18n dynamic locale             │

│  │   │   │   ├── layout.tsx                                              │

│  │   │   │   ├── page.tsx              # Landing page                    │

│  │   │   │   │                                                           │

│  │   │   │   ├── 📁 (auth)/           # Auth group                      │

│  │   │   │   │   ├── login/page.tsx                                      │

│  │   │   │   │   ├── register/page.tsx                                   │

│  │   │   │   │   ├── forgot-password/page.tsx                            │

│  │   │   │   │   ├── reset-password/page.tsx                             │

│  │   │   │   │   └── verify-email/page.tsx                               │

│  │   │   │   │                                                           │

│  │   │   │   ├── 📁 (learner)/        # Learner routes                  │

│  │   │   │   │   ├── dashboard/page.tsx                                  │

│  │   │   │   │   ├── 📁 decks/                                          │

│  │   │   │   │   │   ├── page.tsx          # My decks list              │

│  │   │   │   │   │   ├── create/page.tsx   # Create deck                │

│  │   │   │   │   │   ├── [id]/page.tsx     # Deck detail                │

│  │   │   │   │   │   └── [id]/edit/page.tsx                             │

│  │   │   │   │   │                                                       │

│  │   │   │   │   ├── 📁 learn/                                          │

│  │   │   │   │   │   ├── [deckId]/page.tsx # Learning session           │

│  │   │   │   │   │   └── review/page.tsx   # Review due cards           │

│  │   │   │   │   │                                                       │

│  │   │   │   │   ├── 📁 games/                                          │

│  │   │   │   │   │   ├── page.tsx          # Game hub                   │

│  │   │   │   │   │   ├── matching/page.tsx                               │

│  │   │   │   │   │   ├── quiz/page.tsx                                   │

│  │   │   │   │   │   ├── scramble/page.tsx                               │

│  │   │   │   │   │   ├── sprint/page.tsx                                 │

│  │   │   │   │   │   ├── listening/page.tsx                              │

│  │   │   │   │   │   ├── typing/page.tsx                                 │

│  │   │   │   │   │   └── memory/page.tsx                                 │

│  │   │   │   │   │                                                       │

│  │   │   │   │   ├── 📁 tests/                                          │

│  │   │   │   │   │   ├── page.tsx          # Test list                  │

│  │   │   │   │   │   ├── [id]/page.tsx     # Take test                  │

│  │   │   │   │   │   ├── [id]/result/page.tsx                           │

│  │   │   │   │   │   └── daily-quiz/page.tsx                            │

│  │   │   │   │   │                                                       │

│  │   │   │   │   ├── 📁 stats/                                          │

│  │   │   │   │   │   └── page.tsx          # Personal statistics        │

│  │   │   │   │   │                                                       │

│  │   │   │   │   ├── 📁 classrooms/                                     │

│  │   │   │   │   │   ├── page.tsx          # My classrooms              │

│  │   │   │   │   │   ├── join/page.tsx     # Join classroom             │

│  │   │   │   │   │   └── [id]/page.tsx     # Classroom detail           │

│  │   │   │   │   │                                                       │

│  │   │   │   │   ├── 📁 explore/                                        │

│  │   │   │   │   │   └── page.tsx          # Public decks library       │

│  │   │   │   │   │                                                       │

│  │   │   │   │   ├── 📁 settings/                                       │

│  │   │   │   │   │   ├── page.tsx          # General settings           │

│  │   │   │   │   │   ├── profile/page.tsx                                │

│  │   │   │   │   │   ├── reminders/page.tsx                              │

│  │   │   │   │   │   ├── learning/page.tsx # SRS settings               │

│  │   │   │   │   │   ├── security/page.tsx                               │

│  │   │   │   │   │   └── privacy/page.tsx                                │

│  │   │   │   │   │                                                       │

│  │   │   │   │   └── 📁 leaderboard/                                    │

│  │   │   │   │       └── page.tsx                                        │

│  │   │   │   │                                                           │

│  │   │   │   ├── 📁 (teacher)/        # Teacher routes                  │

│  │   │   │   │   ├── teacher/                                            │

│  │   │   │   │   │   ├── dashboard/page.tsx                              │

│  │   │   │   │   │   ├── apply/page.tsx    # Apply for teacher          │

│  │   │   │   │   │   ├── 📁 classrooms/                                 │

│  │   │   │   │   │   │   ├── page.tsx                                    │

│  │   │   │   │   │   │   ├── create/page.tsx                             │

│  │   │   │   │   │   │   ├── [id]/page.tsx                               │

│  │   │   │   │   │   │   ├── [id]/students/page.tsx                      │

│  │   │   │   │   │   │   └── [id]/progress/page.tsx                      │

│  │   │   │   │   │   ├── 📁 tests/                                      │

│  │   │   │   │   │   │   ├── create/page.tsx                             │

│  │   │   │   │   │   │   └── [id]/results/page.tsx                       │

│  │   │   │   │   │   └── stats/page.tsx                                  │

│  │   │   │   │   │                                                       │

│  │   │   │   └── 📁 (admin)/          # Admin routes                    │

│  │   │   │       ├── admin/                                              │

│  │   │   │       │   ├── dashboard/page.tsx                              │

│  │   │   │       │   ├── 📁 users/                                      │

│  │   │   │       │   │   ├── page.tsx                                    │

│  │   │   │       │   │   └── [id]/page.tsx                               │

│  │   │   │       │   ├── 📁 teacher-requests/                           │

│  │   │   │       │   │   ├── page.tsx                                    │

│  │   │   │       │   │   └── [id]/page.tsx                               │

│  │   │   │       │   ├── 📁 content/                                    │

│  │   │   │       │   │   ├── decks/page.tsx                              │

│  │   │   │       │   │   ├── categories/page.tsx                         │

│  │   │   │       │   │   ├── tags/page.tsx                               │

│  │   │   │       │   │   └── reports/page.tsx                            │

│  │   │   │       │   ├── 📁 languages/                                  │

│  │   │   │       │   │   ├── page.tsx                                    │

│  │   │   │       │   │   └── translations/page.tsx                       │

│  │   │   │       │   ├── 📁 roles/                                      │

│  │   │   │       │   │   └── page.tsx                                    │

│  │   │   │       │   ├── 📁 config/                                     │

│  │   │   │       │   │   └── page.tsx                                    │

│  │   │   │       │   ├── 📁 analytics/                                  │

│  │   │   │       │   │   └── page.tsx                                    │

│  │   │   │       │   └── 📁 logs/                                       │

│  │   │   │       │       └── page.tsx                                    │

│  │   │   │       │                                                       │

│  │   │   └── 📁 api/               # Next.js API routes (if needed)    │

│  │   │                                                                    │

│  │   ├── 📁 components/            # Shared components                  │

│  │   │   ├── 📁 ui/                # Base UI (shadcn/ui)               │

│  │   │   │   ├── button.tsx                                              │

│  │   │   │   ├── input.tsx                                               │

│  │   │   │   ├── dialog.tsx                                              │

│  │   │   │   ├── dropdown-menu.tsx                                       │

│  │   │   │   ├── card.tsx                                                │

│  │   │   │   ├── toast.tsx                                               │

│  │   │   │   ├── table.tsx                                               │

│  │   │   │   ├── tabs.tsx                                                │

│  │   │   │   ├── badge.tsx                                               │

│  │   │   │   ├── switch.tsx                                              │

│  │   │   │   ├── slider.tsx                                              │

│  │   │   │   └── ...                                                     │

│  │   │   │                                                               │

│  │   │   ├── 📁 layout/                                                 │

│  │   │   │   ├── header.tsx                                              │

│  │   │   │   ├── sidebar.tsx                                             │

│  │   │   │   ├── footer.tsx                                              │

│  │   │   │   ├── admin-layout.tsx                                        │

│  │   │   │   ├── learner-layout.tsx                                      │

│  │   │   │   ├── teacher-layout.tsx                                      │

│  │   │   │   └── language-switcher.tsx                                   │

│  │   │   │                                                               │

│  │   │   ├── 📁 flashcard/                                              │

│  │   │   │   ├── flashcard-viewer.tsx      # Flip card component        │

│  │   │   │   ├── flashcard-form.tsx        # Create/Edit card           │

│  │   │   │   ├── deck-card.tsx             # Deck preview card          │

│  │   │   │   ├── deck-list.tsx                                           │

│  │   │   │   ├── srs-rating-buttons.tsx    # Again/Hard/Good/Easy       │

│  │   │   │   ├── leitner-boxes.tsx         # Visual boxes               │

│  │   │   │   └── import-csv-modal.tsx                                    │

│  │   │   │                                                               │

│  │   │   ├── 📁 games/                                                  │

│  │   │   │   ├── matching-board.tsx                                      │

│  │   │   │   ├── quiz-question.tsx                                       │

│  │   │   │   ├── word-scramble.tsx                                       │

│  │   │   │   ├── sprint-card.tsx                                         │

│  │   │   │   ├── listening-player.tsx                                    │

│  │   │   │   ├── typing-input.tsx                                        │

│  │   │   │   ├── memory-grid.tsx                                         │

│  │   │   │   ├── game-timer.tsx                                          │

│  │   │   │   ├── game-score.tsx                                          │

│  │   │   │   ├── game-result.tsx                                         │

│  │   │   │   └── combo-counter.tsx                                       │

│  │   │   │                                                               │

│  │   │   ├── 📁 test/                                                   │

│  │   │   │   ├── test-question.tsx                                       │

│  │   │   │   ├── test-progress.tsx                                       │

│  │   │   │   ├── test-result.tsx                                         │

│  │   │   │   └── question-map.tsx                                        │

│  │   │   │                                                               │

│  │   │   ├── 📁 stats/                                                  │

│  │   │   │   ├── streak-counter.tsx                                      │

│  │   │   │   ├── xp-progress.tsx                                         │

│  │   │   │   ├── activity-heatmap.tsx                                    │

│  │   │   │   ├── learning-chart.tsx                                      │

│  │   │   │   └── achievement-badge.tsx                                   │

│  │   │   │                                                               │

│  │   │   └── 📁 common/                                                 │

│  │   │       ├── loading-spinner.tsx                                     │

│  │   │       ├── empty-state.tsx                                         │

│  │   │       ├── error-boundary.tsx                                      │

│  │   │       ├── pagination.tsx                                          │

│  │   │       ├── search-bar.tsx                                          │

│  │   │       ├── file-upload.tsx                                         │

│  │   │       ├── audio-player.tsx                                        │

│  │   │       ├── notification-bell.tsx                                   │

│  │   │       ├── theme-toggle.tsx                                        │

│  │   │       └── confirm-dialog.tsx                                      │

│  │   │                                                                    │

│  │   ├── 📁 hooks/                  # Custom React hooks                │

│  │   │   ├── useAuth.ts                                                  │

│  │   │   ├── useFlashcard.ts                                             │

│  │   │   ├── useSRS.ts                                                   │

│  │   │   ├── useGame.ts                                                  │

│  │   │   ├── useNotification.ts                                          │

│  │   │   ├── useTimer.ts                                                 │

│  │   │   ├── useAudio.ts                                                 │

│  │   │   ├── useLocale.ts                                                │

│  │   │   ├── useDebounce.ts                                              │

│  │   │   └── useMediaQuery.ts                                            │

│  │   │                                                                    │

│  │   ├── 📁 stores/                 # Zustand stores                    │

│  │   │   ├── authStore.ts                                                │

│  │   │   ├── flashcardStore.ts                                           │

│  │   │   ├── gameStore.ts                                                │

│  │   │   ├── notificationStore.ts                                        │

│  │   │   └── settingsStore.ts                                            │

│  │   │                                                                    │

│  │   ├── 📁 services/              # API service layer                  │

│  │   │   ├── api.ts                 # Axios instance                    │

│  │   │   ├── authService.ts                                              │

│  │   │   ├── deckService.ts                                              │

│  │   │   ├── flashcardService.ts                                         │

│  │   │   ├── learningService.ts                                          │

│  │   │   ├── gameService.ts                                              │

│  │   │   ├── testService.ts                                              │

│  │   │   ├── notificationService.ts                                      │

│  │   │   ├── userService.ts                                              │

│  │   │   ├── teacherService.ts                                           │

│  │   │   └── adminService.ts                                             │

│  │   │                                                                    │

│  │   ├── 📁 lib/                    # Utilities                         │

│  │   │   ├── utils.ts                                                    │

│  │   │   ├── srs-algorithm.ts       # SM-2 algorithm (client)          │

│  │   │   ├── date-utils.ts                                               │

│  │   │   ├── format.ts                                                   │

│  │   │   ├── validation.ts                                               │

│  │   │   └── constants.ts                                                │

│  │   │                                                                    │

│  │   ├── 📁 types/                  # TypeScript types                  │

│  │   │   ├── user.ts                                                     │

│  │   │   ├── deck.ts                                                     │

│  │   │   ├── flashcard.ts                                                │

│  │   │   ├── game.ts                                                     │

│  │   │   ├── test.ts                                                     │

│  │   │   ├── notification.ts                                             │

│  │   │   └── api.ts                                                      │

│  │   │                                                                    │

│  │   ├── 📁 locales/               # Translation files                  │

│  │   │   ├── vi.json                                                     │

│  │   │   ├── en.json                                                     │

│  │   │   ├── ja.json                                                     │

│  │   │   └── ko.json                                                     │

│  │   │                                                                    │

│  │   └── 📁 styles/                                                      │

│  │       └── globals.css                                                 │

│  │                                                                        │

│  ├── .env.local                                                          │

│  ├── .env.production                                                     │

│  ├── next.config.js                                                      │

│  ├── tailwind.config.ts                                                  │

│  ├── tsconfig.json                                                       │

│  ├── package.json                                                        │

│  ├── Dockerfile                                                          │

│  └── docker-compose.yml                                                  │

│                                                                           │

└──────────────────────────────────────────────────────────────────────────┘
1. ## <a name="_toc225239652"></a>**Backend (NestJS)**
┌──────────────────────────────────────────────────────────────────────────┐

│                    BACKEND FOLDER STRUCTURE                                │

├──────────────────────────────────────────────────────────────────────────┤

│                                                                           │

│  flashlearn-api/                                                         │

│  ├── 📁 prisma/                                                          │

│  │   ├── schema.prisma               # Database schema                  │

│  │   ├── 📁 migrations/              # Migration files                  │

│  │   └── 📁 seeds/                   # Seed data                        │

│  │       ├── seed.ts                                                     │

│  │       ├── users.seed.ts                                               │

│  │       ├── categories.seed.ts                                          │

│  │       ├── achievements.seed.ts                                        │

│  │       └── languages.seed.ts                                           │

│  │                                                                        │

│  ├── 📁 src/                                                             │

│  │   ├── main.ts                      # Application entry point         │

│  │   ├── app.module.ts                # Root module                     │

│  │   │                                                                    │

│  │   ├── 📁 common/                   # Shared resources                │

│  │   │   ├── 📁 decorators/                                              │

│  │   │   │   ├── roles.decorator.ts                                      │

│  │   │   │   ├── current-user.decorator.ts                               │

│  │   │   │   ├── permissions.decorator.ts                                │

│  │   │   │   └── api-pagination.decorator.ts                             │

│  │   │   │                                                               │

│  │   │   ├── 📁 guards/                                                 │

│  │   │   │   ├── jwt-auth.guard.ts                                       │

│  │   │   │   ├── roles.guard.ts                                          │

│  │   │   │   ├── permissions.guard.ts                                    │

│  │   │   │   └── throttle.guard.ts                                       │

│  │   │   │                                                               │

│  │   │   ├── 📁 interceptors/                                           │

│  │   │   │   ├── transform.interceptor.ts                                │

│  │   │   │   ├── logging.interceptor.ts                                  │

│  │   │   │   └── timeout.interceptor.ts                                  │

│  │   │   │                                                               │

│  │   │   ├── 📁 filters/                                                │

│  │   │   │   ├── http-exception.filter.ts                                │

│  │   │   │   └── all-exceptions.filter.ts                                │

│  │   │   │                                                               │

│  │   │   ├── 📁 pipes/                                                  │

│  │   │   │   └── validation.pipe.ts                                      │

│  │   │   │                                                               │

│  │   │   ├── 📁 dto/                                                    │

│  │   │   │   ├── pagination.dto.ts                                       │

│  │   │   │   └── api-response.dto.ts                                     │

│  │   │   │                                                               │

│  │   │   ├── 📁 interfaces/                                             │

│  │   │   │   ├── pagination.interface.ts                                 │

│  │   │   │   └── jwt-payload.interface.ts                                │

│  │   │   │                                                               │

│  │   │   ├── 📁 enums/                                                  │

│  │   │   │   ├── role.enum.ts                                            │

│  │   │   │   ├── card-status.enum.ts                                     │

│  │   │   │   ├── review-rating.enum.ts                                   │

│  │   │   │   ├── game-type.enum.ts                                       │

│  │   │   │   ├── test-type.enum.ts                                       │

│  │   │   │   └── notification-type.enum.ts                               │

│  │   │   │                                                               │

│  │   │   └── 📁 utils/                                                  │

│  │   │       ├── hash.util.ts                                            │

│  │   │       ├── date.util.ts                                            │

│  │   │       └── string.util.ts                                          │

│  │   │                                                                    │

│  │   ├── 📁 modules/                  # Feature modules                 │

│  │   │   │                                                               │

│  │   │   ├── 📁 auth/                                                   │

│  │   │   │   ├── auth.module.ts                                          │

│  │   │   │   ├── auth.controller.ts                                      │

│  │   │   │   ├── auth.service.ts                                         │

│  │   │   │   ├── 📁 dto/                                                │

│  │   │   │   │   ├── register.dto.ts                                     │

│  │   │   │   │   ├── login.dto.ts                                        │

│  │   │   │   │   ├── forgot-password.dto.ts                              │

│  │   │   │   │   └── reset-password.dto.ts                               │

│  │   │   │   ├── 📁 strategies/                                         │

│  │   │   │   │   ├── jwt.strategy.ts                                     │

│  │   │   │   │   ├── jwt-refresh.strategy.ts                             │

│  │   │   │   │   ├── google.strategy.ts                                  │

│  │   │   │   │   └── facebook.strategy.ts                                │

│  │   │   │   └── 📁 tests/                                              │

│  │   │   │       ├── auth.controller.spec.ts                             │

│  │   │   │       └── auth.service.spec.ts                                │

│  │   │   │                                                               │

│  │   │   ├── 📁 users/                                                   │

│  │   │   │   ├── users.module.ts                                         │

│  │   │   │   ├── users.controller.ts                                     │

│  │   │   │   ├── users.service.ts                                        │

│  │   │   │   ├── 📁 dto/                                                │

│  │   │   │   │   ├── update-profile.dto.ts                               │

│  │   │   │   │   ├── update-settings.dto.ts                              │

│  │   │   │   │   └── update-avatar.dto.ts                                │

│  │   │   │   └── 📁 tests/                                              │

│  │   │   │       ├── users.controller.spec.ts                            │

│  │   │   │       └── users.service.spec.ts                               │

│  │   │   │                                                               │

│  │   │   ├── 📁 decks/                                                   │

│  │   │   │   ├── decks.module.ts                                         │

│  │   │   │   ├── decks.controller.ts                                     │

│  │   │   │   ├── decks.service.ts                                        │

│  │   │   │   ├── 📁 dto/                                                │

│  │   │   │   │   ├── create-deck.dto.ts                                  │

│  │   │   │   │   ├── update-deck.dto.ts                                  │

│  │   │   │   │   ├── query-deck.dto.ts                                   │

│  │   │   │   │   ├── rate-deck.dto.ts                                    │

│  │   │   │   │   └── import-cards.dto.ts                                 │

│  │   │   │   └── 📁 tests/                                              │

│  │   │   │       ├── decks.controller.spec.ts                            │

│  │   │   │       └── decks.service.spec.ts                               │

│  │   │   │                                                               │

│  │   │   ├── 📁 flashcards/                                             │

│  │   │   │   ├── flashcards.module.ts                                    │

│  │   │   │   ├── flashcards.controller.ts                                │

│  │   │   │   ├── flashcards.service.ts                                   │

│  │   │   │   ├── 📁 dto/                                                │

│  │   │   │   │   ├── create-flashcard.dto.ts                             │

│  │   │   │   │   ├── update-flashcard.dto.ts                             │

│  │   │   │   │   └── bulk-create-flashcard.dto.ts                        │

│  │   │   │   └── 📁 tests/                                              │

│  │   │   │       └── flashcards.service.spec.ts                          │

│  │   │   │                                                               │

│  │   │   ├── 📁 learning/                                               │

│  │   │   │   ├── learning.module.ts                                      │

│  │   │   │   ├── learning.controller.ts                                  │

│  │   │   │   ├── learning.service.ts                                     │

│  │   │   │   ├── srs-algorithm.service.ts    # SM-2 Core                │

│  │   │   │   ├── 📁 dto/                                                │

│  │   │   │   │   ├── review-card.dto.ts                                  │

│  │   │   │   │   ├── session-complete.dto.ts                             │

│  │   │   │   │   └── srs-settings.dto.ts                                 │

│  │   │   │   └── 📁 tests/                                              │

│  │   │   │       ├── learning.service.spec.ts                            │

│  │   │   │       └── srs-algorithm.service.spec.ts                       │

│  │   │   │                                                               │

│  │   │   ├── 📁 games/                                                   │

│  │   │   │   ├── games.module.ts                                         │

│  │   │   │   ├── games.controller.ts                                     │

│  │   │   │   ├── games.service.ts                                        │

│  │   │   │   ├── game-engine.service.ts      # Game logic              │

│  │   │   │   ├── 📁 engines/                 # Từng loại game          │

│  │   │   │   │   ├── matching.engine.ts                                  │

│  │   │   │   │   ├── quiz.engine.ts                                      │

│  │   │   │   │   ├── scramble.engine.ts                                  │

│  │   │   │   │   ├── sprint.engine.ts                                    │

│  │   │   │   │   ├── listening.engine.ts                                 │

│  │   │   │   │   ├── typing.engine.ts                                    │

│  │   │   │   │   └── memory.engine.ts                                    │

│  │   │   │   ├── 📁 dto/                                                │

│  │   │   │   │   ├── start-game.dto.ts                                   │

│  │   │   │   │   ├── submit-answer.dto.ts                                │

│  │   │   │   │   └── end-game.dto.ts                                     │

│  │   │   │   └── 📁 tests/                                              │

│  │   │   │       ├── games.service.spec.ts                               │

│  │   │   │       └── game-engine.service.spec.ts                         │

│  │   │   │                                                               │

│  │   │   ├── 📁 tests/                       # Mini Test module         │

│  │   │   │   ├── tests.module.ts                                         │

│  │   │   │   ├── tests.controller.ts                                     │

│  │   │   │   ├── tests.service.ts                                        │

│  │   │   │   ├── question-generator.service.ts  # Auto gen questions    │

│  │   │   │   ├── 📁 generators/                                         │

│  │   │   │   │   ├── multiple-choice.generator.ts                        │

│  │   │   │   │   ├── fill-blank.generator.ts                             │

│  │   │   │   │   ├── listening.generator.ts                              │

│  │   │   │   │   ├── spelling.generator.ts                               │

│  │   │   │   │   └── image-based.generator.ts                            │

│  │   │   │   ├── 📁 dto/                                                │

│  │   │   │   │   ├── create-test.dto.ts                                  │

│  │   │   │   │   ├── submit-test.dto.ts                                  │

│  │   │   │   │   └── auto-generate-test.dto.ts                           │

│  │   │   │   └── 📁 tests/                                              │

│  │   │   │       ├── tests.service.spec.ts                               │

│  │   │   │       └── question-generator.service.spec.ts                  │

│  │   │   │                                                               │

│  │   │   ├── 📁 notifications/                                          │

│  │   │   │   ├── notifications.module.ts                                 │

│  │   │   │   ├── notifications.controller.ts                             │

│  │   │   │   ├── notifications.service.ts                                │

│  │   │   │   ├── notifications.gateway.ts    # WebSocket gateway        │

│  │   │   │   ├── 📁 channels/                                           │

│  │   │   │   │   ├── email.channel.ts                                    │

│  │   │   │   │   ├── push.channel.ts                                     │

│  │   │   │   │   └── in-app.channel.ts                                   │

│  │   │   │   ├── 📁 dto/                                                │

│  │   │   │   │   ├── update-reminder.dto.ts                              │

│  │   │   │   │   └── subscribe-push.dto.ts                               │

│  │   │   │   └── 📁 tests/                                              │

│  │   │   │       └── notifications.service.spec.ts                       │

│  │   │   │                                                               │

│  │   │   ├── 📁 reminders/                                              │

│  │   │   │   ├── reminders.module.ts                                     │

│  │   │   │   ├── reminders.service.ts                                    │

│  │   │   │   ├── reminder-scheduler.service.ts  # Cron jobs             │

│  │   │   │   ├── 📁 jobs/                                               │

│  │   │   │   │   ├── review-reminder.job.ts                              │

│  │   │   │   │   ├── streak-reminder.job.ts                              │

│  │   │   │   │   ├── daily-quiz-reminder.job.ts                          │

│  │   │   │   │   ├── streak-reset.job.ts                                 │

│  │   │   │   │   └── stats-aggregation.job.ts                            │

│  │   │   │   └── 📁 tests/                                              │

│  │   │   │       └── reminder-scheduler.service.spec.ts                  │

│  │   │   │                                                               │

│  │   │   ├── 📁 classrooms/                                             │

│  │   │   │   ├── classrooms.module.ts                                    │

│  │   │   │   ├── classrooms.controller.ts                                │

│  │   │   │   ├── classrooms.service.ts                                   │

│  │   │   │   ├── 📁 dto/                                                │

│  │   │   │   │   ├── create-classroom.dto.ts                             │

│  │   │   │   │   ├── update-classroom.dto.ts                             │

│  │   │   │   │   ├── assign-deck.dto.ts                                  │

│  │   │   │   │   └── join-classroom.dto.ts                               │

│  │   │   │   └── 📁 tests/                                              │

│  │   │   │       └── classrooms.service.spec.ts                          │

│  │   │   │                                                               │

│  │   │   ├── 📁 teacher/                                                │

│  │   │   │   ├── teacher.module.ts                                       │

│  │   │   │   ├── teacher.controller.ts                                   │

│  │   │   │   ├── teacher.service.ts                                      │

│  │   │   │   ├── 📁 dto/                                                │

│  │   │   │   │   └── teacher-application.dto.ts                          │

│  │   │   │   └── 📁 tests/                                              │

│  │   │   │       └── teacher.service.spec.ts                             │

│  │   │   │                                                               │

│  │   │   ├── 📁 gamification/                                           │

│  │   │   │   ├── gamification.module.ts                                  │

│  │   │   │   ├── gamification.service.ts                                 │

│  │   │   │   ├── xp.service.ts               # XP calculation          │

│  │   │   │   ├── streak.service.ts           # Streak management        │

│  │   │   │   ├── achievement.service.ts      # Achievement checker      │

│  │   │   │   ├── leaderboard.service.ts      # Leaderboard logic       │

│  │   │   │   └── 📁 tests/                                              │

│  │   │   │       ├── xp.service.spec.ts                                  │

│  │   │   │       ├── streak.service.spec.ts                              │

│  │   │   │       └── achievement.service.spec.ts                         │

│  │   │   │                                                               │

│  │   │   ├── 📁 i18n/                                                   │

│  │   │   │   ├── i18n.module.ts                                          │

│  │   │   │   ├── i18n.controller.ts                                      │

│  │   │   │   ├── i18n.service.ts                                         │

│  │   │   │   ├── 📁 dto/                                                │

│  │   │   │   │   ├── create-language.dto.ts                              │

│  │   │   │   │   ├── update-translation.dto.ts                           │

│  │   │   │   │   └── import-translations.dto.ts                          │

│  │   │   │   └── 📁 tests/                                              │

│  │   │   │       └── i18n.service.spec.ts                                │

│  │   │   │                                                               │

│  │   │   ├── 📁 admin/                                                  │

│  │   │   │   ├── admin.module.ts                                         │

│  │   │   │   ├── 📁 controllers/                                        │

│  │   │   │   │   ├── admin-dashboard.controller.ts                       │

│  │   │   │   │   ├── admin-users.controller.ts                           │

│  │   │   │   │   ├── admin-teacher.controller.ts                         │

│  │   │   │   │   ├── admin-content.controller.ts                         │

│  │   │   │   │   ├── admin-languages.controller.ts                       │

│  │   │   │   │   ├── admin-roles.controller.ts                           │

│  │   │   │   │   ├── admin-config.controller.ts                          │

│  │   │   │   │   └── admin-analytics.controller.ts                       │

│  │   │   │   ├── 📁 services/                                           │

│  │   │   │   │   ├── admin-dashboard.service.ts                          │

│  │   │   │   │   ├── admin-users.service.ts                              │

│  │   │   │   │   ├── admin-content.service.ts                            │

│  │   │   │   │   ├── admin-roles.service.ts                              │

│  │   │   │   │   └── admin-analytics.service.ts                          │

│  │   │   │   ├── 📁 dto/                                                │

│  │   │   │   │   ├── update-user-role.dto.ts                             │

│  │   │   │   │   ├── approve-teacher.dto.ts                              │

│  │   │   │   │   ├── reject-teacher.dto.ts                               │

│  │   │   │   │   ├── create-role.dto.ts                                  │

│  │   │   │   │   ├── update-config.dto.ts                                │

│  │   │   │   │   └── create-category.dto.ts                              │

│  │   │   │   └── 📁 tests/                                              │

│  │   │   │       └── admin-users.service.spec.ts                         │

│  │   │   │                                                               │

│  │   │   ├── 📁 upload/                                                 │

│  │   │   │   ├── upload.module.ts                                        │

│  │   │   │   ├── upload.controller.ts                                    │

│  │   │   │   ├── upload.service.ts                                       │

│  │   │   │   ├── 📁 providers/                                          │

│  │   │   │   │   ├── s3.provider.ts                                      │

│  │   │   │   │   └── cloudinary.provider.ts                              │

│  │   │   │   └── 📁 tests/                                              │

│  │   │   │       └── upload.service.spec.ts                              │

│  │   │   │                                                               │

│  │   │   ├── 📁 email/                                                  │

│  │   │   │   ├── email.module.ts                                         │

│  │   │   │   ├── email.service.ts                                        │

│  │   │   │   ├── 📁 templates/                                          │

│  │   │   │   │   ├── welcome.hbs                                         │

│  │   │   │   │   ├── verify-email.hbs                                    │

│  │   │   │   │   ├── reset-password.hbs                                  │

│  │   │   │   │   ├── review-reminder.hbs                                 │

│  │   │   │   │   ├── streak-reminder.hbs                                 │

│  │   │   │   │   ├── teacher-approved.hbs                                │

│  │   │   │   │   ├── teacher-rejected.hbs                                │

│  │   │   │   │   └── assignment-notification.hbs                         │

│  │   │   │   └── 📁 tests/                                              │

│  │   │   │       └── email.service.spec.ts                               │

│  │   │   │                                                               │

│  │   │   └── 📁 audit-log/                                              │

│  │   │       ├── audit-log.module.ts                                     │

│  │   │       ├── audit-log.service.ts                                    │

│  │   │       └── audit-log.interceptor.ts                                │

│  │   │                                                                    │

│  │   └── 📁 config/                   # Configuration                   │

│  │       ├── app.config.ts                                               │

│  │       ├── database.config.ts                                          │

│  │       ├── redis.config.ts                                             │

│  │       ├── jwt.config.ts                                               │

│  │       ├── mail.config.ts                                              │

│  │       ├── storage.config.ts                                           │

│  │       ├── throttle.config.ts                                          │

│  │       └── swagger.config.ts                                           │

│  │                                                                        │

│  ├── 📁 test/                         # E2E tests                       │

│  │   ├── app.e2e-spec.ts                                                 │

│  │   ├── auth.e2e-spec.ts                                                │

│  │   ├── decks.e2e-spec.ts                                               │

│  │   ├── learning.e2e-spec.ts                                            │

│  │   ├── games.e2e-spec.ts                                               │

│  │   └── jest-e2e.json                                                   │

│  │                                                                        │

│  ├── .env                                                                │

│  ├── .env.production                                                     │

│  ├── nest-cli.json                                                       │

│  ├── tsconfig.json                                                       │

│  ├── package.json                                                        │

│  ├── Dockerfile                                                          │

│  └── docker-compose.yml                                                  │

│                                                                           │

└──────────────────────────────────────────────────────────────────────────┘

-----
1. # <a name="_toc225239653"></a>**DOCKER & DEPLOYMENT**
   ┌──────────────────────────────────────────────────────────────────────────┐

   │                    DOCKER COMPOSE STRUCTURE                                │

   ├──────────────────────────────────────────────────────────────────────────┤

   │                                                                           │

   │  flashlearn/                                                             │

   │  ├── 📁 flashlearn-web/          # Frontend Next.js                     │

   │  │   └── Dockerfile                                                      │

   │  ├── 📁 flashlearn-api/          # Backend NestJS                       │

   │  │   └── Dockerfile                                                      │

   │  ├── 📁 nginx/                   # Reverse Proxy                        │

   │  │   ├── nginx.conf                                                      │

   │  │   └── Dockerfile                                                      │

   │  ├── docker-compose.yml          # Development                          │

   │  ├── docker-compose.prod.yml     # Production                           │

   │  └── .env                                                                │

   │                                                                           │

   │  ┌────────────────────────────────────────────────────────────────┐     │

   │  │  docker-compose.yml                                            │     │

   │  │                                                                 │     │

   │  │  version: '3.8'                                                │     │

   │  │  services:                                                      │     │

   │  │                                                                 │     │

   │  │    ┌──────────────┐                                            │     │

   │  │    │   nginx      │  Port: 80, 443                             │     │

   │  │    │   (Reverse   │  → flashlearn-web:3000                    │     │

   │  │    │    Proxy)    │  → flashlearn-api:4000                    │     │

   │  │    └──────┬───────┘                                            │     │

   │  │           │                                                     │     │

   │  │    ┌──────┴──────────────────────┐                             │     │

   │  │    │                             │                             │     │

   │  │    ▼                             ▼                             │     │

   │  │  ┌──────────────┐  ┌──────────────────┐                       │     │

   │  │  │flashlearn-web│  │ flashlearn-api   │                       │     │

   │  │  │  (Next.js)   │  │   (NestJS)       │                       │     │

   │  │  │  Port: 3000  │  │   Port: 4000     │                       │     │

   │  │  │              │  │                  │                       │     │

   │  │  │  depends\_on: │  │  depends\_on:     │                       │     │

   │  │  │  - api       │  │  - postgres      │                       │     │

   │  │  │              │  │  - redis         │                       │     │

   │  │  └──────────────┘  └───────┬──────────┘                       │     │

   │  │                            │                                   │     │

   │  │                  ┌─────────┼─────────┐                        │     │

   │  │                  │         │         │                        │     │

   │  │                  ▼         ▼         ▼                        │     │

   │  │  ┌───────────┐ ┌───────┐ ┌────────────┐                      │     │

   │  │  │ postgres  │ │ redis │ │  minio     │                      │     │

   │  │  │           │ │       │ │  (S3-like) │                      │     │

   │  │  │ Port:5432 │ │ :6379 │ │  :9000     │                      │     │

   │  │  │           │ │       │ │  :9001     │                      │     │

   │  │  │ Volume:   │ │Volume:│ │  Volume:   │                      │     │

   │  │  │ pg\_data   │ │redis  │ │  minio\_data│                      │     │

   │  │  │           │ │\_data  │ │            │                      │     │

   │  │  └───────────┘ └───────┘ └────────────┘                      │     │

   │  │                                                                │     │

   │  │  volumes:                                                      │     │

   │  │    pg\_data:                                                    │     │

   │  │    redis\_data:                                                 │     │

   │  │    minio\_data:                                                 │     │

   │  │                                                                │     │

   │  │  networks:                                                     │     │

   │  │    flashlearn-network:                                         │     │

   │  │      driver: bridge                                            │     │

   │  │                                                                │     │

   │  └────────────────────────────────────────────────────────────────┘     │

   │                                                                           │

   └──────────────────────────────────────────────────────────────────────────┘

   -----
1. # <a name="_toc225239654"></a>**CI/CD PIPELINE**
   ┌──────────────────────────────────────────────────────────────────────────┐

   │                    CI/CD PIPELINE (GitHub Actions)                         │

   ├──────────────────────────────────────────────────────────────────────────┤

   │                                                                           │

   │  ┌─────────┐    ┌─────────┐    ┌──────────┐    ┌──────────────┐        │

   │  │  Push /  │───▶│  Build  │───▶│   Test   │───▶│   Deploy     │        │

   │  │  PR      │    │         │    │          │    │              │        │

   │  └─────────┘    └─────────┘    └──────────┘    └──────────────┘        │

   │                                                                           │

   │  ══════════════════════════════════════════════════════════════════       │

   │  STAGE 1: BUILD & LINT                                                   │

   │  ══════════════════════════════════════════════════════════════════       │

   │                                                                           │

   │  ┌────────────────────────────────────────────────────────────────┐     │

   │  │  on: [push to main/develop, pull\_request]                      │     │

   │  │                                                                 │     │

   │  │  jobs:                                                          │     │

   │  │    build-frontend:                                              │     │

   │  │      ├── Checkout code                                          │     │

   │  │      ├── Setup Node.js 20                                       │     │

   │  │      ├── Install dependencies (npm ci)                          │     │

   │  │      ├── Run ESLint                                              │     │

   │  │      ├── Run Prettier check                                      │     │

   │  │      ├── TypeScript type check (tsc --noEmit)                   │     │

   │  │      └── Build Next.js (npm run build)                          │     │

   │  │                                                                 │     │

   │  │    build-backend:                                               │     │

   │  │      ├── Checkout code                                          │     │

   │  │      ├── Setup Node.js 20                                       │     │

   │  │      ├── Install dependencies (npm ci)                          │     │

   │  │      ├── Run ESLint                                              │     │

   │  │      ├── TypeScript type check                                   │     │

   │  │      └── Build NestJS (npm run build)                           │     │

   │  └────────────────────────────────────────────────────────────────┘     │

   │                                                                           │

   │  ══════════════════════════════════════════════════════════════════       │

   │  STAGE 2: TEST                                                           │

   │  ══════════════════════════════════════════════════════════════════       │

   │                                                                           │

   │  ┌────────────────────────────────────────────────────────────────┐     │

   │  │  test-backend:                                                  │     │

   │  │    services:                                                    │     │

   │  │      ├── postgres:16 (test database)                            │     │

   │  │      └── redis:7 (test cache)                                   │     │

   │  │    steps:                                                       │     │

   │  │      ├── Run Prisma migrations (test DB)                        │     │

   │  │      ├── Run unit tests (jest --coverage)                       │     │

   │  │      ├── Run integration tests                                   │     │

   │  │      ├── Run E2E tests                                           │     │

   │  │      ├── Upload coverage report                                  │     │

   │  │      └── Check coverage threshold (>80%)                        │     │

   │  │                                                                 │     │

   │  │  test-frontend:                                                 │     │

   │  │    steps:                                                       │     │

   │  │      ├── Run unit tests (jest --coverage)                       │     │

   │  │      ├── Run component tests                                     │     │

   │  │      └── Upload coverage report                                  │     │

   │  │                                                                 │     │

   │  │  e2e-tests: (on main branch only)                               │     │

   │  │    steps:                                                       │     │

   │  │      ├── Start full Docker environment                          │     │

   │  │      ├── Run Playwright E2E tests                               │     │

   │  │      ├── Upload test screenshots on failure                     │     │

   │  │      └── Upload test report                                      │     │

   │  └────────────────────────────────────────────────────────────────┘     │

   │                                                                           │

   │  ══════════════════════════════════════════════════════════════════       │

   │  STAGE 3: DEPLOY                                                         │

   │  ══════════════════════════════════════════════════════════════════       │

   │                                                                           │

   │  ┌────────────────────────────────────────────────────────────────┐     │

   │  │                                                                 │     │

   │  │  deploy-staging: (on push to develop)                           │     │

   │  │    steps:                                                       │     │

   │  │      ├── Build Docker images                                     │     │

   │  │      ├── Push to Container Registry                              │     │

   │  │      ├── Deploy to Staging server                                │     │

   │  │      ├── Run DB migrations                                       │     

   │  │      ├── Health check                                           │     │

   │  │      ├── Run smoke tests                                        │     │

   │  │      └── Notify team (Slack/Discord)                            │     │

   │  │                                                                 │     │

   │  │  deploy-production: (on push to main + manual approval)         │     │

   │  │    steps:                                                       │     │

   │  │      ├── Require approval from 2 team members                   │     │

   │  │      ├── Build Docker images (production optimized)             │     │

   │  │      ├── Push to Container Registry (tag: version)              │     │

   │  │      ├── Backup production database                              │     │

   │  │      ├── Deploy with blue-green strategy                         │     │

   │  │      │   ┌────────────────────────────────────────────┐        │     │

   │  │      │   │                                             │        │     │

   │  │      │   │  ┌──────────┐        ┌──────────┐         │        │     │

   │  │      │   │  │  BLUE    │        │  GREEN   │         │        │     │

   │  │      │   │  │ (current)│        │ (new v.) │         │        │     │

   │  │      │   │  │  v1.2.0  │   →    │  v1.3.0  │         │        │     │

   │  │      │   │  └──────────┘        └──────────┘         │        │     │

   │  │      │   │       ↑                    ↑               │        │     │

   │  │      │   │       └── traffic ─────────┘               │        │     │

   │  │      │   │           switch after health check        │        │     │

   │  │      │   └────────────────────────────────────────────┘        │     │

   │  │      ├── Run DB migrations (with rollback plan)                 │     │

   │  │      ├── Health check (wait 60s)                                │     │

   │  │      ├── Run smoke tests                                        │     │

   │  │      ├── Switch traffic to new version                          │     │

   │  │      ├── Monitor error rate (5 min)                             │     │

   │  │      ├── Auto rollback if error rate > 5%                       │     │

   │  │      ├── Create Git tag (v1.3.0)                                │     │

   │  │      ├── Generate changelog                                      │     │

   │  │      └── Notify team + stakeholders                              │     │

   │  │                                                                 │     │

   │  └────────────────────────────────────────────────────────────────┘     │

   │                                                                           │

   │  ══════════════════════════════════════════════════════════════════       │

   │  WORKFLOW TỔNG QUAN                                                      │

   │  ══════════════════════════════════════════════════════════════════       │

   │                                                                           │

   │   Developer          GitHub              Staging          Production     │

   │      │                  │                   │                 │           │

   │      │──push branch──▶ │                   │                 │           │

   │      │                  │──build+lint──▶   │                 │           │

   │      │                  │──unit tests──▶   │                 │           │

   │      │──create PR────▶ │                   │                 │           │

   │      │                  │──code review──▶  │                 │           │

   │      │                  │                   │                 │           │

   │      │──merge develop─▶│                   │                 │           │

   │      │                  │──full tests───▶  │                 │           │

   │      │                  │──deploy─────────▶│                 │           │

   │      │                  │                   │──smoke tests──▶│           │

   │      │                  │                   │                 │           │

   │      │──merge main───▶ │                   │                 │           │

   │      │                  │──approval────────┼────────────────▶│           │

   │      │                  │                   │                 │──deploy  │

   │      │                  │                   │                 │──monitor │

   │      │                  │◀──notify──────────┼─────────────────│           │

   │      │◀─────────────────│                   │                 │           │

   │                                                                           │

   └──────────────────────────────────────────────────────────────────────────┘

   -----
1. # <a name="_toc225239655"></a>**SECURITY CHECKLIST**
   ┌──────────────────────────────────────────────────────────────────────────┐

   │                    SECURITY CHECKLIST                                      │

   ├──────────────────────────────────────────────────────────────────────────┤

   │                                                                           │

   │  ┌────────────────────────────────────────────────────────────────┐     │

   │  │  🔐 AUTHENTICATION & AUTHORIZATION                             │     │

   │  │                                                                 │     │

   │  │  ☐ JWT với short-lived access token (15m)                      │     │

   │  │  ☐ Refresh token rotation (7 days, single use)                 │     │

   │  │  ☐ Refresh token stored in HttpOnly cookie                     │     │

   │  │  ☐ Password hashing với bcrypt (salt rounds: 12)              │     │

   │  │  ☐ Password policy (min 8 chars, uppercase, number, special)   │     │

   │  │  ☐ Rate limit login attempts (5 attempts / 15 min)            │     │

   │  │  ☐ Account lockout after 10 failed attempts                    │     │

   │  │  ☐ Email verification required                                 │     │

   │  │  ☐ RBAC middleware trên mọi protected route                    │     │

   │  │  ☐ Permission-based access (không chỉ role-based)             │     │

   │  │  ☐ Session invalidation khi đổi password                      │     │

   │  │  ☐ OAuth state parameter validation (CSRF prevention)         │     │

   │  │  ☐ 2FA (TOTP) cho admin accounts                              │     │

   │  └────────────────────────────────────────────────────────────────┘     │

   │                                                                           │

   │  ┌────────────────────────────────────────────────────────────────┐     │

   │  │  🛡️ API SECURITY                                               │     │

   │  │                                                                 │     │

   │  │  ☐ Input validation trên mọi endpoint (class-validator)       │     │

   │  │  ☐ SQL Injection prevention (Prisma ORM parameterized)        │     │

   │  │  ☐ XSS prevention (input sanitization + output encoding)     │     │

   │  │  ☐ CSRF protection (SameSite cookies + CSRF token)           │     │

   │  │  ☐ Rate limiting per IP + per user                            │     │

   │  │  │   ├── General: 100 requests / minute                       │     │

   │  │  │   ├── Auth: 10 requests / minute                           │     │

   │  │  │   └── Upload: 5 requests / minute                          │     │

   │  │  ☐ Request size limit (10MB max)                               │     │

   │  │  ☐ File upload validation                                      │     │

   │  │  │   ├── File type whitelist (jpg, png, pdf, csv)             │     │

   │  │  │   ├── File size limit (5MB per file)                       │     │

   │  │  │   ├── Virus scanning (optional)                             │     │

   │  │  │   └── Rename uploaded files (prevent path traversal)       │     │

   │  │  ☐ CORS configuration (whitelist origins only)                │     │

   │  │  ☐ Security headers (Helmet.js)                                │     │

   │  │  │   ├── X-Content-Type-Options: nosniff                      │     │

   │  │  │   ├── X-Frame-Options: DENY                                │     │

   │  │  │   ├── X-XSS-Protection: 1; mode=block                     │     │

   │  │  │   ├── Strict-Transport-Security (HSTS)                     │     │

   │  │  │   ├── Content-Security-Policy                               │     │

   │  │  │   └── Referrer-Policy: strict-origin-when-cross-origin     │     │

   │  │  ☐ API versioning (/api/v1/...)                                │     │

   │  │  ☐ Request ID tracking (correlation ID)                        │     │

   │  │  ☐ Disable server fingerprinting (remove X-Powered-By)       │     │

   │  └────────────────────────────────────────────────────────────────┘     │

   │                                                                           │

   │  ┌────────────────────────────────────────────────────────────────┐     │

   │  │  🗄️ DATA SECURITY                                              │     │

   │  │                                                                 │     │

   │  │  ☐ Database encryption at rest                                 │     │

   │  │  ☐ TLS/SSL for all connections                                 │     │

   │  │  ☐ Database user với minimum privileges                        │     │

   │  │  ☐ Separate DB user cho read/write operations                 │     │

   │  │  ☐ Sensitive data encryption (PII)                             │     │

   │  │  │   ├── Email addresses                                       │     │

   │  │  │   ├── Phone numbers                                         │     │

   │  │  │   └── Teacher certificates                                  │     │

   │  │  ☐ Database backup encryption                                  │     │

   │  │  ☐ Automated daily backups                                     │     │

   │  │  ☐ Backup retention policy (30 days)                           │     │

   │  │  ☐ Backup restoration testing (monthly)                        │     │

   │  │  ☐ No sensitive data in logs                                   │     │

   │  │  ☐ PII data masking in non-production environments            │     │

   │  │  ☐ Data deletion on account removal (GDPR)                    │     │

   │  │  ☐ Redis password authentication                               │     │

   │  │  ☐ S3 bucket private by default                                │     │

   │  │  ☐ Pre-signed URLs for file access (expiring)                 │     │

   │  └────────────────────────────────────────────────────────────────┘     │

   │                                                                           │

   │  ┌────────────────────────────────────────────────────────────────┐     │

   │  │  🔍 MONITORING & AUDIT                                         │     │

   │  │                                                                 │     │

   │  │  ☐ Audit log cho admin actions                                 │     │

   │  │  ☐ Login attempt logging (success + failure)                   │     │

   │  │  ☐ IP-based anomaly detection                                  │     │

   │  │  ☐ Real-time error tracking (Sentry)                           │     │

   │  │  ☐ Application performance monitoring                          │     │

   │  │  ☐ Database query monitoring (slow queries)                    │     │

   │  │  ☐ Uptime monitoring                                           │     │

   │  │  ☐ SSL certificate expiry monitoring                           │     │

   │  │  ☐ Dependency vulnerability scanning (npm audit)              │     │

   │  │  ☐ Container image scanning                                    │     │

   │  │  ☐ Regular security updates                                    │     │

   │  └────────────────────────────────────────────────────────────────┘     │

   │                                                                           │

   │  ┌────────────────────────────────────────────────────────────────┐     │

   │  │  🌐 INFRASTRUCTURE SECURITY                                    │     │

   │  │                                                                 │     │

   │  │  ☐ HTTPS everywhere (TLS 1.3)                                 │     │

   │  │  ☐ SSL certificate auto-renewal (Let's Encrypt)              │     │

   │  │  ☐ DDoS protection (CloudFlare)                                │     │

   │  │  ☐ Web Application Firewall (WAF)                              │     │

   │  │  ☐ Private network cho database + redis                       │     │

   │  │  ☐ SSH key-only access (no password)                           │     │

   │  │  ☐ Firewall rules (only necessary ports)                      │     │

   │  │  ☐ Docker images from trusted sources only                    │     │

   │  │  ☐ Non-root Docker containers                                  │     │

   │  │  ☐ Environment variables cho secrets (no hardcode)            │     │

   │  │  ☐ Secrets management (AWS Secrets Manager / Vault)           │     │

   │  │  ☐ Log rotation                                                │     │

   │  │  ☐ Regular OS security patches                                 │     │

   │  └────────────────────────────────────────────────────────────────┘     │

   │                                                                           │

   └──────────────────────────────────────────────────────────────────────────┘

   -----
1. # <a name="_toc225239656"></a>**PERFORMANCE OPTIMIZATION STRATEGY**
   ┌──────────────────────────────────────────────────────────────────────────┐

   │                    PERFORMANCE OPTIMIZATION                               │

   ├──────────────────────────────────────────────────────────────────────────┤

   │                                                                           │

   │  ┌────────────────────────────────────────────────────────────────┐     │

   │  │  🚀 FRONTEND OPTIMIZATION                                     │     │

   │  │                                                                 │     │

   │  │  📌 Rendering                                                   │     │

   │  │  ├── SSR cho landing page + SEO pages                          │     │

   │  │  ├── CSR cho dashboard + interactive pages                     │     │

   │  │  ├── ISR cho public deck pages (revalidate: 60s)              │     │

   │  │  ├── React.lazy() cho game components                          │     │

   │  │  ├── Dynamic import cho heavy libraries                        │     │

   │  │  │   (chart.js, framer-motion...)                              │     │

   │  │  └── Suspense boundaries cho loading states                    │     │

   │  │                                                                 │     │

   │  │  📌 Assets                                                      │     │

   │  │  ├── Image optimization (next/image, WebP format)             │     │

   │  │  ├── Audio lazy loading (load on demand)                       │     │

   │  │  ├── Font optimization (next/font, subset)                     │     │

   │  │  ├── CSS purging (Tailwind built-in)                           │     │

   │  │  ├── Bundle splitting (per route)                              │     │

   │  │  ├── Tree shaking                                               │     │

   │  │  └── Gzip/Brotli compression                                   │     │

   │  │                                                                 │     │

   │  │  📌 Caching                                                     │     │

   │  │  ├── Service Worker (PWA offline cache)                        │     │

   │  │  ├── SWR / React Query (stale-while-revalidate)              │     │

   │  │  ├── LocalStorage cho user preferences                        │     │

   │  │  ├── IndexedDB cho offline flashcard data                     │     │

   │  │  └── CDN caching cho static assets                             │     │

   │  │                                                                 │     │

   │  │  📌 UX Performance                                              │     │

   │  │  ├── Skeleton loading screens                                   │     │

   │  │  ├── Optimistic UI updates                                      │     │

   │  │  ├── Debounced search (300ms)                                   │     │

   │  │  ├── Virtual scrolling cho long lists                          │     │

   │  │  ├── Prefetch next page data                                    │     │

   │  │  └── Target: LCP < 2.5s, FID < 100ms, CLS < 0.1             │     │

   │  └────────────────────────────────────────────────────────────────┘     │

   │                                                                           │

   │  ┌────────────────────────────────────────────────────────────────┐     │

   │  │  ⚡ BACKEND OPTIMIZATION                                       │     │

   │  │                                                                 │     │

   │  │  📌 Database                                                    │     │

   │  │  ├── Proper indexing strategy:                                  │     │

   │  │  │   ┌──────────────────────────────────────────────┐         │     │

   │  │  │   │  CREATE INDEX idx\_user\_card\_progress          │         │     │

   │  │  │   │    ON user\_card\_progress                      │         │     │

   │  │  │   │    (user\_id, next\_review\_date, status);       │         │     │

   │  │  │   │                                               │         │     │

   │  │  │   │  CREATE INDEX idx\_flashcards\_deck              │         │     │

   │  │  │   │    ON flashcards (deck\_id, sort\_order);       │         │     │

   │  │  │   │                                               │         │     │

   │  │  │   │  CREATE INDEX idx\_notifications\_user           │         │     │

   │  │  │   │    ON notifications                           │         │     │

   │  │  │   │    (user\_id, is\_read, created\_at DESC);       │         │     │

   │  │  │   │                                               │         │     │

   │  │  │   │  CREATE INDEX idx\_decks\_public                 │         │     │

   │  │  │   │    ON decks (visibility, category\_id,         │         │     │

   │  │  │   │    avg\_rating DESC) WHERE is\_approved=true;    │         │     │

   │  │  │   └──────────────────────────────────────────────┘         │     │

   │  │  │                                                              │     │

   │  │  ├── Query optimization (N+1 prevention with Prisma include)  │     │

   │  │  ├── Connection pooling (PgBouncer / Prisma pool)             │     │

   │  │  ├── Read replica cho heavy read queries                       │     │

   │  │  ├── Materialized views cho leaderboard                        │     │

   │  │  ├── Partitioning cho review\_logs (by month)                  │     │

   │  │  └── VACUUM / ANALYZE scheduling                               │     │

   │  │                                                                 │     │

   │  │  📌 Caching Strategy (Redis)                                   │     │

   │  │  ├── Cache layers:                                              │     │

   │  │  │   ┌──────────────────────────────────────────────┐         │     │

   │  │  │   │  Layer 1: Hot Data (TTL: 5 min)              │         │     │

   │  │  │   │  ├── User session data                       │         │     │

   │  │  │   │  ├── Due cards count                         │         │     │

   │  │  │   │  └── Notification unread count               │         │     │

   │  │  │   │                                               │         │     │

   │  │  │   │  Layer 2: Warm Data (TTL: 1 hour)            │         │     │

   │  │  │   │  ├── Public deck listings                    │         │     │

   │  │  │   │  ├── Category lists                          │         │     │

   │  │  │   │  ├── Leaderboard data                        │         │     │

   │  │  │   │  └── i18n translation files                  │         │     │

   │  │  │   │                                               │         │     │

   │  │  │   │  Layer 3: Cold Data (TTL: 24 hours)          │         │     │

   │  │  │   │  ├── User achievements                       │         │     │

   │  │  │   │  ├── Admin dashboard stats                   │         │     │

   │  │  │   │  └── Analytics aggregated data               │         │     │

   │  │  │   └──────────────────────────────────────────────┘         │     │

   │  │  │                                                              │     │

   │  │  ├── Cache invalidation patterns:                               │     │

   │  │  │   ├── Write-through cho user progress                       │     │

   │  │  │   ├── Cache-aside cho deck data                             │     │

   │  │  │   └── Event-driven invalidation cho leaderboard            │     │

   │  │  │                                                              │     │

   │  │  ├── Redis data structures:                                     │     │

   │  │  │   ├── String: session, tokens                               │     │

   │  │  │   ├── Hash: user settings cache                             │     │

   │  │  │   ├── Sorted Set: leaderboard                               │     │

   │  │  │   ├── List: notification queue                              │     │

   │  │  │   └── Set: online users tracking                            │     │

   │  │  │                                                              │     │

   │  │  📌 Job Queue (Bull)                                            │     │

   │  │  ├── Email sending (non-blocking)                               │     │

   │  │  ├── Push notification dispatch                                 │     │

   │  │  ├── CSV import processing                                      │     │

   │  │  ├── Report generation                                          │     │

   │  │  ├── Stats aggregation                                          │     │

   │  │  ├── Priority queues:                                           │     │

   │  │  │   ├── High: Authentication emails                           │     │

   │  │  │   ├── Medium: Reminders, Notifications                     │     │

   │  │  │   └── Low: Reports, Analytics                               │     │

   │  │  └── Dead letter queue for failed jobs                         │     │

   │  │                                                                 │     │

   │  │  📌 API Optimization                                            │     │

   │  │  ├── Response compression (gzip)                                │     │

   │  │  ├── Pagination (cursor-based for large lists)                 │     │

   │  │  ├── Field selection (select specific fields)                  │     │

   │  │  ├── Batch operations (bulk insert cards)                      │     │

   │  │  ├── Request timeout (30s max)                                  │     │

   │  │  └── Connection keep-alive                                      │     │

   │  │                                                                 │     │

   │  └────────────────────────────────────────────────────────────────┘     │

   │                                                                           │

   └──────────────────────────────────────────────────────────────────────────┘

   -----
1. # <a name="_toc225239657"></a>**TỔNG KẾT HỆ THỐNG**
   ┌──────────────────────────────────────────────────────────────────────────┐

   │                    📊 TỔNG KẾT PHÂN TÍCH HỆ THỐNG                       │

   ├──────────────────────────────────────────────────────────────────────────┤

   │                                                                           │

   │  ┌────────────────────────────────────────────────────────────────┐     │

   │  │  📋 THỐNG KÊ TỔNG QUAN                                        │     │

   │  │                                                                 │     │

   │  │  ┌─────────────────────────┬──────────────────────────┐       │     │

   │  │  │ Hạng mục               │ Số lượng                 │       │     │

   │  │  ├─────────────────────────┼──────────────────────────┤       │     │

   │  │  │ Modules chính           │ 12 modules               │       │     │

   │  │  │ Database tables          │ 25+ tables               │       │     │

   │  │  │ API Endpoints            │ 80+ endpoints            │       │     │

   │  │  │ User Roles               │ 3 roles (extendable)     │       │     │

   │  │  │ Mini Games               │ 7 games                  │       │     │

   │  │  │ Test Types               │ 5 types                  │       │     │

   │  │  │ Supported Languages      │ 4+ (extendable)          │       │     │

   │  │  │ UI Screens               │ 40+ screens              │       │     │

   │  │  │ Background Jobs          │ 8+ job types             │       │     │

   │  │  │ Email Templates          │ 8 templates              │       │     │

   │  │  │ Achievement Types        │ 15+ achievements         │       │     │

   │  │  │ Notification Types       │ 7 types                  │       │     │

   │  │  └─────────────────────────┴──────────────────────────┘       │     │

   │  └────────────────────────────────────────────────────────────────┘     │

   │                                                                           │

   │  ┌────────────────────────────────────────────────────────────────┐     │

   │  │  🏗️ 12 MODULES CHÍNH                                          │     │

   │  │                                                                 │     │

   │  │   1. 🔐 Authentication & Authorization (Auth + RBAC)          │     │

   │  │   2. 🃏 Flashcard Management (Deck + Card CRUD)               │     │

   │  │   3. 🧠 Spaced Repetition System (SM-2 + Leitner)            │     │

   │  │   4. ⏰ Notification & Reminder (Multi-channel)               │     │

   │  │   5. 🎮 Mini Games (7 game types)                             │     │

   │  │   6. 📝 Mini Tests (Auto-generated questions)                 │     │

   │  │   7. 🌐 Internationalization (Multi-language)                 │     │

   │  │   8. 👨‍🏫 Teacher Management (Classroom + Tracking)             │     │

   │  │   9. 🛡️ Admin Panel (Users + Content + Config)                │     │

   │  │  10. 📊 Statistics & Gamification (XP + Streak + Badges)     │     │

   │  │  11. 👤 User Profile & Settings                                │     │

   │  │  12. 📤 Upload & Storage (S3 + CDN)                           │     │

   │  └────────────────────────────────────────────────────────────────┘     │

   │                                                                           │

   │  ┌────────────────────────────────────────────────────────────────┐     │

   │  │  🛠️ TECH STACK SUMMARY                                        │     │

   │  │                                                                 │     │

   │  │  Frontend:  Next.js 14 + TypeScript + Tailwind + shadcn/ui    │     │

   │  │  Backend:   NestJS + TypeScript + Prisma ORM                   │     │

   │  │  Database:  PostgreSQL 16 + Redis 7                            │     │

   │  │  Storage:   AWS S3 / MinIO + CloudFront CDN                   │     │

   │  │  Auth:      JWT + Passport.js + OAuth 2.0                     │     │

   │  │  Queue:     Bull (Redis-based)                                 │     │

   │  │  WebSocket: Socket.io                                          │     │

   │  │  Email:     Nodemailer + SendGrid                              │     │

   │  │  DevOps:    Docker + GitHub Actions + Nginx                    │     │

   │  │  Monitor:   Sentry + Grafana                                   │     │

   │  │  Testing:   Jest + Supertest + Playwright                      │     │

   │  └────────────────────────────────────────────────────────────────┘     │

   │                                                                           │

   │  ┌────────────────────────────────────────────────────────────────┐     │

   │  │  📅 TIMELINE TỔNG                                              │     │

   │  │                                                                 │     │

   │  │  Phase 1 (MVP):        10 tuần  → Launch cơ bản              │     │

   │  │  Phase 2 (Enhanced):    8 tuần  → Full features               │     │

   │  │  Phase 3 (Social):      8 tuần  → Social + PWA               │     │

   │  │  Phase 4 (Scale):      Ongoing  → AI + Mobile + Scale        │     │

   │  │  ──────────────────────────────────────────────               │     │

   │  │  Tổng MVP → Production Ready: ~6 tháng                        │     │

   │  │                                                                 │     │

   │  └────────────────────────────────────────────────────────────────┘     │

   │                                                                           │

   │  ┌────────────────────────────────────────────────────────────────┐     │

   │  │  👥 TEAM ĐỀ XUẤT (cho Phase 1-2)                              │     │

   │  │                                                                 │     │

   │  │  ┌──────────────────┬──────┬──────────────────────────┐       │     │

   │  │  │ Role             │ Số   │ Nhiệm vụ chính           │       │     │

   │  │  ├──────────────────┼──────┼──────────────────────────┤       │     │

   │  │  │ Project Manager  │  1   │ Quản lý dự án, scrum     │       │     │

   │  │  │ Frontend Dev     │  2   │ Next.js, UI/UX, Games    │       │     │

   │  │  │ Backend Dev      │  2   │ NestJS, API, SRS Engine  │       │     │

   │  │  │ Fullstack Dev    │  1   │ Hỗ trợ FE + BE          │       │     │

   │  │  │ UI/UX Designer   │  1   │ Design system, wireframe │       │     │

   │  │  │ QA/Tester        │  1   │ Testing, automation      │       │     │

   │  │  │ DevOps Engineer  │  1   │ CI/CD, Docker, Server    │       │     │

   │  │  ├──────────────────┼──────┼──────────────────────────┤       │     │

   │  │  │ TỔNG CỘNG        │ 8-9  │                          │       │     │

   │  │  └──────────────────┴──────┴──────────────────────────┘       │     │

   │  │                                                                 │     │

   │  │  💡 Nếu team nhỏ (3-4 người):                                 │     │

   │  │  ├── 1 Fullstack Lead (kiêm PM)                               │     │

   │  │  ├── 1 Frontend Dev                                             │     │

   │  │  ├── 1 Backend Dev                                              │     │

   │  │  └── 1 UI/UX + QA (kiêm nhiệm)                               │     │

   │  │  → Thời gian tăng ~1.5x (9-10 tháng cho full features)       │     │

   │  │                                                                 │     │

   │  └────────────────────────────────────────────────────────────────┘     │

   │                                                                           │

   └──────────────────────────────────────────────────────────────────────────┘

   -----
1. # <a name="_toc225239658"></a>**MONITORING & LOGGING STRATEGY**
   ┌──────────────────────────────────────────────────────────────────────────┐

   │                    MONITORING & LOGGING                                    │

   ├──────────────────────────────────────────────────────────────────────────┤

   │                                                                           │

   │  ┌────────────────────────────────────────────────────────────────┐     │

   │  │  📊 MONITORING STACK                                           │     │

   │  │                                                                 │     │

   │  │  ┌─────────────────────────────────────────────────────────┐  │     │

   │  │  │                                                          │  │     │

   │  │  │   ┌──────────┐   ┌──────────┐   ┌──────────────────┐  │  │     │

   │  │  │   │ Sentry   │   │Prometheus│   │   Grafana        │  │  │     │

   │  │  │   │          │   │          │   │                  │  │  │     │

   │  │  │   │ • Error  │   │ • Metrics│   │ • Dashboards    │  │  │     │

   │  │  │   │   tracking│   │ • CPU    │   │ • Alerts        │  │  │     │

   │  │  │   │ • Stack  │   │ • Memory │   │ • Visualization │  │  │     │

   │  │  │   │   traces │   │ • Disk   │   │                  │  │  │     │

   │  │  │   │ • User   │   │ • Custom │   │                  │  │  │     │

   │  │  │   │   context│   │   metrics│   │                  │  │  │     │

   │  │  │   └──────────┘   └──────────┘   └──────────────────┘  │  │     │

   │  │  │                                                          │  │     │

   │  │  │   ┌──────────┐   ┌──────────┐   ┌──────────────────┐  │  │     │

   │  │  │   │ Winston  │   │   ELK    │   │   Uptime Robot   │  │  │     │

   │  │  │   │ (Logger) │   │  Stack   │   │                  │  │  │     │

   │  │  │   │          │   │          │   │ • Uptime check   │  │  │     │

   │  │  │   │ • App    │   │ • Log    │   │ • SSL expiry     │  │  │     │

   │  │  │   │   logs   │   │   search │   │ • Response time  │  │  │     │

   │  │  │   │ • Access │   │ • Log    │   │ • Status page    │  │  │     │

   │  │  │   │   logs   │   │   visual.│   │                  │  │  │     │

   │  │  │   │ • Error  │   │ • Log    │   │                  │  │  │     │

   │  │  │   │   logs   │   │   alerts │   │                  │  │  │     │

   │  │  │   └──────────┘   └──────────┘   └──────────────────┘  │  │     │

   │  │  │                                                          │  │     │

   │  │  └─────────────────────────────────────────────────────────┘  │     │

   │  └────────────────────────────────────────────────────────────────┘     │

   │                                                                           │

   │  ┌────────────────────────────────────────────────────────────────┐     │

   │  │  📝 LOGGING LEVELS & FORMAT                                    │     │

   │  │                                                                 │     │

   │  │  Log Format (JSON):                                             │     │

   │  │  ┌──────────────────────────────────────────────────────┐     │     │

   │  │  │  {                                                    │     │     │

   │  │  │    "timestamp": "2025-01-15T08:30:00.000Z",          │     │     │

   │  │  │    "level": "info",                                   │     │     │

   │  │  │    "requestId": "req\_abc123def456",                   │     │     │

   │  │  │    "userId": "usr\_789",                               │     │     │

   │  │  │    "method": "POST",                                  │     │     │

   │  │  │    "path": "/api/v1/learn/cards/42/review",          │     │     │

   │  │  │    "statusCode": 200,                                 │     │     │

   │  │  │    "responseTime": 125,                               │     │     │

   │  │  │    "message": "Card reviewed successfully",           │     │     │

   │  │  │    "metadata": {                                      │     │     │

   │  │  │      "cardId": 42,                                    │     │     │

   │  │  │      "rating": "good",                                │     │     │

   │  │  │      "newInterval": 6                                 │     │     │

   │  │  │    }                                                  │     │     │

   │  │  │  }                                                    │     │     │

   │  │  └──────────────────────────────────────────────────────┘     │     │

   │  │                                                                 │     │

   │  │  Logging Levels:                                                │     │

   │  │  ┌──────────┬──────────────────────────────────────────┐      │     │

   │  │  │  Level   │  Sử dụng cho                             │      │     │

   │  │  ├──────────┼──────────────────────────────────────────┤      │     │

   │  │  │  ERROR   │  Lỗi nghiêm trọng, cần xử lý ngay       │      │     │

   │  │  │          │  (DB connection fail, payment error)     │      │     │

   │  │  │  WARN    │  Cảnh báo (rate limit, deprecated API)   │      │     │

   │  │  │  INFO    │  Hoạt động bình thường                    │      │     │

   │  │  │          │  (user login, card reviewed, game played)│      │     │

   │  │  │  DEBUG   │  Chi tiết debug (dev/staging only)        │      │     │

   │  │  │          │  (SRS calculation, query details)        │      │     │

   │  │  │  VERBOSE │  Rất chi tiết (local dev only)            │      │     │

   │  │  └──────────┴──────────────────────────────────────────┘      │     │

   │  │                                                                 │     │

   │  │  Environment log levels:                                        │     │

   │  │  ├── Production: INFO, WARN, ERROR                             │     │

   │  │  ├── Staging: DEBUG, INFO, WARN, ERROR                         │     │

   │  │  └── Development: ALL levels                                    │     │

   │  │                                                                 │     │

   │  └────────────────────────────────────────────────────────────────┘     │

   │                                                                           │

   │  ┌────────────────────────────────────────────────────────────────┐     │

   │  │  🚨 CUSTOM METRICS & ALERTS                                    │     │

   │  │                                                                 │     │

   │  │  Business Metrics (Prometheus Custom):                          │     │

   │  │  ┌─────────────────────────────────────────────────────┐      │     │

   │  │  │                                                      │      │     │

   │  │  │  flashlearn\_daily\_active\_users        gauge          │      │     │

   │  │  │  flashlearn\_cards\_reviewed\_total      counter        │      │     │

   │  │  │  flashlearn\_cards\_learned\_total       counter        │      │     │

   │  │  │  flashlearn\_games\_played\_total        counter        │      │     │

   │  │  │  flashlearn\_tests\_completed\_total     counter        │      │     │

   │  │  │  flashlearn\_srs\_review\_duration\_ms    histogram      │      │     │

   │  │  │  flashlearn\_api\_response\_time\_ms      histogram      │      │     │

   │  │  │  flashlearn\_notification\_sent\_total   counter        │      │     │

   │  │  │  flashlearn\_notification\_failed\_total counter        │      │     │

   │  │  │  flashlearn\_queue\_job\_duration\_ms     histogram      │      │     │

   │  │  │  flashlearn\_queue\_job\_failed\_total    counter        │      │     │

   │  │  │  flashlearn\_active\_websockets         gauge          │      │     │

   │  │  │  flashlearn\_teacher\_requests\_pending  gauge          │      │     │

   │  │  │                                                      │      │     │

   │  │  └─────────────────────────────────────────────────────┘      │     │

   │  │                                                                 │     │

   │  │  Alert Rules (Grafana):                                         │     │

   │  │  ┌─────────────────────────────────────────────────────┐      │     │

   │  │  │                                                      │      │     │

   │  │  │  🔴 CRITICAL (Notify immediately - SMS + Slack):     │      │     │

   │  │  │  ├── API error rate > 5% for 5 min                  │      │     │

   │  │  │  ├── Server CPU > 90% for 10 min                    │      │     │

   │  │  │  ├── Database connection pool exhausted              │      │     │

   │  │  │  ├── Server memory > 95%                             │      │     │

   │  │  │  └── Service down (health check fail)                │      │     │

   │  │  │                                                      │      │     │

   │  │  │  🟡 WARNING (Notify via Slack):                      │      │     │

   │  │  │  ├── API response time p95 > 2s for 15 min          │      │     │

   │  │  │  ├── Queue job failure rate > 10%                    │      │     │

   │  │  │  ├── Disk usage > 80%                                │      │     │

   │  │  │  ├── Redis memory > 75%                              │      │     │

   │  │  │  ├── Email delivery failure rate > 5%                │      │     │

   │  │  │  └── SSL certificate expires in < 14 days            │      │     │

   │  │  │                                                      │      │     │

   │  │  │  🟢 INFO (Notify via Slack - low priority):          │      │     │

   │  │  │  ├── New user registration spike (>2x normal)       │      │     │

   │  │  │  ├── Daily active users drop > 20%                   │      │     │

   │  │  │  └── Deployment completed                            │      │     │

   │  │  │                                                      │      │     │

   │  │  └─────────────────────────────────────────────────────┘      │     │

   │  │                                                                 │     │

   │  └────────────────────────────────────────────────────────────────┘     │

   │                                                                           │

   └──────────────────────────────────────────────────────────────────────────┘

   -----
1. # <a name="_toc225239659"></a>**ERROR HANDLING STRATEGY**
   ┌──────────────────────────────────────────────────────────────────────────┐

   │                    ERROR HANDLING STRATEGY                                 │

   ├──────────────────────────────────────────────────────────────────────────┤

   │                                                                           │

   │  ┌────────────────────────────────────────────────────────────────┐     │

   │  │  📌 STANDARDIZED API ERROR RESPONSE                            │     │

   │  │                                                                 │     │

   │  │  Success Response:                                              │     │

   │  │  ┌──────────────────────────────────────────────┐              │     │

   │  │  │  {                                            │              │     │

   │  │  │    "success": true,                           │              │     │

   │  │  │    "statusCode": 200,                         │              │     │

   │  │  │    "message": "Cards retrieved successfully", │              │     │

   │  │  │    "data": { ... },                           │              │     │

   │  │  │    "meta": {                                  │              │     │

   │  │  │      "page": 1,                               │              │     │

   │  │  │      "limit": 20,                             │              │     │

   │  │  │      "total": 150,                            │              │     │

   │  │  │      "totalPages": 8                          │              │     │

   │  │  │    }                                          │              │     │

   │  │  │  }                                            │              │     │

   │  │  └──────────────────────────────────────────────┘              │     │

   │  │                                                                 │     │

   │  │  Error Response:                                                │     │

   │  │  ┌──────────────────────────────────────────────┐              │     │

   │  │  │  {                                            │              │     │

   │  │  │    "success": false,                          │              │     │

   │  │  │    "statusCode": 422,                         │              │     │

   │  │  │    "error": "VALIDATION\_ERROR",               │              │     │

   │  │  │    "message": "Validation failed",            │              │     │

   │  │  │    "details": [                               │              │     │

   │  │  │      {                                        │              │     │

   │  │  │        "field": "email",                      │              │     │

   │  │  │        "message": "Email is already taken"    │              │     │

   │  │  │      },                                       │              │     │

   │  │  │      {                                        │              │     │

   │  │  │        "field": "password",                   │              │     │

   │  │  │        "message": "Min 8 characters required" │              │     │

   │  │  │      }                                        │              │     │

   │  │  │    ],                                         │              │     │

   │  │  │    "requestId": "req\_abc123",                 │              │     │

   │  │  │    "timestamp": "2025-01-15T08:30:00.000Z"    │              │     │

   │  │  │  }                                            │              │     │

   │  │  └──────────────────────────────────────────────┘              │     │

   │  │                                                                 │     │

   │  └────────────────────────────────────────────────────────────────┘     │

   │                                                                           │

   │  ┌────────────────────────────────────────────────────────────────┐     │

   │  │  📌 ERROR CODES MAPPING                                        │     │

   │  │                                                                 │     │

   │  │  ┌──────────┬──────────────────────┬───────────────────────┐  │     │

   │  │  │ HTTP     │ Error Code           │ Description           │  │     │

   │  │  ├──────────┼──────────────────────┼───────────────────────┤  │     │

   │  │  │ 400      │ BAD\_REQUEST          │ Invalid request       │  │     │

   │  │  │ 401      │ UNAUTHORIZED         │ Not authenticated     │  │     │

   │  │  │ 401      │ TOKEN\_EXPIRED        │ JWT expired           │  │     │

   │  │  │ 401      │ INVALID\_TOKEN        │ JWT invalid           │  │     │

   │  │  │ 403      │ FORBIDDEN            │ No permission         │  │     │

   │  │  │ 403      │ ACCOUNT\_BANNED       │ User banned           │  │     │

   │  │  │ 403      │ EMAIL\_NOT\_VERIFIED   │ Email not verified    │  │     │

   │  │  │ 403      │ TEACHER\_NOT\_APPROVED │ Teacher pending       │  │     │

   │  │  │ 404      │ NOT\_FOUND            │ Resource not found    │  │     │

   │  │  │ 404      │ DECK\_NOT\_FOUND       │ Deck not found        │  │     │

   │  │  │ 404      │ CARD\_NOT\_FOUND       │ Card not found        │  │     │

   │  │  │ 404      │ USER\_NOT\_FOUND       │ User not found        │  │     │

   │  │  │ 409      │ CONFLICT             │ Duplicate resource    │  │     │

   │  │  │ 409      │ EMAIL\_ALREADY\_EXISTS │ Email taken           │  │     │

   │  │  │ 422      │ VALIDATION\_ERROR     │ Validation failed     │  │     │

   │  │  │ 429      │ TOO\_MANY\_REQUESTS    │ Rate limit exceeded   │  │     │

   │  │  │ 500      │ INTERNAL\_ERROR       │ Server error          │  │     │

   │  │  │ 503      │ SERVICE\_UNAVAILABLE  │ Maintenance mode      │  │     │

   │  │  └──────────┴──────────────────────┴───────────────────────┘  │     │

   │  │                                                                 │     │

   │  └────────────────────────────────────────────────────────────────┘     │

   │                                                                           │

   │  ┌────────────────────────────────────────────────────────────────┐     │

   │  │  📌 ERROR HANDLING FLOW                                        │     │

   │  │                                                                 │     │

   │  │  Request                                                        │     │

   │  │    │                                                            │     │

   │  │    ▼                                                            │     │

   │  │  ┌──────────────────┐                                          │     │

   │  │  │ Global Exception │                                          │     │

   │  │  │ Filter           │                                          │     │

   │  │  └────────┬─────────┘                                          │     │

   │  │           │                                                     │     │

   │  │     ┌─────┼─────────────────────────┐                          │     │

   │  │     │     │                         │                          │     │

   │  │     ▼     ▼                         ▼                          │     │

   │  │  ┌──────┐ ┌──────────────┐  ┌────────────────┐               │     │

   │  │  │Known │ │ Validation   │  │  Unexpected    │               │     │

   │  │  │Error │ │ Error        │  │  Error         │               │     │

   │  │  │      │ │ (class-      │  │                │               │     │

   │  │  │Custom│ │  validator)  │  │  • Log ERROR   │               │     │

   │  │  │HTTP  │ │              │  │  • Report to   │               │     │

   │  │  │Except│ │ Format field │  │    Sentry      │               │     │

   │  │  │ion   │ │ errors       │  │  • Return 500  │               │     │

   │  │  │      │ │              │  │    generic msg │               │     │

   │  │  └──┬───┘ └──────┬───────┘  └────────┬───────┘               │     │

   │  │     │             │                   │                        │     │

   │  │     └─────────────┼───────────────────┘                        │     │

   │  │                   │                                             │     │

   │  │                   ▼                                             │     │

   │  │           ┌───────────────┐                                    │     │

   │  │           │ Standardized  │                                    │     │

   │  │           │ Error Response│                                    │     │

   │  │           │ (JSON format) │                                    │     │

   │  │           └───────────────┘                                    │     │

   │  │                                                                 │     │

   │  └────────────────────────────────────────────────────────────────┘     │

   │                                                                           │

   │  ┌────────────────────────────────────────────────────────────────┐     │

   │  │  📌 FRONTEND ERROR HANDLING                                    │     │

   │  │                                                                 │     │

   │  │  ┌──────────────────────────────────────────────────────────┐ │     │

   │  │  │                                                           │ │     │

   │  │  │  1. API Error Interceptor (Axios):                       │ │     │

   │  │  │     ├── 401 → Refresh token → Retry                     │ │     │

   │  │  │     ├── 401 (refresh fail) → Redirect to login          │ │     │

   │  │  │     ├── 403 → Show "Access Denied" page                 │ │     │

   │  │  │     ├── 404 → Show "Not Found" page                     │ │     │

   │  │  │     ├── 422 → Show field-level validation errors        │ │     │

   │  │  │     ├── 429 → Show "Too many requests" toast            │ │     │

   │  │  │     ├── 500 → Show "Something went wrong" + retry btn   │ │     │

   │  │  │     └── Network Error → Show offline banner              │ │     │

   │  │  │                                                           │ │     │

   │  │  │  2. React Error Boundary:                                │ │     │

   │  │  │     ├── Catch render errors                              │ │     │

   │  │  │     ├── Show fallback UI                                 │ │     │

   │  │  │     ├── Report to Sentry                                 │ │     │

   │  │  │     └── "Reload page" option                             │ │     │

   │  │  │                                                           │ │     │

   │  │  │  3. Form Validation:                                     │ │     │

   │  │  │     ├── Client-side: Zod schema validation               │ │     │

   │  │  │     ├── Real-time field validation                       │ │     │

   │  │  │     └── Server-side error mapping to form fields         │ │     │

   │  │  │                                                           │ │     │

   │  │  │  4. Toast Notifications:                                 │ │     │

   │  │  │     ├── Success: Green toast (auto-dismiss 3s)           │ │     │

   │  │  │     ├── Error: Red toast (dismiss manually)              │ │     │

   │  │  │     ├── Warning: Yellow toast (auto-dismiss 5s)          │ │     │

   │  │  │     └── Info: Blue toast (auto-dismiss 3s)               │ │     │

   │  │  │                                                           │ │     │

   │  │  └──────────────────────────────────────────────────────────┘ │     │

   │  │                                                                 │     │

   │  └────────────────────────────────────────────────────────────────┘     │

   │                                                                           │

   └──────────────────────────────────────────────────────────────────────────┘

   -----
1. # <a name="_toc225239660"></a>**TESTING STRATEGY**
   ┌──────────────────────────────────────────────────────────────────────────┐

   │                    TESTING STRATEGY                                        │

   ├──────────────────────────────────────────────────────────────────────────┤

   │                                                                           │

   │                    ┌──────────────────────┐                               │

   │                    │     E2E Tests        │  ← 10%                       │

   │                    │   (Playwright)       │  Luồng chính                 │

   │                   ╱└──────────────────────┘╲                              │

   │                  ╱  ┌──────────────────────┐ ╲                            │

   │                 ╱   │  Integration Tests   │  ╲  ← 30%                   │

   │                ╱    │  (API + DB + Cache)  │   ╲ Controller + Service    │

   │               ╱     └──────────────────────┘    ╲                        │

   │              ╱  ┌──────────────────────────────┐ ╲                       │

   │             ╱   │       Unit Tests              │  ╲  ← 60%              │

   │            ╱    │   (Service + Utility logic)   │   ╲ Từng hàm          │

   │           ╱     └──────────────────────────────┘    ╲                    │

   │          └───────────────────────────────────────────┘                    │

   │                     TESTING PYRAMID                                       │

   │                                                                           │

   │  ┌────────────────────────────────────────────────────────────────┐     │

   │  │  📌 UNIT TESTS (Jest)                                          │     │

   │  │                                                                 │     │

   │  │  Backend:                                                       │     │

   │  │  ┌──────────────────────────────────────────────────────┐     │     │

   │  │  │                                                       │     │     │

   │  │  │  // srs-algorithm.service.spec.ts                    │     │     │

   │  │  │                                                       │     │     │

   │  │  │  describe('SRS Algorithm', () => {                   │     │     │

   │  │  │                                                       │     │     │

   │  │  │    it('should reset card when rating is Again', () =>│     │     │

   │  │  │      const result = calculateNextReview({            │     │     │

   │  │  │        rating: 'again',                              │     │     │

   │  │  │        easeFactor: 2.5,                              │     │     │

   │  │  │        interval: 10,                                 │     │     │

   │  │  │        repetitions: 3                                │     │     │

   │  │  │      });                                             │     │     │

   │  │  │      expect(result.repetitions).toBe(0);            │     │     │

   │  │  │      expect(result.interval).toBe(1); // 1 minute   │     │     │

   │  │  │      expect(result.easeFactor).toBe(2.3); // -0.2   │     │     │

   │  │  │    });                                               │     │     │

   │  │  │                                                       │     │     │

   │  │  │    it('should increase interval when Good', () => {  │     │     │

   │  │  │      // ...                                          │     │     │

   │  │  │    });                                               │     │     │

   │  │  │                                                       │     │     │

   │  │  │    it('should not let easeFactor go below 1.3',()=> {│     │     │

   │  │  │      // ...                                          │     │     │

   │  │  │    });                                               │     │     │

   │  │  │                                                       │     │     │

   │  │  │    it('should calculate correct next review date',   │     │     │

   │  │  │      // ...                                          │     │     │

   │  │  │    });                                               │     │     │

   │  │  │  });                                                 │     │     │

   │  │  │                                                       │     │     │

   │  │  │  // question-generator.service.spec.ts               │     │     │

   │  │  │  // xp.service.spec.ts                               │     │     │

   │  │  │  // streak.service.spec.ts                           │     │     │

   │  │  │  // achievement.service.spec.ts                      │     │     │

   │  │  │  // game-engine.service.spec.ts                      │     │     │

   │  │  │                                                       │     │     │

   │  │  └──────────────────────────────────────────────────────┘     │     │

   │  │                                                                 │     │

   │  │  Frontend:                                                      │     │

   │  │  ┌──────────────────────────────────────────────────────┐     │     │

   │  │  │                                                       │     │     │

   │  │  │  // flashcard-viewer.test.tsx                         │     │     │

   │  │  │  describe('FlashcardViewer', () => {                 │     │     │

   │  │  │                                                       │     │     │

   │  │  │    it('should show front side by default', () => {   │     │     │

   │  │  │      render(<FlashcardViewer card={mockCard} />);    │     │     │

   │  │  │      expect(screen.getByText('Accomplish'))          │     │     │

   │  │  │        .toBeInTheDocument();                         │     │     │

   │  │  │      expect(screen.queryByText('Hoàn thành'))        │     │     │

   │  │  │        .not.toBeVisible();                           │     │     │

   │  │  │    });                                               │     │     │

   │  │  │                                                       │     │     │

   │  │  │    it('should flip to back on click', async () => {  │     │     │

   │  │  │      render(<FlashcardViewer card={mockCard} />);    │     │     │

   │  │  │      fireEvent.click(screen.getByTestId('card'));    │     │     │

   │  │  │      await waitFor(() => {                           │     │     │

   │  │  │        expect(screen.getByText('Hoàn thành'))        │     │     │

   │  │  │          .toBeVisible();                             │     │     │

   │  │  │      });                                             │     │     │

   │  │  │    });                                               │     │     │

   │  │  │                                                       │     │     │

   │  │  │    it('should show rating buttons after flip', () => │     │     │

   │  │  │    it('should play audio on speaker click', () =>    │     │     │

   │  │  │    it('should call onRate with correct value', () => │     │     │

   │  │  │  });                                                 │     │     │

   │  │  │                                                       │     │     │

   │  │  │  // srs-rating-buttons.test.tsx                      │     │     │

   │  │  │  // game-timer.test.tsx                              │     │     │

   │  │  │  // matching-board.test.tsx                          │     │     │

   │  │  │  // streak-counter.test.tsx                          │     │     │

   │  │  │  // achievement-badge.test.tsx                       │     │     │

   │  │  │  // notification-bell.test.tsx                       │     │     │

   │  │  │                                                       │     │     │

   │  │  │  // Hook tests                                       │     │     │

   │  │  │  // useAuth.test.ts                                  │     │     │

   │  │  │  // useTimer.test.ts                                 │     │     │

   │  │  │  // useSRS.test.ts                                   │     │     │

   │  │  │                                                       │     │     │

   │  │  │  // Utility tests                                    │     │     │

   │  │  │  // srs-algorithm.test.ts (client-side)              │     │     │

   │  │  │  // date-utils.test.ts                               │     │     │

   │  │  │  // format.test.ts                                   │     │     │

   │  │  │                                                       │     │     │

   │  │  └──────────────────────────────────────────────────────┘     │     │

   │  │                                                                 │     │

   │  └────────────────────────────────────────────────────────────────┘     │

   │                                                                           │

   │  ┌────────────────────────────────────────────────────────────────┐     │

   │  │  📌 INTEGRATION TESTS (Supertest + Jest)                       │     │

   │  │                                                                 │     │

   │  │  ┌──────────────────────────────────────────────────────┐     │     │

   │  │  │                                                       │     │     │

   │  │  │  // auth.integration.spec.ts                         │     │     │

   │  │  │  describe('Auth Module (Integration)', () => {       │     │     │

   │  │  │                                                       │     │     │

   │  │  │    beforeAll(async () => {                           │     │     │

   │  │  │      // Setup test DB, run migrations, seed data    │     │     │

   │  │  │      app = await createTestApp();                    │     │     │

   │  │  │    });                                               │     │     │

   │  │  │                                                       │     │     │

   │  │  │    describe('POST /api/v1/auth/register', () => {    │     │     │

   │  │  │                                                       │     │     │

   │  │  │      it('should register new user', async () => {    │     │     │

   │  │  │        const res = await request(app.getHttpServer())│     │     │

   │  │  │          .post('/api/v1/auth/register')              │     │     │

   │  │  │          .send({                                     │     │     │

   │  │  │            email: 'test@example.com',                │     │     │

   │  │  │            password: 'Test@1234',                    │     │     │

   │  │  │            displayName: 'Test User'                  │     │     │

   │  │  │          });                                         │     │     │

   │  │  │        expect(res.status).toBe(201);                 │     │     │

   │  │  │        expect(res.body.success).toBe(true);          │     │     │

   │  │  │        expect(res.body.data.email)                   │     │     │

   │  │  │          .toBe('test@example.com');                   │     │     │

   │  │  │        // Check DB record created                    │     │     │

   │  │  │        // Check email verification sent              │     │     │

   │  │  │      });                                             │     │     │

   │  │  │                                                       │     │     │

   │  │  │      it('should reject duplicate email', async () => │     │     │

   │  │  │      it('should reject weak password', async () =>   │     │     │

   │  │  │      it('should reject invalid email', async () =>   │     │     │

   │  │  │    });                                               │     │     │

   │  │  │                                                       │     │     │

   │  │  │    describe('POST /api/v1/auth/login', () => {       │     │     │

   │  │  │      it('should login with correct credentials',()=> │     │     │

   │  │  │      it('should reject wrong password', async () =>  │     │     │

   │  │  │      it('should reject unverified email', async ()=> │     │     │

   │  │  │      it('should reject banned user', async () =>     │     │     │

   │  │  │      it('should rate limit after 5 attempts',()=>    │     │     │

   │  │  │    });                                               │     │     │

   │  │  │  });                                                 │     │     │

   │  │  │                                                       │     │     │

   │  │  │  // learning.integration.spec.ts                     │     │     │

   │  │  │  describe('Learning Module (Integration)', () => {   │     │     │

   │  │  │                                                       │     │     │

   │  │  │    describe('GET /api/v1/learn/due-cards', () => {   │     │     │

   │  │  │      it('should return only due cards', async () =>  │     │     │

   │  │  │      it('should respect daily limit', async () =>    │     │     │

   │  │  │      it('should require auth', async () =>           │     │     │

   │  │  │    });                                               │     │     │

   │  │  │                                                       │     │     │

   │  │  │    describe('POST /api/v1/learn/cards/:id/review',   │     │     │

   │  │  │      () => {                                         │     │     │

   │  │  │      it('should update SRS after "good" rating',     │     │     │

   │  │  │        async () => {                                 │     │     │

   │  │  │          const before = await getCardProgress(42);   │     │     │

   │  │  │          await request(app.getHttpServer())          │     │     │

   │  │  │            .post('/api/v1/learn/cards/42/review')    │     │     │

   │  │  │            .set('Authorization', `Bearer ${token}`)  │     │     │

   │  │  │            .send({ rating: 'good' });                │     │     │

   │  │  │          const after = await getCardProgress(42);    │     │     │

   │  │  │          expect(after.repetitions)                   │     │     │

   │  │  │            .toBe(before.repetitions + 1);            │     │     │

   │  │  │          expect(after.interval)                      │     │     │

   │  │  │            .toBeGreaterThan(before.interval);        │     │     │

   │  │  │          expect(after.nextReviewDate)                │     │     │

   │  │  │            .toBeAfter(new Date());                   │     │     │

   │  │  │        });                                           │     │     │

   │  │  │      it('should reset on "again" rating',()=>       │     │     │

   │  │  │      it('should update XP', async () =>              │     │     │

   │  │  │      it('should update streak', async () =>          │     │     │

   │  │  │      it('should trigger achievement check',()=>      │     │     │

   │  │  │    });                                               │     │     │

   │  │  │  });                                                 │     │     │

   │  │  │                                                       │     │     │

   │  │  │  // games.integration.spec.ts                        │     │     │

   │  │  │  // tests.integration.spec.ts                        │     │     │

   │  │  │  // classrooms.integration.spec.ts                   │     │     │

   │  │  │  // admin.integration.spec.ts                        │     │     │

   │  │  │  // notifications.integration.spec.ts                │     │     │

   │  │  │                                                       │     │     │

   │  │  └──────────────────────────────────────────────────────┘     │     │

   │  │                                                                 │     │

   │  └────────────────────────────────────────────────────────────────┘     │

   │                                                                           │

   │  ┌────────────────────────────────────────────────────────────────┐     │

   │  │  📌 E2E TESTS (Playwright)                                     │     │

   │  │                                                                 │     │

   │  │  ┌──────────────────────────────────────────────────────┐     │     │

   │  │  │                                                       │     │     │

   │  │  │  // auth.e2e.spec.ts                                 │     │     │

   │  │  │  test('Complete registration flow', async ({page})=> │     │     │

   │  │  │    // 1. Go to register page                         │     │     │

   │  │  │    await page.goto('/register');                      │     │     │

   │  │  │    // 2. Fill form                                   │     │     │

   │  │  │    await page.fill('[name="email"]',                 │     │     │

   │  │  │      'e2e@test.com');                                │     │     │

   │  │  │    await page.fill('[name="password"]',              │     │     │

   │  │  │      'Test@1234');                                   │     │     │

   │  │  │    await page.fill('[name="displayName"]',           │     │     │

   │  │  │      'E2E Test');                                    │     │     │

   │  │  │    // 3. Submit                                      │     │     │

   │  │  │    await page.click('button[type="submit"]');        │     │     │

   │  │  │    // 4. Check redirect                              │     │     │

   │  │  │    await expect(page).toHaveURL('/verify-email');    │     │     │

   │  │  │    // 5. Verify email (mock)                         │     │     │

   │  │  │    // 6. Login                                       │     │     │

   │  │  │    // 7. Check dashboard                             │     │     │

   │  │  │  });                                                 │     │     │

   │  │  │                                                       │     │     │

   │  │  │  // learning.e2e.spec.ts                             │     │     │

   │  │  │  test('Complete learning session', async ({page})=>  │     │     │

   │  │  │    // 1. Login                                       │     │     │

   │  │  │    // 2. Go to deck                                  │     │     │

   │  │  │    // 3. Start learning session                      │     │     │

   │  │  │    // 4. View card front                             │     │     │

   │  │  │    // 5. Flip card                                   │     │     │

   │  │  │    // 6. Rate "Good"                                 │     │     │

   │  │  │    // 7. Verify next card shows                      │     │     │

   │  │  │    // 8. Complete session                            │     │     │

   │  │  │    // 9. Verify session summary                      │     │     │

   │  │  │    // 10. Verify XP updated                          │     │     │

   │  │  │  });                                                 │     │     │

   │  │  │                                                       │     │     │

   │  │  │  // games.e2e.spec.ts                                │     │     │

   │  │  │  test('Play matching game', async ({page}) => {      │     │     │

   │  │  │    // 1. Login → Games Hub                           │     │     │

   │  │  │    // 2. Select "Matching Pairs"                     │     │     │

   │  │  │    // 3. Choose deck & difficulty                    │     │     │

   │  │  │    // 4. Play game (click pairs)                     │     │     │

   │  │  │    // 5. Verify score updates                        │     │     │

   │  │  │    // 6. Complete game                               │     │     │

   │  │  │    // 7. Verify result screen                        │     │     │

   │  │  │    // 8. Verify XP earned                            │     │     │

   │  │  │  });                                                 │     │     │

   │  │  │                                                       │     │     │

   │  │  │  // teacher.e2e.spec.ts                              │     │     │

   │  │  │  test('Teacher application flow', async ({page})=>   │     │     │

   │  │  │    // 1. Register as learner                         │     │     │

   │  │  │    // 2. Apply for teacher                           │     │     │

   │  │  │    // 3. Upload certificates                         │     │     │

   │  │  │    // 4. Submit application                          │     │     │

   │  │  │    // 5. Login as admin                              │     │     │

   │  │  │    // 6. Review application                          │     │     │

   │  │  │    // 7. Approve                                     │     │     │

   │  │  │    // 8. Login as teacher                            │     │     │

   │  │  │    // 9. Verify teacher dashboard access             │     │     │

   │  │  │    // 10. Create classroom                           │     │     │

   │  │  │  });                                                 │     │     │

   │  │  │                                                       │     │     │

   │  │  │  // i18n.e2e.spec.ts                                 │     │     │

   │  │  │  test('Language switch', async ({page}) => {         │     │     │

   │  │  │    // 1. Load page in Vietnamese                     │     │     │

   │  │  │    // 2. Verify Vietnamese text                      │     │     │

   │  │  │    // 3. Switch to English                           │     │     │

   │  │  │    // 4. Verify English text                         │     │     │

   │  │  │    // 5. Refresh → still English                     │     │     │

   │  │  │  });                                                 │     │     │

   │  │  │                                                       │     │     │

   │  │  │  // reminder.e2e.spec.ts                             │     │     │

   │  │  │  // test.e2e.spec.ts                                 │     │     │

   │  │  │  // admin.e2e.spec.ts                                │     │     │

   │  │  │                                                       │     │     │

   │  │  └──────────────────────────────────────────────────────┘     │     │

   │  │                                                                 │     │

   │  └────────────────────────────────────────────────────────────────┘     │

   │                                                                           │

   │  ┌────────────────────────────────────────────────────────────────┐     │

   │  │  📌 TEST COVERAGE TARGETS                                      │     │

   │  │                                                                 │     │

   │  │  ┌────────────────────────┬─────────┬─────────────────────┐   │     │

   │  │  │ Area                   │ Target  │ Priority             │   │     │

   │  │  ├────────────────────────┼─────────┼─────────────────────┤   │     │

   │  │  │ SRS Algorithm          │  95%+   │ 🔴 Critical          │   │     │

   │  │  │ Auth Service           │  90%+   │ 🔴 Critical          │   │     │

   │  │  │ Game Engines           │  85%+   │ 🟡 High              │   │     │

   │  │  │ Question Generator     │  85%+   │ 🟡 High              │   │     │

   │  │  │ XP / Streak / Achieve. │  85%+   │ 🟡 High              │   │     │

   │  │  │ Deck/Card CRUD         │  80%+   │ 🟡 High              │   │     │

   │  │  │ Notification Service   │  80%+   │ 🟢 Medium            │   │     │

   │  │  │ Admin Services         │  75%+   │ 🟢 Medium            │   │     │

   │  │  │ Upload Service         │  70%+   │ 🟢 Medium            │   │     │

   │  │  │ i18n Service           │  70%+   │ 🟢 Medium            │   │     │

   │  │  ├────────────────────────┼─────────┼─────────────────────┤   │     │

   │  │  │ OVERALL BACKEND        │  80%+   │                      │   │     │

   │  │  │ OVERALL FRONTEND       │  75%+   │                      │   │     │

   │  │  └────────────────────────┴─────────┴─────────────────────┘   │     │

   │  │                                                                 │     │

   │  └────────────────────────────────────────────────────────────────┘     │

   │                                                                           │

   └──────────────────────────────────────────────────────────────────────────┘

   -----
1. # <a name="_toc225239661"></a>**ENV CONFIGURATION**
   ┌──────────────────────────────────────────────────────────────────────────┐

   │                    ENVIRONMENT VARIABLES                                   │

   ├──────────────────────────────────────────────────────────────────────────┤

   │                                                                           │

   │  ┌────────────────────────────────────────────────────────────────┐     │

   │  │  📌 BACKEND (.env)                                             │     │

   │  │                                                                 │     │

   │  │  # ═══════════ APP ═══════════                                 │     │

   │  │  NODE\_ENV=development                                          │     │

   │  │  APP\_PORT=4000                                                 │     │

   │  │  APP\_URL=http://localhost:4000                                 │     │

   │  │  FRONTEND\_URL=http://localhost:3000                            │     │

   │  │  API\_PREFIX=api/v1                                             │     │

   │  │  APP\_DEFAULT\_LANGUAGE=vi                                       │     │

   │  │                                                                 │     │

   │  │  # ═══════════ DATABASE ═══════════                            │     │

   │  │  DATABASE\_URL=postgresql://user:pass@localhost:5432/flashlearn │     │

   │  │  DATABASE\_POOL\_SIZE=20                                         │     │

   │  │                                                                 │     │

   │  │  # ═══════════ REDIS ═══════════                               │     │

   │  │  REDIS\_HOST=localhost                                          │     │

   │  │  REDIS\_PORT=6379                                               │     │

   │  │  REDIS\_PASSWORD=                                               │     │

   │  │  REDIS\_DB=0                                                    │     │

   │  │                                                                 │     │

   │  │  # ═══════════ JWT ═══════════                                 │     │

   │  │  JWT\_ACCESS\_SECRET=your-access-secret-key-min-32-chars         │     │

   │  │  JWT\_ACCESS\_EXPIRATION=15m                                     │     │

   │  │  JWT\_REFRESH\_SECRET=your-refresh-secret-key-min-32-chars       │     │

   │  │  JWT\_REFRESH\_EXPIRATION=7d                                     │     │

   │  │                                                                 │     │

   │  │  # ═══════════ OAUTH ═══════════                               │     │

   │  │  GOOGLE\_CLIENT\_ID=                                             │     │

   │  │  GOOGLE\_CLIENT\_SECRET=                                         │     │

   │  │  GOOGLE\_CALLBACK\_URL=http://localhost:4000/api/v1/auth/google  │     │

   │  │  FACEBOOK\_APP\_ID=                                              │     │

   │  │  FACEBOOK\_APP\_SECRET=                                          │     │

   │  │  FACEBOOK\_CALLBACK\_URL=                                        │     │

   │  │                                                                 │     │

   │  │  # ═══════════ EMAIL ═══════════                               │     │

   │  │  MAIL\_HOST=smtp.sendgrid.net                                   │     │

   │  │  MAIL\_PORT=587                                                 │     │

   │  │  MAIL\_USER=apikey                                              │     │

   │  │  MAIL\_PASS=your-sendgrid-api-key                               │     │

   │  │  MAIL\_FROM="FlashLearn <noreply@flashlearn.com>"               │     │

   │  │                                                                 │     │

   │  │  # ═══════════ STORAGE (S3) ═══════════                        │     │

   │  │  S3\_ENDPOINT=http://localhost:9000                              │     │

   │  │  S3\_ACCESS\_KEY=minioadmin                                      │     │

   │  │  S3\_SECRET\_KEY=minioadmin                                      │     │

   │  │  S3\_BUCKET\_NAME=flashlearn                                     │     │

   │  │  S3\_REGION=us-east-1                                           │     │

   │  │  S3\_PUBLIC\_URL=http://localhost:9000/flashlearn                 │     │

   │  │                                                                 │     │

   │  │  # ═══════════ PUSH NOTIFICATION ═══════════                   │     │

   │  │  FIREBASE\_PROJECT\_ID=                                          │     │

   │  │  FIREBASE\_PRIVATE\_KEY=                                         │     │

   │  │  FIREBASE\_CLIENT\_EMAIL=                                        │     │

   │  │                                                                 │     │

   │  │  # ═══════════ RATE LIMITING ═══════════                       │     │

   │  │  THROTTLE\_TTL=60                                               │     │

   │  │  THROTTLE\_LIMIT=100                                            │     │

   │  │  THROTTLE\_AUTH\_LIMIT=10                                        │     │

   │  │                                                                 │     │

   │  │  # ═══════════ SRS DEFAULTS ═══════════                        │     │

   │  │  SRS\_DEFAULT\_NEW\_CARDS\_PER\_DAY=20                              │     │

   │  │  SRS\_DEFAULT\_REVIEW\_CARDS\_PER\_DAY=200                          │     │

   │  │  SRS\_MIN\_EASE\_FACTOR=1.3                                       │     │

   │  │  SRS\_DEFAULT\_EASE\_FACTOR=2.5                                   │     │

   │  │                                                                 │     │

   │  │  # ═══════════ SENTRY ═══════════                              │     │

   │  │  SENTRY\_DSN=                                                   │     │

   │  │  SENTRY\_ENVIRONMENT=development                                │     │

   │  │                                                                 │     │

   │  └────────────────────────────────────────────────────────────────┘     │

   │                                                                           │

   │  ┌────────────────────────────────────────────────────────────────┐     │

   │  │  📌 FRONTEND (.env.local)                                      │     │

   │  │                                                                 │     │

   │  │  NEXT\_PUBLIC\_API\_URL=http://localhost:4000/api/v1              │     │

   │  │  NEXT\_PUBLIC\_WS\_URL=ws://localhost:4000                        │     │

   │  │  NEXT\_PUBLIC\_APP\_NAME=FlashLearn                               │     │

   │  │  NEXT\_PUBLIC\_DEFAULT\_LOCALE=vi                                 │     │

   │  │  NEXT\_PUBLIC\_SUPPORTED\_LOCALES=vi,en,ja,ko                    │     │

   │  │  NEXT\_PUBLIC\_SENTRY\_DSN=                                       │     │

   │  │  NEXT\_PUBLIC\_FIREBASE\_CONFIG={}                                │     │

   │  │  NEXT\_PUBLIC\_GOOGLE\_ANALYTICS\_ID=                              │     │

   │  │                                                                 │     │

   │  └────────────────────────────────────────────────────────────────┘     │

   │                                                                           │

   └──────────────────────────────────────────────────────────────────────────┘

   -----
1. # <a name="_toc225239662"></a>**FINAL CHECKLIST TRƯỚC KHI TRIỂN KHAI**
   ┌──────────────────────────────────────────────────────────────────────────┐

   │                    📋 PRE-LAUNCH CHECKLIST                                │

   ├──────────────────────────────────────────────────────────────────────────┤

   │                                                                           │

   │  ┌────────────────────────────────────────────────────────────────┐     │

   │  │  ✅ FUNCTIONAL CHECKLIST                                       │     │

   │  │                                                                 │     │

   │  │  Auth:                                                          │     │

   │  │  ☐ Register with email verification works                      │     │

   │  │  ☐ Login / Logout works correctly                               │     │

   │  │  ☐ Password reset flow complete                                 │     │

   │  │  ☐ OAuth login works (Google, Facebook)                        │     │

   │  │  ☐ JWT refresh token rotation works                            │     │

   │  │  ☐ Role-based access control tested                            │     │

   │  │                                                                 │     │

   │  │  Flashcard:                                                     │     │

   │  │  ☐ CRUD deck works                                             │     │

   │  │  ☐ CRUD flashcard works (with image + audio)                  │     │

   │  │  ☐ CSV import works correctly                                  │     │

   │  │  ☐ Deck clone works                                            │     │

   │  │  ☐ Search & filter works                                       │     │

   │  │  ☐ Public deck library works                                   │     │

   │  │                                                                 │     │

   │  │  SRS:                                                           │     │

   │  │  ☐ SM-2 algorithm calculates correctly                         │     │

   │  │  ☐ Leitner box visualization works                             │     │

   │  │  ☐ Due cards query works correctly                             │     │

   │  │  ☐ Card progress saved & restored correctly                    │     │

   │  │  ☐ New cards / Review cards limits work                        │     │

   │  │  ☐ Session summary correct                                     │     │

   │  │                                                                 │     │

   │  │  Games:                                                         │     │

   │  │  ☐ All 7 games playable without errors                        │     │

   │  │  ☐ Score calculation correct                                    │     │

   │  │  ☐ Timer works correctly                                       │     │

   │  │  ☐ Game results saved to DB                                    │     │

   │  │  ☐ Leaderboard updates after game                              │     │

   │  │                                                                 │     │

   │  │  Tests:                                                         │     │

   │  │  ☐ Auto-generate questions works                               │     │

   │  │  ☐ All question types render correctly                         │     │

   │  │  ☐ Test submission & grading correct                           │     │

   │  │  ☐ Test result display correct                                  │     │

   │  │  ☐ Daily quiz generation works                                  │     │

   │  │                                                                 │     │

   │  │  Notifications:                                                 │     │

   │  │  ☐ In-app notification works                                   │     │

   │  │  ☐ Email notifications send correctly                          │     │

   │  │  ☐ Push notifications work (Browser/PWA)                       │     │

   │  │  ☐ Reminder scheduler runs on time                             │     │

   │  │  ☐ Timezone handling correct                                    │     │

   │  │  ☐ Reminder settings save & load correctly                     │     │

   │  │  ☐ Streak reminder triggers at correct time                    │     │

   │  │  ☐ Notification read/unread status works                       │     │

   │  │  ☐ Unsubscribe from specific notification types works          │     │

   │  │                                                                 │     │

   │  │  Teacher:                                                       │     │

   │  │  ☐ Teacher application form works                               │     │

   │  │  ☐ File upload for certificates works                           │     │

   │  │  ☐ Application status visible to applicant                     │     │

   │  │  ☐ Admin can approve / reject with reason                      │     │

   │  │  ☐ Email sent on approve / reject                               │     │

   │  │  ☐ Role updated after approval                                  │     │

   │  │  ☐ Classroom CRUD works                                         │     │

   │  │  ☐ Student invitation (code/link) works                        │     │

   │  │  ☐ Assign deck to classroom works                               │     │

   │  │  ☐ Assign test to classroom works                               │     │

   │  │  ☐ Student progress tracking accurate                          │     │

   │  │  ☐ Export report (PDF/Excel) works                              │     │

   │  │                                                                 │     │

   │  │  Admin:                                                         │     │

   │  │  ☐ Dashboard data accurate                                     │     │

   │  │  ☐ User management CRUD works                                  │     │

   │  │  ☐ Ban / Unban user works                                      │     │

   │  │  ☐ Role & Permission management works                          │     │

   │  │  ☐ Content moderation (approve/reject decks) works             │     │

   │  │  ☐ Report handling works                                        │     │

   │  │  ☐ Language management works                                    │     │

   │  │  ☐ Translation import/export works                              │     │

   │  │  ☐ System configuration works                                   │     │

   │  │  ☐ Audit logs recording correctly                               │     │

   │  │                                                                 │     │

   │  │  i18n:                                                          │     │

   │  │  ☐ All UI text translated (VI + EN minimum)                    │     │

   │  │  ☐ Language switcher works without page reload                 │     │

   │  │  ☐ Preference saved to user profile                            │     │

   │  │  ☐ Fallback language works when key missing                    │     │

   │  │  ☐ Date/time format localized                                   │     │

   │  │  ☐ Number format localized                                      │     │

   │  │  ☐ Email templates translated                                   │     │

   │  │  ☐ Error messages translated                                    │     │

   │  │                                                                 │     │

   │  │  Gamification:                                                  │     │

   │  │  ☐ XP earned correctly for all actions                         │     │

   │  │  ☐ Level up triggers correctly                                  │     │

   │  │  ☐ Streak counting accurate                                     │     │

   │  │  ☐ Streak freeze works                                          │     │

   │  │  ☐ Streak reset at midnight (user timezone)                    │     │

   │  │  ☐ Achievements unlock at correct conditions                   │     │

   │  │  ☐ Leaderboard rankings accurate                               │     │

   │  │  ☐ Leaderboard periods (weekly/monthly) reset correctly        │     │

   │  │                                                                 │     │

   │  └────────────────────────────────────────────────────────────────┘     │

   │                                                                           │

   │  ┌────────────────────────────────────────────────────────────────┐     │

   │  │  🔧 TECHNICAL CHECKLIST                                        │     │

   │  │                                                                 │     │

   │  │  Performance:                                                   │     │

   │  │  ☐ Lighthouse score > 90 (Performance)                         │     │

   │  │  ☐ Lighthouse score > 90 (Accessibility)                       │     │

   │  │  ☐ LCP < 2.5s on 4G connection                                │     │

   │  │  ☐ FID < 100ms                                                 │     │

   │  │  ☐ CLS < 0.1                                                   │     │

   │  │  ☐ API response time p95 < 500ms                               │     │

   │  │  ☐ Database queries < 100ms (p95)                              │     │

   │  │  ☐ No N+1 query problems                                       │     │

   │  │  ☐ Redis caching functioning                                    │     │

   │  │  ☐ Image optimization (WebP, lazy loading)                     │     │

   │  │  ☐ Bundle size < 500KB (initial load)                          │     │

   │  │  ☐ Code splitting verified                                      │     │

   │  │                                                                 │     │

   │  │  Security:                                                      │     │

   │  │  ☐ All items in Security Checklist (Section 14) verified       │     │

   │  │  ☐ OWASP Top 10 vulnerabilities checked                       │     │

   │  │  ☐ npm audit shows 0 critical vulnerabilities                  │     │

   │  │  ☐ Penetration testing completed (basic)                       │     │

   │  │  ☐ SSL/TLS configured and tested                               │     │

   │  │  ☐ CORS properly configured                                    │     │

   │  │  ☐ Rate limiting tested under load                             │     │

   │  │  ☐ File upload security tested                                  │     │

   │  │  ☐ SQL injection attempts blocked                               │     │

   │  │  ☐ XSS attempts blocked                                        │     │

   │  │                                                                 │     │

   │  │  Infrastructure:                                                │     │

   │  │  ☐ Docker images build successfully                            │     │

   │  │  ☐ Docker Compose starts all services                          │     │

   │  │  ☐ CI/CD pipeline passes all stages                            │     │

   │  │  ☐ Staging environment mirrors production                      │     │

   │  │  ☐ Database migrations run without errors                      │     │

   │  │  ☐ Database seed data loads correctly                          │     │

   │  │  ☐ Backup automation configured & tested                       │     │

   │  │  ☐ Restore from backup tested                                   │     │

   │  │  ☐ Monitoring dashboards configured                             │     │

   │  │  ☐ Alert rules configured & tested                              │     │

   │  │  ☐ Log aggregation working                                      │     │

   │  │  ☐ Error tracking (Sentry) connected                           │     │

   │  │  ☐ Health check endpoint responding                             │     │

   │  │  ☐ SSL certificate valid & auto-renewing                       │     │

   │  │  ☐ DNS configured correctly                                     │     │

   │  │  ☐ CDN configured for static assets                            │     │

   │  │                                                                 │     │

   │  │  Testing:                                                       │     │

   │  │  ☐ Unit test coverage > 80%                                    │     │

   │  │  ☐ Integration tests pass                                       │     │

   │  │  ☐ E2E tests pass all critical flows                           │     │

   │  │  ☐ Load testing: supports 1000 concurrent users               │     │

   │  │  ☐ Cross-browser testing (Chrome, Firefox, Safari, Edge)      │     │

   │  │  ☐ Responsive testing (Mobile, Tablet, Desktop)               │     │

   │  │  ☐ Offline mode tested (PWA)                                    │     │

   │  │                                                                 │     │

   │  │  Documentation:                                                 │     │

   │  │  ☐ API documentation (Swagger) complete & accurate            │     │

   │  │  ☐ README.md with setup instructions                           │     │

   │  │  ☐ Database schema documentation                                │     │

   │  │  ☐ Deployment guide                                             │     │

   │  │  ☐ Environment variables documentation                         │     │

   │  │  ☐ Contributing guide                                           │     │

   │  │  ☐ Changelog maintained                                        │     │

   │  │                                                                 │     │

   │  └────────────────────────────────────────────────────────────────┘     │

   │                                                                           │

   │  ┌────────────────────────────────────────────────────────────────┐     │

   │  │  📱 UX / UI CHECKLIST                                          │     │

   │  │                                                                 │     │

   │  │  ☐ Responsive trên mobile (320px - 480px)                     │     │

   │  │  ☐ Responsive trên tablet (768px - 1024px)                    │     │

   │  │  ☐ Responsive trên desktop (1024px+)                           │     │

   │  │  ☐ Dark mode hoạt động đúng trên tất cả screens              │     │

   │  │  ☐ Loading states cho tất cả async operations                 │     │

   │  │  ☐ Empty states cho tất cả lists                              │     │

   │  │  ☐ Error states hiển thị friendly message                     │     │

   │  │  ☐ Form validation hiển thị rõ ràng                           │     │

   │  │  ☐ Animations smooth (60fps)                                   │     │

   │  │  ☐ Card flip animation mượt                                    │     │

   │  │  ☐ Game interactions responsive                                │     │

   │  │  ☐ Touch-friendly (mobile games)                               │     │

   │  │  ☐ Keyboard navigation works                                   │     │

   │  │  ☐ Screen reader accessible (ARIA labels)                     │     │

   │  │  ☐ Color contrast ratio > 4.5:1                                │     │

   │  │  ☐ Focus indicators visible                                    │     │

   │  │  ☐ 404 page designed                                           │     │

   │  │  ☐ 500 error page designed                                     │     │

   │  │  ☐ Maintenance page designed                                    │     │

   │  │  ☐ Favicon & App icons configured                              │     │

   │  │  ☐ Open Graph meta tags (social sharing)                       │     │

   │  │  ☐ PWA installable                                              │     │

   │  │                                                                 │     │

   │  └────────────────────────────────────────────────────────────────┘     │

   │                                                                           │

   │  ┌────────────────────────────────────────────────────────────────┐     │

   │  │  📜 LEGAL & COMPLIANCE CHECKLIST                               │     │

   │  │                                                                 │     │

   │  │  ☐ Terms of Service page                                       │     │

   │  │  ☐ Privacy Policy page (GDPR compliant)                       │     │

   │  │  ☐ Cookie consent banner                                       │     │

   │  │  ☐ Data deletion request mechanism                             │     │

   │  │  ☐ Data export request mechanism                               │     │

   │  │  ☐ Copyright notice                                             │     │

   │  │  ☐ Open source license compliance                               │     │

   │  │  ☐ Third-party service agreements                               │     │

   │  │                                                                 │     │

   │  └────────────────────────────────────────────────────────────────┘     │

   │                                                                           │

   └──────────────────────────────────────────────────────────────────────────┘

   -----
1. # <a name="_toc225239663"></a>**TÀI LIỆU HỆ THỐNG - DANH SÁCH HOÀN CHỈNH**
   ┌──────────────────────────────────────────────────────────────────────────┐

   │              📚 DOCUMENT INDEX - TOÀN BỘ PHÂN TÍCH                       │

   ├──────────────────────────────────────────────────────────────────────────┤

   │                                                                           │

   │   #  │ Phần                              │ Trạng thái                    │

   │  ────┼───────────────────────────────────┼──────────────────────────     │

   │   1  │ Tổng quan hệ thống               │ ✅ Hoàn thành                  │

   │   2  │ Phân loại Actors & Phân quyền    │ ✅ Hoàn thành                  │

   │   3  │ Modules hệ thống chi tiết        │ ✅ Hoàn thành                  │

   │      │  3.1  Auth & Authorization        │ ✅                             │

   │      │  3.2  Flashcard Management        │ ✅                             │

   │      │  3.3  Spaced Repetition (SRS)     │ ✅                             │

   │      │  3.4  Notification & Reminder     │ ✅                             │

   │      │  3.5  Mini Games (7 games)        │ ✅                             │

   │      │  3.6  Mini Tests                  │ ✅                             │

   │      │  3.7  Đa ngôn ngữ (i18n)         │ ✅                             │

   │      │  3.8  Giáo viên (Teacher)         │ ✅                             │

   │      │  3.9  Admin Panel                 │ ✅                             │

   │      │  3.10 Thống kê & Gamification     │ ✅                             │

   │      │  3.11 Profile & Settings          │ ✅                             │

   │   4  │ Database Design (ERD)             │ ✅ Hoàn thành (25+ tables)    │

   │   5  │ System Architecture              │ ✅ Hoàn thành                  │

   │   6  │ Tech Stack                        │ ✅ Hoàn thành                  │

   │   7  │ API Endpoints Design             │ ✅ Hoàn thành (80+ APIs)      │

   │      │  7.1  Auth APIs                   │ ✅                             │

   │      │  7.2  User APIs                   │ ✅                             │

   │      │  7.3  Flashcard & Deck APIs       │ ✅                             │

   │      │  7.4  SRS & Learning APIs         │ ✅                             │

   │      │  7.5  Game & Test APIs            │ ✅                             │

   │      │  7.6  Notification APIs           │ ✅                             │

   │      │  7.7  Teacher APIs                │ ✅                             │

   │      │  7.8  Admin APIs                  │ ✅                             │

   │      │  7.9  Public & i18n APIs          │ ✅                             │

   │   8  │ Main Flows (Luồng xử lý)         │ ✅ Hoàn thành                  │

   │      │  8.1  Học Flashcard + SRS         │ ✅                             │

   │      │  8.2  Nhắc nhở theo chu kỳ       │ ✅                             │

   │      │  8.3  Chơi Mini Game              │ ✅                             │

   │      │  8.4  Đăng ký GV & Admin duyệt   │ ✅                             │

   │      │  8.5  Làm Mini Test              │ ✅                             │

   │   9  │ Wireframes                        │ ✅ Hoàn thành                  │

   │      │  9.1  Dashboard Người học         │ ✅                             │

   │      │  9.2  Màn hình học Flashcard      │ ✅                             │

   │      │  9.3  Mini Game Hub               │ ✅                             │

   │      │  9.4  Admin Dashboard             │ ✅                             │

   │      │  9.5  GV Quản lý lớp             │ ✅                             │

   │      │  9.6  Cài đặt nhắc nhở           │ ✅                             │

   │      │  9.7  Thống kê cá nhân           │ ✅                             │

   │  10  │ Development Roadmap              │ ✅ Hoàn thành (4 phases)      │

   │  11  │ Folder Structure                  │ ✅ Hoàn thành                  │

   │      │  11.1 Frontend (Next.js)          │ ✅                             │

   │      │  11.2 Backend (NestJS)            │ ✅                             │

   │  12  │ Docker & Deployment              │ ✅ Hoàn thành                  │

   │  13  │ CI/CD Pipeline                    │ ✅ Hoàn thành                  │

   │  14  │ Security Checklist               │ ✅ Hoàn thành                  │

   │  15  │ Performance Optimization         │ ✅ Hoàn thành                  │

   │  16  │ Tổng kết hệ thống               │ ✅ Hoàn thành                  │

   │  17  │ Monitoring & Logging             │ ✅ Hoàn thành                  │

   │  18  │ Error Handling Strategy          │ ✅ Hoàn thành                  │

   │  19  │ Testing Strategy                  │ ✅ Hoàn thành                  │

   │  20  │ Environment Configuration        │ ✅ Hoàn thành                  │

   │  21  │ Pre-Launch Checklist             │ ✅ Hoàn thành                  │

   │  22  │ Document Index                    │ ✅ Hoàn thành                  │

   │                                                                           │

   └──────────────────────────────────────────────────────────────────────────┘

   -----
1. # <a name="_toc225239664"></a>**🎯 KẾT LUẬN**
   ┌──────────────────────────────────────────────────────────────────────────┐

   │                         🎯 KẾT LUẬN                                      │

   ├──────────────────────────────────────────────────────────────────────────┤

   │                                                                           │

   │  Tài liệu phân tích hệ thống Web App Học Tiếng Anh bằng Flashcards     │

   │  đã bao gồm đầy đủ các phần sau:                                        │

   │                                                                           │

   │  ┌────────────────────────────────────────────────────────────────┐     │

   │  │                                                                 │     │

   │  │  📊 TỔNG KẾT SỐ LIỆU                                         │     │

   │  │                                                                 │     │

   │  │  ┌──────────────────────────────────────────────────┐         │     │

   │  │  │                                                   │         │     │

   │  │  │  • 22 phần tài liệu chi tiết                    │         │     │

   │  │  │  • 12 modules chính                               │         │     │

   │  │  │  • 25+ database tables                            │         │     │

   │  │  │  • 80+ API endpoints                              │         │     │

   │  │  │  • 7 mini games                                   │         │     │

   │  │  │  • 5 loại mini test                               │         │     │

   │  │  │  • 3 user roles (extendable via RBAC)            │         │     │

   │  │  │  • 4+ ngôn ngữ hỗ trợ                            │         │     │

   │  │  │  • 40+ wireframe screens                          │         │     │

   │  │  │  • 5 main flows chi tiết                          │         │     │

   │  │  │  • 4 development phases                           │         │     │

   │  │  │  • Complete CI/CD pipeline                        │         │     │

   │  │  │  • Full security checklist                        │         │     │

   │  │  │  • Full testing strategy                          │         │     │

   │  │  │  • Performance optimization plan                  │         │     │

   │  │  │  • Monitoring & logging strategy                  │         │     │

   │  │  │  • Error handling standardization                 │         │     │

   │  │  │  • Pre-launch checklist (100+ items)              │         │     │

   │  │  │                                                   │         │     │

   │  │  └──────────────────────────────────────────────────┘         │     │

   │  │                                                                 │     │

   │  └────────────────────────────────────────────────────────────────┘     │

   │                                                                           │

   │  ┌────────────────────────────────────────────────────────────────┐     │

   │  │                                                                 │     │

   │  │  💡 KHUYẾN NGHỊ BẮT ĐẦU                                       │     │

   │  │                                                                 │     │

   │  │  Bước 1: Setup Project Foundation                               │     │

   │  │  ├── Clone boilerplate / init projects                         │     │

   │  │  ├── Setup Docker environment                                   │     │

   │  │  ├── Configure CI/CD pipeline                                   │     │

   │  │  └── Setup database + migrations                                │     │

   │  │                                                                 │     │

   │  │  Bước 2: Build MVP (Phase 1 - 10 tuần)                        │     │

   │  │  ├── Auth + User system                                        │     │

   │  │  ├── Flashcard CRUD                                             │     │

   │  │  ├── SRS algorithm                                              │     │

   │  │  ├── 3 basic games                                              │     │

   │  │  ├── Basic test                                                 │     │

   │  │  ├── i18n (VI + EN)                                             │     │

   │  │  └── Basic admin panel                                          │     │

   │  │                                                                 │     │

   │  │  Bước 3: User Testing & Feedback                               │     │

   │  │  ├── Internal testing (team)                                    │     │

   │  │  ├── Beta testing (50-100 users)                               │     │

   │  │  ├── Collect feedback                                           │     │

   │  │  └── Iterate on MVP                                             │     │

   │  │                                                                 │     │

   │  │  Bước 4: Enhanced Features (Phase 2)                           │     │

   │  │  ├── Advanced games + gamification                             │     │

   │  │  ├── Teacher + Classroom                                       │     │

   │  │  ├── Advanced notifications                                     │     │

   │  │  └── Full admin panel                                           │     │

   │  │                                                                 │     │

   │  │  Bước 5: Scale & Grow (Phase 3-4)                              │     │

   │  │  ├── Social features                                            │     │

   │  │  ├── PWA + Mobile app                                          │     │

   │  │  ├── AI features                                                │     │

   │  │  └── Monetization (if needed)                                   │     │

   │  │                                                                 │     │

   │  └────────────────────────────────────────────────────────────────┘     │

   │                                                                           │

   │  ┌────────────────────────────────────────────────────────────────┐     │

   │  │                                                                 │     │

   │  │  ⚠️ LƯU Ý QUAN TRỌNG                                         │     │

   │  │                                                                 │     │

   │  │  1. Bắt đầu từ MVP, không cố làm tất cả cùng lúc             │     │

   │  │                                                                 │     │

   │  │  2. SRS Algorithm là CORE - phải test kỹ và chính xác         │     │

   │  │     (Sai SRS = user không nhớ từ = fail sản phẩm)             │     │

   │  │                                                                 │     │

   │  │  3. UX trên Mobile phải mượt                                   │     │

   │  │     (80%+ users sẽ dùng mobile để học)                         │     │

   │  │                                                                 │     │

   │  │  4. Gamification giúp giữ chân user                            │     │

   │  │     (Streak + XP + Leaderboard = motivation)                   │     │

   │  │                                                                 │     │

   │  │  5. Notification đúng lúc, đúng chỗ                            │     │

   │  │     (Quá nhiều = user tắt hết = mất engagement)               │     │

   │  │                                                                 │     │

   │  │  6. Performance trên mobile data (3G/4G)                       │     │

   │  │     (Flashcard + Audio phải load nhanh)                        │     │

   │  │                                                                 │     │

   │  │  7. Data privacy quan trọng                                    │     │

   │  │     (Dữ liệu học tập là thông tin cá nhân)                    │     │

   │  │                                                                 │     │

   │  │  8. Luôn có fallback cho i18n                                  │     │

   │  │     (Missing translation → show English, không show key)       │     │

   │  │                                                                 │     │

   │  └────────────────────────────────────────────────────────────────┘     │

   │                                                                           │

   │  ╔════════════════════════════════════════════════════════════════╗     │

   │  ║                                                                ║     │

   │  ║   📄 TÀI LIỆU NÀY ĐÃ HOÀN TẤT                              ║     │

   │  ║                                                                ║     │

   │  ║   Tổng cộng 22 phần phân tích chi tiết bao gồm:              ║     │

   │  ║   • System Overview & Architecture                             ║     │

   │  ║   • 12 Feature Modules Analysis                                ║     │

   │  ║   • Database Design (ERD)                                      ║     │

   │  ║   • 80+ API Endpoints                                          ║     │

   │  ║   • 5 Main User Flows                                          ║     │

   │  ║   • 7 Screen Wireframes                                        ║     │

   │  ║   • Complete Tech Stack                                        ║     │

   │  ║   • Full Folder Structure                                      ║     │

   │  ║   • Docker & CI/CD Setup                                       ║     │

   │  ║   • Security, Performance, Testing Strategy                    ║     │

   │  ║   • Development Roadmap (4 Phases)                             ║     │

   │  ║   • Pre-Launch Checklist                                       ║     │

   │  ║                                                                ║     │

   │  ║   Sẵn sàng để bắt đầu phát triển! 🚀                        ║     │

   │  ║                                                                ║     │

   │  ╚════════════════════════════════════════════════════════════════╝     │

   │                                                                           │

   └──────────────────────────────────────────────────────────────────────────┘


1. # <a name="_toc225239665"></a>**TECH STACK MỚI (JAVA SPRING BOOT + NEXT.JS)**
   ┌──────────────────────────────────────────────────────────────────────────┐

   │                 UPDATED TECH STACK                                        │

   │            Java Spring Boot (BE) + Next.js (FE)                          │

   ├──────────────────────────────────────────────────────────────────────────┤

   │                                                                           │

   │   ┌─────────────────────────────────────────────────────────────────┐   │

   │   │                        CLIENT LAYER                              │   │

   │   │                                                                  │   │

   │   │   ┌──────────────────────────────────────────────────────────┐  │   │

   │   │   │                    NEXT.JS 14                             │  │   │

   │   │   │                                                           │  │   │

   │   │   │  • App Router (SSR / CSR / ISR / SSG)                    │  │   │

   │   │   │  • TypeScript                                             │  │   │

   │   │   │  • Tailwind CSS + shadcn/ui                              │  │   │

   │   │   │  • next-intl (i18n)                                      │  │   │

   │   │   │  • Zustand (State)                                       │  │   │

   │   │   │  • next-pwa (PWA)                                        │  │   │

   │   │   └──────────────────────────────────────────────────────────┘  │   │

   │   └───────────────────────────┬─────────────────────────────────────┘   │

   │                               │ REST API / WebSocket                     │

   │   ┌───────────────────────────▼─────────────────────────────────────┐   │

   │   │                     BACKEND LAYER                                │   │

   │   │                                                                  │   │

   │   │   ┌──────────────────────────────────────────────────────────┐  │   │

   │   │   │               JAVA SPRING BOOT 3.x                       │  │   │

   │   │   │                                                           │  │   │

   │   │   │  • Java 17+ / 21 LTS                                    │  │   │

   │   │   │  • Spring Security + JWT                                 │  │   │

   │   │   │  • Spring Data JPA + Hibernate                           │  │   │

   │   │   │  • Spring Mail                                           │  │   │

   │   │   │  • Spring WebSocket (STOMP)                              │  │   │

   │   │   │  • Spring Scheduler                                      │  │   │

   │   │   │  • Spring Cache (Redis)                                  │  │   │

   │   │   │  • Spring Validation                                     │  │   │

   │   │   │  • Swagger / SpringDoc OpenAPI                           │  │   │

   │   │   └──────────────────────────────────────────────────────────┘  │   │

   │   └───────────────────────────┬─────────────────────────────────────┘   │

   │                               │                                          │

   │   ┌───────────────────────────▼─────────────────────────────────────┐   │

   │   │                      DATA LAYER                                  │   │

   │   │                                                                  │   │

   │   │  ┌──────────────┐  ┌────────────┐  ┌────────────────────────┐  │   │

   │   │  │ PostgreSQL 16│  │  Redis 7   │  │  AWS S3 / MinIO        │  │   │

   │   │  │  (Primary DB)│  │  (Cache +  │  │  (Files, Images,       │  │   │

   │   │  │              │  │   Session) │  │   Audio)               │  │   │

   │   │  └──────────────┘  └────────────┘  └────────────────────────┘  │   │

   │   └─────────────────────────────────────────────────────────────────┘   │

   │                                                                           │

   └──────────────────────────────────────────────────────────────────────────┘

   -----
1. # <a name="_toc225239666"></a>**SO SÁNH NESTJS VS SPRING BOOT**
   ┌──────────────────────────────────────────────────────────────────────────┐

   │              SO SÁNH NESTJS vs SPRING BOOT                                │

   ├──────────────────┬──────────────────────┬────────────────────────────────┤

   │  Tiêu chí        │  NestJS (cũ)         │  Spring Boot (mới)             │

   ├──────────────────┼──────────────────────┼────────────────────────────────┤

   │  Ngôn ngữ        │  TypeScript          │  Java 17+ / 21                 │

   │  Performance     │  Tốt                 │  Rất tốt (JVM optimized)      │

   │  Ecosystem       │  Tốt (npm)           │  Rất lớn (Maven/Gradle)       │

   │  Enterprise      │  Khá                 │  Rất mạnh (chuẩn enterprise)  │

   │  ORM             │  Prisma / TypeORM    │  JPA + Hibernate              │

   │  Security        │  Passport.js         │  Spring Security (rất mạnh)   │

   │  Caching         │  cache-manager       │  Spring Cache + Redis         │

   │  Scheduling      │  @nestjs/schedule    │  @Scheduled (built-in)        │

   │  WebSocket       │  Socket.io           │  STOMP + SockJS               │

   │  Validation      │  class-validator     │  Jakarta Validation           │

   │  Testing         │  Jest                │  JUnit 5 + Mockito            │

   │  API Docs        │  Swagger             │  SpringDoc OpenAPI            │

   │  Build Tool      │  npm                 │  Maven / Gradle               │

   │  Container       │  Nhẹ (~200MB)        │  Nặng hơn (~400MB)           │

   │  Learning Curve  │  Dễ (nếu biết TS)   │  Trung bình (Java verbose)   │

   │  Scalability     │  Tốt                 │  Rất tốt                     │

   │  Community       │  Lớn                 │  Rất lớn                     │

   │  Job Market VN   │  Khá                 │  Rất lớn (dominant)          │

   ├──────────────────┼──────────────────────┼────────────────────────────────┤

   │  Kết luận        │  Phù hợp startup    │  Phù hợp enterprise,         │

   │                  │  nhanh, nhẹ          │  scale lớn, team Java         │

   └──────────────────┴──────────────────────┴────────────────────────────────┘

   `  `✅ Spring Boot là lựa chọn TỐT HƠN nếu:

   `     `• Team quen Java

   `     `• Cần enterprise-grade security

   `     `• Cần scale lớn

   `     `• Job market Việt Nam (Java rất phổ biến)

   -----
1. # <a name="_toc225239667"></a>**CHI TIẾT TECH STACK ĐẦY ĐỦ**
   ┌──────────────────────────────────────────────────────────────────────────┐

   │                    FULL TECH STACK DETAIL                                  │

   ├──────────────┬──────────────────────────────────────────────────────────┤

   │              │                                                           │

   │  FRONTEND    │  ┌──────────────────────────────────────────────────┐   │

   │  (Next.js)   │  │  • Framework: Next.js 14 (App Router)            │   │

   │              │  │  • Language: TypeScript 5                          │   │

   │              │  │  • UI: Tailwind CSS + shadcn/ui                   │   │

   │              │  │  • State: Zustand                                 │   │

   │              │  │  • Data Fetching: TanStack React Query (SWR)     │   │

   │              │  │  • API Client: Axios                              │   │

   │              │  │  • i18n: next-intl                                │   │

   │              │  │  • Form: React Hook Form + Zod                   │   │

   │              │  │  • Animation: Framer Motion                       │   │

   │              │  │  • Charts: Recharts                               │   │

   │              │  │  • Drag & Drop: dnd-kit                          │   │

   │              │  │  • WebSocket Client: SockJS + STOMP.js           │   │

   │              │  │  • PWA: next-pwa                                  │   │

   │              │  │  • Testing: Jest + React Testing Library          │   │

   │              │  │  • E2E: Playwright                                │   │

   │              │  └──────────────────────────────────────────────────┘   │

   │              │                                                           │

   ├──────────────┼──────────────────────────────────────────────────────────┤

   │              │                                                           │

   │  BACKEND     │  ┌──────────────────────────────────────────────────┐   │

   │  (Spring     │  │  • Java: 17 LTS (hoặc 21 LTS)                   │   │

   │   Boot)      │  │  • Framework: Spring Boot 3.2+                   │   │

   │              │  │  • Build: Gradle (Kotlin DSL) hoặc Maven         │   │

   │              │  │  • Security: Spring Security 6 + JWT             │   │

   │              │  │    (jjwt library)                                 │   │

   │              │  │  • ORM: Spring Data JPA + Hibernate 6            │   │

   │              │  │  • Migration: Flyway (hoặc Liquibase)            │   │

   │              │  │  • Validation: Jakarta Validation                │   │

   │              │  │  • API Docs: SpringDoc OpenAPI 3 (Swagger UI)    │   │

   │              │  │  • Caching: Spring Cache + Redis                  │   │

   │              │  │    (spring-boot-starter-data-redis)               │   │

   │              │  │  • Queue: Spring AMQP + RabbitMQ                 │   │

   │              │  │    (hoặc Redis Queue / Spring Events)             │   │

   │              │  │  • Scheduler: @Scheduled (built-in)              │   │

   │              │  │  • WebSocket: Spring WebSocket + STOMP            │   │

   │              │  │  • Email: Spring Mail + Thymeleaf templates      │   │

   │              │  │  • File Upload: Spring Web Multipart + AWS SDK   │   │

   │              │  │  • Mapping: MapStruct (DTO ↔ Entity)             │   │

   │              │  │  • Logging: SLF4J + Logback                      │   │

   │              │  │  • Lombok: Reduce boilerplate code               │   │

   │              │  │  • Testing: JUnit 5 + Mockito + TestContainers  │   │

   │              │  │  • Monitoring: Spring Actuator + Micrometer      │   │

   │              │  └──────────────────────────────────────────────────┘   │

   │              │                                                           │

   ├──────────────┼──────────────────────────────────────────────────────────┤

   │              │                                                           │

   │  DATABASE    │  ┌──────────────────────────────────────────────────┐   │

   │              │  │  • Primary: PostgreSQL 16                         │   │

   │              │  │  • Cache: Redis 7 (Jedis / Lettuce client)       │   │

   │              │  │  • Migration: Flyway                              │   │

   │              │  │  • Connection Pool: HikariCP (built-in)          │   │

   │              │  │  • Search (optional): Elasticsearch               │   │

   │              │  └──────────────────────────────────────────────────┘   │

   │              │                                                           │

   ├──────────────┼──────────────────────────────────────────────────────────┤

   │              │                                                           │

   │  DEVOPS      │  ┌──────────────────────────────────────────────────┐   │

   │              │  │  • Container: Docker + Docker Compose             │   │

   │              │  │  • CI/CD: GitHub Actions                          │   │

   │              │  │  • Reverse Proxy: Nginx                           │   │

   │              │  │  • Monitoring: Prometheus + Grafana               │   │

   │              │  │    (via Spring Actuator + Micrometer)             │   │

   │              │  │  • Error Tracking: Sentry                         │   │

   │              │  │  • Log Aggregation: ELK Stack                    │   │

   │              │  │  • Hosting: AWS EC2 / VPS                        │   │

   │              │  │  • FE Hosting: Vercel (Next.js optimized)        │   │

   │              │  └──────────────────────────────────────────────────┘   │

   │              │                                                           │

   └──────────────┴──────────────────────────────────────────────────────────┘

   -----
1. # <a name="_toc225239668"></a>**BACKEND FOLDER STRUCTURE (SPRING BOOT)**
   ┌──────────────────────────────────────────────────────────────────────────┐

   │              SPRING BOOT PROJECT STRUCTURE                                 │

   ├──────────────────────────────────────────────────────────────────────────┤

   │                                                                           │

   │  flashlearn-api/                                                         │

   │  ├── 📁 gradle/                        # Gradle wrapper                  │

   │  ├── build.gradle.kts                  # Build config (Kotlin DSL)       │

   │  ├── settings.gradle.kts                                                 │

   │  ├── Dockerfile                                                          │

   │  ├── docker-compose.yml                                                  │

   │  │                                                                        │

   │  └── 📁 src/                                                             │

   │      ├── 📁 main/                                                        │

   │      │   ├── 📁 java/com/flashlearn/                                    │

   │      │   │   │                                                            │

   │      │   │   ├── FlashLearnApplication.java      # Main class           │

   │      │   │   │                                                            │

   │      │   │   ├── 📁 config/                      # Configurations       │

   │      │   │   │   ├── SecurityConfig.java                                 │

   │      │   │   │   ├── JwtConfig.java                                      │

   │      │   │   │   ├── RedisConfig.java                                    │

   │      │   │   │   ├── WebSocketConfig.java                                │

   │      │   │   │   ├── CorsConfig.java                                     │

   │      │   │   │   ├── SwaggerConfig.java                                  │

   │      │   │   │   ├── MailConfig.java                                     │

   │      │   │   │   ├── S3Config.java                                       │

   │      │   │   │   ├── AuditConfig.java                                    │

   │      │   │   │   ├── CacheConfig.java                                    │

   │      │   │   │   └── AsyncConfig.java                                    │

   │      │   │   │                                                            │

   │      │   │   ├── 📁 common/                      # Shared code          │

   │      │   │   │   ├── 📁 dto/                                             │

   │      │   │   │   │   ├── ApiResponse.java                                │

   │      │   │   │   │   ├── PageResponse.java                               │

   │      │   │   │   │   └── ErrorResponse.java                              │

   │      │   │   │   │                                                        │

   │      │   │   │   ├── 📁 exception/                                       │

   │      │   │   │   │   ├── GlobalExceptionHandler.java                     │

   │      │   │   │   │   ├── ResourceNotFoundException.java                  │

   │      │   │   │   │   ├── BadRequestException.java                        │

   │      │   │   │   │   ├── UnauthorizedException.java                      │

   │      │   │   │   │   ├── ForbiddenException.java                         │

   │      │   │   │   │   ├── ConflictException.java                          │

   │      │   │   │   │   └── BusinessException.java                          │

   │      │   │   │   │                                                        │

   │      │   │   │   ├── 📁 enums/                                           │

   │      │   │   │   │   ├── Role.java                                       │

   │      │   │   │   │   ├── CardStatus.java                                 │

   │      │   │   │   │   ├── ReviewRating.java                               │

   │      │   │   │   │   ├── GameType.java                                   │

   │      │   │   │   │   ├── TestType.java                                   │

   │      │   │   │   │   ├── QuestionType.java                               │

   │      │   │   │   │   ├── NotificationType.java                           │

   │      │   │   │   │   ├── DeckVisibility.java                             │

   │      │   │   │   │   └── TeacherStatus.java                              │

   │      │   │   │   │                                                        │

   │      │   │   │   ├── 📁 annotation/                                      │

   │      │   │   │   │   ├── CurrentUser.java                                │

   │      │   │   │   │   └── RequirePermission.java                          │

   │      │   │   │   │                                                        │

   │      │   │   │   └── 📁 util/                                            │

   │      │   │   │       ├── DateUtils.java                                   │

   │      │   │   │       ├── SlugUtils.java                                   │

   │      │   │   │       └── FileUtils.java                                   │

   │      │   │   │                                                            │

   │      │   │   ├── 📁 security/                    # Security module       │

   │      │   │   │   ├── JwtTokenProvider.java                               │

   │      │   │   │   ├── JwtAuthenticationFilter.java                        │

   │      │   │   │   ├── JwtAuthenticationEntryPoint.java                    │

   │      │   │   │   ├── CustomUserDetailsService.java                       │

   │      │   │   │   ├── CustomUserDetails.java                              │

   │      │   │   │   ├── OAuth2SuccessHandler.java                           │

   │      │   │   │   └── PermissionEvaluator.java                            │

   │      │   │   │                                                            │

   │      │   │   │   ══════════════════════════════════════════               │

   │      │   │   │   FEATURE MODULES (Domain-Driven)                         │

   │      │   │   │   ══════════════════════════════════════════               │

   │      │   │   │                                                            │

   │      │   │   ├── 📁 modules/                                             │

   │      │   │   │   │                                                        │

   │      │   │   │   ├── 📁 auth/                    # Authentication       │

   │      │   │   │   │   ├── AuthController.java                             │

   │      │   │   │   │   ├── AuthService.java                                │

   │      │   │   │   │   ├── AuthServiceImpl.java                            │

   │      │   │   │   │   ├── 📁 dto/                                        │

   │      │   │   │   │   │   ├── RegisterRequest.java                        │

   │      │   │   │   │   │   ├── LoginRequest.java                           │

   │      │   │   │   │   │   ├── LoginResponse.java                          │

   │      │   │   │   │   │   ├── TokenRefreshRequest.java                    │

   │      │   │   │   │   │   ├── ForgotPasswordRequest.java                  │

   │      │   │   │   │   │   ├── ResetPasswordRequest.java                   │

   │      │   │   │   │   │   └── ChangePasswordRequest.java                  │

   │      │   │   │   │   └── 📁 event/                                      │

   │      │   │   │   │       ├── UserRegisteredEvent.java                    │

   │      │   │   │   │       └── PasswordResetEvent.java                     │

   │      │   │   │   │                                                        │

   │      │   │   │   ├── 📁 user/                    # User Management      │

   │      │   │   │   │   ├── UserController.java                             │

   │      │   │   │   │   ├── UserService.java                                │

   │      │   │   │   │   ├── UserServiceImpl.java                            │

   │      │   │   │   │   ├── UserRepository.java                             │

   │      │   │   │   │   ├── UserMapper.java                 # MapStruct    │

   │      │   │   │   │   ├── 📁 entity/                                     │

   │      │   │   │   │   │   ├── User.java                                   │

   │      │   │   │   │   │   ├── UserSession.java                            │

   │      │   │   │   │   │   └── ReminderSetting.java                        │

   │      │   │   │   │   └── 📁 dto/                                        │

   │      │   │   │   │       ├── UserProfileResponse.java                    │

   │      │   │   │   │       ├── UpdateProfileRequest.java                   │

   │      │   │   │   │       ├── UpdateSettingsRequest.java                  │

   │      │   │   │   │       └── UserStatsResponse.java                      │

   │      │   │   │   │                                                        │

   │      │   │   │   ├── 📁 deck/                    # Deck Management      │

   │      │   │   │   │   ├── DeckController.java                             │

   │      │   │   │   │   ├── DeckService.java                                │

   │      │   │   │   │   ├── DeckServiceImpl.java                            │

   │      │   │   │   │   ├── DeckRepository.java                             │

   │      │   │   │   │   ├── DeckMapper.java                                 │

   │      │   │   │   │   ├── 📁 entity/                                     │

   │      │   │   │   │   │   ├── Deck.java                                   │

   │      │   │   │   │   │   ├── DeckRating.java                             │

   │      │   │   │   │   │   └── DeckBookmark.java                           │

   │      │   │   │   │   └── 📁 dto/                                        │

   │      │   │   │   │       ├── CreateDeckRequest.java                      │

   │      │   │   │   │       ├── UpdateDeckRequest.java                      │

   │      │   │   │   │       ├── DeckResponse.java                           │

   │      │   │   │   │       ├── DeckDetailResponse.java                     │

   │      │   │   │   │       └── DeckQueryParams.java                        │

   │      │   │   │   │                                                        │

   │      │   │   │   ├── 📁 flashcard/               # Flashcard CRUD       │

   │      │   │   │   │   ├── FlashcardController.java                        │

   │      │   │   │   │   ├── FlashcardService.java                           │

   │      │   │   │   │   ├── FlashcardServiceImpl.java                       │

   │      │   │   │   │   ├── FlashcardRepository.java                        │

   │      │   │   │   │   ├── FlashcardMapper.java                            │

   │      │   │   │   │   ├── CsvImportService.java                           │

   │      │   │   │   │   ├── 📁 entity/                                     │

   │      │   │   │   │   │   └── Flashcard.java                              │

   │      │   │   │   │   └── 📁 dto/                                        │

   │      │   │   │   │       ├── CreateFlashcardRequest.java                 │

   │      │   │   │   │       ├── UpdateFlashcardRequest.java                 │

   │      │   │   │   │       ├── FlashcardResponse.java                      │

   │      │   │   │   │       ├── BulkCreateFlashcardRequest.java             │

   │      │   │   │   │       └── ImportCsvRequest.java                       │

   │      │   │   │   │                                                        │

   │      │   │   │   ├── 📁 learning/                # SRS Engine           │

   │      │   │   │   │   ├── LearningController.java                         │

   │      │   │   │   │   ├── LearningService.java                            │

   │      │   │   │   │   ├── LearningServiceImpl.java                        │

   │      │   │   │   │   ├── SrsAlgorithmService.java     # SM-2 Core      │

   │      │   │   │   │   ├── UserCardProgressRepository.java                 │

   │      │   │   │   │   ├── ReviewLogRepository.java                        │

   │      │   │   │   │   ├── LearningSessionRepository.java                  │

   │      │   │   │   │   ├── 📁 entity/                                     │

   │      │   │   │   │   │   ├── UserCardProgress.java                       │

   │      │   │   │   │   │   ├── ReviewLog.java                              │

   │      │   │   │   │   │   └── LearningSession.java                        │

   │      │   │   │   │   └── 📁 dto/                                        │

   │      │   │   │   │       ├── ReviewCardRequest.java                      │

   │      │   │   │   │       ├── ReviewCardResponse.java                     │

   │      │   │   │   │       ├── LearningSessionResponse.java                │

   │      │   │   │   │       ├── DueCardsResponse.java                       │

   │      │   │   │   │       ├── ProgressResponse.java                       │

   │      │   │   │   │       └── SrsSettingsRequest.java                     │

   │      │   │   │   │                                                        │

   │      │   │   │   ├── 📁 game/                    # Mini Games           │

   │      │   │   │   │   ├── GameController.java                             │

   │      │   │   │   │   ├── GameService.java                                │

   │      │   │   │   │   ├── GameServiceImpl.java                            │

   │      │   │   │   │   ├── GameSessionRepository.java                      │

   │      │   │   │   │   ├── 📁 engine/              # Game engines         │

   │      │   │   │   │   │   ├── GameEngine.java              # Interface   │

   │      │   │   │   │   │   ├── MatchingGameEngine.java                     │

   │      │   │   │   │   │   ├── QuizGameEngine.java                         │

   │      │   │   │   │   │   ├── ScrambleGameEngine.java                     │

   │      │   │   │   │   │   ├── SprintGameEngine.java                       │

   │      │   │   │   │   │   ├── ListeningGameEngine.java                    │

   │      │   │   │   │   │   ├── TypingGameEngine.java                       │

   │      │   │   │   │   │   ├── MemoryGameEngine.java                       │

   │      │   │   │   │   │   └── GameEngineFactory.java       # Factory     │

   │      │   │   │   │   ├── 📁 entity/                                     │

   │      │   │   │   │   │   └── GameSession.java                            │

   │      │   │   │   │   └── 📁 dto/                                        │

   │      │   │   │   │       ├── StartGameRequest.java                       │

   │      │   │   │   │       ├── SubmitAnswerRequest.java                    │

   │      │   │   │   │       ├── EndGameRequest.java                         │

   │      │   │   │   │       └── GameResultResponse.java                     │

   │      │   │   │   │                                                        │

   │      │   │   │   ├── 📁 test/                    # Mini Tests           │

   │      │   │   │   │   ├── TestController.java                             │

   │      │   │   │   │   ├── TestService.java                                │

   │      │   │   │   │   ├── TestServiceImpl.java                            │

   │      │   │   │   │   ├── QuestionGeneratorService.java                   │

   │      │   │   │   │   ├── TestRepository.java                             │

   │      │   │   │   │   ├── TestAttemptRepository.java                      │

   │      │   │   │   │   ├── 📁 generator/                                  │

   │      │   │   │   │   │   ├── QuestionGenerator.java       # Interface   │

   │      │   │   │   │   │   ├── MultipleChoiceGenerator.java                │

   │      │   │   │   │   │   ├── FillBlankGenerator.java                     │

   │      │   │   │   │   │   ├── ListeningGenerator.java                     │

   │      │   │   │   │   │   ├── SpellingGenerator.java                      │

   │      │   │   │   │   │   └── QuestionGeneratorFactory.java               │

   │      │   │   │   │   ├── 📁 entity/                                     │

   │      │   │   │   │   │   ├── Test.java                                   │

   │      │   │   │   │   │   ├── TestQuestion.java                           │

   │      │   │   │   │   │   └── TestAttempt.java                            │

   │      │   │   │   │   └── 📁 dto/                                        │

   │      │   │   │   │       ├── CreateTestRequest.java                      │

   │      │   │   │   │       ├── SubmitTestRequest.java                      │

   │      │   │   │   │       ├── TestResultResponse.java                     │

   │      │   │   │   │       ├── AutoGenerateTestRequest.java                │

   │      │   │   │   │       └── DailyQuizResponse.java                      │

   │      │   │   │   │                                                        │

   │      │   │   │   ├── 📁 notification/            # Notifications        │

   │      │   │   │   │   ├── NotificationController.java                     │

   │      │   │   │   │   ├── NotificationService.java                        │

   │      │   │   │   │   ├── NotificationServiceImpl.java                    │

   │      │   │   │   │   ├── NotificationRepository.java                     │

   │      │   │   │   │   ├── NotificationWebSocketHandler.java               │

   │      │   │   │   │   ├── 📁 channel/                                    │

   │      │   │   │   │   │   ├── NotificationChannel.java     # Interface   │

   │      │   │   │   │   │   ├── InAppChannel.java                           │

   │      │   │   │   │   │   ├── EmailChannel.java                           │

   │      │   │   │   │   │   └── PushChannel.java                            │

   │      │   │   │   │   ├── 📁 entity/                                     │

   │      │   │   │   │   │   └── Notification.java                           │

   │      │   │   │   │   └── 📁 dto/                                        │

   │      │   │   │   │       ├── NotificationResponse.java                   │

   │      │   │   │   │       ├── UpdateReminderRequest.java                  │

   │      │   │   │   │       └── PushSubscriptionRequest.java                │

   │      │   │   │   │                                                        │

   │      │   │   │   ├── 📁 reminder/                # Scheduled Reminders  │

   │      │   │   │   │   ├── ReminderScheduler.java                          │

   │      │   │   │   │   ├── ReminderService.java                            │

   │      │   │   │   │   ├── ReminderServiceImpl.java                        │

   │      │   │   │   │   ├── 📁 job/                                        │

   │      │   │   │   │   │   ├── ReviewReminderJob.java                      │

   │      │   │   │   │   │   ├── StreakReminderJob.java                      │

   │      │   │   │   │   │   ├── DailyQuizReminderJob.java                   │

   │      │   │   │   │   │   ├── StreakResetJob.java                         │

   │      │   │   │   │   │   ├── LeaderboardRecalculationJob.java            │

   │      │   │   │   │   │   ├── StatsAggregationJob.java                    │

   │      │   │   │   │   │   └── SessionCleanupJob.java                      │

   │      │   │   │   │   └── 📁 entity/                                     │

   │      │   │   │   │       └── ReminderSetting.java                        │

   │      │   │   │   │                                                        │

   │      │   │   │   ├── 📁 classroom/               # Teacher Classroom    │

   │      │   │   │   │   ├── ClassroomController.java                        │

   │      │   │   │   │   ├── ClassroomService.java                           │

   │      │   │   │   │   ├── ClassroomServiceImpl.java                       │

   │      │   │   │   │   ├── ClassroomRepository.java                        │

   │      │   │   │   │   ├── ClassroomMemberRepository.java                  │

   │      │   │   │   │   ├── 📁 entity/                                     │

   │      │   │   │   │   │   ├── Classroom.java                              │

   │      │   │   │   │   │   ├── ClassroomMember.java                        │

   │      │   │   │   │   │   └── ClassroomDeck.java                          │

   │      │   │   │   │   └── 📁 dto/                                        │

   │      │   │   │   │       ├── CreateClassroomRequest.java                 │

   │      │   │   │   │       ├── UpdateClassroomRequest.java                 │

   │      │   │   │   │       ├── ClassroomResponse.java                      │

   │      │   │   │   │       ├── AssignDeckRequest.java                      │

   │      │   │   │   │       ├── JoinClassroomRequest.java                   │

   │      │   │   │   │       └── StudentProgressResponse.java                │

   │      │   │   │   │                                                        │

   │      │   │   │   ├── 📁 teacher/                 # Teacher Module       │

   │      │   │   │   │   ├── TeacherController.java                          │

   │      │   │   │   │   ├── TeacherService.java                             │

   │      │   │   │   │   ├── TeacherServiceImpl.java                         │

   │      │   │   │   │   ├── TeacherProfileRepository.java                   │

   │      │   │   │   │   ├── 📁 entity/                                     │

   │      │   │   │   │   │   └── TeacherProfile.java                         │

   │      │   │   │   │   └── 📁 dto/                                        │

   │      │   │   │   │       ├── TeacherApplicationRequest.java              │

   │      │   │   │   │       ├── TeacherApplicationResponse.java             │

   │      │   │   │   │       └── TeacherStatsResponse.java                   │

   │      │   │   │   │                                                        │

   │      │   │   │   ├── 📁 gamification/            # XP, Streak, Badges  │

   │      │   │   │   │   ├── GamificationService.java                        │

   │      │   │   │   │   ├── GamificationServiceImpl.java                    │

   │      │   │   │   │   ├── XpService.java                                  │

   │      │   │   │   │   ├── StreakService.java                              │

   │      │   │   │   │   ├── AchievementService.java                         │

   │      │   │   │   │   ├── LeaderboardService.java                         │

   │      │   │   │   │   ├── LeaderboardController.java                      │

   │      │   │   │   │   ├── 📁 entity/                                     │

   │      │   │   │   │   │   ├── UserStreak.java                             │

   │      │   │   │   │   │   ├── UserDailyStats.java                         │

   │      │   │   │   │   │   ├── Achievement.java                            │

   │      │   │   │   │   │   ├── UserAchievement.java                        │

   │      │   │   │   │   │   └── Leaderboard.java                            │

   │      │   │   │   │   └── 📁 dto/                                        │

   │      │   │   │   │       ├── LeaderboardResponse.java                    │

   │      │   │   │   │       ├── AchievementResponse.java                    │

   │      │   │   │   │       └── StreakResponse.java                         │

   │      │   │   │   │                                                        │

   │      │   │   │   ├── 📁 i18n/                    # Internationalization │

   │      │   │   │   │   ├── I18nController.java                             │

   │      │   │   │   │   ├── I18nService.java                                │

   │      │   │   │   │   ├── I18nServiceImpl.java                            │

   │      │   │   │   │   ├── LanguageRepository.java                         │

   │      │   │   │   │   ├── TranslationRepository.java                      │

   │      │   │   │   │   ├── 📁 entity/                                     │

   │      │   │   │   │   │   ├── Language.java                               │

   │      │   │   │   │   │   └── Translation.java                            │

   │      │   │   │   │   └── 📁 dto/                                        │

   │      │   │   │   │       ├── LanguageResponse.java                       │

   │      │   │   │   │       ├── TranslationResponse.java                    │

   │      │   │   │   │       └── ImportTranslationsRequest.java              │

   │      │   │   │   │                                                        │

   │      │   │   │   ├── 📁 category/                # Categories & Tags    │

   │      │   │   │   │   ├── CategoryRepository.java                         │

   │      │   │   │   │   ├── TagRepository.java                              │

   │      │   │   │   │   ├── 📁 entity/                                     │

   │      │   │   │   │   │   ├── Category.java                               │

   │      │   │   │   │   │   ├── Tag.java                                    │

   │      │   │   │   │   │   └── DeckTag.java                                │

   │      │   │   │   │   └── 📁 dto/                                        │

   │      │   │   │   │       ├── CategoryResponse.java                       │

   │      │   │   │   │       └── TagResponse.java                            │

   │      │   │   │   │                                                        │

   │      │   │   │   ├── 📁 upload/                  # File Upload          │

   │      │   │   │   │   ├── UploadController.java                           │

   │      │   │   │   │   ├── UploadService.java                              │

   │      │   │   │   │   ├── 📁 provider/                                   │

   │      │   │   │   │   │   ├── StorageProvider.java          # Interface  │

   │      │   │   │   │   │   ├── S3StorageProvider.java                      │

   │      │   │   │   │   │   └── LocalStorageProvider.java     # Dev only   │

   │      │   │   │   │   └── 📁 dto/                                        │

   │      │   │   │   │       └── UploadResponse.java                         │

   │      │   │   │   │                                                        │

   │      │   │   │   ├── 📁 email/                   # Email Service        │

   │      │   │   │   │   ├── EmailService.java                               │

   │      │   │   │   │   ├── EmailServiceImpl.java                           │

   │      │   │   │   │   └── 📁 event/               # Spring Events       │

   │      │   │   │   │       ├── SendEmailEvent.java                         │

   │      │   │   │   │       └── EmailEventListener.java                     │

   │      │   │   │   │                                                        │

   │      │   │   │   ├── 📁 admin/                   # Admin Module         │

   │      │   │   │   │   ├── 📁 controller/                                 │

   │      │   │   │   │   │   ├── AdminDashboardController.java               │

   │      │   │   │   │   │   ├── AdminUserController.java                    │

   │      │   │   │   │   │   ├── AdminTeacherController.java                 │

   │      │   │   │   │   │   ├── AdminContentController.java                 │

   │      │   │   │   │   │   ├── AdminLanguageController.java                │

   │      │   │   │   │   │   ├── AdminRoleController.java                    │

   │      │   │   │   │   │   ├── AdminConfigController.java                  │

   │      │   │   │   │   │   └── AdminAnalyticsController.java               │

   │      │   │   │   │   ├── 📁 service/                                    │

   │      │   │   │   │   │   ├── AdminDashboardService.java                  │

   │      │   │   │   │   │   ├── AdminUserService.java                       │

   │      │   │   │   │   │   ├── AdminContentService.java                    │

   │      │   │   │   │   │   ├── AdminRoleService.java                       │

   │      │   │   │   │   │   └── AdminAnalyticsService.java                  │

   │      │   │   │   │   ├── 📁 entity/                                     │

   │      │   │   │   │   │   ├── Role.java                                   │

   │      │   │   │   │   │   ├── Permission.java                             │

   │      │   │   │   │   │   ├── RolePermission.java                         │

   │      │   │   │   │   │   ├── AuditLog.java                               │

   │      │   │   │   │   │   ├── SystemConfig.java                           │

   │      │   │   │   │   │   └── Report.java                                 │

   │      │   │   │   │   └── 📁 dto/                                        │

   │      │   │   │   │       ├── DashboardResponse.java                      │

   │      │   │   │   │       ├── AdminUserResponse.java                      │

   │      │   │   │   │       ├── UpdateUserRoleRequest.java                  │

   │      │   │   │   │       ├── ApproveTeacherRequest.java                  │

   │      │   │   │   │       ├── RejectTeacherRequest.java                   │

   │      │   │   │   │       ├── CreateRoleRequest.java                      │

   │      │   │   │   │       ├── CreateCategoryRequest.java                  │

   │      │   │   │   │       ├── SystemConfigRequest.java                    │

   │      │   │   │   │       └── AnalyticsResponse.java                      │

   │      │   │   │   │                                                        │

   │      │   │   │   └── 📁 audit/                   # Audit Logging        │

   │      │   │   │       ├── AuditLogService.java                            │

   │      │   │   │       ├── AuditLogRepository.java                         │

   │      │   │   │       └── AuditLogAspect.java          # AOP Aspect      │

   │      │   │   │                                                            │

   │      │   │   └── 📁 event/                       # Application Events  │

   │      │   │       ├── CardReviewedEvent.java                              │

   │      │   │       ├── GameCompletedEvent.java                             │

   │      │   │       ├── TestCompletedEvent.java                             │

   │      │   │       ├── AchievementUnlockedEvent.java                       │

   │      │   │       ├── StreakUpdatedEvent.java                             │

   │      │   │       └── 📁 listener/                                       │

   │      │   │           ├── GamificationEventListener.java                  │

   │      │   │           ├── NotificationEventListener.java                  │

   │      │   │           └── AnalyticsEventListener.java                     │

   │      │   │                                                                │

   │      │   ├── 📁 resources/                                               │

   │      │   │   ├── application.yml                  # Main config          │

   │      │   │   ├── application-dev.yml              # Dev profile          │

   │      │   │   ├── application-prod.yml             # Prod profile         │

   │      │   │   ├── application-test.yml             # Test profile         │

   │      │   │   ├── 📁 db/migration/                # Flyway migrations    │

   │      │   │   │   ├── V1\_\_init\_schema.sql                                 │

   │      │   │   │   ├── V2\_\_add\_flashcard\_tables.sql                        │

   │      │   │   │   ├── V3\_\_add\_srs\_tables.sql                              │

   │      │   │   │   ├── V4\_\_add\_game\_tables.sql                             │

   │      │   │   │   ├── V5\_\_add\_test\_tables.sql                             │

   │      │   │   │   ├── V6\_\_add\_notification\_tables.sql                     │

   │      │   │   │   ├── V7\_\_add\_classroom\_tables.sql                        │

   │      │   │   │   ├── V8\_\_add\_gamification\_tables.sql                     │

   │      │   │   │   ├── V9\_\_add\_i18n\_tables.sql                             │

   │      │   │   │   ├── V10\_\_add\_admin\_tables.sql                           │

   │      │   │   │   └── V11\_\_seed\_initial\_data.sql                          │

   │      │   │   ├── 📁 templates/                   # Thymeleaf emails     │

   │      │   │   │   ├── email/                                              │

   │      │   │   │   │   ├── welcome.html                                    │

   │      │   │   │   │   ├── verify-email.html                               │

   │      │   │   │   │   ├── reset-password.html                             │

   │      │   │   │   │   ├── review-reminder.html                            │

   │      │   │   │   │   ├── streak-reminder.html                            │

   │      │   │   │   │   ├── teacher-approved.html                           │

   │      │   │   │   │   ├── teacher-rejected.html                           │

   │      │   │   │   │   └── assignment-notification.html                    │

   │      │   │   │   └── email/layout.html            # Base template        │

   │      │   │   └── 📁 static/                      # Static resources     │

   │      │   │       └── (empty - FE is separate)                            │

   │      │   │                                                                │

   │      │   └── 📁 resources/data/                  # Seed data            │

   │      │       ├── categories.json                                         │

   │      │       ├── achievements.json                                       │

   │      │       ├── languages.json                                          │

   │      │       └── permissions.json                                        │

   │      │                                                                    │

   │      └── 📁 test/                                # Tests                │

   │          └── 📁 java/com/flashlearn/                                    │

   │              ├── 📁 modules/                                             │

   │              │   ├── 📁 auth/                                            │

   │              │   │   ├── AuthControllerTest.java                         │

   │              │   │   └── AuthServiceTest.java                            │

   │              │   ├── 📁 learning/                                        │

   │              │   │   ├── LearningControllerTest.java                     │

   │              │   │   ├── LearningServiceTest.java                        │

   │              │   │   └── SrsAlgorithmServiceTest.java                    │

   │              │   ├── 📁 game/                                            │

   │              │   │   ├── GameServiceTest.java                            │

   │              │   │   └── MatchingGameEngineTest.java                     │

   │              │   ├── 📁 test/                                            │

   │              │   │   ├── TestServiceTest.java                            │

   │              │   │   └── QuestionGeneratorServiceTest.java               │

   │              │   ├── 📁 gamification/                                    │

   │              │   │   ├── XpServiceTest.java                              │

   │              │   │   ├── StreakServiceTest.java                           │

   │              │   │   └── AchievementServiceTest.java                     │

   │              │   └── ...                                                  │

   │              │                                                            │

   │              └── 📁 integration/                  # Integration tests    │

   │                  ├── AuthIntegrationTest.java                            │

   │                  ├── DeckIntegrationTest.java                            │

   │                  ├── LearningIntegrationTest.java                        │

   │                  ├── GameIntegrationTest.java                            │

   │                  └── AdminIntegrationTest.java                           │

   │                                                                           │

   └──────────────────────────────────────────────────────────────────────────┘

   -----
1. # <a name="_toc225239669"></a>**SAMPLE CODE - CÁC FILE QUAN TRỌNG**
1. ## <a name="_toc225239670"></a>**Entity Examples (JPA)**
// ═══════════════════════════════════════════════════════════════

// User.java - User Entity

// ═══════════════════════════════════════════════════════════════

package com.flashlearn.modules.user.entity;

import com.flashlearn.common.enums.Role;

import jakarta.persistence.\*;

import lombok.\*;

import org.hibernate.annotations.CreationTimestamp;

import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity

@Table(name = "users")

@Getter @Setter

@NoArgsConstructor @AllArgsConstructor

@Builder

public class User {

`    `@Id

`    `@GeneratedValue(strategy = GenerationType.IDENTITY)

`    `private Long id;

`    `@Column(nullable = false, unique = true)

`    `private String email;

`    `@Column(nullable = false)

`    `private String password;

`    `@Column(name = "display\_name", nullable = false)

`    `private String displayName;

`    `@Column(name = "avatar\_url")

`    `private String avatarUrl;

`    `private String bio;

`    `private String phone;

`    `@Enumerated(EnumType.STRING)

`    `@Column(nullable = false)

`    `private Role role;

`    `@Column(name = "ui\_language", length = 5)

`    `private String uiLanguage = "vi";

`    `@Column(name = "learn\_language", length = 10)

`    `private String learnLanguage = "en-vi";

`    `private String timezone = "Asia/Ho\_Chi\_Minh";

`    `@Column(name = "xp\_points")

`    `private Integer xpPoints = 0;

`    `private Integer level = 1;

`    `@Column(name = "is\_verified")

`    `private Boolean isVerified = false;

`    `@Column(name = "is\_banned")

`    `private Boolean isBanned = false;

`    `@Column(name = "verification\_token")

`    `private String verificationToken;

`    `@Column(name = "reset\_password\_token")

`    `private String resetPasswordToken;

`    `@Column(name = "reset\_password\_expires")

`    `private LocalDateTime resetPasswordExpires;

`    `@CreationTimestamp

`    `@Column(name = "created\_at", updatable = false)

`    `private LocalDateTime createdAt;

`    `@UpdateTimestamp

`    `@Column(name = "updated\_at")

`    `private LocalDateTime updatedAt;

`    `// Relationships

`    `@OneToOne(mappedBy = "user", cascade = CascadeType.ALL)

`    `private TeacherProfile teacherProfile;

`    `@OneToOne(mappedBy = "user", cascade = CascadeType.ALL)

`    `private UserStreak userStreak;

`    `@OneToOne(mappedBy = "user", cascade = CascadeType.ALL)

`    `private ReminderSetting reminderSetting;

}

// ═══════════════════════════════════════════════════════════════

// Flashcard.java - Flashcard Entity

// ═══════════════════════════════════════════════════════════════

package com.flashlearn.modules.flashcard.entity;

import jakarta.persistence.\*;

import lombok.\*;

import org.hibernate.annotations.CreationTimestamp;

import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity

@Table(name = "flashcards")

@Getter @Setter

@NoArgsConstructor @AllArgsConstructor

@Builder

public class Flashcard {

`    `@Id

`    `@GeneratedValue(strategy = GenerationType.IDENTITY)

`    `private Long id;

`    `@ManyToOne(fetch = FetchType.LAZY)

`    `@JoinColumn(name = "deck\_id", nullable = false)

`    `private Deck deck;

`    `@Column(name = "front\_text", nullable = false)

`    `private String frontText;         // Từ vựng

`    `@Column(name = "front\_image\_url")

`    `private String frontImageUrl;

`    `@Column(name = "front\_audio\_url")

`    `private String frontAudioUrl;

`    `private String phonetic;           // Phiên âm

`    `@Column(name = "back\_text", nullable = false)

`    `private String backText;           // Nghĩa

`    `@Column(name = "back\_detail")

`    `private String backDetail;         // Loại từ, chi tiết

`    `@Column(columnDefinition = "TEXT")

`    `private String example;            // Ví dụ

`    `private String synonyms;           // Từ đồng nghĩa

`    `@Column(columnDefinition = "TEXT")

`    `private String note;               // Ghi chú

`    `@Column(name = "sort\_order")

`    `private Integer sortOrder = 0;

`    `@CreationTimestamp

`    `@Column(name = "created\_at", updatable = false)

`    `private LocalDateTime createdAt;

`    `@UpdateTimestamp

`    `@Column(name = "updated\_at")

`    `private LocalDateTime updatedAt;

}

// ═══════════════════════════════════════════════════════════════

// UserCardProgress.java - SRS Progress Entity

// ═══════════════════════════════════════════════════════════════

package com.flashlearn.modules.learning.entity;

import com.flashlearn.common.enums.CardStatus;

import jakarta.persistence.\*;

import lombok.\*;

import java.time.LocalDate;

import java.time.LocalDateTime;

@Entity

@Table(name = "user\_card\_progress",

`       `uniqueConstraints = @UniqueConstraint(

`           `columnNames = {"user\_id", "flashcard\_id"}

`       `))

@Getter @Setter

@NoArgsConstructor @AllArgsConstructor

@Builder

public class UserCardProgress {

`    `@Id

`    `@GeneratedValue(strategy = GenerationType.IDENTITY)

`    `private Long id;

`    `@Column(name = "user\_id", nullable = false)

`    `private Long userId;

`    `@Column(name = "flashcard\_id", nullable = false)

`    `private Long flashcardId;

`    `@Enumerated(EnumType.STRING)

`    `private CardStatus status = CardStatus.NEW;

`    `@Column(name = "ease\_factor")

`    `private Double easeFactor = 2.5;

`    `@Column(name = "interval\_days")

`    `private Integer intervalDays = 0;

`    `private Integer repetitions = 0;

`    `@Column(name = "next\_review\_date")

`    `private LocalDate nextReviewDate;

`    `@Column(name = "last\_reviewed\_at")

`    `private LocalDateTime lastReviewedAt;

`    `@Column(name = "leitner\_box")

`    `private Integer leitnerBox = 1;

`    `@Column(name = "total\_reviews")

`    `private Integer totalReviews = 0;

`    `@Column(name = "correct\_count")

`    `private Integer correctCount = 0;

`    `@Column(name = "incorrect\_count")

`    `private Integer incorrectCount = 0;

`    `@Column(name = "created\_at", updatable = false)

`    `private LocalDateTime createdAt;

`    `@Column(name = "updated\_at")

`    `private LocalDateTime updatedAt;

`    `@PrePersist

`    `protected void onCreate() {

`        `createdAt = LocalDateTime.now();

`        `updatedAt = LocalDateTime.now();

`        `if (nextReviewDate == null) {

`            `nextReviewDate = LocalDate.now();

`        `}

`    `}

`    `@PreUpdate

`    `protected void onUpdate() {

`        `updatedAt = LocalDateTime.now();

`    `}

}
1. ## <a name="_toc225239671"></a>**SRS Algorithm Service**
// ═══════════════════════════════════════════════════════════════

// SrsAlgorithmService.java - SM-2 Algorithm Implementation

// ═══════════════════════════════════════════════════════════════

package com.flashlearn.modules.learning;

import com.flashlearn.common.enums.CardStatus;

import com.flashlearn.common.enums.ReviewRating;

import com.flashlearn.modules.learning.entity.UserCardProgress;

import org.springframework.stereotype.Service;

import java.time.LocalDate;

import java.time.LocalDateTime;

@Service

public class SrsAlgorithmService {

`    `private static final double MIN\_EASE\_FACTOR = 1.3;

`    `private static final double DEFAULT\_EASE\_FACTOR = 2.5;

`    `/\*\*

`     `\* SM-2 Algorithm - Calculate next review based on rating

`     `\*/

`    `public SrsResult calculateNextReview(

`            `UserCardProgress progress,

`            `ReviewRating rating

`    `) {

`        `double easeFactor = progress.getEaseFactor();

`        `int interval = progress.getIntervalDays();

`        `int repetitions = progress.getRepetitions();

`        `switch (rating) {

`            `case AGAIN -> {

`                `// Quên hoàn toàn → Reset

`                `repetitions = 0;

`                `interval = 0; // Review lại trong session

`                `easeFactor = Math.max(MIN\_EASE\_FACTOR,

`                    `easeFactor - 0.20);

`                `return buildResult(

`                    `easeFactor, interval, repetitions,

`                    `CardStatus.LEARNING, 1,   // Leitner box 1

`                    `LocalDate.now()           // Review ngay hôm nay

`                `);

`            `}

`            `case HARD -> {

`                `// Khó nhớ → Interval ngắn hơn

`                `if (repetitions == 0) {

`                    `interval = 1;

`                `} else {

`                    `interval = (int) Math.max(1,

`                        `interval \* 1.2);

`                `}

`                `easeFactor = Math.max(MIN\_EASE\_FACTOR,

`                    `easeFactor - 0.15);

`                `repetitions += 1;

`            `}

`            `case GOOD -> {

`                `// Nhớ được → Interval bình thường

`                `if (repetitions == 0) {

`                    `interval = 1;

`                `} else if (repetitions == 1) {

`                    `interval = 6;

`                `} else {

`                    `interval = (int) Math.round(

`                        `interval \* easeFactor);

`                `}

`                `repetitions += 1;

`            `}

`            `case EASY -> {

`                `// Dễ dàng → Interval dài

`                `if (repetitions == 0) {

`                    `interval = 4;

`                `} else {

`                    `interval = (int) Math.round(

`                        `interval \* easeFactor \* 1.3);

`                `}

`                `easeFactor = easeFactor + 0.15;

`                `repetitions += 1;

`            `}

`        `}

`        `// Ensure ease factor doesn't go below minimum

`        `easeFactor = Math.max(MIN\_EASE\_FACTOR, easeFactor);

`        `// Determine card status

`        `CardStatus status;

`        `if (repetitions == 0) {

`            `status = CardStatus.LEARNING;

`        `} else if (interval < 21) {

`            `status = CardStatus.REVIEW;

`        `} else {

`            `status = CardStatus.GRADUATED;

`        `}

`        `// Calculate Leitner box

`        `int leitnerBox = calculateLeitnerBox(

`            `repetitions, rating, progress.getLeitnerBox());

`        `// Calculate next review date

`        `LocalDate nextReview = LocalDate.now()

.plusDays(interval);

`        `return buildResult(

`            `easeFactor, interval, repetitions,

`            `status, leitnerBox, nextReview

`        `);

`    `}

`    `private int calculateLeitnerBox(

`            `int repetitions,

`            `ReviewRating rating,

`            `int currentBox

`    `) {

`        `if (rating == ReviewRating.AGAIN) {

`            `return 1; // Reset to box 1

`        `}

`        `// Move up one box (max 5)

`        `return Math.min(5, currentBox + 1);

`    `}

`    `private SrsResult buildResult(

`            `double easeFactor, int interval,

`            `int repetitions, CardStatus status,

`            `int leitnerBox, LocalDate nextReview

`    `) {

`        `return SrsResult.builder()

.easeFactor(easeFactor)

.intervalDays(interval)

.repetitions(repetitions)

.status(status)

.leitnerBox(leitnerBox)

.nextReviewDate(nextReview)

.build();

`    `}

`    `// ═══════════ Inner Result Class ═══════════

`    `@lombok.Builder

`    `@lombok.Getter

`    `public static class SrsResult {

`        `private double easeFactor;

`        `private int intervalDays;

`        `private int repetitions;

`        `private CardStatus status;

`        `private int leitnerBox;

`        `private LocalDate nextReviewDate;

`    `}

}
1. ## <a name="_toc225239672"></a>**Auth Controller & Service**
// ═══════════════════════════════════════════════════════════════

// AuthController.java

// ═══════════════════════════════════════════════════════════════

package com.flashlearn.modules.auth;

import com.flashlearn.common.dto.ApiResponse;

import com.flashlearn.common.annotation.CurrentUser;

import com.flashlearn.modules.auth.dto.\*;

import com.flashlearn.security.CustomUserDetails;

import io.swagger.v3.oas.annotations.Operation;

import io.swagger.v3.oas.annotations.tags.Tag;

import jakarta.validation.Valid;

import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;

import org.springframework.security.access.prepost.PreAuthorize;

import org.springframework.web.bind.annotation.\*;

@RestController

@RequestMapping("/api/v1/auth")

@RequiredArgsConstructor

@Tag(name = "Authentication", description = "Auth APIs")

public class AuthController {

`    `private final AuthService authService;

`    `@PostMapping("/register")

`    `@Operation(summary = "Register new user")

`    `public ResponseEntity<ApiResponse<RegisterResponse>> register(

`            `@Valid @RequestBody RegisterRequest request

`    `) {

`        `RegisterResponse response = authService.register(request);

`        `return ResponseEntity

.status(HttpStatus.CREATED)

.body(ApiResponse.success(

`                `"Registration successful. Please verify your email.",

`                `response

`            `));

`    `}

`    `@PostMapping("/login")

`    `@Operation(summary = "Login with email and password")

`    `public ResponseEntity<ApiResponse<LoginResponse>> login(

`            `@Valid @RequestBody LoginRequest request

`    `) {

`        `LoginResponse response = authService.login(request);

`        `return ResponseEntity.ok(

`            `ApiResponse.success("Login successful", response)

`        `);

`    `}

`    `@PostMapping("/refresh-token")

`    `@Operation(summary = "Refresh access token")

`    `public ResponseEntity<ApiResponse<TokenResponse>> refreshToken(

`            `@Valid @RequestBody TokenRefreshRequest request

`    `) {

`        `TokenResponse response = authService.refreshToken(request);

`        `return ResponseEntity.ok(

`            `ApiResponse.success("Token refreshed", response)

`        `);

`    `}

`    `@PostMapping("/forgot-password")

`    `@Operation(summary = "Request password reset")

`    `public ResponseEntity<ApiResponse<Void>> forgotPassword(

`            `@Valid @RequestBody ForgotPasswordRequest request

`    `) {

`        `authService.forgotPassword(request);

`        `return ResponseEntity.ok(

`            `ApiResponse.success(

`                `"Password reset email sent", null

`            `)

`        `);

`    `}

`    `@PostMapping("/reset-password")

`    `@Operation(summary = "Reset password with token")

`    `public ResponseEntity<ApiResponse<Void>> resetPassword(

`            `@Valid @RequestBody ResetPasswordRequest request

`    `) {

`        `authService.resetPassword(request);

`        `return ResponseEntity.ok(

`            `ApiResponse.success("Password reset successful", null)

`        `);

`    `}

`    `@GetMapping("/verify-email")

`    `@Operation(summary = "Verify email with token")

`    `public ResponseEntity<ApiResponse<Void>> verifyEmail(

`            `@RequestParam String token

`    `) {

`        `authService.verifyEmail(token);

`        `return ResponseEntity.ok(

`            `ApiResponse.success("Email verified", null)

`        `);

`    `}

`    `@PostMapping("/change-password")

`    `@PreAuthorize("isAuthenticated()")

`    `@Operation(summary = "Change password")

`    `public ResponseEntity<ApiResponse<Void>> changePassword(

`            `@CurrentUser CustomUserDetails currentUser,

`            `@Valid @RequestBody ChangePasswordRequest request

`    `) {

`        `authService.changePassword(

`            `currentUser.getId(), request

`        `);

`        `return ResponseEntity.ok(

`            `ApiResponse.success("Password changed", null)

`        `);

`    `}

`    `@GetMapping("/me")

`    `@PreAuthorize("isAuthenticated()")

`    `@Operation(summary = "Get current user info")

`    `public ResponseEntity<ApiResponse<UserInfoResponse>> getCurrentUser(

`            `@CurrentUser CustomUserDetails currentUser

`    `) {

`        `UserInfoResponse response = authService

.getCurrentUser(currentUser.getId());

`        `return ResponseEntity.ok(

`            `ApiResponse.success("Success", response)

`        `);

`    `}

`    `@PostMapping("/logout")

`    `@PreAuthorize("isAuthenticated()")

`    `@Operation(summary = "Logout")

`    `public ResponseEntity<ApiResponse<Void>> logout(

`            `@CurrentUser CustomUserDetails currentUser,

`            `@RequestHeader("Authorization") String token

`    `) {

`        `authService.logout(currentUser.getId(), token);

`        `return ResponseEntity.ok(

`            `ApiResponse.success("Logged out", null)

`        `);

`    `}

}

// ═══════════════════════════════════════════════════════════════

// AuthService.java (Interface)

// ═══════════════════════════════════════════════════════════════

package com.flashlearn.modules.auth;

import com.flashlearn.modules.auth.dto.\*;

public interface AuthService {

`    `RegisterResponse register(RegisterRequest request);

`    `LoginResponse login(LoginRequest request);

`    `TokenResponse refreshToken(TokenRefreshRequest request);

`    `void forgotPassword(ForgotPasswordRequest request);

`    `void resetPassword(ResetPasswordRequest request);

`    `void verifyEmail(String token);

`    `void changePassword(Long userId, ChangePasswordRequest request);

`    `UserInfoResponse getCurrentUser(Long userId);

`    `void logout(Long userId, String token);

}

// ═══════════════════════════════════════════════════════════════

// AuthServiceImpl.java (Implementation)

// ═══════════════════════════════════════════════════════════════

package com.flashlearn.modules.auth;

import com.flashlearn.common.enums.Role;

import com.flashlearn.common.exception.\*;

import com.flashlearn.modules.auth.dto.\*;

import com.flashlearn.modules.auth.event.UserRegisteredEvent;

import com.flashlearn.modules.user.UserRepository;

import com.flashlearn.modules.user.entity.User;

import com.flashlearn.modules.gamification.entity.UserStreak;

import com.flashlearn.security.JwtTokenProvider;

import lombok.RequiredArgsConstructor;

import lombok.extern.slf4j.Slf4j;

import org.springframework.context.ApplicationEventPublisher;

import org.springframework.security.authentication.\*;

import org.springframework.security.crypto.password.PasswordEncoder;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service

@RequiredArgsConstructor

@Slf4j

@Transactional

public class AuthServiceImpl implements AuthService {

`    `private final UserRepository userRepository;

`    `private final PasswordEncoder passwordEncoder;

`    `private final JwtTokenProvider jwtTokenProvider;

`    `private final AuthenticationManager authenticationManager;

`    `private final ApplicationEventPublisher eventPublisher;

`    `@Override

`    `public RegisterResponse register(RegisterRequest request) {

`        `// 1. Check email exists

`        `if (userRepository.existsByEmail(request.getEmail())) {

`            `throw new ConflictException("Email already registered");

`        `}

`        `// 2. Create user

`        `User user = User.builder()

.email(request.getEmail())

.password(passwordEncoder.encode(request.getPassword()))

.displayName(request.getDisplayName())

.role(Role.LEARNER)

.isVerified(false)

.isBanned(false)

.xpPoints(0)

.level(1)

.verificationToken(UUID.randomUUID().toString())

.build();

`        `user = userRepository.save(user);

`        `// 3. Create initial streak

`        `UserStreak streak = UserStreak.builder()

.user(user)

.currentStreak(0)

.longestStreak(0)

.freezeRemaining(2)

.build();

`        `// streakRepository.save(streak);

`        `// 4. Publish event (send verification email async)

`        `eventPublisher.publishEvent(

`            `new UserRegisteredEvent(this, user)

`        `);

`        `log.info("New user registered: {}", user.getEmail());

`        `return RegisterResponse.builder()

.id(user.getId())

.email(user.getEmail())

.displayName(user.getDisplayName())

.message("Please check your email to verify account")

.build();

`    `}

`    `@Override

`    `public LoginResponse login(LoginRequest request) {

`        `// 1. Find user

`        `User user = userRepository

.findByEmail(request.getEmail())

.orElseThrow(() ->

`                `new UnauthorizedException("Invalid credentials")

`            `);

`        `// 2. Check banned

`        `if (user.getIsBanned()) {

`            `throw new ForbiddenException("Account is banned");

`        `}

`        `// 3. Check verified

`        `if (!user.getIsVerified()) {

`            `throw new ForbiddenException(

`                `"Please verify your email first"

`            `);

`        `}

`        `// 4. Authenticate

`        `try {

`            `authenticationManager.authenticate(

`                `new UsernamePasswordAuthenticationToken(

`                    `request.getEmail(),

`                    `request.getPassword()

`                `)

`            `);

`        `} catch (BadCredentialsException e) {

`            `throw new UnauthorizedException("Invalid credentials");

`        `}

`        `// 5. Generate tokens

`        `String accessToken = jwtTokenProvider

.generateAccessToken(user);

`        `String refreshToken = jwtTokenProvider

.generateRefreshToken(user);

`        `log.info("User logged in: {}", user.getEmail());

`        `return LoginResponse.builder()

.accessToken(accessToken)

.refreshToken(refreshToken)

.tokenType("Bearer")

.expiresIn(jwtTokenProvider.getAccessTokenExpiration())

.user(UserInfoResponse.fromEntity(user))

.build();

`    `}

`    `@Override

`    `public TokenResponse refreshToken(TokenRefreshRequest request) {

`        `// 1. Validate refresh token

`        `if (!jwtTokenProvider

.validateToken(request.getRefreshToken())) {

`            `throw new UnauthorizedException(

`                `"Invalid or expired refresh token"

`            `);

`        `}

`        `// 2. Get user from token

`        `Long userId = jwtTokenProvider

.getUserIdFromToken(request.getRefreshToken());

`        `User user = userRepository.findById(userId)

.orElseThrow(() ->

`                `new ResourceNotFoundException("User not found")

`            `);

`        `// 3. Generate new tokens

`        `String newAccessToken = jwtTokenProvider

.generateAccessToken(user);

`        `String newRefreshToken = jwtTokenProvider

.generateRefreshToken(user);

`        `return TokenResponse.builder()

.accessToken(newAccessToken)

.refreshToken(newRefreshToken)

.tokenType("Bearer")

.expiresIn(jwtTokenProvider.getAccessTokenExpiration())

.build();

`    `}

`    `@Override

`    `public void forgotPassword(ForgotPasswordRequest request) {

`        `User user = userRepository

.findByEmail(request.getEmail())

.orElse(null);

`        `// Don't reveal if email exists (security)

`        `if (user != null) {

`            `String resetToken = UUID.randomUUID().toString();

`            `user.setResetPasswordToken(resetToken);

`            `user.setResetPasswordExpires(

`                `java.time.LocalDateTime.now().plusHours(1)

`            `);

`            `userRepository.save(user);

`            `// Publish event to send email async

`            `eventPublisher.publishEvent(

`                `new com.flashlearn.modules.auth.event

.PasswordResetEvent(this, user, resetToken)

`            `);

`        `}

`    `}

`    `@Override

`    `public void resetPassword(ResetPasswordRequest request) {

`        `User user = userRepository

.findByResetPasswordToken(request.getToken())

.orElseThrow(() ->

`                `new BadRequestException("Invalid reset token")

`            `);

`        `if (user.getResetPasswordExpires()

.isBefore(java.time.LocalDateTime.now())) {

`            `throw new BadRequestException("Reset token expired");

`        `}

`        `user.setPassword(

`            `passwordEncoder.encode(request.getNewPassword())

`        `);

`        `user.setResetPasswordToken(null);

`        `user.setResetPasswordExpires(null);

`        `userRepository.save(user);

`    `}

`    `@Override

`    `public void verifyEmail(String token) {

`        `User user = userRepository

.findByVerificationToken(token)

.orElseThrow(() ->

`                `new BadRequestException(

`                    `"Invalid verification token"

`                `)

`            `);

`        `user.setIsVerified(true);

`        `user.setVerificationToken(null);

`        `userRepository.save(user);

`    `}

`    `@Override

`    `public void changePassword(

`            `Long userId,

`            `ChangePasswordRequest request

`    `) {

`        `User user = userRepository.findById(userId)

.orElseThrow(() ->

`                `new ResourceNotFoundException("User not found")

`            `);

`        `if (!passwordEncoder.matches(

`                `request.getCurrentPassword(), user.getPassword())) {

`            `throw new BadRequestException(

`                `"Current password is incorrect"

`            `);

`        `}

`        `user.setPassword(

`            `passwordEncoder.encode(request.getNewPassword())

`        `);

`        `userRepository.save(user);

`    `}

`    `@Override

`    `@Transactional(readOnly = true)

`    `public UserInfoResponse getCurrentUser(Long userId) {

`        `User user = userRepository.findById(userId)

.orElseThrow(() ->

`                `new ResourceNotFoundException("User not found")

`            `);

`        `return UserInfoResponse.fromEntity(user);

`    `}

`    `@Override

`    `public void logout(Long userId, String token) {

`        `// Blacklist the token in Redis

`        `jwtTokenProvider.blacklistToken(token);

`        `log.info("User logged out: userId={}", userId);

`    `}

}
1. ## ` `**<a name="_toc225239673"></a>DTOs**
// ═══════════════════════════════════════════════════════════════

// RegisterRequest.java

// ═══════════════════════════════════════════════════════════════

package com.flashlearn.modules.auth.dto;

import jakarta.validation.constraints.\*;

import lombok.\*;

@Getter @Setter

@NoArgsConstructor @AllArgsConstructor

public class RegisterRequest {

`    `@NotBlank(message = "Email is required")

`    `@Email(message = "Invalid email format")

`    `private String email;

`    `@NotBlank(message = "Password is required")

`    `@Size(min = 8, max = 100,

`          `message = "Password must be 8-100 characters")

`    `@Pattern(

`        `regexp = "^(?=.\*[a-z])(?=.\*[A-Z])(?=.\*\\d)(?=.\*[@$!%\*?&]).\*$",

`        `message = "Password must contain uppercase, lowercase, " +

`                  `"number and special character"

`    `)

`    `private String password;

`    `@NotBlank(message = "Display name is required")

`    `@Size(min = 2, max = 50,

`          `message = "Display name must be 2-50 characters")

`    `private String displayName;

}

// ═══════════════════════════════════════════════════════════════

// LoginRequest.java

// ═══════════════════════════════════════════════════════════════

package com.flashlearn.modules.auth.dto;

import jakarta.validation.constraints.\*;

import lombok.\*;

@Getter @Setter

@NoArgsConstructor @AllArgsConstructor

public class LoginRequest {

`    `@NotBlank(message = "Email is required")

`    `@Email(message = "Invalid email format")

`    `private String email;

`    `@NotBlank(message = "Password is required")

`    `private String password;

}

// ═══════════════════════════════════════════════════════════════

// LoginResponse.java

// ═══════════════════════════════════════════════════════════════

package com.flashlearn.modules.auth.dto;

import lombok.\*;

@Getter @Setter

@Builder

@NoArgsConstructor @AllArgsConstructor

public class LoginResponse {

`    `private String accessToken;

`    `private String refreshToken;

`    `private String tokenType;

`    `private Long expiresIn;

`    `private UserInfoResponse user;

}

// ═══════════════════════════════════════════════════════════════

// UserInfoResponse.java

// ═══════════════════════════════════════════════════════════════

package com.flashlearn.modules.auth.dto;

import com.flashlearn.modules.user.entity.User;

import lombok.\*;

@Getter @Setter

@Builder

@NoArgsConstructor @AllArgsConstructor

public class UserInfoResponse {

`    `private Long id;

`    `private String email;

`    `private String displayName;

`    `private String avatarUrl;

`    `private String role;

`    `private String uiLanguage;

`    `private String learnLanguage;

`    `private Integer xpPoints;

`    `private Integer level;

`    `private Boolean isVerified;

`    `public static UserInfoResponse fromEntity(User user) {

`        `return UserInfoResponse.builder()

.id(user.getId())

.email(user.getEmail())

.displayName(user.getDisplayName())

.avatarUrl(user.getAvatarUrl())

.role(user.getRole().name())

.uiLanguage(user.getUiLanguage())

.learnLanguage(user.getLearnLanguage())

.xpPoints(user.getXpPoints())

.level(user.getLevel())

.isVerified(user.getIsVerified())

.build();

`    `}

}

// ═══════════════════════════════════════════════════════════════

// ApiResponse.java - Standard API Response

// ═══════════════════════════════════════════════════════════════

package com.flashlearn.common.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.\*;

import java.time.LocalDateTime;

@Getter @Setter

@Builder

@NoArgsConstructor @AllArgsConstructor

@JsonInclude(JsonInclude.Include.NON\_NULL)

public class ApiResponse<T> {

`    `private boolean success;

`    `private int statusCode;

`    `private String message;

`    `private T data;

`    `private Object errors;

`    `private LocalDateTime timestamp;

`    `public static <T> ApiResponse<T> success(String message, T data) {

`        `return ApiResponse.<T>builder()

.success(true)

.statusCode(200)

.message(message)

.data(data)

.timestamp(LocalDateTime.now())

.build();

`    `}

`    `public static <T> ApiResponse<T> error(

`            `int statusCode, String message, Object errors) {

`        `return ApiResponse.<T>builder()

.success(false)

.statusCode(statusCode)

.message(message)

.errors(errors)

.timestamp(LocalDateTime.now())

.build();

`    `}

}
1. ## <a name="_toc225239674"></a>**Security Config**
// ═══════════════════════════════════════════════════════════════

// SecurityConfig.java

// ═══════════════════════════════════════════════════════════════

package com.flashlearn.config;

import com.flashlearn.security.\*;

import lombok.RequiredArgsConstructor;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;

import org.springframework.http.HttpMethod;

import org.springframework.security.authentication.AuthenticationManager;

import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;

import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;

import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import org.springframework.security.config.http.SessionCreationPolicy;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import org.springframework.security.crypto.password.PasswordEncoder;

import org.springframework.security.web.SecurityFilterChain;

import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration

@EnableWebSecurity

@EnableMethodSecurity(prePostEnabled = true)

@RequiredArgsConstructor

public class SecurityConfig {

`    `private final JwtAuthenticationFilter jwtAuthFilter;

`    `private final JwtAuthenticationEntryPoint jwtEntryPoint;

`    `@Bean

`    `public SecurityFilterChain filterChain(HttpSecurity http)

`            `throws Exception {

`        `http

.csrf(csrf -> csrf.disable())

.cors(cors -> cors.configure(http))

.exceptionHandling(ex -> ex

.authenticationEntryPoint(jwtEntryPoint)

`            `)

.sessionManagement(session -> session

.sessionCreationPolicy(SessionCreationPolicy.STATELESS)

`            `)

.authorizeHttpRequests(auth -> auth

`                `// ═══ Public endpoints ═══

.requestMatchers("/api/v1/auth/register",

`                                 `"/api/v1/auth/login",

`                                 `"/api/v1/auth/refresh-token",

`                                 `"/api/v1/auth/forgot-password",

`                                 `"/api/v1/auth/reset-password",

`                                 `"/api/v1/auth/verify-email"

`                `).permitAll()

.requestMatchers("/api/v1/public/\*\*").permitAll()

.requestMatchers("/api/v1/i18n/\*\*").permitAll()

.requestMatchers("/api/v1/health").permitAll()

`                `// Swagger

.requestMatchers("/swagger-ui/\*\*",

`                                 `"/v3/api-docs/\*\*"

`                `).permitAll()

`                `// ═══ Admin endpoints ═══

.requestMatchers("/api/v1/admin/\*\*")

.hasRole("ADMIN")

`                `// ═══ Teacher endpoints ═══

.requestMatchers("/api/v1/teacher/\*\*")

.hasAnyRole("TEACHER", "ADMIN")

`                `// ═══ All other endpoints require auth ═══

.anyRequest().authenticated()

`            `)

.addFilterBefore(jwtAuthFilter,

`                `UsernamePasswordAuthenticationFilter.class);

`        `return http.build();

`    `}

`    `@Bean

`    `public PasswordEncoder passwordEncoder() {

`        `return new BCryptPasswordEncoder(12);

`    `}

`    `@Bean

`    `public AuthenticationManager authenticationManager(

`            `AuthenticationConfiguration config

`    `) throws Exception {

`        `return config.getAuthenticationManager();

`    `}

}
1. ## <a name="_toc225239675"></a>**JWT Token Provider**
// ═══════════════════════════════════════════════════════════════

// JwtTokenProvider.java

// ═══════════════════════════════════════════════════════════════

package com.flashlearn.security;

import com.flashlearn.modules.user.entity.User;

import io.jsonwebtoken.\*;

import io.jsonwebtoken.security.Keys;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.data.redis.core.RedisTemplate;

import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;

import java.util.Date;

import java.util.concurrent.TimeUnit;

@Component

@Slf4j

public class JwtTokenProvider {

`    `@Value("${jwt.access-secret}")

`    `private String accessSecret;

`    `@Value("${jwt.refresh-secret}")

`    `private String refreshSecret;

`    `@Value("${jwt.access-expiration}")

`    `private Long accessExpiration;     // 15 minutes in ms

`    `@Value("${jwt.refresh-expiration}")

`    `private Long refreshExpiration;    // 7 days in ms

`    `private final RedisTemplate<String, String> redisTemplate;

`    `public JwtTokenProvider(

`            `RedisTemplate<String, String> redisTemplate) {

`        `this.redisTemplate = redisTemplate;

`    `}

`    `public String generateAccessToken(User user) {

`        `return generateToken(

`            `user, accessSecret, accessExpiration

`        `);

`    `}

`    `public String generateRefreshToken(User user) {

`        `return generateToken(

`            `user, refreshSecret, refreshExpiration

`        `);

`    `}

`    `private String generateToken(

`            `User user, String secret, Long expiration) {

`        `Date now = new Date();

`        `Date expiryDate = new Date(now.getTime() + expiration);

`        `SecretKey key = Keys.hmacShaKeyFor(secret.getBytes());

`        `return Jwts.builder()

.subject(user.getId().toString())

.claim("email", user.getEmail())

.claim("role", user.getRole().name())

.claim("displayName", user.getDisplayName())

.issuedAt(now)

.expiration(expiryDate)

.signWith(key)

.compact();

`    `}

`    `public Long getUserIdFromToken(String token) {

`        `Claims claims = parseToken(token, accessSecret);

`        `return Long.parseLong(claims.getSubject());

`    `}

`    `public boolean validateToken(String token) {

`        `try {

`            `// Check if token is blacklisted

`            `if (isTokenBlacklisted(token)) {

`                `return false;

`            `}

`            `parseToken(token, accessSecret);

`            `return true;

`        `} catch (JwtException | IllegalArgumentException e) {

`            `log.warn("Invalid JWT token: {}", e.getMessage());

`            `return false;

`        `}

`    `}

`    `public void blacklistToken(String token) {

`        `try {

`            `String bearerToken = token.replace("Bearer ", "");

`            `Claims claims = parseToken(bearerToken, accessSecret);

`            `long ttl = claims.getExpiration().getTime()

`                       `- System.currentTimeMillis();

`            `if (ttl > 0) {

`                `redisTemplate.opsForValue().set(

`                    `"blacklist:" + bearerToken,

`                    `"true",

`                    `ttl,

`                    `TimeUnit.MILLISECONDS

`                `);

`            `}

`        `} catch (Exception e) {

`            `log.warn("Could not blacklist token: {}",

`                     `e.getMessage());

`        `}

`    `}

`    `private boolean isTokenBlacklisted(String token) {

`        `return Boolean.TRUE.equals(

`            `redisTemplate.hasKey("blacklist:" + token)

`        `);

`    `}

`    `private Claims parseToken(String token, String secret) {

`        `SecretKey key = Keys.hmacShaKeyFor(secret.getBytes());

`        `return Jwts.parser()

.verifyWith(key)

.build()

.parseSignedClaims(token)

.getPayload();

`    `}

`    `public Long getAccessTokenExpiration() {

`        `return accessExpiration;

`    `}

}
1. ## <a name="_toc225239676"></a>**JWT Authentication Filter**
// ═══════════════════════════════════════════════════════════════

// JwtAuthenticationFilter.java

// ═══════════════════════════════════════════════════════════════

package com.flashlearn.security;

import jakarta.servlet.FilterChain;

import jakarta.servlet.ServletException;

import jakarta.servlet.http.HttpServletRequest;

import jakarta.servlet.http.HttpServletResponse;

import lombok.RequiredArgsConstructor;

import lombok.extern.slf4j.Slf4j;

import org.springframework.security.authentication.

`    `UsernamePasswordAuthenticationToken;

import org.springframework.security.core.context.

`    `SecurityContextHolder;

import org.springframework.security.core.userdetails.

`    `UserDetails;

import org.springframework.security.web.authentication.

`    `WebAuthenticationDetailsSource;

import org.springframework.stereotype.Component;

import org.springframework.util.StringUtils;

import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component

@RequiredArgsConstructor

@Slf4j

public class JwtAuthenticationFilter

`        `extends OncePerRequestFilter {

`    `private final JwtTokenProvider tokenProvider;

`    `private final CustomUserDetailsService userDetailsService;

`    `@Override

`    `protected void doFilterInternal(

`            `HttpServletRequest request,

`            `HttpServletResponse response,

`            `FilterChain filterChain

`    `) throws ServletException, IOException {

`        `try {

`            `String jwt = getJwtFromRequest(request);

`            `if (StringUtils.hasText(jwt)

`                    `&& tokenProvider.validateToken(jwt)) {

`                `Long userId = tokenProvider

.getUserIdFromToken(jwt);

`                `UserDetails userDetails = userDetailsService

.loadUserById(userId);

`                `UsernamePasswordAuthenticationToken authentication =

`                    `new UsernamePasswordAuthenticationToken(

`                        `userDetails,

`                        `null,

`                        `userDetails.getAuthorities()

`                    `);

`                `authentication.setDetails(

`                    `new WebAuthenticationDetailsSource()

.buildDetails(request)

`                `);

`                `SecurityContextHolder.getContext()

.setAuthentication(authentication);

`            `}

`        `} catch (Exception ex) {

`            `log.error("Could not set user authentication: {}",

`                      `ex.getMessage());

`        `}

`        `filterChain.doFilter(request, response);

`    `}

`    `private String getJwtFromRequest(HttpServletRequest request) {

`        `String bearerToken = request.getHeader("Authorization");

`        `if (StringUtils.hasText(bearerToken)

`                `&& bearerToken.startsWith("Bearer ")) {

`            `return bearerToken.substring(7);

`        `}

`        `return null;

`    `}

}

