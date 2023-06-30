#include <iostream>
using namespace std;

int gcd(int a, int b)
{
    if (a==0)
        return b;
    
    return gcd(b % a, a);
}
int main()
{
    int a, b;
    cout<<"Enter value of a: ";
    cin>> a;
    cout<<"Enter value of b: ";
    cin>>b;
    cout<<"GCD of "<<a<<" and "<<b<<" is "<<gcd(a, b);
    return 0;
}