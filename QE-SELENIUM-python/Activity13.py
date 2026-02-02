from selenium import webdriver
from selenium.webdriver.common.by import By

driver = webdriver.Firefox()

try:
    driver.get("https://training-support.net/webelements/tables")

    # Print page title
    print("Page Title:", driver.title)

    # Locate rows and columns using XPath
    rows = driver.find_elements(By.XPATH, "//table/tbody/tr")
    columns = driver.find_elements(By.XPATH, "//table/thead/tr/th")

    print("Number of Rows:", len(rows))
    print("Number of Columns:", len(columns))

    # Print all cells in 3rd row
    third_row_cells = driver.find_elements(
        By.XPATH, "//table/tbody/tr[3]/td"
    )

    print("Third Row Values:")
    for cell in third_row_cells:
        print(cell.text)

    # Print value at 2nd row, 2nd column
    specific_cell = driver.find_element(
        By.XPATH, "//table/tbody/tr[2]/td[2]"
    )
    print("Cell (2nd row, 2nd column):", specific_cell.text)

finally:
    driver.quit()