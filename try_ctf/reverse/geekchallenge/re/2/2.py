s = [0x0A1, 0x0BA, 0x6E, 0x46, 0x80, 0x0F4, 0x0D9, 0x0AA, 0x0B4, 0x36, 0x5A, 0x0CC, 0x8C, 0x1E, 0x95, 0x21, 0x8F, 0x43, 0x0E1, 0x13, 0x8A, 0x0A8, 0x6A, 0x42, 0x0AE, 0x0FB, 0x0F7, 0x0A5, 0x9D, 0x0B, 0x4B, 0x0DE, 0x0BA, 0x0, 0x87, 0x23, 0x90, 0x46, 0x0D3, 0x0DF]


#   v1 = -85;
#   v2 = 0;
#   for ( i = 0; i <= 39; ++i )
#   {
#     for ( j = 0; j <= 50; ++j )
#     {
#       v1 ^= j ^ v2 ^ 0x5F; //v1 = v1 ^ v2 ^ 
#       s[i] ^= s[(i + 1) % 40];
#       s[i] ^= v1;
#       ++v2;
#     }
#   }

# v2 = 2040

# v1 = -85
# v2 = 0
# for i in range(0, 40):
#     for j in range(0, 51):
#         v1 ^= j ^ v2 ^ 0x5F
#         v2 += 1
#         print(v1)
        


v1 = -85
v2 = 2040
for i in range(39, -1, -1):
    for j in range(50, -1, -1):
        v2 -= 1
        s[i] ^= v1
        s[i] ^= s[(i + 1) % 40] #
        v1 ^= j ^ v2 ^ 0x5F

ans = ""
for i in range(0, 40):
    s[i] %= 256
    ans += chr(s[i])


