"""获得光标位置"""
ea = idc.get_screen_ea() #获得此时光标所在位置的地址
ea = here()#同上

"""获得整个代码段的一些东西"""
start = idc.get_inf_attr(INF_MIN_EA)
end = idc.get_inf_attr(INF_MAX_EA)

"""获得所在区段名称"""

name = idc.get_segm_name(ea)

"""光标所在行的反汇编指令"""
idc.generate_disasm_line(ea, 0)

"""获得助记符"""
idc.print_insn_mnem(ea)
"""也就是获得xor add之类的"""

"""获得操作数"""
idc.print_operand(ea, 0)
idc.print_operand(ea, 1)
idc.get_operand_type(ea, 0)
"""看上面这条指令的返回值"""
"""
如果返回0, 表示没有任何操作数
如果返回1, 表示是常规寄存器
如果返回2, 表是内存引用, 比如dword_406C80
如果返回3, 表示(ax)基址寄存器或者标志寄存器
如果返回4, 表示寄存器加一些偏移, 比如[esp + 28h + Msg]
如果返回5, 表示立即数, 比如1Ch

"""


"""看下程序有多少段"""
from pyclbr import Function
import idautils
for seg in idautils.Segments():
    print (idc.get_segm_name(seg), idc.get_segm_start(seg), idc.get_segm_end(seg))


"""函数的遍历"""
for func in idautils.Functions():
    print (hex(func), idc.get_func_name(func))

"""获得地址所在的函数范围"""
idaapi.get_func(ea)
idaapi.get_func_name(ea)#获得名字


"""常用访问函数边界方法"""
idc.get_func_attr(ea, FUNCATTR_START)
idc.get_func_attr(ea, FUNCATTR_END)



"""修复函数"""
idc.create_insn(ea)


"""下一条指令"""
idc.next_head(ea)

"""上一条指令"""
idc.prev_head(ea)

"""获得函数的标志"""

idc.get_func_attr(ea, FUNCATTR_FLAGS)

"""检查函数标志"""
if flags & FUNC_NORET"""有无返回值, ret或者leave不是最后一条指令""" 
if flags & FUNC_FAR
if flags & FUNC_USERFAR
if flags & FUNC_LIB"""识别库代码"""
if flags & FUNC_STATIC"""静态函数"""
if flags & FUNC_FRAME"""标志用了ebx作为栈帧的函数"""
if flags & FUNC_THUNK"""标记了使用了jmp的函数"""

"""获得函数内所有地址"""
list(idautils.get_FuncItems(ea))

