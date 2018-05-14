package ueb07;

class Student {
	private int matrikel;
	private String name;

	Student(int m, String n) {
		setMatrikel(m);
		setName(n);
	}

	public String getName() {
		return name;
	}

	public void setName(String n) {
		if (n == null)
			throw new IllegalArgumentException();
		name = n;
	}

	public int getMatrikel() {
		return matrikel;
	}

	public void setMatrikel(int m) {
		if (m <= 0)
			throw new IllegalArgumentException();
		matrikel = m;
	}

	@Override
	public String toString() {
		return name + " (" + matrikel + ")";
	}
}
