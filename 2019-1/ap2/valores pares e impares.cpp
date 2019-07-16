#include <stdio.h>

int main()
{
  int valor, vpar[5],vimpar[5], p=0, i=0, x, y;
  
  for(x=1;x<=30;x++)
   {
       printf("\ndigite o valor %i:",x);
       scanf("%i",&valor);
       if(valor%2==0){
           vpar[p]=valor;
           p++;
           if(p==5){
            for(y=0;y<5;y++)
                printf("\n%d",vpar[y]);
            p=0;
           }
       }	
       
       else
       {
        vimpar[i]=valor;
           i++;
           if(i==5){
            for(y=0;y<5;y++)
                printf("\n%d",vimpar[y]);
            i=0; 
        }
    	}
   }
   printf("\nValores restantes no vetor de pares: ");
   for(x=0;x<p;x++)
        printf("\n%i",vpar[x]);
    printf("\nValores restantes no vetor de impares: ");    
    for(x=0;x<i;x++)
        printf("\n%i",vimpar[x]);
    return 0;
}


