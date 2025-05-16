# Lab 4 

## 📚 Course Contents Covered
- Single Level Inheritance in Java  
- Multi-Level Inheritance in Java  
- Method Overriding and use of `final` and `super` keywords in Java  
- Dynamic Method Dispatch  

---

##  💻 List of Programs

### 1. `PlasticCost` Plastic Cost Calculator Using Inheritance
- **Description:** A plastic manufacturer sells plastic sheets and boxes at different rates per unit area and volume respectively. A 3D box class inherits from a 2D sheet class. The program calculates the cost of plastic based on user-entered dimensions.
- **Input:** Dimensions of sheet or box  
- **Output:** Cost of plastic

### 2. `MultiLevelInheritanceDemo`  Constructor Execution in Multi-level Inheritance
- **Description:** Demonstrates constructor chaining in multi-level inheritance using three classes: `Plate` (length, width), `Box` (length, width, height), and `WoodBox` (length, width, height, thickness). Each class’s constructor takes user input for dimensions and displays them.
- **Input:** Dimensions for plate, box, and wood box  
- **Output:** Display the entered dimensions for each object

### 3. `FruitDemo` Dynamic Method Dispatch with Fruits Classes
- **Description:** Defines three classes - `Apple`, `Banana`, and `Cherry`, where `Banana` and `Cherry` inherit from `Apple`. Each class has its own `show()` method. Using dynamic method dispatch, the program demonstrates polymorphic behavior by calling the appropriate `show()` methods.
- **Input:** None (hardcoded `show()` methods)  
- **Output:** Displays `show()` method output for each class

### 4. `PersonDetails` Account and Person Classes with Method Overriding
- **Description:** Defines a base class `Account` with `acc_no` and `balance` data members and methods to input and display details. A subclass `Person` extends `Account`, adding `name` and `aadhar_no`, and overrides the display method. The program handles details of three persons.
- **Input:** Details of three persons (account number, balance, name, aadhar number)  
- **Output:** Display details of the three persons

---

