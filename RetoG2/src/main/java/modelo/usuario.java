package modelo;

public class usuario {
		private String nombre;
		private String apellidos;
		private String mail;
		private String passwd;
		
		
		public usuario(String nombre, String apellidos, String mail, String passwd) {
			super();
			this.nombre = nombre;
			this.apellidos = apellidos;
			this.mail = mail;
			this.passwd = passwd;
		}


		public String getNombre() {
			return nombre;
		}


		public void setNombre(String nombre) {
			this.nombre = nombre;
		}


		public String getApellidos() {
			return apellidos;
		}


		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}


		public String getMail() {
			return mail;
		}


		public void setMail(String mail) {
			this.mail = mail;
		}


		public String getPasswd() {
			return passwd;
		}


		public void setPasswd(String passwd) {
			this.passwd = passwd;
		}


		@Override
		public String toString() {
			return "usuario [nombre=" + nombre + ", apellidos=" + apellidos + ", mail=" + mail + ", passwd=" + passwd + "]";
		}
		
		

		
	
		
	
	
	
}
