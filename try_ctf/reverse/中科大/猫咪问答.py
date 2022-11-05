import hashlib

obj = "e4ff65d7be5dc8441d896b50f550a0ce"
for i1 in range(97, 123):
    print(i1)
    for i2 in range(97, 123):
        for i3 in range(97, 123):
             for i4 in range(97, 123):
                for i5 in range(97, 123):
                    for i6 in range(97, 123):
                        tmp = chr(i1) + chr(i2) + chr(i3) + chr(i4) + chr(i5) + chr(i6)
                        str = hashlib.md5(tmp.encode("utf-8")).hexdigest()
                        if(str == obj):
                            print(tmp)


