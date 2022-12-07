cmp_str = 'MSAWB~FXZ:J:`tQJ"N@ bpdd}8g'


flag = ""
for i in range(0, len(cmp_str)):
    flag += chr(ord(cmp_str[i]) ^ i)


# MRCTF{@_R3@1ly_E2_R3verse!}