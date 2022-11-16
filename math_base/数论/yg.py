p = 47

import gmpy2

def dev(p):
    primes = []
    for i in range(2, p):
        if p % i == 0:
            s = 0
            while p % i == 0:
                s += 1
                p /= i
            primes.append([i, s])
    return primes


primes = dev(p-1)

def gcd(a, b):
    if b == 0:
        return a
    else:
        return gcd(b, a%b)


for a in range(2, 100):
    if gcd(a, p) == 1:
        flag = True
        for item in primes:
            if gmpy2.powmod(a, int((p-1)/item[0]), p) == 1:
                flag = False
                break
        if flag:
            print(a)
            break

