#include <stdio.h>

int main() {
    int A, B;
    scanf("%d %d", &A, &B);

    int result = (A + B) * (A - B);
    printf("%d\n", result);

    return 0;
}