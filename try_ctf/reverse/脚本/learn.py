"""寻找引用"""
for add in XrefsTo(ea, flags = 0):
    print (hex(add.frm))

"""找寻某个指令"""
def find_function_arg(addr):
    while True:
        addr = idc.prev_head(addr)
        print (hex(addr))
        if idc.print_insn_mnem(addr) == "mov" and "esi" in idc.print_operand(addr, 0):
            print ("we found it! at 0x%x" % addr)
            break
    