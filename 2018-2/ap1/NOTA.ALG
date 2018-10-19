algoritmo "nota"

var
   n1,n2,freq,media:real
inicio
   escreval (" escreva nota 1")
   leia (n1)
   escreval (" escreva nota 2")
   leia (n2)
   escreval (" digite a sua frequencia (0 a 100)")
   leia (freq)
   media <- (n1+n2)/2
   se (media > 60) e (freq >= 75) entao
      escreval(" aluno aprovado")
   senao
      se (freq < 75) e (media < 60 ) entao
         escreval (" aluno reprovado por frequencia e media")
      senao
         se (freq < 75) entao
            escreval (" aluno reprovado por frequencia")
         senao
            se (media < 60) entao
               escreva (" aluno reprovado por nota")
            fimse
         fimse
      fimse
   fimse
fimalgoritmo