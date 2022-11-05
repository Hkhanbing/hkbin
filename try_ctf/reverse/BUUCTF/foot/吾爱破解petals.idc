//文件名：test.idc
#include <idc.idc>
static main() 
{
    auto x,FBin,ProcRange;
    FBin = "E8 0A 00 00 00 E8 EB 0C 00 00 E8 F6 FF FF FF";
    //目标 = "E8 0A tel:00 00 00 90 EB 0C tel:90 90 90 90 90 90 90";
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
            x =x + 2 ; //F6 FF FF FF
            PatchDword(x,0x90909090);
            Message("found it!");
    }
    Message("Not found!");
}