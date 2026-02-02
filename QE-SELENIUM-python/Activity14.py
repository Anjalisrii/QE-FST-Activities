from selenium import webdriver
from selenium.webdriver.common.by import By

driver = webdriver.Firefox()

try:
    driver.get("https://training-support.net/webelements/tables")
    print("Page Title:", driver.title)
    rows = driver.find_elements(By.XPATH, "//table/tbody/tr")
    columns = driver.find_elements(By.XPATH, "//table/thead/tr/th")

    print("Rows:", len(rows))
    print("Columns:", len(columns))
    book_before = driver.find_element(
        By.XPATH, "//table/tbody/tr[5]/td[2]"
    )
    print("Book Name (5th row before sort):", book_before.text)
    driver.find_element(
        By.XPATH, "//table/thead/tr/th[contains(text(),'Price')]"
    ).click()
    book_after = driver.find_element(
        By.XPATH, "//table/tbody/tr[5]/td[2]"
    )
    print("Book Name (5th row after sort):", book_after.text)

finally:
    driver.quit()
    