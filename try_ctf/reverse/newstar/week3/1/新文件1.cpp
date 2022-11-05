#include <iostream>
using namespace std;

int main() {
	//33~126
//	for (int i1 = 33; i1 <= 126; i1++) {
//		for (int i2 = 33; i2 <= 126; i2++) {
//			for (int i3 = 33; i3 <= 126; i3++) {
//				for (int i4 = 33; i4 <= 126; i4++) {
//					for (int i5 = 33; i5 <= 126; i5++) {
//						for (int i6 = 33; i6 <= 126; i6++) {
//							for (int i7 = 33; i7 <= 126; i7++) {
//								for (int i8 = 33; i8 <= 126; i8++) {
//									if (i3 == 126)
//										cout << i1 << " : " << i2 << " : " << i3 << " : " << i4 << " : " << i5 << " : " << i6 << " : " << i7 << " : " << i8 <<
//										     endl;
//								}
//							}
//						}
//					}
//				}
//			}
//		}
//	}
	int a = 2;
	if (a == 2 && (a *= 2, a == 4 && a == 4)) {
		cout << a << endl;
		cout << "yes" << endl;
	}
	return 0;
}