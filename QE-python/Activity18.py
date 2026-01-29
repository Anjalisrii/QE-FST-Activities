import pandas as pd
df=pd.read_csv('data.csv')
print(df['Usernames'])
second_row=df.iloc[1]
print(f"Usernames:{second_row['Usernames']},password:{second_row['passwords']}")
sorted_usernames=df.sort_values('Usernames')
print(sorted_usernames)
sorted_passwords=df.sort_values('passwords',ascending=False)