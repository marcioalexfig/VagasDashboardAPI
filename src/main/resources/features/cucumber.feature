Feature: Adicionando um cargo

	Scenario Outline: Como um usuário, eu quero adicionar um novo cargo para buscar vagas
		Given Eu posso adicionar um cargo
		And Posso adicionar até 3 cargos
		Then Eu agora posso observar as vagas disponiveis para cada cargo