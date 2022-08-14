# client-crud
Criação do projeto client, crud completo service REST.

Desafio para entregar (trabalho final do Capítulo)

Enunciado:
Você deverá entregar um projeto Spring Boot 2.4.x ou superior, contendo um CRUD completo de web services REST. 
Para acessar um recurso de clientes, contendo as cinco operações básicas aprendidas no capítulo:

	Busca paginada de recursos;
	Busca de recurso por id;
	Inserir novo recurso;
	Atualizar recurso;
	Deletar recurso;

O projeto deverá estar com um ambiente de testes configurado, acessando o banco de dados H2, 
deverá usar Maven como gerenciador de dependências e Java 11 ou 17 como linguagem.

Um cliente possui nome, CPF, renda, data de nascimento e quantidade de filhos. A especificação da entidade Client é mostrada a seguir: 
(Você deve seguir à risca os nomes de classe e atributos mostrados no diagrama)

Client
- id: Long
- name: String
- CPF: String
- income: Double
- birthDate: instant
- children: Integer

	
Seu projeto deverá fazer um seed de pelo menos 10 clientes com dados significativos.
(Não é pra usar dados sem significado como “Nome 1, nome 2”, etc.).

Atenção: Crie um novo projeto para este trabalho. Não é para simplesmente acrescentar a classe Client no DSCatalog feito nas aulas.
Atenção: Lembre-se de que por padrão a JPA transforma nomes de atributos em camelCase para snake_case, como foi o caso do campo imgUrl do DSCatalog, 
que no banco de dados tinha o nome img_Url. Assim, o campo birthDate acima será criado no banco de dados como birth_Date, então seu script SQL deverá seguir este padrão.
