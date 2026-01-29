import pytest
def test_divisibility_by_2(input_value):
    assert input_value% 2 ==0
def test_divisibility_by_3(input_value):
    assert input_value %3 ==0 
def test_page_title(home_page_content):
    heading=home_page_content.find("h1")
    assert heading.text == "Training Support"


#fixtures 
#scope=module in () if it does given default value for future scope and the fixture is executed/run once per session.
