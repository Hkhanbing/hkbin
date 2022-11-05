#include <windows.h>
#include <stdio.h>

int main() {
	HANDLE hDev = INVALID_HANDLE_VALUE;
	hDev = CreateFile();
	if (hDev == INVALID_HANDLE_VALUE) {
		printf("要不试试加载驱动?\n");
		system("Pause");
		return -1;
	}
	CloseHandle(hDev);
	printf("Now you can check your c disk!\n");
	system("Pause");
	return 0;
}