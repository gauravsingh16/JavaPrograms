def collatz():
    x=int(input("Enter a starting number"))
    print(int(x))
    while x!=1 :
        if x% 2 ==0:
            x=x/2
        else:
            x=(3*x)+1
        print(int(x))
        
collatz()