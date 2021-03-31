# Design Patterns
Estudando alguns padrões de projeto com Java.

Os design patterns possuem 3 categorias distintas:
- Criacionais (Factory Method, Prototype, Abstract Factory, Builder, Singleton)
- Estruturais (Adapter, Decorator, Composite, Facade, Proxy, Bridge, Flyweight)
- Comportamentais (Chain of Responsibility, Command, Iterator, Mediator, Memento, Observer, State, Strategy, Template Method, Visitor)


## Strategy
Este padrão pode ser utilizado quando há diversos possíveis algoritmos para uma ação (como calcular imposto, por exemplo). 
Nele, nós separamos cada um dos possíveis algoritmos em classes separadas.

**Exemplo**: Imagine que você tenha diferentes modelos de guitarra e você precise fazer um super show, você pode escolher uma das
estratégias dependendo coisas como o som que você quer passar naquele momento(mais agudo, mais grave), independente de qual você
escolher, voce irá conseguir tocar.

**Foto para exemplificar em outro contexto**:

<img src="https://refactoring.guru/images/patterns/diagrams/strategy/solution.png"/>

Link referência: https://refactoring.guru/design-patterns/strategy


## Chain of Responsibility
Este padrão tende a passar solicitações ao longo de uma cadeia. Ao receber uma solicitação, cada manipulador decide
processar a solicitação ou passá-la para o próximo manipulador na cadeia.

**Exemplo**: Quando você liga em algum provedor de internet, primeiro você é atendido por um bot que tenta resolver seu problema(nivel 1),
caso você nao consiga, ele te passa para um atendente(nivel 2), caso o atendente não consiga, ele te passa para um gerente(nivel 3),
caso você não consiga ele te passa para um técnico(nivel 4), formando assim essa cadeia de responsabilidades.

**Foto para exemplificar em outro contexto**:

<img src="https://refactoring.guru/images/patterns/diagrams/chain-of-responsibility/example-en.png"/>

Link referência: https://refactoring.guru/design-patterns/chain-of-responsibility


## Template Method
Este padrão sugere que você divida um algoritmo em uma série de etapas, transforme essas etapas em métodos e coloque uma série de chamadas para esses métodos dentro de um único método de modelo. As etapas podem ser abstratos ou ter alguma implementação padrão. Para usar o algoritmo, o cliente deve fornecer sua própria subclasse, implementar todas as etapas abstratas e substituir algumas das opcionais, se necessário (mas não o método do modelo em si).

**Exemplo**: Quando você tem um processo em que os passos a serem executados é o mesmo, porém algum detalhe é diferente. Por exemplo, em algum jogo de RPG, você tem varios tipos de armas e todas possuem uma quantidade de dano ao atacar, porem esse dano é diferente para cada uma dessas armas.

**Foto para exemplificar em outro contexto**:

<img src="https://refactoring.guru/images/patterns/diagrams/template-method/structure-indexed.png"/>

Link referência: https://refactoring.guru/design-patterns/template-method


## State
Este padrão para fazer a transição do contexto para outro estado, substitua o objeto de estado ativo por outro objeto que representa esse novo estado. Isso só é possível se todas as classes de estado seguirem a mesma interface e o próprio contexto funcionar com esses objetos por meio dessa interface.

**Exemplo**: Quando você tem uma catraca simples, que ela possui dois estados, aberto e fechado. Ao colocar o cartão e o pagamento estar aprovado, você passa pro estado ABERTO, após entrar ela volta para o FECHADO.

**Foto para exemplificar em outro contexto**:

<img src="https://refactoring.guru/images/patterns/diagrams/state/example.png"/>

Link referência: https://refactoring.guru/design-patterns/state

## Command
O Padrão Command tem como definição encapsular uma solicitação como um objeto, o que lhe permite parametrizar outros objetos com diferentes solicitações, enfileirar ou registrar solicitações e implementar recursos de cancelamento de operações.

**Exemplo**: Quando você tem um controle remoto, que possui diferentes botões mas ao pressionar os botões executam alguma ação.

**Foto para exemplificar em outro contexto**:

<img src="https://refactoring.guru/images/patterns/diagrams/command/structure.png"/>

Link referência: https://refactoring.guru/design-patterns/command

## Adapter
A ideia do adapter, é trazer o controle de nosso codigo atraves de interfaces que comuniquem com o mundo externo, fazendo que nosso codigo dependa de abstrações e não de implementações

**Foto para exemplificar em outro contexto**:

<img src="https://refactoring.guru/images/patterns/diagrams/adapter/structure-object-adapter.png?id=33dffbe3aece29416244"/>

Link referência: https://refactoring.guru/design-patterns/adapter
