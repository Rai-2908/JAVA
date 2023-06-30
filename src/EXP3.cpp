#include <bits/stdtr1c++.h>
using namespace std;

int main()
{
    int a[] = {2, 4, 5, 6, 8, 9, 2, 7, 1};
    unordered_map<int, int>freq;
    
    for(int i=0; i< 13; i++)
        freq[a[i]]++;
    
    for(auto it : freq)
    {
        cout<<"Frequency of "<<it.first<<": "<<it.second<<endl;
    }
    return 0;
}
