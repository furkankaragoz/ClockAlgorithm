1-) Let us take an endless word from the keyboard and type "Exit" to end the program.
2-) Let's put words in a circular buffer of 5 word size. The way the algorithm works is in the picture.
With each word read, let's print the current version of the buffer and pointer.


-----------------------------------------OUTPUT--------------------------------------------
Please enter a sentence (Type exit to finish) : Furkan Karagoz Computer Engineer Turkey 
Exit
Clock initial state : 
	Frame 1(Minute hand):
		Reference(Context): null
		Writability(0---> Empty / 1---> Full) : 0
	Frame 2:
		Reference(Context): null
		Writability(0---> Empty / 1---> Full) : 0
	Frame 3:
		Reference(Context): null
		Writability(0---> Empty / 1---> Full) : 0
	Frame 4:
		Reference(Context): null
		Writability(0---> Empty / 1---> Full) : 0
	Frame 5:
		Reference(Context): null
		Writability(0---> Empty / 1---> Full) : 0
Index number of the entered string : 1
	Entered String(Reference) : Furkan
	Is there a string repeat(True---> No / False---> Yes) :  true
	Frame 1:
		Reference(Context): Furkan
		Writability(0---> Empty / 1---> Full) : 1
	Frame 2(Minute hand):
		Reference(Context): null
		Writability(0---> Empty / 1---> Full) : 0
	Frame 3:
		Reference(Context): null
		Writability(0---> Empty / 1---> Full) : 0
	Frame 4:
		Reference(Context): null
		Writability(0---> Empty / 1---> Full) : 0
	Frame 5:
		Reference(Context): null
		Writability(0---> Empty / 1---> Full) : 0

Index number of the entered string : 2
	Entered String(Reference) : Karagoz
	Is there a string repeat(True---> No / False---> Yes) :  true
	Frame 1:
		Reference(Context): Furkan
		Writability(0---> Empty / 1---> Full) : 1
	Frame 2:
		Reference(Context): Karagoz
		Writability(0---> Empty / 1---> Full) : 1
	Frame 3(Minute hand):
		Reference(Context): null
		Writability(0---> Empty / 1---> Full) : 0
	Frame 4:
		Reference(Context): null
		Writability(0---> Empty / 1---> Full) : 0
	Frame 5:
		Reference(Context): null
		Writability(0---> Empty / 1---> Full) : 0

Index number of the entered string : 3
	Entered String(Reference) : Computer
	Is there a string repeat(True---> No / False---> Yes) :  true
	Frame 1:
		Reference(Context): Furkan
		Writability(0---> Empty / 1---> Full) : 1
	Frame 2:
		Reference(Context): Karagoz
		Writability(0---> Empty / 1---> Full) : 1
	Frame 3:
		Reference(Context): Computer
		Writability(0---> Empty / 1---> Full) : 1
	Frame 4(Minute hand):
		Reference(Context): null
		Writability(0---> Empty / 1---> Full) : 0
	Frame 5:
		Reference(Context): null
		Writability(0---> Empty / 1---> Full) : 0

Index number of the entered string : 4
	Entered String(Reference) : Engineer
	Is there a string repeat(True---> No / False---> Yes) :  true
	Frame 1:
		Reference(Context): Furkan
		Writability(0---> Empty / 1---> Full) : 1
	Frame 2:
		Reference(Context): Karagoz
		Writability(0---> Empty / 1---> Full) : 1
	Frame 3:
		Reference(Context): Computer
		Writability(0---> Empty / 1---> Full) : 1
	Frame 4:
		Reference(Context): Engineer
		Writability(0---> Empty / 1---> Full) : 1
	Frame 5(Minute hand):
		Reference(Context): null
		Writability(0---> Empty / 1---> Full) : 0

Index number of the entered string : 5
	Entered String(Reference) : Turkey
	Is there a string repeat(True---> No / False---> Yes) :  true
	Frame 1(Minute hand):
		Reference(Context): Furkan
		Writability(0---> Empty / 1---> Full) : 1
	Frame 2:
		Reference(Context): Karagoz
		Writability(0---> Empty / 1---> Full) : 1
	Frame 3:
		Reference(Context): Computer
		Writability(0---> Empty / 1---> Full) : 1
	Frame 4:
		Reference(Context): Engineer
		Writability(0---> Empty / 1---> Full) : 1
	Frame 5:
		Reference(Context): Turkey
		Writability(0---> Empty / 1---> Full) : 1


