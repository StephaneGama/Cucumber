   #language: pt
   
    Funcionalidade: Aprender Cucumber
      Como Aluno
      eu quero aprender a utilizar cucumber
      Para que eu possa automatizar
     
      Cenario: Deve executar especificacao
      Dado criar arquivo
      Quando executalo
      Entao finalizar
       
      Cenário: Deve incrementar contador
      Dado que o valor do contador é 15
      Quando eu incrementar em 3
      Então o valor do contador será 18
      
      Cenário: Deve incrementar contador
      Dado que o valor do contador é 123
      Quando eu incrementar em 35
      Então o valor do contador será 158
      
      Cenário: Deve calcular atraso na entrega
      Dado que a entrega é 05/04/2018
      Quando a entrega atrasar em 2 dias
      Então a entrega será efetuada em 07/04/2018
      