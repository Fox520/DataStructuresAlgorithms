class Node:
    def __init__(self, data, nextNode):
        self.data = data
        self.nextNode = nextNode

    def getData(self):
        return self.data

    def setData(self, data):
        self.data = data;

    def getNextNode(self):
        return self.nextNode

    def setNextNode(self, nextNode):
        self.nextNode = nextNode

    def __str__(self):

        return "Node{" + "data=" + str(self.data) + ", next=" + str(self.nextNode) + '}'

class LinkedList:
    def __init__(self):
        self.head = None

    def addFirst(self, data):
        self.head = Node(data,self.head)

    def add(self, data):
        if self.head == None:
            self.addFirst(data)
        else:
            currentNode = self.head
            while currentNode.getNextNode() != None:
                currentNode = currentNode.getNextNode()

            currentNode.setNextNode(Node(data,None))

    def size(self):
        count = 0
        if self.head == None:
            return count

        count += 1
        currentNode = self.head
        while currentNode.getNextNode() != None:
            currentNode = currentNode.getNextNode()
            count += 1;

        return count

    def __str__(self):
        return str(self.head)

def main():
    ll = LinkedList()
    ll.add("1")
    ll.add("2")
    ll.add("3")
    ll.add("4")
    ll.add("5")
    print(ll)

if __name__ == '__main__':
    main()