#  🔐 Password Strength Analyser

A simple Java console application that analyses the strength of a password based on length, character variety, and common weak patterns.  
This project demonstrates pattern detection, scoring logic, and clean console interaction.

## Features
Analyse passwords based on:
- Length
- Uppercase, lowercase, digits, symbols
- Sequential patterns (123, abc, qwerty, etc.)
- Repeated characters
- Year patterns (1900–2026)

Provides:
- Score out of 100
- Strength rating
- Suggestions for improvement

Menu-based interface for analyzing multiple passwords in one session.

## Project Structure
PasswordAnalyser/  
└── src/  
  └── Analyser/  
    ├── Main.java  
    ├── PasswordAnalyser.java  
    ├── PasswordScore.java  
    └── PatternChecker.java
