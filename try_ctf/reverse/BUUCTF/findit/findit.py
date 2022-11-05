a = ['T', 'h', 'i', 's', 'I', 's', 'T', 'h', 'e', 'F', 'l', 'a', 'g', 'H', 'o', 'm', 'e']
b = ['p', 'v', 'k', 'q', '{', 'm', '1', '6', '4', '6', '7', '5', '2', '6', '2', '0', '3', '3', 'l', '4', 'm', '4', '9', 'l', 'n', 'p', '7', 'p', '9', 'm', 'n', 'k', '2', '8', 'k', '7', '5', '}']

x = []
for i in range(0, 17):
    if ((a[i] < 'I' and a[i] >= 'A') or (a[i] < 'i' and a[i] >= 'a')):
        x.append(chr(ord(a[i]) + 18))
    elif ((a[i] >= 'A' and a[i] <= 'Z') or (a[i] >= 'a' and a[i] <= 'z')):
        x.append(chr(ord(a[i]) - ord('\b')))
    else:
        x.append(a[i])


m = ""
for i in range(0, len(x)):
    m += x[i]


y = []
for i2 in range(0, 38):
    if ((b[i2] >= 'A' and b[i2] <= 'Z') or (b[i2] >= 'a' and b[i2] <= 'z')):
        y.append(chr(ord(b[i2]) + 16))
        if ((y[i2] > 'Z' and y[i2] < 'a') or y[i2] >= 'z'):
            y[i2] = chr(ord(y[i2]) - 26)
    else:
        y.append(b[i2])


n = ""
for i in range(0, len(y)):
    n += y[i]