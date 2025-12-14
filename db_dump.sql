-- MySQL dump for Military Asset Management (basic tables)
CREATE DATABASE IF NOT EXISTS military_assets;
USE military_assets;

CREATE TABLE base (
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(100),
  location VARCHAR(100)
);

CREATE TABLE asset (
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(100),
  type VARCHAR(50),
  unit VARCHAR(20)
);

CREATE TABLE app_user (
  id INT AUTO_INCREMENT PRIMARY KEY,
  username VARCHAR(100),
  password VARCHAR(100),
  role VARCHAR(50)
);
INSERT INTO app_user(username,password,role)VALUES('admin','admin123','ADMIN'),('logistics','logistics123','LOGISTICS'),('commander','commander123','COMMANDER')

-- add more tables as needed (purchases, transfers, assignments)
