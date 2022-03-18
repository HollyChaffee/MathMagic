public class Magic {
	public static void main(String[] args) {

		int myNumber = 3;
    //myNumber will be referred to as the "original" number form here forward
    int stepOne = 3 * myNumber;
    int stepTwo = stepOne + myNumber;
    int stepThree = stepTwo / myNumber;
    int stepFour = myNumber + 17;
    int stepFive = stepFour - myNumber;
    int stepSix = stepFive / 6;

System.out.println(stepSix);

//Recreate above using only two variables

    int myNextNumber = 7;
    int magicNumber = myNextNumber * myNextNumber;
    magicNumber += myNextNumber;
    magicNumber /= myNextNumber;
    magicNumber += 17;
    magicNumber -= myNextNumber;
    magicNumber /= 6;

System.out.println(magicNumber);
	}
}