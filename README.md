## Getting into Practice: Input / Output (I/O)

### 🎯 Objective
The objective of this activity is to practice **file input and output operations** in Java.
It focuses on reading from and writing to files, as well as handling common I/O-related exceptions.

---

### 📝 Description

This exercise demonstrates how Java handles:
- Reading data from files
- Writing data to files
- Managing directories and file paths
- Using Java I/O classes safely with exception handling

---

### 🧩 Exercise 1: Directory Listing (ls Simulation)

#### Description
- The program asks the user to enter a full directory path.
- It lists all files and directories inside the specified path.
- For each item, it displays:
  - Type: `<DIR>` for directories, `<FILE>` for files
  - Access permissions:
    - `r` → readable
    - `w` → writable
    - `h` → hidden

#### Example Output
<img width="1711" height="274" alt="image" src="https://github.com/user-attachments/assets/197acddd-9b8c-444a-acff-056bf88044ff" />

---

## Exercise 2: Product Management with Serialization

### Description
This exercise manages a collection of products and stores them in a file using Java serialization.

### Product Class
Each product contains:
- id
- name
- brand
- price
- description
- stock quantity

The `Product` class implements the `Serializable` interface.

### Business Interface (`IProduitMetier`)
Declared methods:
- `add(Product product)`
- `getAll()`
- `findById(long id)`
- `delete(long id)`
- `saveAll()`

### Implementation (`MetierProduitImpl`)
- Uses a `List<Product>` to store products.
- Saves and loads data from `products.dat`.

### Application Menu
The user can:
1. Display all products
2. Search product by ID
3. Add a new product
4. Delete a product by ID
5. Save products to file
6. Exit the program

<img width="976" height="689" alt="image" src="https://github.com/user-attachments/assets/697ef72e-0a82-4ab1-81f9-2415fac9f94a" />


## Exercise 3: Exception Handling

### Part 1: Calculator

The `Calculator` class includes:
- `divide(a, b)`  
  - Displays an error if division by zero occurs.
- `convertToNumber(text)`  
  - Displays an error if the text is not a valid number.
- `calculate(operation, a, b)`  
  - Supports `+`, `-`, `*`, `/`
  - Displays an error for unsupported operations.

---

### Part 2: Custom Exception

#### TooFastException
- Custom exception extending `Exception`.
- Triggered when speed exceeds 90.
- Displays a detailed message including the speed.

#### Vehicle Class
- Contains method `testSpeed(int speed)`
- Throws `TooFastException` if speed > 90
- Main method demonstrates exception handling and prints the stack trace.
<img width="1325" height="87" alt="image" src="https://github.com/user-attachments/assets/d11a9133-0141-41b6-87b3-29e333fbaf72" />

---






