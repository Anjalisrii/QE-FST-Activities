from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Firefox() as driver:

    # Launch browser
    driver=webdriver.Firefox()

    # Open URL
    driver.get("https://training-support.net/webelements/login-form/")

    # Print page title
    print("Page Title:", driver.title)

    # Enter username
    username = driver.find_element(By.ID, "username")
    username.send_keys("admin")

    # Enter password
    password = driver.find_element(By.ID, "password")
    password.send_keys("password")

    # Click login button
    login_button = driver.find_element(By.XPATH, "//button[text()='Submit']").click()

    # Close browser
    driver.quit()

    #xpath //tagname[@attribute='value']