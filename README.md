# Projeto API de Games - Intensivão Spring

Este projeto foi desenvolvido durante o evento **Intensivão Spring**, oferecido pelo professor **Nélio Alves** na plataforma **Dev Superior**. O objetivo foi construir uma API de games com funcionalidades básicas, explorando conceitos importantes do framework Spring ao longo de cinco aulas.

---

## Cronograma do Evento (Inicio: 20/01/2025)  I

| Dia            | Horário | Conteúdo                   |
|----------------|---------|----------------------------|
| **Segunda-feira** | 9h      | Aula 1: Projeto estruturado |
| **Terça-feira**   | 9h      | Aula 2: Domínio e consultas |
| **Quarta-feira**  | 9h      | Aula 3: Homologação e CORS |
| **Quinta-feira**  | 9h      | Aula 4: Endpoint especial  |
| **Sexta-feira**   | 9h      | Aula 5: Resumão e reforço do aprendizado |

---

## Funcionalidades da API

A API possui 5 endpoints principais para manipulação e consulta de dados sobre games e listas de jogos.

### 1. **GET /games**

Retorna todos os jogos cadastrados com os seguintes atributos:

- `id`
- `title`
- `year`
- `imgUrl`
- `shortDescription`

---

### 2. **GET /games/:id**

Retorna o jogo correspondente ao `id` fornecido com os seguintes atributos:

- `id`
- `title`
- `year`
- `genre`
- `platforms`
- `score`
- `imgUrl`
- `shortDescription`
- `longDescription`

---

### 3. **GET /gamesList**

Retorna uma lista dos tipos de jogos com os seguintes atributos:

- `id`
- `name`

---

### 4. **GET /gamesList/:id/games**

Retorna todos os jogos associados ao tipo de jogo especificado pelo `id` do tipo. Os atributos retornados são:

- `id`
- `title`
- `year`
- `imgUrl`
- `shortDescription`

---

### 5. **POST /gamesList/:id/replacement**

Altera a posição de um jogo dentro de uma lista de jogos baseada no tipo especificado pelo `id` na URL. O corpo da requisição deve seguir o seguinte formato:

```json
{
    "sourceIndex": 3,
    "destinationIndex": 1
}
```

---

## Tecnologias Utilizadas

- **Java**
- **Spring Boot**
- **H2 Database**
- **Postman** para testes de API

---

## Como Executar o Projeto

1. Clone o repositório:
   ```bash
   git clone <URL_DO_REPOSITORIO>
   ```

2. Entre no diretório do projeto:
   ```bash
   cd <DIRETORIO_DO_PROJETO>
   ```

3. Execute o projeto via Maven ou sua IDE preferida.

4. Acesse a documentação dos endpoints usando uma ferramenta como Postman ou seu navegador.

---

## Autor

Projeto desenvolvido por **Andrey**, durante o evento **Intensivão Spring** oferecido por **Nélio Alves** na plataforma **Dev Superior**.
