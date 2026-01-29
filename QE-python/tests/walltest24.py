import pytest
@pytest.fixture
def wallet():
    amount=0
    return amount 
@pytest.mark.parametrize("earned,spent,expected",[(30,10,20),(20,2,18)])
def test_wallet_transactions(wallet,earned,spent,expected):
    assert wallet==0
    wallet+=earned
    wallet-=spent
    assert wallet == expected