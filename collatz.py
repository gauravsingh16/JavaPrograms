def addFunction(value1, value2):
    result = int(value1) + int(value2)
    print('You entered '+ value1+ ' and ' + value2 + ', their sum is '+ str(result))
        
def productFunction(value1, value2):
    result = float(value1) * float(value2)
    print('You entered '+ value1+ ' and ' + value2 + ' their product is '+ str(result))
    
def printFunction(values ):
    print(value + ' ' + value)

value1,value2= input('Give two integers: ').split()
addFunction(value1,value2)
value1,value2= input ('Give two float: ').split()
productFunction(value1, value2)
value = input('Give a word: ')
printFunction(value)