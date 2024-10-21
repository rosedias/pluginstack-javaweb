## javaweb

 Esse plugin contém o skelleton de um projeto de automação Java Web.

## Pré-requisitos

Ter instalado a versão do java sdk que deseja implantar o plugin, o mesmo oferece as opção de versão javasdk: 11, 17  ou 21.

## Uso

Criar um novo projeto java com o plugin, utilizar comando:

```
Versão 1: stk apply plugin qa-corp/java@1.0.0/java-web@0.0.1
Versão 2: stk apply plugin qa-corp/java@1.1.0/java-web@0.0.2
Versão 3: stk apply plugin qa-corp/java@1.1.0/java-web@0.0.3
```


## Release Notes

Para publicar um novo plugin:

* executar o seguinte comando de exemplo dentro da pasta do plugin

```
stk publish plugin --studio qa-corp
```

**Versão: 0.0.1** - essa versão contém o básico para execução de um projeto de automação java, possui um teste que abre uma página web para teste e fecha o browser, garantindo dessa forma que o projeto está pronto para implantação de novas features.

**Versão: 0.0.2** - essa versão foi incluído o Framework Selenide, que facilita a automação dos testes com o contexto java.

**Versão: 0.0.3** - essa versão foi incluído o banco de dados Postgres com uma estrutura de tabelas, para criar um ambiente de automação que irá gerar massas de dados para um cenário de banco, com as seguintes tabelas:

- contas;
- transações;
- usuários;
- massas.

Lembrando que o projeto pode ser adaptado a sua necessidade, podendo ser customizável a um portal de geração de massas de dados para testes.
