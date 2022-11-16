m = 648
a = 343

# 计算ord(a)

# 方法一:

import gmpy2

for i in range(1, 100):
    if gmpy2.powmod(a, i, m) == 1:
        print(i)
        break


# 方法二:

m = 648
a = 343


import gmpy2

primes = []

for i in range(2, gmpy2.iroot(m, 2)[0]):
    if m % i == 0:
        s = 0
        while m % i == 0:
            s += 1
            m /= i
        primes.append([i, s])

# print(primes)

f = []
for item in primes:
    for i in range(1, 100):
        if gmpy2.powmod(a, i, pow(item[0], item[1])) == 1:
            f.append(i)
            break

def gcd(a, b):
    if b == 0:
        return a
    else:
        return gcd(b, a%b)


print(f[0] * f[1] / gcd(f[0], f[1]))



# 方法三

"""
利用方法二的分解[2, 3] [3, 4]

即需要计算ord(下标为2^3)a = f1
ord(下标为3^4)a = f2

计算f1和f2
这里用方法三

a = 343 显然(a, 2) = 1 (a, 3) = 1
对[2, 3]:
    p = 2此时a 不能分解成a = 2^r*a1 +- 1, r >= 2

这里用了个很棒的技巧

性质4:
343 = 7^3
这里先用7来进行计算

7 = 2^3 - 1
对表, 得到fj = 2

对[3, 4]:
    找寻p^i --> 先求出f2 --> ord(下标为3^2)a = f2 --> ord(下标为9)7 = f2 --> f2 = 3
    --> a^f2 = 7^3 = 343  --> 342
    这个时候显然i只能等于2
    所以fj = 3^2 * 3 = 9

    这个时候获得了对于m1 = 7 来说的两个f [2, 27]
    可知orda(m1) = 18
    要求orda(m1^3) = ?
    现在计算orda(m1^3) = 54/(54, 3) = 18
"""