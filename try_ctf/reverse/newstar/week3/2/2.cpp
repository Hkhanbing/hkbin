#include <iostream>
using namespace std;
const int maxn = 1e3 + 10;

// 题目魔改了明天再�?
void decrypt (uint32_t *a1, uint32_t a2, uint32_t *a3) {
	a2 = 9;
	__int64 result; // rax
	unsigned int i; // [rsp+0h] [rbp-28h]
	unsigned int v5; // [rsp+4h] [rbp-24h]
	unsigned int v6; // [rsp+8h] [rbp-20h]
	unsigned int v7; // [rsp+Ch] [rbp-1Ch]
	int v8; // [rsp+10h] [rbp-18h]
	int v9; // [rsp+14h] [rbp-14h]
	int v10; // [rsp+18h] [rbp-10h]
	int v11; // [rsp+1Ch] [rbp-Ch]

	v8 = 52 / a2 + 6;//11
	v7 = 3187137536;
	do {
		v5 = a1[a2 - 2];

		v10 = (v7 >> 2) & 3;

		v11 = (((v5 ^ * (a3 + 4 * (v10 ^ i & 3))) + (*a1 ^ v7)) ^ (((32 * v5) ^ (*a1 >> 3)) + ((4 * *a1) ^ (v5 >> 4))));
		a1[a2 - 1] -= v11;//固定地方一直更�?

//v5是关键

		for ( i = a2-2; i > 0 ; i-- ) {//固定循环次数
			v5 = a1[i - 1];
			v6 = a1[i + 1];
			v9 = (((v5 ^ * (a3 + 4 * (v10 ^ i & 3))) + (v6 ^ v7)) ^ (((32 * v5) ^ (v6 >> 3)) + ((4 * v6) ^ (v5 >> 4))));
//			cout << v9 << endl;
			a1[i] -= v9;
		// 	if(v8 == 52 / a2 + 6 ){
		// 		cout<<v5<<" ";
		// }
		// if(v8 == 52 / a2 + 5){
		// 	cout<<v5<<" ";
		// }
		}
		
		v5 = a1[a2-1];
		v6 = a1[i + 1];
		v9 = (((v5 ^ * (a3 + 4 * (v10 ^ i & 3))) + (v6 ^ v7)) ^ (((32 * v5) ^ (v6 >> 3)) + ((4 * v6) ^ (v5 >> 4))));
		a1[i] -= v9;
		// if(v8 == 52 / a2 + 5){
		// 	cout<<v5<<" ";
		// }

		// if(v8 == 52 / a2 + 6){
		// 	cout<<v5<<" ";
		// }
		// if(v8 == 52 / a2 + 6){
		// 	for(int j = 0; j < a2-1;j++)
		// 		cout<<a1[j]<<" ";
		// 	cout<<endl;
		// }


		v7 -= 289739776;//v7固定�?
		
		--v8;//固定外循环次�?
	} while ( v8 );//11次循环
	cout<<endl;
}

void encrypt(uint32_t *a1, uint32_t a2, uint32_t *a3){	a2 = 9;
	__int64 result; // rax
	unsigned int i; // [rsp+0h] [rbp-28h]
	unsigned int v5; // [rsp+4h] [rbp-24h]
	unsigned int v6; // [rsp+8h] [rbp-20h]
	unsigned int v7; // [rsp+Ch] [rbp-1Ch]
	int v8; // [rsp+10h] [rbp-18h]
	int v9; // [rsp+14h] [rbp-14h]
	int v10; // [rsp+18h] [rbp-10h]
	int v11; // [rsp+1Ch] [rbp-Ch]

v8 = 52 / a2 + 6;
  v7 = 0;
  v5 = a1[a2 - 1];
  do
  {
	// if(v8==1){
	// 	for(int j = 0; j < a2-1;j++)
	// 		cout<<a1[j]<<" ";
	// 	cout<<endl;
	// }


    v7 += 289739776;
    v10 = (v7 >> 2) & 3;
    for ( i = 0; i < a2 - 1; ++i )
    {

		// if(v8==1){
		// 	cout<<v5<<" ";
		// }
		// if(v8 == 2){
		// 	cout<<v5<<" ";
		// }
      v6 = a1[i + 1];
      v9 = (((v5 ^ *(a3 + 4 * (v10 ^ i & 3))) + (v6 ^ v7)) ^ (((32 * v5) ^ (v6 >> 3))
                                                                         + ((4 * v6) ^ (v5 >> 4))))
         + a1[i];
      a1[i] = v9;
      v5 = v9;

    }


    v11 = (((v5 ^ *(a3 + 4 * (v10 ^ i & 3))) + (*a1 ^ v7)) ^ (((32 * v5) ^ (*a1 >> 3))// 
                                                // v11 = k* v5
                                                // a1[a2-1] = v11
                                                // v5 = v11
                                                                         + ((4 * *a1) ^ (v5 >> 4))))
        + a1[a2 - 1];
    a1[a2 - 1] = v11;
    v5 = v11;


    result = (unsigned int)--v8;
	
  }
  while ( v8 );
}

int main() {
	//uint32_t v[maxn] = {0x38FA8A82, 0x0D7501380, 0x0E40969D, 0x4E169120, 0x713A29AB, 0x6CE5393D, 0x0B69D752E, 0x841A88E6, 0x6F31B459, 0};
	uint32_t a3[maxn] = {0x19, 0, 0, 0, 0x19, 0, 0, 0, 8, 0, 0, 0, 0x10, 0, 0, 0};
	// uint32_t v[maxn] = {0x76c6f75b, 0x91c64b9c ,0x3330c402 ,0x1c4bf9e7,0xdf0b9cac, 0x29f3ec66, 0xbe34aa09, 0x3406c2e5, 0xfc6dce73};
	//uint32_t a1[maxn] = {0xcdc52a93 ,0xb191a105 ,0x174202d2 ,0x8e1e5620 ,0xd8b54b6c ,0xae6f9e36,0xa7dcf307 ,0x3935abe0 ,0x8264f198};
	uint32_t a2 = 9;
	// uint32_t a1[maxn] = {11,12,13,14,15,16,17,18,19};
	//uint32_t a1[maxn] = {0xc76f0746 ,0x14d18f3e ,0x51e62270 ,0xa7ff8eb5 ,0x44c066a7 ,0xd0d6981e ,0x9b3c42b2,0xf30fc68f ,0xa8c83003};
	// encrypt(a1,a2,a3);
	uint32_t a1[maxn] = {0x38FA8A82, 0x0D7501380, 0x0E40969D, 0x4E169120, 0x713A29AB, 0x6CE5393D, 0x0B69D752E, 0x841A88E6, 0x6F31B459, 0};
	for (int i = 0; i < 9; i++)
		cout << hex << int(a1[i]) << " ";
	cout<<endl;
	decrypt(a1, a2, a3);
	for (int i = 0; i < 9; i++)
		cout << a1[i] << " ";

	// for(int i = 0;i<9;i++){
	// 	for(int j = 7;j>=0;j-=2){
	// 		string temp;
	// 		temp += string(a1[i])[j];
	// 		temp += string(a1[i])[j-1];
	// 		cout<<temp;
	// 	}
	// }

// 	v7 = 289739776
// v10 = (v7 >> 2) & 3
// a1 = [0xcdc52a93 ,0xb191a105 ,0x174202d2 ,0x8e1e5620 ,0xd8b54b6c ,0xae6f9e36,0xa7dcf307 ,0x3935abe0 ,0x8264f198]

// for v5 in range(0x8264f198, 0xffffffff):
//     v11 = (((v5 ^ * (a3 + 4 * (v10 ^ i & 3))) + (*a1 ^ v7)) ^ (((32 * v5) ^ (*a1 >> 3)) + ((4 * *a1) ^ (v5 >> 4))))
//     if v5 == v11 + a1[a2-1]:
//         print(v5)
	// int v7 = 289739776;
	// int v10 = (v7 >> 2) & 3;
	// int i = a2-1;
	// int ans = 0;
	// for(unsigned int v5 = 0x8264f198; v5<=0xffffffff;v5++){
	// 	int v11 = (((v5 ^ * (a3 + 4 * (v10 ^ i & 3))) + (*a1 ^ v7)) ^ (((32 * v5) ^ (*a1 >> 3)) + ((4 * *a1) ^ (v5 >> 4))));
	// 	if(v5 == v11+a1[a2-1]){
	// 		ans = v5;
	// 	}
	// }
	// cout<<"~~"<<ans<<endl;

	// int v8 = 52 / a2 + 6;
	// unsigned int v7 = 0;
	// do{
	// 	v7+=289739776;
	// 	v8--;
	// }while(v8);
	// cout<<v7<<endl;//3187137536

	system("pause");
	return 0;
}