# Projeto Cadastro de Usuários com Java Swing

Este é um projeto simples desenvolvido em Java, utilizando a biblioteca Swing para criar uma interface gráfica que permite o cadastro de usuários. O objetivo principal é praticar conceitos de desenvolvimento de interfaces gráficas, validação de entrada de dados e manipulação de arquivos.

---

## Funcionalidades

- Interface gráfica para interação com o usuário.
- Campos de entrada para:
  - **Nome** (somente letras).
  - **E-mail** (validado no formato "teste@teste.com").
- Checkbox para aceitar os termos.
- Botões:
  - **Salvar**: Cadastra o usuário e salva os dados em um arquivo de texto.
  - **Limpar**: Limpa todos os campos preenchidos.
- Mensagens de erro e validação para auxiliar o usuário.
- Exibição dos dados cadastrados em uma área de texto.
- Salva as informações do usuário em um arquivo de texto chamado `usuarios.txt` no diretório do projeto.

---

## Tecnologias Utilizadas

- **Java SE 17**
- **Swing**: Para construção da interface gráfica.
- **I/O Streams**: Para manipulação de arquivos (BufferedWriter e FileWriter).

---

## Validações Implementadas

1. **Nome**:
   - Apenas letras são permitidas (acentos e espaços incluídos).
   - Mensagem de erro exibida caso o usuário insira caracteres inválidos.

2. **E-mail**:
   - Validação usando expressão regular para o formato `usuario@dominio.com`.
   - Mensagem de erro exibida caso o formato não seja seguido.

3. **Aceitação dos Termos**:
   - É obrigatório marcar a caixa de seleção para concluir o cadastro.

---

## Estrutura do Arquivo `usuarios.txt`

Os dados dos usuários são salvos no formato:

```
Nome: Victor, E-mail: victor@teste.com
Nome: João, E-mail: joao@teste.com
```
- Cada linha representa um usuário cadastrado.
- O arquivo é atualizado a cada novo cadastro.

---

## Como Executar o Projeto

1. Certifique-se de que você possui o **Java 17** ou superior instalado.
2. Compile o projeto:
   ```bash
   javac UserRegistrationApp.java
   ```
3. Execute o projeto:
   ```bash
   java UserRegistrationApp
   ```
4. Interaja com a interface:
   - Preencha os campos.
   - Clique em "Salvar" para cadastrar o usuário.
   - Clique em "Limpar" para reiniciar o formulário.

---

## Melhorias Futuras

- Adicionar suporte para salvar dados em formatos estruturados (JSON ou CSV).
- Melhorar o layout utilizando bibliotecas como **JavaFX** ou frameworks externos.
- Implementar a funcionalidade de carregar os dados salvos ao iniciar o programa.
- Internacionalização (i18n) para suporte a múltiplos idiomas.

---

## Autor

**Victor da Costa Almada**
- Estudante de Análise e Desenvolvimento de Sistemas
- Apaixonado por tecnologia e desenvolvimento de software

Se você gostou deste projeto ou tem sugestões, fique à vontade para contribuir ou deixar um feedback!

---

**Obrigado por conferir este projeto!**

