#include<stdio.h>	
#include<conio.h>
main()

{int x,tab,s=0;

	printf ("\nDigite um numero para saber seus multiplos:");
	scanf ("%i",&tab);
	
	for (x=1;x<=10;x++)
{
	printf ("\n%i X %i = %i",tab,x,tab*x);
}

getche();

}

