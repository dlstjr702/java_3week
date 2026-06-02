package days14;

//
public final class SalesMan extends Regular{

	// 필드 : name,addr,tel,hiredate, basepay
	// 메서드 : @dispEmpInfo(), getPay()  > @는 부모로부터 물려받음을의미함
	// 생성자 상속 X


	//필드
	private int sales; //판매량
	private int comm; //커미션



	//생성자 추가
	public SalesMan() {
		super();
		System.out.println("> SalesMan 디폴트 생성자 호출됨.");
	}

	public SalesMan(String name, String addr, String tel, String hiredate,int basePay, int sales,int comm) {
		super(name, addr, tel, hiredate,basePay);
		this.sales = sales;
		this.comm = comm;
		System.out.println("> SalesMan 7 생성자 호출됨.");
	}

	
	
	//메서드
	@Override
	public int getPay() {//부몬의 getPay를 받아서 추가되는것 식추가
		return super.getPay() + this.sales * this.comm;
	}

	@Override
	public void dispEmpInfo() {
		super.dispEmpInfo();
		System.out.printf("판매량: %d 커미션:%d \n", this.sales,this.comm);
	}	
	 
	


	
	

}//class
