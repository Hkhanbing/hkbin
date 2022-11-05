#xx:
#长度为32 最后一位是a 第二位是b 第一位和第三位加起来-48 == 56

str = "dd2940c04462b4dd7c450528835cca15"
str = list(str)
str[2] = chr(ord(str[2]) + ord(str[3]) - 50)
str[4] =chr(ord(str[2]) + ord(str[5]) - 48)
str[30] =chr(ord(str[31]) + ord(str[9]) - 48)
str[14] =chr(ord(str[27]) + ord(str[28]) - 97)

for i in range(0, 16):
    temp = str[31-i]
    str[31-i] = str[i]
    str[i] = temp

ans = ""
for i in range(0, len(str)):
    ans += str[i]