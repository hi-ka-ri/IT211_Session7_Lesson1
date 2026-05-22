Vi phạm nguyên tắc thiết kế:

Việc chèn thủ công System.currentTimeMillis() vào từng phương thức đã vi phạm nguyên tắc Separation of Concerns (Phân tách mối quan tâm).

Đây là biểu hiện của Code Tangling: logic nghiệp vụ (xử lý giao dịch) bị trộn lẫn với logic kỹ thuật (đo thời gian).

Hậu quả:

Khó bảo trì: mỗi khi muốn thay đổi cách đo thời gian/log, phải sửa tất cả các phương thức.

Lặp mã (Code Duplication): cùng một đoạn code xuất hiện nhiều lần.

Vi phạm nguyên tắc DRY (Don’t Repeat Yourself): không tái sử dụng được.

Giảm tính trong sáng của code: logic nghiệp vụ bị che khuất bởi logic đo hiệu năng.