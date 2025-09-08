# 🧠 Ứng Dụng Tư Vấn Tâm Lý & Theo Dõi Cảm Xúc Người Dùng
### Judy-Emotion-Cheking-Chatting-App

Dự án này là một **ứng dụng tư vấn tâm lý kết hợp theo dõi cảm xúc**, giúp người dùng trò chuyện, ghi nhận trạng thái cảm xúc hằng ngày và trực quan hóa dữ liệu thông qua biểu đồ thống kê.  
Ứng dụng tích hợp **AI API** để phân tích cảm xúc dựa trên nội dung hội thoại.

---

## 🚀 Công Nghệ Sử Dụng
- **Java** (Xử lý nghiệp vụ)
- **JavaFX** (Xây dựng giao diện người dùng)
- **SQL Server** (Cơ sở dữ liệu)
- **Maven** (Quản lý dependencies và build project)
- **Tailwind CSS / Bootstrap** (Tùy chỉnh giao diện)
- **AI API** (Phân tích cảm xúc từ nội dung hội thoại)

---

## 📂 Cấu Trúc Thư Mục Chính
    PsychologyApp/
    │── src/
    │   ├── main/java/com/psychologyapp/   # Code Java chính
    │   │   ├── model/                     # Entity mapping ERD
    │   │   ├── dao/                       # Data Access Object
    │   │   ├── service/                   # Business logic
    │   │   ├── controller/                # JavaFX Controller
    │   │   ├── util/                      # DB connection, API client
    │   │   └── MainApp.java               # Entry point
    │   │
    │   └── main/resources/
    │       ├── fxml/                      # Giao diện JavaFX
    │       ├── css/                       # CSS giao diện
    │       ├── images/                    # Icon, hình ảnh
    │       └── application.properties     # Config DB & API
    │
    │── sql/                               # Script tạo DB và dữ liệu mẫu
    │── docs/                              # Tài liệu thiết kế, ERD, API
    │── pom.xml                            # Maven configuration
    └── README.md

---

## ⚙️ Cài Đặt & Chạy Ứng Dụng
    1. Yêu cầu môi trường
    JDK 17 hoặc mới hơn
    
    Maven 3.8+
    
    SQL Server (cài sẵn và tạo database PsychologyApp)
    
    Git
    
    2. Clone project
    bash
    Copy code
    git clone https://github.com/<USERNAME>/<REPO>.git
    cd PsychologyApp
    3. Cấu hình database
    Chỉnh sửa file src/main/resources/application.properties:
    
    properties
    Copy code
    db.url=jdbc:sqlserver://localhost:1433;databaseName=PsychologyApp
    db.username=sa
    db.password=your_password
    ai.api.key=YOUR_AI_API_KEY
    4. Import Database
    Chạy script trong thư mục sql/:
    
    sql
    Copy code
    sql/create_tables.sql
    sql/sample_data.sql
    5. Build & Run
    bash
    Copy code
    mvn clean install
    mvn javafx:run
## 📊 Chức Năng Chính
    👤 Đăng ký / Đăng nhập người dùng

    💬 Trò chuyện với AI (hỗ trợ tư vấn tâm lý cơ bản)
    
    😊 Phân tích cảm xúc từ nội dung chat (AI API)
    
    📌 Theo dõi cảm xúc hằng ngày và ghi nhật ký cảm xúc
    
    📈 Biểu đồ trực quan hóa cảm xúc (dashboard)
    
    📂 Quản lý dữ liệu (người dùng, phiên chat, cảm xúc)
    
    🛠 Hướng Phát Triển Tương Lai
    Hỗ trợ đa ngôn ngữ (Việt/Anh)
    
    Tích hợp gợi ý hoạt động cải thiện tâm trạng dựa trên dữ liệu cảm xúc
    
    Hỗ trợ chat nhóm hoặc kết nối với chuyên gia tư vấn
    
    Tích hợp AI NLP nâng cao để hiểu ngữ cảnh tốt hơn
    
## 👨‍💻 Tác Giả
    Phan Thanh Tú – Software Engineer.