Find the time complexity of the below functions in Θ form. Write NA if the function does not 
apply to any case:

a) T(n) = 3T(n/2) + n
a=3, b=2, k=1
According to Master Theorem Condition 1,
a > b^k, 
3 > 2^1
Therefore, T(n) = Θ(n^log 2[base 3])


b) T(n) = 64T(n/8) − n^2(log n)
a=64, b=8, k=2
According to Master Theorem Condition 2,
a = b^k,
64 = 8^2
Therefore, T(n) = Θ(n^2 log n)

c) T(n) = 2nT (n/2) + n^n
a=2, b=2, k=n, no value of p
Therefore NA

d) T(n) = 3T(n/3) + n/2
a=3, b=3, k=1
According to Master Theorem Condition 2,
a = b^k,
3 = 3^1
Therefore, T(n) = Θ(n log n)

e) T(n) = 7T(n/3) + n^2
a=7, b=3, k=2
According to Master Theorem Condition 3,
a < b^k
7 < 3^2
Therefore, T(n) = Θ(n^2)