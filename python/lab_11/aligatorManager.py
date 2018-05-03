class AligatorManager:
  def __init__(self, aligatorList=[]):
    self.aligatorList = aligatorList

  def printLen(self):
    print("Len: ", len(self.aligatorList), '\n')

  def sortByWeight(self):
    self.aligatorList = sorted(self.aligatorList, key=lambda aligator: aligator.weight)
  
  def searchByName(self, name):
    target = None
    for i in range(len(self.aligatorList)):
      if self.aligatorList[i].name is name:
        target = i
    if target is not None:
      print('Found, printing result:')
      self.printAligatorByIndex(target)
    else:
      print('Not found any matching aligator')

  def printAligatorByIndex(self, index):
    print(
        "Name: ", self.aligatorList[index].name,
        "\nSize: ", self.aligatorList[index].size,
        "\nweight: ", self.aligatorList[index].weight,
        "\nskinTone: ", self.aligatorList[index].skinTone,
        "\nmax_speed: ", self.aligatorList[index].max_speed,
        "\n\n"
      )

  def printAligators(self):
    for i in range(len(self.aligatorList)):
      self.printAligatorByIndex(i)