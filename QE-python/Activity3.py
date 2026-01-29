"""Rock paper Scissor"""
def rock_paper_scissors():
    print(" rock_paper_scissors game")
    p1=input("player1,enter your choices(rock/paper/scissors):").lower()
    p2=input("player2,enter your choices(rock/paper/scissors):").lower()
    valid_choices=['rock','paper','scissors']
    if p1 not in valid_choices or p2 not in valid_choices:
        print("Invalid choice! please enter valid choices")
        return
    if p1==p2:
        print("tie")
    elif (p1=='rock' and p2=='scissors') or (p1=='scissors' and p2=='paper') or(p1=='paper' and p2=='rock'):
        print("p1 wins")
    else:
        print("p2 wins")
rock_paper_scissors()