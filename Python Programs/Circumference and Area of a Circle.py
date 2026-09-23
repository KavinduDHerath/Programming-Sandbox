import math

def circumference(radius):
    radius=float(radius)
    circumference_value = 2*math.pi*radius
    print ("Circumference of the circle with " + str(radius) + "cm radius is " + str(circumference_value) + "cm. 🟢")
    return circumference

def area(radius):
    radius=float(radius)
    area_value = math.pi*radius*radius
    print("Area of a circle with " + str(radius) + "cm is " + str(area_value) + "cm\u00b2 🔵")
    return area

circumference(7)
area(7)