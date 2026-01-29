def recur_add(n):
    if n==0:
        return 0
    else:
        return n + recur_add(n-1)
result=recur_add(10)
print("Sum of numbers 0to 10 is", result)