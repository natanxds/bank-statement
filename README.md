# Bank Statement Analyzer

A Java application for parsing and analyzing bank statements from CSV files, based on Raoul-Gabriel Urma's "Real-World Software Development" book.

## Overview

This project demonstrates practical software development techniques by implementing a bank statement processor that parses transaction data and performs various analyses.

## Features

- CSV parsing of bank transaction data
- Transaction analysis (totals, averages, etc.)
- Filtering capabilities based on amount, date, and description
- Extensible design using OOP principles

## Technologies

- Java 11+
- JUnit 5 for testing
- Maven for dependency management

## Concepts Demonstrated

- SOLID principles
- Single Responsibility Principle (SRP)
- Open/Closed Principle (OCP)
- Dependency Injection
- Test-Driven Development (TDD)
- Domain modeling
- Parsing and data validation

## Getting Started

1. Clone this repository
2. Build using Maven: `mvn clean install`
3. Run the application with a sample statement: `java -jar target/bank-statement-1.0.0.jar sample-data.csv`

## Testing

Run tests with: `mvn test`

## Project Structure

- `BankTransaction`: Domain model representing a bank transaction
- `BankStatementCSVParser`: Parses CSV data into transactions
- `BankStatementProcessor`: Processes transaction data
- `BankTransactionFilter`: Interface for filtering transactions

## License

This project is for educational purposes, following the examples in "Real-World Software Development" by Raoul-Gabriel Urma.