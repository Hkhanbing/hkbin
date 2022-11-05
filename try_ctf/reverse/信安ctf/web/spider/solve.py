import requests

url = "http://43.140.218.202:20004/secret_flag_here.php"

data = {
    url : "http://43.140.218.202:20004/secret_flag_here.php"
}
resp = requests.post(url, data = data)

print(resp.text)
