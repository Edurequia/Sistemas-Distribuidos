PROCESSOS

Um processo é uma instância de um programa em execução. Ele contém informações importantes, como:
- O contador de programa (que indica qual instrução será executada em seguida),
- Registradores do processador,
- Variáveis e dados em uso.

Pode-se pensar em um processo como um container de recursos, necessário para executar uma ou mais tarefas. Cada processo possui:
- Seu próprio espaço de memória (não é compartilhado com outros processos),
- Entrada e saída próprias,
- Um estado de execução (em execução, pronto, bloqueado, etc.).
Analogia com Programação Orientada a Objetos:
- O programa é como a classe (definição do comportamento),
- O processo é como o objeto (uma instância concreta em uso).


THREADS

Uma thread é um fluxo de controle dentro de um processo. Ou seja, é uma "subatividade" que pode ser executada de forma independente, mas que compartilha os mesmos recursos do processo principal.

Um processo pode conter uma ou várias threads, e todas elas compartilham:
- Memória e variáveis globais,
- Arquivos abertos,
- Espaço de endereçamento.

Isso permite que diferentes partes do programa sejam executadas quase que simultaneamente, o que pode melhorar o desempenho, especialmente em processadores com múltiplos núcleos.


PROCESSOS X THREADS

| Aspecto           | Processo                                        | Thread                                         |
| ----------------- | ----------------------------------------------- | ---------------------------------------------- |
| **Definição**     | Programa em execução com recursos próprios      | Fluxo de execução dentro de um processo        |
| **Memória**       | Espaço de memória isolado e exclusivo           | Compartilha a memória do processo pai          |
| **Criação**       | Criação mais lenta e custosa em recursos        | Criação rápida e leve                          |
| **Comunicação**   | Comunicação mais complexa (ex.: pipes, sockets) | Comunicação simples via memória compartilhada  |
| **Independência** | Totalmente independente de outros processos     | Dependente do processo e das outras threads    |
| **Falhas**        | Falha em um processo não afeta outros processos | Falha em uma thread pode derrubar o processo   |
| **Uso comum**     | Executar programas distintos                    | Executar tarefas simultâneas no mesmo programa |



-> PROCESSOS EM SISTEMAS DISTRIBUIDOS

Um processo em um sistema distribuído é uma instância de um programa que roda em uma máquina independente. Esses processos cooperam entre si via rede, formando um sistema distribuído funcional. A comunicação entre eles se dá por meio de protocolos como: RCP, HTTP/REST, Mensageria.
Exemplo de uso: microserviços.

-> THREADS EM SISTEMAS DISTRIBUIDOS

Uma thread é uma unidade de execução leve dentro de um processo. Elas compartilham os recursos do processo (como memória) e são usadas para paralelismo local, ou seja, dentro de uma mesma máquina.
Exemplo de uso: Servidor de banco de dados, servidor web.
