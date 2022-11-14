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

# 一般同余方程

"""
设𝑓(𝑥) = 𝑎𝑛𝑥𝑛 + 𝑎𝑛−1𝑥𝑛−1 + · · · + 𝑎1𝑥 + 𝑎0，其中𝑛 > 0，𝑎𝑖(𝑖 = 0, 1, · · · , 𝑛)是整数，又设𝑚 > 0，则：
    𝑓(𝑥) ≡ 0(mod 𝑚)

称为模数𝑚的同余方程。若𝑎𝑛 ̸= 0(mod 𝑚)，则称𝑛为同余方程式的次
数。如果𝑥 = 𝑥0满足上式，则𝑥 ≡ 𝑥0(𝑏𝑚𝑜𝑑 𝑚)称为同余方程的解，有时
也简称𝑥0为同余方程的解。不同的解是指互不同余的解。

"""

"""
有解的充要条件:
设m1, m2, m3, ..., mk是k个两两互素的正整数, m = m1*m2*m3*...*mk
则同余方程f(x) ≡ 0(mod m)有解的充要条件是:
    同余方程f(x) ≡ 0(mod mi)每一个都有解
    并且, f(x) ≡ 0(mod m)的解与从f(x) ≡ 0(mod mi)的解得到模m的解一致

    如果记同余方程𝑓(𝑥) ≡ 0(mod 𝑚)的解的个数为𝑇，记同余方
    程𝑓(𝑥) ≡ 0(mod 𝑚𝑖)的解的个数为𝑇𝑖(𝑖 = 1, 2, · · · , 𝑘)，
    则𝑇 = 𝑇1𝑇2 · · · 𝑇𝑘。

"""

# 二次的一般同余方程不做要求 就不写了