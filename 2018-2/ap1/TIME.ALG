algoritmo "time"
var
   time1,time2:caracter
   tim1,tim2:real
inicio
   escreval (" digite os times e seus placares:")
   leia (time1)
   escreval("--------")
   leia (time2)
   escreval("--------")
   escreval (time1, " e ",time2, " se enfrentaram, quantos gols rolou no jogo?")
   escreval (" para o ",time1,"?")
   leia (tim1)
   escreval (" e paro o ",time2,"?")
   leia (tim2)
   se tim1 > tim2 entao
   escreval (time1," vencedor!")
   fimse
        se tim2 > tim1 entao
        escreval (time2," vencedor!")
        fimse
             se tim1 = tim2 entao
             escreval (" jogo empatado")
             fimse

fimalgoritmo


