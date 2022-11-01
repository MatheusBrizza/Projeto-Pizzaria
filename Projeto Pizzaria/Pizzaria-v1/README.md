Exercício avaliativo 03

- 1 - O que é clean code?

Clean code é uma filosofia que ensina técnicas e padrões
ensinados para facilitar tanto a escrita quanto a leitura
de um código.

- 2 - Pontos positivos do Clean code?

Alguns pontos positivos da aplicação do Clean code são:

2a - A padronização dos códigos: apesar de cada pessoa ter sua
maneira de codificar, para que não haja necessidade da pessoa
estar presente para explicar cada linha feita ou para que outras
pessoas possam trabalhar com tal código feito pelo programador
anterior é usado as técnicas de clean code para que assim haja
um padrão que todos devem seguir para que não aconteça algo
como o exemplo acima.

2b - Um código não-padronizado custa mais: Com códigos escritos
sem seguir os padrões do Clean code levam mais tempo para ser
entendidos e como o ditado diz "tempo é dinheiro" significa que
quanto mais tempo se leva para entender o código, mais custoso o projeto fica.

Um exemplo de um código padronizado seria uma classe seguindo
o modelo de orientação a objeto segue a seguinte ordem:
- Atributos;
- Construtor;
- Getter/Setter;
- Métodos próprios;

Com todos conhecendo tal ordem é rápido de buscar algo, pois
saberá onde procurar e resultará, então, em economia de tempo e
poderá assim focar em partes mais urgentes com o tempo economizado.

2c - Uma vírgula e quebra tudo: Com um código sem o Clean code
normalmente é muito acoplado e muito delicado fazendo com que
o programador "pise em ovos" enquanto tenta modificar esse
código


- 3 - Cite 5 regras de Clean code que te chamou a atenção:

3a - Polimorfismo no lugar de IFs: Regra de não exagerar no uso
de IF e no lugar dela usar a técnica de polimorfismo.

Um exemplo da maneira certa é a classe abstrata Item.java que 
é extendida pelas classes filhas Comida.java e Bebida.java e um
exemplo de mau uso é a classe ItemErrado.java onde no construtor
há dois IF que decidem se o item será uma bebida ou comida.


3B-Seja consistente: Esta regra é que sejamos consistentes,
neste caso com a maneira de nomear os atributos.

No exemplo errado em ItemErrado.java temos cada atributo nomeado
de maneira diferente como inglês com drinkType e tamanho da 
comida com size e portuglês com tipoFood.

3C-Opte por poucos parâmetros: Esse significa focar em criar ou
utilizar métodos com poucos parâmetros.

Um exemplo foi no ExercícioAvaliativo02 quando usei 
LocalDateTime e queria usar o método of, mas desisti por ter
7 parâmetros.
public static LocalDateTime of(int year, Month month, int 
dayOfMonth, int hour, int minute, int second, int nanoOfSecond)


3D-Faça distinções significantes: Evitar inventar nomes para 
variáveis como String strTexto = "Meu texto aqui";


3E-Não use prefixo ou caracteres especiais: Esta regra diz para
fugir de usar caractéres especiais como acentos ou nomear com
prefixos com tipo de variável como:

public int intNumRodas;