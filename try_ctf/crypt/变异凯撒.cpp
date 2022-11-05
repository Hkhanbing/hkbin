#include <iostream>
using namespace std;

int main() {
	string a = "afZ_r9VYfScOeO_UL^RWUc";
	for (int i = 0; i <= a.length(); i++) {
		a[i] += 5 + i;
	}
	cout << a << endl;
	return 0;
}