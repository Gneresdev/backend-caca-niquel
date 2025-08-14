# backend-caca-niquel
# ⚙️ Caça-Níquel Full-Stack (Backend)

Este é o backend da aplicação de caça-níquel, desenvolvido em Java. Ele funciona como uma API REST simples que gerencia toda a lógica do jogo, desde o sorteio dos símbolos até o cálculo dos prêmios, fornecendo os resultados em formato JSON para qualquer cliente que o consuma.

## ✨ Features

- **API REST:** Expõe um endpoint `/girar` para simular uma rodada do jogo.
- **Lógica de Jogo:** Calcula vitórias para múltiplas linhas de pagamento (3 linhas horizontais).
- **Cálculo de Prêmios:** Lógica implementada para combinações de 2 (par) e 3 (jackpot) símbolos, da esquerda para a direita.
- **Resposta em JSON:** Serializa os resultados do jogo para o formato JSON para fácil consumo por clientes web.
- **Configuração de CORS:** Habilitado para permitir requisições de origens diferentes (como um frontend rodando localmente ou na web).

## 💻 Tecnologias Utilizadas

- **Java:** Linguagem principal da aplicação.
- **Maven:** Gerenciamento de dependências do projeto.
- **SparkJava:** Micro-framework web para criar o servidor e as rotas da API de forma rápida e leve.
- **Gson:** Biblioteca do Google para serializar e desserializar objetos Java para JSON.

## 🚀 Como Rodar

1. Clone este repositório.
2. Garanta que você tenha o **JDK 11** (ou superior) e o **Maven** instalados.
3. Abra o projeto em uma IDE como o IntelliJ IDEA ou Eclipse. O Maven irá baixar as dependências automaticamente.
4. Execute o método `main` na classe `Application.java`.
5. O servidor estará rodando em `http://localhost:4567`. Você pode testar o endpoint acessando `http://localhost:4567/girar` em seu navegador.

## 🧠 O Que Eu Aprendi

Desenvolver este backend foi uma experiência prática valiosa sobre os fundamentos da criação de APIs em Java:

- **Criação de Servidores Web:** Como usar o SparkJava para levantar um servidor e definir rotas HTTP (`get`, `post`, etc.) de forma simples.
- **Gerenciamento de Dependências:** A importância do Maven e do arquivo `pom.xml` para gerenciar bibliotecas externas como Spark e Gson, automatizando o build do projeto.
- **Padrão REST e JSON:** Como estruturar uma API no padrão REST e a importância do JSON como "língua universal" para a comunicação entre cliente e servidor.
- **Arquitetura e Refatoração:** A importância da Separação de Responsabilidades. Refatorei o código de um único arquivo `main` para uma estrutura Orientada a Objetos, com classes distintas para a Aplicação, o Controlador, a Lógica do Jogo e os Modelos de Dados (`GameResult`), tornando o código mais limpo, testável e escalável.
- **CORS:** Entendi na prática por que o Cross-Origin Resource Sharing é essencial e como configurá-lo no backend para permitir a comunicação com o frontend.

---
Distribuído sob a licença MIT. Veja `LICENSE` para mais informações.
