data = "PyvragFvqrYbtvafNerRnfl@syner-ba.pbz"
data = list(data)

for i in range(0, len(data)):
    if((data[i]>='a' and data[i] <='z') or(data[i] >='A' and data[i] <='Z')):
        if(data[i] >= 'A' and data[i] <= 'M'):
            data[i] = chr(ord(data[i]) + 13)
        elif(data[i] >='N' and data[i] <= 'Z'):
            data[i] = chr(ord(data[i]) -13)
        elif(data[i] >='a' and data[i] <='m'):
            data[i] = chr(ord(data[i])+13)
        else:
            data[i] = chr(ord(data[i]) - 13)

ans = ""
for i in range(0, len(data)):
    ans += data[i]