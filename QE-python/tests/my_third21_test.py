"Using pytest"
"1.sum of two numbers"
import pytest
def sum(num1,num2):
    return num1+num2

def test_sum():
    assert sum(2,3)==6

"2.Difference"

def substract(n1,n2):
    return n1-n2 

def test_substract():
    assert substract(6,2)==5

"3.product"

def multiply(n1,n2):
    return n1*n2
def test_multiply():
    assert multiply(2,8)==16

"4.quotient"

def quotient(n1,n2):
    return n1/n2
def test_quotient():
    assert quotient(6,3)==2
    """with pytest.raises(ValueError):
        quotient(4,0)"""