#code by Varun Nair, S4MCA  P2CSC19035

size = int(input())
array = []
for i in range(size):
    array.append(int(input()))
for _ in range(len(array)):
    index = _
    for j in range(_+1, len(array)):
        if array[index] > array[j]:
            index = j

    array[_],array[index] = array[index], array[_]


print("The sorted array ")
for i in array:
    print(i)
