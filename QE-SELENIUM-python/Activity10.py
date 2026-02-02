from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.action_chains import ActionChains

driver = webdriver.Firefox()

try:
    driver.get("https://training-support.net/webelements/drag-drop")

    # Print page title
    print("Page Title:", driver.title)

    actions = ActionChains(driver)

    ball = driver.find_element(By.ID, "ball")
    dropzone1 = driver.find_element(By.ID, "dropzone1")
    dropzone2 = driver.find_element(By.ID, "dropzone2")

    # Drag ball to Dropzone 1
    actions.drag_and_drop(ball, dropzone1).perform()

    # Verify Dropzone 1
    if "Dropped" in dropzone1.text:
        print("Ball entered Dropzone 1")

    # Drag ball to Dropzone 2
    actions.drag_and_drop(ball, dropzone2).perform()

    # Verify Dropzone 2
    if "Dropped" in dropzone2.text:
        print("Ball entered Dropzone 2")

finally:
    driver.quit()