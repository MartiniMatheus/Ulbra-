#include<stdio.h>	
#include<conio.h>
main()

{float nn,n,m=0,k=0;
float media;
char nome;

do{
	
	printf ("\nDigite sua nota da g1:");
	scanf ("%f",&nn);

	printf ("\nDigite sua nota da g2:");
	scanf ("%f",&n);

	m =  nn;	
	k =	 n;
	media=(m+(k*2))/(3);
	
	printf ("\nmedia do aluno: %.2f",media);	
	printf("\ndeseja continuar? s or n :");
	
	fflush(stdin);
	scanf ("%c",&nome);
	 
	}while (nome=='s');
		
	printf ("thanks!");
getche();
}






