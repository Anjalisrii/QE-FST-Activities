"""user=input("Enter a list with seperated by commas:")
num=[int(num) for num in user.split()]
total_sum=sum(num)
print(f"Sum of elements: {total_sum}")
"""
numb=list(map(int,input("Enter numbers seperated by spaces").split()))
print(f"sum of elements:{sum(numb)}")