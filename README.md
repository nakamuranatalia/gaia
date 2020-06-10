# Gaia

##Descrição
O projeto Gaia tem como objetivo listar ideias de reciclagem de acordo com os materiais que o usuário tem disponíveis e ajudá-lo na busca de centros de reciclagem próximos a seu endereço, visando assim 
a busca por práticas mais sustentáveis e ecologicamente corretas

##Getting started
Para executar nosso projeto, será necessário a instalação dos seguintes programas e dependências
###Programas
- Apache Tomcat: servidor para rodar o site </li>
- JDK:
- Eclipse: para visualização do código e desenvolvimento do projeto
###Dependências
- [Mysql connector: para acessar o banco de dados](https://mvnrepository.com/artifact/mysql/mysql-connector-java/8.0.18)
- [JSTL: para acessar a biblioteca JSTL] (https://mvnrepository.com/artifact/javax.servlet/jstl/1.2)
- [JSTL api: para acessar a biblioteca JSTL](https://mvnrepository.com/artifact/javax.servlet.jsp.jstl/jstl-api/1.2-rev-1)
- [Jersey: para criar um client para acessar a API](https://repo1.maven.org/maven2/org/glassfish/jersey/bundles/jaxrs-ri/2.31/jaxrs-ri-2.31.zip)
-[Genson: para a deserialização do arquivo JSON](https://mvnrepository.com/artifact/com.owlike/genson/1.6)

##Desenvolvimento
Para iniciar o desenvolvimento, é necessário clonar o projeto do GitHub em um diretório de sua preferência 

cd "diretorio de sua preferencia"
git clone https://github.com/nakamuranatalia/gaia

##Features
O Gaia tem várias funcionalidades como: listagem de ideais para reutilização de materiais, busca de pontos de reciclagem, cadastro, exclusão e atualização de ideias e cadastro, exclusão e atualização de materiais recicláveis.

##Configuração
Para executar o projeto, é preciso utilizar o Eclipse para que as dependências sejam  adicionadas ao classpath e assim, seja possível inicializar o projeto no servidor Tomcat. Além disso é preciso criar um banco de dados, alterar a rota de acesso a ele, que se encontra na classe ConnectionFactory e adicionar elementos as tabelas do banco de dados.

###Query de construção do banco de dados
CREATE DATABASE gaia;

USE gaia;

CREATE TABLE recycled_material (
	recycled_material_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    	recycled_material_identifier_cd INT NOT NULL,
	recycled_material_name VARCHAR (50)
);


CREATE TABLE recycling_ideas (
	recycling_ideas_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    	recycling_ideas_identifier_cd INT NOT NULL,
	recycling_ideas_title VARCHAR(50) NOT NULL,
    	fk_recycled_material_id INT NOT NULL,
    	recycling_ideas_materials TEXT NOT NULL,
    	recycling_ideas_steps TEXT NOT NULL,
    	FOREIGN KEY (fk_recycled_material_id) REFERENCES recycled_material (recycled_material_id)
);


