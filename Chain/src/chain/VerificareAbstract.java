package chain;

public abstract class VerificareAbstract implements IAntivirus {
	
	protected VerificareAbstract next = null;

	public void setNext(VerificareAbstract next) {
		this.next = next;
	}
	
}
