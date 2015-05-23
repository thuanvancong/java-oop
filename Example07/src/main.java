import org.w3c.dom.css.Rect;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polygon po=new Polygon(8, 9);
		Rectangle rect=new Rectangle(4,5);
		po.setValues(4, 5);
		System.out.println("rect a:{0}"+rect.area());
		return;
	}

}
