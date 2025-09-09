package exerciciospoo.funcionario;

public class Funcionario {

	public String name;
	public double grossSalary,tax;
	
	public double NetSalary() {
		return grossSalary - tax;
	}
	
	public String toString() {
		return "Funcionário: "
		+ name
		+", "
		+"$ "
		+ String.format("%.2f", NetSalary());
		}
	
	public void IncreaseSalary(double percentage) {
		double increase = grossSalary * (percentage/100);
		grossSalary +=increase;
	}
}
