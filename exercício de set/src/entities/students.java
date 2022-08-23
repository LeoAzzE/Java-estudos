package entities;
import java.util.Objects;
import java.util.Scanner;

public class students {
	private int matricula;

	public students(int matricula) {
		this.matricula = matricula;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		students other = (students) obj;
		return matricula == other.matricula;
	}
	
}
