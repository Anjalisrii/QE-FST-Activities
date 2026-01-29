import pandas as pd
data={
    "FirstName":['satwik','Avinash','lahri'],
    "LastaName":['shah','kati','Rath'],
    "Email":['satshah@example.com','avinashkati@example.com','lahri.rath@example.com'],
    "phoneNumber":[123456789,234567890,234556789]

}

df=pd.DataFrame(data)
df.to_excel("output.xlsx",index=False)

print(df)