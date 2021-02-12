# Design Patterns
Estudando alguns padrões de projeto com Java.


## Strategy
Este padrão pode ser utilizado quando há diversos possíveis algoritmos para uma ação (como calcular imposto, por exemplo). 
Nele, nós separamos cada um dos possíveis algoritmos em classes separadas.

Exemplo: Imagine que você tenha diferentes modelos de guitarra e você precise fazer um super show, você pode escolher uma das
estratégias dependendo coisas como o som que você quer passar naquele momento(mais agudo, mais grave), independente de qual você
escolher, voce irá conseguir tocar.

<img src="https://refactoring.guru/images/patterns/diagrams/strategy/solution.png"/>

Link referência: https://refactoring.guru/design-patterns/strategy


## Chain of Responsibility
Este padrão tende a passar solicitações ao longo de uma cadeia. Ao receber uma solicitação, cada manipulador decide
processar a solicitação ou passá-la para o próximo manipulador na cadeia.

Exemplo: Quando você liga em algum provedor de internet, primeiro você é atendido por um bot que tenta resolver seu problema(nivel 1),
caso você nao consiga, ele te passa para um atendente(nivel 2), caso o atendente não consiga, ele te passa para um gerente(nivel 3),
caso você não consiga ele te passa para um técnico(nivel 4), formando assim essa cadeia de responsabilidades.


<img src="https://refactoring.guru/images/patterns/diagrams/chain-of-responsibility/example-en.png"/>

Link referência: https://refactoring.guru/design-patterns/chain-of-responsibility
