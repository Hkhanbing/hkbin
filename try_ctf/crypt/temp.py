
c = 29666689760194689065394649908301285751747553295673979512822807815563732622178

N = 86934482296048119190666062003494800588905656017203025617216654058378322103517

q = 285960468890451637935629440372639283459

p = 304008741604601924494328155975272418463

fun_n = (q-1) * (p-1)

e = 65537

import gmpy2

d = gmpy2.invert(e, fun_n)

msg = gmpy2.powmod(c, d, N)

from Crypto.Util.number import long_to_bytes
long_to_bytes(msg)
