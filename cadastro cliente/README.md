# Cadastro de Usuário

Projeto desenvolvido como exercício prático de um curso de Java. O sistema permite cadastrar, consultar, alterar e excluir clientes utilizando uma interface gráfica simples baseada em diálogos (`JOptionPane`).

## Técnicas e Conceitos Utilizados

- **Java Orientado a Objetos:**  
  Utilização de classes, interfaces e encapsulamento (ex: `Cliente`, `IClienteDAO`).
- **Design de DAO (Data Access Object):**  
  Implementação de duas versões de DAO, uma baseada em `HashMap` e outra em `HashSet` para armazenamento em memória.
- **Coleções Java:**  
  Uso de `HashMap`, `HashSet`, `Collection` e manipulação de dados em memória.
- **Interface Gráfica Simples:**  
  Utilização de `javax.swing.JOptionPane` para entrada e saída de dados, facilitando a interação do usuário sem necessidade de frameworks externos.
- **Tratamento de Entrada de Dados:**  
  Conversão e validação de dados inseridos pelo usuário através de caixas de diálogo.
- **Estrutura de Projeto para IDEs (Eclipse/VSCode):**  
  Projeto preparado para uso em IDEs populares, com arquivos `.classpath`, `.project`, e configuração no diretório `.vscode`.

## Ferramentas Utilizadas

- **Java JDK** (recomendado: versão 8 ou superior)
- **javax.swing** (biblioteca padrão para interface gráfica em Java)
- **IDE:** Visual Studio Code (recomendado) ou Eclipse
- **Bibliotecas Padrão do Java:** Não há dependências externas além do JDK/JavaSE

## Modelo de Domínio

O sistema possui uma entidade principal:

```
+--------------------------+
|         Cliente          |
+--------------------------+
| - nome: String           |
| - cpf: Long              |
| - tel: Long              |
| - end: String            |
| - numero: Integer        |
| - cidade: String         |
| - estado: String         |
+--------------------------+
```

## Estrutura de Pastas

- `src/`: Código fonte Java
- `lib/`: Local para bibliotecas externas (não utilizadas neste projeto, mas preparado)
- `bin/`: Saída dos arquivos compilados
- `.vscode/`: Configurações específicas para Visual Studio Code

## Como Executar

1. Importe o projeto em sua IDE de preferência (VS Code ou Eclipse).
2. Compile o projeto (geralmente, basta clicar em "Run" ou "Executar" na IDE).
3. Execute a classe principal:  
   `br.com.renaneliziario.cadastro`
4. Siga as instruções exibidas nas caixas de diálogo.

## Observações

- O sistema não utiliza banco de dados, todo o armazenamento é feito em memória enquanto o programa está em execução.
- Para persistência real, seria necessário integrar com um sistema de arquivos ou banco de dados.
- O uso de `javax.swing.JOptionPane` proporciona uma interface gráfica básica e rápida para interação com o usuário.

---

Este projeto é uma base para estudos e prática de conceitos fundamentais do Java!