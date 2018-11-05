#include<stdio.h>	
#include<conio.h>
main()

{int x,id,s=0;
float media;

for (x=1;x<=3;x++)

{

	printf ("\nDigite sua idade:");
	scanf ("%i",&id);
	
	s = s + id;	
}
	media=(float)s/3;
	printf ("\nmedia de idades: %.2f",media);	

getche();

}

