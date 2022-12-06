msg = "zMXHz3TIgnxLxJhFAdtZn2fFk3lYCrtPC2l9"
msg = msg.swapcase()

ST = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"

msg = list(msg)
ST = list(ST)



str = ""
for i in msg:
    bin_str = bin(ST.index(i)).lstrip("0b")
    while len(bin_str) < 6:
        bin_str = '0' + bin_str
    str += bin_str

flag = ""
for i in range(0, len(str), 8):
    flag += chr(int(str[i: i+8], 2))

"""
网站解密yyds
"""