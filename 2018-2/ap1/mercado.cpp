#include <stdio.h>
#include <conio.h>

main()
{
	float compra,media,total,maior_valor=0;
	char resp;
	int cont=0;
	
	do{	
		printf("\ndigite o valor da compra:");
		scanf("%f",&compra);
			if (compra>maior_valor)
			maior_valor=compra;
			
		cont++;
		total=total+compra;
		media=total/cont;
		
		printf("\n outra compra [s/n]");
		fflush(stdin);
		scanf ("%c",&resp);

	}while((resp=='s')||(resp=='S'));
	
	printf ("\numero de vendas %i:",cont);
	printf("\nvalor total de vendas:%.2f",total);
	printf("\nvalor medio de vendas:%.2f",media);
	printf("\nvalor de maior valor:%.2f",maior_valor);
	
getche();
}
