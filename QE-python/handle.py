def handle_command(command: str):
    match command.split():
        case["quit"]:
            print("Goodbye!")
        case["move",("up"|"down"|"left"|"right")as direction]:
            print(f"Moving character {direction}")
        case _:
            print("Unknown Command")
handle_command("quit")
handle_command("move up")
handle_command("move right")