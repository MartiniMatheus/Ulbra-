#include <stdio.h>
#include <stdlib.h>

int somatorio(int valor){
    
    if(valor == 1){
             return (1);
    }else{
          return (valor + somatorio(valor-1));      
    }
}


float LePositivo(){
    
    int numeros[5];    
    int controle;
    
    printf("Entre com os 5 valores.\n");
    for (controle = 0; controle < 5; controle++){
        
        do{
                  scanf("%d",&numeros[controle]);
                  
                  if(numeros[controle] <= 0){
                     printf("Entre novamente com um valor POSITIVO.\n");
                  }                         
        }while(numeros[controle] <= 0);
    }
    for (controle = 0; controle < 5; controle++){   
        printf("SOMATORIO DE %d ate 1: %d\n",numeros[controle] ,somatorio(numeros[controle]) );
    } 
}


int main(){
    
    LePositivo();

    system("PAUSE");
    return 0;    
}
