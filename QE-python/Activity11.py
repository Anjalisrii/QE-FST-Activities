fruits={
    "apple":80,
    "banana":45,
    "mango":100
}
fruit_name=input("which fruit you are looking for?")
if fruit_name in fruits:
    print(f"{fruit_name} is available. its price is{fruits[fruit_name]}")
else:
    print(f"{fruit_name} is not available.")

