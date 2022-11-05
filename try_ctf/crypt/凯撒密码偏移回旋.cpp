#include <iostream>
using namespace std;

int main() {
	string a = "5pq1004q - 86n5 - 46q8 - o720 - oro5on0417r1";
	for (int i = 0; i < a.length(); i++) {
		if (a[i] >= 'a') {
			a[i] -= 13;
			if (a[i] < 'a')
				a[i] += ('z' - 'a');
		}
	}
	cout << a << endl;
	return 0;
}