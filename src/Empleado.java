/**Classe para se guardar las informaciones de un Empleado.
 * Nombre no puede ser vacio, tener menos que tres caracteres o más que 20.
 * Cedula debes contener nueve digitos.
 * Salario no puedes ser menor que zero.
 * Estatura no puedes ser menor que zero.
 * Edad no puedes ser menor que zero o maior que ciento cincuenta.
 * Peso no puedes ser menor que zero.
 * @author Ronney Petras
 * @return Empleado - empleado com la menor estatura.
 */
public class Empleado {
	private String nombre;
	private String cedula;
	private Double salario;
	private Double estatura;
	private Integer edad;
	private Double peso;
	
	public Empleado(String nombre, String cedula, Double salario, Double estatura, Integer edad, Double peso) {
		this.nombre = nombre;
		this.cedula = cedula;
		this.salario = salario;
		this.estatura = estatura;
		this.edad = edad;
		this.peso = peso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Double getEstatura() {
		return estatura;
	}

	public void setEstatura(Double estatura) {
		this.estatura = estatura;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public void tratarInvariante() {
		assert (this.nombre != "") : "Nombre do Empleado " + this.nombre + " no puede ser vacio.";
		assert (this.nombre.length() > 3):"Nombre do Empleado no puede ser tan curto.";
		assert (this.nombre.length() < 20) : "Nombre do Empleado no puede ser tan largo.";
		assert (this.cedula.length() == 9) : "Numero de cedula del " + this.nombre + " no es valido";
		assert (this.salario > 0): "Salario del " + this.nombre + " no puedes ser negativo";
		assert (this.estatura > 0): "Estatura del " + this.nombre + " no puedes ser negativo";
		assert (this.edad > 0 && this.edad < 150): "Edad del " + this.nombre + " es invalida.";
		assert (this.peso > 0): "Peso del " + this.nombre + " no puedes ser negativo";
	}
	
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", cedula=" + cedula + ", salario=" + salario + ", estatura=" + estatura
				+ ", edad=" + edad + ", peso=" + peso + "]";
	}
	
	
}
