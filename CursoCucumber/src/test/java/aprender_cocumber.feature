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
      