# Testing


# Docu Navigation <!-- omit in toc -->
- [README HiredKnight](README.md) 
- [Description](description.md)
- [Testing](testing.md)
- [Usecases](usecases.md)
- [Class & Sequence Diagram](Class&SequenceDiagram.md)
- [Usability Test](usabilitytest.md)
----------------------------------------------------------------------------------
# Program Test

The following images show how we tested our program. We used the software called "postman" to do so.\
Postman allows for easy testing via custom requests and frequently used tests can be saved for later.

## 1 put(1)
The user designed well armored swordsmen and orders ten units at once.\
As intended the Json file shows that the program correctly identified the heavy swordsmen and understood\
that 10 should be ordered.\
Additionally, the price per unit is calculated. Soldier (80) + sword (30) + heavy armor (45) = 155 gold.

![testput1](images/test_put1.png)

The corresponding header to the request:

![testput1head](images/test_put1_head.png)

## 2 put(2)
This test is very similar to the first one.\
The response now shows both the heavy swordsmen and the newly designed horsemen.

![testput2](images/test_put2.png)

## 3 put(3)
In this test we wanted to check if the default value of 1 is correctly interpreted if the user does not ask for a\
specific number of units.
The Json indeed shows that one unit of the new lightly armored axe men was added to the camp.

![testput3](images/test_put3.png)

## 4 get
The GET request should return a Json list with all soldiers currently added to the camp.\
(Soldiers from tests one, two and three)

![testget](images/test_get.PNG)

## 5 delete(1)
The DELETE request is used to reduce number of soldiers in the camp.\
This first test is used to find out if the reduction of soldiers works a intended as well as to see,\
if the default value of 1 works.\
After executing the request once we expect the quantity of heavy swordsmen to reduce to 9.

![testdelete1](images/test_delete1.png)

After a total of 10 executions the soldier is removed from the list.

![testdelete2](images/test_delete2.png)

## 6 delete(2)
The second test is used to find out, if deleting 6 of 5 soldiers results in the reduction of only 5 soldiers.

![testdelete3](images/test_delete3.png)

## verdict
After several bugfixes the test results satisfy our expectations.\
We tried to include edge case in our testing and thereby tested the functions as well as the limits of our program.\
Working with postman proved to be very efficient. Thanks to postman’s ability to save requests we were able to repeat\
previous tests and consequently we saved a significant amount of time.
