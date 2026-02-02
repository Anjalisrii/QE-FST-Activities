from selenium import webdriver
from selenium.webdriver.common.action_chains import ActionChains
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service as FirefoxService
from webdriver_manager.firefox import GeckoDriverManager
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

# Open Firefox browser
driver = webdriver.Firefox(service=FirefoxService(GeckoDriverManager().install()))
driver.get("https://training-support.net/webelements/mouse-events")

# Wait and get page title
title = WebDriverWait(driver, 10).until(EC.title_is("Selenium: Mouse Events"))
print("Page title:", title)

# Define actions
actions = ActionChains(driver)

try:
    # Locate the target element (example: a button with specific text)
    element = WebDriverWait(driver, 10).until(
        EC.element_to_be_clickable((By.XPATH, "//button[text()='Clickable Button']"))
    )
    
    # Perform mouse action (e.g., click)
    actions.move_to_element(element).click().perform()
    print("Mouse action successful.")
except Exception as e:
    print("Error in mouse actions:", e)

# Clean up
driver.quit()