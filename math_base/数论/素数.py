# 第一个定理：无限素数定理

"""
proof:
    假设P是所有列表中所有素数的乘积, 考虑P+1是不是素数, 假设P+1不是素数, 那么P+1可以被较小的质数p整除,
    此时有p|P, p|(P+1)
    所以p|(P+1-P)
    所以p|1
    这个p不存在与列表中, 所以P+1是素数

    结论就是所有素数乘积加一 也是素数
"""

# 素数定理 -->解决素数有多少个问题

"""
有一个结论:
    当x很大的时候, 小于x的素数个数近似等于x/ln(x)

    显然素数个数比合数少
"""

# 由此引出多个猜想 -->了解即可

"""
哥德巴赫猜想:
    每个大于4的偶数, 都可以表示成两个素数之和
孪生素数猜想:
    存在无穷多个素数p使得p+2也是素数
N^2+1猜想:
    存在无穷多个形如N^2+1的素数
"""

# 梅森素数与完全数

"""
形如2^p - 1的素数(其中p是素数), 叫做梅森素数

有一条定理, 2^p-1是素数, 则p也是素数

完全数:
    欧几里得完全数公式:
        如果2^p-1是素数, 则2^(p-1) * (2^p - 1)是完全数
    欧拉完全数定理:
        如果n是偶完全数, 则n是n = 2^(p-1)*(2^p-1)形式, 其中2^p-1是梅森素数
    
"""



