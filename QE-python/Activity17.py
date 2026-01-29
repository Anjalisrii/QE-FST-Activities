import pandas as pd
data={
    "Usernames":["Admin","charles","Deku"],
    "passwords":["password","Charl13","AllMight"]
}
df=pd.DataFrame(data)
df.to_csv('Usernames_passwords.csv', index=False)