
public class Equipo {
	private String nombreEquipo;
	private int ranking;
	
	
	public Equipo () {
	}
	
	
	public void setNombreEquipo(String nombreEquipo) {
		boolean correcto = true;
		
		for (int i = 0; i < nombreEquipo.length(); i++) {
			char letra = nombreEquipo.charAt(i);
			if((letra >= 65 && letra<=90)||(letra >= 97 && letra<=122)||letra==32) {
				//Es un caracter normal si ser alfanumerico y incluye los espacios
				if (letra >= 97 && letra <= 122) { // letras minusculas
					//if (i == 0) { // descomentar para cambiar solo la primera letra
					nombreEquipo = nombreEquipo.substring(0, 1).toUpperCase() + nombreEquipo.substring(1);
					//}
					
				}
			}
			else {
				correcto=false;
			}
		}
		if(correcto&&(nombreEquipo.length()>=4&&nombreEquipo.length()<=20)) {
			this.nombreEquipo=nombreEquipo;
		}
		
		
		
	}
	public void setRanking(int ranking) {
		if(ranking>=0&&ranking<=10) {
			this.ranking=ranking;
		}
		else{
		this.ranking=-1;
		}
	}
	
	public String getNombreEquipo() {
		return nombreEquipo;
	}
	public int getRanking() {
		return ranking;
	}

	public String categoriaEquipo(int ranking) {
		
		if(this.getNombreEquipo()!=null && this.getNombreEquipo()!="") {
			
			switch(ranking) {
			
			case 10:
			case 9:
			case 8:
			case 7:
				return "primera";
			case 6:
			case 5:
			case 4:
			case 3:
				return "segunda";
			case 2:
			case 1:
			case 0:
				return "tercera";
			default:
				return null;
			}
		}else {
			return null;	
		}
	}
}

