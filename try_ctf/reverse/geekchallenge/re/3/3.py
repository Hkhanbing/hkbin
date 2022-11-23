import base64
def rc4_main(key = "init_key", message = "init_message"):
    print("RC4解密主函数调用成功")
    print('\n')
    s_box = rc4_init_sbox(key)
    print("初始化完成")
    crypt = rc4_excrypt(message, s_box)
    return crypt


def rc4_init_sbox(key):
    s_box = list(range(256))
    print("原来的 s 盒：%s" % s_box)
    print('\n')
    j = 0
    for i in range(256):
        j = (j + s_box[i] + ord(key[i % 52])) % 256
        s_box[i], s_box[j] = s_box[j], s_box[i]
    print("混乱后的 s 盒：%s"% s_box)
    print('\n')
    return s_box


def rc4_excrypt(plain, box):
    print("调用解密程序成功。")
    print('\n')
    plain = base64.b64decode(plain.encode('utf-8'))
    plain = bytes.decode(plain)
    res = []
    i = j = 0
    for s in plain:
        i = (i + 1) % 256
        j = (j + box[i]) % 256
        box[i], box[j] = box[j], box[i]
        t = (box[i] + box[j]) % 256
        k = box[t]
        res.append(chr(ord(s) ^ k))
    print("res用于解密字符串，解密后是：%res" %res)
    print('\n')
    cipher = "".join(res)
    print("解密后的字符串是：%s" %cipher)
    print('\n')
    print("解密后的输出(没经过任何编码):")
    print('\n')
    return cipher


a=[0x34, 0xAA, 0x2C, 0x0AC, 0x65, 0x8C, 0x0E1, 0x0ED, 0x0DC, 0x21, 0x56, 0x55, 0x28, 0x1A, 0x0CF, 0x63, 0x98, 0x63, 0x0DC, 0x78, 0x40, 0x1D, 0x2C, 0x91, 0x0FD, 0x0F2, 0x0EE, 0x0FE, 0x3, 0x0CA, 0x53, 0x3E, 0x9F, 0x0EA, 0x4C, 0x31, 0x75, 0x79, 0x9D, 0x0E3, 0x9A, 0x0A3, 0x81, 0x26, 0x65, 0x51, 0x50, 0x2A, 0x5, 0x0E, 0x4F, 0x0B0, 0x84] #ciper
key="ibIIngxvJqVDOUqbuiHDpadwfdRePetteyBPtlLLmWBRmllmfhRbqXugrQoeqcCdJtycxByzSqiTqpfjhJTWjCBEdLhGuUoCoIuCqhMjSYweDGRmWJltsonZgQcRGdQwXUfiEzgjmYcCYXzoDRYByPOnDkrxWuyPTIplpxyEjuVLlCKHJikQAQACcBGeEZdBbEjilHqFEfqSwPqsvfhHfqsQsXxUVEtmnExffsqULrxzpSoQCMZNATMiKsNLQaaMOMEebeRfkwddhlTDTHSXlLaxeolghWexJyDaCHwAsPBo"
s="" # s盒

for i in a:
    s+=chr(i)

s=str(base64.b64encode(s.encode('utf-8')), 'utf-8')
ans = rc4_main(key, s)

tmp = ""
for i in range(0, 53):
    tmp += chr(ord(ans[i]) ^ 0x25)


# import requests
# import base64
# import hashlib
# def crypt(data,key) :
#     s = [0] * 256
#     for i in range(256) :
#         s[i] = i
#     print(s)
#     j = 0
#     for i in range(256) :
#         j = (j + s[i] + key[i % len(key)]) % 256
#         print(j)
#         s[i], s[j] = s[j], s[i]
#     i = 0
#     j = 0
#     res = ""
#     for c in data :
#         i = (i + 1) % 256
#         j = (j + s[i]) % 256
#         s[i], s[j] = s[j], s[i]
#         res = res + chr(c ^ s[(s[i] + s[j]) % 256])
#     return res

# def tdecode(data ,key) :
#     data = base64.b64decode(data)
#     salt = data[:16]
#     return crypt(data[16:] ,hashlib.sha1(bytes(key,encoding = "utf8") + salt).digest())


# key = "ibIIngxvJqVDOUqbuiHDpadwfdRePetteyBPtlLLmWBRmllmfhRbqXugrQoeqcCdJtycxByzSqiTqpfjhJTWjCBEdLhGuUoCoIuCqhMjSYweDGRmWJltsonZgQcRGdQwXUfiEzgjmYcCYXzoDRYByPOnDkrxWuyPTIplpxyEjuVLlCKHJikQAQACcBGeEZdBbEjilHqFEfqSwPqsvfhHfqsQsXxUVEtmnExffsqULrxzpSoQCMZNATMiKsNLQaaMOMEebeRfkwddhlTDTHSXlLaxeolghWexJyDaCHwAsPBo" 			#填写key
# a = [0x34, 0xAA, 0x2C, 0x0AC, 0x65, 0x8C, 0x0E1, 0x0ED, 0x0DC, 0x21, 0x56, 0x55, 0x28, 0x1A, 0x0CF, 0x63, 0x98, 0x63, 0x0DC, 0x78, 0x40, 0x1D, 0x2C, 0x91, 0x0FD, 0x0F2, 0x0EE, 0x0FE, 0x3, 0x0CA, 0x53, 0x3E, 0x9F, 0x0EA, 0x4C, 0x31, 0x75, 0x79, 0x9D, 0x0E39A, 0x0A3, 0x81, 0x26, 0x65, 0x51, 0x50, 0x2A, 0x5, 0x0E, 0x4F, 0x0B0, 0x84, 0x0]
# data = "123456"
# print(tdecode(data,key))
