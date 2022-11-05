e = 65537
c = 0xad939ff59f6e70bcbfad406f2494993757eee98b91bc244184a377520d06fc35
n = 103461035900816914121390101299049044413950405173712170434161686539878160984549

# c = msg^e(mod n)
# msg = c^d(mod n)
# cd = 1 (mod func_n)

# first to func_n

def OuLa(n):
    ans = n
    for i in range(2, n):
        if n % i == 0:
            s = 0
            while n % i == 0:
                n /= i
                s += 1
            ans = ans * (i - 1) / i
    if n > 1 :
        ans = ans * (n - 1) / n
    return ans

func_n = OuLa(n)


def get_d(a, b, x, y) :
    if b == 0 :
        x = 1
        y = 0
        return a
    ans = get_d(b, a % b, x, y)
    temp = x
    x = temp - a / b * y
    return ans


x = 0
y = 0

gcd = get_d(e, func_n, x, y)
x0 = x * 1 / gcd
d = ((x0 % func_n) + func_n) % func_n
