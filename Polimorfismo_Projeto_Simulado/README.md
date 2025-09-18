# Polimorfismo em Java

Este projeto foi desenvolvido para demonstrar na prática o conceito de **Polimorfismo** na Programação Orientada a Objetos (POO) em Java.  
Ele simula um sistema de questões que pode tratar diferentes tipos de perguntas de maneira uniforme, utilizando a mesma lógica para cada uma delas.

---

## O Que É Polimorfismo?

**Polimorfismo**, que significa *"muitas formas"*, é um dos pilares da POO.  
Ele permite que uma **referência de uma superclasse** assuma a forma de **qualquer uma de suas subclasses**.  
Para que isso funcione, é essencial que os seguintes requisitos sejam atendidos:

- **Herança:** Deve haver uma hierarquia de classes, onde classes filhas herdam de uma classe pai.
- **Sobrescrita de Métodos (`@Override`):** As classes filhas precisam sobrescrever métodos da superclasse para fornecer sua própria implementação.  
  Isso garante que, mesmo que a chamada seja para o mesmo método, o comportamento seja diferente em cada objeto.

> 💡 **Vantagem:**  
> O polimorfismo permite escrever um código **mais limpo e genérico**, que se adapta a comportamentos específicos em **tempo de execução**.

---

## Conceitos de POO Utilizados

- **Classe:** Usada como modelo para criar objetos `Questao`, `QuestaoComDica` e `QuestaoMultiplaEscolha`.
- **Herança:** `QuestaoComDica` e `QuestaoMultiplaEscolha` herdam de `Questao`, reaproveitando atributos e métodos.
- **Sobrescrita de Métodos (`@Override`):**  
  O método `aplicarQuestao()` é sobrescrito nas subclasses para personalizar a exibição das perguntas.
- **Polimorfismo:**  
  A classe `Simulado` trata objetos de diferentes tipos (`Questao`, `QuestaoComDica`, `QuestaoMultiplaEscolha`) como se fossem todos do tipo `Questao`, permitindo que o mesmo código aplique diferentes comportamentos.

---

## Tecnologias e Ferramentas

- **Java**
- **IntelliJ IDEA**
- **Git e GitHub** para versionamento de código

---

## Estrutura do Projeto

- **Simulado.java**  
  Contém o método `main`, onde a execução do programa ocorre.  
  É a classe onde o polimorfismo se manifesta, criando e iterando sobre um array de objetos `Questao`, `QuestaoComDica` e `QuestaoMultiplaEscolha`.

- **Questao.java**  
  A superclasse que define o comportamento padrão de uma questão,  
  com atributos para enunciado e resposta, e o método `aplicarQuestao()` padrão.

- **QuestaoComDica.java**  
  Uma subclasse de `Questao` que adiciona um atributo de dica  
  e sobrescreve o método `aplicarQuestao()` para exibir essa informação.

- **QuestaoMultiplaEscolha.java**  
  Outra subclasse de `Questao` que adiciona atributos para as alternativas de **A a D**  
  e sobrescreve `aplicarQuestao()` para listar as opções.

---

## Polimorfismo em Ação: A Classe Simulado

No método `main` da classe **Simulado**, a "mágica" do polimorfismo acontece:

- O array `questoes` é declarado como `Questao[]`, mas armazena objetos de suas subclasses.
- Durante a execução do loop `for`, o **Despacho Dinâmico** do Java decide qual versão do método `aplicarQuestao()` deve ser chamada para cada objeto.

Exemplo do que ocorre em tempo de execução:

- Se o objeto é uma `Questao`, é chamado o método de `Questao`.
- Se o objeto é uma `QuestaoComDica`, é chamado o método sobrescrito de `QuestaoComDica`, exibindo a dica.
- Se o objeto é uma `QuestaoMultiplaEscolha`, é chamado o método sobrescrito de `QuestaoMultiplaEscolha`, exibindo as alternativas.

> 🔑 **Benefício:**  
> Esse comportamento demonstra como o polimorfismo simplifica a manipulação de diferentes tipos de objetos com **uma única linha de código**,  
> tornando o sistema **escalável** e **de fácil manutenção**.

---

## Documentação Complementar

Para um estudo mais detalhado sobre os conceitos de **Polimorfismo** e exemplos adicionais, acesse o documento completo no Notion:  
[Documentação de Polimorfismo no Notion](https://www.notion.so/Polimorfismo_Projeto_Simulado-272f4d816bcb80dda361c8aa5f19a1a8?source=copy_link)
