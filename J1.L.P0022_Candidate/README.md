# J1.L.P0022_Candidate

### package

- `entity`: chứa các đối tượng cần quản lý trong project
  - `Candidate`
  - `Experience`
  - `Fresher`
  - `Intern`
  
<br />

- `util`: chứa các lớp hỗ trợ cho project
  - `Validate`: chứa các method cho việc validate dữ liệu đầu vào.
    - `getInt()`
    - `getString()`
    
  - `Helper`: chứa các method hỗ trợ khác.
    - `menu()`
    - `isContinue()`
    - `getCurrentYear()`
    
  - `IConstant`: chứa tất cả REGEX dùng để validate dữ liệu.

<br />

- `mock`: chứa lớp tạo dữ liệu ban đầu
  - `Data`: tạo dữ liệu cho project (List Candidate).

<br />
 
- `bo`: chứa lớp xử lý business logic của entity
  - `CandidateBo`: lớp xử lý business logic của đối tượng `Candidate`.
    - `display()`
    - `add()`
    - `search()`
    - `displayResultSearch()`
    
<br />

- `main`: chứa lớp main function
  - `CandidateManager`
  
<br />
