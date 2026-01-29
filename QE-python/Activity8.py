def check_true():
    user=input("Enter numbers seperated by spaces:")
    num=list(map(int,user.split()))
    return num[0]==num[-1]
result=check_true()
print(f"first and last numbers are same:{result}")