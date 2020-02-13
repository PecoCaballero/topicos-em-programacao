# Tópicos em Programação

## Estratégias de testes
* **Teste de partição:** identificar grupos de entradas que possuem características comuns e devem ser processados da mesma maneira.
  * Você deve escolher testes dentro de cada um desses grupos.
* **Teste baseado em diretrizes:** usa-se diretrizes de teste para escolher casos de teste.
  * Essas diretrizes refletem a experiência anterior dos tipos de erros que os programadores geralmente cometem ao desenvolver componentes


### Teste de interface
* Os objetivos são detectar falhas devido a erros de interface ou suposições inválidas sobre interfaces.
* Tipos de interface:
  * **Interfaces de parâmetro:** Dados transmitidos de um metódo ou procedimento para outro
  * **Interfaces de memória compartilhada:** o bloco de memória é compartilhado entre procedimentos ou funções
  * **Interfaces de procedimento:**
  * **Falta esse:**

#### Erros de interface (comuns)
* Uso indevido de interface
* Erros de tempo

#### Diretrizes para testes de interface
* Projete testes para que os parâmetros de um procedimento chamado estejam nos extremos de seus intervalos
* Sempre teste os parâmetros do ponteiro com ponteiros nulos.
* Teste de design que causam falha no componente.
* Use teste de estresse em sistemas de passagem de mensagem.
* Nos sistemas de memória compartilhada, varie a ordem em que os componentes são ativados.

