public class AtomicExpression implements Expression {

	private String expression;

	public AtomicExpression(String expression) {
		this.expression = expression;
	}

	public String convert() {
		var tmp=expression.split(" ");
		String converted="";
		switch (tmp[1]){
			case("+"):{
				AddExpression addExpression=new AddExpression(new AtomicExpression(tmp[0]), new AtomicExpression(tmp[2]));
				converted=addExpression.convert();
			}break;
			case("-"):{
				MinusExpression minusExpression=new MinusExpression(new AtomicExpression(tmp[0]), new AtomicExpression(tmp[2]));
				converted= minusExpression.convert();
			}break;
			default:{
				System.out.println("Brak operacji.");
			}
		}
		return converted;
	}

	@Override
	public String toString() {
		return expression;
	}
}
