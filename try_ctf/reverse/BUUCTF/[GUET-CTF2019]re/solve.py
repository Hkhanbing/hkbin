from z3 import *


a1 = [Int("x_%s" % (i)) for i in range(0, 32)]

s = Solver()

s.add(1629056 * a1[0] == 166163712)
s.add(6771600 * a1[1] == 731332800)
s.add(3682944 * a1[2] == 357245568)
s.add(10431000 * a1[3] == 1074393000)
s.add(3977328 * a1[4] == 489211344)
s.add(5138336 * a1[5] == 518971936)
s.add(7532250 * a1[7] == 406741500)
s.add(5551632 * a1[8] == 294236496)
s.add(3409728 * a1[9] == 177305856)
s.add(13013670 * a1[10] == 650683500)
s.add(6088797 * a1[11] == 298351053)
s.add(7884663 * a1[12] == 386348487)
s.add(8944053 * a1[13] == 438258597)
s.add(5198490 * a1[14] == 249527520)
s.add(4544518 * a1[15] == 445362764)
s.add(3645600 * a1[17] == 174988800)
s.add(10115280 * a1[16] == 981182160)
s.add(9667504 * a1[18] == 493042704)
s.add(5364450 * a1[19] == 257493600)
s.add(13464540 * a1[20] == 767478780)
s.add(5488432 * a1[21] == 312840624)
s.add(14479500 * a1[22] == 1404511500)
s.add(6451830 * a1[23] == 316139670)
s.add(6252576 * a1[24] == 619005024)
s.add(7763364 * a1[25] == 372641472)
s.add(7327320 * a1[26] == 373693320)
s.add(8741520 * a1[27] == 498266640)
s.add(8871876 * a1[28] == 452465676)
s.add(4086720 * a1[29] == 208422720)
s.add(9374400 * a1[30] == 515592000)
s.add(5759124 * a1[31] == 719890500)



s.check()
m = s.model()

flag = ""
cnt = 0
for item in m:
    if cnt == 6:
        cnt += 1
        continue
    flag += chr(m[item].as_long())
    cnt += 1

print(flag)


import requests
url = "https://buuoj.cn/challenges#[GUET-CTF2019]re"

headers = {
    "User-Agent":"Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:107.0) Gecko/20100101 Firefox/107.0",

}
cookie = "session=9498898d-b2f8-444b-80bc-49f522d3c7ab.J2B-h6qq3hxQVeTsPk61V4a65a8; next=https://buuoj.cn/"

post_data = {
    "challenge_id":759,
    "submission":""
}
for ch in range(32, 128):
    flag = "}73393c1a9903a0b01112456e{galf"  
    flag_list = list(flag)
    flag_list.insert(6, chr(ch))
    data = ""
    for i in flag_list:
        data += i
    # print(data[::-1])
    post_data["submission"] = data[::-1]
    resp = requests.post(url, headers = headers, cookies = cookie, data = post_data)
    print(resp.text)
    # 麻烦 手动尝试吧



"""
题目少给了a1[6] --> 这个爆破尝试把
"""