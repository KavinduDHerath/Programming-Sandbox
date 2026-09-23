num = 5
while num != 0:
    print('Hello Master! 😎🧑‍💻')
    num = num - 1
print()

# break Statement
n = 22
while n > 0:
    n -= 1
    if n == 5:
        break
    print(n)
print()

# continue Statement
d = 300
while d > 0:
    d -= 1
    if d == 254 :
        continue
    print(d)
print()



for i in ['man', 'woman', 'boy', 'girl'] :
    if 'boy' in i :
        break
    print(i)
print()


for i in ['man', 'woman', 'boy', 'girl'] :
    if 'boy' in i:
        continue
    print(i)
print()


numbers = [3,2,5,8,2,9]
for number in numbers :
    print("Looking at: " , number)
    if number == 5:
        print ("FOUND Number")
        break
    else:
        print ("Number NOT FOUND")

print ("END")
print()

for x in range (0, 10) :
    for y in range (0, 15) :
        print('$',end = ' ')
    print()
print()



# Pass Keyword; this is used to iterate a loop without a condition
fruits = ['Apple', 'Orange', 'Grapes', 'Banana']
for fruit in fruits :
    pass # Not Sure What to do!
print("Done😎")