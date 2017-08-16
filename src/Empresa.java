import java.util.ArrayList;

public class Empresa {
	private ArrayList<Empleado> empleados;
	
	public Empresa(){
		this.empleados = new ArrayList<Empleado>();
			
		this.empleados.add(new Empleado("Ronney", 	"161609600", 3000.0, 1.8, 30, 110.0));
		this.empleados.add(new Empleado("Jose", 	"654986004", 1500.0, 2.0, 149, 118.9));
		this.empleados.add(new Empleado("Pablo", 	"656571320", 1500.0, 1.7, 25, 190.7));
		this.empleados.add(new Empleado("Maria", 	"585784236", 2000.0, 1.5, 22, 70.5));
		this.empleados.add(new Empleado("Andrei", 	"655786327", 2000.0, 1.9, 35, 80.1));
		
		for(Empleado empleado: this.empleados){
			empleado.tratarInvariante();
		}
	}
	
	/**Metodo para calculo de lo promedio del salario de todos los empleados
     * Todos los empleados dentro da List empleados dividido por la cantidad.
     * @author Ronney Petras
     * @return Double - Promedio del salarios.
     */
	public Double promSalario(){
		Double suma = 0.0;
		for(Empleado empleado: this.empleados){
			suma += empleado.getSalario();
		}
		
		return suma / this.empleados.size();
	}
	
	/**Metodo para encuentrar lo empleado con la menor estatura.
     * Compara la estatura de todos los empleados de la empresa.
     * @author Ronney Petras
     * @return Empleado - empleado com la menor estatura.
     */
	public Empleado menorEstatura() {
		Double menor = this.empleados.get(0).getEstatura();
		Empleado empleado = this.empleados.get(0);
		for(Empleado e: this.empleados){
			if(e.getEstatura() < menor) {
				menor = e.getEstatura();
				empleado = e;
			}
		}
		return empleado;
	}
	
	/**Metodo para encuentrar lo empleado con la mayor edad.
     * Compara la edad de todos los empleados de la empresa.
     * @author Ronney Petras
     * @return Empleado - empleado com la mayor edad.
     */
	public Empleado mayorEdad() {
		Integer mayor = this.empleados.get(0).getEdad();
		Empleado empleado = this.empleados.get(0);
		for(Empleado e: this.empleados){
			if(e.getEdad() > mayor) {
				mayor = e.getEdad();
				empleado = e;
			}
		}
		return empleado;
	}
	
	/**Metodo para encuentrar lo empleado con mayor peso.
     * Compara lo peso de todos los empleados de la empresa.
     * @author Ronney Petras
     * @return Empleado - empleado com el mayor peso.
     */
	public Empleado masObeso() {
		Double mayor = this.empleados.get(0).getPeso();
		Empleado empleado = this.empleados.get(0);
		for(Empleado e: this.empleados){
			if(e.getPeso() > mayor) {
				mayor = e.getPeso();
				empleado = e;
			}
		}
		return empleado;
	}
	
	public String toString() {
		String info = "";
		for(Empleado empleado: this.empleados){
			info += "\n" + empleado;
		}
		return info;
	}
	
	public static void main(String[] args) {
		Empresa e = new Empresa();
		System.out.println(e);
		//System.out.println(e.promSalario());
		//System.out.println(e.menorEstatura());
		//System.out.println(e.mayorEdad());
		//System.out.println(e.masObeso());
	}	
	
}
