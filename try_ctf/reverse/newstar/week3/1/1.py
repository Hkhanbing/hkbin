xor = [0, 0x0D, 0x0D, 0x0B, 0x0C, 0x6B, 0x14, 0x1E, 0x1C, 0x52, 0x5F, 0x5F, 0x28, 0x78, 0x1D, 0x3B, 0x25, 0x0E, 3, 0, 0x56, 0x10, 0x4F, 0x19]

data = [102, 97, 108, 108, 119, 49, 110, 100]

temp = ""
for i in range(0,len(data)):
    temp+=chr(data[i])

ans = ""
for i in range(0, 24):
    ans += chr(xor[i] & (data[i & 7] ^ xor[i]) | ~xor[i] & (~xor[i] ^ ~data[i & 7]))

#'flag{Zzzz333_Is_Cool!!!}'