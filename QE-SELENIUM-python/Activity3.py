from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

with webdriver.Firefox() as driver:
    driver=webdriver.Firefox()
    try:
        # Open the dynamic ID page
        driver.get("https://training-support.net/selenium/dynamic-controls")
        
        # Wait for the checkbox to be clickable
        checkbox = WebDriverWait(driver, 10).until(
            EC.element_to_be_clickable((By.NAME, "dynamic_checkbox"))
        )
        
        # Click the checkbox
        checkbox.click()
        
        # Find the toggle button and click it
        toggle_button = driver.find_element(By.ID, "toggleCheckbox")
        toggle_button.click()
        
        # Wait for the checkbox to be invisible
        WebDriverWait(driver, 10).until(
            EC.invisibility_of_element(checkbox)
        )
    finally:
        # Close the browser
        driver.quit()




    