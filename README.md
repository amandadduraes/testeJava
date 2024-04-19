Projeto IMDb API
Bem-vindo ao projeto IMDb API! Este é um projeto desenvolvido para criar uma API RESTful que o site IMDb pode consultar para exibir seu conteúdo. Esta API inclui recursos como cadastro de usuários, cadastro de filmes, votação de filmes, listagem e detalhes de filmes, entre outros.

Funcionalidades Principais
Cadastro de usuários com dois níveis: Usuário e Admin
Login de usuários
Cadastro, edição e exclusão lógica de usuários (desativação)
Cadastro de filmes (apenas para administradores)
Votação de filmes por usuários (de 0 a 4 estrelas)
Listagem de filmes com filtro por diretor, nome, gênero e/ou atores
Detalhes de filmes, incluindo a média dos votos dos usuários
Tecnologias Utilizadas
Java (backend)
Spring Boot (framework Java)
PostgreSQL (banco de dados relacional)
HTML/CSS (frontend)

Configuração do Ambiente de Desenvolvimento
Clonar o Repositório: Clone este repositório para o seu ambiente local utilizando o seguinte comando:
bash
git clone https://github.com/amandadduraes/imdb-api.git

Configurar o Banco de Dados: Certifique-se de ter o PostgreSQL instalado localmente. Crie um banco de dados chamado imdb utilizando o seguinte comando:

createdb imdb
Executar o Projeto: Navegue até o diretório do projeto e execute a aplicação utilizando o seguinte comando:


java -jar imdb-api.jar
Acessar a Aplicação: Após a execução bem-sucedida, acesse a aplicação em http://localhost:8080 no seu navegador.

Licença
Este projeto está licenciado sob a MIT License.
