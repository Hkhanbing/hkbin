data = [ 59,
  68,
  74,
  19,
 118,
 219,
 83,
43,
 47,
45,
104,
 63,
27,
 222,
 63,
23,
  72,
  53,
  114,
  63,
  219,
204,
  117,
 222,
   17,
 63,
  26,
 38,
   104,
   63,
 27,
 47,
  5,
24,
   233,
   233,
 172,
 29]


import gmpy2
def judge(a):
  v1 = a != 1
  if a <= 2:
    return v1
  else:
    return gmpy2.is_prime(a)
    # if (a & 1 != 0):
    #   v2 = 2
    #   v2 += 1
    #   while(a != v2):
    #     if((a % v2) == 0):#是素数返回1 不是返回0
    #       return 0
    #     v2 += 1
    # else:
    #   return 1


flag = ""
for v9 in range(1, len(data) + 1):
  v10 = data[v9 - 1]
  if (judge(v9)):
    v11 = (v10 ^ 0x21) - 55
  else:
    v11 = (v10 ^ 0x4A) - 77
  ans = v11 ^ 0x77
  print(ans)
  flag += chr(ans)

