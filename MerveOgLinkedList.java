/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author merve
 */
public class MerveOgLinkedList {

    //I wanted to give pointers for every column
    MerveOgNode firstPtr;
    MerveOgNode secondPtr;
    MerveOgNode thirdPtr;
    MerveOgNode fourthPtr;
    MerveOgNode fifthPtr;

    //Created these variables for to check ending of the game.
    int columnSize = 4;
    int countFirstPtr = 1;
    int countSecondPtr = 1;
    int countThirdPtr = 1;
    int countFourthPtr = 1;
    int countFifthPtr = 1;

    public void addNode(int data, int x) {
        addNode(new MerveOgNode(data, x));
    }

    //I designed the list and there are connections on bottom between pointers. And when i add a node to the top there are also connections between them.
    //I wanted to connect the pointers on bottom with these functions:
    public void connectFirstPtr(MerveOgNode node) {
        firstPtr.next = node;
        node.previous = firstPtr;
    }

    public void connectSecondPtr(MerveOgNode node) {
        if (node.x > 1) {
            secondPtr.next = node;
            node.previous = secondPtr;
        } else {
            node.next = secondPtr;
            secondPtr.previous = node;
        }
    }

    public void connectThirdPtr(MerveOgNode node) {
        if (node.x > 2) {
            thirdPtr.next = node;
            node.previous = thirdPtr;
        } else {
            node.next = thirdPtr;
            thirdPtr.previous = node;
        }

    }

    public void connectFourthPtr(MerveOgNode node) {
        if (node.x > 3) {
            fourthPtr.next = node;
            node.previous = fourthPtr;
        } else {
            node.next = fourthPtr;
            fourthPtr.previous = node;
        }
    }

    public void connectFifthPtr(MerveOgNode node) {
        node.next = fifthPtr;
        fifthPtr.previous = node;
    }

    //There is a rule in game. If the node that will be added has the same data value with the down node i deleted the node that will be added.
    //Also previous node's data is summed with it's data.
    public void deleteTheNode(MerveOgNode node) {
        if (node.down != null && node.down.data == node.data) {
            node.down.data += node.down.data;

            if (node.up == null) {
                node.down.up = null;

            } else {
                node.down.up = node.up;
                node.up.down = node.down;
                node.up = null;
                node.down = null;
            }

        }
    }

    //In this method i wanted to print the game. First checked the top row then went to bottom row step by step for to print.
    //İf nodes aren't null printed their data values. Else printed Null.
    public void print() {
        if (firstPtr != null && firstPtr.up != null && firstPtr.up.up != null && firstPtr.up.up.up != null && firstPtr.up.up.up.up != null && firstPtr.up.up.up.up.up != null && firstPtr.up.up.up.up.up.up != null) {

            System.out.print(firstPtr.up.up.up.up.up.up.data + "        ");
        } else {
            System.out.print("Null      ");
        }
        if (secondPtr != null && secondPtr.up != null && secondPtr.up.up != null && secondPtr.up.up.up != null && secondPtr.up.up.up.up != null && secondPtr.up.up.up.up.up != null && secondPtr.up.up.up.up.up.up != null) {

            System.out.print(secondPtr.up.up.up.up.up.up.data + "        ");

        } else {
            System.out.print("Null      ");
        }

        if (thirdPtr != null && thirdPtr.up != null && thirdPtr.up.up != null && thirdPtr.up.up.up != null && thirdPtr.up.up.up.up != null && thirdPtr.up.up.up.up.up != null && thirdPtr.up.up.up.up.up.up != null) {

            System.out.print(thirdPtr.up.up.up.up.up.up.data + "        ");

        } else {
            System.out.print("Null      ");
        }
        if (fourthPtr != null && fourthPtr.up != null && fourthPtr.up.up != null && fourthPtr.up.up.up != null && fourthPtr.up.up.up.up != null && fourthPtr.up.up.up.up.up != null && fourthPtr.up.up.up.up.up.up != null) {

            System.out.print(fourthPtr.up.up.up.up.up.up.data + "        ");

        } else {
            System.out.print("Null      ");
        }

        if (fifthPtr != null && fifthPtr.up != null && fifthPtr.up.up != null && fifthPtr.up.up.up != null && fifthPtr.up.up.up.up != null && fifthPtr.up.up.up.up.up != null && fifthPtr.up.up.up.up.up.up != null) {

            System.out.print(fifthPtr.up.up.up.up.up.up.data + "        ");

        } else {
            System.out.print("Null      ");
        }
        System.out.println("");

        if (firstPtr != null && firstPtr.up != null && firstPtr.up.up != null && firstPtr.up.up.up != null && firstPtr.up.up.up.up != null && firstPtr.up.up.up.up.up != null) {

            System.out.print(firstPtr.up.up.up.up.up.data + "        ");

        } else {
            System.out.print("Null      ");
        }

        if (secondPtr != null && secondPtr.up != null && secondPtr.up.up != null && secondPtr.up.up.up != null && secondPtr.up.up.up.up != null && secondPtr.up.up.up.up.up != null) {

            System.out.print(secondPtr.up.up.up.up.up.data + "         ");

        } else {
            System.out.print("Null      ");
        }
        if (thirdPtr != null && thirdPtr.up != null && thirdPtr.up.up != null && thirdPtr.up.up.up != null && thirdPtr.up.up.up.up != null && thirdPtr.up.up.up.up.up != null) {
            System.out.print(thirdPtr.up.up.up.up.up.data + "        ");

        } else {
            System.out.print("Null      ");
        }
        if (fourthPtr != null && fourthPtr.up != null && fourthPtr.up.up != null && fourthPtr.up.up.up != null && fourthPtr.up.up.up.up != null && fourthPtr.up.up.up.up.up != null) {

            System.out.print(fourthPtr.up.up.up.up.up.data + "        ");

        } else {
            System.out.print("Null      ");
        }
        if (fifthPtr != null && fifthPtr.up != null && fifthPtr.up.up != null && fifthPtr.up.up.up != null && fifthPtr.up.up.up.up != null && fifthPtr.up.up.up.up.up != null) {

            System.out.print(fifthPtr.up.up.up.up.up.data + "        ");

        } else {
            System.out.print("Null      ");
        }
        System.out.println("");

        if (firstPtr != null && firstPtr.up != null && firstPtr.up.up != null && firstPtr.up.up.up != null && firstPtr.up.up.up.up != null) {

            System.out.print(firstPtr.up.up.up.up.data + "         ");

        } else {
            System.out.print("Null      ");
        }
        if (secondPtr != null && secondPtr.up != null && secondPtr.up.up != null && secondPtr.up.up.up != null && secondPtr.up.up.up.up != null) {

            System.out.print(secondPtr.up.up.up.up.data + "         ");
        } else {
            System.out.print("Null      ");
        }
        if (thirdPtr != null && thirdPtr.up != null && thirdPtr.up.up != null && thirdPtr.up.up.up != null && thirdPtr.up.up.up.up != null) {

            System.out.print(thirdPtr.up.up.up.up.data + "         ");

        } else {
            System.out.print("Null      ");
        }
        if (fourthPtr != null && fourthPtr.up != null && fourthPtr.up.up != null && fourthPtr.up.up.up != null && fourthPtr.up.up.up.up != null) {

            System.out.print(fourthPtr.up.up.up.up.data + "         ");

        } else {
            System.out.print("Null      ");
        }
        if (fifthPtr != null && fifthPtr.up != null && fifthPtr.up.up != null && fifthPtr.up.up.up != null && fifthPtr.up.up.up.up != null) {

            System.out.print(fifthPtr.up.up.up.up.data + "        ");

        } else {
            System.out.print("Null      ");
        }

        System.out.println("");
        if (firstPtr != null && firstPtr.up != null && firstPtr.up.up != null && firstPtr.up.up.up != null) {

            System.out.print(firstPtr.up.up.up.data + "        ");

        } else {
            System.out.print("Null      ");
        }
        if (secondPtr != null && secondPtr.up != null && secondPtr.up.up != null && secondPtr.up.up.up != null) {

            System.out.print(secondPtr.up.up.up.data + "        ");

        } else {
            System.out.print("Null      ");
        }
        if (thirdPtr != null && thirdPtr.up != null && thirdPtr.up.up != null && thirdPtr.up.up.up != null) {

            System.out.print(thirdPtr.up.up.up.data + "        ");

        } else {
            System.out.print("Null      ");
        }
        if (fourthPtr != null && fourthPtr.up != null && fourthPtr.up.up != null && fourthPtr.up.up.up != null) {

            System.out.print(fourthPtr.up.up.up.data + "        ");

        } else {
            System.out.print("Null      ");
        }
        if (fifthPtr != null && fifthPtr.up != null && fifthPtr.up.up != null && fifthPtr.up.up.up != null) {

            System.out.print(fifthPtr.up.up.up.data + "        ");

        } else {
            System.out.print("Null      ");
        }

        System.out.println("");
        if (firstPtr != null && firstPtr.up != null && firstPtr.up.up != null) {

            System.out.print(firstPtr.up.up.data + "        ");

        } else {
            System.out.print("Null      ");
        }
        if (secondPtr != null && secondPtr.up != null && secondPtr.up.up != null) {
            System.out.print(secondPtr.up.up.data + "         ");
        } else {
            System.out.print("Null      ");
        }
        if (thirdPtr != null && thirdPtr.up != null && thirdPtr.up.up != null) {
            System.out.print(thirdPtr.up.up.data + "         ");
        } else {
            System.out.print("Null      ");
        }
        if (fourthPtr != null && fourthPtr.up != null && fourthPtr.up.up != null) {
            System.out.print(fourthPtr.up.up.data + "         ");
        } else {
            System.out.print("Null      ");
        }
        if (fifthPtr != null && fifthPtr.up != null && fifthPtr.up.up != null) {
            System.out.print(fifthPtr.up.up.data + "         ");
        } else {
            System.out.print("Null      ");

        }

        System.out.println("");

        if (firstPtr != null && firstPtr.up != null) {
            System.out.print(firstPtr.up.data + "        ");
        } else {
            System.out.print("Null      ");
        }
        if (secondPtr != null && secondPtr.up != null) {
            System.out.print(secondPtr.up.data + "        ");
        } else {
            System.out.print("Null      ");
        }
        if (thirdPtr != null && thirdPtr.up != null) {
            System.out.print(thirdPtr.up.data + "        ");
        } else {
            System.out.print("Null      ");
        }
        if (fourthPtr != null && fourthPtr.up != null) {
            System.out.print(fourthPtr.up.data + "        ");
        } else {
            System.out.print("Null      ");
        }
        if (fifthPtr != null && fifthPtr.up != null) {
            System.out.print(fifthPtr.up.data + "        ");
        } else {
            System.out.print("Null      ");

        }

        System.out.println("");
        if (firstPtr != null) {
            System.out.print(firstPtr.data + "         ");
        } else {
            System.out.print("Null      ");
        }
        if (secondPtr != null) {
            System.out.print(secondPtr.data + "         ");
        } else {
            System.out.print("Null      ");
        }
        if (thirdPtr != null) {
            System.out.print(thirdPtr.data + "         ");
        } else {
            System.out.print("Null      ");
        }
        if (fourthPtr != null) {
            System.out.print(fourthPtr.data + "         ");
        } else {
            System.out.print("Null      ");
        }
        if (fifthPtr != null) {
            System.out.print(fifthPtr.data + "         ");
        } else {
            System.out.print("Null      ");

        }
        System.out.println("\n----------------------------------------------------\n");

    }

    public void addNode(MerveOgNode node) {

        //This grid is 7*5. This game shouldn't add node horizontal more than 5. I checked it here.
        if (node.x > columnSize || node.x < 0) {
            System.out.println("Warning: This grid is 7*5");
            return;
        }

        //Then i added nodes by using five pointers.
        if (node.x == 0) {
            if (firstPtr == null) { //İf firstPtr is null, firstPtr will be node
                firstPtr = node;

                //İf there are other nodes horizantally i checked them and did a connection between them. 
                if (secondPtr != null) {
                    connectFirstPtr(secondPtr);
                } else if (thirdPtr != null) {
                    connectFirstPtr(thirdPtr);
                } else if (fourthPtr != null) {
                    connectFirstPtr(fourthPtr);
                } else if (fifthPtr != null) {
                    connectFirstPtr(fifthPtr);
                }
            } else {
                addNodeVertical(node); //İf bottom node of x position isn't null, added the node up.
            }

        } else if (node.x == 1) {
            if (secondPtr == null) {
                secondPtr = node;

                if (firstPtr != null) {
                    connectSecondPtr(firstPtr);
                }
                if (thirdPtr != null) {
                    connectSecondPtr(thirdPtr);
                } else if (fourthPtr != null) {
                    connectSecondPtr(fourthPtr);
                } else if (fifthPtr != null) {
                    connectSecondPtr(fifthPtr);
                }
            } else {
                addNodeVertical(node);
            }
        } else if (node.x == 2) {
            if (thirdPtr == null) {
                thirdPtr = node;
                if (secondPtr != null) {
                    connectThirdPtr(secondPtr);
                } else if (firstPtr != null) {
                    connectThirdPtr(firstPtr);
                }
                if (fourthPtr != null) {
                    connectThirdPtr(fourthPtr);
                } else if (fifthPtr != null) {
                    connectThirdPtr(fifthPtr);
                }

            } else {
                addNodeVertical(node);
            }
        } else if (node.x == 3) {
            if (fourthPtr == null) {
                fourthPtr = node;
                if (thirdPtr != null) {
                    connectFourthPtr(thirdPtr);
                } else if (secondPtr != null) {
                    connectFourthPtr(secondPtr);
                } else if (firstPtr != null) {
                    connectFourthPtr(firstPtr);
                }
                if (fifthPtr != null) {
                    connectFourthPtr(fifthPtr);
                }

            } else {
                addNodeVertical(node);
            }
        } else if (node.x == 4) {
            if (fifthPtr == null) {
                fifthPtr = node;
                if (fourthPtr != null) {
                    connectFifthPtr(fourthPtr);
                } else if (thirdPtr != null) {
                    connectFifthPtr(thirdPtr);
                } else if (secondPtr != null) {
                    connectFifthPtr(secondPtr);
                } else if (firstPtr != null) {
                    connectFifthPtr(firstPtr);
                }

            } else {
                addNodeVertical(node);
            }
        }

    }

    public void addNodeVertical(MerveOgNode node) {
        MerveOgNode temp;

        //İ wanted to make connections also between vertical. So used five pointers to add them easily. 
        if (node.x == 0) {
            temp = firstPtr;

            if (temp.up == null) {//İf temp doesn'have an up node added this node to it's up.

                temp.up = node;
                node.down = temp;
                countFirstPtr++;// I added the node so increased this variable

                //İf the node data value is equal to it's previous one, deleted the node.
                if (node.data == node.down.data) {
                    deleteTheNode(node);
                    countFirstPtr--; //I deleted the node so decreased this variable

                    //Here i wanted to check that if there are sequantial nodes who have same data values,
                    //Deleted them till it isn't same to it's down node data.
                    while (temp.down != null && temp.data == temp.down.data) {
                        MerveOgNode newNode = temp;
                        deleteTheNode(newNode);
                        countFirstPtr--; //I deleted the node so decreased this variable
                        if (temp.down == null) {
                            break;
                        }
                        temp = temp.down;

                    }

                }

            } else {

                temp = temp.up;
                while (temp.up != null) {

                    temp = temp.up;
                }

                temp.up = node;
                node.down = temp;
                countFirstPtr++;

                if (node.data == node.down.data) {
                    deleteTheNode(node);
                    countFirstPtr--;
                    while (temp.down != null && temp.data == temp.down.data) {
                        MerveOgNode newNode = temp;
                        deleteTheNode(newNode);
                        countFirstPtr--;
                        if (temp.down == null) {
                            break;
                        }
                        temp = temp.down;

                    }

                }
            }

        } else if (node.x == 1) {

            temp = secondPtr;
            if (temp.up == null) {

                temp.up = node;
                node.down = temp;
                countSecondPtr++;

                if (node.data == node.down.data) {
                    deleteTheNode(node);
                    countSecondPtr--;

                    while (temp.down != null && temp.data == temp.down.data) {
                        MerveOgNode newNode = temp;
                        deleteTheNode(newNode);
                        countSecondPtr--;
                        if (temp.down == null) {
                            break;
                        }
                        temp = temp.down;

                    }

                }

            } else {
                temp = temp.up;
                while (temp.up != null) {

                    temp = temp.up;

                }

                temp.up = node;
                node.down = temp;
                countSecondPtr++;

                if (node.data == node.down.data) {
                    deleteTheNode(node);
                    countSecondPtr--;

                    while (temp.down != null && temp.data == temp.down.data) {
                        MerveOgNode newNode = temp;
                        deleteTheNode(newNode);
                        countSecondPtr--;
                        if (temp.down == null) {
                            break;
                        }
                        temp = temp.down;

                    }

                }
            }
        } else if (node.x == 2) {

            temp = thirdPtr;
            if (temp.up == null) {

                temp.up = node;
                node.down = temp;
                countThirdPtr++;
                if (node.data == node.down.data) {
                    deleteTheNode(node);
                    countThirdPtr--;

                    while (temp.down != null && temp.data == temp.down.data) {
                        MerveOgNode newNode = temp;
                        deleteTheNode(newNode);
                        countThirdPtr--;
                        if (temp.down == null) {
                            break;
                        }
                        temp = temp.down;

                    }

                }

            } else {
                temp = temp.up;
                while (temp.up != null) {

                    temp = temp.up;

                }

                temp.up = node;
                node.down = temp;
                countThirdPtr++;
                if (node.data == node.down.data) {
                    deleteTheNode(node);
                    countThirdPtr--;

                    while (temp.down != null && temp.data == temp.down.data) {
                        MerveOgNode newNode = temp;
                        deleteTheNode(newNode);
                        countThirdPtr--;
                        if (temp.down == null) {
                            break;
                        }
                        temp = temp.down;

                    }

                }
            }

        } else if (node.x == 3) {

            temp = fourthPtr;
            if (temp.up == null) {

                temp.up = node;
                node.down = temp;
                countFourthPtr++;
                if (node.data == node.down.data) {
                    deleteTheNode(node);
                    countFourthPtr--;

                    while (temp.down != null && temp.data == temp.down.data) {
                        MerveOgNode newNode = temp;
                        deleteTheNode(newNode);
                        countFourthPtr--;
                        if (temp.down == null) {
                            break;
                        }
                        temp = temp.down;

                    }

                }

            } else {

                temp = temp.up;
                while (temp.up != null) {
                    temp = temp.up;
                }

                temp.up = node;
                node.down = temp;
                countFourthPtr++;
                if (node.data == node.down.data) {
                    deleteTheNode(node);
                    countFourthPtr--;

                    while (temp.down != null && temp.data == temp.down.data) {
                        MerveOgNode newNode = temp;
                        deleteTheNode(newNode);
                        countFourthPtr--;
                        if (temp.down == null) {
                            break;
                        }
                        temp = temp.down;

                    }

                }
            }

        } else if (node.x == 4) {
            temp = fifthPtr;

            if (temp.up == null) {

                temp.up = node;
                node.down = temp;
                countFifthPtr++;
                if (node.data == node.down.data) {
                    deleteTheNode(node);
                    countFifthPtr--;

                    while (temp.down != null && temp.data == temp.down.data) {
                        MerveOgNode newNode = temp;
                        deleteTheNode(newNode);
                        countFifthPtr--;
                        if (temp.down == null) {
                            break;
                        }
                        temp = temp.down;

                    }

                }

            } else {
                temp = temp.up;
                while (temp.up != null) {

                    temp = temp.up;

                }

                temp.up = node;
                node.down = temp;
                countFifthPtr++;
                if (node.data == node.down.data) {
                    deleteTheNode(node);
                    countFifthPtr--;

                    while (temp.down != null && temp.data == temp.down.data) {
                        MerveOgNode newNode = temp;
                        deleteTheNode(newNode);
                        countFifthPtr--;
                        if (temp.down == null) {
                            break;
                        }
                        temp = temp.down;

                    }

                }

            }
        }

    }
}
