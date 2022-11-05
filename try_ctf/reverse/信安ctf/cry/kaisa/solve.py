


for k in range(0, 50):
    s = ""
    c = "wcrx{i0k13_1j_JZdG13}"
    for i in c:
        if 'a' <= i <= 'z':
            s += chr(ord('a') + (ord(i) - ord('a') - k) % 26)
        elif 'A' <= i <= 'Z':
            s += chr(ord('A') + (ord(i) - ord('A') - k) % 26)
        else:
            s += i
    print(s)