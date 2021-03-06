# Description


# Docu Navigation <!-- omit in toc -->
- [README HiredKnight](README.md) 
- [Description](description.md)
- [Testing](testing.md)
- [Usecases](usecases.md)
- [Class & Sequence Diagram](Class&SequenceDiagram.md)
- [Usability Test](usabilitytest.md)
----------------------------------------------------------------------------------
 # Description

In this application the customers can design their own soldiers/knights. There are three different types of equipment they can choose from:
1. Armor Type
2. Weapon
3. Mount

Every soldier can only have one of each and cannot choose multiple of one type, for e.g. a sword and an axe as weapon.
Additionally, the user needs to enter a quantity. As soon as the customer is happy, he can press the "Add to camp"-Button. The Camp is the equivalent to the shopping carts in other online shops.

In the camp the customer can see all of his added soldiers, the costs for every single type of soldier the customer put together and can also change the quantity of every type.

To hire the soldiers in the camp the customer must press the hire button.



## Interfaces
All information for the front-end coming from the back-end is send in Json. The front-end is able to send information via REST request parameters. The back-end portion of the program is tested via postman.

![postman](images/postman.PNG)

The front-end is represented by the wireframe below.

![postman](images/wireframe.PNG)
- [HiredKnightTest_Wireframe.pdf](pdfs/HiredKnightTest_Wireframe.pdf) 