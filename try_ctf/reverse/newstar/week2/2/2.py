# """
# _int64 sub_19B6()
# {
#   int i; // [rsp+8h] [rbp-8h]
#   int j; // [rsp+Ch] [rbp-4h]

#   for ( i = 0; i <= 31; i += 4 )
#   {
#     for ( j = 0; j <= 3; ++j )
#       *((_DWORD *)s + i / 4) |= byte_50A0[i + j] << (8 * j);  //取值

#   }
#   return sub_19A1();
# }

# __int64 sub_192E()
# {
#   int i; // [rsp+Ch] [rbp-4h]

#   for ( i = 0; i <= 7; ++i )
#     *((_DWORD *)s + i) ^= 0x2022u;       //操作
#   return sub_1919();
# }

# __int64 sub_151D()
# {
#   int i; // [rsp+Ch] [rbp-4h]

#   for ( i = 0; i <= 7; ++i )
#     *((_DWORD *)s + i) ^= *((_DWORD *)s + i) >> 17;   //操作
#     // s = t ^ (t>>17)
#     // s << 17 = (t << 17) ^ t
#     # b = a ^ (a<<17)
#     # a = b ^ (a<<17)
#   return sub_1508();
# }

# __int64 sub_1253()
# {
#   int i; // [rsp+Ch] [rbp-4h]

#   for ( i = 0; i <= 7; ++i )
#   {
#     if ( *((_DWORD *)s + i) != dword_5020[i] )     //处理后还得相同
#     {
#       dword_5040 = 0;
#       return sub_123E();
#     }
#   }
#   return sub_123E();
# }
# """
# ans = ""
# s = [0x67617FF4, 0x6E305341, 0x656C4DE0, 0x69744BEC, 0x625F7460, 0x6F7348F4, 0x656871C9, 0x7D216ED3]
# for i in range(0, len(s)):
#   print(str(s[i]))
#   ans += str(s[i])




# #长整型 long long int 
# #0b 0000 ... 0001 0111 0011 0100 0100 010 // 0 0010 1001 1001 0110

# ret = []
# for i in range(0, len(s)):
#   ans = ""
#   temp = bin(s[i]).lstrip("0b")
#   temp_1 = ""
#   for j in range(0, 64-len(temp)):
#     temp_1 += "0"
  
#   temp = temp_1 + temp
#   head = temp[2:19]
#   last1 = temp[19:19+17]
#   ans += head
#   p1 = bin(int(last1, 2) ^ int(head, 2)).lstrip("0b")
#   p1_1 = ""
#   for j in range(0, 17-len(p1)):
#     p1_1 += "0"
  
#   p1 = p1_1 + p1
#   ans += p1
#   last2 = temp[19+17:19+17+17]
#   p2 = bin(int(last1, 2) ^ int(last2, 2)).lstrip("0b")
#   p2_2 = ""
#   for j in range(0, 17-len(p2)):
#     p2_2 += "0"
  
#   p2 = p2_2 + p2
#   ans += p2
#   last3 = temp[19+17+17:]
#   last3_3 = last2[:13]
#   p3 = bin(int(last3_3, 2) ^ int(last3, 2)).lstrip("0b")
#   p3_3 =""
#   for j in range(0, 13-len(p3)):
#     p3_3 += "0"
  
#   p3 = p3_3 + p3
#   ans += p3
#   print(len(ans))
#   ret.append(int(ans,2))


# for i in range(0, len(ret)):
#   ret[i] = ret[i] ^ 0x2022


#   # for ( i = 0; i <= 31; i += 4 )
#   # {
#   #   for ( j = 0; j <= 3; ++j )
#   #     *((_DWORD *)s + i / 4) |= byte_50A0[i + j] << (8 * j);  //取值
#   # }
#   # 
# # key = []
# # for i in range(0, 32):
# #   key.append(0)

# # for i in range(0, 32):
# #   for j in range(0, 4):
# #     key[3 - i + j] = ret[int(i / 4)] ^ ret[int(i / 4)]
# #     ret[int(i / 4)] = key[3 - i + j] ^ ret[int(i / 4)]
# #     key[3 - i + j] = key[3 - i + j] >> (8 * j)
  
# # key = []
# # for i in range(0, 32):
# #   temp = 0
# #   for j in range(0, 4):
# #     for k in range(0, 255):
      
# #1734437990
# #398647552316
      




# # 逆运算
# # c = a|b
# # b = a ^ c
# # a = b ^ C
# # a = b ^ c
# #  s[s + i / 4] = s[s + i / 4] | key<<(8*j)
# # nw = pre | key
# #key<<(8*j) = s ^ s


# import hashlib

# sha1 = hashlib.sha256()
# sha1.update('qwertyuiopasdfghjklzxcvbnmqwertyaaa'.encode('utf-8'))
# ret = sha1.hexdigest()


# # 64位密文


s = [0x67617FF4, 0x6E305341, 0x656C4DE0, 0x69744BEC, 0x625F7460, 0x6F7348F4, 0x656871C9, 0x7D216ED3]


#   for ( i = 0; i <= 7; ++i )
#     *((_DWORD *)s + i) ^= *((_DWORD *)s + i) >> 17;   //操作

for i in range(0, len(s)):
  temp = bin(s[i]).lstrip("0b")[:-17]
  s[i] = s[i] ^ int(temp, 2)


# __int64 sub_192E()
# {
#   int i; // [rsp+Ch] [rbp-4h]

#   for ( i = 0; i <= 7; ++i )
#     *((_DWORD *)s + i) ^= 0x2022u;       //操作
#   return sub_1919();
# }

for i in range(0, len(s)):
  s[i] ^= 0x2022


# temp = 0
# arr = []
# for i in range(0, len(s)):
#   for a in range(32, 128):
#     for b in range(32, 128):
#       for c in range(32, 128):
#         for d in range(32, 128):
#           if(temp|a|b<<8|c<<16|d<<24 == s[i]):
#             arr.append([a, b, c, d])
            

temp = 0
for i in range(0, len(s)):
  for a in range(32, 128):
    for b in range(32, 128):
      for c in range(32, 128):
        for d in range(32, 128):
          if(temp|a|b<<8|c<<16|d<<24 == s[i]):
            print(chr(a), chr(b), chr(c), chr(d))


flag{D0nt_let_time_bo_so_cheap!}