#include <stdio.h>
#define MAX 5

int MaiorNumero(int n1, int n2);

int main()
{
    int n1 = 0,
        n2 = 0;

    for (int i=0; i<5; i++)
    {
        printf("Informe o primeiro numero\n");
        scanf("%d", &n1 );
        printf("Informe o segundo numero\n");
        scanf("%d", &n2 );
        MaiorNumero(n1,n2);
    }

    return 0;
}

int MaiorNumero(int n1, int n2)
{
    if(n1 > n2)
        printf("Maior numero digitado %d \n", n1);
    else
        if(n2 > n1)
            printf("Maior numero digitado %d\n", n2);
        else
            printf("Numeros iguais\n");
            
}
