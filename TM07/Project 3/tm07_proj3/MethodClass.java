
package tm07_proj3;

import java.util.Set;

/**
 *
 * @author Raman
 */
public class MethodClass implements Comparable<MethodClass>{
private char symbol;
	private int number;
	
	public MethodClass() {}
	
	public MethodClass(char symbol, int number) {
		super();
		this.symbol = symbol;
		this.number = number;
	}

	public char getSymbol() {
		return symbol;
	}

	public void setSymbol(char symbol) {
		this.symbol = symbol;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Card [symbol=" + symbol + ", number=" + number + "]";
	}

	@Override
	public int compareTo(MethodClass o) {
		if (this.symbol < o.symbol) return -1;
		else if (this.symbol > o.symbol) return 1;
		else return 1;
	}
	
	@Override
	public int hashCode() {
        return String.valueOf(symbol).hashCode();
	}
	
	@Override
    public boolean equals(Object obj){
        if (obj instanceof MethodClass) {
        	MethodClass card = (MethodClass) obj;
            return (card.symbol == this.symbol);
        } else {
            return false;
        }
    }

}
