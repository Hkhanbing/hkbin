result = 1337

for i in range(100000, 1000000):
    if(i>>7==result):
        ans = ""
        ans += "CSR{"
        ans += str(i % 37)
        ans += "_submarines_"
        ans += str(268 * i - 7)
        ans += "_solved_n1c3!}"
        print(ans, i)