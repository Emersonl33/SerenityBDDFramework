# Serenity-Allure Integration Sample

**English** | **Português**

-----
## English

This project is a simple example of how to integrate ***Serenity BDD*** with ***Allure Reports*** in a Selenium Java-based test automation framework

### What is Serenity BDD?
**Serenity BDD** is an test automation framework designed to make writing automated tests easier and more structured.
It helps you write cleaner, more maintainable, and more readable test scenarios.

### Whats is Allure?
**Allure** is a flexible, multilanguage test report tool, that shows a clear graphical representation of what has been tested, with datailed step-by-step information, logs and screenshot. 
### Technologies

- Java 21
- Maven
- Selenium
- Serenity BDD framework
- Junit 5
- Allure Reports

### How to Run
1. Execute tests via Maven (Make sure your maven is configured with Java 21 version with "mvn -version")
   ```bash
   mvn clean verify

2. Generate Allure Reports (Make sure you have Allure CLI installed)
   ```bash
   allure generate target/allure-results --clean -o target/allure-report
### Where you can get the reports
1. The report will available in directory ./target/allure-report/index.html
<img src="./instructionsImages/directoryStructure.png" alt="directory-image" style="height:390px; width:300px;"/>

### Design of the generated reports
1. the generated report comes with an index.html file and display the following home page
<img src="./instructionsImages/reportPage.png" alt="report-image" style="height:480; width:680px;"/>

# Português

Este projeto é um exemplo simples de como integrar o **Serenity BDD** com **Allure Reports** em um framework de automação de testes baseado em Java e Selenium.

## O que é Serenity BDD?
O **Serenity BDD** é um framework de automação de testes projetado para tornar a escrita de testes automatizados mais fácil e estruturada. Ele ajuda escrever cenários de teste mais limpos, sustentáveis e legíveis.

## O que é o Allure?
O **Allure** é uma ferramenta de relatórios de testes flexível e multilíngue, que apresenta uma representação gráfica clara do que foi testado, com informações detalhadas com passo a passo, logs e capturas de tela.

## Tecnologias

- Java 21
- Maven
- Selenium
- Framework Serenity BDD
- JUnit 5
- Relatórios Allure

## Como Executar

1. Execute os testes via Maven (Certifique-se de que seu Maven está configurado com a versão Java 21 usando `mvn -version`):
   ```bash
   mvn clean verify

   
2. Geração Allure Reports (Certifique-se que você tem o Allure CLI instalado)
   ```bash
   allure generate target/allure-results --clean -o target/allure-report
