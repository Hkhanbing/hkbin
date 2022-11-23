from numpy import setxor1d


data = "0_cmdo1elfe_2_}WtoC!{0mr!C__7!YtepoS34"


data = data.replace("S", '')
data = data.replace("Y", '')
data = data.replace("C", '')
data = data.replace("{", '')
data = data.replace("}", '')
list_data = list(data)

ans = "SYC{"
flag = [0] * 100
flag[data.index('S')] = 1
flag[data.index('Y')] = 1
flag[data.index('C')] = 1
flag[data.index('{')] = 1
flag[data.index('}')] = 1

for v1 in (list_data):
    for v2 in (list_data):
        if(v1 == v2):
            continue
        for v3 in (list_data):
            if (v1 == v3) or v2 == v3:
                continue
            for v4 in (list_data):
                if (v1 == v4) or v2 == v4 or v3 == v4:
                    continue
                for v5 in (list_data):
                    if (v1 == v5) or v2 == v5 or v3 == v5 or v4 == v5:
                        continue
                    for v6 in (list_data):
                        if (v1 == v6) or v2 == v6 or v3 == v6 or v4 == v6 or v5 == v6:
                            continue
                        for v7 in (list_data):
                            if (v1 == v7) or v2 == v7 or v3 == v7 or v4 == v7 or v5 == v7 or v6 == v7:
                                continue
                            for v8 in (list_data):
                                if (v1 == v8) or v2 == v8 or v3 == v8 or v4 == v8 or v5 == v8 or v6 == v8 or v7 == v8:
                                    continue
                                for v9 in (list_data):
                                    if (v1 == v9) or v2 == v9 or v3 == v9 or v4 == v9 or v5 == v9 or v6 == v9 or v7 == v9 or v8 == v9:
                                        continue
                                    for v10 in (list_data):
                                        if (v1 == v10) or v2 == v10 or v3 == v10 or v4 == v10 or v5 == v10 or v6 == v10 or v7 == v10 or v8 == v10 or v9 == v10:
                                            continue
                                        for v11 in (list_data):
                                            if (v1 == v11) or v2 == v11 or v3 == v11 or v4 == v11 or v5 == v11 or v6 == v11 or v7 == v11 or v8 == v11 or v9 == v11 or v10 == v11:
                                                continue
                                            for v12 in (list_data):
                                                if (v1 == v12) or v2 == v12 or v3 == v12 or v4 == v12 or v5 == v12 or v6 == v12 or v7 == v12 or v8 == v12 or v9 == v12 or v10 == v12 or v11 == v12:
                                                    continue
                                                for v13 in (list_data):
                                                    if (v1 == v13) or v2 == v13 or v3 == v13 or v4 == v13 or v5 == v13 or v6 == v13 or v7 == v13 or v8 == v13 or v9 == v13 or v10 == v13 or v11 == v13 or v12 == v13:
                                                        continue
                                                    for v14 in (list_data):
                                                        if (v1 == v14) or v2 == v14 or v3 == v14 or v4 == v14 or v5 == v14 or v6 == v14 or v7 == v14 or v8 == v14 or v9 == v14 or v10 == v14 or v11 == v14 or v12 == v14 or v13 == v14:
                                                            continue
                                                        for v15 in (list_data):
                                                            if (v1 == v15) or v2 == v15 or v3 == v15 or v4 == v15 or v5 == v15 or v6 == v15 or v7 == v15 or v8 == v15 or v9 == v15 or v10 == v15 or v11 == v15 or v12 == v15 or v13 == v15 or v14 == v15:
                                                                continue
                                                            for v16 in (list_data):
                                                                if (v1 == v16) or v2 == v16 or v3 == v16 or v4 == v16 or v5 == v16 or v6 == v16 or v7 == v16 or v8 == v16 or v9 == v16 or v10 == v16 or v11 == v16 or v12 == v16 or v13 == v16 or v14 == v16 or v15 == v16:
                                                                    continue
                                                                for v17 in (list_data):
                                                                    if (v1 == v17) or v2 == v17 or v3 == v17 or v4 == v17 or v5 == v17 or v6 == v17 or v7 == v17 or v8 == v17 or v9 == v17 or v10 == v17 or v11 == v17 or v12 == v17 or v13 == v17 or v14 == v17 or v15 == v17 or v16 == v17:
                                                                        continue
                                                                    ans += v1 + v2 + v3 + v4 + v5 + v6 + v7 + v8 + v9
                                                                    ans += v10 + v11 + v12 + v13 + v14 + v15 + v16
                                                                    ans += '}'     
                                                                    print(ans)                                     
                                                                    ans = "SYC{"                                                                                                                                                                                                         

                                                                                                                                    



    
    
    
        





