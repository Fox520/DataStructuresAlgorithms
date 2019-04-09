class BinarySearchTree:
    def __init__(self):
        self.root = None

    def insertRec(self, current, rootNode):
        if rootNode == None:
            return Node(current)
        elif current > rootNode.getValue():
            rootNode.setRight(self.insertRec(current, rootNode.getRight()))
        elif current < rootNode.getValue():
            rootNode.setLeft(self.insertRec(current, rootNode.getLeft()))
        return rootNode


class Node:
    def __init__(self, value):
        self.value = value
        self.right = None
        self.left = None

    def getRight(self):
        return self.right
    def getLeft(self):
        return self.left

    def setRight(self, newRight):
        self.right = newRight
    def setLeft(self, newLeft):
        self.left = newLeft

    def getValue(self):
        return self.value

    def __str__(self):

        return "Node{" + "value=" + str(self.value) + ", left=" + str(self.left) + '}'
