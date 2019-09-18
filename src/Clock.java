
import java.util.ArrayList;
import java.util.Scanner;

public class Clock
{

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int numberOfFrames = 5;
		
		System.out.printf("Please enter a sentence (Type exit to finish) : ");
		final ArrayList<String> al = new ArrayList<>();
		while (true) {
			final String line = sc.next();
			if ("Exit".equals(line) || "Exit".equals(line)) {  // or directly ("Exit".equalsIgnoreCase(line)) 
				break;
			}
			al.add(line);
		}
		final String[] references = new String[al.size()];
		al.toArray(references);
		
		final Frame frames[] = new Frame[numberOfFrames];
		for (int i = 0; i < numberOfFrames; ++i) {
			frames[i] = new Frame();
		}
		
		secondChance(frames, numberOfFrames, references);

	}
	
	private static int secondChance(final Frame frames[], final int numberOfFrames, final String... references) {
		// Initialize victim
		int victim = 0;

		// Initialize the number of page fault
		int numberOfPageFault = 0;

		// Show initial frames information
		System.out.printf("Clock initial state : %n");
		for (int i = 0; i < numberOfFrames; ++i) {
			final Frame frame = frames[i];
			System.out.printf("\tFrame %d%s:%n\t\tReference(Context): %s%n\t\tWritability(0---> Empty / 1---> Full) : %d%n", i + 1,
					(i == victim) ? "(Minute hand)" : "", frame.stringReference, frame.referenceUseBit);
		}

		// Load references in sequence
		final int numberOfReferences = references.length;
		for (int n = 0; n < numberOfReferences; ++n) {
			System.out.printf("Index number of the entered string : %d%n", n + 1);
			final String reference = references[n];
			if (reference == null || reference.equalsIgnoreCase("null")) {
				System.out.printf("\tNothing found to load.%n");
				continue;
			}
			System.out.printf("\tEntered String(Reference) : %s%n", reference);

			boolean fault = true;
			for (int i = 0; i < numberOfFrames; ++i) {
				final Frame frame = frames[i];
				if (reference.equals(frame.stringReference)) {
					
					frame.referenceUseBit = 1;
					fault = false;
					break;
				}
			}
			System.out.printf("\tIs there a string repeat(True---> No / False---> Yes) :  %b%n", fault);
			if (fault) {
				// Page fault happened, then find a appropriate frame to replace.
				while (frames[victim].referenceUseBit == 1) {
					frames[victim].referenceUseBit = 0;
					victim = (victim + 1) % numberOfFrames;
				}
				// Found a victim frame, replace its reference and set its use bit
				frames[victim].stringReference = reference;
				frames[victim].referenceUseBit = 1;
				// Choose next victim
				victim = (victim + 1) % numberOfFrames;

				// Increase the number of page fault
				++numberOfPageFault;
			}
			for (int i = 0; i < numberOfFrames; ++i) {
				final Frame frame = frames[i];
				System.out.printf("\tFrame %d%s:%n\t\tReference(Context): %s%n\t\tWritability(0---> Empty / 1---> Full) : %d%n", i + 1,
						(i == victim) ? "(Minute hand)" : "", frame.stringReference, frame.referenceUseBit);
			}
			System.out.printf("%n");
		}
		return numberOfPageFault;
	}
	
	
	

}


class Frame {

    String stringReference; // Use string to represent a reference.
    byte referenceUseBit; // Reference bit. If the frame is referenced, set this use bit.

    Frame() {
        // Initialize
        stringReference = null;
        referenceUseBit = 0;
    }
}