## Java Web

Plugin para inicializar um projeto de automação Java Web.

## Pré-requisitos

* Ter instalado a versão do java sdk que deseja implantar o plugin, o mesmo oferece as opção de versão javasdk: 11, 17 ou 21;
* Postgres Sql;
* PgAdmin III.


## Uso

Criar um novo projeto java com o plugin, utilizar comando:

```
stk apply plugin qa-corp/java@1.0.0/java-web
```

* Atenção, verifique qual melhor versão se aplica ao seu projeto.

## Release Notes

**Versão: 0.0.1** - essa versão contém o básico para execução de um projeto de automação java, possui um teste que abre uma página web para teste e fecha o browser, garantindo dessa forma que o projeto está pronto para implantação de novas features.

**Versão: 0.0.2** - essa versão foi incluído o Framework Selenide, que facilita a automação dos testes com o contexto java.
