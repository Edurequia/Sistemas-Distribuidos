**Problemas comuns em Threads:**

- Sincronização de threads:
    Em aplicações que usam múltiplas threads, podem surgir problemas de concorrência quando várias threads acessam recursos compartilhados ao mesmo tempo. 
- Escalonamento de threads:
    O escalonamento de threads pode afetar o desempenho da aplicação, especialmente quando há muitas threads em execução. 
-  Erros intermitentes:
    Problemas relacionados à concorrência podem ser difíceis de detectar e reproduzir, causando erros intermitentes. 

Exemplos de problemas:
- Problema de corrida:
    Duas threads acessam a mesma variável ao mesmo tempo, causando resultados inesperados. 
-  Deadlock:
    Duas ou mais threads ficam esperando indefinidamente por recursos que estão sendo mantidos por outras threads. 
- Desempenho abaixo do ideal:
    O uso excessivo de threads pode reduzir o desempenho da aplicação, devido ao tempo gasto no escalonamento. 
