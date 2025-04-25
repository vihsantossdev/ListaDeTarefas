# Lista de Tarefas em Java

Este é um projeto simples de Lista de Tarefas desenvolvido em Java. Ele permite que você adicione, remova e liste tarefas de forma ordenada (alfabética ou cronológica). 

## Funcionalidades

- **Adicionar Tarefa**: Adiciona uma nova tarefa à lista, verificando se já existe.
- **Remover Tarefa**: Remove uma tarefa existente com confirmação.
- **Listar Tarefas**: Lista todas as tarefas de forma alfabética ou cronológica, dependendo da sua escolha.
- **Persistência Temporária**: As tarefas existem apenas durante a execução do programa.

## Tecnologias Utilizadas

- **Java 8+**: Para criar e executar o programa.
- **Bibliotecas Padrão do Java**: Como `java.util`, `java.time`, e `java.util.Scanner`.

## Como Executar

### Pré-requisitos
1. Certifique-se de que o Java Development Kit (JDK) está instalado em sua máquina. Verifique com:
   ```
   java -version
   ```
   Caso não esteja instalado, faça o download no site oficial do [Oracle Java](https://www.oracle.com/java/technologies/javase-downloads.html) ou use o [OpenJDK](https://openjdk.org/).

2. Escolha um editor ou IDE como:
   - IntelliJ IDEA
   - Eclipse
   - VS Code com extensão para Java

### Passo a Passo

1. Clone este repositório ou copie os arquivos do projeto para sua máquina.
2. Certifique-se de que os arquivos `ListaDeTarefas.java`, `Main.java` e `Tarefa.java` estão no mesmo diretório.
3. Abra o terminal nesse diretório e compile os arquivos:
   ```
   javac *.java
   ```
   Isso criará os arquivos `.class` necessários para executar o programa.

4. Execute o programa com o comando:
   ```
   java Main
   ```

5. Siga as instruções no terminal para interagir com o menu.

### Exemplo de Uso

**Menu no terminal:**
```
📋 MENU:
1 - Adicionar Tarefa
2 - Remover Tarefa
3 - Listar Tarefas (Alfabética)
4 - Listar Tarefas (Cronológica)
5 - Sair
Escolha uma opção: 
```

**Adicionando uma tarefa:**
```
Digite a descrição da tarefa: Comprar leite
✅ Tarefa adicionada com sucesso!
```

**Listando tarefas em ordem cronológica:**
```
📌 Lista de Tarefas:
 - Comprar leite (Criada em: 24/04/2025 20:45)
```

**Removendo uma tarefa:**
```
Digite a descrição da tarefa a remover: Comprar leite
Tem certeza que deseja remover? (s/n)
s
✅ Tarefa removida!
```

## Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir uma issue ou enviar um pull request.

## Licença

Este projeto está licenciado sob a [MIT License](LICENSE).
