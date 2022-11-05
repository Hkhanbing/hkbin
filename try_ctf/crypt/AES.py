from Crypto.Cipher import AES
from Crypto.Util.Padding import pad
from Crypto.Random import get_random_bytes

# 要加密的内容
data = b"123456"
# 随机生成16字节（即128位）的加密密钥
key = get_random_bytes(16)
# 实例化加密套件，使用CBC模式
cipher = AES.new(key, AES.MODE_CBC)
# 对内容进行加密，pad函数用于分组和填充
encrypted_data = cipher.encrypt(pad(data, AES.block_size))

# 将加密内容写入文件
file_out = open("encrypted.bin", "wb")
# 在文件中依次写入key、iv和密文encrypted_data
[file_out.write(x) for x in (key, cipher.iv,  encrypted_data)]



from Crypto.Cipher import AES
from Crypto.Util.Padding import unpad

# 从前边文件中读取出加密的内容
file_in = open("encrypted.bin", "rb")
# 依次读取key、iv和密文encrypted_data，16等是各变量长度，最后的-1则表示读取到文件末尾
key, iv, encrypted_data = [file_in.read(x) for x in (16, AES.block_size, -1)]

# 实例化加密套件
cipher = AES.new(key, AES.MODE_CBC, iv)
# 解密，如无意外data值为最先加密的b"123456"
data = unpad(cipher.decrypt(encrypted_data), AES.block_size)