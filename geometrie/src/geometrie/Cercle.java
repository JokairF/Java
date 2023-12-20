package geometrie;

public class Cercle extends Figure{
	
	public class Centre {
		
		private double x;
		private double y;
		
		
		public double getX() {
			return x;
		}

		public void setX(double x) {
			this.x = x;
		}

		public double getY() {
			return y;
		}

		public void setY(double y) {
			this.y = y;
		}

		public Centre(double x, double y)
		{
			this.x = x;
			this.y = y;
			
		}

		public Centre deplace(double dX, double dY) {
			double x = this.getX() + dX;
			double y = this.getY() + dY;
			this.setX(x);
			this.setY(y);
			return this;
		}
		
		@Override
		public String toString() {
			return "Centre [x=" + x + ", y=" + y + "]";
		}

		public void affiche()
		{
			System.out.println("Centre du cercle :"+ x +","+ y);
		}
	}
	
	private double r;
	private Centre c;

	
	public double surface() {
		double aire = Math.pow(this.getR(), 2) * Math.PI;
		return aire;
	}
	
	
	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}
	
	public Centre getC() {
		return c;
	}


	public void setC(Centre c) {
		this.c = c;
	}


	public Cercle(double x, double y, double r)
	{
		super();
		this.c = new Centre(x,y);
		this.setR(r);

	}

	
	public void affiche()
	{
		System.out.println("Cercle de rayon :" + r );
		System.out.println("Surface :" + surface());
	}


	public double aire() {
		double aire = Math.pow(this.getR(),2)* Math.PI;
		return aire;
	}


	public double perimetre() {
		double perimetre = 2 * Math.PI *this.getR();
		return perimetre;
	}


	@Override
	public String toString() {
		return "Cercle [r=" + r + ", c=" + c + ", aire()=" + aire() + ", perimetre()=" + perimetre() + "]";
	}
}
