# 前面已经讲了一次同余方程的解
# 这里直接讲一次同余方程组把

"""
一次同余方程组形式:
    x === b1(mod m1)
    x === b2(mod m2)
    x === b3(mod m3)
    ...
    x === bk(mod mk)
"""

# 孙子定理

"""
设m1, m2, ..., mk是k个两两互素的正整数.
m = m1m2...mk = miMi(i = 1, ..., k)
则一次同余方程组式有唯一解
x = M1'M1b1 + M2'M2b2 + M3'M3b3 + ... + Mk'Mkbk(mod m)
其中Mi'Mi === 1 (mod mi)(i = 1, ..., k)

代码见sunzi.py
"""

# 快速幂

"""
见qmi.cpp
"""