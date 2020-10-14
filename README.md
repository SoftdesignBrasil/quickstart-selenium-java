# Automação Web utilizando Selenium com Java

* Aplicação utilizada: <a href="http://www.way2automation.com/angularjs-protractor/banking/#/login">Banking App</a>

## Requisitos

* JDK 8 ou superior <a href="https://www.oracle.com/br/java/technologies/oracle-java-archive-downloads.html" target="_blank">Página para download</a>
* Apache Maven <a href="https://maven.apache.org/download.cgi" target="_blank">Página oficial para dowload</a>

**Observação:** depois que fizer o download do Apache Maven, não se esqueça de adicioná-lo como uma variável de ambiente no seu sistema operacional.

## Ferramentas
* Selenium WebDriver <a href="https://www.selenium.dev/documentation/en/webdriver/" target="_blank">Documentação</a>
* WebDriverManager <a href="https://github.com/bonigarcia/webdrivermanager" target="_blank">Documentação</a>
* JUnit 4 ou superior <a href="https://junit.org" target="_blank">Página oficial</a>

### Comandos para executar os testes

* Somentes testes: `mvn test`

* Testes e gerar relatório HTML com plugin do Maven: `mvn site`

Depois que executar o comando para gerar os relatórios. O **Maven** irá criar um diretório chamado **target**, neste diretório terá outro diretório chamado **site**. Dentro dele terá um arquivo chamado **surefire-report.html**. Execute este arquivo em qualquer navegador para visualizar o relatório.

Caminho: `target/site/surefire-report.html`
