import requests
from bs4 import BeautifulSoup

header = {
    "User-Agent":"Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:105.0) Gecko/20100101 Firefox/105.0"
}

session = requests.Session()

cookie = {
    "session": ".eJwVkEtPAlEMhf_LrCexvX3clsQFjINDIhoiymMnCGrEgcUYFeN_t7Pr43znnt7fott9d8WgQFVlTkIExuKgpCUSswADkbNoVpTEliybOBsjoIqHskxOGnsyxQRZA495jJwMSdXcg0cpg1Yh4QTJM4ugafDkmt0xLKMmQisjSwpKBNQx5QwUScDDDNVAFEgzWOQDo3jDkXIWjjWFGJlVmFHI4pBk2Os8UxKNBjC5opmG2sPD-vuU-zRFWXTH913bf0YyH0zrh2oyq96G63nj_Hxx3I4_u8N9I5vRcrX0L1xTdXyd5arb4u30bjcaTl4mXb04_9RX7VnkqdmLna4f95uP8bxpF5F9OLrZVAfg-tSuLou_f1WKWxY.Y1PlJQ.foiVvqMZ2l4W1ZNw7MaOcYEuHDc"
}

url = "http://202.38.93.111:10047/xcaptcha"

token = "1289:MEUCIQCiAZTH94d/ocFutlSH5bBXYX9w1Z3CohQ7Ctc1NMOeBAIgItEWzyEDnz55aHf58pGVfbmFTHnW168ABLbCl04EpnY="

resp = session.get(url, headers = header, cookies = cookie)
print(resp.text)

soup = BeautifulSoup(resp.text)
domain = soup.find("body")

cals = domain.find_all("div", class_ = "form-group")

import re
obj = re.compile(r'.*?(?P<first>.*?)+(?P<second>.*?) 的结果是?', re.S)


ret = []
for cal in cals:
    result = obj.finditer(cal.text)
    for it in result:
        cal_thing = it.group("second")
        a, b = cal_thing.split("+")
        ans = int(a) + int(b)
        ret.append(ans)


data = {
    "captcha1" : ret[0],
    "captcha2" : ret[1],
    "captcha3" : ret[2]
}

url = "http://202.38.93.111:10047/xcaptcha"
new_resp = session.post(url, headers = header, cookies = cookie, data = data)

print(new_resp.text)

