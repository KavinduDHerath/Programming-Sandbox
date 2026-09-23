num = input("Enter a number: ")

try:
    num_val = int(num)
except:
    num_val = -1

if num_val > 0:
    print("A number was entered")
else:
    print("Input is not a number")