def enFence(string, space):
    s = ""
    for i in range(0, space):
        for j in range(i, len(string), space):
            # 不能越界
            if j < len(string):
                s += string[j]
    print(s)
def deFence(string, space):
    s = ""
    if len(string) % space == 0:
        key = len(string) // space
    else:
        key = len(string) // space + 1
    # 小于间隔继续
    for i in range(0, key):
        for j in range(i, len(string), key):
            # 不能越界
            if j < len(string):
                s += string[j]
    print(s)