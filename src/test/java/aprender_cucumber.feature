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
	
Cenario: Deve que incrementar contador
	Dado que o valor do contador é 20
	Quando eu incrementar em 3
	Entao o valor do contador é 23
	
Cenario: Deve calcular atraso na entrega
	Dado que a entrga é dia 05/04/2020
	Quando a entrega atrasar em 2 dias
	Entao a entrega será efetuada dia 07/04/2020
	
Cenario: Deve calcular atraso no praso de entrega da China
	Dado que o prazo é 05/05/2020
	Quando a entrega atrazar em 2 meses
	Entao a entrega sera efetuada em 05/07/2020
	
Cenario: Deve calcular atraso no praso de entrega da China
	Dado que o prazo é 05/10/2020
	Quando a entrega atrazar em 2 meses
	Entao a entrega sera efetuada em 05/12/2020
