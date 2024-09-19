# 📌 Desafio Target
> [!IMPORTANT]
> ## Este desafio constitui em 5 questões que serão descritas e respondidas abaixo. 

### Questão 1:
> #### Pergunta
> Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
>
> IMPORTANTE: Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;
> #### Resposta:
> - [Acesso ao repositório da class](https://github.com/wandersonlira/target/blob/main/DesafioTarget/src/br/com/target/desafio/SequenceFibonacci.java)

### Questão 2:
> #### Pergunta
> Escreva um programa que verifique, em uma string, a existência da letra ‘a’, seja maiúscula ou minúscula, além de informar a quantidade de vezes em que ela ocorre.
>
> IMPORTANTE: Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
> #### Resposta:
> - [Acesso ao repositório da class](https://github.com/wandersonlira/target/blob/main/DesafioTarget/src/br/com/target/desafio/VerificaLetrasA.java)

### Questão 3:
> #### Pergunta
> Observe o trecho de código abaixo: int INDICE = 12, SOMA = 0, K = 1; enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; } imprimir(SOMA);
>
> Ao final do processamento, qual será o valor da variável SOMA?
> #### Resposta:
> - [Acesso ao repositório da class](https://github.com/wandersonlira/target/blob/main/DesafioTarget/src/br/com/target/desafio/IndiceSoma.java)

### Questão 4:
> #### Pergunta
> Descubra a lógica e complete o próximo elemento:
> #### Resolução
> a. 1, 3, 5, 7, <9> - `Essa é uma sequência de números ímpares`
>
> b. 2, 4, 8, 16, 32, 64, <128> - `Essa é uma sequência de potências de 2`
>
> c. 0, 1, 4, 9, 16, 25, 36, <49> - `Essa é uma sequência de quadrados perfeitos`
>
> d. 4, 16, 36, 64, <100> - `2², 4², 6², 8², 10²`
>
> e. 1, 1, 2, 3, 5, 8, <13> - `Essa é a sequência de Fibonacci, onde cada número é a soma dos dois anteriores`
>
> f. 2,10, 12, 16, 17, 18, 19, <20> - `Após pequenos incrementos o próximo número que faz sentido para completar a sequência é 20.`


### Questão 5: 
> #### Pergunta:
> Você está em uma sala com três interruptores, cada um conectado a uma lâmpada em salas diferentes. Você não pode ver as lâmpadas da sala em que está, mas pode ligar e desligar os interruptores quantas vezes quiser. Seu objetivo é descobrir qual interruptor controla qual lâmpada. Como você faria para descobrir, usando apenas duas idas até uma das salas das lâmpadas, qual interruptor controla cada lâmpada?  
> 
> #### Resposta: 
> 1. Ligo o primeiro interruptor (Interruptor A) e deixe ligado por alguns minutos.
> 2. Após esses alguns minutos, desligo o Interruptor A e ligo o segundo interruptor (Interruptor B).
>
> Quando eu chegar nas salas, verifico o seguinte:
>
> - Se a lâmpada estiver acesa, ela é controlada pelo Interruptor B.
> - Se a lâmpada estiver apagada, mas quente ao toque, ela é controlada pelo Interruptor A.
> - Se a lâmpada estiver apagada e fria, ela é controlada pelo terceiro interruptor (Interruptor C), que nunca foi ligado.