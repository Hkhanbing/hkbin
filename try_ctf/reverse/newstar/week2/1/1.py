s = "Q[LVYMPVTC}LCS}PCS}GP}LCS}N@J_"
s = list(s)

for i in range(0, len(s)):
    s[i] = chr(ord(s[i]) ^ 34)


s

ans = ""


for i in range(0, len(s)):
    if(s[i] >= 'A' and s[i] <= 'Z'):
        s[i] = chr((ord(s[i])- 3 - ord('A') - 10)%26 + ord('A'))#为啥是10呢 凯撒嘛？
    elif(s[i] >= 'a' and s[i] <= 'z'):
        s[i] = chr((ord(s[i])- 3 - ord('a') - 10)%26 + ord('a'))
    ans+=s[i]


ans

