#include<stdio.h>
#include<conio.h>
main()
{
	int m[5][4];
	int vetor[4] = {0};
	int l,c;
	for(c=0; c<5; c++){
		for(l=0; l<4; l++){
			printf("\nComplete a matriz, coluna %d linha %d: ", c,l);
			scanf("%d", &m[c][l]);
		}
	}
	printf("\nMATRIZ\n");
	for (c=0; c<5; c++){
		for (l=0; l<4; l++){
			printf("%d\t", m[c][l]);
		}
		printf("\n");
	}
	for (c=0; c<5; c++){
		for (l=0; l<4; l++){
			if(m[c][l]<100)
			vetor[c] += m[c][l];
		}
	}
	for (c=0; c<5; c++){
		printf("\n vetor %d: %d", c,vetor[c]);
	}
getche();
}

