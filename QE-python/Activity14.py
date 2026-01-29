"""Fibonacci series"""
def fibo(n,seq=[0,1]):
    if len(seq)==n:
        return seq
    seq.append(seq[-1]+seq[-2])
    return fibo(n,seq)
num=int(input("how many fibonnaci numbers to generate?"))
print(fibo(num))