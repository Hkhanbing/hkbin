# uncompyle6 version 3.8.0
# Python bytecode 3.8.0 (3413)
# Decompiled from: Python 3.7.13 (default, Mar 28 2022, 03:01:27) [MSC v.1916 32 bit (Intel)]
# Embedded file name: maze.py
# Compiled at: 1995-09-28 00:18:56
# Size of source mod 2**32: 272 bytes
crack = '##########################0#0000000#0#0#000000000##0#######0#0#0#0#0#0###0##00000#000#00000#0#000#0######0###0#0##############0#0#0#0#0#000#0#000#000##0#0#S#0#0#0###0#0###0####000#00000#0#000#000#0#0####0#####0#0#0###0###0#0##0#00000#000#0#0#0#000#0##0#####0#0###0#0#0#0###0##0#000#000#0#0#0#0000000##0###0###0#0#0#0#0#0######0#000000000000000#00000##0#0#######0#####0###0####000#00000000000#000#000######0#####0#########0#0##00000#0000000000000#0#0##0###0#0#0###0###0#####0##000#0#0#0#00000#0#000#0##0#0#0#####0#0#####0######0#0#0#00000#00000000000##0#0#####0#0#0#0#0#####0##0#0#00000#0#0#0#00000#E##########################'

cnt = 0
for i in range(0, len(crack)):
    print(crack[i], end = "")
    cnt += 1
    if(cnt == 25):
        cnt = 0
        print("")

# def run(s, list1):#155, list
#     flag = 0
#     ans = ""# maze??
#     for i in range(0, 35):
#         if list1[(s + 1)] == '0':#'$'
#             ans += '$'
#             s += 1
#         elif list1[(s - 1)] == '0':#'*'
#             ans += '*'
#             s -= 1
#         elif list1[(s + 25)] == '0':#'&'
#             ans += '&'
#             s += 25
#         elif list1[(s - 25)] == '0':#'%'
#             ans += '%'
#             s -= 25
#         elif list1[(s + 25)] == 'E':#'&'
#             ans += '&'
#             flag = 1
#         else:
#             flag = 2
#     else:
#         if flag == 0:
#             print('oh wrong')
#         else:
#             if flag == 1:
#                 print('you solved, flag is SYC{your input}')
#             else:
#                 print('wrong format')
#     print(ans)


# if __name__ == '__main__':
#     crack_list = list(crack)
#     s = crack_list.index('S')
#     run(s, crack_list)


"""
$ : 右移
* : 左移
% : 上移
& : 下移
"""
"""sddddssssssddssssddssssddddddddddss"""
#从S出发,到达E
"""
#########################
#0#0000000#0#0#000000000#
#0#######0#0#0#0#0#0###0#
#00000#000#00000#0#000#0#
#####0###0#0#############
#0#0#0#0#0#000#0#000#000#
#0#0#S#0#0#0###0#0###0###
#000#00000#0#000#000#0#0#
###0#####0#0#0###0###0#0#
#0#00000#000#0#0#0#000#0#
#0#####0#0###0#0#0#0###0#
#0#000#000#0#0#0#0000000#
#0###0###0#0#0#0#0#0#####
#0#000000000000000#00000#
#0#0#######0#####0###0###
#000#00000000000#000#000#
#####0#####0#########0#0#
#00000#0000000000000#0#0#
#0###0#0#0###0###0#####0#
#000#0#0#0#00000#0#000#0#
#0#0#0#####0#0#####0#####
#0#0#0#00000#00000000000#
#0#0#####0#0#0#0#0#####0#
#0#0#00000#0#0#0#00000#E#
#########################
"""