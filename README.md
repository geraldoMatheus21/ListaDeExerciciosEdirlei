# 📘 Lista de Exercícios  - Java

Este repositório contém a implementação em Java de exercícios propostos com foco em manipulação de arrays, funções básicas e interações com o usuário. A lista também inclui um mini jogo interativo chamado **"Qual é o filme?"**.

## ✅ Exercícios

### 1. Funções com arrays de inteiros
Implementa as seguintes funções:
- `totalPares(int[] arr)`: retorna a quantidade de números pares no array.
- `maiorValor(int[] arr)`: retorna o maior número no array.
- `totalIguais(int[] arr1, int[] arr2)`: retorna quantos números existem em comum entre os dois arrays.

### 2. Função `valores_entre`
- Recebe um array de inteiros e dois valores: mínimo e máximo.
- Retorna um novo array contendo apenas os elementos entre o mínimo e o máximo.
- Exibe mensagem de erro caso nenhum valor esteja nesse intervalo.

### 3. Função `uniao`
- Recebe dois arrays de inteiros e retorna um novo array com todos os elementos de ambos.
- Exemplo: `uniao({1,2}, {3,4}) -> {1,2,3,4}`

### 4. Jogo "Qual é o filme?"
- Jogador 1 insere o nome de um filme e 5 pistas.
- Jogador 2 tem 5 chances de adivinhar o filme, recebendo uma nova pista a cada erro.
- Pontuação:
  - Acertou na 1ª pista: +100 pontos
  - 2ª pista: +60 pontos
  - 3ª pista: +40 pontos
  - 4ª pista: +20 pontos
  - 5ª pista: +10 pontos
- Funções:
  - `lerPistas(String[] pistas)`
  - `mostrarPistas(String[] pistas, int n)`
  - `comparaFilme(String esperado, String resposta)`

## 📌 Requisitos
- Java 8 ou superior
- IDE ou compilador Java

## 🚀 Como rodar
1. Compile o projeto:
   ```bash
   javac Main.java
