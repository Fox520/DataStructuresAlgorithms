__author__ = "Lone Wolf"

def binarySearch(value, array):
    leftPos = 0
    rightPos = len(array) - 1
    breakPoint = 0
    while True:
        if breakPoint > len(array):
            return False
        midPosition = (leftPos + rightPos) / 2;
        if array[midPosition] == value:
            return True
        elif array[midPosition] > value:
            rightPos = midPosition - 1
        elif array[midPosition] < value:
            leftPos = midPosition + 1
        breakPoint += 1

def linearSearch(value, array):
    # loopCounter = 0
    for i in array:
        if i == value:
            # print(loopCounter)
            return True
        # loopCounter += 1
    return False

def reverseLinearSearch(value, array):
    i = len(array) - 1
    # loopCounter = 0
    while i >= 0:
        if array[i] == value:
            # print(loopCounter)
            return True
        # loopCounter += 1
        i -= 1
    return False


def main():
    binaryArray = [1,2,3,4,5,6,7]
    print(binarySearch(5,binaryArray))

    linearArray = [1,2,3,4,5,6,7]
    print(linearSearch(4,linearArray))

    linearReverse = [1,2,3,4,5,6,7]
    print(reverseLinearSearch(1,linearReverse))

main()