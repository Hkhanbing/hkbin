for i from 0 to 255
    S[i] := i
 endfor
 j := 0
 for( i=0 ; i<256 ; i++)
    j := (j + S[i] + key[i mod keylength]) % 256
    swap values of S[i] and S[j]
 endfor