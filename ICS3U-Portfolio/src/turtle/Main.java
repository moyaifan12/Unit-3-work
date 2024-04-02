package turtle;

/**
 * Description: Describe what your program does
 * Date: Current Date
 * 
 * @author Put Your Name Here
 *
 */
public class Main {
	
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */
	public static void main(String[] args)	{
		Turtle bob = new Turtle();
		//Look at https://docs.oracle.com/javase/7/docs/api/java/awt/Color.html for different colours
		Turtle.bgcolor("lightblue");
		bob.penColor("red");
		bob.width(10);

		/*possible codes:
			bob.forward(distance)
			bob.backward(distance)
			bob.left(angle)
			bob.right(angle)
			
			bob.up()
			bob.down()
			
			bob.setDirection(angle)
			bob.home()
			bob.hide()
			bob.show()
			bob.face(x, y)
			bob.setPosition(x, y)
			
			bob.tilt(angle)
			bob.width(width)
			bob.penColor("colour")
			bob.bgcolor("colour")
			bob.stamp()
			bob.dot()
			bob.dot("colour")
			bob.dot("colour", dotsize)
		 */
	}
}