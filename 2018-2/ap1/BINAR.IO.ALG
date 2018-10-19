algoritmo "binar.io"

var
resultado:caracter
valorentrada,guardavalor:inteiro

inicio

escreval (" Digite o valor que você quer saber em binario:")
leia (valorentrada)
guardavalor <- valorentrada

enquanto valorentrada > 0 faca
se (valorentrada mod 2) = 0 entao
resultado <- "0" + resultado
senao
resultado <- "1" + resultado
fimse
valorentrada <- valorentrada div 2
fimenquanto
escreval (guardavalor," = ",resultado)
fimalgoritmo
