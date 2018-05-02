from crocodile import Crocodile

class Aligator(Crocodile):
  max_speed = 0

  def __init__(self, name=None, size=None, weight=None, skinTone=None, max_speed=None):
    super().__init__(name, size, weight, skinTone)
    self.max_speed = max_speed or 0
    
  def printInfo(self):
    print("Name ", self.name, "\nSize: ", self.size, "\nWeight: ", self.weight, "\nskinTone: ", self.skinTone, "\nMax speed: ", self.max_speed)