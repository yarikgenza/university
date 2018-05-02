class Reptile:
  name = ""
  size = ""
  weight = 0

  def __init__(self, name=None, size=None, weight=None):
    self.name = name or ''
    self.size = size or ''
    self.weight = weight or 0
