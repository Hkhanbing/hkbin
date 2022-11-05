import hashlib

flag = "@DBApp"

for i in range(100000, 999999):
    s = str(i) + flag
    x = hashlib.sha1(s.encode())
    if x.hexdigest() == "6E32D0943418C2C33385BC35A1470250DD8923A9".lower():
        print(str(i) + flag)


aaa = [0x05, 0x7D, 0x41, 0x15, 0x26, 0x01]

rtf_header = [0x7b, 0x5c, 0x72, 0x74, 0x66, 0x31]

pass2 = ""
for i in range(6):
    res = aaa[i] ^ rtf_header[i]
    pass2 += chr(res)

print(pass2)
#~!3a@0


# import hashlib

# passwd1 = "6e32d0943418c2c33385bc35a1470250dd8923a9"
# passwd2 = "27019e688a4e62a649fd99cadaafdb4e"
# suffix = "@DBApp"
# aaa = [0x5, 0x7d, 0x41, 0x15, 0x26, 0x1]	#AAA资源的前6个字节
# rtf_header = [0x7b, 0x5c, 0x72, 0x74, 0x66, 0x31] # RTF文件头前6给字节

# pass1 = ""
# pass2 = ""
# for i in range(100000,1000000):
#     instr = str(i) + suffix
#     res = hashlib.sha1(instr.encode('utf-8')).hexdigest()
#     if res == passwd1:
#         pass1 = str(i)
#         print("passwd1 = ", pass1)
#         break


# for i in range(6):
#     res = aaa[i] ^ rtf_header[i]
#     pass2 += chr(res)


# print("passwd2 = ", pass2)
