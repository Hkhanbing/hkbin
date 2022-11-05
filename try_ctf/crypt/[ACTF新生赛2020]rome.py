

for i in range(0, 16):
    if ord(v1[i]) > 64 and ord(v1[i]) <= 90:
        v1[i] = chr((ord(v1[i]) - 51) % 26 + 65)
    elif ord(v1[i] > 96 and ord(v1[i]) <= 122):
        v1[i] = chr((ord(v1[i]) - 79) % 26 + 97) 

v1 = "Qsw3sj_lz4_Ujw@l"

flag = ""

for i in range(0, 16):
    for j in range(0, 127):
        temp = j
        if j > 64 and j <= 90:
            temp = ((j - 51) % 26 + 65)
        if j>96 and j<=122 :
            temp = ((j - 79) % 26 + 97)
        if(ord(v1[i]) == temp):
            flag+=chr(j)

flag