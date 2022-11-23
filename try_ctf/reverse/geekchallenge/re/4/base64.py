s = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"     #这里是被修改后的表 例："ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz01234{}789+/"

def My_base64_encode(inputs):
	# 将字符串转化为2进制
	bin_str = []
	for i in inputs:
		x = str(bin(ord(i))).replace('0b', '')#这里是输入正常字符串使用 例：'MTIzNDU2'
		#x = str(bin((i))).replace('0b', '') #这里是输入十六进制是使用 例：b'\x9e\x9b\x9c\xb5\xfe\x70\xd3\x0f\xb2\xd1\x4f\x9c\x02\x7f\xab\xde\x59\x65\x63\xe7\x40\x9d\xcd\xfa\x04'
		#上面两句二选一
		bin_str.append('{:0>8}'.format(x))
	#print(bin_str)
	# 输出的字符串
	outputs = ""
	# 不够三倍数，需补齐的次数
	nums = 0
	while bin_str:
		#每次取三个字符的二进制
		temp_list = bin_str[:3]
		if(len(temp_list) != 3):
			nums = 3 - len(temp_list)
			while len(temp_list) < 3:
				temp_list += ['0' * 8]
		temp_str = "".join(temp_list)
		#print(temp_str)
		# 将三个8字节的二进制转换为4个十进制
		temp_str_list = []
		for i in range(0,4):
			temp_str_list.append(int(temp_str[i*6:(i+1)*6],2))
		#print(temp_str_list)
		if nums:
			temp_str_list = temp_str_list[0:4 - nums]
			
		for i in temp_str_list:
			outputs += s[i]
		bin_str = bin_str[3:]
	outputs += nums * '='
	print("Encrypted String:\n%s "%outputs)
	
def My_base64_decode(inputs):
	# 将字符串转化为2进制
	bin_str = []
	for i in inputs:
		if i != '=':
			x = str(bin(s.index(i))).replace('0b', '')
			bin_str.append('{:0>6}'.format(x))
	#print(bin_str)
	# 输出的字符串
	outputs = ""
	nums = inputs.count('=')
	while bin_str:
		temp_list = bin_str[:4]
		temp_str = "".join(temp_list)
		#print(temp_str)
		# 补足8位字节
		if(len(temp_str) % 8 != 0):
			temp_str = temp_str[0:-1 * nums * 2]
		# 将四个6字节的二进制转换为三个字符
		for i in range(0,int(len(temp_str) / 8)):
			outputs += chr(int(temp_str[i*8:(i+1)*8],2))
		bin_str = bin_str[4:]	
	print("Decrypted String:\n%s "%outputs)
	
print()
print("     -------------------------------------")
print("     |    (1)encode         (2)decode    |")	
print("     -------------------------------------")
print()


num = input("Please select the operation you want to perform:\n")
if(num == "1"):
	input_str = input("Please enter a string that needs to be encrypted: \n") # 这句在终端中输入要加密的数据
	#input_str = b'\x9e\x9b\x9c\xb5\xfe\x70\xd3\x0f\xb2\xd1\x4f\x9c\x02\x7f\xab\xde\x59\x65\x63\xe7\x40\x9d\xcd\xfa\x04'  #这句可以定义要加密的变量
	#上面两句二选一
	My_base64_encode(input_str)             #这里传入要加密的数据
else:
	input_str = input("Please enter a string that needs to be decrypted: \n") # 这句在终端中输入要解密的数据
	#input_str = b'\x9e\x9b\x9c\xb5\xfe\x70\xd3\x0f\xb2\xd1\x4f\x9c\x02\x7f\xab\xde\x59\x65\x63\xe7\x40\x9d\xcd\xfa\x04'  #这句可以定义要解密的变量
	#上面两句二选一
	My_base64_decode(input_str)     #这里传入要解密的数据


