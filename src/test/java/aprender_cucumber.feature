# language: pt
Funcionalidade: Aprender cucumber
	Como um aluno
	Eu quero aprender a utilizar o Cucumber
	Para que eu possa automatizar critérios de aceitacao

Cenario: Deve executar especificação


	Dado que criei o arquivo corretamente
	Quando executa-lo
	Então a especificação deve finalizar com sucesso
	
Cenario: Deve que incrementar contador
	Dado que o valor do contador é 15
	Quando eu incrementar em 3
	Entao o valor do contador é 18
