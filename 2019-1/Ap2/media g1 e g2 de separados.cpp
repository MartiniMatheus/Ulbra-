#include<stdio.h>	
#include<conio.h>
main()

{float x,nn,n,s=0,k=0;
float mediag1,mediag2;

for (x=1;x<=10;x++)

{

	printf ("\nDigite sua nota da g1:");
	scanf ("%f",&nn);

	printf ("\nDigite sua nota da g2:");
	scanf ("%f",&n);

	s = s + nn;	
	k = k + n;
}
	mediag1=s/10;
	mediag2=k/10;
	printf ("\nmedia geral da g1: %.2f",mediag1);
	printf ("\nmedia geral da g2: %.2f",mediag2);	

getche();

}

