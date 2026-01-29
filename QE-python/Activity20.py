import pandas as pd
df=pd.read_excel('output.xlsx')
print(df.shape)
print(df['Email'])
sorted_df=df.sort_values(by='FirstName')
print(sorted_df)