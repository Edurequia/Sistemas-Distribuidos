ThreadPool é um gerenciador de threads, ele faz a reutilização de threads e paraleliza as execuções de tarefas, mantendo múltiplas threads abertas apenas aguardando que tarefas sejam alocadas para execução. Dessa forma, o desempenho da aplicação é aumentada e alatência diminuída, pois os custos de abertura e exclusão das threads são únicos.

Problema:
- Se não fizer com cuidado e cautela usando um número muito grande de threads, acaba consumindo totalmente os recursos da máquina.
