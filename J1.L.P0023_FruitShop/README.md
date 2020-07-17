# J1.L.P0023_FruitShop

## Problem:
Nếu khách hàng đã `order` xong 1 lần, và tiếp tục `order` lại (cùng 1 tên khách hàng) => cần gộp `order` đã `order` trước đó và `order` mới lại thành 1 `order` duy nhất.
- Trùng tên khách hàng => gộp order
  - Trùng tên sản phẩm => gộp sản phẩm - tăng số lượng sản phẩm và cập nhật lại `amount` và `total price`.
  - Không trùng tên sản phẩm thì thêm mới vào danh sách item.
