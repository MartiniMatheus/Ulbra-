#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
int main(){
 int i, j, m[4][3];
 //captura os elementos
 	for(i=0;i<4;i++)
 		for(j=0;j<3;j++){
 		printf("Elemento[%i][%i]= ",i,j);
 		scanf("%d",&m[i][j]);
 }
 //EXIBIR VALORES ORIGINAIS
 printf("\n::: Valores Originais :::\n");
 	for(i=0;i<4;i++){
		for(j=0;j<3;j++)
 		printf("%i ",m[i][j]);
 		printf("\n");
 }
 //multiplica por 10
	for(i=0;i<4;i++)
 		for(j=0;j<3;j++)
 		m[i][j]=m[i][j]*10;
 //EXIBIR VALORES MULTIPICADOS
 printf("\n::: Valores Multiplicados por 10:::\n");
 	for(i=0;i<4;i++){
 		for(j=0;j<3;j++)
 		printf("%i ",m[i][j]);
 		printf("\n");

}
 getche();
 }
