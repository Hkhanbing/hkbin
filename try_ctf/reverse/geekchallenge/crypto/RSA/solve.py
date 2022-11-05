n= 69984814757288857831977509185208500866724771756561629279687819301222483218728663
e= 65537
c= 67672845063517415442486175096448664617581579564885311842326107871805595697454701

import gmpy2

# msg = c ^ dmod(n)
# ed = 1(mod func_n)

p = 733
q = 95477237049507309456995237633299455479842799122185033123721445158557275878211

func_n = (p-1) * (q-1)

d = gmpy2.invert(e, func_n)

msg = str(hex(gmpy2.powmod(c, d, n))).lstrip("0x")

ans = ""
for i in range(0, len(msg), 2):
    sstr = msg[i: i+2]
    ans += chr(int(sstr, 16))
    
