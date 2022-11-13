import gmpy2

"""
一次同余方程组形式:
    x === b1(mod m1)
    x === b2(mod m2)
    x === b3(mod m3)
    ...
    x === bk(mod mk)
"""

"""
设m1, m2, ..., mk是k个两两互素的正整数.
m = m1m2...mk = miMi(i = 1, ..., k)
则一次同余方程组式有唯一解
x = M1'M1b1 + M2'M2b2 + M3'M3b3 + ... + Mk'Mkbk(mod m)
其中Mi'Mi === 1 (mod mi)(i = 1, ..., k)

"""
M = []
B = []

m = 1
for i in M:
    m *= i

x = 0
for i in range(0, len(M)):
    Mi = m / M[i]
    Mi_re = gmpy2.invert(Mi, M[i])
    x += Mi*Mi_re*B[i] % m

print(x)