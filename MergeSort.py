#Code by Varun Nair S4 MCA P2CSC19035


def mergeSort(array):
    if len(array)>2:
        mid = len(array)//2                    #findng the mid of array "flooring division"
        left = array[:mid]                         #assigning all elements to the left of the middle index
        right = array[mid:]                      # assigning rest of the elements
        mergeSort(left)                            #left branch 
        mergeSort(right)                              #right branch

        i = j = _ = 0

        while i < len(left) and j<len(right):                       #Sorting left and right 
            if left[i] < right[j]:
                array[_] = left[i]
                i += 1
            else:
                array[_] = right[j]
                j += 1
            _ += 1


        while i < len(left):
            array[_] = left[i]
            i+=1
            _+=1

        while j < len(right):
            array[_] = right[j]
            j+=1
            _+=1

def display(array):
    print("The sorted list is \n")
    for i in range(len(array)):
        print(array[i],end=" ")



if __name__ == '__main__':
    size = int(input())
    array = []
    for i in range(size):
        array.append(int(input()))
    mergeSort(array)
    display(array)
    print("\n")
    
