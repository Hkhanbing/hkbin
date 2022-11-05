from pypresent import Present
import os
import random

with open('flag') as f:
    flag = f.read().strip()

assert len(flag) % 8 == 0

random.seed(os.urandom(1))
key = ''
for i in range(16):
    key += chr(random.randint(0,255))

cipher = Present(key)

ciphertext = ''
for i in range(0, len(flag), 8):
    ciphertext += cipher.encrypt(flag[i:i+8])


with open('ciphertext','wb') as f:
    f.write(ciphertext)
