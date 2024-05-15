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

**Quem utiliza o padrão Builder?**

- **Desenvolvedores de _software_** que precisam criar objetos complexos que requerem várias etapas de construção.
- **Arquitetos de _software_** que desejam separar a construção de objetos da sua representação para promover a
modularidade e a flexibilidade do código.

**O que é o padrão Builder?**

O padrão Builder é um padrão de _design_ criacional que separa a construção de um objeto complexo da sua representação,
permitindo que o mesmo processo de construção possa criar diferentes representações. O Builder encapsula a construção
do objeto numa série de métodos configuráveis e só retorna o objeto finalizado quando todos os passos necessários
foram completados.

**Onde o padrão Builder é utilizado?**

- **No código-fonte de aplicações** que precisam instanciar objetos complexos de maneira flexível e configurável.
- **Em sistemas de _software_** onde a construção de objetos envolve várias etapas ou parâmetros opcionais.
- **Em bibliotecas e _frameworks_** que fornecem APIs para construção de objetos complexos.

**Quando utilizar o padrão Builder?**

- Quando a construção de um objeto envolve várias etapas ou opções configuráveis.
- Quando há muitos parâmetros no construtor de um objeto, o que pode tornar a chamada do construtor confusa e
propensa a erros.
- Quando você deseja criar objetos imutáveis, configurando todas as propriedades antes de criar a instância final.
- Quando você deseja que a construção de objetos seja mais legível e mantenha um código organizado.

**Por que utilizar o padrão Builder?**

- **Legibilidade**: Facilita a criação de objetos complexos de maneira clara e organizada.
- **Flexibilidade**: Permite a criação de diferentes representações do mesmo objeto de forma modular.
- **Manutenibilidade**: Separa a lógica de construção do objeto da sua representação, tornando o código mais fácil
de manter e estender.
- **Segurança**: Reduz o risco de erros ao evitar a passagem de múltiplos parâmetros no construtor de maneira
desorganizada.

**Como funciona o padrão Builder?**

1. **Definição da Classe do Produto**: A classe do objeto que será construído.
2. **Definição do _Builder_**: Uma classe separada ou uma classe interna com métodos para configurar cada aspecto
do objeto.
    - **Métodos de configuração**: Métodos que configuram partes do objeto e retornam o builder para permitir
encadeamento.
    - **Método de construção (`build`)**: Um método que cria e retorna a instância final do objeto com base
nas configurações acumuladas.
3. **Utilização do Builder**: O cliente usa o builder para configurar o objeto passo a passo e, finalmente,
chama `build` para obter o objeto construído.

**Quanto custa usar o padrão Builder?**

- **Custo de implementação**: Pode haver um aumento inicial na complexidade do código devido à definição da classe
Builder, mas o custo é justificado pelo aumento da clareza e flexibilidade.
- **Custo de manutenção**: Geralmente reduzido, pois o padrão Builder torna o código mais modular e fácil de entender.
- **Custo de desempenho**: Normalmente negligenciável, mas pode haver uma pequena sobrecarga devido à criação
de objetos intermediários durante o processo de construção.

O padrão Builder é uma ferramenta poderosa para construir objetos complexos de maneira clara e modular.
Utilizando o método 5W2H, podemos entender profundamente, seu propósito, aplicação e benefícios,
tornando-o uma escolha estratégica em projetos de _software_ que exigem flexibilidade e manutenção simplificada.
