# 12.9 (BINARYFORMATEXCEPTION)
Exercise 12.7 implements the bin2Dec method to throw a NumberFormatException if the string is not a binary string. Define a custom exception called BinaryFormatException. Implement the bin2Dec method to throw a BinaryFormatException if the string is not a binary string.
## Execution
### [BinaryFormatException.java](https://github.com/i-warren/ProgrammingAssignment12_9/blob/main/src/BinaryFormatException.java)
This is a custom exception that extends the **_Exception_** class. 
- The default contruction invokes the superclass's  constructor with a standard  message "Invalid binary character".
- The second construction invokes the superclass's construction with a (String mesage) that can be determined by the code.
### [TestBinaryFormatException.java](https://github.com/i-warren/ProgrammingAssignment12_9/blob/main/src/TestBinaryFormatException.java)
This asks the user to enter a binary number and passes it to **_bin2Dec(String binary)_** to convert the string to a decimal integer. Each char is passed to **_binaryCharToDecimal(char ch_)** to check for validity and return to decimal value of the character if valid. If invalid, it throws a **_BinaryFormatException_** with a custom String parameter.
### [TestBinaryFormatExceptionLoop.java](https://github.com/i-warren/ProgrammingAssignment12_9/blob/main/src/TestBinaryFormatExceptionLoop.java)
This changes the program to run in a do/while loop with nested try/catch. The program trys asking the user to enter a binary number and passes it to **_bin2Dec(String binary)_** to convert the string to a decimal integer. Each char is passed to **_binaryCharToDecimal(char ch_)** to check for validity and return to decimal value of the character if valid. If invalid, it throws a **_BinaryFormatException_**. Valid Strings are converted and the user is asked if they want to continue. Invalid Strings are caught with a print statement executed, then the loop restarts by asking for a binary number to convert.
