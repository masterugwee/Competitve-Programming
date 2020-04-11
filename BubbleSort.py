#code by Varun Nair, S4MCA  P2CSC19035

array = []
size = int(input())
for i in range(size):
    array.append(int(input()))
for j in range(len(array)):
    for _ in range(len(array)):
        if j!=_:
            if array[j]>array[_]:
                temp = array[j]
                array[j] = array[_]
                array[_] = temp
print("The  array in descending order")
for _ in array:
    print(_)
