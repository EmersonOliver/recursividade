package modulo;

public class Modulo {

	private Modulo next;

	private int posicao;
	private String nome;

	public void addModulo(Modulo modulo) {
		if (next != null) {
			next.addModulo(modulo);

		} else {
			setNext(modulo);
		}
	}

	@Override
	public String toString() {
		if (getNext() != null) {
			return getNext().getNome() + "\n " + getNext().toString();
		}
		return "";
	}

	private int size(int count) {
		if (getNext() != null) {
			count++;
			return getNext().size(count);
		}
		return count;

	}

	public int size() {
		int count = 0;
		return this.size(count);
	}

	public Modulo getNext() {
		return next;
	}

	public void setNext(Modulo next) {
		this.next = next;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPosicao() {
		return posicao;
	}

	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}

}
