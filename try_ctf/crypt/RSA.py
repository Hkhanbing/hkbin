from Crypto.PublicKey import RSA
key = RSA.generate(2048)

private_key = key.export_key()

file_out = open("private_key.pem", "wb")
file_out.write(private_key)

public_key = key.publickey().export_key()
file_out = open("public_key.pem", "wb")
file_out.write(public_key)




from Crypto.PublicKey import RSA
from Crypto.Cipher import PKCS1_OAEP

# 要加密的内容
data = b"123456"
# 从文件中读取公钥
public_key = RSA.import_key(open("public_key.pem").read())
# 实例化加密套件
cipher = PKCS1_OAEP.new(public_key)
# 加密
encrypted_data = cipher.encrypt(data)

# 将加密后的内容写入到文件
file_out = open("encrypted_data.bin", "wb")
file_out.write(encrypted_data)



from Crypto.PublicKey import RSA
from Crypto.Cipher import PKCS1_OAEP

# 从私钥文件中读取私钥
private_key = RSA.import_key(open("private_key.pem", "rb").read())
# 实例化加密套件
cipher = PKCS1_OAEP.new(private_key)
# 从文件中读取加密内容
encrypted_data = open("encrypted_data.bin", "rb").read()
# 解密，如无意外data值为最先加密的b"123456"
data = cipher.decrypt(encrypted_data)