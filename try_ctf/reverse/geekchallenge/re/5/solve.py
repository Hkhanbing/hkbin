data = [420036,
  293078,
  519796,
  530617,
  364411,
  443601,
  351429,
  445590,
  409346,
  328746,
  537582,
  498548,
  337534,
  412371,
  341694,
  444846,
  409548,
  273441,
  525059,
  477408,
  330281,
  426769,
  314875,
  435026,
  392623,
  299579,
  515551,
  510772,
  321341,
  424744,
  322113,
  424120,
  395875,
  297680,
  490050,
  501413,
  354751,
  401580,
  348135,
  430031,
  401103,
  306890,
  522375,
  508692,
  336678,
  416437,
  324330,
  451890,
  419504,
  323117,
  542992,
  528034,
  358359,
  435210,
  354326,
  461616,
  350823,
  290679,
  466549,
  456967,
  323272,
  385504,
  311605,
  390472]

v10 = [0] * 128
v10[0] = 686
v10[1] = 867
v10[2] = 369
v10[3] = 795
v10[4] = 754
v10[5] = 93
v10[6] = 143
v10[7] = 501
v10[8] = 424
v10[9] = 107
v10[10] = 881
v10[11] = 168
v10[12] = 216
v10[13] = 818
v10[14] = 46
v10[15] = 472
v10[16] = 816
v10[17] = 923
v10[18] = 995
v10[19] = 794
v10[20] = 419
v10[21] = 242
v10[22] = 489
v10[23] = 707
v10[24] = 822
v10[25] = 456
v10[26] = 400
v10[27] = 998
v10[28] = 680
v10[29] = 908
v10[30] = 655
v10[31] = 221
v10[32] = 486
v10[33] = 176
v10[34] = 284
v10[35] = 392
v10[36] = 790
v10[37] = 331
v10[38] = 398
v10[39] = 671
v10[40] = 736
v10[41] = 556
v10[42] = 253
v10[43] = 920
v10[44] = 189
v10[45] = 255
v10[46] = 965
v10[47] = 393
v10[48] = 409
v10[49] = 499
v10[50] = 159
v10[51] = 335
v10[52] = 765
v10[53] = 603
v10[54] = 187
v10[55] = 468
v10[56] = 595
v10[57] = 543
v10[58] = 964
v10[59] = 585
v10[60] = 921
v10[61] = 151
v10[62] = 175
v10[63] = 682

from z3 import *

x = [Int("x_%s" % (i)) for i in range(64)]

for k in range(8):
    for m in range(8):
        v5 = 0
        for n in range(8):
            v5 += x[8 * k + n] * v10[8 * m + n]
        v10[8 * k + 64 + m] = v5

solver = Solver()
for i in range(64):
    solver.add(v10[i + 64] == data[i])

solver.check()
solver.model()

ans = ""
for i in range(64):
    val = solver.model().eval(x[i]).as_long()
    ans += chr(val)

