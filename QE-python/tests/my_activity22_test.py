import pytest

@pytest.mark.activity1
def test_grater():
    x=2
    y=3
    assert y> x

@pytest.mark.activity1
def test_grater_equal():
    x=3
    y=3
    assert x>= y
@pytest.mark.activity2
def test_lesser():
    x=4
    y=3
    assert y < x

