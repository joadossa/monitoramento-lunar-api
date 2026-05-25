# Monitoramento de Recursos da Base Lunar - API Backend

## Descrição do Projeto

Este projeto consiste em uma API REST desenvolvida em Java com Spring Boot para controle dos recursos de uma base lunar.

A aplicação permite o cadastro, consulta, atualização e remoção de informações relacionadas a sensores, reservatórios, consumo de energia, climatização e alertas operacionais.

O projeto foi desenvolvido utilizando arquitetura simples em camadas, separando as responsabilidades em Controller, Service, Repository e Model.

## Autor

Nome: João Victor Pereira  
RM: 550306

## Tecnologias Utilizadas

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database
- Maven
- Postman

## Arquitetura do Projeto

A aplicação foi organizada em camadas:

Controller -> Service -> Repository -> Model

## Commits de Desenvolvimento

251c802 - (HEAD -> main, origin/main) Configuração com script para popular DB
38aaa42 - Corrige classe Climatizacao e atualiza documentacao
0729466 - Implementa CRUD de alertas operacionais
b4d0f87 - Implementa CRUD de climatizacao
b58f2c3 - Implementa CRUD de consumo de energia
b77c30e - Implementa CRUD de reservatorios
5a298c3 - Implementa CRUD de sensores
b31f1e1 - Estrutura inicial do projeto Spring Boot com JPA, H2 e Lombok