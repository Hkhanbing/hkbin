import hashlib

hashlib.algorithms_available

m = hashlib.new("md5")

m.update(b"123456")

m.hexdigest()