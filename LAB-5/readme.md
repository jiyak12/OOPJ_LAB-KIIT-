# Lab 5

## 📚 Course Contents
- 📝 Abstract Class in Java  
- 🔗 Interface in Java  

---

## 🗂️ List of Programs

### 1️⃣ `AbstractClassDemo.java` Abstract Class Example - Student & Kiitian
- **Aim:**  
  Illustrate usage of abstract class with:  
  - Abstract class `student` (data members: roll no, reg no, method `getinput()`, abstract method `course()`)  
  - Subclass `kiitian` implementing `course()`  
- **Input:**  
  - Rollno: 2205180  
  - Registration no: 1234567890  
- **Output:**  
  - Rollno: 2205180  
  - Registration no: 1234567890  
  - Course: B.Tech. (Computer Science & Engg)

---

### 2️⃣ `MotorDemo.java` Interface Example - Motor and Washing Machine
- **Aim:**  
  Define interface `Motor` with data member `capacity` and methods `run()` and `consume()`.  
  Class `WashingMachine` implements `Motor` and checks capacity via object.  
- **Input:** Mentioned in program  
- **Output:** Capacity of the motor is -----

---

### 3️⃣ `EmployeeDemo.java`  Interface with Partial Implementation - Manager & Substaff
- **Aim:**  
  Interface with methods `earnings()`, `deductions()`, and `bonus()`.  
  Class `Manager` implements interface but **does not implement** `bonus()`.  
  Class `Substaff` extends `Manager` and implements `bonus()`.  
- **Salary Calculation:**  
  - Earnings = basic + DA (80% of basic) + HRA (15% of basic)  
  - Deduction (PF) = 12% of basic  
  - Bonus = 50% of basic  
- **Input:** Basic salary = 50000  
- **Output:**  
  - Earnings = 97500  
  - Deduction = 6000  
  - Bonus = 25000

---

### 4️⃣ `InterfaceDemo.java` Interface Inheritance Example - Employee, Manager, Head
- **Aim:**  
  Interface `Employee` with method `getDetails()` (empId, empName).  
  Derived interface `Manager` adds `getDeptDetails()` (deptId, deptName).  
  Class `Head` implements `Manager` and displays all details.  
- **Input:**  
  - Employee id: 123  
  - Employee name: Sidharth Ambani  
  - Department id: 06  
  - Department name: Marketing  
- **Output:**  
  - Employee id: 123  
  - Employee name: Sidharth Ambani  
  - Department id: 06  
  - Department name: Marketing

---

