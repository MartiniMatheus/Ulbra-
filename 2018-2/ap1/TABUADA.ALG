algoritmo "tabuada"

var
   n,r,val:inteiro
inicio
   val <- 0
   escreval(" digite um numero da tabuada:")
   leia(n)
   repita
      val <- val + 1
      r <- n * val
      escreval(n," x",val," =",r)

   ate (val = 10)

fimalgoritmo