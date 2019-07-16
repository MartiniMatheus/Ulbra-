#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
int main(){
int i, j, m[4][4],x,cont=0;

 	for(i=0;i<4;i++)
 		for(j=0;j<4;j++){
 		printf("Elemento[%i][%i]= ",i,j);
 		scanf("%d",&m[i][j]);

}
	printf("\ndigite um numero:");
	scanf("%i",&x);
	
	for(i=0;i<4;i++)
 		for(j=0;j<4;j++){
			if(m[i][j]==x){
				cont++;
			} 			
}
 	printf("\nnumero de vezes em que o %i aparece: %i",x,cont);
 getche();
 }
