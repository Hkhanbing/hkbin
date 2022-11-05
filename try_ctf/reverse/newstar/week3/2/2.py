c = [0x38FA8A82, 0x0D7501380, 0x0E40969D, 0x4E169120, 0x713A29AB, 0x6CE5393D, 0x0B69D752E, 0x841A88E6, 0x6F31B459, 0]

he = [0x760043b2, 0x4d6563b2, 0x1e4174e7, 0xe73859bc, 0xdded00e4, 0xaf5b3291, 0x29a560bc, 0xff38e8cf, 0x834d15e7]



ans = [0x67616c66 ,0x5030487b, 0x5f555f33,0x336b314c,0x3168545f ,0x55435f35, 0x66305f50, 0x6145545f,0x7d2e]

ret = ""
for i in range(0, len(ans)):
    temp = str(hex(ans[i]).lstrip("0x"))
    for j in range(len(temp)-1, 0, -2):
        Out = ""
        Out += temp[j-1]
        Out += temp[j]
        ret += chr(int(Out, 16))
