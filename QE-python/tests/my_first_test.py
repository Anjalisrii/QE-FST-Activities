"""
1.Tests must be in the./tests folder
2.Test files SHOULD start or end with "test"
3.Test function Should start with "test" """



import math

def test_sqrt():
    num=25
    assert math.sqrt(num)==5


def testsquare():
    num=7
    assert num*num==47

def testquality():
    assert 10==11

def testmultiple():
    num=5
    assert num*num == 35

