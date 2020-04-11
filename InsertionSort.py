#code by Varun Nair S4 MCA P2CSC19035       


array = []
size = int(input())
for i in range(size):
    array.append(int(input()))
for _ in range(1, len(array)):
    key = array[_]
    j = _-1
    while j>=0 and key <array[j]:
        array[j+1] = array[j]
        j -= 1
    array[j+1] = key

print("Insertion Sort")
for _ in array:
    print(_)

