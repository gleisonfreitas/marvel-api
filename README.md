# marvel-api

Esse projeto ilustra os endpoints de characters da Marvel. Utilizando o framework Spring.

## Começando

Para executar o projeto, será necessário instalar os seguintes programas:

- [JDK 8: Necessário para executar o projeto Java](https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html)
- [Maven 3.5.3: Necessário para realizar o build do projeto Java](http://mirror.nbtelecom.com.br/apache/maven/maven-3/3.5.3/binaries/apache-maven-3.5.3-bin.zip)
- [STS: Para desenvolvimento do projeto](https://spring.io/tools)
- [MySQL: Para recursos de Banco de dados](https://dev.mysql.com/downloads/)

## Desenvolvimento

Para iniciar o desenvolvimento, é necessário clonar o projeto do GitHub num diretório de sua preferência:

```shell
cd "diretorio de sua preferencia"
git clone https://github.com/gleisonfreitas/marvel-api
```

## Configuração

Para executar o projeto, é necessário utilizar o STS, para que o mesmo identifique as dependências necessárias para a execução no repositório .m2 do Maven. Uma vez importado o projeto, abra o arquivo 'application.properties' que se encontra na pasta '..\marvel-api\src\main\resources', altere as propriedades 'spring.datasource.username' e 'spring.datasource.password' para o usuário que você criou para o MySql.

### Construção

Para construir o projeto com o Maven, executar os comando abaixo:

```shell
mvn clean install
```

O comando irá baixar todas as dependências do projeto e criar um diretório *target* com os artefatos construídos, que incluem o arquivo jar do projeto. Além disso, serão executados os testes unitários, e se algum falhar, o Maven exibirá essa informação no console.

### Executando

Após construir o projeto, entre na pasta '...\marvel-api\target', execute os comandos abaixo.

```shell
java -jar marvel-api-0.0.1-SNAPSHOT.jar
```

O comando irá subir o projeto onde será possível acessar as url´s abaixo pelo browser ou por outras ferramentas de chamada de serviços Rest, por exemplo o Postman.

```shell
http://localhost:8080/v1/public/characters
http://localhost:8080/v1/public/characters/{characterId}
http://localhost:8080/v1/public/characters/{characterId}/comics
http://localhost:8080/v1/public/characters/{characterId}/events
http://localhost:8080/v1/public/characters/{characterId}/series
http://localhost:8080/v1/public/characters/{characterId}/stories
```

## Features

O projeto pode ser usado como modelo para iniciar o desenvolvimento de um projeto Java usando o Spring Boot, criando endpoints disponibilizando serviços REST, como criar Testes de integração e da API.


## Licença

Não se aplica.