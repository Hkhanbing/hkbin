def gcd(a, b):
    if b == 0:
        return a
    return gcd(b, a%b)


ans = gcd(2357, 73)
print(ans)