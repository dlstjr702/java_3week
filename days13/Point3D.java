package days13;


//1. x,y 두 좌표를 다루는 Point 클래스
// Point 클래스를 상속받아서 추가적으로 z 좌표를 다루는 클래스선언
public class Point3D extends Point{


	// 필드 
	private int z;


	// 생성자
	public Point3D() {
		System.out.println("> Point3D 디폴트 생성자 호출됨.");
	}


	public Point3D(int v) {
		super(v,v);
//		this.x=v;this.y=v; System.out.println("> Point 생성자 2호출됨.");
//		this.setX(v);
//		this.setY(v);
		this.z=v;
		System.out.println("> Point3D 생성자1 호출됨.");
	}


	public Point3D(int x,int y,int z) {
		super(x,y);
//		this.x=x;this.y=y;
		this.z=z;
		System.out.println("> Point3D 생성자3 호출됨.");
	}


	//getter, setter   
	public int getZ() {
		return z;
	}


	public void setZ(int z) {
		this.z = z;
	}

 
	

	// 메소드
	public void dispPoint3D(int x, int y, int z) {
//		System.out.printf("> x:%d   y:%d    z:%d",this.getX() ,getX() ,this.z );
		super.dispPoint(); //부모의 x,y출력
		System.out.printf(">  z:%d \n",this.z );
	}
	
	public Point3D plusPoint3D(Point3D p) {
		this.setX(this.getX() + p.getX());
		this.setY(this.getY() + p.getY());
		this.z += p.z;
		return  this;
		
	}



}//class
