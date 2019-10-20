package test;

public enum Score {
	A(5), B(4), C(3), D(2), F(0);
	private final int var;
	Score(int var){this.var=var;}
	public int getVar() {
		return var;
	}
}
