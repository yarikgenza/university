from aligator import Aligator
from aligatorManager import AligatorManager

#Define aligator collection
aligator1 = Aligator("Aligator 1", "1 m", 100, "dark", 10)
aligator2 = Aligator("Aligator 2", "2m", 50, "light", 5)
aligator3 = Aligator('Aligator 3', "2m", 70, "dark", 8)

#create instance of Manager
manager = AligatorManager([aligator1, aligator2, aligator3])

manager.printLen()
manager.sortByWeight()
manager.printAligators()
manager.searchByName('Aligator 2')
