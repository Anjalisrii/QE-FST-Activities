import pytest
import requests
from bs4 import BeautifulSoup
@pytest.fixture
def input_value():
    return 12

@pytest.fixture
def home_page_content():
    res=requests.get("https://www.training-support.net")
    content =res.content
    soup= BeautifulSoup(content,"html.parser")
    return soup

@pytest.fixture
def number_list():
    return list(range(11))

def test_sum_list(number_list):
    assert sum(number_list)
