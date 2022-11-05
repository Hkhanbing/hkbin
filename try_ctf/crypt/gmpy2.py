# Encoding=UTF-8

import gmpy2

# gmpy2.mpz(x)

# 初始化一个大整数x

gmpy2.mpfr(x)

# 初始化一个高精度浮点数x

C = gmpy2.powmod(M,e,n)

# 幂取模，结果是 C = (M^e) mod n

d = gmpy2.invert(e,n) # 求逆元，de = 1 mod n

gmpy2.is_prime(n) # 判断n是不是素数

gmpy2.gcd(a,b) # 欧几里得算法

gmpy2.gcdext(a,b) # 扩展欧几里得算法

gmpy2.iroot(x,n) # x开n次根