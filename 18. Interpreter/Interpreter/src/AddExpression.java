public class AddExpression implements Expression {
	private Expression a1;
	private Expression a2;

	public AddExpression(Expression a1, Expression a2) {
		this.a1 = a1;
		this.a2 = a2;
	}

	public String convert() {
		return "+ " + a1 + " " + a2;
	}
}
