from reptile import Reptile

class Crocodile(Reptile):
  skinTone = ""

  def __init__(self, name=None, size=None, weight=None, skinTone=None):
    super().__init__(name, size, weight)
    self.skinTone = skinTone or "dark"
