class Coctail:
  name = ""
  group = ""
  price = 0
  includes_alcohol = bool
  includes_milk = bool

  def __init__(self, name=None, group=None, price=None, includes_alcohol=None, includes_milk=None):
      self.name = name or ''
      self.group = group or ''
      self.price = price or 0
      self.includes_alcohol = includes_alcohol or False
      self.includes_milk = includes_milk or False

  def toString(self):
    print "Coctain name: ", self.name, "\nPrice: ", self.price, "\nGroup: ", self.group, "\nIncludes alcohol: ", self.includes_alcohol, "\nIncludes milk: ", self.includes_milk


martini = Coctail('Martini', "Aperitiv", 300, True, False)
martini.toString()
