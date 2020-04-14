#Code by Varun Nair S4 MCA P2CSC19035

def partition(array,low,high):                   
    i = low-1                                    # Index of the smaller element
    pivot = array[high]                        # Pivot element

    for j in range(low,high):
        if array[j]<pivot:                                    #Check for smallest between current and pivot element
            i=i+1
            array[i],array[j] = array[j],array[i]                #swaping
    array[i+1],array[high] = array[high],array[i+1]                  #swaping
    return i+1


def quickSort(array,low,high):
    if low<high:
        index = partition(array,low,high)                      
        quickSort(array,low,index-1)
        quickSort(array,index+1,high)

if __name__ == '__main__':
    size = int(input())
    array = []
    for i in range(size):
        array.append(int(input()))
    quickSort(array,0,size-1)
    print("The sorted array is: \n")
    print(array)
