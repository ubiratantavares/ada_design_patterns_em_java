# Plataforma Online: ADA

## Curso: Design Patterns em Java

### 1. Apresentação

#### 1.1 O que são?

São padrões de projetos que, foram criados para solucionar problemas recorrentes da programação orientada a objetos.

Esses padrões não são meros trechos de código, mas sim conceitos complexos que combinam estratégias para resolver
um problema existente.

#### 1.2 Para que servem?

Usados para solucionar problemas comuns que costumamos enfrentar no dia a dia.

#### 1.3 Tipos de padrões

Atualmente, temos 23 padrões catalogados. Eles estão divididos em:

**Creational (Criacionais)**: trata da criação de objetos.
**Structural (Estruturais)**: relação entre os objetos e como eles interagem entre si (composição, por exemplo).
**Behavioral (Comportamentais)** comunicação entre os objetos, em termos de responsabilidades e algoritmos. Chamadas
métodos.

### 2. Builder

#### 2.1 Quem utiliza o padrão Builder?

* Desenvolvedores de _‘software’_ que precisam criar objetos complexos que requerem várias etapas de construção.

* Arquitetos de _‘software’_ que desejam separar a construção de objetos da sua representação para promover a
modularidade e a flexibilidade do código.

#### 2.2 O que é o padrão Builder?

* O padrão Builder é um padrão de _‘design’_ criacional que separa a construção de um objeto complexo da sua representação,
permitindo que o mesmo processo de construção possa criar diferentes representações. O Builder encapsula a construção
do objeto numa série de métodos configuráveis e só retorna o objeto finalizado quando todos os passos necessários
foram completados.

#### 2.3 Onde o padrão Builder é utilizado?

* No código-fonte de aplicações** que precisam instanciar objetos complexos de maneira flexível e configurável.

* Em sistemas de _‘software’_ onde a construção de objetos envolve várias etapas ou parâmetros opcionais.

* Em bibliotecas e _‘frameworks’_ que fornecem APIs para construção de objetos complexos.

#### 2.4 Quando utilizar o padrão Builder?

* Quando a construção de um objeto envolve várias etapas ou opções configuráveis.

* Quando há muitos parâmetros no construtor de um objeto, o que pode tornar a chamada do construtor confusa e
propensa a erros.

* Quando você deseja criar objetos imutáveis, configurando todas as propriedades antes de criar a instância final.

* Quando você deseja que a construção de objetos seja mais legível e mantenha um código organizado.

#### 2.5 Por que utilizar o padrão Builder?

* Legibilidade: Facilita a criação de objetos complexos de maneira clara e organizada.

* Flexibilidade: Permite a criação de diferentes representações do mesmo objeto de forma modular.

* Manutenibilidade: Separa a lógica de construção do objeto da sua representação, tornando o código mais fácil
de manter e estender.

* Segurança: Reduz o risco de erros ao evitar a passagem de múltiplos parâmetros no construtor de maneira
desorganizada.

#### 2.6 Como funciona o padrão Builder?

* Definição da Classe do Produto: A classe do objeto que será construído. 

* Definição do _Builder_: Uma classe separada ou uma classe interna com métodos para configurar cada aspecto do objeto.

* Métodos de configuração: Métodos que configuram partes do objeto e retornam o builder para permitir
encadeamento.

* Método de construção (`build`): Um método que cria e retorna a instância final do objeto com base
nas configurações acumuladas. 

* Utilização do Builder: O cliente usa o builder para configurar o objeto passo a passo e, finalmente,
chama `build` para obter o objeto construído.

#### 2.7 Quanto custa usar o padrão Builder?

* Custo de implementação: Pode haver um aumento inicial na complexidade do código devido à definição da classe
Builder, mas o custo é justificado pelo aumento da clareza e flexibilidade.

* Custo de manutenção: Geralmente reduzido, pois o padrão Builder torna o código mais modular e fácil de entender.

* Custo de desempenho: Normalmente negligenciável, mas pode haver uma pequena sobrecarga devido à criação
de objetos intermediários durante o processo de construção.

NOTA: O padrão Builder é uma ferramenta poderosa para construir objetos complexos de maneira clara e modular.
Utilizando o método 5W2H, podemos entender profundamente, seu propósito, aplicação e benefícios,
tornando-o uma escolha estratégica em projetos de _‘software’_ que exigem flexibilidade e manutenção simplificada.

### 3. Factory Method

#### 3.1 Quem utiliza o padrão Factory Method?

* Desenvolvedores de _‘software’_ que precisam criar objetos sem especificar a classe exata do objeto que será criado.

* Arquitetos de _‘software’_ que desejam delegar a responsabilidade da criação de objetos para subclasses.

#### 3.2 O que é o padrão Factory Method?

* O padrão Factory Method é um padrão de _‘design’_ criacional que define uma interface para criar um objeto, 
mas permite que as subclasses decidam qual classe instanciar. O Factory Method permite que uma classe delegue a 
responsabilidade de criação para subclasses, promovendo a flexibilidade e extensibilidade do código.

#### 3.3 Onde o padrão Factory Method é utilizado?

* Em frameworks e bibliotecas que fornecem uma interface para criar objetos sem especificar a classe concreta.

* Em aplicações que precisam instanciar objetos de várias classes derivadas sem alterar o código que usa essas classes.

* Em sistemas onde a criação de objetos envolve lógica complexa que pode variar entre diferentes tipos de objetos.

#### 3.4 Quando utilizar o padrão Factory Method?

* Quando uma classe não pode antecipar a classe de objetos que deve criar.

* Quando uma classe deseja delegar a responsabilidade de criação de objetos para subclasses.

* Quando a criação de objetos envolve lógica que deve ser encapsulada dentro das subclasses.

* Quando você deseja fornecer um ponto de extensão no código, permitindo que novos tipos de objetos sejam adicionados 
sem modificar o código existente.

#### 3.5 Por que utilizar o padrão Factory Method?

* Flexibilidade: Permite que subclasses escolham o tipo de objeto a ser criado, promovendo a extensibilidade do código.

* Modularidade: Separa a criação de objetos da sua utilização, tornando o código mais modular e fácil de manter.

* Coesão: Centraliza a lógica de criação em um único local, facilitando a manutenção e evolução do código.

* Redução de Acoplamento: Diminui a dependência direta entre classes, promovendo um design mais desacoplado e flexível.

#### 3.6 Como funciona o padrão Factory Method?

* Definição da Interface do Produto: Define a interface ou classe base para os objetos que serão criados.

* Definição do Factory Method: Uma interface ou classe base com um método abstrato que retorna objetos do tipo produto.

* Implementação das Subclasses: Subclasses implementam o Factory Method para criar instâncias de classes concretas.

* Utilização do Factory Method: O cliente chama o Factory Method em vez de instanciar objetos diretamente, permitindo 
que subclasses decidam qual classe concreta será instanciada.

#### 3.7 Quanto custa usar o padrão Factory Method?

* Custo de implementação: Pode aumentar a complexidade inicial do código devido à necessidade de definir interfaces e 
subclasses, mas esse custo é compensado pela flexibilidade e extensibilidade obtidas.

* Custo de manutenção: Geralmente reduzido, pois o padrão Factory Method promove um design modular e de fácil manutenção.

* Custo de desempenho: Normalmente negligenciável, mas pode haver uma ligeira sobrecarga devido à delegação de 
responsabilidades e criação de objetos através de métodos de fábrica.

NOTA: O padrão Factory Method é uma ferramenta valiosa para criar objetos de maneira flexível e extensível. 
Utilizando o método 5W2H, podemos entender profundamente seu propósito, aplicação e benefícios, tornando-o uma escolha 
estratégica em projetos de _‘software’_ que exigem desacoplamento e facilidade de manutenção.