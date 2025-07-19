# 🛍 Update & Search Products/Buyers (Java + MySQL Workbench)

A simple Java application built using NetBeans to *update* and *search* product or buyer records stored in a MySQL database. Ideal for console or Swing-based CRUD applications.

---

## ✅ Features
- Search by name, category, or ID
- Update existing product/buyer details
- JDBC connection to MySQL Workbench
- Fast and easy record handling

---

## 🛠 Tools Used
- Java (NetBeans IDE)
- MySQL Workbench
- JDBC (Java Database Connectivity)

---

## ⚙ Setup Instructions

### 1. Database Setup (in MySQL Workbench)


CREATE DATABASE BH;
USE BH;

CREATE TABLE products (
  id INT PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(100),
  category VARCHAR(100)
);

##2. Project Setup (in NetBeans)

Create a Java Application Project

Add MySQL JDBC Driver:

Right-click project → Properties → Libraries → Add JAR/Folder → Add MySQL Connector/J



3. Java JDBC Code Example

Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/BH", "root", "");
PreparedStatement ps = conn.prepareStatement("SELECT * FROM products WHERE name LIKE ?");
ps.setString(1, "%" + searchKeyword + "%");
ResultSet rs = ps.executeQuery();
