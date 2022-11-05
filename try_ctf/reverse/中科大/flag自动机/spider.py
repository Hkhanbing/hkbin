from ida_bytes import get_bytes, patch_bytes
import re
addr = 0x401000
end = 0x4b9cd0
# buf = "".join(["%02x"%ord(i) for i in get_bytes(addr,end-addr)])
buf = get_bytes(addr, end-addr)
def handler1(s):
    s = s.group(0)
    print("".join(["%02x"%ord(i) for i in s]))
    s = "\x90"*len(s)
    return s

def handler2(s):
    opcode1 = ord(s.group(1))
    opcode2 = ord(s.group(2))
    if(opcode1|1 == opcode2|1):
        return "\x90"*5
    else:
        return s.group(0)


pattern1 = r"\xE8[\x01-\x03]\x00\x00\x00((?!\xE8).){1,5}(\x83\xC4\x04|\x58|\x83\x04\x24\x06\xc3)"
pattern2 = r"([\x70-\x7f])\x03([\x70-\x7f])\x01."
buf = re.sub(pattern1, handler1, buf, flags=re.I)
# buf = "".join([chr(int(buf[2*i]+buf[2*i+1], 16)) for i in range(len(buf)//2) ])
patch_bytes(addr, buf)
print("Done")
