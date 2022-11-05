#include <stdio.h>
#include <process.h>

FILE *stream;

int main() {
	stream = fopen("C:\\Users\\86138\\Desktop\\test.txt", "w");
	char s[] = "this is string";
	int b = 12;
	fprintf(stream, "%s%d", s, b);
	fclose(stream);

	return 0;
}