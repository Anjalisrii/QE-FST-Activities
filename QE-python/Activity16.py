class Car:
    def __init__(self, manufacture,model,make,transmission,color):
        self.manufacture=manufacture
        self.model=model
        self.make=make
        self.transmission=transmission
        self.color=color
    def accelarate(self):
        print(f"{self.manufacture}{self.model} is moving")
    def stop(self):
        print(f"{self.manufacture}{self.model} has stopped")
car1=Car("Toyoto","carmy","2022","Automate","black")
car2=Car("Honda","civic","2021","Manual","grey")
car3=Car("RR","cus","2025","Automate","white")
car1.accelarate()
car1.stop()
car2.accelarate()
car2.stop()
car3.accelarate()
car3.stop()

        