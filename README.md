# FirstApp

FirstApp là một ứng dụng được xây dựng bằng JavaFX, sử dụng Java Module System và Kotlin. Dự án này được thiết kế để minh họa cách sử dụng JavaFX cho các ứng dụng giao diện người dùng.

---

## Cấu trúc dự án

```plaintext
FirstApp/
├── src/
│   ├── main/
│   │   ├── kotlin/
│   │   │   └── org/src/firstapp/
```

---

## Yêu cầu hệ thống

- **Java Development Kit (JDK):** Phiên bản 21 trở lên
- **Maven:** Nếu bạn đang sử dụng Maven để quản lý phụ thuộc
- **JavaFX SDK:** Đã cấu hình trong IDE
- **IntelliJ IDEA:** Để phát triển và chạy ứng dụng

---

## Hướng dẫn cài đặt và chạy

### 1. Clone dự án

```bash
git clone https://github.com/your-repo/FirstApp.git
cd FirstApp
```

### 2. Cấu hình môi trường

Đảm bảo bạn đã cài đặt JavaFX và cấu hình đúng trong IDE:
1. Mở IntelliJ IDEA.
2. Vào **File > Project Structure > Libraries**.
3. Thêm thư mục chứa JavaFX SDK (ví dụ: `javafx-sdk-21/lib`).

### 3. Biên dịch và chạy ứng dụng

#### Cách 1: Chạy trực tiếp từ IntelliJ IDEA
- Chuột phải vào file `HelloApplication.kt`.
- Chọn **Run 'HelloApplicationKt'**.

#### Cách 2: Sử dụng Maven
Nếu bạn dùng Maven, biên dịch và chạy ứng dụng bằng lệnh sau:

```bash
mvn clean javafx:run
```

### 4. Lưu ý khi chạy

Nếu gặp lỗi liên quan đến `java.lang.module.FindException`, hãy kiểm tra:
- Đảm bảo file `module-info.java` đã được cấu hình đúng.
- Các file `.class` trong thư mục `target/classes` không chứa file không hợp lệ.

---

## Cấu hình `module-info.java`

Đây là một ví dụ về nội dung của file `module-info.java`:

```java
module org.src.firstapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.src.firstapp to javafx.fxml;
    exports org.src.firstapp;
}
```

---

## Đóng góp

Mọi đóng góp để cải thiện dự án này đều được hoan nghênh! Vui lòng gửi **Pull Request** hoặc tạo **Issue** nếu bạn gặp lỗi.

---


---

## Giấy phép

Dự án này được phát hành theo giấy phép MIT. Xem [LICENSE](./LICENSE) để biết thêm thông tin chi tiết.
