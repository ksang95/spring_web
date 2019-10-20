package test;


public class EnumTest {

	public static void main(String[] args) {
		System.out.println(DayOfWeek.Sunday + ":" + DayOfWeek.Sunday.ordinal());
		System.out.println(DayOfWeek.Monday + ":" + DayOfWeek.Monday.ordinal());
		
		System.out.println("=================================");
		
		DayOfWeek[] values = DayOfWeek.values();
		for (DayOfWeek d : values) {
			System.out.println(d + ":" + d.ordinal());
		}
		
		System.out.println("=================================");
		
		System.out.println("A는 "+Score.A.getVar()+"점입니다.");
		System.out.println("F는 "+Score.F.getVar()+"점입니다.");
		
		System.out.println("=================================");
		
		Score[] score=Score.values();
		for(Score s:score) {
			System.out.println(s+":"+s.getVar());
		}
	}
}
