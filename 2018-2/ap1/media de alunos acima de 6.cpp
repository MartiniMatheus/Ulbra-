#include<stdio.h>	
#include<conio.h>
main()

{float x,nn,n,t;
int cont=0;

for (x=1;x<=5;x++)

{
	printf ("\nDigite sua nota da g1:");
	scanf ("%f",&nn);

	printf ("\nDigite sua nota da g2:");
	scanf ("%f",&n);

	t= ((nn + n*2)/3);

	{ if ( t >= 6)
	(cont = cont + 1 );	}

}
	printf ("\nnumeros de alunos com ou acima de media 6:%i",cont);
getche();

}

