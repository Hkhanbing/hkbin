data = [0, 198,
232,
816,
200,
1536,
300,
6144,
984,
51200,
570,
92160,
1200,
565248,
756,
1474560,
800,
6291456,
1782,
65536000
]

flag = ""
for i in range(1, 20):
    if (i & 1) != 0:
        data[i] = data[i]>>i
        flag += chr(int(data[i]))
    else:
        data[i] = data[i] / i
        flag += chr(int(data[i]))
