#include <idc.idc>
static main() 
{
	PatchJunkCode();
}
static PatchJunkCode() 
{
    auto x,FBin,ProcRange;
	FBin = "E8 0A 00 00 00 E8 EB 0C 00 00 E8 F6 FF FF FF";
// 目 标 = "E8 0A 00 00 00 90 EB 0C 90 90 90 90 90 90 90";
	//花指令1的特征码
	for (x = FindBinary(MinEA(),0x03,FBin);x != BADADDR;x = FindBinary(x,0x03,FBin))
	{
		x=x+5; //返回的x是第一个E8的地址，
		      //加上5是第二个E8的地址
		PatchByte (x,0x90);//nop掉
		x = x + 3; //00
		PatchByte (x,0x90);
		x++;  //00 E8
		PatchWord (x,0x9090);
		x =x +2 ; //F6 FF FF FF
		PatchDword (x,0x90909090);
        Message("I find petals 1 \n");
	}
//以下同理，就不再进行分析了
	FBin = "74 04 75 02 EB 02 EB 01 81";
// 目 标 = "74 04 75 02 90 90 EB 01 90";
	// 花指令2的特征码
	for (x = FindBinary(MinEA(),0x03,FBin);x != BADADDR;x = FindBinary(x,0x03,FBin))
	{
		x = x + 4; //EB 02
		PatchWord (x,0x9090);
		x = x + 4; //81
		PatchByte (x,0x90);
        Message("I find petals 2 \n");
	}
 
	FBin = "50 E8 02 00 00 00 29 5A 58 6B C0 03 E8 02 00 00 00 29 5A 83 C4 04";
// 目 标 = "50 E8 02 00 00 00 90 90 58 6B C0 03 E8 02 00 00 00 90 90 83 C4 04";
	// 花指令3的特征码
	for (x = FindBinary(MinEA(),0x03,FBin);x != BADADDR;x = FindBinary(x,0x03,FBin))
	{
		x = x + 6;//29 5A
		PatchWord (x,0x9090);
		x = x + 11; //29 5A
		PatchWord (x,0x9090);
        Message("I find petals 3 \n");
	}
	// 花指令4的特征码
	FBin = "EB 01 68 EB 02 CD 20 EB 01 E8";
// 目 标 = "EB 01 90 EB 02 90 90 EB 01 90";
	for (x = FindBinary(MinEA(),0x03,FBin);x != BADADDR;x = FindBinary(x,0x03,FBin))
	{
		x = x+2; //68
		PatchByte (x,0x90);
		x = x+3;  //CD 20
		PatchWord (x,0x9090);
		x = x+4;  //E8
		PatchByte (x,0x90);
        Message("I find petals 4 \n");
	}
    Message("No found");
}
 