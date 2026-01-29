def combine(l1,l2):
    odd_from_l1=[num for num in l1 if num%2!=0]
    even_from_l2=[num for num in l2 if num%2==0]
    return odd_from_l1+ even_from_l2
l1=[1,2,3,4,5]
l2=[6,7,8,9,10]
result=combine(l1,l2)
print(result)