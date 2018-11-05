#include<stdio.h>	
#include<conio.h>
main()

{float x,nn,n,s=0,k=0;
float media;

for (x=1;x<=10;x++)

{

	printf ("\nDigite sua nota da g1:");
	scanf ("%f",&nn);

	printf ("\nDigite sua nota da g2:");
	scanf ("%f",&n);

	s = s + nn;	
	k = k + n;
}
	media=(s+(k*2))/(3*10);
	printf ("\nmedia geral de notas: %.2f",media);	

getche();

}

