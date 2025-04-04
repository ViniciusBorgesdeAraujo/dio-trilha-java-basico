
# 💻 Desafio: Controle de Fluxo em Java

Este projeto foi desenvolvido como parte da **formação Java Básico** da [DIO](https://www.dio.me/). O desafio consistia em aplicar os conceitos de controle de fluxo utilizando **tratamento de exceções personalizadas** em Java.

---

## 📌 Descrição do Projeto

A aplicação solicita dois valores inteiros no terminal:

1. **Primeiro parâmetro** – valor inicial da contagem  
2. **Segundo parâmetro** – valor final da contagem

### ✅ Regras:
- O segundo número **deve ser maior** que o primeiro.
- Caso contrário, é lançada uma **exceção personalizada**: `ParametrosInvalidosException`.
- Quando os parâmetros são válidos, o sistema realiza a contagem do intervalo entre eles.

---

## 📂 Estrutura de Arquivos


desafio-controle-fluxo/
├── src/
│   ├── Contador.java
│   └── ParametrosInvalidosException.java


---

## ⚙️ Como Executar

1. Clone o repositório:

bash
git clone https://github.com/ViniciusBorgesdeAraujo/dio-trilha-java-basico.git

2. Navegue até a pasta do projeto:

```bash
cd dio-trilha-java-basico/desafio-controle-fluxo
```

3. Compile os arquivos Java:

```bash
javac src/*.java
```

4. Execute o programa:

```bash
java -cp src Contador
```

---

## 🧠 Conceitos Aplicados

- Estrutura de repetição (`for`)
- Entrada de dados via `Scanner`
- Tratamento de exceções (`try`, `catch`, `throw`)
- Criação de exceções personalizadas
- Organização de código orientado a objetos

---

## 🧪 Exemplo de Execução

```bash
Digite o primeiro parâmetro:
3
Digite o segundo parâmetro:
7
Imprimindo a contagem:
1
2
3
4
```

❌ Caso o segundo parâmetro seja menor:

```bash
Digite o primeiro parâmetro:
8
Digite o segundo parâmetro:
2
O segundo parâmetro deve ser maior que o primeiro.
```

---

---

✨ Projeto feito com dedicação para consolidar os conhecimentos em **Java Básico**.
