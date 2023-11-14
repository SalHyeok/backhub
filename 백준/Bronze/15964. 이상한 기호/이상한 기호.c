#include <stdio.h>

long long int calculate(int A, int B) {
    return (long long int)(A + B) * (long long int)(A - B);
}

int main() {
    int A, B;
    scanf("%d %d", &A, &B);

    long long int result = calculate(A, B);
    printf("%lld\n", result);

    return 0;
}