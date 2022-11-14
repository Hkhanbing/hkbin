a = input()
m = input()

"""
int Oula(int x){
    int ret = x;
    for(int i = 2; i <= x/i; i++){
        if(x % i == 0){
            while(x % i == 0){
                x /= i;
            }
            ret *= (double(i-1) / i);
        }
    }
    return ret;
}
"""
import gmpy2
def Oula(m):
    ret = m
    for i in range(2, gmpy2.iroot(m, 2)):
        if m % i == 0:
            while m % i == 0:
                m /= i
            ret *= (i-1) / i
    return ret


flag = True
for i in range(1, Oula(m) + 1):
    if gmpy2.powmod(a, i, m) == 1:
        print(i)
        flag = False
        break

if(flag):
    print("not found!")