data = [0xE7, 0x5F, 0xC6, 0xE9, 0xD9, 0xE5, 0xD6, 0x11, 0x5A, 0x85, 
  0xF3, 0x49, 0x34, 0xE3, 0x27, 0xDA, 0xC8, 0xD9, 0xBC, 0xE1, 
  0x53, 0xA5, 0xF0, 0xD5]


cmp = [  0xD1, 0x69, 0xF0, 0xDF, 0xD8, 0xF6, 0xD4, 0x0F, 0x49, 0x87, 
  0xED, 0x5A, 0x36, 0xFD, 0x34, 0xD8, 0xC9, 0xEF, 0x8A, 0xD7, 
  0x65, 0xDE, 0x98, 0xDC]

for i in range(0, len(cmp)):
    cmp[i] ^= ord('A')


ans = ""
for i in range(0, len(cmp)):
    ans += chr(data[i] ^ cmp[i])

flag = "SYC{wwww@RC_RC_RC_RC@wwww:)H}"